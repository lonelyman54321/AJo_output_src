/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.Connection;
import org.jsoup.Connection$KeyVal;
import org.jsoup.Connection$Method;
import org.jsoup.Connection$Request;
import org.jsoup.Connection$Response;
import org.jsoup.UncheckedIOException;
import org.jsoup.helper.AuthenticationHandler;
import org.jsoup.helper.CookieUtil;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection$1;
import org.jsoup.helper.HttpConnection$Base;
import org.jsoup.helper.HttpConnection$Request;
import org.jsoup.helper.RequestAuthenticator;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Validate;
import org.jsoup.internal.ControllableInputStream;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;

public class HttpConnection$Response
extends HttpConnection$Base
implements Connection$Response {
    private static final String LOCATION = "Location";
    private static final int MAX_REDIRECTS = 20;
    private static final Pattern xmlContentTypeRxp = Pattern.compile("(\\w+)/\\w*\\+?xml.*");
    private ControllableInputStream bodyStream;
    private ByteBuffer byteData;
    private String charset;
    private HttpURLConnection conn;
    private final String contentType;
    private boolean executed = false;
    private boolean inputStreamRead = false;
    private int numRedirects = 0;
    private final HttpConnection$Request req;
    private final int statusCode;
    private final String statusMessage;

    public HttpConnection$Response() {
        super((HttpConnection$1)null);
        HttpConnection$Request httpConnection$Request;
        this.statusCode = 400;
        this.statusMessage = "Request not made";
        this.req = httpConnection$Request = new HttpConnection$Request();
        this.contentType = null;
    }

    private HttpConnection$Response(HttpURLConnection object, HttpConnection$Request entry, HttpConnection$Response object2) {
        super((HttpConnection$1)null);
        int n3;
        Object object3;
        this.conn = object;
        this.req = entry;
        this.method = object3 = Connection$Method.valueOf(((HttpURLConnection)object).getRequestMethod());
        object3 = ((URLConnection)object).getURL();
        this.url = object3;
        this.statusCode = n3 = ((HttpURLConnection)object).getResponseCode();
        object3 = ((HttpURLConnection)object).getResponseMessage();
        this.statusMessage = object3;
        object3 = ((URLConnection)object).getContentType();
        this.contentType = object3;
        object = HttpConnection$Response.createHeaderMap((HttpURLConnection)object);
        this.processResponseHeaders((Map)object);
        object3 = this.url;
        CookieUtil.storeCookies((HttpConnection$Request)((Object)entry), (URL)object3, (Map)object);
        if (object2 != null) {
            int n4;
            int n7;
            object = ((HttpConnection$Response)object2).cookies().entrySet().iterator();
            while ((n7 = object.hasNext()) != 0) {
                entry = object.next();
                object3 = (String)entry.getKey();
                n3 = (int)(this.hasCookie((String)object3) ? 1 : 0);
                if (n3 != 0) continue;
                object3 = (String)entry.getKey();
                entry = (String)entry.getValue();
                this.cookie((String)object3, (String)((Object)entry));
            }
            ((HttpConnection$Response)object2).safeClose();
            this.numRedirects = n4 = ((HttpConnection$Response)object2).numRedirects + 1;
            n7 = 20;
            if (n4 >= n7) {
                entry = ((HttpConnection$Response)object2).url();
                object2 = new StringBuilder("Too many redirects occurred trying to load URL ");
                ((StringBuilder)object2).append(entry);
                entry = ((StringBuilder)object2).toString();
                object = new IOException((String)((Object)entry));
                throw object;
            }
        }
    }

    private static HttpURLConnection createConnection(HttpConnection$Request object) {
        boolean bl2;
        boolean bl3;
        Iterator iterator;
        boolean bl4;
        Object object2;
        Object object3 = ((HttpConnection$Request)((Object)object)).proxy();
        if (object3 == null) {
            object3 = ((HttpConnection$Request)((Object)object)).url().openConnection();
        } else {
            object2 = ((HttpConnection$Request)((Object)object)).url();
            object3 = ((URL)object2).openConnection((Proxy)object3);
        }
        object3 = (HttpURLConnection)object3;
        object2 = ((HttpConnection$Request)((Object)object)).method().name();
        ((HttpURLConnection)object3).setRequestMethod((String)object2);
        ((HttpURLConnection)object3).setInstanceFollowRedirects(false);
        int bl22 = ((HttpConnection$Request)((Object)object)).timeout();
        ((URLConnection)object3).setConnectTimeout(bl22);
        int n3 = ((HttpConnection$Request)((Object)object)).timeout() / 2;
        ((URLConnection)object3).setReadTimeout(n3);
        object2 = ((HttpConnection$Request)((Object)object)).sslSocketFactory();
        if (object2 != null && (bl4 = object3 instanceof HttpsURLConnection)) {
            object2 = object3;
            object2 = (HttpsURLConnection)object3;
            iterator = ((HttpConnection$Request)((Object)object)).sslSocketFactory();
            ((HttpsURLConnection)object2).setSSLSocketFactory((SSLSocketFactory)((Object)iterator));
        }
        if ((object2 = HttpConnection$Request.access$500((HttpConnection$Request)((Object)object))) != null) {
            object2 = AuthenticationHandler.handler;
            iterator = HttpConnection$Request.access$500((HttpConnection$Request)((Object)object));
            object2.enable((RequestAuthenticator)((Object)iterator), (HttpURLConnection)object3);
        }
        if (bl3 = ((Connection$Method)((Object)(object2 = ((HttpConnection$Request)((Object)object)).method()))).hasBody()) {
            boolean bl5 = true;
            ((URLConnection)object3).setDoOutput(bl5);
        }
        CookieUtil.applyCookiesToRequest((HttpConnection$Request)((Object)object), (HttpURLConnection)object3);
        object = ((HttpConnection$Request)((Object)object)).multiHeaders().entrySet().iterator();
        while (bl2 = object.hasNext()) {
            boolean bl6;
            object2 = object.next();
            iterator = ((List)object2.getValue()).iterator();
            while (bl6 = iterator.hasNext()) {
                String string2 = (String)iterator.next();
                String string3 = (String)object2.getKey();
                ((URLConnection)object3).addRequestProperty(string3, string2);
            }
        }
        return (HttpURLConnection)object3;
    }

    private static LinkedHashMap createHeaderMap(HttpURLConnection httpURLConnection) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int n3 = 0;
        while (true) {
            Object object = httpURLConnection.getHeaderFieldKey(n3);
            String string2 = httpURLConnection.getHeaderField(n3);
            if (object == null && string2 == null) {
                return linkedHashMap;
            }
            ++n3;
            if (object == null || string2 == null) continue;
            boolean bl2 = ((AbstractMap)linkedHashMap).containsKey(object);
            if (bl2) {
                object = (List)linkedHashMap.get(object);
                object.add(string2);
                continue;
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add(string2);
            ((AbstractMap)linkedHashMap).put(object, arrayList);
        }
    }

    public static HttpConnection$Response execute(HttpConnection$Request httpConnection$Request) {
        return HttpConnection$Response.execute(httpConnection$Request, null);
    }

    /*
     * Exception decompiling
     */
    public static HttpConnection$Response execute(HttpConnection$Request var0, HttpConnection$Response var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [14 : 303->310)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static String fixHeaderEncoding(String string2) {
        if (string2 == null) {
            return string2;
        }
        Object object = HttpConnection.access$700();
        boolean bl2 = HttpConnection$Response.looksLikeUtf8((byte[])(object = (Object)string2.getBytes((Charset)object)));
        if (bl2) {
            Charset charset = DataUtil.UTF_8;
            string2 = new String((byte[])object, charset);
        }
        return string2;
    }

    private static boolean looksLikeUtf8(byte[] byArray) {
        int n3;
        int n4 = byArray.length;
        int n7 = 1;
        int n8 = 3;
        if (n4 < n8 || (n4 = byArray[0] & 0xFF) != (n3 = 239) || (n4 = byArray[n7] & 0xFF) != (n3 = 187) || (n4 = byArray[2] & 0xFF) != (n3 = 191)) {
            n8 = 0;
        }
        n4 = byArray.length;
        n3 = 0;
        while (n8 < n4) {
            block11: {
                block7: {
                    int n10;
                    int n14;
                    int n15;
                    block9: {
                        block10: {
                            block8: {
                                n15 = byArray[n8];
                                n14 = n15 & 0x80;
                                if (n14 == 0) break block7;
                                n3 = n15 & 0xE0;
                                n14 = 192;
                                if (n3 != n14) break block8;
                                n3 = n8 + 1;
                                break block9;
                            }
                            n3 = n15 & 0xF0;
                            n10 = 224;
                            if (n3 != n10) break block10;
                            n3 = n8 + 2;
                            break block9;
                        }
                        n3 = n15 & 0xF8;
                        if (n3 != (n15 = 240)) break block11;
                        n3 = n8 + 3;
                    }
                    n15 = byArray.length;
                    if (n3 >= n15) {
                        return false;
                    }
                    while (n8 < n3) {
                        n10 = 128;
                        if ((n15 = byArray[++n8] & n14) == n10) continue;
                        return false;
                    }
                    n3 = 1;
                }
                n8 += n7;
                continue;
            }
            return false;
        }
        return n3 != 0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void prepareByteData() {
        Throwable throwable2222222;
        boolean bl2 = this.executed;
        Object object = "Request must be executed (with .execute(), .get(), or .post() before getting response body";
        Validate.isTrue(bl2, (String)object);
        Object object2 = this.bodyStream;
        if (object2 == null) return;
        object2 = this.byteData;
        if (object2 != null) return;
        bl2 = this.inputStreamRead;
        object = "Request has already been read (with .parse())";
        Validate.isFalse(bl2, (String)object);
        bl2 = true;
        object = this.bodyStream;
        HttpConnection$Request httpConnection$Request = this.req;
        int n3 = httpConnection$Request.maxBodySize();
        this.byteData = object = DataUtil.readToByteBuffer((InputStream)object, n3);
        this.inputStreamRead = bl2;
        this.safeClose();
        return;
        {
            catch (Throwable throwable2222222) {
            }
            catch (IOException iOException) {}
            {
                UncheckedIOException uncheckedIOException = new UncheckedIOException(iOException);
                throw uncheckedIOException;
            }
        }
        this.inputStreamRead = bl2;
        this.safeClose();
        throw throwable2222222;
    }

    /*
     * Unable to fully structure code
     */
    private void safeClose() {
        var1_1 = this.bodyStream;
        if (var1_1 != null) {
            try {
                var1_1.close();
lbl5:
                // 2 sources

                while (true) {
                    this.bodyStream = null;
                    break;
                }
            }
            catch (Throwable var1_2) {
                this.bodyStream = null;
                throw var1_2;
            }
        }
        if ((var1_1 = this.conn) != null) {
            var1_1.disconnect();
            this.conn = null;
        }
        return;
        catch (IOException v0) {
            ** continue;
        }
    }

    private static void serialiseRequestUrl(Connection$Request connection$Request) {
        boolean bl2;
        Object object = connection$Request.url();
        Object object2 = new UrlBuilder((URL)object);
        object = connection$Request.data().iterator();
        while (bl2 = object.hasNext()) {
            Connection$KeyVal connection$KeyVal = (Connection$KeyVal)object.next();
            boolean bl3 = connection$KeyVal.hasInputStream();
            String string2 = "InputStream data not supported in URL query string.";
            Validate.isFalse(bl3, string2);
            ((UrlBuilder)object2).appendKeyVal(connection$KeyVal);
        }
        object2 = ((UrlBuilder)object2).build();
        connection$Request.url((URL)object2);
        connection$Request.data().clear();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String setOutputContentType(Connection$Request connection$Request) {
        boolean bl2;
        String string2 = "Content-Type";
        CharSequence charSequence = connection$Request.header(string2);
        String string3 = "multipart/form-data; boundary=";
        if (charSequence != null) {
            CharSequence charSequence2 = "multipart/form-data";
            boolean bl3 = ((String)charSequence).contains(charSequence2);
            if (!bl3) return null;
            charSequence2 = "boundary";
            bl2 = ((String)charSequence).contains(charSequence2);
            if (bl2) return null;
            charSequence = DataUtil.mimeBoundary();
            charSequence2 = new StringBuilder(string3);
            ((StringBuilder)charSequence2).append((String)charSequence);
            string3 = ((StringBuilder)charSequence2).toString();
            connection$Request.header(string2, string3);
            return charSequence;
        } else {
            bl2 = HttpConnection.access$800(connection$Request);
            if (bl2) {
                charSequence = DataUtil.mimeBoundary();
                StringBuilder stringBuilder = new StringBuilder(string3);
                stringBuilder.append((String)charSequence);
                string3 = stringBuilder.toString();
                connection$Request.header(string2, string3);
                return charSequence;
            } else {
                charSequence = new StringBuilder("application/x-www-form-urlencoded; charset=");
                string3 = connection$Request.postDataCharset();
                ((StringBuilder)charSequence).append(string3);
                charSequence = ((StringBuilder)charSequence).toString();
                connection$Request.header(string2, (String)charSequence);
                return null;
            }
        }
    }

    private static void writePost(Connection$Request object, OutputStream object2, String string2) {
        Object object3 = object.data();
        Object object4 = Charset.forName(object.postDataCharset());
        Object object5 = new OutputStreamWriter((OutputStream)object2, (Charset)object4);
        BufferedWriter bufferedWriter = new BufferedWriter((Writer)object5);
        if (string2 != null) {
            object = object3.iterator();
            while (true) {
                boolean bl2 = object.hasNext();
                object5 = "--";
                if (!bl2) break;
                object3 = (Connection$KeyVal)object.next();
                bufferedWriter.write((String)object5);
                bufferedWriter.write(string2);
                object5 = "\r\n";
                bufferedWriter.write((String)object5);
                bufferedWriter.write("Content-Disposition: form-data; name=\"");
                object4 = HttpConnection.access$900(object3.key());
                bufferedWriter.write((String)object4);
                bufferedWriter.write("\"");
                object4 = object3.inputStream();
                String string3 = "\r\n\r\n";
                if (object4 != null) {
                    bufferedWriter.write("; filename=\"");
                    String string4 = HttpConnection.access$900(object3.value());
                    bufferedWriter.write(string4);
                    string4 = "\"\r\nContent-Type: ";
                    bufferedWriter.write(string4);
                    object3 = object3.contentType();
                    if (object3 == null) {
                        object3 = "application/octet-stream";
                    }
                    bufferedWriter.write((String)object3);
                    bufferedWriter.write(string3);
                    bufferedWriter.flush();
                    DataUtil.crossStreams((InputStream)object4, object2);
                    ((OutputStream)object2).flush();
                } else {
                    bufferedWriter.write(string3);
                    object3 = object3.value();
                    bufferedWriter.write((String)object3);
                }
                bufferedWriter.write((String)object5);
            }
            bufferedWriter.write((String)object5);
            bufferedWriter.write(string2);
            bufferedWriter.write((String)object5);
        } else {
            object2 = object.requestBody();
            if (object2 != null) {
                bufferedWriter.write((String)object2);
            } else {
                boolean bl3;
                object2 = object3.iterator();
                boolean bl4 = true;
                while (bl3 = object2.hasNext()) {
                    int n3;
                    object3 = (Connection$KeyVal)object2.next();
                    if (!bl4) {
                        n3 = 38;
                        bufferedWriter.append((char)n3);
                    } else {
                        bl4 = false;
                        string2 = null;
                    }
                    object5 = object3.key();
                    object4 = object.postDataCharset();
                    object5 = URLEncoder.encode((String)object5, (String)object4);
                    bufferedWriter.write((String)object5);
                    n3 = 61;
                    bufferedWriter.write(n3);
                    object3 = object3.value();
                    object5 = object.postDataCharset();
                    object3 = URLEncoder.encode((String)object3, (String)object5);
                    bufferedWriter.write((String)object3);
                }
            }
        }
        bufferedWriter.close();
    }

    public String body() {
        this.prepareByteData();
        Validate.notNull(this.byteData);
        Object object = this.charset;
        object = object == null ? DataUtil.UTF_8 : Charset.forName((String)object);
        ByteBuffer byteBuffer = this.byteData;
        object = ((Charset)object).decode(byteBuffer).toString();
        ((Buffer)this.byteData).rewind();
        return object;
    }

    public byte[] bodyAsBytes() {
        this.prepareByteData();
        Validate.notNull(this.byteData);
        return this.byteData.array();
    }

    public BufferedInputStream bodyStream() {
        boolean bl2 = this.executed;
        Object object = "Request must be executed (with .execute(), .get(), or .post() before getting response body";
        Validate.isTrue(bl2, (String)object);
        Object object2 = this.byteData;
        if (object2 != null) {
            byte[] byArray = this.byteData.array();
            object = new ByteArrayInputStream(byArray);
            object2 = new BufferedInputStream((InputStream)object, 32768);
            return object2;
        }
        Validate.isFalse(this.inputStreamRead, "Request has already been read");
        Validate.notNull(this.bodyStream);
        this.inputStreamRead = true;
        return this.bodyStream.inputStream();
    }

    public Connection$Response bufferUp() {
        this.prepareByteData();
        return this;
    }

    public String charset() {
        return this.charset;
    }

    public HttpConnection$Response charset(String string2) {
        this.charset = string2;
        return this;
    }

    public String contentType() {
        return this.contentType;
    }

    public Document parse() {
        boolean bl2 = this.executed;
        Validate.isTrue(bl2, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
        Object object = this.bodyStream;
        Object object2 = this.byteData;
        if (object2 != null) {
            object2 = this.byteData.array();
            object = new ByteArrayInputStream((byte[])object2);
            object2 = null;
            this.inputStreamRead = false;
        }
        Validate.isFalse(this.inputStreamRead, "Input stream already read and parsed, cannot re-read.");
        object2 = this.charset;
        Object object3 = this.url.toExternalForm();
        Parser parser = this.req.parser();
        object = DataUtil.parseInputStream((InputStream)object, (String)object2, (String)object3, parser);
        object3 = this.req;
        object2 = new HttpConnection((HttpConnection$Request)object3, this, null);
        ((Document)object).connection((Connection)object2);
        this.charset = object2 = ((Document)object).outputSettings().charset().name();
        this.inputStreamRead = true;
        this.safeClose();
        return object;
    }

    public void processResponseHeaders(Map object) {
        boolean bl2;
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            if (string2 == null) continue;
            object2 = (List)object2.getValue();
            Object object3 = "Set-Cookie";
            boolean bl3 = string2.equalsIgnoreCase((String)object3);
            if (bl3) {
                boolean bl4;
                object3 = object2.iterator();
                while (bl4 = object3.hasNext()) {
                    String string3 = (String)object3.next();
                    if (string3 == null) continue;
                    Object object4 = new TokenQueue(string3);
                    string3 = ((TokenQueue)object4).chompTo("=").trim();
                    Object object5 = ";";
                    object4 = ((TokenQueue)object4).consumeTo((String)object5).trim();
                    int n3 = string3.length();
                    if (n3 <= 0 || (n3 = (int)((object5 = this.cookies).containsKey(string3) ? 1 : 0)) != 0) continue;
                    this.cookie(string3, (String)object4);
                }
            }
            object2 = object2.iterator();
            while (bl3 = object2.hasNext()) {
                object3 = HttpConnection$Response.fixHeaderEncoding((String)object2.next());
                this.addHeader(string2, (String)object3);
            }
        }
    }

    public int statusCode() {
        return this.statusCode;
    }

    public String statusMessage() {
        return this.statusMessage;
    }
}


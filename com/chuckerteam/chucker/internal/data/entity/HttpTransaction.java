/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 */
package com.chuckerteam.chucker.internal.data.entity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction$a;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction$b;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction$getParsedRequestHeaders$1;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction$getParsedResponseHeaders$1;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public final class HttpTransaction {
    private String error;
    private String host;
    private long id;
    private boolean isRequestBodyPlainText;
    private boolean isResponseBodyPlainText;
    private String method;
    private String path;
    private String protocol;
    private String requestBody;
    private String requestContentType;
    private Long requestDate;
    private String requestHeaders;
    private Long requestPayloadSize;
    private String responseBody;
    private String responseCipherSuite;
    private Integer responseCode;
    private String responseContentType;
    private Long responseDate;
    private String responseHeaders;
    private byte[] responseImageData;
    private String responseMessage;
    private Long responsePayloadSize;
    private String responseTlsVersion;
    private String scheme;
    private Long tookMs;
    private String url;

    public HttpTransaction() {
        this(0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, 0x1010001, null);
    }

    public HttpTransaction(long l2, Long l3, Long l4, Long l7, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Long l8, String string10, String string11, String string12, boolean bl2, Integer n3, String string13, String string14, Long l12, String string15, String string16, String string17, boolean bl3, byte[] byArray) {
        this.id = l2;
        this.requestDate = l3;
        this.responseDate = l4;
        this.tookMs = l7;
        this.protocol = string2;
        this.method = string3;
        this.url = string4;
        this.host = string5;
        this.path = string6;
        this.scheme = string7;
        this.responseTlsVersion = string8;
        this.responseCipherSuite = string9;
        this.requestPayloadSize = l8;
        this.requestContentType = string10;
        this.requestHeaders = string11;
        this.requestBody = string12;
        this.isRequestBodyPlainText = bl2;
        this.responseCode = n3;
        this.responseMessage = string13;
        this.error = string14;
        this.responsePayloadSize = l12;
        this.responseContentType = string15;
        this.responseHeaders = string16;
        this.responseBody = string17;
        this.isResponseBodyPlainText = bl3;
        this.responseImageData = byArray;
    }

    public /* synthetic */ HttpTransaction(long l2, Long l3, Long l4, Long l7, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Long l8, String string10, String string11, String string12, boolean bl2, Integer n3, String string13, String string14, Long l12, String string15, String string16, String string17, boolean bl3, byte[] byArray, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        long l14;
        int n7 = n4 & 1;
        long l15 = n7 != 0 ? (l14 = 0L) : l2;
        n7 = n4 & 0x10000;
        boolean bl4 = n7 != 0 ? true : bl2;
        n7 = n4 & 0x1000000;
        boolean bl5 = n7 != 0 ? true : bl3;
        this(l15, l3, l4, l7, string2, string3, string4, string5, string6, string7, string8, string9, l8, string10, string11, string12, bl4, n3, string13, string14, l12, string15, string16, string17, bl5, byArray);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final String formatBody(String object, String object2) {
        if (object2 == null) return object;
        int n3 = b.k((CharSequence)object2);
        if (n3 != 0) {
            return object;
        }
        String string2 = "json";
        boolean bl2 = true;
        boolean bl3 = StringsKt.F((CharSequence)object2, string2, bl2);
        if (bl3) {
            Intrinsics.checkNotNullParameter(object, string2);
            try {
                object2 = JsonParser.parseString((String)object);
                Gson gson = ul1_0.a();
                object2 = gson.toJson((JsonElement)object2);
                String string3 = "{\n            val je = JsonParser.parseString(json)\n            JsonConverter.instance.toJson(je)\n        }";
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                return object2;
            }
            catch (JsonParseException exception) {
                return object;
            }
        }
        String string4 = "xml";
        bl3 = StringsKt.F((CharSequence)object2, string4, bl2);
        Object object3 = null;
        if (bl3) {
            Intrinsics.checkNotNullParameter(object, string4);
            {
                object2 = DocumentBuilderFactory.newInstance();
                String string5 = "newInstance()";
                Intrinsics.checkNotNullExpressionValue(object2, string5);
                ((DocumentBuilderFactory)object2).setExpandEntityReferences(false);
                object2 = ((DocumentBuilderFactory)object2).newDocumentBuilder();
                String string6 = "documentFactory.newDocumentBuilder()";
                Intrinsics.checkNotNullExpressionValue(object2, string6);
                object3 = Charset.defaultCharset();
                String string7 = "defaultCharset()";
                Intrinsics.checkNotNullExpressionValue(object3, string7);
                object3 = ((String)object).getBytes((Charset)object3);
                string7 = "(this as java.lang.String).getBytes(charset)";
                Intrinsics.checkNotNullExpressionValue(object3, string7);
                Object object4 = new ByteArrayInputStream((byte[])object3);
                InputSource inputSource = new InputSource((InputStream)object4);
                object2 = ((DocumentBuilder)object2).parse(inputSource);
                String string8 = "documentBuilder.parse(inputSource)";
                Intrinsics.checkNotNullExpressionValue(object2, string8);
                DOMSource dOMSource = new DOMSource((Node)object2);
                object2 = new StringWriter();
                object4 = new StreamResult((Writer)object2);
                object3 = TransformerFactory.newInstance();
                string7 = "http://javax.xml.XMLConstants/feature/secure-processing";
                ((TransformerFactory)object3).setFeature(string7, bl2);
                Transformer transformer = ((TransformerFactory)object3).newTransformer();
                object3 = "{http://xml.apache.org/xslt}indent-amount";
                string7 = "2";
                transformer.setOutputProperty((String)object3, string7);
                object3 = "indent";
                string7 = "yes";
                transformer.setOutputProperty((String)object3, string7);
                transformer.transform(dOMSource, (Result)object4);
                object2 = ((StringWriter)object2).toString();
                String string9 = "{\n            val documentFactory: DocumentBuilderFactory = DocumentBuilderFactory.newInstance()\n            // This flag is required for security reasons\n            documentFactory.isExpandEntityReferences = false\n\n            val documentBuilder: DocumentBuilder = documentFactory.newDocumentBuilder()\n            val inputSource = InputSource(ByteArrayInputStream(xml.toByteArray(Charset.defaultCharset())))\n            val document: Document = documentBuilder.parse(inputSource)\n\n            val domSource = DOMSource(document)\n            val writer = StringWriter()\n            val result = StreamResult(writer)\n\n            TransformerFactory.newInstance().apply {\n                setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true)\n            }.newTransformer().apply {\n                setOutputProperty(\"{http://xml.apache.org/xslt}indent-amount\", \"2\")\n                setOutputProperty(OutputKeys.INDENT, \"yes\")\n                transform(domSource, result)\n            }\n            writer.toString()\n        }";
                Intrinsics.checkNotNullExpressionValue(object2, string9);
                return object2;
            }
        }
        String string10 = "x-www-form-urlencoded";
        boolean bl4 = StringsKt.F((CharSequence)object2, string10, bl2);
        if (!bl4) return object;
        object2 = "form";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        {
            bl4 = b.k((CharSequence)object);
            if (bl4) {
                return object;
            }
            object2 = "&";
            object2 = new String[]{object2};
            n3 = 6;
            Object object5 = object2 = StringsKt.a0((CharSequence)object, (String[])object2, false, 0, n3);
            Iterable iterable = (Iterable)object2;
            String string11 = "\n";
            kv0_0 kv0_02 = kv0_0.c;
            int n4 = 30;
            bl3 = false;
            Object var8_21 = null;
            object3 = null;
            return CollectionsKt.R(iterable, string11, null, null, kv0_02, n4);
        }
    }

    private final String formatBytes(long l2) {
        return LV0.a(l2);
    }

    private final List toHttpHeaderList(m41_0 m41_02) {
        ArrayList<Ea1> arrayList = new ArrayList<Ea1>();
        int n3 = m41_02.size();
        if (n3 > 0) {
            int n4 = 0;
            String string2 = null;
            while (true) {
                int n7 = n4 + 1;
                String string3 = m41_02.c(n4);
                Intrinsics.checkNotNullExpressionValue(string3, "headers.name(i)");
                string2 = m41_02.g(n4);
                String string4 = "headers.value(i)";
                Intrinsics.checkNotNullExpressionValue(string2, string4);
                Ea1 ea1 = new Ea1(string3, string2);
                arrayList.add(ea1);
                if (n7 >= n3) break;
                n4 = n7;
            }
        }
        return arrayList;
    }

    public final String getDurationString() {
        Object object = this.tookMs;
        if (object == null) {
            object = null;
        } else {
            long l2 = ((Number)object).longValue();
            String string2 = " ms";
            object = UX.b(l2, string2);
        }
        return object;
    }

    public final String getError() {
        return this.error;
    }

    public final String getFormattedPath(boolean bl2) {
        String string2 = this.url;
        ob1_1 ob1_12 = null;
        if (string2 != null) {
            Intrinsics.checkNotNullParameter(string2, "<this>");
            Ob1$a ob1$a = new Ob1$a();
            ob1$a.e(null, string2);
            ob1_12 = ob1$a.b();
        }
        if (ob1_12 == null) {
            return "";
        }
        return MV0$a.a(ob1_12, bl2).a();
    }

    public final String getFormattedRequestBody() {
        String string2;
        String string3 = this.requestBody;
        String string4 = "";
        if (string3 != null && (string3 = this.formatBody(string3, string2 = this.getRequestContentType())) != null) {
            string4 = string3;
        }
        return string4;
    }

    public final String getFormattedResponseBody() {
        String string2;
        String string3 = this.responseBody;
        String string4 = "";
        if (string3 != null && (string3 = this.formatBody(string3, string2 = this.getResponseContentType())) != null) {
            string4 = string3;
        }
        return string4;
    }

    public final String getFormattedUrl(boolean bl2) {
        String string2 = this.url;
        ob1_1 ob1_12 = null;
        if (string2 != null) {
            Intrinsics.checkNotNullParameter(string2, "<this>");
            Ob1$a ob1$a = new Ob1$a();
            ob1$a.e(null, string2);
            ob1_12 = ob1$a.b();
        }
        if (ob1_12 == null) {
            return "";
        }
        return MV0$a.a(ob1_12, bl2).b();
    }

    public final String getHost() {
        return this.host;
    }

    public final long getId() {
        return this.id;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getNotificationText() {
        Object object = this.getStatus();
        Object object2 = HttpTransaction$b.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = object2[n3];
        int n4 = 1;
        char c2 = ' ';
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                object = new StringBuilder();
                object2 = this.responseCode;
                ((StringBuilder)object).append(object2);
                ((StringBuilder)object).append(c2);
                object2 = this.method;
                ((StringBuilder)object).append(object2);
                ((StringBuilder)object).append(c2);
                object2 = this.path;
                ((StringBuilder)object).append(object2);
                object = ((StringBuilder)object).toString();
            } else {
                object = new StringBuilder(" . . .  ");
                object2 = this.method;
                ((StringBuilder)object).append(object2);
                ((StringBuilder)object).append(c2);
                object2 = this.path;
                ((StringBuilder)object).append(object2);
                object = ((StringBuilder)object).toString();
            }
        } else {
            object = new StringBuilder(" ! ! !  ");
            object2 = this.method;
            ((StringBuilder)object).append(object2);
            ((StringBuilder)object).append(c2);
            object2 = this.path;
            ((StringBuilder)object).append(object2);
            object = ((StringBuilder)object).toString();
        }
        return object;
    }

    public final List getParsedRequestHeaders() {
        Gson gson = ul1_0.a();
        String string2 = this.requestHeaders;
        Object object = new HttpTransaction$getParsedRequestHeaders$1();
        object = ((TypeToken)object).getType();
        return (List)gson.fromJson(string2, (Type)object);
    }

    public final List getParsedResponseHeaders() {
        Gson gson = ul1_0.a();
        String string2 = this.responseHeaders;
        Object object = new HttpTransaction$getParsedResponseHeaders$1();
        object = ((TypeToken)object).getType();
        return (List)gson.fromJson(string2, (Type)object);
    }

    public final String getPath() {
        return this.path;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getRequestBody() {
        return this.requestBody;
    }

    public final String getRequestContentType() {
        return this.requestContentType;
    }

    public final Long getRequestDate() {
        return this.requestDate;
    }

    public final String getRequestDateString() {
        Object object = this.requestDate;
        if (object == null) {
            object = null;
        } else {
            long l2 = ((Number)object).longValue();
            Date date = new Date(l2);
            object = date.toString();
        }
        return object;
    }

    public final String getRequestHeaders() {
        return this.requestHeaders;
    }

    public final String getRequestHeadersString(boolean bl2) {
        List list = this.getParsedRequestHeaders();
        String string2 = "";
        if (list != null) {
            Iterable iterable = list;
            iterable = list;
            String string3 = "";
            jv0_0 jv0_02 = new jv0_0(bl2);
            int n3 = 30;
            String string4 = CollectionsKt.R(iterable, string3, null, null, jv0_02, n3);
            if (string4 != null) {
                string2 = string4;
            }
        }
        return string2;
    }

    public final Long getRequestPayloadSize() {
        return this.requestPayloadSize;
    }

    public final String getRequestSizeString() {
        Long l2 = this.requestPayloadSize;
        long l3 = l2 == null ? 0L : l2;
        return this.formatBytes(l3);
    }

    public final String getResponseBody() {
        return this.responseBody;
    }

    public final String getResponseCipherSuite() {
        return this.responseCipherSuite;
    }

    public final Integer getResponseCode() {
        return this.responseCode;
    }

    public final String getResponseContentType() {
        return this.responseContentType;
    }

    public final Long getResponseDate() {
        return this.responseDate;
    }

    public final String getResponseDateString() {
        Object object = this.responseDate;
        if (object == null) {
            object = null;
        } else {
            long l2 = ((Number)object).longValue();
            Date date = new Date(l2);
            object = date.toString();
        }
        return object;
    }

    public final String getResponseHeaders() {
        return this.responseHeaders;
    }

    public final String getResponseHeadersString(boolean bl2) {
        List list = this.getParsedResponseHeaders();
        String string2 = "";
        if (list != null) {
            Iterable iterable = list;
            iterable = list;
            String string3 = "";
            jv0_0 jv0_02 = new jv0_0(bl2);
            int n3 = 30;
            String string4 = CollectionsKt.R(iterable, string3, null, null, jv0_02, n3);
            if (string4 != null) {
                string2 = string4;
            }
        }
        return string2;
    }

    public final Bitmap getResponseImageBitmap() {
        Object object = this.responseImageData;
        if (object == null) {
            object = null;
        } else {
            int n3 = ((byte[])object).length;
            object = BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)n3);
        }
        return object;
    }

    public final byte[] getResponseImageData() {
        return this.responseImageData;
    }

    public final String getResponseMessage() {
        return this.responseMessage;
    }

    public final Long getResponsePayloadSize() {
        return this.responsePayloadSize;
    }

    public final String getResponseSizeString() {
        Object object = this.responsePayloadSize;
        if (object == null) {
            object = null;
        } else {
            long l2 = ((Number)object).longValue();
            object = this.formatBytes(l2);
        }
        return object;
    }

    public final String getResponseSummaryText() {
        char c2;
        Object object2 = HttpTransaction$b.$EnumSwitchMapping$0;
        Object object = this.getStatus();
        int c22 = object.ordinal();
        char c3 = object2[c22];
        if (c3 != (c2 = '\u0001')) {
            c2 = '\u0002';
            if (c3 != c2) {
                object = new StringBuilder();
                object2 = this.responseCode;
                ((StringBuilder)object).append(object2);
                c2 = ' ';
                ((StringBuilder)object).append(c2);
                object2 = this.responseMessage;
                ((StringBuilder)object).append(object2);
                object = ((StringBuilder)object).toString();
            } else {
                boolean bl2 = false;
                object = null;
            }
        } else {
            object = this.error;
        }
        return object;
    }

    public final String getResponseTlsVersion() {
        return this.responseTlsVersion;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final HttpTransaction$a getStatus() {
        Object object = this.error;
        object = object != null ? HttpTransaction$a.Failed : ((object = this.responseCode) == null ? HttpTransaction$a.Requested : HttpTransaction$a.Complete);
        return object;
    }

    public final Long getTookMs() {
        return this.tookMs;
    }

    public final String getTotalSizeString() {
        Long l2 = this.requestPayloadSize;
        long l3 = 0L;
        long l4 = l2 == null ? l3 : l2;
        l2 = this.responsePayloadSize;
        if (l2 != null) {
            l3 = l2;
        }
        return this.formatBytes(l4 += l3);
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean hasTheSameContent(HttpTransaction object) {
        boolean bl2;
        block7: {
            block6: {
                boolean bl3;
                boolean bl4;
                Object object2;
                Object object3;
                boolean bl5;
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                if (object == null) {
                    return false;
                }
                long l2 = this.id;
                long l3 = ((HttpTransaction)object).id;
                long l4 = l2 - l3;
                Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object4 != false || !(bl5 = Intrinsics.areEqual(object3 = this.requestDate, object2 = ((HttpTransaction)object).requestDate)) || !(bl5 = Intrinsics.areEqual(object3 = this.responseDate, object2 = ((HttpTransaction)object).responseDate)) || !(bl5 = Intrinsics.areEqual(object3 = this.tookMs, object2 = ((HttpTransaction)object).tookMs)) || !(bl5 = Intrinsics.areEqual(object3 = this.protocol, object2 = ((HttpTransaction)object).protocol)) || !(bl5 = Intrinsics.areEqual(object3 = this.method, object2 = ((HttpTransaction)object).method)) || !(bl5 = Intrinsics.areEqual(object3 = this.url, object2 = ((HttpTransaction)object).url)) || !(bl5 = Intrinsics.areEqual(object3 = this.host, object2 = ((HttpTransaction)object).host)) || !(bl5 = Intrinsics.areEqual(object3 = this.path, object2 = ((HttpTransaction)object).path)) || !(bl5 = Intrinsics.areEqual(object3 = this.scheme, object2 = ((HttpTransaction)object).scheme)) || !(bl5 = Intrinsics.areEqual(object3 = this.responseTlsVersion, object2 = ((HttpTransaction)object).responseTlsVersion)) || !(bl5 = Intrinsics.areEqual(object3 = this.responseCipherSuite, object2 = ((HttpTransaction)object).responseCipherSuite)) || !(bl5 = Intrinsics.areEqual(object3 = this.requestPayloadSize, object2 = ((HttpTransaction)object).requestPayloadSize)) || !(bl5 = Intrinsics.areEqual(object3 = this.requestContentType, object2 = ((HttpTransaction)object).requestContentType)) || !(bl5 = Intrinsics.areEqual(object3 = this.requestHeaders, object2 = ((HttpTransaction)object).requestHeaders)) || !(bl5 = Intrinsics.areEqual(object3 = this.requestBody, object2 = ((HttpTransaction)object).requestBody)) || (bl5 = this.isRequestBodyPlainText) != (bl4 = ((HttpTransaction)object).isRequestBodyPlainText) || !(bl5 = Intrinsics.areEqual(object3 = this.responseCode, object2 = ((HttpTransaction)object).responseCode)) || !(bl5 = Intrinsics.areEqual(object3 = this.responseMessage, object2 = ((HttpTransaction)object).responseMessage)) || !(bl5 = Intrinsics.areEqual(object3 = this.error, object2 = ((HttpTransaction)object).error)) || !(bl5 = Intrinsics.areEqual(object3 = this.responsePayloadSize, object2 = ((HttpTransaction)object).responsePayloadSize)) || !(bl5 = Intrinsics.areEqual(object3 = this.responseContentType, object2 = ((HttpTransaction)object).responseContentType)) || !(bl5 = Intrinsics.areEqual(object3 = this.responseHeaders, object2 = ((HttpTransaction)object).responseHeaders)) || !(bl5 = Intrinsics.areEqual(object3 = this.responseBody, object2 = ((HttpTransaction)object).responseBody)) || (bl5 = this.isResponseBodyPlainText) != (bl4 = ((HttpTransaction)object).isResponseBodyPlainText)) break block6;
                object3 = this.responseImageData;
                if (object3 == null) break block7;
                object = ((HttpTransaction)object).responseImageData;
                if (object == null) {
                    object = new byte[0];
                }
                if (bl3 = Arrays.equals((byte[])object3, (byte[])object)) break block7;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final boolean isRequestBodyPlainText() {
        return this.isRequestBodyPlainText;
    }

    public final boolean isResponseBodyPlainText() {
        return this.isResponseBodyPlainText;
    }

    public final boolean isSsl() {
        return b.i(this.scheme, "https", true);
    }

    public final HttpTransaction populateUrl(ob1_1 object) {
        String string2;
        Intrinsics.checkNotNullParameter(object, "httpUrl");
        object = MV0$a.a((ob1_1)object, false);
        this.url = string2 = ((MV0)object).b();
        this.host = string2 = ((MV0)object).b;
        this.path = string2 = ((MV0)object).a();
        this.scheme = object = ((MV0)object).a;
        return this;
    }

    public final void setError(String string2) {
        this.error = string2;
    }

    public final void setHost(String string2) {
        this.host = string2;
    }

    public final void setId(long l2) {
        this.id = l2;
    }

    public final void setMethod(String string2) {
        this.method = string2;
    }

    public final void setPath(String string2) {
        this.path = string2;
    }

    public final void setProtocol(String string2) {
        this.protocol = string2;
    }

    public final void setRequestBody(String string2) {
        this.requestBody = string2;
    }

    public final void setRequestBodyPlainText(boolean bl2) {
        this.isRequestBodyPlainText = bl2;
    }

    public final void setRequestContentType(String string2) {
        this.requestContentType = string2;
    }

    public final void setRequestDate(Long l2) {
        this.requestDate = l2;
    }

    public final void setRequestHeaders(String string2) {
        this.requestHeaders = string2;
    }

    public final void setRequestHeaders(List object) {
        Intrinsics.checkNotNullParameter(object, "headers");
        this.requestHeaders = object = ul1_0.a().toJson(object);
    }

    public final void setRequestHeaders(m41_0 iterable) {
        Intrinsics.checkNotNullParameter(iterable, "headers");
        iterable = this.toHttpHeaderList((m41_0)iterable);
        this.setRequestHeaders((List)iterable);
    }

    public final void setRequestPayloadSize(Long l2) {
        this.requestPayloadSize = l2;
    }

    public final void setResponseBody(String string2) {
        this.responseBody = string2;
    }

    public final void setResponseBodyPlainText(boolean bl2) {
        this.isResponseBodyPlainText = bl2;
    }

    public final void setResponseCipherSuite(String string2) {
        this.responseCipherSuite = string2;
    }

    public final void setResponseCode(Integer n3) {
        this.responseCode = n3;
    }

    public final void setResponseContentType(String string2) {
        this.responseContentType = string2;
    }

    public final void setResponseDate(Long l2) {
        this.responseDate = l2;
    }

    public final void setResponseHeaders(String string2) {
        this.responseHeaders = string2;
    }

    public final void setResponseHeaders(List object) {
        Intrinsics.checkNotNullParameter(object, "headers");
        this.responseHeaders = object = ul1_0.a().toJson(object);
    }

    public final void setResponseHeaders(m41_0 iterable) {
        Intrinsics.checkNotNullParameter(iterable, "headers");
        iterable = this.toHttpHeaderList((m41_0)iterable);
        this.setResponseHeaders((List)iterable);
    }

    public final void setResponseImageData(byte[] byArray) {
        this.responseImageData = byArray;
    }

    public final void setResponseMessage(String string2) {
        this.responseMessage = string2;
    }

    public final void setResponsePayloadSize(Long l2) {
        this.responsePayloadSize = l2;
    }

    public final void setResponseTlsVersion(String string2) {
        this.responseTlsVersion = string2;
    }

    public final void setScheme(String string2) {
        this.scheme = string2;
    }

    public final void setTookMs(Long l2) {
        this.tookMs = l2;
    }

    public final void setUrl(String string2) {
        this.url = string2;
    }
}


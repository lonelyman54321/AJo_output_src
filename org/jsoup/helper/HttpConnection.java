/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import java.io.InputStream;
import java.io.Serializable;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.Connection;
import org.jsoup.Connection$KeyVal;
import org.jsoup.Connection$Method;
import org.jsoup.Connection$Request;
import org.jsoup.Connection$Response;
import org.jsoup.helper.HttpConnection$1;
import org.jsoup.helper.HttpConnection$KeyVal;
import org.jsoup.helper.HttpConnection$Request;
import org.jsoup.helper.HttpConnection$Response;
import org.jsoup.helper.RequestAuthenticator;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

public class HttpConnection
implements Connection {
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String DEFAULT_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36";
    private static final String DefaultUploadType = "application/octet-stream";
    public static final String FORM_URL_ENCODED = "application/x-www-form-urlencoded";
    private static final int HTTP_TEMP_REDIR = 307;
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    public static final String MULTIPART_FORM_DATA = "multipart/form-data";
    private static final String USER_AGENT = "User-Agent";
    private HttpConnection$Request req;
    private Connection$Response res;

    public HttpConnection() {
        HttpConnection$Request httpConnection$Request;
        this.req = httpConnection$Request = new HttpConnection$Request();
    }

    public HttpConnection(HttpConnection$Request httpConnection$Request) {
        HttpConnection$Request httpConnection$Request2;
        this.req = httpConnection$Request2 = new HttpConnection$Request(httpConnection$Request);
    }

    private HttpConnection(HttpConnection$Request httpConnection$Request, HttpConnection$Response httpConnection$Response) {
        this.req = httpConnection$Request;
        this.res = httpConnection$Response;
    }

    public /* synthetic */ HttpConnection(HttpConnection$Request httpConnection$Request, HttpConnection$Response response, HttpConnection$1 httpConnection$1) {
        this(httpConnection$Request, response);
    }

    public static /* synthetic */ Charset access$700() {
        return ISO_8859_1;
    }

    public static /* synthetic */ boolean access$800(Connection$Request connection$Request) {
        return HttpConnection.needsMultipart(connection$Request);
    }

    public static /* synthetic */ String access$900(String string2) {
        return HttpConnection.encodeMimeName(string2);
    }

    public static Connection connect(String string2) {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(string2);
        return httpConnection;
    }

    public static Connection connect(URL uRL) {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(uRL);
        return httpConnection;
    }

    private static String encodeMimeName(String string2) {
        return string2.replace("\"", "%22");
    }

    private static boolean needsMultipart(Connection$Request object) {
        boolean bl2;
        object = object.data().iterator();
        while (bl2 = object.hasNext()) {
            Connection$KeyVal connection$KeyVal = (Connection$KeyVal)object.next();
            bl2 = connection$KeyVal.hasInputStream();
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public Connection auth(RequestAuthenticator requestAuthenticator) {
        this.req.auth(requestAuthenticator);
        return this;
    }

    public Connection cookie(String string2, String string3) {
        this.req.cookie(string2, string3);
        return this;
    }

    public CookieStore cookieStore() {
        return HttpConnection$Request.access$000(this.req).getCookieStore();
    }

    public Connection cookieStore(CookieStore cookieStore) {
        HttpConnection$Request httpConnection$Request = this.req;
        CookieManager cookieManager = new CookieManager(cookieStore, null);
        HttpConnection$Request.access$002(httpConnection$Request, cookieManager);
        return this;
    }

    public Connection cookies(Map object) {
        boolean bl2;
        Object object2 = "cookies";
        Validate.notNullParam(object, (String)object2);
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            HttpConnection$Request httpConnection$Request = this.req;
            String string2 = (String)object2.getKey();
            object2 = (String)object2.getValue();
            httpConnection$Request.cookie(string2, (String)object2);
        }
        return this;
    }

    public Connection$KeyVal data(String string2) {
        boolean bl2;
        Validate.notEmptyParam(string2, "key");
        Iterator iterator = this.request().data().iterator();
        while (bl2 = iterator.hasNext()) {
            Connection$KeyVal connection$KeyVal = (Connection$KeyVal)iterator.next();
            String string3 = connection$KeyVal.key();
            boolean bl3 = string3.equals(string2);
            if (!bl3) continue;
            return connection$KeyVal;
        }
        return null;
    }

    public Connection data(String object, String string2) {
        HttpConnection$Request httpConnection$Request = this.req;
        object = HttpConnection$KeyVal.create((String)object, string2);
        httpConnection$Request.data((Connection$KeyVal)object);
        return this;
    }

    public Connection data(String object, String string2, InputStream inputStream) {
        HttpConnection$Request httpConnection$Request = this.req;
        object = HttpConnection$KeyVal.create((String)object, string2, inputStream);
        httpConnection$Request.data((Connection$KeyVal)object);
        return this;
    }

    public Connection data(String object, String string2, InputStream inputStream, String string3) {
        HttpConnection$Request httpConnection$Request = this.req;
        object = HttpConnection$KeyVal.create((String)object, string2, inputStream).contentType(string3);
        httpConnection$Request.data((Connection$KeyVal)object);
        return this;
    }

    public Connection data(Collection object) {
        boolean bl2;
        Object object2 = "data";
        Validate.notNullParam(object, (String)object2);
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Connection$KeyVal)object.next();
            HttpConnection$Request httpConnection$Request = this.req;
            httpConnection$Request.data((Connection$KeyVal)object2);
        }
        return this;
    }

    public Connection data(Map object) {
        boolean bl2;
        Object object2 = "data";
        Validate.notNullParam(object, (String)object2);
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            HttpConnection$Request httpConnection$Request = this.req;
            String string2 = (String)object2.getKey();
            object2 = (String)object2.getValue();
            object2 = HttpConnection$KeyVal.create(string2, (String)object2);
            httpConnection$Request.data((Connection$KeyVal)object2);
        }
        return this;
    }

    public Connection data(String ... stringArray) {
        Object object = "keyvals";
        Validate.notNullParam(stringArray, (String)object);
        int n3 = stringArray.length % 2;
        int n4 = 0;
        if (n3 == 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        String string2 = "Must supply an even number of key value pairs";
        Validate.isTrue(n3 != 0, string2);
        while (n4 < (n3 = stringArray.length)) {
            object = stringArray[n4];
            int n7 = n4 + 1;
            string2 = stringArray[n7];
            Validate.notEmpty((String)object, "Data key must not be empty");
            Validate.notNull(string2, "Data value must not be null");
            HttpConnection$Request httpConnection$Request = this.req;
            object = HttpConnection$KeyVal.create((String)object, string2);
            httpConnection$Request.data((Connection$KeyVal)object);
            n4 += 2;
        }
        return this;
    }

    public Connection$Response execute() {
        HttpConnection$Response httpConnection$Response = HttpConnection$Response.execute(this.req);
        this.res = httpConnection$Response;
        return httpConnection$Response;
    }

    public Connection followRedirects(boolean bl2) {
        this.req.followRedirects(bl2);
        return this;
    }

    public Document get() {
        HttpConnection$Request httpConnection$Request = this.req;
        Connection$Method connection$Method = Connection$Method.GET;
        httpConnection$Request.method(connection$Method);
        this.execute();
        Validate.notNull(this.res);
        return this.res.parse();
    }

    public Connection header(String string2, String string3) {
        this.req.header(string2, string3);
        return this;
    }

    public Connection headers(Map object) {
        boolean bl2;
        Object object2 = "headers";
        Validate.notNullParam(object, (String)object2);
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            HttpConnection$Request httpConnection$Request = this.req;
            String string2 = (String)object2.getKey();
            object2 = (String)object2.getValue();
            httpConnection$Request.header(string2, (String)object2);
        }
        return this;
    }

    public Connection ignoreContentType(boolean bl2) {
        this.req.ignoreContentType(bl2);
        return this;
    }

    public Connection ignoreHttpErrors(boolean bl2) {
        this.req.ignoreHttpErrors(bl2);
        return this;
    }

    public Connection maxBodySize(int n3) {
        this.req.maxBodySize(n3);
        return this;
    }

    public Connection method(Connection$Method connection$Method) {
        this.req.method(connection$Method);
        return this;
    }

    public Connection newRequest() {
        HttpConnection$Request httpConnection$Request = this.req;
        HttpConnection httpConnection = new HttpConnection(httpConnection$Request);
        return httpConnection;
    }

    public final /* synthetic */ Connection newRequest(String string2) {
        return b50_0.b(this, string2);
    }

    public final /* synthetic */ Connection newRequest(URL uRL) {
        return b50_0.c(this, uRL);
    }

    public Connection parser(Parser parser) {
        this.req.parser(parser);
        return this;
    }

    public Document post() {
        HttpConnection$Request httpConnection$Request = this.req;
        Connection$Method connection$Method = Connection$Method.POST;
        httpConnection$Request.method(connection$Method);
        this.execute();
        Validate.notNull(this.res);
        return this.res.parse();
    }

    public Connection postDataCharset(String string2) {
        this.req.postDataCharset(string2);
        return this;
    }

    public Connection proxy(String string2, int n3) {
        this.req.proxy(string2, n3);
        return this;
    }

    public Connection proxy(Proxy proxy) {
        this.req.proxy(proxy);
        return this;
    }

    public Connection referrer(String string2) {
        Validate.notNullParam(string2, "referrer");
        this.req.header("Referer", string2);
        return this;
    }

    public Connection$Request request() {
        return this.req;
    }

    public Connection request(Connection$Request connection$Request) {
        connection$Request = (HttpConnection$Request)connection$Request;
        this.req = connection$Request;
        return this;
    }

    public Connection requestBody(String string2) {
        this.req.requestBody(string2);
        return this;
    }

    public Connection$Response response() {
        Object object = this.res;
        if (object != null) {
            return object;
        }
        object = new IllegalArgumentException("You must execute the request before getting a response.");
        throw object;
    }

    public Connection response(Connection$Response connection$Response) {
        this.res = connection$Response;
        return this;
    }

    public Connection sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.req.sslSocketFactory(sSLSocketFactory);
        return this;
    }

    public Connection timeout(int n3) {
        this.req.timeout(n3);
        return this;
    }

    public Connection url(String string2) {
        Serializable serializable;
        Object object = "url";
        Validate.notEmptyParam(string2, (String)object);
        try {
            object = this.req;
        }
        catch (MalformedURLException malformedURLException) {
            string2 = cP.a("The supplied URL, '", string2, "', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
            serializable = new IllegalArgumentException(string2, malformedURLException);
            throw serializable;
        }
        serializable = new URL(string2);
        ((HttpConnection$Request)object).url((URL)serializable);
        return this;
    }

    public Connection url(URL uRL) {
        this.req.url(uRL);
        return this;
    }

    public Connection userAgent(String string2) {
        Validate.notNullParam(string2, "userAgent");
        this.req.header(USER_AGENT, string2);
        return this;
    }
}


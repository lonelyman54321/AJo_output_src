/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup;

import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.Connection$KeyVal;
import org.jsoup.Connection$Method;
import org.jsoup.Connection$Request;
import org.jsoup.Connection$Response;
import org.jsoup.helper.RequestAuthenticator;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

public interface Connection {
    public Connection auth(RequestAuthenticator var1);

    public Connection cookie(String var1, String var2);

    public CookieStore cookieStore();

    public Connection cookieStore(CookieStore var1);

    public Connection cookies(Map var1);

    public Connection$KeyVal data(String var1);

    public Connection data(String var1, String var2);

    public Connection data(String var1, String var2, InputStream var3);

    public Connection data(String var1, String var2, InputStream var3, String var4);

    public Connection data(Collection var1);

    public Connection data(Map var1);

    public Connection data(String ... var1);

    public Response execute();

    public Connection followRedirects(boolean var1);

    public Document get();

    public Connection header(String var1, String var2);

    public Connection headers(Map var1);

    public Connection ignoreContentType(boolean var1);

    public Connection ignoreHttpErrors(boolean var1);

    public Connection maxBodySize(int var1);

    public Connection method(Connection$Method var1);

    public Connection newRequest();

    public Connection newRequest(String var1);

    public Connection newRequest(URL var1);

    public Connection parser(Parser var1);

    public Document post();

    public Connection postDataCharset(String var1);

    public Connection proxy(String var1, int var2);

    public Connection proxy(Proxy var1);

    public Connection referrer(String var1);

    public Connection$Request request();

    public Connection request(Connection$Request var1);

    public Connection requestBody(String var1);

    public Response response();

    public Connection response(Response var1);

    public Connection sslSocketFactory(SSLSocketFactory var1);

    public Connection timeout(int var1);

    public Connection url(String var1);

    public Connection url(URL var1);

    public Connection userAgent(String var1);
}


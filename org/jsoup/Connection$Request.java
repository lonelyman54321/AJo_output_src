/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup;

import java.net.Proxy;
import java.util.Collection;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.Connection$Base;
import org.jsoup.Connection$KeyVal;
import org.jsoup.helper.RequestAuthenticator;
import org.jsoup.parser.Parser;

public interface Connection$Request
extends Connection$Base {
    public Connection$Request auth(RequestAuthenticator var1);

    public RequestAuthenticator auth();

    public Collection data();

    public Connection$Request data(Connection$KeyVal var1);

    public Connection$Request followRedirects(boolean var1);

    public boolean followRedirects();

    public Connection$Request ignoreContentType(boolean var1);

    public boolean ignoreContentType();

    public Connection$Request ignoreHttpErrors(boolean var1);

    public boolean ignoreHttpErrors();

    public int maxBodySize();

    public Connection$Request maxBodySize(int var1);

    public Connection$Request parser(Parser var1);

    public Parser parser();

    public String postDataCharset();

    public Connection$Request postDataCharset(String var1);

    public Proxy proxy();

    public Connection$Request proxy(String var1, int var2);

    public Connection$Request proxy(Proxy var1);

    public String requestBody();

    public Connection$Request requestBody(String var1);

    public SSLSocketFactory sslSocketFactory();

    public void sslSocketFactory(SSLSocketFactory var1);

    public int timeout();

    public Connection$Request timeout(int var1);
}


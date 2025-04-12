/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import java.net.CookieManager;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collection;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.Connection$KeyVal;
import org.jsoup.Connection$Method;
import org.jsoup.Connection$Request;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.HttpConnection$1;
import org.jsoup.helper.HttpConnection$Base;
import org.jsoup.helper.RequestAuthenticator;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Parser;

public class HttpConnection$Request
extends HttpConnection$Base
implements Connection$Request {
    private RequestAuthenticator authenticator;
    private String body = null;
    private CookieManager cookieManager;
    private final Collection data;
    private volatile boolean executing;
    private boolean followRedirects;
    private boolean ignoreContentType = false;
    private boolean ignoreHttpErrors = false;
    private int maxBodySizeBytes;
    private Parser parser;
    private boolean parserDefined = false;
    private String postDataCharset;
    private Proxy proxy;
    private SSLSocketFactory sslSocketFactory;
    private int timeoutMilliseconds;

    static {
        System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
    }

    public HttpConnection$Request() {
        super((HttpConnection$1)null);
        Object object;
        String string2;
        this.postDataCharset = string2 = DataUtil.defaultCharsetName;
        this.executing = false;
        this.timeoutMilliseconds = 30000;
        this.maxBodySizeBytes = 0x200000;
        this.followRedirects = true;
        this.data = object = new Object();
        object = Connection$Method.GET;
        this.method = object;
        this.addHeader("Accept-Encoding", "gzip");
        this.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36");
        object = Parser.htmlParser();
        this.parser = object;
        super();
        this.cookieManager = object;
    }

    public HttpConnection$Request(HttpConnection$Request object) {
        super((HttpConnection$Base)object, null);
        int n3;
        Object object2 = DataUtil.defaultCharsetName;
        this.postDataCharset = object2;
        this.executing = false;
        this.proxy = object2 = ((HttpConnection$Request)object).proxy;
        this.postDataCharset = object2 = ((HttpConnection$Request)object).postDataCharset;
        this.timeoutMilliseconds = n3 = ((HttpConnection$Request)object).timeoutMilliseconds;
        this.maxBodySizeBytes = n3 = ((HttpConnection$Request)object).maxBodySizeBytes;
        n3 = (int)(((HttpConnection$Request)object).followRedirects ? 1 : 0);
        this.followRedirects = n3;
        object2 = new ArrayList();
        this.data = object2;
        n3 = (int)(((HttpConnection$Request)object).ignoreHttpErrors ? 1 : 0);
        this.ignoreHttpErrors = n3;
        n3 = (int)(((HttpConnection$Request)object).ignoreContentType ? 1 : 0);
        this.ignoreContentType = n3;
        this.parser = object2 = ((HttpConnection$Request)object).parser.newInstance();
        n3 = (int)(((HttpConnection$Request)object).parserDefined ? 1 : 0);
        this.parserDefined = n3;
        this.sslSocketFactory = object2 = ((HttpConnection$Request)object).sslSocketFactory;
        this.cookieManager = object2 = ((HttpConnection$Request)object).cookieManager;
        this.authenticator = object = ((HttpConnection$Request)object).authenticator;
        this.executing = false;
    }

    public static /* synthetic */ CookieManager access$000(HttpConnection$Request httpConnection$Request) {
        return httpConnection$Request.cookieManager;
    }

    public static /* synthetic */ CookieManager access$002(HttpConnection$Request httpConnection$Request, CookieManager cookieManager) {
        httpConnection$Request.cookieManager = cookieManager;
        return cookieManager;
    }

    public static /* synthetic */ boolean access$300(HttpConnection$Request httpConnection$Request) {
        return httpConnection$Request.executing;
    }

    public static /* synthetic */ boolean access$302(HttpConnection$Request httpConnection$Request, boolean bl2) {
        httpConnection$Request.executing = bl2;
        return bl2;
    }

    public static /* synthetic */ boolean access$400(HttpConnection$Request httpConnection$Request) {
        return httpConnection$Request.parserDefined;
    }

    public static /* synthetic */ RequestAuthenticator access$500(HttpConnection$Request httpConnection$Request) {
        return httpConnection$Request.authenticator;
    }

    public Connection$Request auth(RequestAuthenticator requestAuthenticator) {
        this.authenticator = requestAuthenticator;
        return this;
    }

    public RequestAuthenticator auth() {
        return this.authenticator;
    }

    public CookieManager cookieManager() {
        return this.cookieManager;
    }

    public Collection data() {
        return this.data;
    }

    public HttpConnection$Request data(Connection$KeyVal connection$KeyVal) {
        Validate.notNullParam(connection$KeyVal, "keyval");
        this.data.add(connection$KeyVal);
        return this;
    }

    public Connection$Request followRedirects(boolean bl2) {
        this.followRedirects = bl2;
        return this;
    }

    public boolean followRedirects() {
        return this.followRedirects;
    }

    public Connection$Request ignoreContentType(boolean bl2) {
        this.ignoreContentType = bl2;
        return this;
    }

    public boolean ignoreContentType() {
        return this.ignoreContentType;
    }

    public Connection$Request ignoreHttpErrors(boolean bl2) {
        this.ignoreHttpErrors = bl2;
        return this;
    }

    public boolean ignoreHttpErrors() {
        return this.ignoreHttpErrors;
    }

    public int maxBodySize() {
        return this.maxBodySizeBytes;
    }

    public Connection$Request maxBodySize(int n3) {
        boolean bl2 = n3 >= 0;
        Validate.isTrue(bl2, "maxSize must be 0 (unlimited) or larger");
        this.maxBodySizeBytes = n3;
        return this;
    }

    public HttpConnection$Request parser(Parser parser) {
        this.parser = parser;
        this.parserDefined = true;
        return this;
    }

    public Parser parser() {
        return this.parser;
    }

    public String postDataCharset() {
        return this.postDataCharset;
    }

    public Connection$Request postDataCharset(String string2) {
        Object object = "charset";
        Validate.notNullParam(string2, (String)object);
        boolean bl2 = Charset.isSupported(string2);
        if (bl2) {
            this.postDataCharset = string2;
            return this;
        }
        object = new IllegalCharsetNameException(string2);
        throw object;
    }

    public Proxy proxy() {
        return this.proxy;
    }

    public HttpConnection$Request proxy(String object, int n3) {
        Proxy proxy;
        Proxy.Type type2 = Proxy.Type.HTTP;
        object = InetSocketAddress.createUnresolved((String)object, n3);
        this.proxy = proxy = new Proxy(type2, (SocketAddress)object);
        return this;
    }

    public HttpConnection$Request proxy(Proxy proxy) {
        this.proxy = proxy;
        return this;
    }

    public String requestBody() {
        return this.body;
    }

    public Connection$Request requestBody(String string2) {
        this.body = string2;
        return this;
    }

    public SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public void sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public int timeout() {
        return this.timeoutMilliseconds;
    }

    public HttpConnection$Request timeout(int n3) {
        boolean bl2 = n3 >= 0;
        Validate.isTrue(bl2, "Timeout milliseconds must be 0 (infinite) or greater");
        this.timeoutMilliseconds = n3;
        return this;
    }
}


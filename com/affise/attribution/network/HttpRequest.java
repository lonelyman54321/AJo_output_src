/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.network;

import com.affise.attribution.network.HttpClient$Method;
import java.net.URL;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class HttpRequest {
    private final String body;
    private final Map headers;
    private final HttpClient$Method method;
    private final URL url;

    public HttpRequest(URL uRL, HttpClient$Method httpClient$Method, Map map2, String string2) {
        Intrinsics.checkNotNullParameter(uRL, "url");
        Intrinsics.checkNotNullParameter((Object)httpClient$Method, "method");
        Intrinsics.checkNotNullParameter(map2, "headers");
        this.url = uRL;
        this.method = httpClient$Method;
        this.headers = map2;
        this.body = string2;
    }

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, URL uRL, HttpClient$Method httpClient$Method, Map map2, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            uRL = httpRequest.url;
        }
        if ((n4 = n3 & 2) != 0) {
            httpClient$Method = httpRequest.method;
        }
        if ((n4 = n3 & 4) != 0) {
            map2 = httpRequest.headers;
        }
        if ((n3 &= 8) != 0) {
            string2 = httpRequest.body;
        }
        return httpRequest.copy(uRL, httpClient$Method, map2, string2);
    }

    public final URL component1() {
        return this.url;
    }

    public final HttpClient$Method component2() {
        return this.method;
    }

    public final Map component3() {
        return this.headers;
    }

    public final String component4() {
        return this.body;
    }

    public final HttpRequest copy(URL uRL, HttpClient$Method httpClient$Method, Map map2, String string2) {
        Intrinsics.checkNotNullParameter(uRL, "url");
        Intrinsics.checkNotNullParameter((Object)httpClient$Method, "method");
        Intrinsics.checkNotNullParameter(map2, "headers");
        HttpRequest httpRequest = new HttpRequest(uRL, httpClient$Method, map2, string2);
        return httpRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof HttpRequest;
        if (!bl3) {
            return false;
        }
        object = (HttpRequest)object;
        Object object2 = this.url;
        Object object3 = ((HttpRequest)object).url;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.method;
        object3 = ((HttpRequest)object).method;
        if (object2 != object3) {
            return false;
        }
        object2 = this.headers;
        object3 = ((HttpRequest)object).headers;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.body;
        object = ((HttpRequest)object).body;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBody() {
        return this.body;
    }

    public final Map getHeaders() {
        return this.headers;
    }

    public final HttpClient$Method getMethod() {
        return this.method;
    }

    public final URL getUrl() {
        return this.url;
    }

    public int hashCode() {
        int n3 = this.url.hashCode() * 31;
        int n4 = (((Object)((Object)this.method)).hashCode() + n3) * 31;
        Map map2 = this.headers;
        n3 = (((Object)map2).hashCode() + n4) * 31;
        String string2 = this.body;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("HttpRequest(url=");
        Object object = this.url;
        stringBuilder.append(object);
        stringBuilder.append(", method=");
        object = this.method;
        stringBuilder.append(object);
        stringBuilder.append(", headers=");
        object = this.headers;
        stringBuilder.append(object);
        stringBuilder.append(", body=");
        object = this.body;
        return ui0_1.a(stringBuilder, (String)object, ')');
    }
}


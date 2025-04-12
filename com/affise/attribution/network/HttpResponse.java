/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.network;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class HttpResponse {
    private final String body;
    private final int code;
    private final Map headers;
    private final String message;

    public HttpResponse(int n3, String string2, String string3, Map map2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        Intrinsics.checkNotNullParameter(map2, "headers");
        this.code = n3;
        this.message = string2;
        this.body = string3;
        this.headers = map2;
    }

    public /* synthetic */ HttpResponse(int n3, String string2, String string3, Map map2, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 4;
        if (n7 != 0) {
            string3 = null;
        }
        if ((n4 &= 8) != 0) {
            map2 = fh1_2.f();
        }
        this(n3, string2, string3, map2);
    }

    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, int n3, String string2, String string3, Map map2, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = httpResponse.code;
        }
        if ((n7 = n4 & 2) != 0) {
            string2 = httpResponse.message;
        }
        if ((n7 = n4 & 4) != 0) {
            string3 = httpResponse.body;
        }
        if ((n4 &= 8) != 0) {
            map2 = httpResponse.headers;
        }
        return httpResponse.copy(n3, string2, string3, map2);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.body;
    }

    public final Map component4() {
        return this.headers;
    }

    public final HttpResponse copy(int n3, String string2, String string3, Map map2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        Intrinsics.checkNotNullParameter(map2, "headers");
        HttpResponse httpResponse = new HttpResponse(n3, string2, string3, map2);
        return httpResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof HttpResponse;
        if (n3 == 0) {
            return false;
        }
        object = (HttpResponse)object;
        n3 = this.code;
        int n4 = ((HttpResponse)object).code;
        if (n3 != n4) {
            return false;
        }
        Object object2 = this.message;
        String string2 = ((HttpResponse)object).message;
        n3 = (int)(Intrinsics.areEqual(object2, string2) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.body;
        string2 = ((HttpResponse)object).body;
        n3 = (int)(Intrinsics.areEqual(object2, string2) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.headers;
        object = ((HttpResponse)object).headers;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getBody() {
        return this.body;
    }

    public final int getCode() {
        return this.code;
    }

    public final Map getHeaders() {
        return this.headers;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int n3;
        int n4 = this.code;
        int n7 = 31;
        n4 *= 31;
        String string2 = this.message;
        n4 = zy_2.b(n4, n7, string2);
        string2 = this.body;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        return ((Object)this.headers).hashCode() + n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("HttpResponse(code=");
        int n3 = this.code;
        stringBuilder.append(n3);
        stringBuilder.append(", message=");
        Object object = this.message;
        stringBuilder.append((String)object);
        stringBuilder.append(", body=");
        object = this.body;
        stringBuilder.append((String)object);
        stringBuilder.append(", headers=");
        object = this.headers;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.facebook;

import com.facebook.AuthenticationToken;
import com.facebook.AuthenticationTokenManager$a;
import kotlin.jvm.internal.Intrinsics;

public final class AuthenticationTokenManager {
    public static final AuthenticationTokenManager$a d;
    public static AuthenticationTokenManager e;
    public final Xv1 a;
    public final sr_1 b;
    public AuthenticationToken c;

    static {
        AuthenticationTokenManager$a authenticationTokenManager$a;
        d = authenticationTokenManager$a = new Object();
    }

    public AuthenticationTokenManager(Xv1 xv1, sr_1 sr_12) {
        Intrinsics.checkNotNullParameter(xv1, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(sr_12, "authenticationTokenCache");
        this.a = xv1;
        this.b = sr_12;
    }
}


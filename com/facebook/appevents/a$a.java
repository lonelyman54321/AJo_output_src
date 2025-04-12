/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.appevents;

import com.facebook.appevents.a;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class a$a
implements Serializable {
    private static final long serialVersionUID = -2488473066578201069L;
    public final String a;
    public final String b;

    public a$a(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string3, "appId");
        this.a = string2;
        this.b = string3;
    }

    private final Object readResolve() {
        String string2 = this.a;
        String string3 = this.b;
        a a2 = new a(string2, string3);
        return a2;
    }
}


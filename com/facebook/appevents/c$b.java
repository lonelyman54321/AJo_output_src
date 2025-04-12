/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.appevents;

import com.facebook.appevents.c;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class c$b
implements Serializable {
    private static final long serialVersionUID = 20160803001L;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public c$b(String string2, boolean bl2, String string3, String string4, boolean bl3) {
        Intrinsics.checkNotNullParameter(string2, "jsonString");
        Intrinsics.checkNotNullParameter(string3, "operationalJsonString");
        this.a = string2;
        this.b = string3;
        this.c = bl2;
        this.d = bl3;
        this.e = string4;
    }

    private final Object readResolve() {
        boolean bl2 = this.c;
        boolean bl3 = this.d;
        String string2 = this.a;
        String string3 = this.b;
        String string4 = this.e;
        c c2 = new c(string2, bl2, string3, string4, bl3);
        return c2;
    }
}


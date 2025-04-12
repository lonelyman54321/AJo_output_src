/*
 * Decompiled with CFR 0.152.
 */
package com.facebook;

import kotlin.jvm.internal.Intrinsics;

public final class j$a {
    public final boolean a;
    public final String b;
    public Boolean c;
    public long d;

    public j$a(boolean bl2, String string2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        this.a = bl2;
        this.b = string2;
    }

    public final boolean a() {
        Boolean bl2 = this.c;
        boolean bl3 = bl2 != null ? bl2 : this.a;
        return bl3;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.jpl.crasdk;

import com.jpl.crasdk.a;
import kotlin.jvm.internal.Intrinsics;

public final class a$a {
    public static a a() {
        a a2 = a.c;
        if (a2 == null) {
            String string2;
            a2 = new Object();
            a2.b = string2 = "";
            a.c = a2;
        }
        a2 = a.c;
        Intrinsics.checkNotNull(a2);
        return a2;
    }
}


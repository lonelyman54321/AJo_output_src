/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.login;

import com.facebook.login.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class j$b {
    public static boolean b(String string2) {
        boolean bl2;
        Object object;
        boolean bl3;
        boolean bl4 = false;
        if (string2 != null && ((bl3 = b.s(string2, (String)(object = "publish"), false)) || (bl3 = b.s(string2, (String)(object = "manage"), false)) || (bl2 = (object = j.k).contains(string2)))) {
            bl4 = true;
        }
        return bl4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final j a() {
        Object object = j.l;
        if (object == null) {
            synchronized (this) {
                object = new j();
                j.l = object;
                object = Unit.a;
            }
        }
        if ((object = j.l) != null) return object;
        Intrinsics.throwUninitializedPropertyAccessException("instance");
        return null;
    }
}


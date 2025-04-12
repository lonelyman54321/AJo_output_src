/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

public final class zzgek {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object object, long l2, Object object2, Object object3) {
        Object object4;
        do {
            boolean bl2;
            if (!(bl2 = ok3_1.a(unsafe, object, l2, object2, object3))) continue;
            return true;
        } while ((object4 = unsafe.getObject(object, l2)) == object2);
        return false;
    }
}


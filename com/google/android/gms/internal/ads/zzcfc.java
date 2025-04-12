/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzasn;
import com.google.android.gms.internal.ads.zzasr;
import com.google.android.gms.internal.ads.zzast;
import com.google.android.gms.internal.ads.zzasu;
import com.google.android.gms.internal.ads.zzasv;

final class zzcfc
extends zzasn {
    static final zzcfc zzb;

    static {
        zzcfc zzcfc2;
        zzb = zzcfc2 = new zzcfc();
    }

    public final zzasr zza(String object, byte[] object2, String string2) {
        object2 = "moov";
        boolean bl2 = ((String)object2).equals(object);
        if (bl2) {
            object = new zzast();
            return object;
        }
        object2 = "mvhd";
        bl2 = ((String)object2).equals(object);
        if (bl2) {
            object = new zzasu();
            return object;
        }
        object2 = new zzasv((String)object);
        return object2;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.Method;

public final class zzaze
extends zzazs {
    public zzaze(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4) {
        super(zzaye2, "I0TLK4/NNf4PWI9wQGA/sSwUTUIPgbxkHrNqtFLC41yDeZSimeJq/+llE4fAA31b", "eUrWQVF8FAlcOLX3Auj55rxdEWjF+0P5JAPLCHVKKQw=", zzatp2, n3, 12);
    }

    public final void zza() {
        this.zze.zzF(-1);
        Method method = this.zzf;
        Context context = this.zzb.zzb();
        Object[] objectArray = new Object[]{context};
        long l2 = (Long)method.invoke(null, objectArray);
        this.zze.zzF(l2);
    }
}


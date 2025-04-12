/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.gms.internal.ads.zzfvw;
import com.google.android.gms.internal.ads.zzfwo;
import com.google.android.gms.internal.ads.zzfwp;

final class zzfvu
extends zzfwo {
    private IBinder zza;
    private String zzb;
    private int zzc;
    private float zzd;
    private int zze;
    private String zzf;
    private byte zzg;

    public final zzfwo zza(String string2) {
        this.zzf = string2;
        return this;
    }

    public final zzfwo zzb(String string2) {
        this.zzb = string2;
        return this;
    }

    public final zzfwo zzc(int n3) {
        n3 = (byte)(this.zzg | 4);
        this.zzg = (byte)n3;
        return this;
    }

    public final zzfwo zzd(int n3) {
        this.zzc = n3;
        n3 = (byte)(this.zzg | 1);
        this.zzg = (byte)n3;
        return this;
    }

    public final zzfwo zze(float f5) {
        byte by2;
        this.zzd = f5;
        this.zzg = by2 = (byte)(this.zzg | 2);
        return this;
    }

    public final zzfwo zzf(int n3) {
        n3 = (byte)(this.zzg | 8);
        this.zzg = (byte)n3;
        return this;
    }

    public final zzfwo zzg(IBinder object) {
        if (object != null) {
            this.zza = object;
            return this;
        }
        object = new NullPointerException("Null windowToken");
        throw object;
    }

    public final zzfwo zzh(int n3) {
        this.zze = n3;
        n3 = (byte)(this.zzg | 0x10);
        this.zzg = (byte)n3;
        return this;
    }

    public final zzfwp zzi() {
        IBinder iBinder;
        int n3 = this.zzg;
        int n4 = 31;
        if (n3 == n4 && (iBinder = this.zza) != null) {
            String string2 = this.zzb;
            int n7 = this.zzc;
            float f5 = this.zzd;
            int n8 = this.zze;
            String string3 = this.zzf;
            zzfvw zzfvw2 = new zzfvw(iBinder, string2, n7, f5, 0, 0, null, n8, null, string3, null, null);
            return zzfvw2;
        }
        CharSequence charSequence = new StringBuilder();
        Object object = this.zza;
        if (object == null) {
            object = " windowToken";
            charSequence.append((String)object);
        }
        if ((n4 = this.zzg & 1) == 0) {
            object = " layoutGravity";
            charSequence.append((String)object);
        }
        if ((n4 = this.zzg & 2) == 0) {
            object = " layoutVerticalMargin";
            charSequence.append((String)object);
        }
        if ((n4 = this.zzg & 4) == 0) {
            object = " displayMode";
            charSequence.append((String)object);
        }
        if ((n4 = this.zzg & 8) == 0) {
            object = " triggerMode";
            charSequence.append((String)object);
        }
        if ((n4 = this.zzg & 0x10) == 0) {
            object = " windowWidthPx";
            charSequence.append((String)object);
        }
        charSequence = ((Object)charSequence).toString();
        charSequence = "Missing required properties:".concat((String)charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }
}


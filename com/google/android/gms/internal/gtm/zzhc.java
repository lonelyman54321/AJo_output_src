/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.gtm;

import android.os.Parcel;
import com.google.android.gms.internal.gtm.zzas;
import com.google.android.gms.internal.gtm.zzat;
import com.google.android.gms.internal.gtm.zzhd;

public abstract class zzhc
extends zzas
implements zzhd {
    public zzhc() {
        super("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            n3 = (int)(zzat.zzf(parcel) ? 1 : 0);
            String string2 = parcel.readString();
            zzat.zzc(parcel);
            this.zze(n3 != 0, string2);
            return n7;
        }
        return false;
    }
}


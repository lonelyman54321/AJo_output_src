/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbwq;

public abstract class zzbwp
extends zzbae
implements zzbwq {
    public zzbwp() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            this.zzb();
            parcel2.writeNoException();
            return n7;
        }
        return false;
    }
}


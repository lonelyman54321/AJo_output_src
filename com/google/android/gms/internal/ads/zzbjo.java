/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbjp;

public abstract class zzbjo
extends zzbae
implements zzbjp {
    public zzbjo() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                return false;
            }
            this.zze();
        } else {
            String string2 = parcel.readString();
            zzbaf.zzc(parcel);
            this.zzf(string2);
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}


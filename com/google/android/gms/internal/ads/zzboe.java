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
import com.google.android.gms.internal.ads.zzbof;

public abstract class zzboe
extends zzbae
implements zzbof {
    public zzboe() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                return false;
            }
            parcel.readInt();
            zzbaf.zzc(parcel);
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}


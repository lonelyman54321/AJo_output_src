/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbyh;

public abstract class zzbyg
extends zzbae
implements zzbyh {
    public zzbyg() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 != n7) {
            n4 = 2;
            if (n3 != n4) {
                return false;
            }
            n3 = this.zzb();
            parcel2.writeNoException();
            parcel2.writeInt(n3);
        } else {
            String string2 = this.zzc();
            parcel2.writeNoException();
            parcel2.writeString(string2);
        }
        return n7;
    }
}


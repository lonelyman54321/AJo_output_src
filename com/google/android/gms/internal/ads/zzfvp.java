/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzfvq;

public abstract class zzfvp
extends zzbae
implements zzfvq {
    public zzfvp() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            Parcelable.Creator creator = Bundle.CREATOR;
            creator = (Bundle)zzbaf.zza(parcel, creator);
            zzbaf.zzc(parcel);
            this.zzb((Bundle)creator);
            return n7;
        }
        return false;
    }
}


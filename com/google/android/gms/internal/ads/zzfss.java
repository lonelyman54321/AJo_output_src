/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzaus;
import com.google.android.gms.internal.ads.zzfst;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhcd;

public final class zzfss
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    private zzaus zzb;
    private byte[] zzc;

    static {
        zzfst zzfst2 = new zzfst();
        CREATOR = zzfst2;
    }

    public zzfss(int n3, byte[] byArray) {
        this.zza = n3;
        this.zzb = null;
        this.zzc = byArray;
        this.zzb();
    }

    private final void zzb() {
        byte[] byArray;
        Object object = this.zzb;
        if (object == null && (byArray = this.zzc) != null || object != null && (byArray = this.zzc) == null) {
            return;
        }
        if (object != null && (byArray = this.zzc) != null) {
            object = new IllegalStateException("Invalid internal representation - full");
            throw object;
        }
        if (object == null && (object = (Object)this.zzc) == null) {
            object = new IllegalStateException("Invalid internal representation - empty");
            throw object;
        }
        object = new IllegalStateException("Impossible");
        throw object;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int n7 = 1;
        SafeParcelWriter.writeInt(parcel, n7, n3);
        byte[] byArray = this.zzc;
        if (byArray == null) {
            byArray = this.zzb.zzaV();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, byArray, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    /*
     * WARNING - void declaration
     */
    public final zzaus zza() {
        block8: {
            Object object = this.zzb;
            if (object == null) {
                void var1_4;
                object = this.zzc;
                Object object2 = zzhay.zza();
                object = zzaus.zzf((byte[])object, (zzhay)object2);
                this.zzb = object;
                object = null;
                try {
                    this.zzc = null;
                    break block8;
                }
                catch (NullPointerException nullPointerException) {
                }
                catch (zzhcd zzhcd2) {
                    // empty catch block
                }
                object2 = new IllegalStateException((Throwable)var1_4);
                throw object2;
            }
        }
        this.zzb();
        return this.zzb;
    }
}


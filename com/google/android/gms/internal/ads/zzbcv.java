/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.ParcelFileDescriptor
 *  android.os.ParcelFileDescriptor$AutoCloseInputStream
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbcw;
import java.io.InputStream;

public final class zzbcv
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private ParcelFileDescriptor zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    static {
        zzbcw zzbcw2 = new zzbcw();
        CREATOR = zzbcw2;
    }

    public zzbcv() {
        this(null, false, false, 0L, false);
    }

    public zzbcv(ParcelFileDescriptor parcelFileDescriptor, boolean bl2, boolean bl3, long l2, boolean bl4) {
        this.zza = parcelFileDescriptor;
        this.zzb = bl2;
        this.zzc = bl3;
        this.zzd = l2;
        this.zze = bl4;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        ParcelFileDescriptor parcelFileDescriptor = this.zzb();
        SafeParcelWriter.writeParcelable(parcel, 2, (Parcelable)parcelFileDescriptor, n3, false);
        boolean bl2 = this.zzd();
        SafeParcelWriter.writeBoolean(parcel, 3, bl2);
        bl2 = this.zzf();
        SafeParcelWriter.writeBoolean(parcel, 4, bl2);
        long l2 = this.zza();
        SafeParcelWriter.writeLong(parcel, 5, l2);
        bl2 = this.zzg();
        SafeParcelWriter.writeBoolean(parcel, 6, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zza() {
        synchronized (this) {
            return this.zzd;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ParcelFileDescriptor zzb() {
        synchronized (this) {
            return this.zza;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final InputStream zzc() {
        synchronized (this) {
            ParcelFileDescriptor parcelFileDescriptor = this.zza;
            if (parcelFileDescriptor == null) {
                return null;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = this.zza;
            parcelFileDescriptor = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor2);
            this.zza = null;
            return parcelFileDescriptor;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzd() {
        synchronized (this) {
            return this.zzb;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zze() {
        synchronized (this) {
            ParcelFileDescriptor parcelFileDescriptor = this.zza;
            return parcelFileDescriptor != null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzf() {
        synchronized (this) {
            return this.zzc;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzg() {
        synchronized (this) {
            return this.zze;
        }
    }
}


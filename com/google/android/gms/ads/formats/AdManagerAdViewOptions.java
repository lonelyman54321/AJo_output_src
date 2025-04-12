/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions$Builder;
import com.google.android.gms.ads.formats.zzb;
import com.google.android.gms.ads.formats.zzc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbjm;

public final class AdManagerAdViewOptions
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean zza;
    private final IBinder zzb;

    static {
        zzc zzc2 = new zzc();
        CREATOR = zzc2;
    }

    public /* synthetic */ AdManagerAdViewOptions(AdManagerAdViewOptions$Builder adManagerAdViewOptions$Builder, zzb zzb2) {
        boolean bl2;
        this.zza = bl2 = AdManagerAdViewOptions$Builder.zza(adManagerAdViewOptions$Builder);
        this.zzb = null;
    }

    public AdManagerAdViewOptions(boolean bl2, IBinder iBinder) {
        this.zza = bl2;
        this.zzb = iBinder;
    }

    public boolean getManualImpressionsEnabled() {
        return this.zza;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        boolean bl2 = this.getManualImpressionsEnabled();
        SafeParcelWriter.writeBoolean(parcel, 1, bl2);
        IBinder iBinder = this.zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, iBinder, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public final zzbjm zza() {
        IBinder iBinder = this.zzb;
        if (iBinder == null) {
            return null;
        }
        return zzbjl.zzb(iBinder);
    }
}


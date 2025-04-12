/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzd;
import com.google.android.gms.fido.fido2.api.common.zzs;
import com.google.android.gms.fido.fido2.api.common.zzu;
import com.google.android.gms.fido.fido2.api.common.zzz;

public class AuthenticationExtensions
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final FidoAppIdExtension zza;
    private final zzs zzb;
    private final UserVerificationMethodExtension zzc;
    private final zzz zzd;
    private final zzab zze;
    private final zzad zzf;
    private final zzu zzg;
    private final zzag zzh;
    private final GoogleThirdPartyPaymentExtension zzi;
    private final zzai zzj;

    static {
        zzd zzd2 = new zzd();
        CREATOR = zzd2;
    }

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzs2, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzz2, zzab zzab2, zzad zzad2, zzu zzu2, zzag zzag2, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzai zzai2) {
        this.zza = fidoAppIdExtension;
        this.zzc = userVerificationMethodExtension;
        this.zzb = zzs2;
        this.zzd = zzz2;
        this.zze = zzab2;
        this.zzf = zzad2;
        this.zzg = zzu2;
        this.zzh = zzag2;
        this.zzi = googleThirdPartyPaymentExtension;
        this.zzj = zzai2;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof AuthenticationExtensions;
        if (!bl3) {
            return false;
        }
        object = (AuthenticationExtensions)object;
        AbstractSafeParcelable abstractSafeParcelable = this.zza;
        AbstractSafeParcelable abstractSafeParcelable2 = ((AuthenticationExtensions)object).zza;
        bl3 = Objects.equal(abstractSafeParcelable, abstractSafeParcelable2);
        return bl3 && (bl3 = Objects.equal(abstractSafeParcelable = this.zzb, abstractSafeParcelable2 = ((AuthenticationExtensions)object).zzb)) && (bl3 = Objects.equal(abstractSafeParcelable = this.zzc, abstractSafeParcelable2 = ((AuthenticationExtensions)object).zzc)) && (bl3 = Objects.equal(abstractSafeParcelable = this.zzd, abstractSafeParcelable2 = ((AuthenticationExtensions)object).zzd)) && (bl3 = Objects.equal(abstractSafeParcelable = this.zze, abstractSafeParcelable2 = ((AuthenticationExtensions)object).zze)) && (bl3 = Objects.equal(abstractSafeParcelable = this.zzf, abstractSafeParcelable2 = ((AuthenticationExtensions)object).zzf)) && (bl3 = Objects.equal(abstractSafeParcelable = this.zzg, abstractSafeParcelable2 = ((AuthenticationExtensions)object).zzg)) && (bl3 = Objects.equal(abstractSafeParcelable = this.zzh, abstractSafeParcelable2 = ((AuthenticationExtensions)object).zzh)) && (bl3 = Objects.equal(abstractSafeParcelable = this.zzi, abstractSafeParcelable2 = ((AuthenticationExtensions)object).zzi)) && (bl2 = Objects.equal(abstractSafeParcelable = this.zzj, object = ((AuthenticationExtensions)object).zzj));
    }

    public FidoAppIdExtension getFidoAppIdExtension() {
        return this.zza;
    }

    public UserVerificationMethodExtension getUserVerificationMethodExtension() {
        return this.zzc;
    }

    public int hashCode() {
        FidoAppIdExtension fidoAppIdExtension = this.zza;
        zzs zzs2 = this.zzb;
        UserVerificationMethodExtension userVerificationMethodExtension = this.zzc;
        zzz zzz2 = this.zzd;
        zzab zzab2 = this.zze;
        zzad zzad2 = this.zzf;
        zzu zzu2 = this.zzg;
        zzag zzag2 = this.zzh;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = this.zzi;
        zzai zzai2 = this.zzj;
        Object[] objectArray = new Object[]{fidoAppIdExtension, zzs2, userVerificationMethodExtension, zzz2, zzab2, zzad2, zzu2, zzag2, googleThirdPartyPaymentExtension, zzai2};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        FidoAppIdExtension fidoAppIdExtension = this.getFidoAppIdExtension();
        SafeParcelWriter.writeParcelable(parcel, 2, fidoAppIdExtension, n3, false);
        AbstractSafeParcelable abstractSafeParcelable = this.zzb;
        SafeParcelWriter.writeParcelable(parcel, 3, abstractSafeParcelable, n3, false);
        abstractSafeParcelable = this.getUserVerificationMethodExtension();
        SafeParcelWriter.writeParcelable(parcel, 4, abstractSafeParcelable, n3, false);
        abstractSafeParcelable = this.zzd;
        SafeParcelWriter.writeParcelable(parcel, 5, abstractSafeParcelable, n3, false);
        abstractSafeParcelable = this.zze;
        SafeParcelWriter.writeParcelable(parcel, 6, abstractSafeParcelable, n3, false);
        abstractSafeParcelable = this.zzf;
        SafeParcelWriter.writeParcelable(parcel, 7, abstractSafeParcelable, n3, false);
        abstractSafeParcelable = this.zzg;
        SafeParcelWriter.writeParcelable(parcel, 8, abstractSafeParcelable, n3, false);
        abstractSafeParcelable = this.zzh;
        SafeParcelWriter.writeParcelable(parcel, 9, abstractSafeParcelable, n3, false);
        abstractSafeParcelable = this.zzi;
        SafeParcelWriter.writeParcelable(parcel, 10, abstractSafeParcelable, n3, false);
        abstractSafeParcelable = this.zzj;
        SafeParcelWriter.writeParcelable(parcel, 11, abstractSafeParcelable, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final zzs zza() {
        return this.zzb;
    }

    public final zzu zzb() {
        return this.zzg;
    }

    public final zzz zzc() {
        return this.zzd;
    }

    public final zzab zzd() {
        return this.zze;
    }

    public final zzad zze() {
        return this.zzf;
    }

    public final GoogleThirdPartyPaymentExtension zzf() {
        return this.zzi;
    }

    public final zzag zzg() {
        return this.zzh;
    }

    public final zzai zzh() {
        return this.zzj;
    }
}


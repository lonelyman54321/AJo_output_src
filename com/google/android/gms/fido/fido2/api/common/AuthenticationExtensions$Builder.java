/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2.api.common;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzs;
import com.google.android.gms.fido.fido2.api.common.zzu;
import com.google.android.gms.fido.fido2.api.common.zzz;

public final class AuthenticationExtensions$Builder {
    private FidoAppIdExtension zza;
    private UserVerificationMethodExtension zzb;
    private zzs zzc;
    private zzz zzd;
    private zzab zze;
    private zzad zzf;
    private zzu zzg;
    private zzag zzh;
    private GoogleThirdPartyPaymentExtension zzi;
    private zzai zzj;

    public AuthenticationExtensions$Builder() {
    }

    public AuthenticationExtensions$Builder(AuthenticationExtensions abstractSafeParcelable) {
        if (abstractSafeParcelable != null) {
            AbstractSafeParcelable abstractSafeParcelable2;
            this.zza = abstractSafeParcelable2 = abstractSafeParcelable.getFidoAppIdExtension();
            abstractSafeParcelable2 = abstractSafeParcelable.getUserVerificationMethodExtension();
            this.zzb = abstractSafeParcelable2;
            abstractSafeParcelable2 = abstractSafeParcelable.zza();
            this.zzc = abstractSafeParcelable2;
            abstractSafeParcelable2 = abstractSafeParcelable.zzc();
            this.zzd = abstractSafeParcelable2;
            abstractSafeParcelable2 = abstractSafeParcelable.zzd();
            this.zze = abstractSafeParcelable2;
            abstractSafeParcelable2 = abstractSafeParcelable.zze();
            this.zzf = abstractSafeParcelable2;
            abstractSafeParcelable2 = abstractSafeParcelable.zzb();
            this.zzg = abstractSafeParcelable2;
            abstractSafeParcelable2 = abstractSafeParcelable.zzg();
            this.zzh = abstractSafeParcelable2;
            abstractSafeParcelable2 = abstractSafeParcelable.zzf();
            this.zzi = abstractSafeParcelable2;
            abstractSafeParcelable = abstractSafeParcelable.zzh();
            this.zzj = abstractSafeParcelable;
        }
    }

    public AuthenticationExtensions build() {
        FidoAppIdExtension fidoAppIdExtension = this.zza;
        zzs zzs2 = this.zzc;
        UserVerificationMethodExtension userVerificationMethodExtension = this.zzb;
        zzz zzz2 = this.zzd;
        zzab zzab2 = this.zze;
        zzad zzad2 = this.zzf;
        zzu zzu2 = this.zzg;
        zzag zzag2 = this.zzh;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = this.zzi;
        zzai zzai2 = this.zzj;
        AuthenticationExtensions authenticationExtensions = new AuthenticationExtensions(fidoAppIdExtension, zzs2, userVerificationMethodExtension, zzz2, zzab2, zzad2, zzu2, zzag2, googleThirdPartyPaymentExtension, zzai2);
        return authenticationExtensions;
    }

    public AuthenticationExtensions$Builder setFido2Extension(FidoAppIdExtension fidoAppIdExtension) {
        this.zza = fidoAppIdExtension;
        return this;
    }

    public AuthenticationExtensions$Builder setGoogleThirdPartyPaymentExtension(GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
        this.zzi = googleThirdPartyPaymentExtension;
        return this;
    }

    public AuthenticationExtensions$Builder setUserVerificationMethodExtension(UserVerificationMethodExtension userVerificationMethodExtension) {
        this.zzb = userVerificationMethodExtension;
        return this;
    }
}


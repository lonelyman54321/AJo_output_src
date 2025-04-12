/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import com.google.android.gms.internal.consent_sdk.zzap;
import com.google.android.gms.internal.consent_sdk.zzbn;
import com.google.android.gms.internal.consent_sdk.zzh;
import com.google.android.gms.internal.consent_sdk.zzi;
import com.google.android.gms.internal.consent_sdk.zzu;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentInformation$OnConsentInfoUpdateFailureListener;
import com.google.android.ump.ConsentInformation$OnConsentInfoUpdateSuccessListener;
import com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.ConsentRequestParameters$Builder;

public final class zzj
implements ConsentInformation {
    private final zzap zza;
    private final zzu zzb;
    private final zzbn zzc;
    private final Object zzd;
    private final Object zze;
    private boolean zzf;
    private boolean zzg;
    private ConsentRequestParameters zzh;

    public zzj(zzap zzap2, zzu zzu2, zzbn zzbn2) {
        Object object;
        this.zzd = object = new Object();
        this.zze = object = new Object();
        this.zzf = false;
        this.zzg = false;
        object = new ConsentRequestParameters$Builder();
        this.zzh = object = ((ConsentRequestParameters$Builder)object).build();
        this.zza = zzap2;
        this.zzb = zzu2;
        this.zzc = zzbn2;
    }

    public final boolean canRequestAds() {
        int n3;
        int n4 = this.zzc();
        if (n4 == 0) {
            n4 = 0;
            Object var2_2 = null;
        } else {
            zzap zzap2 = this.zza;
            n4 = zzap2.zza();
        }
        int n7 = 1;
        if (n4 != n7 && n4 != (n3 = 3)) {
            return false;
        }
        return n7 != 0;
    }

    public final int getConsentStatus() {
        boolean bl2 = this.zzc();
        if (!bl2) {
            return 0;
        }
        return this.zza.zza();
    }

    public final ConsentInformation$PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus() {
        boolean bl2 = this.zzc();
        if (!bl2) {
            return ConsentInformation$PrivacyOptionsRequirementStatus.UNKNOWN;
        }
        return this.zza.zzb();
    }

    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void requestConsentInfoUpdate(Activity activity, ConsentRequestParameters consentRequestParameters, ConsentInformation$OnConsentInfoUpdateSuccessListener consentInformation$OnConsentInfoUpdateSuccessListener, ConsentInformation$OnConsentInfoUpdateFailureListener consentInformation$OnConsentInfoUpdateFailureListener) {
        Object object = this.zzd;
        synchronized (object) {
            boolean bl2;
            this.zzf = bl2 = true;
        }
        this.zzh = consentRequestParameters;
        this.zzb.zzc(activity, consentRequestParameters, consentInformation$OnConsentInfoUpdateSuccessListener, consentInformation$OnConsentInfoUpdateFailureListener);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void reset() {
        this.zzc.zzd(null);
        this.zza.zze();
        Object object = this.zzd;
        synchronized (object) {
            Object var2_2 = null;
            this.zzf = false;
            return;
        }
    }

    public final void zza(Activity activity) {
        boolean bl2 = this.zzc();
        if (bl2 && !(bl2 = this.zzd())) {
            this.zzb(true);
            zzu zzu2 = this.zzb;
            ConsentRequestParameters consentRequestParameters = this.zzh;
            zzh zzh2 = new zzh(this);
            zzi zzi2 = new zzi(this);
            zzu2.zzc(activity, consentRequestParameters, zzh2, zzi2);
            return;
        }
        this.zzc();
        this.zzd();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(boolean bl2) {
        Object object = this.zze;
        synchronized (object) {
            this.zzg = bl2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzc() {
        Object object = this.zzd;
        synchronized (object) {
            return this.zzf;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzd() {
        Object object = this.zze;
        synchronized (object) {
            return this.zzg;
        }
    }
}


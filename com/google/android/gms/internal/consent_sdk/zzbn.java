/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzbb;
import com.google.android.gms.internal.consent_sdk.zzbd;
import com.google.android.gms.internal.consent_sdk.zzbe;
import com.google.android.gms.internal.consent_sdk.zzbf;
import com.google.android.gms.internal.consent_sdk.zzbg;
import com.google.android.gms.internal.consent_sdk.zzbh;
import com.google.android.gms.internal.consent_sdk.zzbi;
import com.google.android.gms.internal.consent_sdk.zzbj;
import com.google.android.gms.internal.consent_sdk.zzbk;
import com.google.android.gms.internal.consent_sdk.zzbp;
import com.google.android.gms.internal.consent_sdk.zzcr;
import com.google.android.gms.internal.consent_sdk.zzdr;
import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentForm$OnConsentFormDismissedListener;
import com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadFailureListener;
import com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadSuccessListener;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbn {
    private final zzdr zza;
    private final Executor zzb;
    private final AtomicReference zzc;
    private final AtomicReference zzd;

    public zzbn(zzdr zzdr2, Executor executor) {
        AtomicReference atomicReference;
        this.zzc = atomicReference = new AtomicReference();
        this.zzd = atomicReference = new AtomicReference();
        this.zza = zzdr2;
        this.zzb = executor;
    }

    public final /* synthetic */ void zza(zzbb zzbb2) {
        Object object = this.zzd;
        Objects.requireNonNull(object);
        zzbe zzbe2 = new zzbe((AtomicReference)object);
        object = zzbf.zza;
        zzbb2.zzb(zzbe2, (UserMessagingPlatform$OnConsentFormLoadFailureListener)object);
    }

    public final void zzb(UserMessagingPlatform$OnConsentFormLoadSuccessListener object, UserMessagingPlatform$OnConsentFormLoadFailureListener userMessagingPlatform$OnConsentFormLoadFailureListener) {
        zzcr.zza();
        zzbp zzbp2 = (zzbp)this.zzc.get();
        if (zzbp2 == null) {
            object = new zzg(3, "No available form can be built.");
            object = ((zzg)object).zza();
            userMessagingPlatform$OnConsentFormLoadFailureListener.onConsentFormLoadFailure((FormError)object);
            return;
        }
        Object object2 = this.zza.zza();
        object2.zza(zzbp2);
        object2.zzb().zza().zzb((UserMessagingPlatform$OnConsentFormLoadSuccessListener)object, userMessagingPlatform$OnConsentFormLoadFailureListener);
    }

    public final void zzc() {
        Object object = (zzbp)this.zzc.get();
        if (object == null) {
            return;
        }
        Object object2 = this.zza.zza();
        object2.zza((zzbp)object);
        object = object2.zzb().zza();
        ((zzbb)object).zza = true;
        object2 = zzcr.zza;
        zzbd zzbd2 = new zzbd(this, (zzbb)object);
        object2.post((Runnable)zzbd2);
    }

    public final void zzd(zzbp zzbp2) {
        this.zzc.set(zzbp2);
    }

    public final void zze(Activity object, ConsentForm$OnConsentFormDismissedListener object2) {
        Object object3;
        ConsentInformation$PrivacyOptionsRequirementStatus consentInformation$PrivacyOptionsRequirementStatus;
        zzcr.zza();
        Object object4 = com.google.android.gms.internal.consent_sdk.zza.zza((Context)object).zzb();
        if (object4 == null) {
            object = zzcr.zza;
            object4 = new zzbg((ConsentForm$OnConsentFormDismissedListener)object2);
            object.post((Runnable)object4);
            return;
        }
        boolean bl2 = ((zzj)object4).isConsentFormAvailable();
        if (!bl2 && (consentInformation$PrivacyOptionsRequirementStatus = ((zzj)object4).getPrivacyOptionsRequirementStatus()) != (object3 = ConsentInformation$PrivacyOptionsRequirementStatus.NOT_REQUIRED)) {
            consentInformation$PrivacyOptionsRequirementStatus = zzcr.zza;
            object3 = new zzbh((ConsentForm$OnConsentFormDismissedListener)object2);
            consentInformation$PrivacyOptionsRequirementStatus.post((Runnable)object3);
            ((zzj)object4).zza((Activity)object);
            return;
        }
        if ((object4 = ((zzj)object4).getPrivacyOptionsRequirementStatus()) == (consentInformation$PrivacyOptionsRequirementStatus = ConsentInformation$PrivacyOptionsRequirementStatus.NOT_REQUIRED)) {
            object = zzcr.zza;
            object4 = new zzbi((ConsentForm$OnConsentFormDismissedListener)object2);
            object.post((Runnable)object4);
            return;
        }
        object4 = (ConsentForm)this.zzd.get();
        if (object4 == null) {
            object = zzcr.zza;
            object4 = new zzbj((ConsentForm$OnConsentFormDismissedListener)object2);
            object.post((Runnable)object4);
            return;
        }
        object4.show((Activity)object, (ConsentForm$OnConsentFormDismissedListener)object2);
        object = this.zzb;
        object2 = new zzbk(this);
        object.execute((Runnable)object2);
    }

    public final boolean zzf() {
        Object v4 = this.zzc.get();
        return v4 != null;
    }
}


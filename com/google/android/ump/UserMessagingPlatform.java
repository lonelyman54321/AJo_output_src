/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.ump;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzbl;
import com.google.android.gms.internal.consent_sdk.zzbm;
import com.google.android.gms.internal.consent_sdk.zzbn;
import com.google.android.gms.internal.consent_sdk.zzcr;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.ump.ConsentForm$OnConsentFormDismissedListener;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadFailureListener;
import com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadSuccessListener;
import java.util.Objects;

public final class UserMessagingPlatform {
    private UserMessagingPlatform() {
    }

    public static ConsentInformation getConsentInformation(Context context) {
        return zza.zza(context).zzb();
    }

    public static void loadAndShowConsentFormIfRequired(Activity object, ConsentForm$OnConsentFormDismissedListener consentForm$OnConsentFormDismissedListener) {
        Object object2 = zza.zza((Context)object).zzb();
        boolean bl2 = ((zzj)object2).canRequestAds();
        if (bl2) {
            consentForm$OnConsentFormDismissedListener.onConsentFormDismissed(null);
            return;
        }
        object2 = zza.zza((Context)object).zzc();
        zzcr.zza();
        zzbl zzbl2 = new zzbl((Activity)object, consentForm$OnConsentFormDismissedListener);
        Objects.requireNonNull(consentForm$OnConsentFormDismissedListener);
        object = new zzbm(consentForm$OnConsentFormDismissedListener);
        ((zzbn)object2).zzb(zzbl2, (UserMessagingPlatform$OnConsentFormLoadFailureListener)object);
    }

    public static void loadConsentForm(Context context, UserMessagingPlatform$OnConsentFormLoadSuccessListener userMessagingPlatform$OnConsentFormLoadSuccessListener, UserMessagingPlatform$OnConsentFormLoadFailureListener userMessagingPlatform$OnConsentFormLoadFailureListener) {
        zza.zza(context).zzc().zzb(userMessagingPlatform$OnConsentFormLoadSuccessListener, userMessagingPlatform$OnConsentFormLoadFailureListener);
    }

    public static void showPrivacyOptionsForm(Activity activity, ConsentForm$OnConsentFormDismissedListener consentForm$OnConsentFormDismissedListener) {
        zza.zza((Context)activity).zzc().zze(activity, consentForm$OnConsentFormDismissedListener);
    }
}


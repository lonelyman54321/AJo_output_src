/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.app.Dialog
 *  android.content.Context
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.view.View
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.internal.consent_sdk.zzab;
import com.google.android.gms.internal.consent_sdk.zzap;
import com.google.android.gms.internal.consent_sdk.zzax;
import com.google.android.gms.internal.consent_sdk.zzay;
import com.google.android.gms.internal.consent_sdk.zzba;
import com.google.android.gms.internal.consent_sdk.zzbp;
import com.google.android.gms.internal.consent_sdk.zzbt;
import com.google.android.gms.internal.consent_sdk.zzbu;
import com.google.android.gms.internal.consent_sdk.zzbv;
import com.google.android.gms.internal.consent_sdk.zzbw;
import com.google.android.gms.internal.consent_sdk.zzcr;
import com.google.android.gms.internal.consent_sdk.zzdr;
import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentForm$OnConsentFormDismissedListener;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadFailureListener;
import com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadSuccessListener;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbb
implements ConsentForm {
    boolean zza;
    private final Application zzb;
    private final zzab zzc;
    private final zzbw zzd;
    private final zzap zze;
    private final zzbp zzf;
    private final zzdr zzg;
    private Dialog zzh;
    private zzbu zzi;
    private final AtomicBoolean zzj;
    private final AtomicReference zzk;
    private final AtomicReference zzl;
    private final AtomicReference zzm;

    public zzbb(Application application, zzab zzab2, zzbw zzbw2, zzap zzap2, zzbp zzbp2, zzdr zzdr2) {
        Serializable serializable;
        this.zzj = serializable = new AtomicBoolean();
        this.zzk = serializable;
        super();
        this.zzl = serializable;
        super();
        this.zzm = serializable;
        this.zza = false;
        this.zzb = application;
        this.zzc = zzab2;
        this.zzd = zzbw2;
        this.zze = zzap2;
        this.zzf = zzbp2;
        this.zzg = zzdr2;
    }

    private final void zzg() {
        Object object = this.zzh;
        Application application = null;
        if (object != null) {
            object.dismiss();
            this.zzh = null;
        }
        this.zzd.zza(null);
        object = this.zzm.getAndSet(null);
        if (object != null) {
            application = object.zza.zzb;
            application.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object);
        }
    }

    public final void show(Activity object, ConsentForm$OnConsentFormDismissedListener consentForm$OnConsentFormDismissedListener) {
        zzcr.zza();
        Object object2 = this.zzj;
        int n3 = 0;
        int n4 = 1;
        boolean n7 = ((AtomicBoolean)object2).compareAndSet(false, n4 != 0);
        int n8 = 3;
        if (!n7) {
            int n10 = this.zza;
            object2 = n4 != n10 ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.";
            object = new zzg(n8, (String)object2);
            object = ((zzg)object).zza();
            consentForm$OnConsentFormDismissedListener.onConsentFormDismissed((FormError)object);
            return;
        }
        this.zzi.zzc();
        object2 = new zzay(this, (Activity)object);
        this.zzb.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object2);
        AtomicReference atomicReference = this.zzm;
        atomicReference.set(object2);
        this.zzd.zza((Activity)object);
        n4 = 0x1030010;
        object2 = new Dialog((Context)object, n4);
        object = this.zzi;
        object2.setContentView((View)object);
        object2.setCancelable(false);
        object = object2.getWindow();
        if (object == null) {
            object = new zzg(n8, "Activity with null windows is passed in.");
            object = ((zzg)object).zza();
            consentForm$OnConsentFormDismissedListener.onConsentFormDismissed((FormError)object);
            return;
        }
        n4 = -1;
        object.setLayout(n4, n4);
        atomicReference = new ColorDrawable(0);
        object.setBackgroundDrawable((Drawable)atomicReference);
        n3 = 0x1000000;
        object.setFlags(n3, n3);
        this.zzl.set(consentForm$OnConsentFormDismissedListener);
        object2.show();
        this.zzh = object2;
        this.zzi.zzd("UMP_messagePresented", "");
    }

    public final zzbu zza() {
        return this.zzi;
    }

    public final void zzb(UserMessagingPlatform$OnConsentFormLoadSuccessListener object, UserMessagingPlatform$OnConsentFormLoadFailureListener object2) {
        Object object3;
        this.zzi = object3 = ((zzbv)this.zzg).zzb();
        object3.setBackgroundColor(0);
        object3.getSettings().setJavaScriptEnabled(true);
        Object object4 = new zzbt((zzbu)((Object)object3), null);
        object3.setWebViewClient(object4);
        object3 = new zzba((UserMessagingPlatform$OnConsentFormLoadSuccessListener)object, (UserMessagingPlatform$OnConsentFormLoadFailureListener)object2, null);
        this.zzk.set(object3);
        object4 = this.zzi;
        object = this.zzf;
        String string2 = ((zzbp)object).zza();
        String string3 = ((zzbp)object).zzb();
        object4.loadDataWithBaseURL(string2, string3, "text/html", "UTF-8", null);
        object = zzcr.zza;
        object2 = new zzax(this);
        object.postDelayed((Runnable)object2, 10000L);
    }

    public final void zzc(int n3) {
        this.zzg();
        ConsentForm$OnConsentFormDismissedListener consentForm$OnConsentFormDismissedListener = this.zzl.getAndSet(null);
        if (consentForm$OnConsentFormDismissedListener == null) {
            return;
        }
        this.zze.zzg(3);
        consentForm$OnConsentFormDismissedListener.onConsentFormDismissed(null);
    }

    public final void zzd(zzg object) {
        this.zzg();
        ConsentForm$OnConsentFormDismissedListener consentForm$OnConsentFormDismissedListener = this.zzl.getAndSet(null);
        if (consentForm$OnConsentFormDismissedListener == null) {
            return;
        }
        object = ((zzg)object).zza();
        consentForm$OnConsentFormDismissedListener.onConsentFormDismissed((FormError)object);
    }

    public final void zze() {
        zzba zzba2 = this.zzk.getAndSet(null);
        if (zzba2 == null) {
            return;
        }
        zzba2.onConsentFormLoadSuccess(this);
    }

    public final void zzf(zzg object) {
        zzba zzba2 = this.zzk.getAndSet(null);
        if (zzba2 == null) {
            return;
        }
        object = ((zzg)object).zza();
        zzba2.onConsentFormLoadFailure((FormError)object);
    }
}


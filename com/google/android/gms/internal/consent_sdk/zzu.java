/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.os.Handler
 *  android.util.Log
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.internal.consent_sdk.zzab;
import com.google.android.gms.internal.consent_sdk.zzap;
import com.google.android.gms.internal.consent_sdk.zzbn;
import com.google.android.gms.internal.consent_sdk.zzbp;
import com.google.android.gms.internal.consent_sdk.zzci;
import com.google.android.gms.internal.consent_sdk.zzck;
import com.google.android.gms.internal.consent_sdk.zzcl;
import com.google.android.gms.internal.consent_sdk.zze;
import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.gms.internal.consent_sdk.zzl;
import com.google.android.gms.internal.consent_sdk.zzp;
import com.google.android.gms.internal.consent_sdk.zzq;
import com.google.android.gms.internal.consent_sdk.zzr;
import com.google.android.gms.internal.consent_sdk.zzs;
import com.google.android.gms.internal.consent_sdk.zzt;
import com.google.android.gms.internal.consent_sdk.zzw;
import com.google.android.gms.internal.consent_sdk.zzx;
import com.google.android.gms.internal.consent_sdk.zzz;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentInformation$OnConsentInfoUpdateFailureListener;
import com.google.android.ump.ConsentInformation$OnConsentInfoUpdateSuccessListener;
import com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus;
import com.google.android.ump.ConsentRequestParameters;
import java.util.Objects;
import java.util.concurrent.Executor;

final class zzu {
    private final Application zza;
    private final zzab zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zzap zze;
    private final zzbn zzf;
    private final zzl zzg;
    private final zzx zzh;
    private final zze zzi;

    public zzu(Application application, zzab zzab2, Handler handler, Executor executor, zzap zzap2, zzbn zzbn2, zzl zzl2, zzx zzx2, zze zze2) {
        this.zza = application;
        this.zzb = zzab2;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzap2;
        this.zzf = zzbn2;
        this.zzg = zzl2;
        this.zzh = zzx2;
        this.zzi = zze2;
    }

    /*
     * Exception decompiling
     */
    private final zzck zzd(zzci var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 18[TRYBLOCK] [36 : 202->206)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final /* synthetic */ void zza(ConsentInformation$OnConsentInfoUpdateSuccessListener object, zzz object2) {
        Objects.requireNonNull(object);
        zzt zzt2 = new zzt((ConsentInformation$OnConsentInfoUpdateSuccessListener)object);
        this.zzc.post((Runnable)zzt2);
        object = object2.zzb;
        object2 = ConsentInformation$PrivacyOptionsRequirementStatus.NOT_REQUIRED;
        if (object != object2) {
            object = this.zzf;
            ((zzbn)object).zzc();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzb(Activity object, ConsentRequestParameters object2, ConsentInformation$OnConsentInfoUpdateSuccessListener object3, ConsentInformation$OnConsentInfoUpdateFailureListener consentInformation$OnConsentInfoUpdateFailureListener) {
        zzg zzg22;
        block5: {
            RuntimeException runtimeException2;
            block4: {
                int n3;
                Object object4;
                block3: {
                    try {
                        object4 = ((ConsentRequestParameters)object2).getConsentDebugSettings();
                        if (object4 != null && (n3 = ((ConsentDebugSettings)object4).isTestDevice()) != 0) break block3;
                    }
                    catch (RuntimeException runtimeException2) {
                        break block4;
                    }
                    catch (zzg zzg22) {
                        break block5;
                    }
                    object4 = this.zza;
                    zzcl.zza((Context)object4);
                }
                object4 = this.zzg;
                object = ((zzl)object4).zzc((Activity)object, (ConsentRequestParameters)object2);
                object = this.zzd((zzci)object);
                object2 = this.zzh;
                object4 = new zzw((zzx)object2, (zzck)object);
                object = ((zzw)object4).zza();
                object2 = this.zze;
                n3 = object.zza;
                ((zzap)object2).zzg(n3);
                object2 = this.zze;
                object4 = object.zzb;
                ((zzap)object2).zzh((ConsentInformation$PrivacyOptionsRequirementStatus)((Object)object4));
                object2 = this.zzf;
                object4 = object.zzc;
                ((zzbn)object2).zzd((zzbp)object4);
                object2 = this.zzi;
                object2 = ((zze)object2).zza();
                object4 = new zzp(this, (ConsentInformation$OnConsentInfoUpdateSuccessListener)object3, (zzz)object);
                object2.execute((Runnable)object4);
                return;
            }
            String string2 = String.valueOf(Log.getStackTraceString((Throwable)runtimeException2));
            string2 = "Caught exception when trying to request consent info update: ".concat(string2);
            object2 = new zzg(1, string2);
            string2 = this.zzc;
            object3 = new zzs(consentInformation$OnConsentInfoUpdateFailureListener, (zzg)object2);
            string2.post((Runnable)object3);
            return;
        }
        object2 = this.zzc;
        object3 = new zzr(consentInformation$OnConsentInfoUpdateFailureListener, zzg22);
        object2.post((Runnable)object3);
    }

    public final void zzc(Activity activity, ConsentRequestParameters consentRequestParameters, ConsentInformation$OnConsentInfoUpdateSuccessListener consentInformation$OnConsentInfoUpdateSuccessListener, ConsentInformation$OnConsentInfoUpdateFailureListener consentInformation$OnConsentInfoUpdateFailureListener) {
        zzq zzq2 = new zzq(this, activity, consentRequestParameters, consentInformation$OnConsentInfoUpdateSuccessListener, consentInformation$OnConsentInfoUpdateFailureListener);
        this.zzd.execute(zzq2);
    }
}


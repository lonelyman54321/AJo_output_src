/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.internal.measurement.zzdr;
import com.google.android.gms.internal.measurement.zzdw;
import com.google.android.gms.internal.measurement.zzdx;
import com.google.android.gms.internal.measurement.zzdz;
import com.google.android.gms.internal.measurement.zzeb;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$zza;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$zzb;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzi;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzj;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzjt;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzk;
import com.google.android.gms.measurement.internal.zzl;
import com.google.android.gms.measurement.internal.zzll;
import com.google.android.gms.measurement.internal.zzm;
import com.google.android.gms.measurement.internal.zzn;
import com.google.android.gms.measurement.internal.zzo;
import com.google.android.gms.measurement.internal.zzpn;
import java.util.Map;

public class AppMeasurementDynamiteService
extends zzdo {
    zzic zza = null;
    private final Map zzb;

    public static /* synthetic */ void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdr zzdr2) {
        try {
            zzdr2.a_();
            return;
        }
        catch (RemoteException remoteException) {
            ((zzic)Preconditions.checkNotNull(appMeasurementDynamiteService.zza)).zzj().zzr().zza("Failed to call IDynamiteUploadBatchesCallback", (Object)remoteException);
            return;
        }
    }

    public AppMeasurementDynamiteService() {
        Jp jp = new Jp();
        this.zzb = jp;
    }

    private final void zza() {
        Object object = this.zza;
        if (object != null) {
            return;
        }
        object = new IllegalStateException("Attempting to perform action before initialize.");
        throw object;
    }

    private final void zza(zzdq zzdq2, String string2) {
        this.zza();
        this.zza.zzv().zza(zzdq2, string2);
    }

    public void beginAdUnitExposure(String string2, long l2) {
        this.zza();
        this.zza.zze().zza(string2, l2);
    }

    public void clearConditionalUserProperty(String string2, String string3, Bundle bundle) {
        this.zza();
        this.zza.zzp().zza(string2, string3, bundle);
    }

    public void clearMeasurementEnabled(long l2) {
        this.zza();
        this.zza.zzp().zza((Boolean)null);
    }

    public void endAdUnitExposure(String string2, long l2) {
        this.zza();
        this.zza.zze().zzb(string2, l2);
    }

    public void generateEventId(zzdq zzdq2) {
        this.zza();
        long l2 = this.zza.zzv().zzo();
        this.zza();
        this.zza.zzv().zza(zzdq2, l2);
    }

    public void getAppInstanceId(zzdq zzdq2) {
        this.zza();
        zzhv zzhv2 = this.zza.zzl();
        zzi zzi2 = new zzi(this, zzdq2);
        zzhv2.zzb(zzi2);
    }

    public void getCachedAppInstanceId(zzdq zzdq2) {
        this.zza();
        String string2 = this.zza.zzp().zzai();
        this.zza(zzdq2, string2);
    }

    public void getConditionalUserProperties(String string2, String string3, zzdq zzdq2) {
        this.zza();
        zzhv zzhv2 = this.zza.zzl();
        zzm zzm2 = new zzm(this, zzdq2, string2, string3);
        zzhv2.zzb(zzm2);
    }

    public void getCurrentScreenClass(zzdq zzdq2) {
        this.zza();
        String string2 = this.zza.zzp().zzaj();
        this.zza(zzdq2, string2);
    }

    public void getCurrentScreenName(zzdq zzdq2) {
        this.zza();
        String string2 = this.zza.zzp().zzak();
        this.zza(zzdq2, string2);
    }

    public void getGmpAppId(zzdq zzdq2) {
        this.zza();
        String string2 = this.zza.zzp().zzal();
        this.zza(zzdq2, string2);
    }

    public void getMaxUserProperties(String string2, zzdq zzdq2) {
        this.zza();
        this.zza.zzp();
        zzju.zza(string2);
        this.zza();
        this.zza.zzv().zza(zzdq2, 25);
    }

    public void getSessionId(zzdq zzdq2) {
        this.zza();
        this.zza.zzp().zza(zzdq2);
    }

    public void getTestFlag(zzdq zzdq2, int n3) {
        this.zza();
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 == n4) {
                            zzpn zzpn2 = this.zza.zzv();
                            Boolean bl2 = this.zza.zzp().zzae();
                            n4 = (int)(bl2.booleanValue() ? 1 : 0);
                            zzpn2.zza(zzdq2, n4 != 0);
                        }
                        return;
                    }
                    zzpn zzpn3 = this.zza.zzv();
                    n4 = this.zza.zzp().zzag();
                    zzpn3.zza(zzdq2, n4);
                    return;
                }
                zzpn zzpn4 = this.zza.zzv();
                Double d2 = this.zza.zzp().zzaf();
                double d5 = d2;
                Bundle bundle = new Bundle();
                String string2 = "r";
                bundle.putDouble(string2, d5);
                try {
                    zzdq2.zza(bundle);
                    return;
                }
                catch (RemoteException remoteException) {
                    zzpn4.zzu.zzj().zzr().zza("Error returning double value to wrapper", (Object)remoteException);
                    return;
                }
            }
            zzpn zzpn5 = this.zza.zzv();
            long l2 = this.zza.zzp().zzah();
            zzpn5.zza(zzdq2, l2);
            return;
        }
        zzpn zzpn6 = this.zza.zzv();
        String string3 = this.zza.zzp().zzam();
        zzpn6.zza(zzdq2, string3);
    }

    public void getUserProperties(String string2, String string3, boolean bl2, zzdq zzdq2) {
        this.zza();
        zzhv zzhv2 = this.zza.zzl();
        zzk zzk2 = new zzk(this, zzdq2, string2, string3, bl2);
        zzhv2.zzb(zzk2);
    }

    public void initForTests(Map map2) {
        this.zza();
    }

    public void initialize(IObjectWrapper object, zzdz zzdz2, long l2) {
        zzic zzic2 = this.zza;
        if (zzic2 == null) {
            object = (Context)Preconditions.checkNotNull((Context)ObjectWrapper.unwrap((IObjectWrapper)object));
            Long l3 = l2;
            this.zza = object = zzic.zza((Context)object, zzdz2, l3);
            return;
        }
        zzic2.zzj().zzr().zza("Attempting to initialize multiple times");
    }

    public void isDataCollectionEnabled(zzdq zzdq2) {
        this.zza();
        zzhv zzhv2 = this.zza.zzl();
        zzo zzo2 = new zzo(this, zzdq2);
        zzhv2.zzb(zzo2);
    }

    public void logEvent(String string2, String string3, Bundle bundle, boolean bl2, boolean bl3, long l2) {
        this.zza();
        this.zza.zzp().zza(string2, string3, bundle, bl2, bl3, l2);
    }

    public void logEventAndBundle(String string2, String object, Bundle object2, zzdq zzdq2, long l2) {
        this.zza();
        Preconditions.checkNotEmpty((String)object);
        Object object3 = object2 != null ? new Bundle(object2) : new Bundle();
        String string3 = "app";
        object3.putString("_o", string3);
        zzbg zzbg2 = new zzbg((Bundle)object2);
        object3 = new zzbl((String)object, zzbg2, string3, l2);
        object = this.zza.zzl();
        object2 = new zzl(this, zzdq2, (zzbl)object3, string2);
        ((zzhv)object).zzb((Runnable)object2);
    }

    public void logHealthData(int n3, String string2, IObjectWrapper object, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        this.zza();
        Object object2 = null;
        Object object3 = object == null ? null : (object = ObjectWrapper.unwrap((IObjectWrapper)object));
        Object object4 = iObjectWrapper == null ? null : (object = ObjectWrapper.unwrap(iObjectWrapper));
        if (iObjectWrapper2 != null) {
            object2 = ObjectWrapper.unwrap(iObjectWrapper2);
        }
        this.zza.zzj().zza(n3, true, false, string2, object3, object4, object2);
    }

    public void onActivityCreated(IObjectWrapper object, Bundle bundle, long l2) {
        this.zza();
        object = zzeb.zza((Activity)Preconditions.checkNotNull((Activity)ObjectWrapper.unwrap((IObjectWrapper)object)));
        this.onActivityCreatedByScionActivityInfo((zzeb)object, bundle, l2);
    }

    public void onActivityCreatedByScionActivityInfo(zzeb zzeb2, Bundle bundle, long l2) {
        this.zza();
        zzll zzll2 = this.zza.zzp().zzad();
        if (zzll2 != null) {
            zzju zzju2 = this.zza.zzp();
            zzju2.zzar();
            zzll2.zza(zzeb2, bundle);
        }
    }

    public void onActivityDestroyed(IObjectWrapper object, long l2) {
        this.zza();
        object = zzeb.zza((Activity)Preconditions.checkNotNull((Activity)ObjectWrapper.unwrap((IObjectWrapper)object)));
        this.onActivityDestroyedByScionActivityInfo((zzeb)object, l2);
    }

    public void onActivityDestroyedByScionActivityInfo(zzeb zzeb2, long l2) {
        this.zza();
        zzll zzll2 = this.zza.zzp().zzad();
        if (zzll2 != null) {
            zzju zzju2 = this.zza.zzp();
            zzju2.zzar();
            zzll2.zza(zzeb2);
        }
    }

    public void onActivityPaused(IObjectWrapper object, long l2) {
        this.zza();
        object = zzeb.zza((Activity)Preconditions.checkNotNull((Activity)ObjectWrapper.unwrap((IObjectWrapper)object)));
        this.onActivityPausedByScionActivityInfo((zzeb)object, l2);
    }

    public void onActivityPausedByScionActivityInfo(zzeb zzeb2, long l2) {
        this.zza();
        zzll zzll2 = this.zza.zzp().zzad();
        if (zzll2 != null) {
            zzju zzju2 = this.zza.zzp();
            zzju2.zzar();
            zzll2.zzb(zzeb2);
        }
    }

    public void onActivityResumed(IObjectWrapper object, long l2) {
        this.zza();
        object = zzeb.zza((Activity)Preconditions.checkNotNull((Activity)ObjectWrapper.unwrap((IObjectWrapper)object)));
        this.onActivityResumedByScionActivityInfo((zzeb)object, l2);
    }

    public void onActivityResumedByScionActivityInfo(zzeb zzeb2, long l2) {
        this.zza();
        zzll zzll2 = this.zza.zzp().zzad();
        if (zzll2 != null) {
            zzju zzju2 = this.zza.zzp();
            zzju2.zzar();
            zzll2.zzc(zzeb2);
        }
    }

    public void onActivitySaveInstanceState(IObjectWrapper object, zzdq zzdq2, long l2) {
        this.zza();
        object = zzeb.zza((Activity)Preconditions.checkNotNull((Activity)ObjectWrapper.unwrap((IObjectWrapper)object)));
        this.onActivitySaveInstanceStateByScionActivityInfo((zzeb)object, zzdq2, l2);
    }

    public void onActivitySaveInstanceStateByScionActivityInfo(zzeb zzeb2, zzdq zzdq2, long l2) {
        this.zza();
        zzll zzll2 = this.zza.zzp().zzad();
        Bundle bundle = new Bundle();
        if (zzll2 != null) {
            zzju zzju2 = this.zza.zzp();
            zzju2.zzar();
            zzll2.zzb(zzeb2, bundle);
        }
        try {
            zzdq2.zza(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.zza.zzj().zzr().zza("Error returning bundle value to wrapper", (Object)remoteException);
            return;
        }
    }

    public void onActivityStarted(IObjectWrapper object, long l2) {
        this.zza();
        object = zzeb.zza((Activity)Preconditions.checkNotNull((Activity)ObjectWrapper.unwrap((IObjectWrapper)object)));
        this.onActivityStartedByScionActivityInfo((zzeb)object, l2);
    }

    public void onActivityStartedByScionActivityInfo(zzeb object, long l2) {
        this.zza();
        object = this.zza.zzp().zzad();
        if (object != null) {
            object = this.zza.zzp();
            ((zzju)object).zzar();
        }
    }

    public void onActivityStopped(IObjectWrapper object, long l2) {
        this.zza();
        object = zzeb.zza((Activity)Preconditions.checkNotNull((Activity)ObjectWrapper.unwrap((IObjectWrapper)object)));
        this.onActivityStoppedByScionActivityInfo((zzeb)object, l2);
    }

    public void onActivityStoppedByScionActivityInfo(zzeb object, long l2) {
        this.zza();
        object = this.zza.zzp().zzad();
        if (object != null) {
            object = this.zza.zzp();
            ((zzju)object).zzar();
        }
    }

    public void performAction(Bundle bundle, zzdq zzdq2, long l2) {
        this.zza();
        zzdq2.zza(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void registerOnMeasurementEventListener(zzdw object) {
        this.zza();
        Map map2 = this.zzb;
        synchronized (map2) {
            try {
                Object object2 = this.zzb;
                int n3 = object.zza();
                Object object3 = n3;
                object2 = object2.get(object3);
                object2 = (zzjt)object2;
                if (object2 == null) {
                    object2 = new AppMeasurementDynamiteService$zzb(this, (zzdw)object);
                    object3 = this.zzb;
                    int n4 = object.zza();
                    object = n4;
                    object3.put(object, object2);
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl17 : MonitorExitStatement: MONITOREXIT : var2_3
                this.zza.zzp().zza((zzjt)object2);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void resetAnalyticsData(long l2) {
        this.zza();
        this.zza.zzp().zza(l2);
    }

    public void retrieveAndUploadBatches(zzdr zzdr2) {
        this.zza();
        zzjf zzjf2 = this.zza.zzf();
        Object object = zzbn.zzcl;
        boolean bl2 = ((zzai)zzjf2).zzf(null, (zzfx)object);
        if (!bl2) {
            return;
        }
        zzjf2 = this.zza.zzp();
        object = new zzj(this, zzdr2);
        ((zzju)zzjf2).zza((Runnable)object);
    }

    public void setConditionalUserProperty(Bundle bundle, long l2) {
        this.zza();
        if (bundle == null) {
            this.zza.zzj().zzg().zza("Conditional user property must not be null");
            return;
        }
        this.zza.zzp().zza(bundle, l2);
    }

    public void setConsent(Bundle bundle, long l2) {
        this.zza();
        this.zza.zzp().zzb(bundle, l2);
    }

    public void setConsentThirdParty(Bundle bundle, long l2) {
        this.zza();
        this.zza.zzp().zzc(bundle, l2);
    }

    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String string2, String string3, long l2) {
        this.zza();
        zzeb zzeb2 = zzeb.zza((Activity)Preconditions.checkNotNull((Activity)ObjectWrapper.unwrap(iObjectWrapper)));
        this.setCurrentScreenByScionActivityInfo(zzeb2, string2, string3, l2);
    }

    public void setCurrentScreenByScionActivityInfo(zzeb zzeb2, String string2, String string3, long l2) {
        this.zza();
        this.zza.zzs().zza(zzeb2, string2, string3);
    }

    public void setDataCollectionEnabled(boolean bl2) {
        this.zza();
        this.zza.zzp().zzc(bl2);
    }

    public void setDefaultEventParameters(Bundle bundle) {
        this.zza();
        this.zza.zzp().zzb(bundle);
    }

    public void setEventInterceptor(zzdw object) {
        this.zza();
        AppMeasurementDynamiteService$zza appMeasurementDynamiteService$zza = new AppMeasurementDynamiteService$zza(this, (zzdw)object);
        object = this.zza.zzl();
        boolean bl2 = ((zzhv)object).zzm();
        if (bl2) {
            this.zza.zzp().zza(appMeasurementDynamiteService$zza);
            return;
        }
        object = this.zza.zzl();
        zzn zzn2 = new zzn(this, appMeasurementDynamiteService$zza);
        ((zzhv)object).zzb(zzn2);
    }

    public void setInstanceIdProvider(zzdx zzdx2) {
        this.zza();
    }

    public void setMeasurementEnabled(boolean bl2, long l2) {
        this.zza();
        zzju zzju2 = this.zza.zzp();
        Boolean bl3 = bl2;
        zzju2.zza(bl3);
    }

    public void setMinimumSessionDuration(long l2) {
        this.zza();
    }

    public void setSessionTimeoutDuration(long l2) {
        this.zza();
        this.zza.zzp().zzd(l2);
    }

    public void setSgtmDebugInfo(Intent intent) {
        this.zza();
        this.zza.zzp().zza(intent);
    }

    public void setUserId(String string2, long l2) {
        this.zza();
        this.zza.zzp().zza(string2, l2);
    }

    public void setUserProperty(String string2, String string3, IObjectWrapper iObjectWrapper, boolean bl2, long l2) {
        this.zza();
        Object object = ObjectWrapper.unwrap(iObjectWrapper);
        this.zza.zzp().zza(string2, string3, object, bl2, l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void unregisterOnMeasurementEventListener(zzdw zzdw2) {
        this.zza();
        Map map2 = this.zzb;
        // MONITORENTER : map2
        Object object = this.zzb;
        int n3 = zzdw2.zza();
        Integer n4 = n3;
        object = object.remove(n4);
        object = (zzjt)object;
        // MONITOREXIT : map2
        if (object == null) {
            object = new AppMeasurementDynamiteService$zzb(this, zzdw2);
        }
        this.zza.zzp().zzb((zzjt)object);
    }
}


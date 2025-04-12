/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzblq;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbmj;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchp;
import com.google.android.gms.internal.ads.zzchq;
import com.google.android.gms.internal.ads.zzcit;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzdya;
import com.google.android.gms.internal.ads.zzdyk;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzgge;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdyl
implements zzp,
zzcit {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private zzdya zzc;
    private zzchd zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private zzda zzh;
    private boolean zzi;

    public zzdyl(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = versionInfoParcel;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zzl(zzda var1_1) {
        synchronized (this) {
            block16: {
                block13: {
                    block15: {
                        block14: {
                            block12: {
                                try {
                                    var2_3 = zzbep.zziU;
                                    var3_4 = zzba.zzc();
                                    var2_3 = var3_4.zza((zzbeg)var2_3);
                                    var2_3 = (Boolean)var2_3;
                                    var4_5 = var2_3.booleanValue();
                                    var5_6 = 16;
                                    if (var4_5 != 0) break block12;
                                    var2_3 = "Ad inspector had an internal error.";
                                    zzm.zzj((String)var2_3);
                                    try {
                                        var2_3 = zzfiq.zzd(var5_6, null, null);
                                        var1_1.zze((com.google.android.gms.ads.internal.client.zze)var2_3);
                                    }
                                    catch (RemoteException v0) {}
                                }
                                catch (Throwable var1_2) {}
                                return false;
                            }
                            var2_3 = this.zzc;
                            if (var2_3 == null) {
                                var2_3 = "Ad inspector had an internal error.";
                                zzm.zzj((String)var2_3);
                                var2_3 = zzu.zzo();
                                var7_8 = "InspectorManager null";
                                var6_7 = new NullPointerException(var7_8);
                                var7_8 = "InspectorUi.shouldOpenUi";
                                var2_3.zzw(var6_7, var7_8);
                                var2_3 = zzfiq.zzd(var5_6, null, null);
                                var1_1.zze((com.google.android.gms.ads.internal.client.zze)var2_3);
                                break block13;
                            }
                            var4_5 = this.zze;
                            if (var4_5 != 0 || (var4_5 = this.zzf) != 0) break block14;
                            var2_3 = zzu.zzB();
                            var8_9 = var2_3.currentTimeMillis();
                            var10_10 = this.zzg;
                            var12_11 = zzbep.zziX;
                            var13_12 = zzba.zzc();
                            var12_11 = var13_12.zza((zzbeg)var12_11);
                            var14_13 = (var12_11 = (Integer)var12_11).intValue();
                            cfr_temp_0 = var8_9 - (var10_10 += var14_13);
                            var16_14 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                            if (var16_14 /* !! */  < 0) break block14;
                            return true;
                        }
                        var2_3 = "Ad inspector cannot be opened because it is already open.";
                        zzm.zzj((String)var2_3);
                        var4_5 = 19;
                        ** try [egrp 5[TRYBLOCK] [35 : 251->265)] { 
lbl53:
                        // 1 sources

                        {
                            break block15;
                            var2_3 = zzfiq.zzd(var4_5, null, null);
                            var1_1.zze((com.google.android.gms.ads.internal.client.zze)var2_3);
                            break block16;
                        }
                    }
                    throw var1_2;
                    catch (RemoteException v1) {}
                }
                return false;
lbl63:
                // 1 sources

                catch (RemoteException v2) {}
            }
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(boolean bl2, int n3, String object, String string2) {
        String string3 = "Failed to load UI. Error code: ";
        synchronized (this) {
            Throwable throwable2;
            boolean bl3 = true;
            if (bl2) {
                String string4 = "Ad inspector loaded.";
                try {
                    com.google.android.gms.ads.internal.util.zze.zza(string4);
                    this.zze = bl3;
                    string4 = "";
                    this.zzk(string4);
                    return;
                }
                catch (Throwable throwable2) {}
            } else {
                Object object2 = "Ad inspector failed to load.";
                zzm.zzj((String)object2);
                try {
                    object2 = zzu.zzo();
                    StringBuilder stringBuilder = new StringBuilder(string3);
                    stringBuilder.append(n3);
                    Object object3 = ", Description: ";
                    stringBuilder.append((String)object3);
                    stringBuilder.append((String)object);
                    object3 = ", Failing URL: ";
                    stringBuilder.append((String)object3);
                    stringBuilder.append(string2);
                    object3 = stringBuilder.toString();
                    Exception exception = new Exception((String)object3);
                    object3 = "InspectorUi.onAdWebViewFinishedLoading 0";
                    ((zzcby)object2).zzw(exception, (String)object3);
                    object2 = this.zzh;
                    if (object2 != null) {
                        n3 = 17;
                        object = null;
                        object3 = zzfiq.zzd(n3, null, null);
                        object2.zze((com.google.android.gms.ads.internal.client.zze)object3);
                    }
                }
                catch (RemoteException remoteException) {
                    String string5 = "InspectorUi.onAdWebViewFinishedLoading 1";
                    object = zzu.zzo();
                    ((zzcby)object).zzw(remoteException, string5);
                }
                this.zzi = bl3;
                object2 = this.zzd;
                object2.destroy();
                return;
            }
            throw throwable2;
        }
    }

    public final void zzdH() {
    }

    public final void zzdk() {
    }

    public final void zzdq() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdr() {
        synchronized (this) {
            boolean bl2;
            this.zzf = bl2 = true;
            String string2 = "";
            this.zzk(string2);
            return;
        }
    }

    public final void zzdt() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdu(int n3) {
        synchronized (this) {
            try {
                long l2;
                Object object = this.zzd;
                object.destroy();
                n3 = (int)(this.zzi ? 1 : 0);
                if (n3 == 0) {
                    object = "Inspector closed.";
                    com.google.android.gms.ads.internal.util.zze.zza((String)object);
                    object = this.zzh;
                    if (object != null) {
                        try {
                            object.zze(null);
                        }
                        catch (RemoteException remoteException) {}
                    }
                }
                n3 = 0;
                object = null;
                this.zzf = false;
                this.zze = false;
                this.zzg = l2 = 0L;
                this.zzi = false;
                this.zzh = null;
                return;
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    public final Activity zzg() {
        boolean bl2;
        zzchd zzchd2 = this.zzd;
        if (zzchd2 != null && !(bl2 = zzchd2.zzaE())) {
            return this.zzd.zzi();
        }
        return null;
    }

    public final void zzh(zzdya zzdya2) {
        this.zzc = zzdya2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzi(String object) {
        JSONObject jSONObject = this.zzc.zze();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            String string2 = "redirectUrl";
            try {
                jSONObject.put(string2, object);
            }
            catch (JSONException jSONException) {}
        }
        object = this.zzd;
        String string3 = jSONObject.toString();
        object.zzb("window.inspectorInfo", string3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzj(zzda zzda2, zzbmj zzbmj2, zzbmc zzbmc2, zzblq zzblq2) {
        Object object = zzda2;
        synchronized (this) {
            Throwable throwable2;
            block13: {
                long l2;
                int n3;
                Object object2;
                block12: {
                    block11: {
                        try {
                            boolean bl2 = this.zzl(zzda2);
                            if (bl2) break block11;
                        }
                        catch (Throwable throwable2) {}
                        return;
                    }
                    object2 = null;
                    n3 = 17;
                    try {}
                    catch (zzchp zzchp2) {
                        Object object3 = "Failed to obtain a web view for the ad inspector";
                        zzm.zzk((String)object3, zzchp2);
                        try {
                            object3 = zzu.zzo();
                            String string2 = "InspectorUi.openInspector 0";
                            ((zzcby)object3).zzw(zzchp2, string2);
                            Object object4 = "Failed to obtain a web view for the ad inspector";
                            object4 = zzfiq.zzd(n3, (String)object4, null);
                            object.zze((com.google.android.gms.ads.internal.client.zze)object4);
                            return;
                        }
                        catch (RemoteException remoteException) {
                            object = "InspectorUi.openInspector 1";
                            object2 = zzu.zzo();
                            ((zzcby)object2).zzw(remoteException, (String)object);
                            return;
                        }
                    }
                    break block12;
                    break block13;
                }
                zzu.zzz();
                Object object5 = this.zza;
                VersionInfoParcel versionInfoParcel = this.zzb;
                Object object6 = zzcix.zza();
                String string3 = "";
                zzbdm zzbdm2 = zzbdm.zza();
                Object object7 = zzchq.zza(object5, (zzcix)object6, string3, false, false, null, null, versionInfoParcel, null, null, null, zzbdm2, null, null, null, null);
                this.zzd = object7;
                object7 = object7.zzN();
                if (object7 == null) {
                    object7 = "Failed to obtain a web view for the ad inspector";
                    zzm.zzj((String)object7);
                    {
                        object7 = zzu.zzo();
                        object6 = "Failed to obtain a web view for the ad inspector";
                        object5 = new NullPointerException((String)object6);
                        object6 = "InspectorUi.openInspector 2";
                        ((zzcby)object7).zzw((Throwable)object5, (String)object6);
                        object7 = "Failed to obtain a web view for the ad inspector";
                        object7 = zzfiq.zzd(n3, (String)object7, null);
                        zzda2.zze((com.google.android.gms.ads.internal.client.zze)object7);
                        return;
                    }
                }
                this.zzh = zzda2;
                object = this.zza;
                object2 = new zzbmi((Context)object);
                object6 = null;
                string3 = null;
                versionInfoParcel = null;
                zzbdm2 = null;
                object5 = object7;
                object7.zzR(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbmj2, null, (zzbmi)object2, zzbmc2, zzblq2, null);
                object7.zzB(this);
                object7 = this.zzd;
                object = zzbep.zziV;
                object2 = zzba.zzc();
                object = ((zzben)object2).zza((zzbeg)object);
                object = (String)object;
                object7.loadUrl((String)object);
                zzu.zzi();
                object7 = this.zza;
                object2 = this.zzd;
                VersionInfoParcel versionInfoParcel2 = this.zzb;
                boolean bl3 = true;
                object = new AdOverlayInfoParcel(this, (zzchd)object2, (int)(bl3 ? 1 : 0), versionInfoParcel2);
                zzn.zza((Context)object7, (AdOverlayInfoParcel)object, bl3);
                object7 = zzu.zzB();
                this.zzg = l2 = object7.currentTimeMillis();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzk(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2 = this.zze;
                    if (bl2 && (bl2 = this.zzf)) {
                        zzgge zzgge2 = zzcci.zze;
                        zzdyk zzdyk2 = new zzdyk(this, string2);
                        zzgge2.execute(zzdyk2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.view.InputEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.WindowManager
 *  android.widget.ImageView$ScaleType
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzccl;
import com.google.android.gms.internal.ads.zzcra;
import com.google.android.gms.internal.ads.zzczj;
import com.google.android.gms.internal.ads.zzdad;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdhg;
import com.google.android.gms.internal.ads.zzdkl;
import com.google.android.gms.internal.ads.zzdkn;
import com.google.android.gms.internal.ads.zzdkp;
import com.google.android.gms.internal.ads.zzdlt;
import com.google.android.gms.internal.ads.zzdmb;
import com.google.android.gms.internal.ads.zzdme;
import com.google.android.gms.internal.ads.zzdmx;
import com.google.android.gms.internal.ads.zzdqs;
import com.google.android.gms.internal.ads.zzdsi;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdkq
implements zzdmb {
    private long zzA;
    private long zzB;
    private zzcs zzC;
    private final Context zza;
    private final zzdme zzb;
    private final JSONObject zzc;
    private final zzdqs zzd;
    private final zzdlt zze;
    private final zzaxd zzf;
    private final zzdad zzg;
    private final zzczj zzh;
    private final zzdhg zzi;
    private final zzfgt zzj;
    private final VersionInfoParcel zzk;
    private final zzfho zzl;
    private final zzcra zzm;
    private final zzdmx zzn;
    private final Clock zzo;
    private final zzdhc zzp;
    private final zzfoe zzq;
    private final zzdsi zzr;
    private final zzfmn zzs;
    private final zzegk zzt;
    private boolean zzu = false;
    private boolean zzv;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy;
    private Point zzz;

    public zzdkq(Context context, zzdme zzdme2, JSONObject jSONObject, zzdqs zzdqs2, zzdlt zzdlt2, zzaxd zzaxd2, zzdad zzdad2, zzczj zzczj2, zzdhg zzdhg2, zzfgt zzfgt2, VersionInfoParcel versionInfoParcel, zzfho zzfho2, zzcra zzcra2, zzdmx zzdmx2, Clock clock, zzdhc zzdhc2, zzfoe zzfoe2, zzfmn zzfmn2, zzegk zzegk2, zzdsi zzdsi2) {
        long l2;
        Object object;
        this.zzy = object = new Point();
        this.zzz = object = new Point();
        this.zzA = l2 = 0L;
        this.zzB = l2;
        object = context;
        this.zza = context;
        object = zzdme2;
        this.zzb = zzdme2;
        object = jSONObject;
        this.zzc = jSONObject;
        object = zzdqs2;
        this.zzd = zzdqs2;
        object = zzdlt2;
        this.zze = zzdlt2;
        object = zzaxd2;
        this.zzf = zzaxd2;
        object = zzdad2;
        this.zzg = zzdad2;
        object = zzczj2;
        this.zzh = zzczj2;
        object = zzdhg2;
        this.zzi = zzdhg2;
        object = zzfgt2;
        this.zzj = zzfgt2;
        object = versionInfoParcel;
        this.zzk = versionInfoParcel;
        object = zzfho2;
        this.zzl = zzfho2;
        object = zzcra2;
        this.zzm = zzcra2;
        object = zzdmx2;
        this.zzn = zzdmx2;
        object = clock;
        this.zzo = clock;
        object = zzdhc2;
        this.zzp = zzdhc2;
        object = zzfoe2;
        this.zzq = zzfoe2;
        object = zzfmn2;
        this.zzs = zzfmn2;
        object = zzegk2;
        this.zzt = zzegk2;
        object = zzdsi2;
        this.zzr = zzdsi2;
    }

    private final String zzD(View view) {
        Object object = zzbep.zzdx;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            return null;
        }
        try {
            object = this.zzf;
        }
        catch (Exception exception) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Exception getting data.");
            return null;
        }
        object = ((zzaxd)object).zzc();
        Context context = this.zza;
        return object.zzh(context, view, null);
    }

    private final String zzE(View object, Map object2) {
        int n3;
        int n4;
        if (object2 != null && object != null) {
            boolean bl2;
            object2 = object2.entrySet().iterator();
            while (bl2 = object2.hasNext()) {
                Map.Entry entry = (Map.Entry)object2.next();
                View view = (View)((WeakReference)entry.getValue()).get();
                boolean bl3 = object.equals(view);
                if (!bl3) continue;
                return (String)entry.getKey();
            }
        }
        if ((n4 = ((zzdlt)(object = this.zze)).zzc()) != (n3 = 1)) {
            n3 = 2;
            if (n4 != n3) {
                n3 = 6;
                if (n4 != n3) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    private final boolean zzF(String string2) {
        boolean bl2;
        JSONObject jSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return jSONObject != null && (bl2 = jSONObject.optBoolean(string2, false));
    }

    private final boolean zzG() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zzH(JSONObject object, JSONObject object2, JSONObject object3, JSONObject object4, String object5, JSONObject object6, boolean bl2) {
        JSONException jSONException2;
        block8: {
            block9: {
                boolean bl3;
                Object object7;
                JSONObject jSONObject;
                block7: {
                    try {
                        jSONObject = new JSONObject();
                        object7 = "ad";
                        JSONObject jSONObject2 = this.zzc;
                        jSONObject.put((String)object7, (Object)jSONObject2);
                        object7 = "asset_view_signal";
                        jSONObject.put((String)object7, object2);
                        object2 = "ad_view_signal";
                        jSONObject.put((String)object2, object);
                        object = "scroll_view_signal";
                        jSONObject.put((String)object, object3);
                        object = "lock_screen_signal";
                        jSONObject.put((String)object, object4);
                        object = "provided_signals";
                        jSONObject.put((String)object, object6);
                        object = zzbep.zzdx;
                        object2 = zzba.zzc();
                        object = ((zzben)object2).zza((zzbeg)object);
                        object = (Boolean)object;
                        bl3 = (Boolean)object;
                        if (!bl3) break block7;
                        object = "view_signals";
                        jSONObject.put((String)object, object5);
                    }
                    catch (JSONException jSONException2) {
                        break block8;
                    }
                }
                object = "policy_validator_enabled";
                jSONObject.put((String)object, bl2);
                object = "screen";
                object2 = this.zza;
                object3 = new JSONObject();
                com.google.android.gms.ads.internal.zzu.zzp();
                object4 = "window";
                object4 = object2.getSystemService((String)object4);
                object4 = (WindowManager)object4;
                object4 = com.google.android.gms.ads.internal.util.zzt.zzt((WindowManager)object4);
                object5 = null;
                object6 = "width";
                try {
                    bl2 = object4.widthPixels;
                    object7 = com.google.android.gms.ads.internal.client.zzay.zzb();
                    bl2 = ((zzf)object7).zzb((Context)object2, (int)(bl2 ? 1 : 0));
                    object3.put((String)object6, (int)(bl2 ? 1 : 0));
                    object6 = "height";
                    int n3 = object4.heightPixels;
                    zzf zzf2 = com.google.android.gms.ads.internal.client.zzay.zzb();
                    int n4 = zzf2.zzb((Context)object2, n3);
                    object3.put((String)object6, n4);
                }
                catch (JSONException jSONException3) {
                    object3 = null;
                }
                {
                    jSONObject.put((String)object, object3);
                    object = zzbep.zziE;
                    object2 = zzba.zzc();
                    object = ((zzben)object2).zza((zzbeg)object);
                    object = (Boolean)object;
                    bl3 = (Boolean)object;
                    if (bl3) {
                        object = this.zzd;
                        object2 = "/clickRecorded";
                        object3 = new zzdkn(this, null);
                        ((zzdqs)object).zzl((String)object2, (zzblp)object3);
                    } else {
                        object = this.zzd;
                        object2 = "/logScionEvent";
                        object3 = new zzdkl(this, null);
                        ((zzdqs)object).zzl((String)object2, (zzblp)object3);
                    }
                    object = this.zzd;
                    object2 = "/nativeImpression";
                    object3 = new zzdkp(this, null);
                    ((zzdqs)object).zzl((String)object2, (zzblp)object3);
                    object = this.zzd;
                    object2 = "google.afma.nativeAds.handleImpression";
                    object = ((zzdqs)object).zzg((String)object2, jSONObject);
                    object2 = "Error during performing handleImpression";
                    zzccl.zza((ListenableFuture)object, (String)object2);
                    bl3 = this.zzu;
                    if (bl3) break block9;
                    object = this.zza;
                    object2 = this.zzk;
                    object3 = this.zzj;
                    object4 = this.zzl;
                }
                object5 = com.google.android.gms.ads.internal.zzu.zzs();
                object2 = ((VersionInfoParcel)object2).afmaVersion;
                object3 = object3.zzD.toString();
                object4 = object4.zzf;
                this.zzu = bl3 = ((zzay)object5).zzn((Context)object, (String)object2, (String)object3, (String)object4);
            }
            return true;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to create impression JSON.", jSONException2);
        return false;
    }

    public static /* bridge */ /* synthetic */ zzczj zzb(zzdkq zzdkq2) {
        return zzdkq2.zzh;
    }

    public static /* bridge */ /* synthetic */ zzdad zzc(zzdkq zzdkq2) {
        return zzdkq2.zzg;
    }

    public static /* bridge */ /* synthetic */ zzdhg zzd(zzdkq zzdkq2) {
        return zzdkq2.zzi;
    }

    public final boolean zzA() {
        int n3 = this.zza();
        if (n3 != 0) {
            Object object = zzbep.zzlA;
            zzben zzben2 = zzba.zzc();
            object = (Boolean)zzben2.zza((zzbeg)object);
            n3 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
            if (n3 != 0) {
                return this.zzl.zzi.zzj;
            }
        }
        return true;
    }

    public final boolean zzB() {
        return this.zzG();
    }

    public final boolean zzC(Bundle object) {
        Object object2 = "impression_reporting";
        boolean bl2 = this.zzF((String)object2);
        if (!bl2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        object2 = com.google.android.gms.ads.internal.client.zzay.zzb();
        String string2 = null;
        JSONObject jSONObject = ((zzf)object2).zzk((Bundle)object, null);
        object = zzbep.zzlv;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl3 = (Boolean)object;
        if (bl3) {
            string2 = this.zzD(null);
        }
        return this.zzH(null, null, null, null, string2, jSONObject, false);
    }

    public final int zza() {
        Object object = this.zzl.zzi;
        if (object != null) {
            object = zzbep.zzlA;
            zzben zzben2 = zzba.zzc();
            object = (Boolean)zzben2.zza((zzbeg)object);
            boolean bl2 = (Boolean)object;
            if (bl2) {
                return this.zzl.zzi.zzi;
            }
        }
        return 0;
    }

    public final JSONObject zze(View view, Map object, Map map2, ImageView.ScaleType scaleType) {
        String string2;
        Context context = this.zza;
        object = zzbz.zzd(context, (Map)object, map2, view, scaleType);
        map2 = zzbz.zzg(context, view);
        scaleType = zzbz.zzf(view);
        view = zzbz.zze(context, view);
        try {
            context = new JSONObject();
            string2 = "asset_view_signal";
        }
        catch (JSONException jSONException) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to create native ad view signals JSON.", jSONException);
            return null;
        }
        context.put(string2, object);
        object = "ad_view_signal";
        context.put((String)object, (Object)map2);
        object = "scroll_view_signal";
        context.put((String)object, (Object)scaleType);
        object = "lock_screen_signal";
        context.put((String)object, (Object)view);
        return context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject zzf(View view, Map map2, Map object, ImageView.ScaleType scaleType) {
        JSONException jSONException2;
        block3: {
            block2: {
                view = this.zze(view, map2, (Map)object, scaleType);
                map2 = new JSONObject();
                try {
                    boolean bl2 = this.zzx;
                    if (!bl2 || !(bl2 = this.zzG())) break block2;
                    object = "custom_click_gesture_eligible";
                    boolean bl3 = true;
                    map2.put((String)object, bl3);
                }
                catch (JSONException jSONException2) {
                    break block3;
                }
            }
            if (view == null) return map2;
            object = "nas";
            map2.put((String)object, view);
            return map2;
        }
        object = "Unable to create native click meta data JSON.";
        com.google.android.gms.ads.internal.util.client.zzm.zzh((String)object, jSONException2);
        return map2;
    }

    public final void zzg() {
        RemoteException remoteException2;
        block4: {
            block3: {
                zzcs zzcs2;
                try {
                    zzcs2 = this.zzC;
                    if (zzcs2 == null) break block3;
                }
                catch (RemoteException remoteException2) {}
                zzcs2.zze();
                return;
                break block4;
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void zzh() {
        JSONObject jSONObject = this.zzc;
        String string2 = "custom_one_point_five_click_enabled";
        boolean bl2 = jSONObject.optBoolean(string2, false);
        if (!bl2) {
            return;
        }
        this.zzn.zzb();
    }

    public final void zzi() {
        this.zzd.zzi();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzj(zzcw object) {
        RemoteException remoteException2;
        block4: {
            Object object2;
            boolean bl2;
            try {
                zzel zzel2;
                bl2 = this.zzw;
                if (bl2) {
                    return;
                }
                bl2 = true;
                if (object == null && (zzel2 = ((zzdlt)(object2 = this.zze)).zzk()) != null) {
                    this.zzw = bl2;
                    object = this.zzq;
                    Object object3 = ((zzdlt)object2).zzk();
                    object3 = ((zzel)object3).zzf();
                    object2 = this.zzs;
                    ((zzfoe)object).zzc((String)object3, (zzfmn)object2);
                    this.zzg();
                    return;
                }
            }
            catch (RemoteException remoteException2) {
                break block4;
            }
            this.zzw = bl2;
            zzfoe zzfoe2 = this.zzq;
            object = object.zzf();
            object2 = this.zzs;
            zzfoe2.zzc((String)object, (zzfmn)object2);
            this.zzg();
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void zzk(View view, View view2, Map map2, Map map3, boolean bl2, ImageView.ScaleType scaleType) {
        Object object = map2;
        Object object2 = this.zza;
        Map map4 = map3;
        ImageView.ScaleType scaleType2 = scaleType;
        map4 = zzbz.zzd((Context)object2, map2, map3, view2, scaleType);
        scaleType2 = zzbz.zzg((Context)object2, view2);
        JSONObject jSONObject = zzbz.zzf(view2);
        Object object3 = zzbz.zze((Context)object2, view2);
        String string2 = this.zzE(view, map2);
        object = this.zzz;
        Point point = this.zzy;
        point = zzbz.zzc(string2, (Context)object2, (Point)object, point);
        object = zzbep.zzdE;
        boolean bl3 = true;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl4 = (Boolean)object;
        object = bl3 == bl4 ? view2 : view;
        object2 = scaleType2;
        scaleType2 = jSONObject;
        jSONObject = object3;
        object3 = string2;
        this.zzn((View)object, (JSONObject)object2, (JSONObject)map4, (JSONObject)scaleType2, jSONObject, string2, (JSONObject)point, null, bl2, false);
    }

    public final void zzl(String string2) {
        this.zzn(null, null, null, null, null, string2, null, null, false, false);
    }

    public final void zzm(Bundle bundle) {
        String string2;
        Object object;
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Click data is null. No click is reported.");
            return;
        }
        String string3 = "click_reporting";
        boolean bl2 = this.zzF(string3);
        if (!bl2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        string3 = bundle.getBundle("click_signal");
        if (string3 != null) {
            object = "asset_id";
            string2 = string3 = string3.getString((String)object);
        } else {
            string2 = null;
        }
        JSONObject jSONObject = com.google.android.gms.ads.internal.client.zzay.zzb().zzk(bundle, null);
        object = this;
        this.zzn(null, null, null, null, null, string2, null, jSONObject, false, false);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzn(View var1_1, JSONObject var2_4, JSONObject var3_5, JSONObject var4_6, JSONObject var5_7, String var6_8, JSONObject var7_9, JSONObject var8_10, boolean var9_11, boolean var10_12) {
        block24: {
            block26: {
                block25: {
                    var11_13 = "tracking_urls_and_actions";
                    var12_14 = "has_custom_click_handler";
                    try {
                        var13_15 = new JSONObject();
                        var14_16 = "ad";
                        var15_17 = this.zzc;
                        var13_15.put(var14_16, (Object)var15_17);
                        var14_16 = "asset_view_signal";
                        var13_15.put(var14_16, var3_5);
                        var3_5 = "ad_view_signal";
                        var13_15.put((String)var3_5, var2_4);
                        var2_4 = "click_signal";
                        var13_15.put((String)var2_4, var7_9);
                        var2_4 = "scroll_view_signal";
                        var13_15.put((String)var2_4, (Object)var4_6 /* !! */ );
                        var2_4 = "lock_screen_signal";
                        var13_15.put((String)var2_4, var5_7);
                        var2_4 = this.zzb;
                        var3_5 = this.zze;
                        var3_5 = var3_5.zzA();
                        var2_4 = var2_4.zzc((String)var3_5);
                        var16_18 = false;
                        var3_5 = null;
                        var17_19 = true;
                        if (var2_4 != null) {
                            var18_20 = true;
                        } else {
                            var18_20 = false;
                            var2_4 = null;
                        }
                        var13_15.put(var12_14, var18_20);
                        var2_4 = "provided_signals";
                        var13_15.put((String)var2_4, (Object)var8_10);
                        var2_4 = new JSONObject();
                        var5_7 = "asset_id";
                        var2_4.put((String)var5_7, var6_8);
                        var5_7 = "template";
                        var6_8 = this.zze;
                        var19_21 = var6_8.zzc();
                        var2_4.put((String)var5_7, (int)var19_21);
                        var5_7 = "view_aware_api_used";
                        var2_4.put((String)var5_7, var9_11);
                        var5_7 = "custom_mute_requested";
                        var6_8 = this.zzl;
                        var6_8 = var6_8.zzi;
                        if (var6_8 != null && (var19_21 = (boolean)var6_8.zzg)) {
                            var19_21 = true;
                        } else {
                            var19_21 = false;
                            var6_8 = null;
                        }
                    }
                    catch (JSONException var1_2) {
                        break block24;
                    }
                    var2_4.put((String)var5_7, var19_21);
                    var5_7 = "custom_mute_enabled";
                    var6_8 = this.zze;
                    var6_8 = var6_8.zzH();
                    var19_21 = var6_8.isEmpty();
                    if (var19_21) ** GOTO lbl-1000
                    var6_8 = this.zze;
                    if ((var6_8 = var6_8.zzk()) != null) {
                        var19_21 = true;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var19_21 = false;
                        var6_8 = null;
                    }
                    var2_4.put((String)var5_7, var19_21);
                    var5_7 = this.zzn;
                    var5_7 = var5_7.zza();
                    if (var5_7 != null && (var20_22 = (var5_7 = this.zzc).optBoolean((String)(var6_8 = "custom_one_point_five_click_enabled"), false))) {
                        var5_7 = "custom_one_point_five_click_eligible";
                        var2_4.put((String)var5_7, var17_19);
                    }
                    var5_7 = "timestamp";
                    var6_8 = this.zzo;
                    var21_23 = var6_8.currentTimeMillis();
                    var2_4.put((String)var5_7, var21_23);
                    var20_22 = this.zzx;
                    if (var20_22 && (var20_22 = this.zzG())) {
                        var5_7 = "custom_click_gesture_eligible";
                        var2_4.put((String)var5_7, var17_19);
                    }
                    if (var10_12) {
                        var5_7 = "is_custom_click_gesture";
                        var2_4.put((String)var5_7, var17_19);
                    }
                    var5_7 = this.zzb;
                    var6_8 = this.zze;
                    if ((var5_7 = var5_7.zzc((String)(var6_8 = var6_8.zzA()))) != null) {
                        var16_18 = true;
                    }
                    var2_4.put(var12_14, var16_18);
                    var3_5 = "click_signals";
                    var20_22 = false;
                    var5_7 = null;
                    try {
                        var6_8 = this.zzc;
                        var6_8 = var6_8.optJSONObject(var11_13);
                        if (var6_8 != null) break block25;
                        var6_8 = new JSONObject();
                    }
                    catch (Exception var1_3) {
                        break block26;
                    }
                }
                var7_9 = "click_string";
                var6_8 = var6_8.optString((String)var7_9);
                var7_9 = this.zzf;
                var7_9 = var7_9.zzc();
                var8_10 = this.zza;
                var1_1 = var7_9.zze((Context)var8_10, (String)var6_8, (View)var1_1);
                ** GOTO lbl130
            }
            var6_8 = "Exception obtaining click signals";
            {
                com.google.android.gms.ads.internal.util.client.zzm.zzh((String)var6_8, var1_3);
                var23_24 = false;
                var1_1 = null;
lbl130:
                // 2 sources

                var2_4.put((String)var3_5, var1_1);
                var1_1 = zzbep.zzeE;
                var3_5 = zzba.zzc();
                var1_1 = var3_5.zza((zzbeg)var1_1);
                var1_1 = (Boolean)var1_1;
                var23_24 = var1_1.booleanValue();
                if (var23_24) {
                    var1_1 = "open_chrome_custom_tab";
                    var2_4.put((String)var1_1, var17_19);
                }
                var1_1 = zzbep.zziI;
                var3_5 = zzba.zzc();
                var1_1 = var3_5.zza((zzbeg)var1_1);
                var23_24 = (var1_1 = (Boolean)var1_1).booleanValue();
                if (var23_24 && (var23_24 = PlatformVersion.isAtLeastR())) {
                    var1_1 = "try_fallback_for_deep_link";
                    var2_4.put((String)var1_1, var17_19);
                }
                var1_1 = zzbep.zziJ;
                var3_5 = zzba.zzc();
                var1_1 = var3_5.zza((zzbeg)var1_1);
                var23_24 = (var1_1 = (Boolean)var1_1).booleanValue();
                if (var23_24 && (var23_24 = PlatformVersion.isAtLeastR())) {
                    var1_1 = "in_app_link_handling_for_android_11_enabled";
                    var2_4.put((String)var1_1, var17_19);
                }
                var1_1 = "click";
                var13_15.put((String)var1_1, var2_4);
                var1_1 = new JSONObject();
                var2_4 = this.zzo;
                var24_25 = var2_4.currentTimeMillis();
                var4_6 /* !! */  = "time_from_last_touch_down";
                var21_23 = this.zzA;
                var21_23 = var24_25 - var21_23;
            }
            {
                var1_1.put((String)var4_6 /* !! */ , var21_23);
                var4_6 /* !! */  = "time_from_last_touch";
                var21_23 = this.zzB;
            }
            {
                var1_1.put((String)var4_6 /* !! */ , var24_25 -= var21_23);
                var2_4 = "touch_signal";
                var13_15.put((String)var2_4, var1_1);
                var1_1 = this.zzj;
                var23_24 = var1_1.zzaj;
                if (var23_24) {
                    var1_1 = this.zzc;
                    var1_1 = var1_1.get(var11_13);
                    if ((var1_1 = (JSONObject)var1_1) != null) {
                        var2_4 = "gws_query_id";
                        var5_7 = var1_1.getString((String)var2_4);
                    }
                    if (var5_7 != null) {
                        var1_1 = this.zzt;
                        var2_4 = this.zze;
                        var1_1.zzp((String)var5_7, (zzdlt)var2_4);
                    }
                }
                var1_1 = this.zzd;
                var2_4 = "google.afma.nativeAds.handleClick";
                var1_1 = var1_1.zzg((String)var2_4, var13_15);
                var2_4 = "Error during performing handleClick";
                zzccl.zza((ListenableFuture)var1_1, (String)var2_4);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to create click JSON.", var1_2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzo(View var1_1, View var2_2, Map var3_3, Map var4_4, boolean var5_5, ImageView.ScaleType var6_6, int var7_7) {
        block13: {
            block14: {
                block15: {
                    var8_8 = this;
                    var9_9 = var2_2;
                    var10_10 = var3_3;
                    var11_14 = this.zzc;
                    var12_15 = "allow_sdk_custom_click_gesture";
                    var13_16 = false;
                    var14_17 = null;
                    var15_18 = var11_14.optBoolean((String)var12_15, false);
                    if (var15_18) {
                        var11_14 = zzbep.zzlA;
                        var12_15 = zzba.zzc();
                        var11_14 = (Boolean)var12_15.zza((zzbeg)var11_14);
                        var15_18 = var11_14.booleanValue();
                        if (var15_18) {
                            var13_16 = true;
                        }
                    }
                    if (!var13_16) {
                        var15_18 = var8_8.zzx;
                        if (!var15_18) {
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                            return;
                        }
                        var15_18 = this.zzG();
                        if (!var15_18) {
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                            return;
                        }
                    }
                    var11_14 = var8_8.zza;
                    var12_15 = var4_4;
                    var16_19 = var6_6;
                    var16_19 = zzbz.zzd((Context)var11_14, (Map)var10_10, var4_4, (View)var9_9, var6_6);
                    var12_15 = zzbz.zzg(var8_8.zza, (View)var9_9);
                    var17_20 = zzbz.zzf(var2_2);
                    var18_21 /* !! */  = zzbz.zze(var8_8.zza, (View)var9_9);
                    var11_14 = var1_1;
                    var19_22 = var8_8.zzE(var1_1, (Map)var10_10);
                    var10_10 = var8_8.zza;
                    var11_14 = var8_8.zzz;
                    var20_23 = var8_8.zzy;
                    var20_23 = zzbz.zzc(var19_22, (Context)var10_10, (Point)var11_14, var20_23);
                    if (!var13_16) break block13;
                    try {
                        var11_14 = var8_8.zzc;
                        var14_17 = "custom_click_gesture_signal";
                        var10_10 = var8_8.zzz;
                        var21_24 = var8_8.zzy;
                    }
                    catch (JSONException var10_13) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", var10_13);
                        var11_14 = "FirstPartyNativeAdCore.performCustomClickGesture";
                        var9_9 = com.google.android.gms.ads.internal.zzu.zzo();
                        var9_9.zzw(var10_13, (String)var11_14);
                        break block13;
                    }
                    try {
                        var22_25 = new JSONObject();
                    }
                    catch (Exception var10_12) {
                        var22_25 = null;
                        break block14;
                    }
                    try {
                        var23_26 = new JSONObject();
                        var24_27 = new JSONObject();
                        var25_28 = "y";
                        var9_9 = "x";
                        if (var10_10 == null) break block15;
                        var26_29 = var10_10.x;
                        var23_26.put((String)var9_9, var26_29);
                        var27_30 = var10_10.y;
                        var23_26.put(var25_28, var27_30);
                    }
                    catch (Exception var10_11) {
                        break block14;
                    }
                }
                if (var21_24 != null) {
                    var27_30 = var21_24.x;
                    var24_27.put((String)var9_9, var27_30);
                    var27_30 = var21_24.y;
                    var24_27.put(var25_28, var27_30);
                }
                var10_10 = "start_point";
                var22_25.put((String)var10_10, (Object)var23_26);
                var10_10 = "end_point";
                var22_25.put((String)var10_10, (Object)var24_27);
                var10_10 = "duration_ms";
                var22_25.put((String)var10_10, var7_7);
                ** GOTO lbl93
            }
            var9_9 = "Error occurred while grabbing custom click gesture signals.";
            {
                com.google.android.gms.ads.internal.util.client.zzm.zzh((String)var9_9, (Throwable)var10_10);
lbl93:
                // 2 sources

                var11_14.put(var14_17, (Object)var22_25);
            }
        }
        var11_14 = this;
        var9_9 = var2_2;
        var14_17 = var16_19;
        var16_19 = var17_20;
        var17_20 = var18_21 /* !! */ ;
        var18_21 /* !! */  = var19_22;
        var19_22 = var20_23;
        this.zzn(var2_2, (JSONObject)var12_15, (JSONObject)var14_17, (JSONObject)var16_19, var17_20, (String)var18_21 /* !! */ , (JSONObject)var20_23, null, var5_5, true);
    }

    public final void zzp() {
        Object object;
        Object object2;
        try {
            object2 = new JSONObject();
            object = "ad";
        }
        catch (JSONException jSONException) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", jSONException);
            return;
        }
        Object object3 = this.zzc;
        object2.put((String)object, object3);
        object = this.zzd;
        object3 = "google.afma.nativeAds.handleDownloadedImpression";
        object2 = ((zzdqs)object).zzg((String)object3, (JSONObject)object2);
        object = "Error during performing handleDownloadedImpression";
        zzccl.zza((ListenableFuture)object2, (String)object);
    }

    public final void zzq(View object, Map map2, Map map3, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject jSONObject = zzbz.zzd(context, map2, map3, object, scaleType);
        JSONObject jSONObject2 = zzbz.zzg(context, object);
        JSONObject jSONObject3 = zzbz.zzf(object);
        JSONObject jSONObject4 = zzbz.zze(context, object);
        String string2 = this.zzD((View)object);
        object = this.zzj;
        boolean bl2 = zzbz.zzh(context, (zzfgt)object);
        this.zzH(jSONObject2, jSONObject, jSONObject3, jSONObject4, string2, null, bl2);
    }

    public final void zzr() {
        this.zzH(null, null, null, null, null, null, false);
    }

    public final void zzs(View object, MotionEvent motionEvent, View view) {
        long l2;
        object = zzbz.zza(motionEvent, view);
        this.zzy = object;
        object = this.zzo;
        this.zzB = l2 = object.currentTimeMillis();
        int n3 = motionEvent.getAction();
        if (n3 == 0) {
            this.zzr.zzb((InputEvent)motionEvent);
            this.zzA = l2;
            object = this.zzy;
            this.zzz = object;
        }
        object = MotionEvent.obtain((MotionEvent)motionEvent);
        motionEvent = this.zzy;
        float f5 = motionEvent.x;
        float f6 = motionEvent.y;
        object.setLocation(f5, f6);
        this.zzf.zzd((MotionEvent)object);
        object.recycle();
    }

    public final void zzt(Bundle bundle) {
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        String string2 = "touch_reporting";
        int n3 = this.zzF(string2);
        if (n3 == 0) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        n3 = (int)bundle.getFloat("x");
        int n4 = (int)bundle.getFloat("y");
        int n7 = bundle.getInt("duration_ms");
        this.zzf.zzc().zzl(n3, n4, n7);
    }

    public final void zzu(View view) {
        Object object = this.zzc;
        Object object2 = "custom_one_point_five_click_enabled";
        boolean bl2 = object.optBoolean((String)object2, false);
        if (!bl2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        object = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener((View.OnClickListener)object);
        view.setClickable(true);
        object.zzc = object2 = new Object(view);
    }

    public final void zzv() {
        this.zzx = true;
    }

    public final void zzw(zzcs zzcs2) {
        this.zzC = zzcs2;
    }

    public final void zzx(zzbjp zzbjp2) {
        JSONObject jSONObject = this.zzc;
        String string2 = "custom_one_point_five_click_enabled";
        boolean bl2 = jSONObject.optBoolean(string2, false);
        if (!bl2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        this.zzn.zzc(zzbjp2);
    }

    public final void zzy(View object, Map iterator, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object object2 = new Point();
        this.zzy = object2;
        object2 = new Point();
        this.zzz = object2;
        boolean bl2 = this.zzv;
        boolean bl3 = true;
        if (!bl2) {
            object2 = this.zzp;
            ((zzdhc)object2).zza((View)object);
            this.zzv = bl3;
        }
        object.setOnTouchListener(onTouchListener);
        object.setClickable(bl3);
        object.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        object = this.zzk;
        boolean bl4 = zzbz.zzi(object.clientJarVersion);
        if (iterator != null) {
            iterator = iterator.entrySet().iterator();
            while (bl2 = iterator.hasNext()) {
                object2 = (View)((WeakReference)iterator.next().getValue()).get();
                if (object2 == null) continue;
                if (bl4) {
                    object2.setOnTouchListener(onTouchListener);
                }
                object2.setClickable(bl3);
                object2.setOnClickListener(onClickListener);
            }
        }
        if (map2 != null) {
            boolean bl5;
            iterator = map2.entrySet().iterator();
            while (bl5 = iterator.hasNext()) {
                map2 = (View)((WeakReference)iterator.next().getValue()).get();
                if (map2 == null) continue;
                if (bl4) {
                    map2.setOnTouchListener(onTouchListener);
                }
                onClickListener = null;
                map2.setClickable(false);
            }
        }
    }

    public final void zzz(View view, Map object) {
        object = new Point();
        this.zzy = object;
        object = new Point();
        this.zzz = object;
        if (view != null) {
            object = this.zzp;
            ((zzdhc)object).zzb(view);
        }
        this.zzv = false;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.widget.ImageView$ScaleType
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbrq;
import com.google.android.gms.internal.ads.zzbrr;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzczj;
import com.google.android.gms.internal.ads.zzdad;
import com.google.android.gms.internal.ads.zzdhg;
import com.google.android.gms.internal.ads.zzdmb;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfho;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdnu
implements zzdmb {
    private final zzbru zza;
    private final zzdad zzb;
    private final zzczj zzc;
    private final zzdhg zzd;
    private final Context zze;
    private final zzfgt zzf;
    private final VersionInfoParcel zzg;
    private final zzfho zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbrq zzl;
    private final zzbrr zzm;

    public zzdnu(zzbrq zzbrq2, zzbrr zzbrr2, zzbru zzbru2, zzdad zzdad2, zzczj zzczj2, zzdhg zzdhg2, Context context, zzfgt zzfgt2, VersionInfoParcel versionInfoParcel, zzfho zzfho2) {
        this.zzl = zzbrq2;
        this.zzm = zzbrr2;
        this.zza = zzbru2;
        this.zzb = zzdad2;
        this.zzc = zzczj2;
        this.zzd = zzdhg2;
        this.zze = context;
        this.zzf = zzfgt2;
        this.zzg = versionInfoParcel;
        this.zzh = zzfho2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzb(View object) {
        RemoteException remoteException2;
        block9: {
            boolean bl2;
            Object object2;
            block8: {
                try {
                    object2 = this.zza;
                    if (object2 == null || (bl2 = object2.zzA())) break block8;
                    object2 = this.zza;
                    object = ObjectWrapper.wrap(object);
                    object2.zzw((IObjectWrapper)object);
                    object = this.zzc;
                    ((zzczj)object).onAdClicked();
                    object = zzbep.zzkM;
                    object2 = zzba.zzc();
                    object = ((zzben)object2).zza((zzbeg)object);
                    object = (Boolean)object;
                    boolean bl3 = (Boolean)object;
                    if (!bl3) return;
                    object = this.zzd;
                    ((zzdhg)object).zzdG();
                    return;
                }
                catch (RemoteException remoteException2) {
                    break block9;
                }
            }
            object2 = this.zzl;
            if (object2 != null && !(bl2 = ((zzbrq)object2).zzx())) {
                object2 = this.zzl;
                object = ObjectWrapper.wrap(object);
                ((zzbrq)object2).zzs((IObjectWrapper)object);
                object = this.zzc;
                ((zzczj)object).onAdClicked();
                object = zzbep.zzkM;
                object2 = zzba.zzc();
                object = ((zzben)object2).zza((zzbeg)object);
                object = (Boolean)object;
                boolean bl4 = (Boolean)object;
                if (!bl4) return;
                object = this.zzd;
                ((zzdhg)object).zzdG();
                return;
            } else {
                object2 = this.zzm;
                if (object2 == null || (bl2 = ((zzbrr)object2).zzv())) return;
                object2 = this.zzm;
                object = ObjectWrapper.wrap(object);
                ((zzbrr)object2).zzq((IObjectWrapper)object);
                object = this.zzc;
                ((zzczj)object).onAdClicked();
                object = zzbep.zzkM;
                object2 = zzba.zzc();
                object = ((zzben)object2).zza((zzbeg)object);
                object = (Boolean)object;
                boolean bl5 = (Boolean)object;
                if (!bl5) return;
                object = this.zzd;
                ((zzdhg)object).zzdG();
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call handleClick", remoteException2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final HashMap zzc(Map map2) {
        HashMap hashMap = new HashMap();
        if (map2 == null) {
            return hashMap;
        }
        synchronized (map2) {
            try {
                boolean bl2;
                Object object = map2.entrySet();
                object = object.iterator();
                while (bl2 = object.hasNext()) {
                    Object object2 = object.next();
                    object2 = (Map.Entry)object2;
                    Object object3 = object2.getValue();
                    object3 = (WeakReference)object3;
                    object3 = ((Reference)object3).get();
                    if ((object3 = (View)object3) == null) continue;
                    object2 = object2.getKey();
                    object2 = (String)object2;
                    hashMap.put(object2, object3);
                }
                return hashMap;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final boolean zzA() {
        return true;
    }

    public final boolean zzB() {
        return this.zzf.zzM;
    }

    public final boolean zzC(Bundle bundle) {
        return false;
    }

    public final int zza() {
        return 0;
    }

    public final JSONObject zze(View view, Map map2, Map map3, ImageView.ScaleType scaleType) {
        return null;
    }

    public final JSONObject zzf(View view, Map map2, Map map3, ImageView.ScaleType scaleType) {
        return null;
    }

    public final void zzg() {
        throw null;
    }

    public final void zzh() {
    }

    public final void zzi() {
    }

    public final void zzj(zzcw zzcw2) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zzk(View view, View object, Map map2, Map map3, boolean bl2, ImageView.ScaleType scaleType) {
        boolean bl3 = this.zzj;
        if (bl3) {
            object = this.zzf;
            bl3 = object.zzM;
            if (bl3) {
                return;
            }
        }
        this.zzb(view);
    }

    public final void zzl(String string2) {
    }

    public final void zzm(Bundle bundle) {
    }

    public final void zzo(View object, View view, Map map2, Map map3, boolean bl2, ImageView.ScaleType scaleType, int n3) {
        boolean bl3 = this.zzj;
        if (!bl3) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
            return;
        }
        object = this.zzf;
        bl3 = object.zzM;
        if (!bl3) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
            return;
        }
        this.zzb(view);
    }

    public final void zzp() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzq(View object, Map map2, Map object2, ImageView.ScaleType object3) {
        RemoteException remoteException2;
        block6: {
            boolean bl2;
            block5: {
                try {
                    bl2 = this.zzi;
                    if (bl2) break block5;
                    object = zzu.zzs();
                    map2 = this.zze;
                    object2 = this.zzg;
                    object2 = ((VersionInfoParcel)object2).afmaVersion;
                    object3 = this.zzf;
                    object3 = object3.zzD;
                    object3 = object3.toString();
                    Object object4 = this.zzh;
                    object4 = ((zzfho)object4).zzf;
                    this.zzi = bl2 = ((zzay)object).zzn((Context)map2, (String)object2, (String)object3, (String)object4);
                }
                catch (RemoteException remoteException2) {
                    break block6;
                }
            }
            if (!(bl2 = this.zzk)) {
                return;
            }
            object = this.zza;
            if (object != null && !(bl2 = object.zzB())) {
                object = this.zza;
                object.zzx();
                object = this.zzb;
                ((zzdad)object).zza();
                return;
            }
            object = this.zzl;
            if (object != null && !(bl2 = ((zzbrq)object).zzy())) {
                object = this.zzl;
                ((zzbrq)object).zzt();
                object = this.zzb;
                ((zzdad)object).zza();
                return;
            }
            object = this.zzm;
            if (object == null) return;
            bl2 = ((zzbrr)object).zzw();
            if (bl2) return;
            object = this.zzm;
            ((zzbrr)object).zzr();
            object = this.zzb;
            ((zzdad)object).zza();
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call recordImpression", remoteException2);
    }

    public final void zzr() {
    }

    public final void zzs(View view, MotionEvent motionEvent, View view2) {
    }

    public final void zzt(Bundle bundle) {
    }

    public final void zzu(View view) {
    }

    public final void zzv() {
        this.zzj = true;
    }

    public final void zzw(zzcs zzcs2) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zzx(zzbjp zzbjp2) {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzy(View var1_1, Map var2_3, Map var3_4, View.OnTouchListener var4_5, View.OnClickListener var5_6) {
        block26: {
            try {
                var1_1 /* !! */  = ObjectWrapper.wrap(var1_1 /* !! */ );
                var4_5 = this.zzf;
                var4_5 = var4_5.zzak;
                var5_6 = zzbep.zzby;
                var6_7 = zzba.zzc();
                var5_6 = var6_7.zza((zzbeg)var5_6);
                var5_6 = (Boolean)var5_6;
                var7_8 = var5_6.booleanValue();
                var8_9 = true;
                if (var7_8 != 0 && (var7_8 = var4_5.length()) != 0) {
                    var5_6 = var2_3 == null ? new HashMap() : var2_3;
                    var9_10 = var3_4 == null ? new HashMap() : var3_4;
                    var10_11 = new HashMap<K, V>();
                    var10_11.putAll(var5_6);
                    var10_11.putAll(var9_10);
                    var5_6 = var4_5.keys();
                    break block26;
                }
                ** GOTO lbl77
            }
            catch (RemoteException var1_2) {}
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call trackView", var1_2);
            return;
        }
        block15: while (true) {
            block27: {
                block28: {
                    if (!(var11_12 = var5_6.hasNext())) ** GOTO lbl77
                    var9_10 = var5_6.next();
                    var12_13 /* !! */  = var4_5.optJSONArray((String)(var9_10 = (String)var9_10));
                    if (var12_13 /* !! */  == null) continue;
                    var13_14 = var10_11.get(var9_10);
                    if ((var13_14 = (WeakReference)var13_14) == null || (var13_14 = var13_14.get()) == null) ** GOTO lbl75
                    var13_14 = var13_14.getClass();
                    var14_15 = zzbep.zzbz;
                    var15_16 = zzba.zzc();
                    var14_15 = var15_16.zza((zzbeg)var14_15);
                    var16_17 = (var14_15 = (Boolean)var14_15).booleanValue();
                    if (!var16_17 || !(var11_12 = var9_10.equals(var14_15 = "3010"))) ** GOTO lbl64
                    var9_10 = this.zza;
                    var13_14 = null;
                    if (var9_10 == null) ** GOTO lbl-1000
                    var9_10 = var9_10.zzn();
                    break block27;
                    {
                        catch (RemoteException | IllegalArgumentException v0) {}
                    }
lbl-1000:
                    // 1 sources

                    {
                        var9_10 = this.zzl;
                        if (var9_10 == null) ** GOTO lbl-1000
                    }
                    var9_10 = var9_10.zzk();
                    break block27;
lbl-1000:
                    // 1 sources

                    {
                        var9_10 = this.zzm;
                        if (var9_10 == null) break block28;
                    }
                    var9_10 = var9_10.zzj();
                    break block27;
                }
                var11_12 = false;
                var9_10 = null;
            }
            if (var9_10 == null) ** GOTO lbl62
            {
                var13_14 = ObjectWrapper.unwrap(var9_10);
lbl62:
                // 3 sources

                if (var13_14 == null) ** GOTO lbl75
                var13_14 = var13_14.getClass();
lbl64:
                // 2 sources

                try {
                    var9_10 = new ArrayList();
                    zzbw.zzc(var12_13 /* !! */ , var9_10);
                    zzu.zzp();
                    var12_13 /* !! */  = this.zze;
                    var12_13 /* !! */  = var12_13 /* !! */ .getClassLoader();
                    var9_10 = var9_10.iterator();
lbl73:
                    // 2 sources

                    while (true) {
                        block29: {
                            if (var16_17 = var9_10.hasNext()) break block29;
lbl75:
                            // 3 sources

                            var8_9 = false;
                            var6_7 = null;
lbl77:
                            // 3 sources

                            this.zzk = var8_9;
                            var2_3 = zzdnu.zzc((Map)var2_3);
                            var3_4 = zzdnu.zzc((Map)var3_4);
                            var4_5 = this.zza;
                            if (var4_5 != null) {
                                var2_3 = ObjectWrapper.wrap(var2_3);
                                var3_4 = ObjectWrapper.wrap(var3_4);
                                var4_5.zzy((IObjectWrapper)var1_1 /* !! */ , (IObjectWrapper)var2_3, (IObjectWrapper)var3_4);
                                return;
                            }
                            var4_5 = this.zzl;
                            if (var4_5 != null) {
                                var2_3 = ObjectWrapper.wrap(var2_3);
                                var3_4 = ObjectWrapper.wrap(var3_4);
                                var4_5.zzv((IObjectWrapper)var1_1 /* !! */ , (IObjectWrapper)var2_3, (IObjectWrapper)var3_4);
                                var2_3 = this.zzl;
                                var2_3.zzu((IObjectWrapper)var1_1 /* !! */ );
                                return;
                            }
                            var4_5 = this.zzm;
                            if (var4_5 != null) {
                                var2_3 = ObjectWrapper.wrap(var2_3);
                                var3_4 = ObjectWrapper.wrap(var3_4);
                                var4_5.zzt((IObjectWrapper)var1_1 /* !! */ , (IObjectWrapper)var2_3, (IObjectWrapper)var3_4);
                                var2_3 = this.zzm;
                                var2_3.zzs((IObjectWrapper)var1_1 /* !! */ );
                            }
                            return;
                        }
                        var14_15 = var9_10.next();
                        var14_15 = (String)var14_15;
                        break;
                    }
                }
                catch (JSONException v1) {
                    continue;
                }
                {
                    var16_17 = (var14_15 = Class.forName((String)var14_15, false, (ClassLoader)var12_13 /* !! */ )).isAssignableFrom((Class<?>)var13_14);
                    if (!var16_17) continue;
                    continue block15;
                }
            }
            break;
        }
        catch (Throwable v2) {
            ** continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzz(View object, Map object2) {
        RemoteException remoteException2;
        block5: {
            try {
                object = ObjectWrapper.wrap(object);
                object2 = this.zza;
                if (object2 != null) {
                    object2.zzz((IObjectWrapper)object);
                    return;
                }
            }
            catch (RemoteException remoteException2) {
                break block5;
            }
            object2 = this.zzl;
            if (object2 != null) {
                ((zzbrq)object2).zzw((IObjectWrapper)object);
                return;
            }
            object2 = this.zzm;
            if (object2 != null) {
                ((zzbrr)object2).zzu((IObjectWrapper)object);
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call untrackView", remoteException2);
    }
}


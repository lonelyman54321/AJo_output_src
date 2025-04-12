/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzfwd;
import com.google.android.gms.internal.ads.zzfwe;
import com.google.android.gms.internal.ads.zzfwf;
import com.google.android.gms.internal.ads.zzfwg;
import com.google.android.gms.internal.ads.zzfwp;
import com.google.android.gms.internal.ads.zzfwr;
import com.google.android.gms.internal.ads.zzfws;
import com.google.android.gms.internal.ads.zzfwt;
import com.google.android.gms.internal.ads.zzfwu;
import com.google.android.gms.internal.ads.zzfxj;
import com.google.android.gms.internal.ads.zzgge;
import java.util.HashMap;
import java.util.Map;

public final class zzx {
    private String zza = null;
    private String zzb = null;
    private zzchd zzc = null;
    private zzfwf zzd = null;
    private boolean zze = false;
    private zzfws zzf;

    private final zzfwu zzl() {
        zzfwt zzfwt2 = zzfwu.zzc();
        Object object = zzbep.zzlx;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)(object = this.zzb)))) {
            object = this.zzb;
            zzfwt2.zza((String)object);
        } else {
            object = this.zza;
            if (object != null) {
                zzfwt2.zzb((String)object);
            } else {
                object = "Missing session token and/or appId";
                object2 = "onLMDupdate";
                this.zzf((String)object, (String)object2);
            }
        }
        return zzfwt2.zzc();
    }

    private final void zzm() {
        zzfws zzfws2 = this.zzf;
        if (zzfws2 == null) {
            this.zzf = zzfws2 = new zzw(this);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzchd hashMap, Context object) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    this.zzc = hashMap;
                    boolean bl2 = this.zzk((Context)object);
                    if (!bl2) {
                        hashMap = "Unable to bind";
                        object = "on_play_store_bind";
                        this.zzf((String)((Object)hashMap), (String)object);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                hashMap = new HashMap<Context, String>();
                object = "action";
                String string2 = "fetch_completed";
                hashMap.put((Context)object, string2);
                object = "on_play_store_bind";
                this.zze((String)object, hashMap);
                return;
            }
            throw throwable2;
        }
    }

    public final void zzb() {
        zzfwf zzfwf2;
        boolean bl2 = this.zze;
        if (bl2 && (zzfwf2 = this.zzd) != null) {
            zzfwu zzfwu2 = this.zzl();
            zzfws zzfws2 = this.zzf;
            zzfwf2.zza(zzfwu2, zzfws2);
            this.zzd("onLMDOverlayCollapse");
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
    }

    public final void zzc() {
        zzfwf zzfwf2;
        boolean bl2 = this.zze;
        if (bl2 && (zzfwf2 = this.zzd) != null) {
            Object object = zzfwe.zzc();
            Object object2 = zzbep.zzlx;
            Object object3 = zzba.zzc();
            object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
            boolean bl3 = (Boolean)object2;
            if (bl3 && !(bl3 = TextUtils.isEmpty((CharSequence)(object2 = this.zzb)))) {
                object2 = this.zzb;
                ((zzfwd)object).zza((String)object2);
            } else {
                object2 = this.zza;
                if (object2 != null) {
                    ((zzfwd)object).zzb((String)object2);
                } else {
                    object2 = "Missing session token and/or appId";
                    object3 = "onLMDupdate";
                    this.zzf((String)object2, (String)object3);
                }
            }
            object = ((zzfwd)object).zzc();
            object2 = this.zzf;
            zzfwf2.zzb((zzfwe)object, (zzfws)object2);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
    }

    public final void zzd(String string2) {
        HashMap hashMap = new HashMap();
        this.zze(string2, hashMap);
    }

    public final void zze(String string2, Map map2) {
        zzgge zzgge2 = zzcci.zze;
        zzv zzv2 = new zzv(this, string2, map2);
        zzgge2.execute(zzv2);
    }

    public final void zzf(String string2, String string3) {
        com.google.android.gms.ads.internal.util.zze.zza(string2);
        HashMap<String, String> hashMap = this.zzc;
        if (hashMap != null) {
            hashMap = new HashMap<String, String>();
            String string4 = "message";
            hashMap.put(string4, string2);
            hashMap.put("action", string3);
            string2 = "onError";
            this.zze(string2, hashMap);
        }
    }

    public final void zzg() {
        zzfwf zzfwf2;
        boolean bl2 = this.zze;
        if (bl2 && (zzfwf2 = this.zzd) != null) {
            zzfwu zzfwu2 = this.zzl();
            zzfws zzfws2 = this.zzf;
            zzfwf2.zzc(zzfwu2, zzfws2);
            this.zzd("onLMDOverlayExpand");
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
    }

    public final /* synthetic */ void zzh(String string2, Map map2) {
        zzchd zzchd2 = this.zzc;
        if (zzchd2 != null) {
            zzchd2.zzd(string2, map2);
        }
    }

    public final void zzi(zzfwr object) {
        Object object2 = ((zzfwr)object).zzb();
        int n3 = TextUtils.isEmpty((CharSequence)object2);
        if (n3 == 0) {
            object2 = zzbep.zzlx;
            zzben zzben2 = zzba.zzc();
            object2 = (Boolean)zzben2.zza((zzbeg)object2);
            n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
            if (n3 == 0) {
                this.zza = object2 = ((zzfwr)object).zzb();
            }
        }
        n3 = ((zzfwr)object).zza();
        switch (n3) {
            default: {
                return;
            }
            case 8160: 
            case 8161: 
            case 8162: {
                object2 = new HashMap();
                object = String.valueOf(((zzfwr)object).zza());
                ((HashMap)object2).put("error", object);
                this.zze("onLMDOverlayFailedToOpen", (Map)object2);
                return;
            }
            case 8157: {
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                return;
            }
            case 8155: {
                this.zzd("onLMDOverlayClose");
                return;
            }
            case 8153: {
                this.zzd("onLMDOverlayClicked");
                return;
            }
            case 8152: 
        }
        this.zzd("onLMDOverlayOpened");
    }

    public final void zzj(zzchd object, zzfwp zzfwp2) {
        boolean bl2;
        if (object == null) {
            this.zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = object;
        boolean bl3 = this.zze;
        if (!bl3 && !(bl2 = this.zzk((Context)(object = object.getContext())))) {
            this.zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        object = zzbep.zzlx;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        bl2 = (Boolean)object;
        if (bl2) {
            this.zzb = object = zzfwp2.zzh();
        }
        this.zzm();
        object = this.zzd;
        if (object != null) {
            object2 = this.zzf;
            object.zzd(zzfwp2, (zzfws)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzk(Context object) {
        synchronized (this) {
            Throwable throwable2;
            block10: {
                boolean bl2;
                block9: {
                    block8: {
                        block7: {
                            try {
                                boolean bl3 = zzfxj.zza(object);
                                if (bl3) break block7;
                            }
                            catch (Throwable throwable2) {}
                            return false;
                        }
                        try {}
                        catch (NullPointerException nullPointerException) {
                            String string2 = "Error connecting LMD Overlay service";
                            com.google.android.gms.ads.internal.util.zze.zza(string2);
                            string2 = "LastMileDeliveryOverlay.bindLastMileDeliveryService";
                            zzcby zzcby2 = zzu.zzo();
                            zzcby2.zzw(nullPointerException, string2);
                            break block9;
                        }
                        break block8;
                        break block10;
                    }
                    object = zzfwg.zza(object);
                    this.zzd = object;
                }
                object = this.zzd;
                if (object == null) {
                    this.zze = false;
                    return false;
                }
                this.zzm();
                this.zze = bl2 = true;
                return bl2;
            }
            throw throwable2;
        }
    }
}


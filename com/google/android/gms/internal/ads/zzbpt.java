/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zzcc;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzboz;
import com.google.android.gms.internal.ads.zzbpa;
import com.google.android.gms.internal.ads.zzbpb;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbpf;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpi;
import com.google.android.gms.internal.ads.zzbpj;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbps;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzccr;
import com.google.android.gms.internal.ads.zzccu;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfuv;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

public final class zzbpt {
    private final Object zza;
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzfmq zze;
    private final zzbd zzf;
    private final zzbd zzg;
    private zzbps zzh;
    private int zzi;

    public zzbpt(Context context, VersionInfoParcel versionInfoParcel, String string2, zzbd zzbd2, zzbd zzbd3, zzfmq zzfmq2) {
        Object object;
        this.zza = object = new Object();
        this.zzi = 1;
        this.zzc = string2;
        this.zzb = context = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzfmq2;
        this.zzf = zzbd2;
        this.zzg = zzbd3;
    }

    public static /* bridge */ /* synthetic */ int zza(zzbpt zzbpt2) {
        return zzbpt2.zzi;
    }

    public static /* bridge */ /* synthetic */ zzbps zzc(zzbpt zzbpt2) {
        return zzbpt2.zzh;
    }

    public static /* bridge */ /* synthetic */ zzfmq zze(zzbpt zzbpt2) {
        return zzbpt2.zze;
    }

    public static /* bridge */ /* synthetic */ Object zzf(zzbpt zzbpt2) {
        return zzbpt2.zza;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzbpt zzbpt2, zzbps zzbps2) {
        zzbpt2.zzh = zzbps2;
    }

    public static /* bridge */ /* synthetic */ void zzh(zzbpt zzbpt2, int n3) {
        zzbpt2.zzi = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final zzbpn zzb(zzaxd object) {
        Throwable throwable322;
        block13: {
            int n3;
            int n4;
            int n7;
            Object object2;
            Object object3;
            block12: {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
                object = this.zza;
                // MONITORENTER : object
                object3 = "getEngine: Lock acquired";
                com.google.android.gms.ads.internal.util.zze.zza((String)object3);
                object3 = "refreshIfDestroyed: Trying to acquire lock";
                com.google.android.gms.ads.internal.util.zze.zza((String)object3);
                object3 = this.zza;
                // MONITORENTER : object3
                object2 = "refreshIfDestroyed: Lock acquired";
                try {
                    com.google.android.gms.ads.internal.util.zze.zza((String)object2);
                    object2 = this.zzh;
                    if (object2 == null || (n7 = this.zzi) != 0) break block12;
                    zzboz zzboz2 = new zzboz(this);
                    zzbpa zzbpa2 = new zzbpa();
                    ((zzccu)object2).zzj(zzboz2, zzbpa2);
                }
                catch (Throwable throwable322) {
                    break block13;
                }
            }
            // MONITOREXIT : object3
            object3 = "refreshIfDestroyed: Lock released";
            com.google.android.gms.ads.internal.util.zze.zza((String)object3);
            object3 = this.zzh;
            object2 = null;
            n7 = 2;
            if (object3 != null && (n4 = ((zzccu)object3).zze()) != (n3 = -1)) {
                n4 = this.zzi;
                if (n4 == 0) {
                    object3 = "getEngine (NO_UPDATE): Lock released";
                    com.google.android.gms.ads.internal.util.zze.zza((String)object3);
                    object3 = this.zzh;
                    object3 = ((zzbps)object3).zza();
                    // MONITOREXIT : object
                    return object3;
                }
                n3 = 1;
                if (n4 == n3) {
                    this.zzi = n7;
                    this.zzd(null);
                    object3 = "getEngine (PENDING_UPDATE): Lock released";
                    com.google.android.gms.ads.internal.util.zze.zza((String)object3);
                    object3 = this.zzh;
                    object3 = ((zzbps)object3).zza();
                    // MONITOREXIT : object
                    return object3;
                }
                object3 = "getEngine (UPDATING): Lock released";
                com.google.android.gms.ads.internal.util.zze.zza((String)object3);
                object3 = this.zzh;
                object3 = ((zzbps)object3).zza();
                // MONITOREXIT : object
                return object3;
            }
            this.zzi = n7;
            this.zzh = object3 = this.zzd(null);
            object3 = "getEngine (NULL or REJECTED): Lock released";
            com.google.android.gms.ads.internal.util.zze.zza((String)object3);
            object3 = this.zzh;
            object3 = ((zzbps)object3).zza();
            // MONITOREXIT : object
            return object3;
        }
        throw throwable322;
    }

    public final zzbps zzd(zzaxd object) {
        object = this.zzb;
        Object object2 = zzfmu.zzg;
        object = zzfmb.zza((Context)object, (zzfmu)object2);
        object.zzj();
        Object object3 = this.zzg;
        object2 = new zzbps((zzbd)object3);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        object3 = zzcci.zze;
        Object object4 = new zzbpd(this, null, (zzbps)object2);
        object3.execute((Runnable)object4);
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        object3 = new zzbpi(this, (zzbps)object2, (zzfmc)object);
        object4 = new zzbpj(this, (zzbps)object2, (zzfmc)object);
        ((zzccu)object2).zzj((zzccr)object3, (zzccp)object4);
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final /* synthetic */ void zzi(zzbps object, zzboo object2, ArrayList object3, long l2) {
        block7: {
            String string2 = "Could not receive /jsLoaded in ";
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
            Object object4 = this.zza;
            // MONITORENTER : object4
            Object object5 = "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired";
            com.google.android.gms.ads.internal.util.zze.zza((String)object5);
            int n3 = ((zzccu)object).zze();
            int n4 = -1;
            if (n3 == n4 || (n3 = ((zzccu)object).zze()) == (n4 = 1)) break block7;
            object5 = zzbep.zzhO;
            Object object6 = zzba.zzc();
            object5 = ((zzben)object6).zza((zzbeg)object5);
            n3 = (int)(((Boolean)(object5 = (Boolean)object5)).booleanValue() ? 1 : 0);
            if (n3 != 0) {
                object6 = "Unable to receive /jsLoaded GMSG.";
                object5 = new TimeoutException((String)object6);
                object6 = "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener";
                ((zzccu)object).zzh((Throwable)object5, (String)object6);
            } else {
                ((zzccu)object).zzg();
            }
            object5 = zzcci.zze;
            Objects.requireNonNull(object2);
            object6 = new zzbpb((zzboo)object2);
            object5.execute((Runnable)object6);
            object2 = zzbep.zzc;
            object5 = zzba.zzc();
            object2 = ((zzben)object5).zza((zzbeg)object2);
            object2 = String.valueOf(object2);
            int n7 = ((zzccu)object).zze();
            n3 = this.zzi;
            n4 = 0;
            object6 = null;
            object3 = ((ArrayList)object3).get(0);
            object3 = String.valueOf(object3);
            object6 = zzu.zzB();
            long l3 = object6.currentTimeMillis() - l2;
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append((String)object2);
            object2 = " ms. JS engine session reference status(onEngLoadedTimeout) is ";
            stringBuilder.append((String)object2);
            stringBuilder.append(n7);
            object = ". Update status(onEngLoadedTimeout) is ";
            stringBuilder.append((String)object);
            stringBuilder.append(n3);
            object = ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ";
            stringBuilder.append((String)object);
            stringBuilder.append((String)object3);
            object = " ms. Total latency(onEngLoadedTimeout) is ";
            stringBuilder.append((String)object);
            stringBuilder.append(l3);
            object = " ms. Rejecting.";
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            com.google.android.gms.ads.internal.util.zze.zza((String)object);
            // MONITOREXIT : object4
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
            return;
        }
        object = "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled";
        com.google.android.gms.ads.internal.util.zze.zza((String)object);
        // MONITOREXIT : object4
    }

    public final /* synthetic */ void zzj(zzaxd object, zzbps zzbps2) {
        Object object2;
        Object object3;
        long l2 = zzu.zzB().currentTimeMillis();
        object = new ArrayList();
        Object object4 = "loadJavascriptEngine > Before createJavascriptEngine";
        try {
            com.google.android.gms.ads.internal.util.zze.zza((String)object4);
            object4 = this.zzb;
        }
        catch (Throwable throwable) {
            zzm.zzh("Error creating webview.", throwable);
            object4 = zzbep.zzhO;
            object3 = zzba.zzc();
            object4 = (Boolean)((zzben)object3).zza((zzbeg)object4);
            boolean bl2 = (Boolean)object4;
            if (bl2) {
                zzbps2.zzh(throwable, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            zzu.zzo().zzw(throwable, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbps2.zzg();
            return;
        }
        object3 = this.zzd;
        zzfuv zzfuv2 = null;
        zzbow zzbow2 = new zzbow((Context)object4, (VersionInfoParcel)object3, null, null);
        object4 = "loadJavascriptEngine > After createJavascriptEngine";
        com.google.android.gms.ads.internal.util.zze.zza((String)object4);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
        object4 = object2;
        object3 = this;
        Object object5 = zzbow2;
        object2 = new zzbpc(this, (ArrayList)object, l2, zzbps2, zzbow2);
        zzbow2.zzk((zzbpc)object2);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
        object4 = object5;
        object5 = new zzbpe(this, l2, zzbps2, zzbow2);
        zzbow2.zzq("/jsLoaded", (zzblp)object5);
        object4 = new zzcc();
        object3 = new zzbpf(this, null, zzbow2, (zzcc)object4);
        ((zzcc)object4).zzb(object3);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
        zzbow2.zzq("/requestReload", (zzblp)object3);
        object4 = String.valueOf(this.zzc);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat((String)object4));
        object4 = this.zzc;
        object3 = ".js";
        boolean bl3 = ((String)object4).endsWith((String)object3);
        if (bl3) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
            object4 = this.zzc;
            zzbow2.zzh((String)object4);
            object4 = "loadJavascriptEngine > After newEngine.loadJavascript";
            com.google.android.gms.ads.internal.util.zze.zza((String)object4);
        } else {
            object4 = this.zzc;
            object3 = "<html>";
            bl3 = ((String)object4).startsWith((String)object3);
            if (bl3) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                object4 = this.zzc;
                zzbow2.zzf((String)object4);
                object4 = "loadJavascriptEngine > After newEngine.loadHtml";
                com.google.android.gms.ads.internal.util.zze.zza((String)object4);
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                object4 = this.zzc;
                zzbow2.zzg((String)object4);
                object4 = "loadJavascriptEngine > After newEngine.loadHtmlWrapper";
                com.google.android.gms.ads.internal.util.zze.zza((String)object4);
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
        zzfuv2 = zzt.zza;
        object4 = object2;
        object3 = this;
        object2 = new zzbph(this, zzbps2, zzbow2, (ArrayList)object, l2);
        object = zzbep.zzd;
        long l3 = ((Integer)zzba.zzc().zza((zzbeg)object)).intValue();
        zzfuv2.postDelayed((Runnable)object2, l3);
    }

    public final /* synthetic */ void zzk(zzboo zzboo2) {
        boolean bl2 = zzboo2.zzi();
        if (bl2) {
            bl2 = true;
            this.zzi = (int)(bl2 ? 1 : 0);
        }
    }
}


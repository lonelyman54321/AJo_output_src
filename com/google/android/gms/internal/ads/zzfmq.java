/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Binder
 *  android.os.Build$VERSION
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbyd;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdsq;
import com.google.android.gms.internal.ads.zzdzd;
import com.google.android.gms.internal.ads.zzeec;
import com.google.android.gms.internal.ads.zzeee;
import com.google.android.gms.internal.ads.zzeef;
import com.google.android.gms.internal.ads.zzfmg;
import com.google.android.gms.internal.ads.zzfmp;
import com.google.android.gms.internal.ads.zzfms;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfmw;
import com.google.android.gms.internal.ads.zzfmy;
import com.google.android.gms.internal.ads.zzfna;
import com.google.android.gms.internal.ads.zzfnc;
import com.google.android.gms.internal.ads.zzfnf;
import com.google.android.gms.internal.ads.zzfnh;
import com.google.android.gms.internal.ads.zzfni;
import com.google.android.gms.internal.ads.zzfnj;
import com.google.android.gms.internal.ads.zzfnk;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzgzi;
import com.google.android.gms.internal.ads.zzhbi;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class zzfmq
implements Runnable {
    public static final Object zza;
    public static Boolean zzb;
    private static final Object zzc;
    private static final Object zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzfnh zzg;
    private String zzh;
    private int zzi;
    private final zzdsq zzj;
    private final List zzk;
    private boolean zzl;
    private final zzeef zzm;
    private final zzbyd zzn;

    static {
        Object object;
        zza = object = new Object();
        zzc = object = new Object();
        zzd = object = new Object();
    }

    public zzfmq(Context object, VersionInfoParcel object2, zzdsq zzdsq2, zzeef zzeef2, zzbyd zzbyd2) {
        zzfnh zzfnh2;
        this.zzg = zzfnh2 = zzfnk.zzc();
        this.zzh = "";
        zzfnh2 = null;
        this.zzl = false;
        this.zze = object;
        this.zzf = object2;
        this.zzj = zzdsq2;
        this.zzm = zzeef2;
        this.zzn = zzbyd2;
        object = zzbep.zziQ;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            this.zzk = object = zzt.zzd();
            return;
        }
        this.zzk = object = zzgbc.zzm();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean zza() {
        Object object = zza;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                Object object2;
                block6: {
                    boolean bl2;
                    block7: {
                        try {
                            object2 = zzb;
                            if (object2 != null) break block6;
                            object2 = zzbgd.zzb;
                            object2 = ((zzbfv)object2).zze();
                            bl2 = (Boolean)(object2 = (Boolean)object2);
                            if (bl2) break block7;
                            zzb = object2 = Boolean.FALSE;
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    object2 = zzbgd.zza;
                    object2 = ((zzbfv)object2).zze();
                    object2 = (Double)object2;
                    double d2 = (Double)object2;
                    double d5 = Math.random();
                    double d7 = d5 - d2;
                    Object object3 = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
                    if (object3 < 0) {
                        bl2 = true;
                    } else {
                        bl2 = false;
                        object2 = null;
                    }
                    zzb = object2 = Boolean.valueOf(bl2);
                }
                object2 = zzb;
                return (Boolean)object2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        Exception exception2;
        block13: {
            boolean bl2 = zzfmq.zza();
            if (!bl2) {
                return;
            }
            Object object = zzc;
            // MONITORENTER : object
            Object object2 = this.zzg;
            int n3 = ((zzfnh)object2).zza();
            if (n3 == 0) {
                // MONITOREXIT : object
                return;
            }
            object2 = this.zzg;
            object2 = ((zzhbi)object2).zzbn();
            object2 = (zzfnk)object2;
            byte[] byArray = ((zzgzi)object2).zzaV();
            object2 = this.zzg;
            ((zzfnh)object2).zzc();
            // MONITOREXIT : object
            try {
                object2 = zzbep.zziK;
                Object object3 = zzba.zzc();
                Object object4 = object2 = ((zzben)object3).zza((zzbeg)object2);
                object4 = (String)object2;
                Object object5 = new HashMap();
                String string2 = "application/x-protobuf";
                int n4 = 60000;
                object3 = object;
                object = new zzeec((String)object4, n4, (Map)object5, byArray, string2, false);
                object2 = this.zze;
                object3 = this.zzf;
                object3 = ((VersionInfoParcel)object3).afmaVersion;
                object4 = this.zzn;
                n4 = Binder.getCallingUid();
                object5 = new zzeee((Context)object2, (String)object3, (zzbyd)object4, n4);
                ((zzeee)object5).zzb((zzeec)object);
                return;
            }
            catch (Exception exception2) {
                int n7;
                n3 = exception2 instanceof zzdzd;
                if (n3 == 0) break block13;
                object2 = exception2;
                object2 = (zzdzd)exception2;
                n3 = ((zzdzd)object2).zza();
                if (n3 == (n7 = 3)) return;
            }
        }
        zzu.zzo().zzv(exception2, "CuiMonitor.sendCuiPing");
    }

    public final void zzb(zzfmg zzfmg2) {
        zzgge zzgge2 = zzcci.zza;
        zzfmp zzfmp2 = new zzfmp(this, zzfmg2);
        zzgge2.zza(zzfmp2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final /* synthetic */ void zzc(zzfmg object) {
        int n3;
        Object object2;
        Object object3;
        Object object4;
        int n4;
        Object object5;
        block17: {
            block16: {
                object5 = zzd;
                // MONITORENTER : object5
                n4 = this.zzl;
                if (n4 == 0) break block16;
                // MONITOREXIT : object5
                break block17;
            }
            this.zzl = n4 = 1;
            n4 = zzfmq.zza();
            if (n4 == 0) {
                // MONITOREXIT : object5
            } else {
                try {
                    zzu.zzp();
                    object4 = this.zze;
                    object4 = zzt.zzp((Context)object4);
                    this.zzh = object4;
                }
                catch (RemoteException remoteException) {
                    object3 = zzu.zzo();
                    object2 = "CuiMonitor.gettingAppIdFromManifest";
                    ((zzcby)object3).zzw(remoteException, (String)object2);
                }
                object4 = GoogleApiAvailabilityLight.getInstance();
                object3 = this.zze;
                this.zzi = n4 = ((GoogleApiAvailabilityLight)object4).getApkVersion((Context)object3);
                object4 = zzbep.zziL;
                object3 = zzba.zzc();
                object4 = ((zzben)object3).zza((zzbeg)object4);
                object4 = (Integer)object4;
                n4 = (Integer)object4;
                object3 = zzbep.zzlP;
                object2 = zzba.zzc();
                object3 = ((zzben)object2).zza((zzbeg)object3);
                object3 = (Boolean)object3;
                n3 = ((Boolean)object3).booleanValue();
                if (n3 != 0) {
                    object2 = zzcci.zzd;
                    long l2 = n4;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    long l3 = l2;
                    object2.scheduleWithFixedDelay(this, l2, l2, timeUnit);
                } else {
                    object3 = zzcci.zzd;
                    long l4 = n4;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    object4 = object3;
                    object3 = this;
                    object4.scheduleAtFixedRate(this, l4, l4, timeUnit);
                }
                // MONITOREXIT : object5
            }
        }
        boolean bl2 = zzfmq.zza();
        if (!bl2) {
            return;
        }
        if (object == null) return;
        object5 = zzc;
        // MONITORENTER : object5
        object4 = this.zzg;
        n4 = ((zzfnh)object4).zza();
        object3 = zzbep.zziM;
        object2 = zzba.zzc();
        object3 = ((zzben)object2).zza((zzbeg)object3);
        object3 = (Integer)object3;
        n3 = (Integer)object3;
        if (n4 >= n3) {
            // MONITOREXIT : object5
            return;
        }
        object4 = zzfnf.zza();
        object3 = ((zzfmg)object).zzd();
        ((zzfms)object4).zzk((zzfmu)object3);
        n3 = (int)(((zzfmg)object).zzo() ? 1 : 0);
        ((zzfms)object4).zzu(n3 != 0);
        long l7 = ((zzfmg)object).zzb();
        ((zzfms)object4).zzh(l7);
        object3 = zzfna.zzb;
        ((zzfms)object4).zzn((zzfna)object3);
        object3 = this.zzf;
        object3 = ((VersionInfoParcel)object3).afmaVersion;
        ((zzfms)object4).zzr((String)object3);
        object3 = this.zzh;
        ((zzfms)object4).zzb((String)object3);
        object3 = Build.VERSION.RELEASE;
        ((zzfms)object4).zzo((String)object3);
        n3 = Build.VERSION.SDK_INT;
        ((zzfms)object4).zzv(n3);
        object3 = ((zzfmg)object).zzf();
        ((zzfms)object4).zzm((zzfmy)object3);
        n3 = ((zzfmg)object).zza();
        ((zzfms)object4).zzl(n3);
        n3 = this.zzi;
        l7 = n3;
        ((zzfms)object4).zzf(l7);
        object3 = ((zzfmg)object).zze();
        ((zzfms)object4).zze((zzfmw)object3);
        object3 = ((zzfmg)object).zzh();
        ((zzfms)object4).zzc((String)object3);
        object3 = ((zzfmg)object).zzj();
        ((zzfms)object4).zzg((String)object3);
        object3 = ((zzfmg)object).zzk();
        ((zzfms)object4).zzi((String)object3);
        object3 = this.zzj;
        object2 = ((zzfmg)object).zzk();
        object3 = ((zzdsq)object3).zzb((String)object2);
        ((zzfms)object4).zzj((String)object3);
        object3 = ((zzfmg)object).zzl();
        ((zzfms)object4).zzp((String)object3);
        object3 = ((zzfmg)object).zzg();
        ((zzfms)object4).zzq((zzfnc)object3);
        object3 = ((zzfmg)object).zzi();
        ((zzfms)object4).zzd((String)object3);
        object3 = ((zzfmg)object).zzn();
        ((zzfms)object4).zzw((String)object3);
        object3 = ((zzfmg)object).zzm();
        ((zzfms)object4).zzs((String)object3);
        l7 = ((zzfmg)object).zzc();
        ((zzfms)object4).zzt(l7);
        object = zzbep.zziQ;
        object3 = zzba.zzc();
        object = ((zzben)object3).zza((zzbeg)object);
        object = (Boolean)object;
        boolean bl3 = (Boolean)object;
        if (bl3) {
            object = this.zzk;
            ((zzfms)object4).zza((Iterable)object);
        }
        object = this.zzg;
        object3 = zzfnj.zza();
        ((zzfni)object3).zza((zzfms)object4);
        ((zzfnh)object).zzb((zzfni)object3);
        // MONITOREXIT : object5
    }
}


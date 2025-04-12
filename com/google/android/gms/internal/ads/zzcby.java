/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.net.ConnectivityManager
 *  android.net.ConnectivityManager$NetworkCallback
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbbh;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbwj;
import com.google.android.gms.internal.ads.zzbyf;
import com.google.android.gms.internal.ads.zzcbt;
import com.google.android.gms.internal.ads.zzcbu;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcbx;
import com.google.android.gms.internal.ads.zzccc;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccl;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzcby {
    private final Object zza;
    private final zzj zzb;
    private final zzccc zzc;
    private boolean zzd;
    private Context zze;
    private VersionInfoParcel zzf;
    private String zzg;
    private zzbeu zzh;
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final AtomicInteger zzk;
    private final zzcbx zzl;
    private final Object zzm;
    private ListenableFuture zzn;
    private final AtomicBoolean zzo;

    public zzcby() {
        zzccc zzccc2;
        Object object;
        this.zza = object = new Object();
        this.zzb = object = new zzj();
        Object object2 = zzay.zzd();
        this.zzc = zzccc2 = new zzccc((String)object2, (zzg)object);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = object2 = new AtomicInteger(0);
        this.zzk = object2 = new AtomicInteger(0);
        this.zzl = object = new zzcbx(null);
        this.zzm = object = new Object();
        this.zzo = object = new AtomicBoolean();
    }

    public static /* bridge */ /* synthetic */ Context zzc(zzcby zzcby2) {
        return zzcby2.zze;
    }

    public static /* bridge */ /* synthetic */ zzbeu zzf(zzcby zzcby2) {
        return zzcby2.zzh;
    }

    public static /* bridge */ /* synthetic */ VersionInfoParcel zzj(zzcby zzcby2) {
        return zzcby2.zzf;
    }

    public static /* bridge */ /* synthetic */ Object zzm(zzcby zzcby2) {
        return zzcby2.zza;
    }

    public static /* bridge */ /* synthetic */ AtomicBoolean zzp(zzcby zzcby2) {
        return zzcby2.zzo;
    }

    public final boolean zzA(Context context) {
        boolean bl2;
        Object object;
        boolean bl3 = PlatformVersion.isAtLeastO();
        if (bl3) {
            object = zzbep.zzix;
            zzben zzben2 = zzba.zzc();
            object = (Boolean)zzben2.zza((zzbeg)object);
            bl3 = (Boolean)object;
            if (bl3) {
                return this.zzo.get();
            }
        }
        return (context = ((ConnectivityManager)context.getSystemService((String)(object = "connectivity"))).getActiveNetworkInfo()) != null && (bl2 = context.isConnected());
    }

    public final int zza() {
        return this.zzk.get();
    }

    public final int zzb() {
        return this.zzj.get();
    }

    public final Context zzd() {
        return this.zze;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Resources zze() {
        zzp zzp22;
        block4: {
            Object object;
            VersionInfoParcel versionInfoParcel = this.zzf;
            boolean bl2 = versionInfoParcel.isClientJar;
            if (bl2) {
                return this.zze.getResources();
            }
            bl2 = false;
            versionInfoParcel = null;
            try {
                object = zzbep.zzkQ;
                zzben zzben2 = zzba.zzc();
                object = zzben2.zza((zzbeg)object);
                object = (Boolean)object;
                boolean bl3 = (Boolean)object;
                if (bl3) {
                    object = this.zze;
                    object = zzq.zza((Context)object);
                    return object.getResources();
                }
            }
            catch (zzp zzp22) {
                break block4;
            }
            object = this.zze;
            object = zzq.zza((Context)object);
            object.getResources();
            return null;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot load resource from dynamite apk or local jar", zzp22);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbeu zzg() {
        Object object = this.zza;
        synchronized (object) {
            return this.zzh;
        }
    }

    public final zzccc zzh() {
        return this.zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzg zzi() {
        Object object = this.zza;
        synchronized (object) {
            return this.zzb;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zzk() {
        Object object = this.zze;
        if (object != null) {
            object = zzbep.zzcJ;
            Object object2 = zzba.zzc();
            object = (Boolean)((zzben)object2).zza((zzbeg)object);
            boolean bl2 = (Boolean)object;
            if (!bl2) {
                object = this.zzm;
                synchronized (object) {
                    Throwable throwable2;
                    block6: {
                        try {
                            object2 = this.zzn;
                            if (object2 != null) {
                                return object2;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        object2 = zzcci.zza;
                        zzcbt zzcbt2 = new zzcbt(this);
                        this.zzn = object2 = object2.zzb(zzcbt2);
                        return object2;
                    }
                    throw throwable2;
                }
            }
        }
        object = new ArrayList();
        return zzgft.zzh(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Boolean zzl() {
        Object object = this.zza;
        synchronized (object) {
            return this.zzi;
        }
    }

    public final String zzn() {
        return this.zzg;
    }

    public final /* synthetic */ ArrayList zzo() {
        Object object = zzbyf.zza(this.zze);
        ArrayList<String[]> arrayList = new ArrayList<String[]>();
        Object[] objectArray = Wrappers.packageManager(object);
        object = object.getApplicationInfo();
        object = object.packageName;
        int n3 = 4096;
        try {
            object = objectArray.getPackageInfo((String)object, n3);
            objectArray = object.requestedPermissions;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        if (objectArray != null && (objectArray = (Object[])object.requestedPermissionsFlags) != null) {
            Object object2;
            int n4;
            objectArray = null;
            for (int i3 = 0; i3 < (n4 = ((String[])(object2 = object.requestedPermissions)).length); ++i3) {
                int[] nArray = object.requestedPermissionsFlags;
                n4 = nArray[i3] & 2;
                if (n4 == 0) continue;
                object2 = object2[i3];
                arrayList.add((String[])object2);
            }
        }
        return arrayList;
    }

    public final void zzq() {
        this.zzl.zza();
    }

    public final void zzr() {
        this.zzj.decrementAndGet();
    }

    public final void zzs() {
        this.zzk.incrementAndGet();
    }

    public final void zzt() {
        this.zzj.incrementAndGet();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzu(Context context, VersionInfoParcel object) {
        Object object2;
        block9: {
            Object object4;
            Object object3;
            boolean bl2;
            block11: {
                block10: {
                    object2 = this.zza;
                    // MONITORENTER : object2
                    bl2 = this.zzd;
                    if (bl2) break block9;
                    object3 = context.getApplicationContext();
                    this.zze = object3;
                    this.zzf = object;
                    object3 = zzu.zzb();
                    object4 = this.zzc;
                    ((zzbbh)object3).zzc((zzbbg)object4);
                    object3 = this.zzb;
                    object4 = this.zze;
                    ((zzj)object3).zzs((Context)object4);
                    object3 = this.zze;
                    object4 = this.zzf;
                    zzbwj.zzb((Context)object3, (VersionInfoParcel)object4);
                    zzu.zze();
                    object3 = zzbep.zzbY;
                    object4 = zzba.zzc();
                    object3 = ((zzben)object4).zza((zzbeg)object3);
                    object3 = (Boolean)object3;
                    bl2 = (Boolean)object3;
                    if (bl2) break block10;
                    object3 = "CsiReporterFactory: CSI is not enabled. No CSI reporter created.";
                    com.google.android.gms.ads.internal.util.zze.zza((String)object3);
                    bl2 = false;
                    object3 = null;
                    break block11;
                }
                object3 = new zzbeu();
            }
            this.zzh = object3;
            if (object3 != null) {
                object3 = new zzcbu(this);
                object3 = ((zzb)object3).zzb();
                object4 = "AppState.registerCsiReporter";
                zzccl.zza((ListenableFuture)object3, (String)object4);
            }
            bl2 = PlatformVersion.isAtLeastO();
            boolean bl3 = true;
            if (bl2) {
                object3 = zzbep.zzix;
                Object object5 = zzba.zzc();
                object3 = object5.zza((zzbeg)object3);
                bl2 = (Boolean)(object3 = (Boolean)object3);
                if (bl2) {
                    object3 = "connectivity";
                    object3 = context.getSystemService((String)object3);
                    object3 = (ConnectivityManager)object3;
                    try {
                        object5 = new zzcbv(this);
                        MU1.a((ConnectivityManager)object3, (ConnectivityManager.NetworkCallback)object5);
                    }
                    catch (RuntimeException runtimeException) {
                        object5 = "Failed to register network callback";
                        com.google.android.gms.ads.internal.util.client.zzm.zzk((String)object5, runtimeException);
                        AtomicBoolean atomicBoolean = this.zzo;
                        atomicBoolean.set(bl3);
                    }
                }
            }
            this.zzd = bl3;
            this.zzk();
        }
        // MONITOREXIT : object2
        object2 = zzu.zzp();
        object = ((VersionInfoParcel)object).afmaVersion;
        ((zzt)object2).zzc(context, (String)object);
    }

    public final void zzv(Throwable throwable, String string2) {
        Object object = this.zze;
        VersionInfoParcel versionInfoParcel = this.zzf;
        object = zzbwj.zzb((Context)object, versionInfoParcel);
        float f5 = ((Double)zzbgt.zzg.zze()).floatValue();
        object.zzi(throwable, string2, f5);
    }

    public final void zzw(Throwable throwable, String string2) {
        Context context = this.zze;
        VersionInfoParcel versionInfoParcel = this.zzf;
        zzbwj.zzb(context, versionInfoParcel).zzh(throwable, string2);
    }

    public final void zzx(Throwable throwable, String string2) {
        Context context = this.zze;
        VersionInfoParcel versionInfoParcel = this.zzf;
        zzbwj.zzd(context, versionInfoParcel).zzh(throwable, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzy(Boolean bl2) {
        Object object = this.zza;
        synchronized (object) {
            this.zzi = bl2;
            return;
        }
    }

    public final void zzz(String string2) {
        this.zzg = string2;
    }
}


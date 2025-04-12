/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 */
package com.google.android.gms.internal.gtm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.internal.gtm.zzgx;
import com.google.android.gms.internal.gtm.zzha;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhj;
import com.google.android.gms.internal.gtm.zzhm;
import com.google.android.gms.internal.gtm.zzhz;
import com.google.android.gms.internal.gtm.zzia;
import com.google.android.gms.internal.gtm.zzib;
import com.google.android.gms.internal.gtm.zzic;
import com.google.android.gms.internal.gtm.zzie;

final class zzig
extends zzhz {
    private static final Object zza;
    private static zzig zzb;
    private Context zzc;
    private zzha zzd;
    private volatile zzgx zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private zzic zzj;
    private zzhj zzk;
    private boolean zzl;
    private final zzia zzm;

    static {
        Object object;
        zza = object = new Object();
    }

    private zzig() {
        zzia zzia2;
        boolean bl2;
        this.zzf = bl2 = true;
        this.zzg = false;
        this.zzh = false;
        this.zzi = bl2;
        this.zzm = zzia2 = new zzia(this);
        this.zzl = false;
    }

    public static /* bridge */ /* synthetic */ Context zzc(zzig zzig2) {
        return zzig2.zzc;
    }

    public static /* bridge */ /* synthetic */ zzha zzd(zzig zzig2) {
        return zzig2.zzd;
    }

    public static zzig zzf() {
        zzig zzig2 = zzb;
        if (zzig2 == null) {
            zzb = zzig2 = new zzig();
        }
        return zzb;
    }

    public static /* bridge */ /* synthetic */ Object zzg() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzh(zzig zzig2, boolean bl2) {
        zzig2.zzh = false;
    }

    public static /* bridge */ /* synthetic */ boolean zzl(zzig zzig2) {
        return zzig2.zzi;
    }

    public static /* bridge */ /* synthetic */ boolean zzm(zzig zzig2) {
        return zzig2.zzn();
    }

    private final boolean zzn() {
        boolean bl2 = this.zzl;
        return bl2 || !(bl2 = this.zzi);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2 = this.zzn();
                    if (!bl2) {
                        zzic zzic2 = this.zzj;
                        zzic2.zzb();
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(boolean bl2) {
        synchronized (this) {
            boolean bl3 = this.zzl;
            this.zzk(bl3, bl2);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzha zze() {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                boolean bl2;
                zzhm zzhm2;
                zzia zzia2;
                Object object;
                block7: {
                    try {
                        object = this.zzd;
                        if (object != null) break block7;
                        object = this.zzc;
                        if (object == null) {
                            String string2 = "Cant get a store unless we have a context";
                            object = new IllegalStateException(string2);
                            throw object;
                        }
                        zzia2 = this.zzm;
                        zzhm2 = new zzhm(zzia2, (Context)object);
                        this.zzd = zzhm2;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                if ((object = this.zzj) == null) {
                    zzia2 = null;
                    this.zzj = object = new zzie(this, null);
                    long l2 = 1800000L;
                    object.zzc(l2);
                }
                this.zzg = bl2 = true;
                bl2 = this.zzf;
                if (bl2) {
                    this.zzi();
                    bl2 = false;
                    object = null;
                    this.zzf = false;
                }
                if ((object = this.zzk) != null) return this.zzd;
                object = new zzhj(this);
                this.zzk = object;
                zzia2 = this.zzc;
                zzhm2 = new IntentFilter();
                String string3 = "android.net.conn.CONNECTIVITY_CHANGE";
                zzhm2.addAction(string3);
                int n3 = 4;
                t70.registerReceiver((Context)zzia2, (BroadcastReceiver)object, (IntentFilter)zzhm2, n3);
                zzhm2 = new IntentFilter();
                String string4 = "com.google.analytics.RADIO_POWERED";
                zzhm2.addAction(string4);
                string4 = zzia2.getPackageName();
                zzhm2.addCategory(string4);
                t70.registerReceiver((Context)zzia2, (BroadcastReceiver)object, (IntentFilter)zzhm2, n3);
                return this.zzd;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                boolean bl3;
                try {
                    bl3 = this.zzg;
                    bl2 = true;
                    if (!bl3) {
                        String string2 = "Dispatch call queued. Dispatch will run once initialization is complete.";
                        zzhi.zzd(string2);
                        this.zzf = bl2;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                bl3 = this.zzh;
                if (!bl3) {
                    this.zzh = bl2;
                    zzgx zzgx2 = this.zze;
                    zzib zzib2 = new zzib(this);
                    zzgx2.zza(zzib2);
                    return;
                }
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
    public final void zzj(Context object, zzgx zzgx2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        Context context = this.zzc;
                        if (context != null) break block5;
                        this.zzc = object = object.getApplicationContext();
                        object = this.zze;
                        if (object == null) {
                            this.zze = zzgx2;
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzk(boolean bl2, boolean bl3) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        boolean bl4 = this.zzn();
                        this.zzl = bl2;
                        this.zzi = bl3;
                        bl2 = this.zzn();
                        if (bl2 != bl4) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                bl2 = this.zzn();
                if (bl2) {
                    Object object = this.zzj;
                    object.zza();
                    object = "PowerSaveMode initiated.";
                    zzhi.zzd((String)object);
                    return;
                }
                Object object = this.zzj;
                long l2 = 1800000L;
                object.zzc(l2);
                object = "PowerSaveMode terminated.";
                zzhi.zzd((String)object);
                return;
            }
            throw throwable2;
        }
    }
}


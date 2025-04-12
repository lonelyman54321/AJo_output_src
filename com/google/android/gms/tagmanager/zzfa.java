/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 */
package com.google.android.gms.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.tagmanager.zzbb;
import com.google.android.gms.tagmanager.zzbx;
import com.google.android.gms.tagmanager.zzby;
import com.google.android.gms.tagmanager.zzdc;
import com.google.android.gms.tagmanager.zzdf;
import com.google.android.gms.tagmanager.zzdr;
import com.google.android.gms.tagmanager.zzet;
import com.google.android.gms.tagmanager.zzeu;
import com.google.android.gms.tagmanager.zzev;
import com.google.android.gms.tagmanager.zzew;
import com.google.android.gms.tagmanager.zzey;

final class zzfa
extends zzet {
    private static final Object zza;
    private static zzfa zzb;
    private Context zzc;
    private zzby zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private zzew zzh;
    private zzdf zzi;
    private boolean zzj;
    private volatile zzbx zzk;
    private final zzeu zzl;

    static {
        Object object;
        zza = object = new Object();
    }

    private zzfa() {
        zzeu zzeu2;
        boolean bl2;
        this.zze = bl2 = true;
        this.zzf = false;
        this.zzg = bl2;
        this.zzl = zzeu2 = new zzeu(this);
        this.zzj = false;
    }

    public static /* bridge */ /* synthetic */ Context zzd(zzfa zzfa2) {
        return zzfa2.zzc;
    }

    public static /* bridge */ /* synthetic */ zzby zze(zzfa zzfa2) {
        return zzfa2.zzd;
    }

    public static zzfa zzg() {
        zzfa zzfa2 = zzb;
        if (zzfa2 == null) {
            zzb = zzfa2 = new zzfa();
        }
        return zzb;
    }

    public static /* bridge */ /* synthetic */ Object zzh() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ boolean zzj(zzfa zzfa2) {
        return zzfa2.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzk(zzfa zzfa2) {
        return zzfa2.zzm();
    }

    private final boolean zzm() {
        boolean bl2 = this.zzj;
        return bl2 || !(bl2 = this.zzg);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2 = this.zzf;
                    if (!bl2) {
                        zzbb zzbb2 = zzdc.zzb;
                        String string2 = "Dispatch call queued. Dispatch will run once initialization is complete.";
                        zzbb2.zzd(string2);
                        this.zze = bl2 = true;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                zzbx zzbx2 = this.zzk;
                zzev zzev2 = new zzev(this);
                zzbx2.zze(zzev2);
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
    public final void zzb() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2 = this.zzm();
                    if (!bl2) {
                        zzew zzew2 = this.zzh;
                        zzew2.zzb();
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
    public final void zzc(boolean bl2) {
        synchronized (this) {
            boolean bl3 = this.zzj;
            this.zzi(bl3, bl2);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzby zzf() {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                boolean bl2;
                zzdr zzdr2;
                zzeu zzeu2;
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
                        zzeu2 = this.zzl;
                        zzdr2 = new zzdr(zzeu2, (Context)object);
                        this.zzd = zzdr2;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                if ((object = this.zzh) == null) {
                    zzeu2 = null;
                    this.zzh = object = new zzey(this, null);
                    long l2 = 1800000L;
                    object.zzc(l2);
                }
                this.zzf = bl2 = true;
                bl2 = this.zze;
                if (bl2) {
                    this.zza();
                    bl2 = false;
                    object = null;
                    this.zze = false;
                }
                if ((object = this.zzi) != null) return this.zzd;
                object = new zzdf(this);
                this.zzi = object;
                zzeu2 = this.zzc;
                zzdr2 = new IntentFilter();
                String string3 = "android.net.conn.CONNECTIVITY_CHANGE";
                zzdr2.addAction(string3);
                zzeu2.registerReceiver((BroadcastReceiver)object, (IntentFilter)zzdr2);
                zzdr2 = new IntentFilter();
                string3 = "com.google.analytics.RADIO_POWERED";
                zzdr2.addAction(string3);
                string3 = zzeu2.getPackageName();
                zzdr2.addCategory(string3);
                zzeu2.registerReceiver((BroadcastReceiver)object, (IntentFilter)zzdr2);
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
    public final void zzi(boolean bl2, boolean bl3) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        boolean bl4 = this.zzm();
                        this.zzj = bl2;
                        this.zzg = bl3;
                        bl2 = this.zzm();
                        if (bl2 != bl4) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                bl2 = this.zzm();
                if (bl2) {
                    Object object = this.zzh;
                    object.zza();
                    object = zzdc.zzb;
                    String string2 = "PowerSaveMode initiated.";
                    ((zzbb)object).zzd(string2);
                    return;
                }
                Object object = this.zzh;
                long l2 = 1800000L;
                object.zzc(l2);
                object = zzdc.zzb;
                String string3 = "PowerSaveMode terminated.";
                ((zzbb)object).zzd(string3);
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
    public final void zzl(Context object, zzbx zzbx2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        Context context = this.zzc;
                        if (context != null) break block5;
                        this.zzc = object = object.getApplicationContext();
                        object = this.zzk;
                        if (object == null) {
                            this.zzk = zzbx2;
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
}


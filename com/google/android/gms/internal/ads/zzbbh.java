/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbbf;
import com.google.android.gms.internal.ads.zzbbg;

public final class zzbbh {
    private final Object zza;
    private zzbbf zzb;
    private boolean zzc;

    public zzbbh() {
        Object object;
        this.zza = object = new Object();
        this.zzb = null;
        this.zzc = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Activity zza() {
        Object object = this.zza;
        synchronized (object) {
            try {
                zzbbf zzbbf2 = this.zzb;
                if (zzbbf2 == null) return null;
                return zzbbf2.zza();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Context zzb() {
        Object object = this.zza;
        synchronized (object) {
            try {
                zzbbf zzbbf2 = this.zzb;
                if (zzbbf2 == null) return null;
                return zzbbf2.zzb();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(zzbbg zzbbg2) {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                zzbbf zzbbf2;
                block3: {
                    try {
                        zzbbf2 = this.zzb;
                        if (zzbbf2 != null) break block3;
                        this.zzb = zzbbf2 = new zzbbf();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                zzbbf2 = this.zzb;
                zzbbf2.zzf(zzbbg2);
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
    public final void zzd(Context object) {
        Object object2 = this.zza;
        synchronized (object2) {
            Throwable throwable2;
            block10: {
                block8: {
                    boolean bl2;
                    boolean bl3;
                    Context context;
                    boolean bl4;
                    block9: {
                        try {
                            bl4 = this.zzc;
                            if (bl4) break block8;
                            context = object.getApplicationContext();
                            if (context != null) break block9;
                            context = object;
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                    }
                    if (bl3 = context instanceof Application) {
                        context = (Application)context;
                    } else {
                        bl4 = false;
                        context = null;
                    }
                    if (context == null) {
                        object = "Can not cast Context to Application";
                        zzm.zzj((String)object);
                        return;
                    }
                    zzbbf zzbbf2 = this.zzb;
                    if (zzbbf2 == null) {
                        this.zzb = zzbbf2 = new zzbbf();
                    }
                    zzbbf2 = this.zzb;
                    zzbbf2.zzg((Application)context, (Context)object);
                    this.zzc = bl2 = true;
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
    public final void zze(zzbbg zzbbg2) {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                zzbbf zzbbf2;
                try {
                    zzbbf2 = this.zzb;
                    if (zzbbf2 == null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                zzbbf2.zzh(zzbbg2);
                return;
            }
            throw throwable2;
        }
    }
}


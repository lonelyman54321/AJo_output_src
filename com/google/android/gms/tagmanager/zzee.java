/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzfx;
import com.google.android.gms.tagmanager.zzad;
import com.google.android.gms.tagmanager.zzak;
import com.google.android.gms.tagmanager.zzbb;
import com.google.android.gms.tagmanager.zzdb;
import com.google.android.gms.tagmanager.zzdc;
import com.google.android.gms.tagmanager.zzeb;
import com.google.android.gms.tagmanager.zzec;
import com.google.android.gms.tagmanager.zzed;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzee
implements zzad {
    private final String zza;
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private ScheduledFuture zzd;
    private boolean zze;
    private final zzak zzf;
    private String zzg;
    private zzdb zzh;
    private final zzed zzi;

    public zzee(Context object, String string2, zzak zzak2, zzec zzec2, zzed zzed2) {
        this.zzf = zzak2;
        this.zzb = object;
        this.zza = string2;
        object = zzfx.zza().zzb(1, 2);
        this.zzc = object;
        super(this);
        this.zzi = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzd() {
        synchronized (this) {
            boolean bl2 = this.zze;
            if (!bl2) {
                return;
            }
            String string2 = "called method after closed";
            IllegalStateException illegalStateException = new IllegalStateException(string2);
            throw illegalStateException;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void release() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                boolean bl2;
                Object object;
                block3: {
                    try {
                        this.zzd();
                        object = this.zzd;
                        if (object == null) break block3;
                        object.cancel(false);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = this.zzc;
                object.shutdown();
                this.zze = bl2 = true;
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
    public final void zza(long l2, String object) {
        Object object2 = "loadAfterDelay: containerId=";
        synchronized (this) {
            Throwable throwable2;
            block5: {
                ScheduledFuture<?> scheduledFuture;
                Object object3;
                block4: {
                    try {
                        object3 = new StringBuilder((String)object2);
                        object2 = this.zza;
                        ((StringBuilder)object3).append((String)object2);
                        object2 = " delay=";
                        ((StringBuilder)object3).append((String)object2);
                        ((StringBuilder)object3).append(l2);
                        object2 = ((StringBuilder)object3).toString();
                        object3 = zzdc.zzb;
                        ((zzbb)object3).zzd((String)object2);
                        this.zzd();
                        object2 = this.zzh;
                        if (object2 == null) {
                            String string2 = "callback must be set before loadAfterDelay() is called.";
                            IllegalStateException illegalStateException = new IllegalStateException(string2);
                            throw illegalStateException;
                        }
                        object2 = this.zzd;
                        if (object2 == null) break block4;
                        object3 = null;
                        object2.cancel(false);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object2 = this.zzc;
                object3 = this.zzi;
                zzak zzak2 = this.zzf;
                object3 = ((zzed)object3).zza;
                Context context = ((zzee)object3).zzb;
                object3 = ((zzee)object3).zza;
                zzeb zzeb2 = new zzeb(context, (String)object3, zzak2);
                object3 = this.zzh;
                zzeb2.zzb((zzdb)object3);
                object3 = this.zzg;
                zzeb2.zza((String)object3);
                zzeb2.zzc((String)object);
                object = TimeUnit.MILLISECONDS;
                this.zzd = scheduledFuture = object2.schedule(zzeb2, l2, (TimeUnit)((Object)object));
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
    public final void zzb(String string2) {
        synchronized (this) {
            this.zzd();
            this.zzg = string2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(zzdb zzdb2) {
        synchronized (this) {
            this.zzd();
            this.zzh = zzdb2;
            return;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Build$VERSION
 */
package com.google.android.play.core.splitinstall.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.play.core.listener.StateUpdatedListener;
import com.google.android.play.core.splitinstall.internal.zzbr;
import com.google.android.play.core.splitinstall.internal.zzbv;
import com.google.android.play.core.splitinstall.internal.zzr;
import com.google.android.play.core.splitinstall.internal.zzu;
import java.util.HashSet;
import java.util.Set;

public abstract class zzs {
    protected final zzu zza;
    protected final Set zzb;
    private final IntentFilter zzc;
    private final Context zzd;
    private zzr zze;
    private volatile boolean zzf;

    public zzs(zzu zzu2, IntentFilter intentFilter, Context context) {
        HashSet hashSet;
        this.zzb = hashSet = new HashSet();
        this.zze = null;
        this.zzf = false;
        this.zza = zzu2;
        this.zzc = intentFilter;
        zzu2 = zzbr.zza(context);
        this.zzd = zzu2;
    }

    private final void zzf() {
        Context context;
        Object object;
        boolean bl2 = this.zzf;
        if ((bl2 || !(bl2 = (object = this.zzb).isEmpty())) && (object = this.zze) == null) {
            object = new zzr(this, null);
            this.zze = object;
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            if (n3 >= n4) {
                context = this.zzd;
                IntentFilter intentFilter = this.zzc;
                oo0_2.b(context, (BroadcastReceiver)object, intentFilter);
            } else {
                context = this.zzd;
                IntentFilter intentFilter = this.zzc;
                context.registerReceiver((BroadcastReceiver)object, intentFilter);
            }
        }
        if (!(bl2 = this.zzf) && (bl2 = (object = this.zzb).isEmpty()) && (object = this.zze) != null) {
            context = this.zzd;
            context.unregisterReceiver((BroadcastReceiver)object);
            this.zze = null;
        }
    }

    public abstract void zza(Context var1, Intent var2);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(StateUpdatedListener stateUpdatedListener) {
        synchronized (this) {
            Object object = this.zza;
            String string2 = "registerListener";
            Object[] objectArray = null;
            objectArray = new Object[]{};
            ((zzu)object).zzd(string2, objectArray);
            object = "Registered Play Core listener should not be null.";
            zzbv.zza(stateUpdatedListener, object);
            object = this.zzb;
            object.add(stateUpdatedListener);
            this.zzf();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(boolean bl2) {
        synchronized (this) {
            this.zzf = bl2 = true;
            this.zzf();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(StateUpdatedListener stateUpdatedListener) {
        synchronized (this) {
            Object object = this.zza;
            String string2 = "unregisterListener";
            Object[] objectArray = null;
            objectArray = new Object[]{};
            ((zzu)object).zzd(string2, objectArray);
            object = "Unregistered Play Core listener should not be null.";
            zzbv.zza(stateUpdatedListener, object);
            object = this.zzb;
            object.remove(stateUpdatedListener);
            this.zzf();
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze(Object object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2;
                    Object object2 = this.zzb;
                    Object object3 = new HashSet(object2);
                    object3 = ((HashSet)object3).iterator();
                    while (bl2 = object3.hasNext()) {
                        object2 = object3.next();
                        object2 = (StateUpdatedListener)object2;
                        object2.onStateUpdate(object);
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
}


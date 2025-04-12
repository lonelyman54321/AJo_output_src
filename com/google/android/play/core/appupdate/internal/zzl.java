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
package com.google.android.play.core.appupdate.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.play.core.appupdate.internal.zzac;
import com.google.android.play.core.appupdate.internal.zzk;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.internal.zzz;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Set;

public abstract class zzl {
    protected final zzm zza;
    protected final Set zzb;
    private final IntentFilter zzc;
    private final Context zzd;
    private zzk zze;
    private volatile boolean zzf;

    public zzl(zzm zzm2, IntentFilter intentFilter, Context context) {
        HashSet hashSet;
        this.zzb = hashSet = new HashSet();
        this.zze = null;
        this.zzf = false;
        this.zza = zzm2;
        this.zzc = intentFilter;
        zzm2 = zzz.zza(context);
        this.zzd = zzm2;
    }

    private final void zze() {
        Context context;
        Object object = this.zzb;
        boolean bl2 = object.isEmpty();
        if (!bl2 && (object = this.zze) == null) {
            object = new zzk(this, null);
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
        if ((bl2 = (object = this.zzb).isEmpty()) && (object = this.zze) != null) {
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
            ((zzm)object).zzd(string2, objectArray);
            object = "Registered Play Core listener should not be null.";
            zzac.zza(stateUpdatedListener, object);
            object = this.zzb;
            object.add(stateUpdatedListener);
            this.zze();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(StateUpdatedListener stateUpdatedListener) {
        synchronized (this) {
            Object object = this.zza;
            String string2 = "unregisterListener";
            Object[] objectArray = null;
            objectArray = new Object[]{};
            ((zzm)object).zzd(string2, objectArray);
            object = "Unregistered Play Core listener should not be null.";
            zzac.zza(stateUpdatedListener, object);
            object = this.zzb;
            object.remove(stateUpdatedListener);
            this.zze();
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(Object object) {
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


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.splitinstall.internal.zzs;
import com.google.android.play.core.splitinstall.internal.zzu;
import com.google.android.play.core.splitinstall.zzf;
import com.google.android.play.core.splitinstall.zzg;
import com.google.android.play.core.splitinstall.zzo;
import com.google.android.play.core.splitinstall.zzv;
import com.google.android.play.core.splitinstall.zzw;
import java.util.AbstractCollection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class zzx
extends zzs {
    private static zzx zzc;
    private final Handler zzd;
    private final zzg zze;
    private final Set zzf;

    public zzx(Context object, zzg zzg2) {
        zzu zzu2 = new zzu("SplitInstallListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService");
        super(zzu2, intentFilter, (Context)object);
        zzu2 = Looper.getMainLooper();
        super((Looper)zzu2);
        this.zzd = object;
        super();
        this.zzf = object;
        this.zze = zzg2;
    }

    public static /* synthetic */ zzu zzf(zzx zzx2) {
        return zzx2.zza;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzx zzg(Context object) {
        Class<zzx> clazz = zzx.class;
        synchronized (clazz) {
            try {
                zzx zzx2 = zzc;
                if (zzx2 != null) return zzc;
                zzo zzo2 = zzo.zza;
                zzc = zzx2 = new zzx((Context)object, zzo2);
                return zzc;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(zzx zzx2, SplitInstallSessionState splitInstallSessionState, int n3, int n4) {
        Handler handler = zzx2.zzd;
        zzw zzw2 = new zzw(zzx2, splitInstallSessionState, n3, n4);
        handler.post((Runnable)zzw2);
    }

    public final void zza(Context context, Intent intent) {
        Object object = intent.getBundleExtra("session_state");
        if (object == null) {
            return;
        }
        object = SplitInstallSessionState.zzd((Bundle)object);
        Object object2 = this.zza;
        Object object3 = new Object[]{object};
        Object object4 = "ListenerRegistryBroadcastReceiver.onReceive: %s";
        ((zzu)object2).zza((String)object4, object3);
        object2 = this.zze.zza();
        int n3 = ((SplitInstallSessionState)object).status();
        int n4 = 3;
        if (n3 == n4 && object2 != null) {
            object3 = ((SplitInstallSessionState)object).zzc();
            object4 = new zzv(this, (SplitInstallSessionState)object, intent, context);
            object2.zzd((List)object3, (zzf)object4);
            return;
        }
        this.zzk((SplitInstallSessionState)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        synchronized (this) {
            Set set = this.zzf;
            set.add(splitInstallStateUpdatedListener);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzj(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        synchronized (this) {
            Set set = this.zzf;
            set.remove(splitInstallStateUpdatedListener);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzk(SplitInstallSessionState splitInstallSessionState) {
        synchronized (this) {
            try {
                Object object = this.zzf;
                Object object2 = new LinkedHashSet(object);
                object2 = ((AbstractCollection)object2).iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object2.hasNext())) {
                        this.zze(splitInstallSessionState);
                        return;
                    }
                    object = object2.next();
                    object = (SplitInstallStateUpdatedListener)object;
                    object.onStateUpdate(splitInstallSessionState);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}


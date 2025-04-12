/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.IBinder
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzo;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.zzh;
import java.util.HashMap;
import java.util.concurrent.Executor;

final class zzs
extends GmsClientSupervisor {
    private final HashMap zzb;
    private final Context zzc;
    private volatile Handler zzd;
    private final zzq zze;
    private final ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;
    private volatile Executor zzi;

    public zzs(Context object, Looper looper, Executor executor) {
        Object object2 = new HashMap();
        this.zzb = object2;
        this.zze = object2 = new zzq(this, null);
        this.zzc = object = object.getApplicationContext();
        super(looper, (Handler.Callback)object2);
        this.zzd = object;
        object = ConnectionTracker.getInstance();
        this.zzf = object;
        this.zzg = 5000L;
        this.zzh = 300000L;
        this.zzi = executor;
    }

    public static /* bridge */ /* synthetic */ long zzd(zzs zzs2) {
        return zzs2.zzh;
    }

    public static /* bridge */ /* synthetic */ Context zze(zzs zzs2) {
        return zzs2.zzc;
    }

    public static /* bridge */ /* synthetic */ Handler zzf(zzs zzs2) {
        return zzs2.zzd;
    }

    public static /* bridge */ /* synthetic */ ConnectionTracker zzg(zzs zzs2) {
        return zzs2.zzf;
    }

    public static /* bridge */ /* synthetic */ HashMap zzh(zzs zzs2) {
        return zzs2.zzb;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ConnectionResult zza(zzo object, ServiceConnection object2, String object3, Executor executor) {
        String string2 = "Trying to bind a GmsServiceConnection that was already connected before.  config=";
        Preconditions.checkNotNull(object2, "ServiceConnection must not be null");
        HashMap hashMap = this.zzb;
        synchronized (hashMap) {
            Throwable throwable2;
            block6: {
                int n3;
                Object object4;
                block8: {
                    int n4;
                    block10: {
                        block9: {
                            block7: {
                                block5: {
                                    try {
                                        object4 = this.zzb;
                                        object4 = ((HashMap)object4).get(object);
                                        object4 = (zzp)object4;
                                        if (executor != null) break block5;
                                        executor = this.zzi;
                                    }
                                    catch (Throwable throwable2) {
                                        break block6;
                                    }
                                }
                                if (object4 != null) break block7;
                                object4 = new zzp(this, (zzo)object);
                                ((zzp)object4).zze((ServiceConnection)object2, (ServiceConnection)object2, (String)object3);
                                object2 = zzp.zzd((zzp)object4, (String)object3, executor);
                                object3 = this.zzb;
                                ((HashMap)object3).put(object, object4);
                                break block8;
                            }
                            Handler handler = this.zzd;
                            handler.removeMessages(0, object);
                            boolean bl2 = ((zzp)object4).zzh((ServiceConnection)object2);
                            if (bl2) {
                                object = ((zzo)object).toString();
                                object3 = new StringBuilder(string2);
                                ((StringBuilder)object3).append((String)object);
                                object = ((StringBuilder)object3).toString();
                                object2 = new IllegalStateException((String)object);
                                throw object2;
                            }
                            ((zzp)object4).zze((ServiceConnection)object2, (ServiceConnection)object2, (String)object3);
                            n3 = ((zzp)object4).zza();
                            int n7 = 1;
                            bl2 = false;
                            handler = null;
                            if (n3 == n7) break block9;
                            n4 = 2;
                            if (n3 != n4) break block10;
                            object2 = zzp.zzd((zzp)object4, (String)object3, executor);
                            break block8;
                        }
                        object = ((zzp)object4).zzb();
                        object3 = ((zzp)object4).zzc();
                        object2.onServiceConnected((ComponentName)object, (IBinder)object3);
                    }
                    n4 = 0;
                    object2 = null;
                }
                n3 = (int)(((zzp)object4).zzj() ? 1 : 0);
                if (n3 != 0) {
                    return ConnectionResult.RESULT_SUCCESS;
                }
                if (object2 != null) return object2;
                n3 = -1;
                return new ConnectionResult(n3);
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zzo object, ServiceConnection object2, String charSequence) {
        String string2 = "Trying to unbind a GmsServiceConnection  that was not bound before.  config=";
        String string3 = "Nonexistent connection status for service config: ";
        Preconditions.checkNotNull(object2, "ServiceConnection must not be null");
        HashMap hashMap = this.zzb;
        synchronized (hashMap) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        Object object3 = this.zzb;
                        object3 = ((HashMap)object3).get(object);
                        object3 = (zzp)object3;
                        if (object3 == null) {
                            object = ((zzo)object).toString();
                            charSequence = new StringBuilder(string3);
                            ((StringBuilder)charSequence).append((String)object);
                            object = ((StringBuilder)charSequence).toString();
                            object2 = new IllegalStateException((String)object);
                            throw object2;
                        }
                        boolean bl2 = ((zzp)object3).zzh((ServiceConnection)object2);
                        if (!bl2) {
                            object = ((zzo)object).toString();
                            charSequence = new StringBuilder(string2);
                            ((StringBuilder)charSequence).append((String)object);
                            object = ((StringBuilder)charSequence).toString();
                            object2 = new IllegalStateException((String)object);
                            throw object2;
                        }
                        ((zzp)object3).zzf((ServiceConnection)object2, (String)charSequence);
                        boolean bl3 = ((zzp)object3).zzi();
                        if (!bl3) break block5;
                        object2 = this.zzd;
                        charSequence = null;
                        object = object2.obtainMessage(0, object);
                        object2 = this.zzd;
                        long l2 = this.zzg;
                        object2.sendMessageDelayed((Message)object, l2);
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
    public final void zzi(Executor executor) {
        HashMap hashMap = this.zzb;
        synchronized (hashMap) {
            this.zzi = executor;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzj(Looper looper) {
        HashMap hashMap = this.zzb;
        synchronized (hashMap) {
            zzq zzq2 = this.zze;
            zzh zzh2 = new zzh(looper, zzq2);
            this.zzd = zzh2;
            return;
        }
    }
}


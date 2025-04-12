/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 */
package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.zzc;
import com.google.android.gms.internal.common.zzh;
import java.util.concurrent.atomic.AtomicInteger;

final class zzb
extends zzh {
    final /* synthetic */ BaseGmsClient zza;

    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        this.zza = baseGmsClient;
        super(looper);
    }

    private static final void zza(Message object) {
        object = (zzc)((Message)object).obj;
        ((zzc)object).zzc();
        ((zzc)object).zzg();
    }

    private static final boolean zzb(Message message) {
        int n3 = message.what;
        int n4 = 2;
        int n7 = 1;
        if (n3 != n4 && n3 != n7 && n3 != (n4 = 7)) {
            return false;
        }
        return n7 != 0;
    }

    public final void handleMessage(Message object) {
        int n3;
        int n4;
        Object object2 = this.zza.zzd;
        int n7 = ((AtomicInteger)object2).get();
        if (n7 != (n4 = object.arg1)) {
            n7 = (int)(zzb.zzb(object) ? 1 : 0);
            if (n7 != 0) {
                zzb.zza(object);
            }
            return;
        }
        n7 = object.what;
        n4 = 4;
        int n8 = 1;
        int n10 = 5;
        if (n7 != n8 && n7 != (n3 = 7) && (n7 != n4 || (n7 = (int)(((BaseGmsClient)(object2 = this.zza)).enableLocalFallback() ? 1 : 0)) != 0) && (n7 = object.what) != n10 || (n7 = (int)(((BaseGmsClient)(object2 = this.zza)).isConnecting() ? 1 : 0)) != 0) {
            n7 = object.what;
            n3 = 8;
            int n14 = 3;
            Object object3 = null;
            if (n7 == n4) {
                object2 = this.zza;
                int n15 = object.arg2;
                ConnectionResult connectionResult = new ConnectionResult(n15);
                BaseGmsClient.zzg((BaseGmsClient)object2, connectionResult);
                object = this.zza;
                n15 = (int)(BaseGmsClient.zzo((BaseGmsClient)object) ? 1 : 0);
                if (n15 != 0 && (n7 = (int)(BaseGmsClient.zzm((BaseGmsClient)(object = this.zza)) ? 1 : 0)) == 0) {
                    BaseGmsClient.zzi((BaseGmsClient)object, n14, null);
                    return;
                }
                object = this.zza;
                object2 = BaseGmsClient.zza((BaseGmsClient)object);
                object = object2 != null ? BaseGmsClient.zza((BaseGmsClient)object) : new ConnectionResult(n3);
                this.zza.zzc.onReportServiceBinding((ConnectionResult)object);
                this.zza.onConnectionFailed((ConnectionResult)object);
                return;
            }
            if (n7 == n10) {
                object = this.zza;
                object2 = BaseGmsClient.zza((BaseGmsClient)object);
                object = object2 != null ? BaseGmsClient.zza((BaseGmsClient)object) : new ConnectionResult(n3);
                this.zza.zzc.onReportServiceBinding((ConnectionResult)object);
                this.zza.onConnectionFailed((ConnectionResult)object);
                return;
            }
            if (n7 == n14) {
                object2 = object.obj;
                n4 = object2 instanceof PendingIntent;
                if (n4 != 0) {
                    object3 = object2;
                    object3 = (PendingIntent)object2;
                }
                int n16 = object.arg2;
                object2 = new ConnectionResult(n16, (PendingIntent)object3);
                this.zza.zzc.onReportServiceBinding((ConnectionResult)object2);
                this.zza.onConnectionFailed((ConnectionResult)object2);
                return;
            }
            n4 = 6;
            if (n7 == n4) {
                BaseGmsClient.zzi(this.zza, n10, null);
                object2 = this.zza;
                BaseGmsClient$BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks = BaseGmsClient.zzb((BaseGmsClient)object2);
                if (baseGmsClient$BaseConnectionCallbacks != null) {
                    object2 = BaseGmsClient.zzb((BaseGmsClient)object2);
                    n4 = object.arg2;
                    object2.onConnectionSuspended(n4);
                }
                object2 = this.zza;
                int n17 = object.arg2;
                ((BaseGmsClient)object2).onConnectionSuspended(n17);
                BaseGmsClient.zzn(this.zza, n10, n8, null);
                return;
            }
            n4 = 2;
            if (n7 == n4 && (n7 = (int)(((BaseGmsClient)(object2 = this.zza)).isConnected() ? 1 : 0)) == 0) {
                zzb.zza(object);
                return;
            }
            n7 = (int)(zzb.zzb(object) ? 1 : 0);
            if (n7 != 0) {
                ((zzc)object.obj).zze();
                return;
            }
            object = hj0_0.a(object.what, "Don't know how to handle message: ");
            object2 = new Exception();
            Log.wtf((String)"GmsClient", (String)object, (Throwable)object2);
            return;
        }
        zzb.zza(object);
    }
}


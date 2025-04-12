/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  android.os.Message
 */
package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.gms.common.internal.zzad;

public final class zze
implements ServiceConnection {
    final /* synthetic */ BaseGmsClient zza;
    private final int zzb;

    public zze(BaseGmsClient baseGmsClient, int n3) {
        this.zza = baseGmsClient;
        this.zzb = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        Object object2;
        BaseGmsClient baseGmsClient;
        block6: {
            boolean bl2;
            object = this.zza;
            if (iBinder == null) {
                BaseGmsClient.zzk((BaseGmsClient)object, 16);
                return;
            }
            object = BaseGmsClient.zzd((BaseGmsClient)object);
            // MONITORENTER : object
            baseGmsClient = this.zza;
            object2 = "com.google.android.gms.common.internal.IGmsServiceBroker";
            object2 = iBinder.queryLocalInterface((String)object2);
            if (object2 == null || !(bl2 = object2 instanceof IGmsServiceBroker)) break block6;
            object2 = (IGmsServiceBroker)object2;
        }
        object2 = new zzad(iBinder);
        BaseGmsClient.zzh(baseGmsClient, (IGmsServiceBroker)object2);
        // MONITOREXIT : object
        object = this.zza;
        int n3 = this.zzb;
        ((BaseGmsClient)object).zzl(0, null, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceDisconnected(ComponentName object) {
        BaseGmsClient baseGmsClient;
        object = BaseGmsClient.zzd(this.zza);
        synchronized (object) {
            baseGmsClient = this.zza;
            BaseGmsClient.zzh(baseGmsClient, null);
        }
        object = this.zza;
        int n3 = this.zzb;
        object = object.zzb;
        baseGmsClient = object.obtainMessage(6, n3, 1);
        object.sendMessage((Message)baseGmsClient);
    }
}


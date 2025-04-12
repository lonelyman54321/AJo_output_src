/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 */
package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zza;

public final class zzf
extends zza {
    public final IBinder zze;
    final /* synthetic */ BaseGmsClient zzf;

    public zzf(BaseGmsClient baseGmsClient, int n3, IBinder iBinder, Bundle bundle) {
        this.zzf = baseGmsClient;
        super(baseGmsClient, n3, bundle);
        this.zze = iBinder;
    }

    public final void zzb(ConnectionResult connectionResult) {
        BaseGmsClient$BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener = BaseGmsClient.zzc(this.zzf);
        if (baseGmsClient$BaseOnConnectionFailedListener != null) {
            baseGmsClient$BaseOnConnectionFailedListener = BaseGmsClient.zzc(this.zzf);
            baseGmsClient$BaseOnConnectionFailedListener.onConnectionFailed(connectionResult);
        }
        this.zzf.onConnectionFailed(connectionResult);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean zzd() {
        boolean bl2;
        Object object;
        Object object2;
        Object object3;
        boolean bl3;
        block6: {
            bl3 = false;
            object3 = null;
            try {
                object2 = this.zze;
            }
            catch (RemoteException remoteException) {
                return bl3;
            }
            Preconditions.checkNotNull(object2);
            object2 = object2.getInterfaceDescriptor();
            object = this.zzf.getServiceDescriptor();
            bl2 = ((String)object).equals(object2);
            if (bl2) break block6;
            this.zzf.getServiceDescriptor();
            return false;
        }
        object2 = this.zzf;
        object = this.zze;
        if ((object2 = ((BaseGmsClient)object2).createServiceInterface((IBinder)object)) == null) return bl3;
        object = this.zzf;
        int n3 = 2;
        int n4 = 4;
        boolean bl4 = BaseGmsClient.zzn((BaseGmsClient)object, n3, n4, (IInterface)object2);
        if (!bl4) {
            object = this.zzf;
            n3 = 3;
            bl2 = BaseGmsClient.zzn((BaseGmsClient)object, n3, n4, (IInterface)object2);
            if (!bl2) return bl3;
        }
        object3 = this.zzf;
        bl2 = false;
        BaseGmsClient.zzg((BaseGmsClient)object3, null);
        object3 = this.zzf;
        object2 = ((BaseGmsClient)object3).getConnectionHint();
        object3 = BaseGmsClient.zzb((BaseGmsClient)object3);
        if (object3 == null) return true;
        object3 = BaseGmsClient.zzb(this.zzf);
        object3.onConnected((Bundle)object2);
        return true;
    }
}


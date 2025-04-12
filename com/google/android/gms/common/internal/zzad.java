/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.gms.common.internal.zzn;

final class zzad
implements IGmsServiceBroker {
    private final IBinder zza;

    public zzad(IBinder iBinder) {
        this.zza = iBinder;
    }

    public final IBinder asBinder() {
        return this.zza;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void getService(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest) {
        Throwable throwable2;
        Parcel parcel;
        Parcel parcel2;
        block4: {
            int n3;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            String string2 = "com.google.android.gms.common.internal.IGmsServiceBroker";
            try {
                parcel2.writeInterfaceToken(string2);
                iGmsCallbacks = iGmsCallbacks != null ? iGmsCallbacks.asBinder() : null;
            }
            catch (Throwable throwable2) {
                break block4;
            }
            parcel2.writeStrongBinder((IBinder)iGmsCallbacks);
            iGmsCallbacks = null;
            if (getServiceRequest != null) {
                n3 = 1;
                parcel2.writeInt(n3);
                zzn.zza(getServiceRequest, parcel2, 0);
            } else {
                parcel2.writeInt(0);
            }
            getServiceRequest = this.zza;
            n3 = 46;
            getServiceRequest.transact(n3, parcel2, parcel, 0);
            parcel.readException();
            parcel.recycle();
            parcel2.recycle();
            return;
        }
        parcel.recycle();
        parcel2.recycle();
        throw throwable2;
    }
}


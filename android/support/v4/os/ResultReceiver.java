/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.RemoteException
 */
package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.IResultReceiver;
import android.support.v4.os.IResultReceiver$Stub;
import android.support.v4.os.ResultReceiver$1;
import android.support.v4.os.ResultReceiver$MyResultReceiver;
import android.support.v4.os.ResultReceiver$MyRunnable;

public class ResultReceiver
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    final Handler mHandler;
    final boolean mLocal;
    IResultReceiver mReceiver;

    static {
        ResultReceiver$1 resultReceiver$1 = new ResultReceiver$1();
        CREATOR = resultReceiver$1;
    }

    public ResultReceiver(Handler handler) {
        this.mLocal = true;
        this.mHandler = handler;
    }

    public ResultReceiver(Parcel object) {
        this.mLocal = false;
        this.mHandler = null;
        object = IResultReceiver$Stub.asInterface(object.readStrongBinder());
        this.mReceiver = object;
    }

    public int describeContents() {
        return 0;
    }

    public void onReceiveResult(int n3, Bundle bundle) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void send(int n3, Bundle bundle) {
        boolean bl2 = this.mLocal;
        if (bl2) {
            Handler handler = this.mHandler;
            if (handler != null) {
                ResultReceiver$MyRunnable resultReceiver$MyRunnable = new ResultReceiver$MyRunnable(this, n3, bundle);
                handler.post((Runnable)resultReceiver$MyRunnable);
                return;
            }
            this.onReceiveResult(n3, bundle);
            return;
        }
        IResultReceiver iResultReceiver = this.mReceiver;
        if (iResultReceiver == null) return;
        try {
            iResultReceiver.send(n3, bundle);
            return;
        }
        catch (RemoteException remoteException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void writeToParcel(Parcel parcel, int n3) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                IResultReceiver iResultReceiver;
                block3: {
                    try {
                        iResultReceiver = this.mReceiver;
                        if (iResultReceiver != null) break block3;
                        this.mReceiver = iResultReceiver = new ResultReceiver$MyResultReceiver(this);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                iResultReceiver = this.mReceiver;
                iResultReceiver = iResultReceiver.asBinder();
                parcel.writeStrongBinder((IBinder)iResultReceiver);
                return;
            }
            throw throwable2;
        }
    }
}


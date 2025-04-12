/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsCallback$Stub;
import android.support.customtabs.IPostMessageService;
import android.support.customtabs.IPostMessageService$Stub$Proxy;
import android.support.customtabs.IPostMessageService$_Parcel;

public abstract class IPostMessageService$Stub
extends Binder
implements IPostMessageService {
    static final int TRANSACTION_onMessageChannelReady = 2;
    static final int TRANSACTION_onPostMessage = 3;

    public IPostMessageService$Stub() {
        String string2 = IPostMessageService.DESCRIPTOR;
        this.attachInterface(this, string2);
    }

    public static IPostMessageService asInterface(IBinder iBinder) {
        boolean bl2;
        if (iBinder == null) {
            return null;
        }
        Object object = IPostMessageService.DESCRIPTOR;
        if ((object = iBinder.queryLocalInterface((String)object)) != null && (bl2 = object instanceof IPostMessageService)) {
            return (IPostMessageService)object;
        }
        object = new IPostMessageService$Stub$Proxy(iBinder);
        return object;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7;
        String string2 = IPostMessageService.DESCRIPTOR;
        int n8 = 1;
        if (n3 >= n8 && n3 <= (n7 = 0xFFFFFF)) {
            parcel.enforceInterface(string2);
        }
        if (n3 == (n7 = 1598968902)) {
            parcel2.writeString(string2);
            return n8;
        }
        int n10 = 2;
        if (n3 != n10) {
            n10 = 3;
            if (n3 != n10) {
                return super.onTransact(n3, parcel, parcel2, n4);
            }
            ICustomTabsCallback iCustomTabsCallback = ICustomTabsCallback$Stub.asInterface(parcel.readStrongBinder());
            String string3 = parcel.readString();
            string2 = Bundle.CREATOR;
            parcel = (Bundle)IPostMessageService$_Parcel.access$000(parcel, (Parcelable.Creator)string2);
            this.onPostMessage(iCustomTabsCallback, string3, (Bundle)parcel);
            parcel2.writeNoException();
        } else {
            ICustomTabsCallback iCustomTabsCallback = ICustomTabsCallback$Stub.asInterface(parcel.readStrongBinder());
            Parcelable.Creator creator = Bundle.CREATOR;
            parcel = (Bundle)IPostMessageService$_Parcel.access$000(parcel, creator);
            this.onMessageChannelReady(iCustomTabsCallback, (Bundle)parcel);
            parcel2.writeNoException();
        }
        return n8;
    }
}


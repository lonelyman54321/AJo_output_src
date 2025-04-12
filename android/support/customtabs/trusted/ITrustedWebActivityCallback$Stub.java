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
package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import android.support.customtabs.trusted.ITrustedWebActivityCallback$Stub$Proxy;
import android.support.customtabs.trusted.ITrustedWebActivityCallback$_Parcel;

public abstract class ITrustedWebActivityCallback$Stub
extends Binder
implements ITrustedWebActivityCallback {
    static final int TRANSACTION_onExtraCallback = 2;

    public ITrustedWebActivityCallback$Stub() {
        String string2 = ITrustedWebActivityCallback.DESCRIPTOR;
        this.attachInterface(this, string2);
    }

    public static ITrustedWebActivityCallback asInterface(IBinder iBinder) {
        boolean bl2;
        if (iBinder == null) {
            return null;
        }
        Object object = ITrustedWebActivityCallback.DESCRIPTOR;
        if ((object = iBinder.queryLocalInterface((String)object)) != null && (bl2 = object instanceof ITrustedWebActivityCallback)) {
            return (ITrustedWebActivityCallback)object;
        }
        object = new ITrustedWebActivityCallback$Stub$Proxy(iBinder);
        return object;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7;
        String string2 = ITrustedWebActivityCallback.DESCRIPTOR;
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
            return super.onTransact(n3, parcel, parcel2, n4);
        }
        String string3 = parcel.readString();
        Parcelable.Creator creator = Bundle.CREATOR;
        parcel = (Bundle)ITrustedWebActivityCallback$_Parcel.access$000(parcel, creator);
        this.onExtraCallback(string3, (Bundle)parcel);
        parcel2.writeNoException();
        return n8;
    }
}


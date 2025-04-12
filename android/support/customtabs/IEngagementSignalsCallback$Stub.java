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
import android.support.customtabs.IEngagementSignalsCallback;
import android.support.customtabs.IEngagementSignalsCallback$Stub$Proxy;
import android.support.customtabs.IEngagementSignalsCallback$_Parcel;

public abstract class IEngagementSignalsCallback$Stub
extends Binder
implements IEngagementSignalsCallback {
    static final int TRANSACTION_onGreatestScrollPercentageIncreased = 3;
    static final int TRANSACTION_onSessionEnded = 4;
    static final int TRANSACTION_onVerticalScrollEvent = 2;

    public IEngagementSignalsCallback$Stub() {
        String string2 = IEngagementSignalsCallback.DESCRIPTOR;
        this.attachInterface(this, string2);
    }

    public static IEngagementSignalsCallback asInterface(IBinder iBinder) {
        boolean bl2;
        if (iBinder == null) {
            return null;
        }
        Object object = IEngagementSignalsCallback.DESCRIPTOR;
        if ((object = iBinder.queryLocalInterface((String)object)) != null && (bl2 = object instanceof IEngagementSignalsCallback)) {
            return (IEngagementSignalsCallback)object;
        }
        object = new IEngagementSignalsCallback$Stub$Proxy(iBinder);
        return object;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7;
        String string2 = IEngagementSignalsCallback.DESCRIPTOR;
        int n8 = 1;
        if (n3 >= n8 && n3 <= (n7 = 0xFFFFFF)) {
            parcel.enforceInterface(string2);
        }
        if (n3 == (n7 = 1598968902)) {
            parcel2.writeString(string2);
            return n8;
        }
        int n10 = 2;
        n7 = 0;
        if (n3 != n10) {
            n10 = 3;
            if (n3 != n10) {
                n10 = 4;
                if (n3 != n10) {
                    return super.onTransact(n3, parcel, parcel2, n4);
                }
                n3 = parcel.readInt();
                if (n3 != 0) {
                    n7 = 1;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)IEngagementSignalsCallback$_Parcel.access$000(parcel, creator);
                this.onSessionEnded(n7 != 0, (Bundle)creator);
            } else {
                n3 = parcel.readInt();
                parcel2 = Bundle.CREATOR;
                parcel = (Bundle)IEngagementSignalsCallback$_Parcel.access$000(parcel, (Parcelable.Creator)parcel2);
                this.onGreatestScrollPercentageIncreased(n3, (Bundle)parcel);
            }
        } else {
            n3 = parcel.readInt();
            if (n3 != 0) {
                n7 = 1;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            creator = (Bundle)IEngagementSignalsCallback$_Parcel.access$000(parcel, creator);
            this.onVerticalScrollEvent(n7 != 0, (Bundle)creator);
        }
        return n8;
    }
}


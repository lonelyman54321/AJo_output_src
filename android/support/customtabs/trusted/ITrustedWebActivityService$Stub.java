/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import android.support.customtabs.trusted.ITrustedWebActivityService$Stub$Proxy;
import android.support.customtabs.trusted.ITrustedWebActivityService$_Parcel;

public abstract class ITrustedWebActivityService$Stub
extends Binder
implements ITrustedWebActivityService {
    static final int TRANSACTION_areNotificationsEnabled = 6;
    static final int TRANSACTION_cancelNotification = 3;
    static final int TRANSACTION_extraCommand = 9;
    static final int TRANSACTION_getActiveNotifications = 5;
    static final int TRANSACTION_getSmallIconBitmap = 7;
    static final int TRANSACTION_getSmallIconId = 4;
    static final int TRANSACTION_notifyNotificationWithChannel = 2;

    public ITrustedWebActivityService$Stub() {
        String string2 = ITrustedWebActivityService.DESCRIPTOR;
        this.attachInterface(this, string2);
    }

    public static ITrustedWebActivityService asInterface(IBinder iBinder) {
        boolean bl2;
        if (iBinder == null) {
            return null;
        }
        Object object = ITrustedWebActivityService.DESCRIPTOR;
        if ((object = iBinder.queryLocalInterface((String)object)) != null && (bl2 = object instanceof ITrustedWebActivityService)) {
            return (ITrustedWebActivityService)object;
        }
        object = new ITrustedWebActivityService$Stub$Proxy(iBinder);
        return object;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7;
        String string2 = ITrustedWebActivityService.DESCRIPTOR;
        int n8 = 1;
        if (n3 >= n8 && n3 <= (n7 = 0xFFFFFF)) {
            parcel.enforceInterface(string2);
        }
        if (n3 == (n7 = 1598968902)) {
            parcel2.writeString(string2);
            return n8 != 0;
        }
        switch (n3) {
            default: {
                return super.onTransact(n3, parcel, parcel2, n4);
            }
            case 9: {
                String string3 = parcel.readString();
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)ITrustedWebActivityService$_Parcel.access$000(parcel, creator);
                parcel = parcel.readStrongBinder();
                string3 = this.extraCommand(string3, (Bundle)creator, (IBinder)parcel);
                parcel2.writeNoException();
                ITrustedWebActivityService$_Parcel.access$100(parcel2, (Parcelable)string3, n8);
                break;
            }
            case 7: {
                Bundle bundle = this.getSmallIconBitmap();
                parcel2.writeNoException();
                ITrustedWebActivityService$_Parcel.access$100(parcel2, (Parcelable)bundle, n8);
                break;
            }
            case 6: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)ITrustedWebActivityService$_Parcel.access$000(parcel, creator);
                creator = this.areNotificationsEnabled((Bundle)creator);
                parcel2.writeNoException();
                ITrustedWebActivityService$_Parcel.access$100(parcel2, (Parcelable)creator, n8);
                break;
            }
            case 5: {
                Bundle bundle = this.getActiveNotifications();
                parcel2.writeNoException();
                ITrustedWebActivityService$_Parcel.access$100(parcel2, (Parcelable)bundle, n8);
                break;
            }
            case 4: {
                n3 = this.getSmallIconId();
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 3: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)ITrustedWebActivityService$_Parcel.access$000(parcel, creator);
                this.cancelNotification((Bundle)creator);
                parcel2.writeNoException();
                break;
            }
            case 2: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)ITrustedWebActivityService$_Parcel.access$000(parcel, creator);
                creator = this.notifyNotificationWithChannel((Bundle)creator);
                parcel2.writeNoException();
                ITrustedWebActivityService$_Parcel.access$100(parcel2, (Parcelable)creator, n8);
            }
        }
        return n8 != 0;
    }
}


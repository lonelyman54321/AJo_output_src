/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsCallback$Stub;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.ICustomTabsService$Stub$Proxy;
import android.support.customtabs.ICustomTabsService$_Parcel;
import java.util.List;

public abstract class ICustomTabsService$Stub
extends Binder
implements ICustomTabsService {
    static final int TRANSACTION_extraCommand = 5;
    static final int TRANSACTION_isEngagementSignalsApiAvailable = 13;
    static final int TRANSACTION_mayLaunchUrl = 4;
    static final int TRANSACTION_newSession = 3;
    static final int TRANSACTION_newSessionWithExtras = 10;
    static final int TRANSACTION_postMessage = 8;
    static final int TRANSACTION_receiveFile = 12;
    static final int TRANSACTION_requestPostMessageChannel = 7;
    static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;
    static final int TRANSACTION_setEngagementSignalsCallback = 14;
    static final int TRANSACTION_updateVisuals = 6;
    static final int TRANSACTION_validateRelationship = 9;
    static final int TRANSACTION_warmup = 2;

    public ICustomTabsService$Stub() {
        String string2 = ICustomTabsService.DESCRIPTOR;
        this.attachInterface(this, string2);
    }

    public static ICustomTabsService asInterface(IBinder iBinder) {
        boolean bl2;
        if (iBinder == null) {
            return null;
        }
        Object object = ICustomTabsService.DESCRIPTOR;
        if ((object = iBinder.queryLocalInterface((String)object)) != null && (bl2 = object instanceof ICustomTabsService)) {
            return (ICustomTabsService)object;
        }
        object = new ICustomTabsService$Stub$Proxy(iBinder);
        return object;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int n3, Parcel object, Parcel parcel, int n4) {
        int n7;
        String string2 = ICustomTabsService.DESCRIPTOR;
        int n8 = 1;
        if (n3 >= n8 && n3 <= (n7 = 0xFFFFFF)) {
            object.enforceInterface(string2);
        }
        if (n3 == (n7 = 1598968902)) {
            parcel.writeString(string2);
            return n8 != 0;
        }
        switch (n3) {
            default: {
                return super.onTransact(n3, object, parcel, n4);
            }
            case 14: {
                ICustomTabsCallback iCustomTabsCallback = ICustomTabsCallback$Stub.asInterface(object.readStrongBinder());
                IBinder iBinder = object.readStrongBinder();
                string2 = Bundle.CREATOR;
                object = (Bundle)ICustomTabsService$_Parcel.access$000(object, (Parcelable.Creator)string2);
                n3 = (int)(this.setEngagementSignalsCallback(iCustomTabsCallback, iBinder, (Bundle)object) ? 1 : 0);
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 13: {
                ICustomTabsCallback iCustomTabsCallback = ICustomTabsCallback$Stub.asInterface(object.readStrongBinder());
                Parcelable.Creator creator = Bundle.CREATOR;
                object = (Bundle)ICustomTabsService$_Parcel.access$000(object, creator);
                n3 = (int)(this.isEngagementSignalsApiAvailable(iCustomTabsCallback, (Bundle)object) ? 1 : 0);
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 12: {
                ICustomTabsCallback iCustomTabsCallback = ICustomTabsCallback$Stub.asInterface(object.readStrongBinder());
                Parcelable.Creator creator = Uri.CREATOR;
                creator = (Uri)ICustomTabsService$_Parcel.access$000(object, creator);
                int n10 = object.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                object = (Bundle)ICustomTabsService$_Parcel.access$000(object, creator2);
                n3 = (int)(this.receiveFile(iCustomTabsCallback, (Uri)creator, n10, (Bundle)object) ? 1 : 0);
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 11: {
                ICustomTabsCallback iCustomTabsCallback = ICustomTabsCallback$Stub.asInterface(object.readStrongBinder());
                Parcelable.Creator creator = Uri.CREATOR;
                creator = (Uri)ICustomTabsService$_Parcel.access$000(object, creator);
                string2 = Bundle.CREATOR;
                object = (Bundle)ICustomTabsService$_Parcel.access$000(object, (Parcelable.Creator)string2);
                n3 = (int)(this.requestPostMessageChannelWithExtras(iCustomTabsCallback, (Uri)creator, (Bundle)object) ? 1 : 0);
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 10: {
                ICustomTabsCallback iCustomTabsCallback = ICustomTabsCallback$Stub.asInterface(object.readStrongBinder());
                Parcelable.Creator creator = Bundle.CREATOR;
                object = (Bundle)ICustomTabsService$_Parcel.access$000(object, creator);
                n3 = (int)(this.newSessionWithExtras(iCustomTabsCallback, (Bundle)object) ? 1 : 0);
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 9: {
                ICustomTabsCallback iCustomTabsCallback = ICustomTabsCallback$Stub.asInterface(object.readStrongBinder());
                n4 = object.readInt();
                string2 = Uri.CREATOR;
                string2 = (Uri)ICustomTabsService$_Parcel.access$000(object, (Parcelable.Creator)string2);
                Parcelable.Creator creator = Bundle.CREATOR;
                object = (Bundle)ICustomTabsService$_Parcel.access$000(object, creator);
                n3 = (int)(this.validateRelationship(iCustomTabsCallback, n4, (Uri)string2, (Bundle)object) ? 1 : 0);
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 8: {
                ICustomTabsCallback iCustomTabsCallback = ICustomTabsCallback$Stub.asInterface(object.readStrongBinder());
                String string3 = object.readString();
                string2 = Bundle.CREATOR;
                object = (Bundle)ICustomTabsService$_Parcel.access$000(object, (Parcelable.Creator)string2);
                n3 = this.postMessage(iCustomTabsCallback, string3, (Bundle)object);
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 7: {
                ICustomTabsCallback iCustomTabsCallback = ICustomTabsCallback$Stub.asInterface(object.readStrongBinder());
                Parcelable.Creator creator = Uri.CREATOR;
                object = (Uri)ICustomTabsService$_Parcel.access$000(object, creator);
                n3 = (int)(this.requestPostMessageChannel(iCustomTabsCallback, (Uri)object) ? 1 : 0);
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 6: {
                ICustomTabsCallback iCustomTabsCallback = ICustomTabsCallback$Stub.asInterface(object.readStrongBinder());
                Parcelable.Creator creator = Bundle.CREATOR;
                object = (Bundle)ICustomTabsService$_Parcel.access$000(object, creator);
                n3 = (int)(this.updateVisuals(iCustomTabsCallback, (Bundle)object) ? 1 : 0);
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 5: {
                String string4 = object.readString();
                Parcelable.Creator creator = Bundle.CREATOR;
                object = (Bundle)ICustomTabsService$_Parcel.access$000(object, creator);
                string4 = this.extraCommand(string4, (Bundle)object);
                parcel.writeNoException();
                ICustomTabsService$_Parcel.access$100(parcel, (Parcelable)string4, n8);
                break;
            }
            case 4: {
                ICustomTabsCallback iCustomTabsCallback = ICustomTabsCallback$Stub.asInterface(object.readStrongBinder());
                Parcelable.Creator creator = Uri.CREATOR;
                creator = (Uri)ICustomTabsService$_Parcel.access$000(object, creator);
                string2 = Bundle.CREATOR;
                Bundle bundle = (Bundle)ICustomTabsService$_Parcel.access$000(object, (Parcelable.Creator)string2);
                object = object.createTypedArrayList((Parcelable.Creator)string2);
                n3 = (int)(this.mayLaunchUrl(iCustomTabsCallback, (Uri)creator, bundle, (List)object) ? 1 : 0);
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 3: {
                ICustomTabsCallback iCustomTabsCallback = ICustomTabsCallback$Stub.asInterface(object.readStrongBinder());
                n3 = (int)(this.newSession(iCustomTabsCallback) ? 1 : 0);
                parcel.writeNoException();
                parcel.writeInt(n3);
                break;
            }
            case 2: {
                long l2 = object.readLong();
                n3 = (int)(this.warmup(l2) ? 1 : 0);
                parcel.writeNoException();
                parcel.writeInt(n3);
            }
        }
        return n8 != 0;
    }
}


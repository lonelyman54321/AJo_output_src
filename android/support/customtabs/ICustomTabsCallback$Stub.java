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
import android.support.customtabs.ICustomTabsCallback$Stub$Proxy;
import android.support.customtabs.ICustomTabsCallback$_Parcel;

public abstract class ICustomTabsCallback$Stub
extends Binder
implements ICustomTabsCallback {
    static final int TRANSACTION_extraCallback = 3;
    static final int TRANSACTION_extraCallbackWithResult = 7;
    static final int TRANSACTION_onActivityLayout = 10;
    static final int TRANSACTION_onActivityResized = 8;
    static final int TRANSACTION_onMessageChannelReady = 4;
    static final int TRANSACTION_onMinimized = 11;
    static final int TRANSACTION_onNavigationEvent = 2;
    static final int TRANSACTION_onPostMessage = 5;
    static final int TRANSACTION_onRelationshipValidationResult = 6;
    static final int TRANSACTION_onUnminimized = 12;
    static final int TRANSACTION_onWarmupCompleted = 9;

    public ICustomTabsCallback$Stub() {
        String string2 = ICustomTabsCallback.DESCRIPTOR;
        this.attachInterface(this, string2);
    }

    public static ICustomTabsCallback asInterface(IBinder iBinder) {
        boolean bl2;
        if (iBinder == null) {
            return null;
        }
        Object object = ICustomTabsCallback.DESCRIPTOR;
        if ((object = iBinder.queryLocalInterface((String)object)) != null && (bl2 = object instanceof ICustomTabsCallback)) {
            return (ICustomTabsCallback)object;
        }
        object = new ICustomTabsCallback$Stub$Proxy(iBinder);
        return object;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7;
        String string2 = ICustomTabsCallback.DESCRIPTOR;
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
            case 12: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)ICustomTabsCallback$_Parcel.access$000(parcel, creator);
                this.onUnminimized((Bundle)creator);
                break;
            }
            case 11: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)ICustomTabsCallback$_Parcel.access$000(parcel, creator);
                this.onMinimized((Bundle)creator);
                break;
            }
            case 10: {
                int n10 = parcel.readInt();
                int n14 = parcel.readInt();
                int n15 = parcel.readInt();
                int n16 = parcel.readInt();
                int n17 = parcel.readInt();
                Object object = Bundle.CREATOR;
                Object object2 = object = ICustomTabsCallback$_Parcel.access$000(parcel, object);
                object2 = (Bundle)object;
                this.onActivityLayout(n10, n14, n15, n16, n17, (Bundle)object2);
                break;
            }
            case 9: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)ICustomTabsCallback$_Parcel.access$000(parcel, creator);
                this.onWarmupCompleted((Bundle)creator);
                break;
            }
            case 8: {
                n3 = parcel.readInt();
                int n18 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                parcel = (Bundle)ICustomTabsCallback$_Parcel.access$000(parcel, creator);
                this.onActivityResized(n3, n18, (Bundle)parcel);
                break;
            }
            case 7: {
                String string3 = parcel.readString();
                Parcelable.Creator creator = Bundle.CREATOR;
                parcel = (Bundle)ICustomTabsCallback$_Parcel.access$000(parcel, creator);
                string3 = this.extraCallbackWithResult(string3, (Bundle)parcel);
                parcel2.writeNoException();
                ICustomTabsCallback$_Parcel.access$100(parcel2, (Parcelable)string3, n8);
                break;
            }
            case 6: {
                n3 = parcel.readInt();
                parcel2 = Uri.CREATOR;
                parcel2 = (Uri)ICustomTabsCallback$_Parcel.access$000(parcel, (Parcelable.Creator)parcel2);
                n4 = parcel.readInt();
                if (n4 != 0) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    Object var16_25 = null;
                }
                string2 = Bundle.CREATOR;
                parcel = (Bundle)ICustomTabsCallback$_Parcel.access$000(parcel, (Parcelable.Creator)string2);
                this.onRelationshipValidationResult(n3, (Uri)parcel2, n4 != 0, (Bundle)parcel);
                break;
            }
            case 5: {
                String string4 = parcel.readString();
                Parcelable.Creator creator = Bundle.CREATOR;
                parcel = (Bundle)ICustomTabsCallback$_Parcel.access$000(parcel, creator);
                this.onPostMessage(string4, (Bundle)parcel);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)ICustomTabsCallback$_Parcel.access$000(parcel, creator);
                this.onMessageChannelReady((Bundle)creator);
                parcel2.writeNoException();
                break;
            }
            case 3: {
                String string5 = parcel.readString();
                parcel2 = Bundle.CREATOR;
                parcel = (Bundle)ICustomTabsCallback$_Parcel.access$000(parcel, (Parcelable.Creator)parcel2);
                this.extraCallback(string5, (Bundle)parcel);
                break;
            }
            case 2: {
                n3 = parcel.readInt();
                parcel2 = Bundle.CREATOR;
                parcel = (Bundle)ICustomTabsCallback$_Parcel.access$000(parcel, (Parcelable.Creator)parcel2);
                this.onNavigationEvent(n3, (Bundle)parcel);
            }
        }
        return n8 != 0;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsCallback$_Parcel;

class ICustomTabsCallback$Stub$Proxy
implements ICustomTabsCallback {
    private IBinder mRemote;

    public ICustomTabsCallback$Stub$Proxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public void extraCallback(String string2, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        String string3 = ICustomTabsCallback.DESCRIPTOR;
        parcel.writeInterfaceToken(string3);
        parcel.writeString(string2);
        string2 = null;
        ICustomTabsCallback$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
        string2 = this.mRemote;
        bundle = null;
        int n3 = 1;
        int n4 = 3;
        try {
            string2.transact(n4, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public Bundle extraCallbackWithResult(String object, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            String string2 = ICustomTabsCallback.DESCRIPTOR;
            parcel.writeInterfaceToken(string2);
            parcel.writeString((String)object);
            object = null;
            ICustomTabsCallback$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            bundle = this.mRemote;
            int n3 = 7;
            bundle.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            object = Bundle.CREATOR;
            object = ICustomTabsCallback$_Parcel.access$000(parcel2, (Parcelable.Creator)object);
            object = (Bundle)object;
            return object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public String getInterfaceDescriptor() {
        return ICustomTabsCallback.DESCRIPTOR;
    }

    public void onActivityLayout(int n3, int n4, int n7, int n8, int n10, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        String string2 = ICustomTabsCallback.DESCRIPTOR;
        parcel.writeInterfaceToken(string2);
        parcel.writeInt(n3);
        parcel.writeInt(n4);
        parcel.writeInt(n7);
        parcel.writeInt(n8);
        parcel.writeInt(n10);
        n3 = 0;
        IBinder iBinder = null;
        ICustomTabsCallback$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
        iBinder = this.mRemote;
        n4 = 0;
        n7 = 1;
        n8 = 10;
        try {
            iBinder.transact(n8, parcel, null, n7);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onActivityResized(int n3, int n4, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        String string2 = ICustomTabsCallback.DESCRIPTOR;
        parcel.writeInterfaceToken(string2);
        parcel.writeInt(n3);
        parcel.writeInt(n4);
        n3 = 0;
        IBinder iBinder = null;
        ICustomTabsCallback$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
        iBinder = this.mRemote;
        n4 = 0;
        int n7 = 1;
        int n8 = 8;
        try {
            iBinder.transact(n8, parcel, null, n7);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onMessageChannelReady(Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            String string2 = ICustomTabsCallback.DESCRIPTOR;
            parcel.writeInterfaceToken(string2);
            string2 = null;
            ICustomTabsCallback$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            bundle = this.mRemote;
            int n3 = 4;
            bundle.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void onMinimized(Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        String string2 = ICustomTabsCallback.DESCRIPTOR;
        parcel.writeInterfaceToken(string2);
        string2 = null;
        ICustomTabsCallback$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
        bundle = this.mRemote;
        string2 = null;
        int n3 = 1;
        int n4 = 11;
        try {
            bundle.transact(n4, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onNavigationEvent(int n3, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        String string2 = ICustomTabsCallback.DESCRIPTOR;
        parcel.writeInterfaceToken(string2);
        parcel.writeInt(n3);
        n3 = 0;
        IBinder iBinder = null;
        ICustomTabsCallback$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
        iBinder = this.mRemote;
        bundle = null;
        int n4 = 1;
        int n7 = 2;
        try {
            iBinder.transact(n7, parcel, null, n4);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onPostMessage(String string2, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            String string3 = ICustomTabsCallback.DESCRIPTOR;
            parcel.writeInterfaceToken(string3);
            parcel.writeString(string2);
            string2 = null;
            ICustomTabsCallback$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            bundle = this.mRemote;
            int n3 = 5;
            bundle.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public void onRelationshipValidationResult(int n3, Uri uri, boolean bl2, Bundle bundle) {
        Object var4_5;
        Parcel parcel = Parcel.obtain();
        String string2 = ICustomTabsCallback.DESCRIPTOR;
        parcel.writeInterfaceToken(string2);
        parcel.writeInt(n3);
        n3 = 0;
        IBinder iBinder = null;
        ICustomTabsCallback$_Parcel.access$100(parcel, (Parcelable)uri, 0);
        int n4 = 1;
        parcel.writeInt((int)(bl2 ? 1 : 0));
        ICustomTabsCallback$_Parcel.access$100(parcel, var4_5, 0);
        iBinder = this.mRemote;
        int n7 = 6;
        var4_5 = null;
        try {
            iBinder.transact(n7, parcel, null, n4);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onUnminimized(Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        String string2 = ICustomTabsCallback.DESCRIPTOR;
        parcel.writeInterfaceToken(string2);
        string2 = null;
        ICustomTabsCallback$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
        bundle = this.mRemote;
        string2 = null;
        int n3 = 1;
        int n4 = 12;
        try {
            bundle.transact(n4, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onWarmupCompleted(Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        String string2 = ICustomTabsCallback.DESCRIPTOR;
        parcel.writeInterfaceToken(string2);
        string2 = null;
        ICustomTabsCallback$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
        bundle = this.mRemote;
        string2 = null;
        int n3 = 1;
        int n4 = 9;
        try {
            bundle.transact(n4, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }
}


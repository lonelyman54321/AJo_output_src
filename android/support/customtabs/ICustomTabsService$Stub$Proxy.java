/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.ICustomTabsService$_Parcel;
import java.util.List;

class ICustomTabsService$Stub$Proxy
implements ICustomTabsService {
    private IBinder mRemote;

    public ICustomTabsService$Stub$Proxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public Bundle extraCommand(String object, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            String string2 = ICustomTabsService.DESCRIPTOR;
            parcel.writeInterfaceToken(string2);
            parcel.writeString((String)object);
            object = null;
            ICustomTabsService$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            bundle = this.mRemote;
            int n3 = 5;
            bundle.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            object = Bundle.CREATOR;
            object = ICustomTabsService$_Parcel.access$000(parcel2, (Parcelable.Creator)object);
            object = (Bundle)object;
            return object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public String getInterfaceDescriptor() {
        return ICustomTabsService.DESCRIPTOR;
    }

    public boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block6: {
            String string2;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            try {
                string2 = ICustomTabsService.DESCRIPTOR;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            parcel2.writeInterfaceToken(string2);
            parcel2.writeStrongInterface((IInterface)iCustomTabsCallback);
            bl2 = false;
            iCustomTabsCallback = null;
            ICustomTabsService$_Parcel.access$100(parcel2, (Parcelable)bundle, 0);
            bundle = this.mRemote;
            int n3 = 13;
            bundle.transact(n3, parcel2, parcel, 0);
            parcel.readException();
            int n4 = parcel.readInt();
            if (n4 == 0) break block6;
            bl2 = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }

    public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List list) {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block8: {
            String string2;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            try {
                string2 = ICustomTabsService.DESCRIPTOR;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            parcel2.writeInterfaceToken(string2);
            parcel2.writeStrongInterface((IInterface)iCustomTabsCallback);
            bl2 = false;
            iCustomTabsCallback = null;
            ICustomTabsService$_Parcel.access$100(parcel2, (Parcelable)uri, 0);
            ICustomTabsService$_Parcel.access$100(parcel2, (Parcelable)bundle, 0);
            ICustomTabsService$_Parcel.access$200(parcel2, list, 0);
            uri = this.mRemote;
            int n3 = 4;
            uri.transact(n3, parcel2, parcel, 0);
            parcel.readException();
            int n4 = parcel.readInt();
            if (n4 == 0) break block8;
            bl2 = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }

    public boolean newSession(ICustomTabsCallback iCustomTabsCallback) {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block5: {
            String string2;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            try {
                string2 = ICustomTabsService.DESCRIPTOR;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            parcel2.writeInterfaceToken(string2);
            parcel2.writeStrongInterface((IInterface)iCustomTabsCallback);
            iCustomTabsCallback = this.mRemote;
            int n3 = 3;
            bl2 = false;
            iCustomTabsCallback.transact(n3, parcel2, parcel, 0);
            parcel.readException();
            int n4 = parcel.readInt();
            if (n4 == 0) break block5;
            bl2 = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }

    public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block6: {
            String string2;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            try {
                string2 = ICustomTabsService.DESCRIPTOR;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            parcel2.writeInterfaceToken(string2);
            parcel2.writeStrongInterface((IInterface)iCustomTabsCallback);
            bl2 = false;
            iCustomTabsCallback = null;
            ICustomTabsService$_Parcel.access$100(parcel2, (Parcelable)bundle, 0);
            bundle = this.mRemote;
            int n3 = 10;
            bundle.transact(n3, parcel2, parcel, 0);
            parcel.readException();
            int n4 = parcel.readInt();
            if (n4 == 0) break block6;
            bl2 = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }

    public int postMessage(ICustomTabsCallback iCustomTabsCallback, String string2, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string3 = ICustomTabsService.DESCRIPTOR;
        parcel.writeInterfaceToken(string3);
        parcel.writeStrongInterface((IInterface)iCustomTabsCallback);
        parcel.writeString(string2);
        int n3 = 0;
        iCustomTabsCallback = null;
        try {
            ICustomTabsService$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            string2 = this.mRemote;
            int n4 = 8;
            string2.transact(n4, parcel, parcel2, 0);
            parcel2.readException();
            n3 = parcel2.readInt();
            return n3;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int n3, Bundle bundle) {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block8: {
            String string2;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            try {
                string2 = ICustomTabsService.DESCRIPTOR;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            parcel2.writeInterfaceToken(string2);
            parcel2.writeStrongInterface((IInterface)iCustomTabsCallback);
            bl2 = false;
            iCustomTabsCallback = null;
            ICustomTabsService$_Parcel.access$100(parcel2, (Parcelable)uri, 0);
            parcel2.writeInt(n3);
            ICustomTabsService$_Parcel.access$100(parcel2, (Parcelable)bundle, 0);
            uri = this.mRemote;
            n3 = 12;
            uri.transact(n3, parcel2, parcel, 0);
            parcel.readException();
            int n4 = parcel.readInt();
            if (n4 == 0) break block8;
            bl2 = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }

    public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block6: {
            String string2;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            try {
                string2 = ICustomTabsService.DESCRIPTOR;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            parcel2.writeInterfaceToken(string2);
            parcel2.writeStrongInterface((IInterface)iCustomTabsCallback);
            bl2 = false;
            iCustomTabsCallback = null;
            ICustomTabsService$_Parcel.access$100(parcel2, (Parcelable)uri, 0);
            uri = this.mRemote;
            int n3 = 7;
            uri.transact(n3, parcel2, parcel, 0);
            parcel.readException();
            int n4 = parcel.readInt();
            if (n4 == 0) break block6;
            bl2 = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }

    public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block7: {
            String string2;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            try {
                string2 = ICustomTabsService.DESCRIPTOR;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            parcel2.writeInterfaceToken(string2);
            parcel2.writeStrongInterface((IInterface)iCustomTabsCallback);
            bl2 = false;
            iCustomTabsCallback = null;
            ICustomTabsService$_Parcel.access$100(parcel2, (Parcelable)uri, 0);
            ICustomTabsService$_Parcel.access$100(parcel2, (Parcelable)bundle, 0);
            uri = this.mRemote;
            int n3 = 11;
            uri.transact(n3, parcel2, parcel, 0);
            parcel.readException();
            int n4 = parcel.readInt();
            if (n4 == 0) break block7;
            bl2 = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }

    public boolean setEngagementSignalsCallback(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block7: {
            String string2;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            try {
                string2 = ICustomTabsService.DESCRIPTOR;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            parcel2.writeInterfaceToken(string2);
            parcel2.writeStrongInterface((IInterface)iCustomTabsCallback);
            parcel2.writeStrongBinder(iBinder);
            bl2 = false;
            iCustomTabsCallback = null;
            ICustomTabsService$_Parcel.access$100(parcel2, (Parcelable)bundle, 0);
            iBinder = this.mRemote;
            int n3 = 14;
            iBinder.transact(n3, parcel2, parcel, 0);
            parcel.readException();
            int n4 = parcel.readInt();
            if (n4 == 0) break block7;
            bl2 = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }

    public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block6: {
            String string2;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            try {
                string2 = ICustomTabsService.DESCRIPTOR;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            parcel2.writeInterfaceToken(string2);
            parcel2.writeStrongInterface((IInterface)iCustomTabsCallback);
            bl2 = false;
            iCustomTabsCallback = null;
            ICustomTabsService$_Parcel.access$100(parcel2, (Parcelable)bundle, 0);
            bundle = this.mRemote;
            int n3 = 6;
            bundle.transact(n3, parcel2, parcel, 0);
            parcel.readException();
            int n4 = parcel.readInt();
            if (n4 == 0) break block6;
            bl2 = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }

    public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int n3, Uri uri, Bundle bundle) {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block8: {
            String string2;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            try {
                string2 = ICustomTabsService.DESCRIPTOR;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            parcel2.writeInterfaceToken(string2);
            parcel2.writeStrongInterface((IInterface)iCustomTabsCallback);
            parcel2.writeInt(n3);
            bl2 = false;
            iCustomTabsCallback = null;
            ICustomTabsService$_Parcel.access$100(parcel2, (Parcelable)uri, 0);
            ICustomTabsService$_Parcel.access$100(parcel2, (Parcelable)bundle, 0);
            IBinder iBinder = this.mRemote;
            int n4 = 9;
            iBinder.transact(n4, parcel2, parcel, 0);
            parcel.readException();
            n3 = parcel.readInt();
            if (n3 == 0) break block8;
            bl2 = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }

    public boolean warmup(long l2) {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block5: {
            String string2;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            try {
                string2 = ICustomTabsService.DESCRIPTOR;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            parcel2.writeInterfaceToken(string2);
            parcel2.writeLong(l2);
            IBinder iBinder = this.mRemote;
            int n3 = 2;
            bl2 = false;
            string2 = null;
            iBinder.transact(n3, parcel2, parcel, 0);
            parcel.readException();
            int n4 = parcel.readInt();
            if (n4 == 0) break block5;
            bl2 = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }
}


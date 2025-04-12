/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 */
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class Hc1$a$a
implements hc1_1 {
    public IBinder a;

    public final int a(Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "com.facebook.ppml.receiver.IReceiverService";
        try {
            parcel.writeInterfaceToken(string2);
            int n3 = 1;
            parcel.writeInt(n3);
            bundle.writeToParcel(parcel, 0);
            bundle = this.a;
            bundle.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            int n4 = parcel2.readInt();
            return n4;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.a;
    }
}


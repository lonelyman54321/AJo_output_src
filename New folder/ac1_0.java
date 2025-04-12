/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
import android.os.IBinder;
import android.os.Parcel;

/*
 * Renamed from Ac1
 */
public final class ac1_0
implements bc1_0 {
    public IBinder a;

    public final IBinder asBinder() {
        return this.a;
    }

    public final void b(String[] iBinder) {
        Parcel parcel = Parcel.obtain();
        String string2 = bc1_0.d0;
        parcel.writeInterfaceToken(string2);
        parcel.writeStringArray((String[])iBinder);
        iBinder = this.a;
        string2 = null;
        int n3 = 1;
        try {
            iBinder.transact(n3, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }
}


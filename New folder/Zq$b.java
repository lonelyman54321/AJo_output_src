/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;

public final class Zq$b
implements IInterface {
    public final IBinder a;

    public Zq$b(IBinder iBinder) {
        Intrinsics.checkNotNullParameter(iBinder, "binder");
        this.a = iBinder;
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final String c() {
        Parcel parcel = Parcel.obtain();
        String string2 = "obtain()";
        Intrinsics.checkNotNullExpressionValue(parcel, string2);
        Parcel parcel2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcel2, string2);
        string2 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = this.a;
            int n3 = 1;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            string2 = parcel2.readString();
            return string2;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public final boolean d() {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block4: {
            parcel2 = Parcel.obtain();
            String string2 = "obtain()";
            Intrinsics.checkNotNullExpressionValue(parcel2, string2);
            parcel = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcel, string2);
            string2 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
            try {
                parcel2.writeInterfaceToken(string2);
                bl2 = true;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            parcel2.writeInt((int)(bl2 ? 1 : 0));
            IBinder iBinder = this.a;
            int n3 = 2;
            iBinder.transact(n3, parcel2, parcel, 0);
            parcel.readException();
            int n4 = parcel.readInt();
            if (n4 != 0) break block4;
            bl2 = false;
            string2 = null;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }
}


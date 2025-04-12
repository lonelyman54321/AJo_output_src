/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;

/*
 * Renamed from AK3
 */
public final class ak3_1 {
    public static IObjectWrapper a(Parcel parcel) {
        IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return iObjectWrapper;
    }
}


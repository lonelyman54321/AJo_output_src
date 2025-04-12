/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/*
 * Renamed from PZ0
 */
public final class pz0_2 {
    public static int a(Parcelable.Creator object, Parcel parcel, ArrayList arrayList, int n3, int n4) {
        object = object.createFromParcel(parcel);
        arrayList.add(object);
        return n3 + n4;
    }
}


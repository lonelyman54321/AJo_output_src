/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
import android.os.Parcel;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from OZ0
 */
public final class oz0_2 {
    public static Iterator a(Parcel parcel, List list, int n3) {
        parcel.writeInt(n3);
        n3 = list.size();
        parcel.writeInt(n3);
        return list.iterator();
    }
}


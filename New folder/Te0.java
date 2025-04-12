/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 */
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class Te0 {
    public static byte[] a(long l2, List object) {
        se0_0 se0_02 = new Object();
        int n3 = object.size();
        ArrayList arrayList = new ArrayList(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object object2 = object.next();
            object2 = (Bundle)se0_02.apply(object2);
            arrayList.add(object2);
        }
        object = new Bundle();
        object.putParcelableArrayList("c", arrayList);
        object.putLong("d", l2);
        Parcel parcel = Parcel.obtain();
        parcel.writeBundle((Bundle)object);
        byte[] byArray = parcel.marshall();
        parcel.recycle();
        return byArray;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class ParcelableSnapshotMutableState$a
implements Parcelable.ClassLoaderCreator {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static ParcelableSnapshotMutableState a(Parcel object, ClassLoader object2) {
        void var0_5;
        Object object3;
        if (object3 == null) {
            object3 = ParcelableSnapshotMutableState$a.class.getClassLoader();
        }
        object3 = object.readValue((ClassLoader)object3);
        int n3 = object.readInt();
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    String string2 = Gj0.b(n3, "Unsupported MutableState policy ", " was restored");
                    object3 = new IllegalStateException(string2);
                    throw object3;
                }
                J83.i();
                vf_1 vf_12 = vf_1.b;
                return new h83_0(object3, (I83)var0_5);
            } else {
                J83.l();
                qi_2 qi_22 = qi_2.b;
            }
            return new h83_0(object3, (I83)var0_5);
        }
        J83.h();
        wv1_0 wv1_02 = wv1_0.b;
        return new h83_0(object3, (I83)var0_5);
    }

    public final Object createFromParcel(Parcel parcel) {
        return ParcelableSnapshotMutableState$a.a(parcel, null);
    }

    public final Object[] newArray(int n3) {
        return new ParcelableSnapshotMutableState[n3];
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a;
import java.util.List;

public class StaggeredGridLayoutManager$SavedState
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    public int[] f;
    public List g;
    public boolean h;
    public boolean i;
    public boolean j;

    static {
        StaggeredGridLayoutManager$SavedState$a staggeredGridLayoutManager$SavedState$a = new Object();
        CREATOR = staggeredGridLayoutManager$SavedState$a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object;
        n3 = this.a;
        parcel.writeInt(n3);
        n3 = this.b;
        parcel.writeInt(n3);
        n3 = this.c;
        parcel.writeInt(n3);
        n3 = this.c;
        if (n3 > 0) {
            object = this.d;
            parcel.writeIntArray(object);
        }
        n3 = this.e;
        parcel.writeInt(n3);
        n3 = this.e;
        if (n3 > 0) {
            object = this.f;
            parcel.writeIntArray(object);
        }
        n3 = (int)(this.h ? 1 : 0);
        parcel.writeInt(n3);
        n3 = (int)(this.i ? 1 : 0);
        parcel.writeInt(n3);
        n3 = (int)(this.j ? 1 : 0);
        parcel.writeInt(n3);
        object = this.g;
        parcel.writeList((List)object);
    }
}


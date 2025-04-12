/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState;

public final class StaggeredGridLayoutManager$SavedState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel object) {
        Object object2;
        int n3;
        StaggeredGridLayoutManager$SavedState staggeredGridLayoutManager$SavedState = new Object();
        staggeredGridLayoutManager$SavedState.a = n3 = object.readInt();
        staggeredGridLayoutManager$SavedState.b = n3 = object.readInt();
        staggeredGridLayoutManager$SavedState.c = n3 = object.readInt();
        if (n3 > 0) {
            object2 = new int[n3];
            staggeredGridLayoutManager$SavedState.d = object2;
            object.readIntArray(object2);
        }
        staggeredGridLayoutManager$SavedState.e = n3 = object.readInt();
        if (n3 > 0) {
            object2 = new int[n3];
            staggeredGridLayoutManager$SavedState.f = object2;
            object.readIntArray(object2);
        }
        n3 = object.readInt();
        boolean bl2 = false;
        int n4 = 1;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        staggeredGridLayoutManager$SavedState.h = n3;
        n3 = object.readInt();
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        staggeredGridLayoutManager$SavedState.i = n3;
        n3 = object.readInt();
        if (n3 == n4) {
            bl2 = true;
        }
        staggeredGridLayoutManager$SavedState.j = bl2;
        object2 = StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader();
        object = object.readArrayList((ClassLoader)object2);
        staggeredGridLayoutManager$SavedState.g = object;
        return staggeredGridLayoutManager$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new StaggeredGridLayoutManager$SavedState[n3];
    }
}


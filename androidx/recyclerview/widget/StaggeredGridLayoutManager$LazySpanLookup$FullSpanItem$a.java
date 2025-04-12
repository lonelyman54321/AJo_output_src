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

public final class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int n3;
        int n4;
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = new Object();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a = n4 = parcel.readInt();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.b = n4 = parcel.readInt();
        n4 = parcel.readInt();
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.d = n3;
        n4 = parcel.readInt();
        if (n4 > 0) {
            int[] nArray = new int[n4];
            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.c = nArray;
            parcel.readIntArray(nArray);
        }
        return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
    }

    public final Object[] newArray(int n3) {
        return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[n3];
    }
}


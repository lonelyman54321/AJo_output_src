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
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a;
import java.util.Arrays;

class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public int b;
    public int[] c;
    public boolean d;

    static {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a = new Object();
        CREATOR = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FullSpanItem{mPosition=");
        int bl2 = this.a;
        stringBuilder.append(bl2);
        stringBuilder.append(", mGapDir=");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", mHasUnwantedGapAfter=");
        boolean bl3 = this.d;
        stringBuilder.append(bl3);
        stringBuilder.append(", mGapPerSpan=");
        String string2 = Arrays.toString(this.c);
        stringBuilder.append(string2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4;
        n3 = this.a;
        parcel.writeInt(n3);
        n3 = this.b;
        parcel.writeInt(n3);
        n3 = (int)(this.d ? 1 : 0);
        parcel.writeInt(n3);
        int[] nArray = this.c;
        if (nArray != null && (n4 = nArray.length) > 0) {
            n3 = nArray.length;
            parcel.writeInt(n3);
            nArray = this.c;
            parcel.writeIntArray(nArray);
        } else {
            n3 = 0;
            nArray = null;
            parcel.writeInt(0);
        }
    }
}


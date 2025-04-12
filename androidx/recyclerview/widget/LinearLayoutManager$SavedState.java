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
import androidx.recyclerview.widget.LinearLayoutManager$SavedState$a;

public class LinearLayoutManager$SavedState
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public int b;
    public boolean c;

    static {
        LinearLayoutManager$SavedState$a linearLayoutManager$SavedState$a = new Object();
        CREATOR = linearLayoutManager$SavedState$a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.a;
        parcel.writeInt(n3);
        n3 = this.b;
        parcel.writeInt(n3);
        n3 = (int)(this.c ? 1 : 0);
        parcel.writeInt(n3);
    }
}


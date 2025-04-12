/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.view.View$BaseSavedState
 */
package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.widget.NestedScrollView$SavedState$a;

class NestedScrollView$SavedState
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    public int a;

    static {
        NestedScrollView$SavedState$a nestedScrollView$SavedState$a = new Object();
        CREATOR = nestedScrollView$SavedState$a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HorizontalScrollView.SavedState{");
        String string2 = Integer.toHexString(System.identityHashCode((Object)this));
        stringBuilder.append(string2);
        stringBuilder.append(" scrollPosition=");
        return g30.a(this.a, "}", stringBuilder);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        n3 = this.a;
        parcel.writeInt(n3);
    }
}


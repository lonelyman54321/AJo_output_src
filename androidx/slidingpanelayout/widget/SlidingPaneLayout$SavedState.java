/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.slidingpanelayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a;

class SlidingPaneLayout$SavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public boolean a;
    public int b;

    static {
        SlidingPaneLayout$SavedState$a slidingPaneLayout$SavedState$a = new Object();
        CREATOR = slidingPaneLayout$SavedState$a;
    }

    public SlidingPaneLayout$SavedState(Parcel parcel) {
        super(parcel, null);
        int n3;
        int n4 = parcel.readInt();
        n4 = n4 != 0 ? 1 : 0;
        this.a = n4;
        this.b = n3 = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        n3 = (int)(this.a ? 1 : 0);
        parcel.writeInt(n3);
        n3 = this.b;
        parcel.writeInt(n3);
    }
}


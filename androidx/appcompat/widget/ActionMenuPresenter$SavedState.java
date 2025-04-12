/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.ActionMenuPresenter$SavedState$a;

class ActionMenuPresenter$SavedState
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;

    static {
        ActionMenuPresenter$SavedState$a actionMenuPresenter$SavedState$a = new Object();
        CREATOR = actionMenuPresenter$SavedState$a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.a;
        parcel.writeInt(n3);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.view.View$BaseSavedState
 */
package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner$SavedState$a;

class AppCompatSpinner$SavedState
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    public boolean a;

    static {
        AppCompatSpinner$SavedState$a appCompatSpinner$SavedState$a = new Object();
        CREATOR = appCompatSpinner$SavedState$a;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        n3 = (byte)(this.a ? 1 : 0);
        parcel.writeByte((byte)n3);
    }
}


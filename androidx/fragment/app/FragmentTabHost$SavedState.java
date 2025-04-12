/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.view.View$BaseSavedState
 */
package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentTabHost$SavedState$a;

class FragmentTabHost$SavedState
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    public String a;

    static {
        FragmentTabHost$SavedState$a fragmentTabHost$SavedState$a = new Object();
        CREATOR = fragmentTabHost$SavedState$a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FragmentTabHost.SavedState{");
        String string2 = Integer.toHexString(System.identityHashCode((Object)this));
        stringBuilder.append(string2);
        stringBuilder.append(" curTab=");
        string2 = this.a;
        return h30_0.a(stringBuilder, string2, "}");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        String string2 = this.a;
        parcel.writeString(string2);
    }
}


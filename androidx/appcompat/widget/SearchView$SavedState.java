/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.SearchView$SavedState$a;
import androidx.customview.view.AbsSavedState;

class SearchView$SavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public boolean a;

    static {
        SearchView$SavedState$a searchView$SavedState$a = new Object();
        CREATOR = searchView$SavedState$a;
    }

    public SearchView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean bl2;
        this.a = bl2 = ((Boolean)parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SearchView.SavedState{");
        String string2 = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append(string2);
        stringBuilder.append(" isIconified=");
        boolean bl2 = this.a;
        return Vm.a("}", bl2, stringBuilder);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        Boolean bl2 = this.a;
        parcel.writeValue((Object)bl2);
    }
}


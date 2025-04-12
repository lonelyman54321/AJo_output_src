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
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView$SavedState$a;
import androidx.recyclerview.widget.RecyclerView$o;

public class RecyclerView$SavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public Parcelable a;

    static {
        RecyclerView$SavedState$a recyclerView$SavedState$a = new Object();
        CREATOR = recyclerView$SavedState$a;
    }

    public RecyclerView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            classLoader = RecyclerView$o.class.getClassLoader();
        }
        parcel = parcel.readParcelable(classLoader);
        this.a = parcel;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        Parcelable parcelable = this.a;
        parcel.writeParcelable(parcelable, 0);
    }
}


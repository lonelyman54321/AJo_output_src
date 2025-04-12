/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.view.View$BaseSavedState
 */
package androidx.viewpager2.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2$SavedState$a;

class ViewPager2$SavedState
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public int b;
    public Parcelable c;

    static {
        ViewPager2$SavedState$a viewPager2$SavedState$a = new Object();
        CREATOR = viewPager2$SavedState$a;
    }

    public ViewPager2$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int n3;
        this.a = n3 = parcel.readInt();
        this.b = n3 = parcel.readInt();
        parcel = parcel.readParcelable(classLoader);
        this.c = parcel;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        int n4 = this.a;
        parcel.writeInt(n4);
        n4 = this.b;
        parcel.writeInt(n4);
        Parcelable parcelable = this.c;
        parcel.writeParcelable(parcelable, n3);
    }
}


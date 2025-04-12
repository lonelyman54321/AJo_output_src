/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.view.View$BaseSavedState
 */
package com.ril.ajio.customviews.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.ril.ajio.customviews.widgets.ViewSavedState$1;

public class ViewSavedState
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    int prevScrollY;
    int scrollY;

    static {
        ViewSavedState$1 viewSavedState$1 = new ViewSavedState$1();
        CREATOR = viewSavedState$1;
    }

    private ViewSavedState(Parcel parcel) {
        super(parcel);
        int n3;
        int n4;
        this.prevScrollY = n4 = parcel.readInt();
        this.scrollY = n3 = parcel.readInt();
    }

    public /* synthetic */ ViewSavedState(Parcel parcel, int n3) {
        this(parcel);
    }

    public ViewSavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        n3 = this.prevScrollY;
        parcel.writeInt(n3);
        n3 = this.scrollY;
        parcel.writeInt(n3);
    }
}


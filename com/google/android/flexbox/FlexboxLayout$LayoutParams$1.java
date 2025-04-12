/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;

class FlexboxLayout$LayoutParams$1
implements Parcelable.Creator {
    public FlexboxLayout$LayoutParams createFromParcel(Parcel parcel) {
        FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = new FlexboxLayout$LayoutParams(parcel);
        return flexboxLayout$LayoutParams;
    }

    public FlexboxLayout$LayoutParams[] newArray(int n3) {
        return new FlexboxLayout$LayoutParams[n3];
    }
}


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
import com.google.android.flexbox.FlexboxLayoutManager$LayoutParams;

class FlexboxLayoutManager$LayoutParams$1
implements Parcelable.Creator {
    public FlexboxLayoutManager$LayoutParams createFromParcel(Parcel parcel) {
        FlexboxLayoutManager$LayoutParams flexboxLayoutManager$LayoutParams = new FlexboxLayoutManager$LayoutParams(parcel);
        return flexboxLayoutManager$LayoutParams;
    }

    public FlexboxLayoutManager$LayoutParams[] newArray(int n3) {
        return new FlexboxLayoutManager$LayoutParams[n3];
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.checkbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.checkbox.MaterialCheckBox$SavedState;

class MaterialCheckBox$SavedState$1
implements Parcelable.Creator {
    public MaterialCheckBox$SavedState createFromParcel(Parcel parcel) {
        MaterialCheckBox$SavedState materialCheckBox$SavedState = new MaterialCheckBox$SavedState(parcel, null);
        return materialCheckBox$SavedState;
    }

    public MaterialCheckBox$SavedState[] newArray(int n3) {
        return new MaterialCheckBox$SavedState[n3];
    }
}


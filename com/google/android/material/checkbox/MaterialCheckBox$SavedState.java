/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.view.View$BaseSavedState
 */
package com.google.android.material.checkbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox$1;
import com.google.android.material.checkbox.MaterialCheckBox$SavedState$1;

class MaterialCheckBox$SavedState
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    int checkedState;

    static {
        MaterialCheckBox$SavedState$1 materialCheckBox$SavedState$1 = new MaterialCheckBox$SavedState$1();
        CREATOR = materialCheckBox$SavedState$1;
    }

    private MaterialCheckBox$SavedState(Parcel parcel) {
        super(parcel);
        int n3;
        ClassLoader classLoader = ((Object)((Object)this)).getClass().getClassLoader();
        this.checkedState = n3 = ((Integer)parcel.readValue(classLoader)).intValue();
    }

    public /* synthetic */ MaterialCheckBox$SavedState(Parcel parcel, MaterialCheckBox.1 var2_2) {
        this(parcel);
    }

    public MaterialCheckBox$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    private String getCheckedStateString() {
        int n3 = this.checkedState;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                return "unchecked";
            }
            return "indeterminate";
        }
        return "checked";
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MaterialCheckBox.SavedState{");
        String string2 = Integer.toHexString(System.identityHashCode((Object)this));
        stringBuilder.append(string2);
        stringBuilder.append(" CheckedState=");
        string2 = this.getCheckedStateString();
        return h30_0.a(stringBuilder, string2, "}");
    }

    public void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        Integer n4 = this.checkedState;
        parcel.writeValue((Object)n4);
    }
}


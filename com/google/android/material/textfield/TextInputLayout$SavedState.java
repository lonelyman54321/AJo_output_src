/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package com.google.android.material.textfield;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.textfield.TextInputLayout$SavedState$1;

class TextInputLayout$SavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    CharSequence error;
    boolean isEndIconChecked;

    static {
        TextInputLayout$SavedState$1 textInputLayout$SavedState$1 = new TextInputLayout$SavedState$1();
        CREATOR = textInputLayout$SavedState$1;
    }

    public TextInputLayout$SavedState(Parcel parcel, ClassLoader object) {
        super(parcel, (ClassLoader)object);
        this.error = object = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        int n3 = parcel.readInt();
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
            object = null;
        }
        this.isEndIconChecked = n4;
    }

    public TextInputLayout$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("TextInputLayout.SavedState{");
        CharSequence charSequence = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append((String)charSequence);
        stringBuilder.append(" error=");
        charSequence = this.error;
        stringBuilder.append((Object)charSequence);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        TextUtils.writeToParcel((CharSequence)this.error, (Parcel)parcel, (int)n3);
        n3 = (int)(this.isEndIconChecked ? 1 : 0);
        parcel.writeInt(n3);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.stateful.ExtendableSavedState$1;

public class ExtendableSavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public final a53 extendableStates;

    static {
        ExtendableSavedState$1 extendableSavedState$1 = new ExtendableSavedState$1();
        CREATOR = extendableSavedState$1;
    }

    private ExtendableSavedState(Parcel object, ClassLoader classLoader) {
        super((Parcel)object, classLoader);
        int n3 = object.readInt();
        String[] stringArray = new String[n3];
        object.readStringArray(stringArray);
        Object[] objectArray = new Bundle[n3];
        Object object2 = Bundle.CREATOR;
        object.readTypedArray(objectArray, (Parcelable.Creator)object2);
        super(n3);
        this.extendableStates = object;
        object = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            object2 = this.extendableStates;
            String string2 = stringArray[i3];
            Object object3 = objectArray[i3];
            ((a53)object2).put(string2, object3);
        }
    }

    public /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, ExtendableSavedState$1 extendableSavedState$1) {
        this(parcel, classLoader);
    }

    public ExtendableSavedState(Parcelable object) {
        super((Parcelable)object);
        super();
        this.extendableStates = object;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ExtendableSavedState{");
        Object object = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append((String)object);
        stringBuilder.append(" states=");
        object = this.extendableStates;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        a53 a532 = this.extendableStates;
        n3 = a532.c;
        parcel.writeInt(n3);
        String[] stringArray = new String[n3];
        Bundle[] bundleArray = new Bundle[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2;
            stringArray[i3] = string2 = (String)this.extendableStates.h(i3);
            string2 = (Bundle)this.extendableStates.l(i3);
            bundleArray[i3] = string2;
        }
        parcel.writeStringArray(stringArray);
        parcel.writeTypedArray((Parcelable[])bundleArray, 0);
    }
}


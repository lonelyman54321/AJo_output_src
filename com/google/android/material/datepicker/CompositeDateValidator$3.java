/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints$DateValidator;
import com.google.android.material.datepicker.CompositeDateValidator;
import com.google.android.material.datepicker.CompositeDateValidator$Operator;
import java.util.List;

class CompositeDateValidator$3
implements Parcelable.Creator {
    public CompositeDateValidator createFromParcel(Parcel object) {
        int n3;
        Object object2 = CalendarConstraints$DateValidator.class.getClassLoader();
        object2 = object.readArrayList((ClassLoader)object2);
        int n4 = object.readInt();
        object = n4 == (n3 = 2) ? CompositeDateValidator.access$000() : (n4 == (n3 = 1) ? CompositeDateValidator.access$100() : CompositeDateValidator.access$000());
        object2.getClass();
        CompositeDateValidator compositeDateValidator = new CompositeDateValidator((List)object2, (CompositeDateValidator$Operator)object, null);
        return compositeDateValidator;
    }

    public CompositeDateValidator[] newArray(int n3) {
        return new CompositeDateValidator[n3];
    }
}


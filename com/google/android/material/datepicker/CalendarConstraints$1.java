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
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CalendarConstraints$DateValidator;
import com.google.android.material.datepicker.Month;

class CalendarConstraints$1
implements Parcelable.Creator {
    public CalendarConstraints createFromParcel(Parcel object) {
        Object object2 = Month.class;
        ClassLoader classLoader = ((Class)object2).getClassLoader();
        classLoader = object.readParcelable(classLoader);
        Object object3 = classLoader;
        object3 = (Month)((Object)classLoader);
        classLoader = ((Class)object2).getClassLoader();
        classLoader = object.readParcelable(classLoader);
        Object object4 = classLoader;
        object4 = (Month)((Object)classLoader);
        object2 = ((Class)object2).getClassLoader();
        Object object5 = object2 = object.readParcelable((ClassLoader)object2);
        object5 = (Month)object2;
        object2 = CalendarConstraints$DateValidator.class.getClassLoader();
        Object object6 = object2 = object.readParcelable((ClassLoader)object2);
        object6 = (CalendarConstraints$DateValidator)object2;
        int n3 = object.readInt();
        object = new CalendarConstraints((Month)object3, (Month)object4, (CalendarConstraints$DateValidator)object6, (Month)object5, n3, null);
        return object;
    }

    public CalendarConstraints[] newArray(int n3) {
        return new CalendarConstraints[n3];
    }
}


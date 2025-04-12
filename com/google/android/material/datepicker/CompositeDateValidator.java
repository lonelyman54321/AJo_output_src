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
import com.google.android.material.datepicker.CompositeDateValidator$1;
import com.google.android.material.datepicker.CompositeDateValidator$2;
import com.google.android.material.datepicker.CompositeDateValidator$3;
import com.google.android.material.datepicker.CompositeDateValidator$Operator;
import java.util.List;

public final class CompositeDateValidator
implements CalendarConstraints$DateValidator {
    private static final CompositeDateValidator$Operator ALL_OPERATOR;
    private static final CompositeDateValidator$Operator ANY_OPERATOR;
    private static final int COMPARATOR_ALL_ID = 2;
    private static final int COMPARATOR_ANY_ID = 1;
    public static final Parcelable.Creator CREATOR;
    private final CompositeDateValidator$Operator operator;
    private final List validators;

    static {
        Object object = new CompositeDateValidator$1();
        ANY_OPERATOR = object;
        object = new CompositeDateValidator$2();
        ALL_OPERATOR = object;
        object = new CompositeDateValidator$3();
        CREATOR = object;
    }

    private CompositeDateValidator(List list, CompositeDateValidator$Operator compositeDateValidator$Operator) {
        this.validators = list;
        this.operator = compositeDateValidator$Operator;
    }

    public /* synthetic */ CompositeDateValidator(List list, CompositeDateValidator$Operator compositeDateValidator$Operator, CompositeDateValidator$1 compositeDateValidator$1) {
        this(list, compositeDateValidator$Operator);
    }

    public static /* synthetic */ CompositeDateValidator$Operator access$000() {
        return ALL_OPERATOR;
    }

    public static /* synthetic */ CompositeDateValidator$Operator access$100() {
        return ANY_OPERATOR;
    }

    public static CalendarConstraints$DateValidator allOf(List list) {
        CompositeDateValidator$Operator compositeDateValidator$Operator = ALL_OPERATOR;
        CompositeDateValidator compositeDateValidator = new CompositeDateValidator(list, compositeDateValidator$Operator);
        return compositeDateValidator;
    }

    public static CalendarConstraints$DateValidator anyOf(List list) {
        CompositeDateValidator$Operator compositeDateValidator$Operator = ANY_OPERATOR;
        CompositeDateValidator compositeDateValidator = new CompositeDateValidator(list, compositeDateValidator$Operator);
        return compositeDateValidator;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof CompositeDateValidator;
        if (n4 == 0) {
            return false;
        }
        object = (CompositeDateValidator)object;
        Object object2 = this.validators;
        List list = ((CompositeDateValidator)object).validators;
        n4 = object2.equals(list);
        if (n4 == 0 || (n4 = (object2 = this.operator).getId()) != (n3 = (object = ((CompositeDateValidator)object).operator).getId())) {
            bl2 = false;
        }
        return bl2;
    }

    public int hashCode() {
        return this.validators.hashCode();
    }

    public boolean isValid(long l2) {
        CompositeDateValidator$Operator compositeDateValidator$Operator = this.operator;
        List list = this.validators;
        return compositeDateValidator$Operator.isValid(list, l2);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        List list = this.validators;
        parcel.writeList(list);
        n3 = this.operator.getId();
        parcel.writeInt(n3);
    }
}


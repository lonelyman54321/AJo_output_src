/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import com.google.android.material.datepicker.CalendarConstraints$DateValidator;
import com.google.android.material.datepicker.CompositeDateValidator$Operator;
import java.util.List;

class CompositeDateValidator$2
implements CompositeDateValidator$Operator {
    public int getId() {
        return 2;
    }

    public boolean isValid(List object, long l2) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            CalendarConstraints$DateValidator calendarConstraints$DateValidator = (CalendarConstraints$DateValidator)object.next();
            if (calendarConstraints$DateValidator == null || (bl2 = calendarConstraints$DateValidator.isValid(l2))) continue;
            return false;
        }
        return true;
    }
}


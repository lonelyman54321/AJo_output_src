/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CalendarConstraints$Builder;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.DayViewDecorator;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.datepicker.SingleDateSelector;
import java.text.SimpleDateFormat;

public final class MaterialDatePicker$Builder {
    CalendarConstraints calendarConstraints;
    final DateSelector dateSelector;
    DayViewDecorator dayViewDecorator;
    int inputMode = 0;
    CharSequence negativeButtonContentDescription = null;
    int negativeButtonContentDescriptionResId = 0;
    CharSequence negativeButtonText = null;
    int negativeButtonTextResId = 0;
    int overrideThemeResId = 0;
    CharSequence positiveButtonContentDescription = null;
    int positiveButtonContentDescriptionResId = 0;
    CharSequence positiveButtonText = null;
    int positiveButtonTextResId = 0;
    Object selection = null;
    CharSequence titleText = null;
    int titleTextResId = 0;

    private MaterialDatePicker$Builder(DateSelector dateSelector) {
        this.dateSelector = dateSelector;
    }

    private Month createDefaultOpenAt() {
        CalendarConstraints calendarConstraints;
        long l2;
        boolean bl2;
        Object object = this.dateSelector.getSelectedDays();
        boolean bl3 = object.isEmpty();
        if (!bl3 && (bl2 = MaterialDatePicker$Builder.monthInValidRange((Month)(object = Month.create(l2 = ((Long)this.dateSelector.getSelectedDays().iterator().next()).longValue())), calendarConstraints = this.calendarConstraints))) {
            return object;
        }
        object = Month.current();
        bl2 = MaterialDatePicker$Builder.monthInValidRange((Month)object, calendarConstraints = this.calendarConstraints);
        if (!bl2) {
            object = this.calendarConstraints.getStart();
        }
        return object;
    }

    public static MaterialDatePicker$Builder customDatePicker(DateSelector dateSelector) {
        MaterialDatePicker$Builder materialDatePicker$Builder = new MaterialDatePicker$Builder(dateSelector);
        return materialDatePicker$Builder;
    }

    public static MaterialDatePicker$Builder datePicker() {
        SingleDateSelector singleDateSelector = new SingleDateSelector();
        MaterialDatePicker$Builder materialDatePicker$Builder = new MaterialDatePicker$Builder(singleDateSelector);
        return materialDatePicker$Builder;
    }

    public static MaterialDatePicker$Builder dateRangePicker() {
        RangeDateSelector rangeDateSelector = new RangeDateSelector();
        MaterialDatePicker$Builder materialDatePicker$Builder = new MaterialDatePicker$Builder(rangeDateSelector);
        return materialDatePicker$Builder;
    }

    private static boolean monthInValidRange(Month month, CalendarConstraints object) {
        int n3;
        Month month2 = object.getStart();
        int n4 = month.compareTo(month2);
        if (n4 >= 0 && (n3 = month.compareTo((Month)(object = object.getEnd()))) <= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            month = null;
        }
        return n3 != 0;
    }

    public MaterialDatePicker build() {
        Object object;
        int n3;
        Object object2 = this.calendarConstraints;
        if (object2 == null) {
            object2 = new CalendarConstraints$Builder();
            this.calendarConstraints = object2 = ((CalendarConstraints$Builder)object2).build();
        }
        if ((n3 = this.titleTextResId) == 0) {
            object2 = this.dateSelector;
            this.titleTextResId = n3 = object2.getDefaultTitleResId();
        }
        if ((object2 = this.selection) != null) {
            object = this.dateSelector;
            object.setSelection(object2);
        }
        if ((object2 = this.calendarConstraints.getOpenAt()) == null) {
            object2 = this.calendarConstraints;
            object = this.createDefaultOpenAt();
            ((CalendarConstraints)object2).setOpenAt((Month)object);
        }
        return MaterialDatePicker.newInstance(this);
    }

    public MaterialDatePicker$Builder setCalendarConstraints(CalendarConstraints calendarConstraints) {
        this.calendarConstraints = calendarConstraints;
        return this;
    }

    public MaterialDatePicker$Builder setDayViewDecorator(DayViewDecorator dayViewDecorator) {
        this.dayViewDecorator = dayViewDecorator;
        return this;
    }

    public MaterialDatePicker$Builder setInputMode(int n3) {
        this.inputMode = n3;
        return this;
    }

    public MaterialDatePicker$Builder setNegativeButtonContentDescription(int n3) {
        this.negativeButtonContentDescriptionResId = n3;
        this.negativeButtonContentDescription = null;
        return this;
    }

    public MaterialDatePicker$Builder setNegativeButtonContentDescription(CharSequence charSequence) {
        this.negativeButtonContentDescription = charSequence;
        this.negativeButtonContentDescriptionResId = 0;
        return this;
    }

    public MaterialDatePicker$Builder setNegativeButtonText(int n3) {
        this.negativeButtonTextResId = n3;
        this.negativeButtonText = null;
        return this;
    }

    public MaterialDatePicker$Builder setNegativeButtonText(CharSequence charSequence) {
        this.negativeButtonText = charSequence;
        this.negativeButtonTextResId = 0;
        return this;
    }

    public MaterialDatePicker$Builder setPositiveButtonContentDescription(int n3) {
        this.positiveButtonContentDescriptionResId = n3;
        this.positiveButtonContentDescription = null;
        return this;
    }

    public MaterialDatePicker$Builder setPositiveButtonContentDescription(CharSequence charSequence) {
        this.positiveButtonContentDescription = charSequence;
        this.positiveButtonContentDescriptionResId = 0;
        return this;
    }

    public MaterialDatePicker$Builder setPositiveButtonText(int n3) {
        this.positiveButtonTextResId = n3;
        this.positiveButtonText = null;
        return this;
    }

    public MaterialDatePicker$Builder setPositiveButtonText(CharSequence charSequence) {
        this.positiveButtonText = charSequence;
        this.positiveButtonTextResId = 0;
        return this;
    }

    public MaterialDatePicker$Builder setSelection(Object object) {
        this.selection = object;
        return this;
    }

    public MaterialDatePicker$Builder setTextInputFormat(SimpleDateFormat simpleDateFormat) {
        this.dateSelector.setTextInputFormat(simpleDateFormat);
        return this;
    }

    public MaterialDatePicker$Builder setTheme(int n3) {
        this.overrideThemeResId = n3;
        return this;
    }

    public MaterialDatePicker$Builder setTitleText(int n3) {
        this.titleTextResId = n3;
        this.titleText = null;
        return this;
    }

    public MaterialDatePicker$Builder setTitleText(CharSequence charSequence) {
        this.titleText = charSequence;
        this.titleTextResId = 0;
        return this;
    }
}


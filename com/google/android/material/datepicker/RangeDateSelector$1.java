/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateFormatTextWatcher;
import com.google.android.material.datepicker.OnSelectionChangedListener;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;

class RangeDateSelector$1
extends DateFormatTextWatcher {
    final /* synthetic */ RangeDateSelector this$0;
    final /* synthetic */ TextInputLayout val$endTextInput;
    final /* synthetic */ OnSelectionChangedListener val$listener;
    final /* synthetic */ TextInputLayout val$startTextInput;

    public RangeDateSelector$1(RangeDateSelector rangeDateSelector, String string2, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, OnSelectionChangedListener onSelectionChangedListener) {
        this.this$0 = rangeDateSelector;
        this.val$startTextInput = textInputLayout2;
        this.val$endTextInput = textInputLayout3;
        this.val$listener = onSelectionChangedListener;
        super(string2, dateFormat, textInputLayout, calendarConstraints);
    }

    public void onInvalidDate() {
        RangeDateSelector.access$002(this.this$0, null);
        RangeDateSelector rangeDateSelector = this.this$0;
        TextInputLayout textInputLayout = this.val$startTextInput;
        TextInputLayout textInputLayout2 = this.val$endTextInput;
        OnSelectionChangedListener onSelectionChangedListener = this.val$listener;
        RangeDateSelector.access$100(rangeDateSelector, textInputLayout, textInputLayout2, onSelectionChangedListener);
    }

    public void onValidDate(Long object) {
        RangeDateSelector.access$002(this.this$0, (Long)object);
        object = this.this$0;
        TextInputLayout textInputLayout = this.val$startTextInput;
        TextInputLayout textInputLayout2 = this.val$endTextInput;
        OnSelectionChangedListener onSelectionChangedListener = this.val$listener;
        RangeDateSelector.access$100((RangeDateSelector)object, textInputLayout, textInputLayout2, onSelectionChangedListener);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateFormatTextWatcher;
import com.google.android.material.datepicker.OnSelectionChangedListener;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;

class SingleDateSelector$1
extends DateFormatTextWatcher {
    final /* synthetic */ SingleDateSelector this$0;
    final /* synthetic */ TextInputLayout val$dateTextInput;
    final /* synthetic */ OnSelectionChangedListener val$listener;

    public SingleDateSelector$1(SingleDateSelector singleDateSelector, String string2, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, OnSelectionChangedListener onSelectionChangedListener, TextInputLayout textInputLayout2) {
        this.this$0 = singleDateSelector;
        this.val$listener = onSelectionChangedListener;
        this.val$dateTextInput = textInputLayout2;
        super(string2, dateFormat, textInputLayout, calendarConstraints);
    }

    public void onInvalidDate() {
        SingleDateSelector singleDateSelector = this.this$0;
        CharSequence charSequence = this.val$dateTextInput.getError();
        SingleDateSelector.access$102(singleDateSelector, charSequence);
        this.val$listener.onIncompleteSelectionChanged();
    }

    public void onValidDate(Long object) {
        Object object2;
        if (object == null) {
            object = this.this$0;
            SingleDateSelector.access$000((SingleDateSelector)object);
        } else {
            object2 = this.this$0;
            long l2 = (Long)object;
            ((SingleDateSelector)object2).select(l2);
        }
        SingleDateSelector.access$102(this.this$0, null);
        object = this.val$listener;
        object2 = this.this$0.getSelection();
        ((OnSelectionChangedListener)object).onSelectionChanged(object2);
    }
}


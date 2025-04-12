/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.view.View
 */
package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.R$string;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateStrings;
import com.google.android.material.datepicker.UtcDates;
import com.google.android.material.datepicker.a;
import com.google.android.material.datepicker.b;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

abstract class DateFormatTextWatcher
extends TextWatcherAdapter {
    private final CalendarConstraints constraints;
    private final DateFormat dateFormat;
    private final String formatHint;
    private int lastLength = 0;
    private final String outOfRange;
    private final Runnable setErrorCallback;
    private Runnable setRangeErrorCallback;
    private final TextInputLayout textInputLayout;

    public DateFormatTextWatcher(String string2, DateFormat object, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.formatHint = string2;
        this.dateFormat = object;
        this.textInputLayout = textInputLayout;
        this.constraints = calendarConstraints;
        object = textInputLayout.getContext();
        int n3 = R$string.mtrl_picker_out_of_range;
        this.outOfRange = object = object.getString(n3);
        this.setErrorCallback = object = new a(this, string2);
    }

    public static /* synthetic */ void a(DateFormatTextWatcher dateFormatTextWatcher, long l2) {
        dateFormatTextWatcher.lambda$createRangeErrorCallback$1(l2);
    }

    public static /* synthetic */ void b(DateFormatTextWatcher dateFormatTextWatcher, String string2) {
        dateFormatTextWatcher.lambda$new$0(string2);
    }

    private Runnable createRangeErrorCallback(long l2) {
        b b2 = new b(this, l2);
        return b2;
    }

    private /* synthetic */ void lambda$createRangeErrorCallback$1(long l2) {
        String string2 = DateStrings.getDateString(l2);
        TextInputLayout textInputLayout = this.textInputLayout;
        String string3 = this.outOfRange;
        string2 = this.sanitizeDateString(string2);
        Object[] objectArray = new Object[]{string2};
        string2 = String.format(string3, objectArray);
        textInputLayout.setError(string2);
        this.onInvalidDate();
    }

    private /* synthetic */ void lambda$new$0(String string2) {
        TextInputLayout textInputLayout = this.textInputLayout;
        Object object = this.dateFormat;
        Object object2 = textInputLayout.getContext();
        int n3 = R$string.mtrl_picker_invalid_format;
        String string3 = object2.getString(n3);
        int n4 = R$string.mtrl_picker_invalid_format_use;
        Object[] objectArray = object2.getString(n4);
        string2 = this.sanitizeDateString(string2);
        int n7 = 1;
        Object[] objectArray2 = new Object[n7];
        objectArray2[0] = string2;
        string2 = String.format((String)objectArray, objectArray2);
        n4 = R$string.mtrl_picker_invalid_format_example;
        object2 = object2.getString(n4);
        long l2 = UtcDates.getTodayCalendar().getTimeInMillis();
        objectArray = new Date(l2);
        object = ((DateFormat)object).format((Date)objectArray);
        object = this.sanitizeDateString((String)object);
        objectArray = new Object[n7];
        objectArray[0] = object;
        object = String.format((String)object2, objectArray);
        object2 = "\n";
        string2 = KW.a(string3, (String)object2, string2, (String)object2, (String)object);
        textInputLayout.setError(string2);
        this.onInvalidDate();
    }

    private String sanitizeDateString(String string2) {
        return string2.replace(' ', '\u00a0');
    }

    public void afterTextChanged(Editable editable) {
        int n3;
        String string2;
        String string3 = Locale.getDefault().getLanguage();
        int n4 = string3.equals(string2 = Locale.KOREAN.getLanguage());
        if (n4 != 0) {
            return;
        }
        n4 = editable.length();
        if (n4 != 0 && (n4 = editable.length()) < (n3 = (string2 = this.formatHint).length()) && (n4 = editable.length()) >= (n3 = this.lastLength)) {
            string3 = this.formatHint;
            n3 = editable.length();
            n4 = string3.charAt(n3);
            if ((n3 = (int)(Character.isLetterOrDigit((char)n4) ? 1 : 0)) == 0) {
                editable.append((char)n4);
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        int n8;
        this.lastLength = n8 = charSequence.length();
    }

    public void onInvalidDate() {
    }

    public void onTextChanged(CharSequence object, int n3, int n4, int n7) {
        Object object2;
        Object object3 = this.textInputLayout;
        Runnable runnable2 = this.setErrorCallback;
        object3.removeCallbacks(runnable2);
        object3 = this.textInputLayout;
        runnable2 = this.setRangeErrorCallback;
        object3.removeCallbacks(runnable2);
        object3 = this.textInputLayout;
        runnable2 = null;
        object3.setError(null);
        this.onValidDate(null);
        n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
        if (n3 == 0 && (n3 = object.length()) >= (n7 = ((String)(object2 = this.formatHint)).length())) {
            long l2;
            block18: {
                object3 = this.dateFormat;
                object = object.toString();
                object = ((DateFormat)object3).parse((String)object);
                object3 = this.textInputLayout;
                object3.setError(null);
                l2 = ((Date)object).getTime();
                object2 = this.constraints;
                object2 = ((CalendarConstraints)object2).getDateValidator();
                n7 = (int)(object2.isValid(l2) ? 1 : 0);
                if (n7 == 0) break block18;
                object2 = this.constraints;
                n7 = (int)(((CalendarConstraints)object2).isWithinBounds(l2) ? 1 : 0);
                if (n7 == 0) break block18;
                long l3 = ((Date)object).getTime();
                object = l3;
                this.onValidDate((Long)object);
                return;
            }
            object = this.createRangeErrorCallback(l2);
            this.setRangeErrorCallback = object;
            object3 = this.textInputLayout;
            try {
                this.runValidation((View)object3, (Runnable)object);
            }
            catch (ParseException parseException) {
                object = this.textInputLayout;
                object3 = this.setErrorCallback;
                this.runValidation((View)object, (Runnable)object3);
            }
        }
    }

    public abstract void onValidDate(Long var1);

    public void runValidation(View view, Runnable runnable2) {
        view.post(runnable2);
    }
}


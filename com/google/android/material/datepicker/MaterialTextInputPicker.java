/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.ContextThemeWrapper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialTextInputPicker$1;
import com.google.android.material.datepicker.PickerFragment;

public final class MaterialTextInputPicker
extends PickerFragment {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final String DATE_SELECTOR_KEY = "DATE_SELECTOR_KEY";
    private static final String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";
    private CalendarConstraints calendarConstraints;
    private DateSelector dateSelector;
    private int themeResId;

    public static MaterialTextInputPicker newInstance(DateSelector dateSelector, int n3, CalendarConstraints calendarConstraints) {
        MaterialTextInputPicker materialTextInputPicker = new MaterialTextInputPicker();
        Bundle bundle = new Bundle();
        bundle.putInt(THEME_RES_ID_KEY, n3);
        bundle.putParcelable(DATE_SELECTOR_KEY, (Parcelable)dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, (Parcelable)calendarConstraints);
        materialTextInputPicker.setArguments(bundle);
        return materialTextInputPicker;
    }

    public DateSelector getDateSelector() {
        Object object = this.dateSelector;
        if (object != null) {
            return object;
        }
        object = new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
        throw object;
    }

    public void onCreate(Bundle object) {
        DateSelector dateSelector;
        int n3;
        super.onCreate((Bundle)object);
        if (object == null) {
            object = this.getArguments();
        }
        this.themeResId = n3 = object.getInt(THEME_RES_ID_KEY);
        this.dateSelector = dateSelector = (DateSelector)object.getParcelable(DATE_SELECTOR_KEY);
        object = (CalendarConstraints)object.getParcelable(CALENDAR_CONSTRAINTS_KEY);
        this.calendarConstraints = object;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = this.getContext();
        int n3 = this.themeResId;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, n3);
        LayoutInflater layoutInflater2 = layoutInflater.cloneInContext((Context)contextThemeWrapper);
        DateSelector dateSelector = this.dateSelector;
        CalendarConstraints calendarConstraints = this.calendarConstraints;
        MaterialTextInputPicker$1 materialTextInputPicker$1 = new MaterialTextInputPicker$1(this);
        return dateSelector.onCreateTextInputView(layoutInflater2, viewGroup, bundle, calendarConstraints, materialTextInputPicker$1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int n3 = this.themeResId;
        bundle.putInt(THEME_RES_ID_KEY, n3);
        Object object = this.dateSelector;
        bundle.putParcelable(DATE_SELECTOR_KEY, (Parcelable)object);
        object = this.calendarConstraints;
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, (Parcelable)object);
    }
}


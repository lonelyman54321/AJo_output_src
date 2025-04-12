/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.OnSelectionChangedListener;
import java.text.SimpleDateFormat;
import java.util.Collection;

public interface DateSelector
extends Parcelable {
    public int getDefaultThemeResId(Context var1);

    public int getDefaultTitleResId();

    public String getError();

    public Collection getSelectedDays();

    public Collection getSelectedRanges();

    public Object getSelection();

    public String getSelectionContentDescription(Context var1);

    public String getSelectionDisplayString(Context var1);

    public boolean isSelectionComplete();

    public View onCreateTextInputView(LayoutInflater var1, ViewGroup var2, Bundle var3, CalendarConstraints var4, OnSelectionChangedListener var5);

    public void select(long var1);

    public void setSelection(Object var1);

    public void setTextInputFormat(SimpleDateFormat var1);
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.DateStrings;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.OnSelectionChangedListener;
import com.google.android.material.datepicker.SingleDateSelector$1;
import com.google.android.material.datepicker.SingleDateSelector$2;
import com.google.android.material.datepicker.UtcDates;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

public class SingleDateSelector
implements DateSelector {
    public static final Parcelable.Creator CREATOR;
    private CharSequence error;
    private Long selectedItem;
    private SimpleDateFormat textInputFormat;

    static {
        SingleDateSelector$2 singleDateSelector$2 = new SingleDateSelector$2();
        CREATOR = singleDateSelector$2;
    }

    public static /* synthetic */ void access$000(SingleDateSelector singleDateSelector) {
        singleDateSelector.clearSelection();
    }

    public static /* synthetic */ CharSequence access$102(SingleDateSelector singleDateSelector, CharSequence charSequence) {
        singleDateSelector.error = charSequence;
        return charSequence;
    }

    public static /* synthetic */ Long access$202(SingleDateSelector singleDateSelector, Long l2) {
        singleDateSelector.selectedItem = l2;
        return l2;
    }

    private void clearSelection() {
        this.selectedItem = null;
    }

    public int describeContents() {
        return 0;
    }

    public int getDefaultThemeResId(Context context) {
        int n3 = R$attr.materialCalendarTheme;
        String string2 = MaterialDatePicker.class.getCanonicalName();
        return MaterialAttributes.resolveOrThrow(context, n3, string2);
    }

    public int getDefaultTitleResId() {
        return R$string.mtrl_picker_date_header_title;
    }

    public String getError() {
        CharSequence charSequence = this.error;
        boolean bl2 = TextUtils.isEmpty((CharSequence)charSequence);
        if (bl2) {
            bl2 = false;
            charSequence = null;
        } else {
            charSequence = this.error.toString();
        }
        return charSequence;
    }

    public Collection getSelectedDays() {
        ArrayList<Long> arrayList = new ArrayList<Long>();
        Long l2 = this.selectedItem;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    public Collection getSelectedRanges() {
        ArrayList arrayList = new ArrayList();
        return arrayList;
    }

    public Long getSelection() {
        return this.selectedItem;
    }

    public String getSelectionContentDescription(Context context) {
        context = context.getResources();
        Object object = this.selectedItem;
        if (object == null) {
            int n3 = R$string.mtrl_picker_announce_current_selection_none;
            object = context.getString(n3);
        } else {
            long l2 = (Long)object;
            object = DateStrings.getYearMonthDay(l2);
        }
        int n4 = R$string.mtrl_picker_announce_current_selection;
        Object[] objectArray = new Object[]{object};
        return context.getString(n4, objectArray);
    }

    public String getSelectionDisplayString(Context context) {
        context = context.getResources();
        Object object = this.selectedItem;
        if (object == null) {
            int n3 = R$string.mtrl_picker_date_header_unselected;
            return context.getString(n3);
        }
        object = DateStrings.getYearMonthDay((Long)object);
        int n4 = R$string.mtrl_picker_date_header_selected;
        Object[] objectArray = new Object[]{object};
        return context.getString(n4, objectArray);
    }

    public boolean isSelectionComplete() {
        boolean bl2;
        Long l2 = this.selectedItem;
        if (l2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            l2 = null;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle editTextArray, CalendarConstraints calendarConstraints, OnSelectionChangedListener onSelectionChangedListener) {
        Object object;
        boolean bl2;
        int n3 = 1;
        int n4 = R$layout.mtrl_picker_text_input_date;
        layoutInflater = layoutInflater.inflate(n4, viewGroup, false);
        int n7 = R$id.mtrl_picker_text_input_date;
        viewGroup = layoutInflater.findViewById(n7);
        Object object2 = viewGroup;
        object2 = (TextInputLayout)viewGroup;
        viewGroup = ((TextInputLayout)((Object)object2)).getEditText();
        n4 = (int)(ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters() ? 1 : 0);
        if (n4 != 0) {
            n4 = 17;
            viewGroup.setInputType(n4);
        }
        if (!(bl2 = (object = this.textInputFormat) != null)) {
            object = UtcDates.getDefaultTextInputFormat();
        }
        SimpleDateFormat simpleDateFormat = object;
        object = bl2 ? ((SimpleDateFormat)object).toPattern() : UtcDates.getDefaultTextInputHint(layoutInflater.getResources(), simpleDateFormat);
        Object object3 = object;
        ((TextInputLayout)((Object)object2)).setPlaceholderText((CharSequence)object);
        object = this.selectedItem;
        if (object != null) {
            object = simpleDateFormat.format(object);
            viewGroup.setText((CharSequence)object);
        }
        object = new SingleDateSelector$1(this, (String)object3, simpleDateFormat, (TextInputLayout)((Object)object2), calendarConstraints, onSelectionChangedListener, (TextInputLayout)((Object)object2));
        viewGroup.addTextChangedListener((TextWatcher)object);
        editTextArray = new EditText[n3];
        editTextArray[0] = viewGroup;
        ki0_1.c(editTextArray);
        return layoutInflater;
    }

    public void select(long l2) {
        Long l3;
        this.selectedItem = l3 = Long.valueOf(l2);
    }

    public void setSelection(Long l2) {
        if (l2 == null) {
            l2 = null;
        } else {
            long l3 = UtcDates.canonicalYearMonthDay(l2);
            l2 = l3;
        }
        this.selectedItem = l2;
    }

    public void setTextInputFormat(SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat)UtcDates.getNormalizedFormat(simpleDateFormat);
        }
        this.textInputFormat = simpleDateFormat;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Long l2 = this.selectedItem;
        parcel.writeValue((Object)l2);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
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
import android.content.res.Resources;
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
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.DateStrings;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.OnSelectionChangedListener;
import com.google.android.material.datepicker.RangeDateSelector$1;
import com.google.android.material.datepicker.RangeDateSelector$2;
import com.google.android.material.datepicker.RangeDateSelector$3;
import com.google.android.material.datepicker.UtcDates;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

public class RangeDateSelector
implements DateSelector {
    public static final Parcelable.Creator CREATOR;
    private CharSequence error;
    private final String invalidRangeEndError;
    private String invalidRangeStartError;
    private Long proposedTextEnd = null;
    private Long proposedTextStart = null;
    private Long selectedEndItem = null;
    private Long selectedStartItem = null;
    private SimpleDateFormat textInputFormat;

    static {
        RangeDateSelector$3 rangeDateSelector$3 = new RangeDateSelector$3();
        CREATOR = rangeDateSelector$3;
    }

    public RangeDateSelector() {
        this.invalidRangeEndError = " ";
    }

    public static /* synthetic */ Long access$002(RangeDateSelector rangeDateSelector, Long l2) {
        rangeDateSelector.proposedTextStart = l2;
        return l2;
    }

    public static /* synthetic */ void access$100(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, OnSelectionChangedListener onSelectionChangedListener) {
        rangeDateSelector.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
    }

    public static /* synthetic */ Long access$202(RangeDateSelector rangeDateSelector, Long l2) {
        rangeDateSelector.proposedTextEnd = l2;
        return l2;
    }

    public static /* synthetic */ Long access$302(RangeDateSelector rangeDateSelector, Long l2) {
        rangeDateSelector.selectedStartItem = l2;
        return l2;
    }

    public static /* synthetic */ Long access$402(RangeDateSelector rangeDateSelector, Long l2) {
        rangeDateSelector.selectedEndItem = l2;
        return l2;
    }

    private void clearInvalidRange(TextInputLayout object, TextInputLayout textInputLayout) {
        boolean bl2;
        CharSequence charSequence;
        boolean bl3;
        CharSequence charSequence2 = ((TextInputLayout)((Object)object)).getError();
        if (charSequence2 != null && (bl3 = ((String)(charSequence2 = this.invalidRangeStartError)).contentEquals(charSequence = ((TextInputLayout)((Object)object)).getError()))) {
            ((TextInputLayout)((Object)object)).setError(null);
        }
        if ((object = textInputLayout.getError()) != null && (bl2 = ((String)(object = " ")).contentEquals(charSequence2 = textInputLayout.getError()))) {
            textInputLayout.setError(null);
        }
    }

    private boolean isValidRange(long l2, long l3) {
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = object <= 0;
        return bl2;
    }

    private void setInvalidRange(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        String string2 = this.invalidRangeStartError;
        textInputLayout.setError(string2);
        textInputLayout2.setError(" ");
    }

    private void updateError(TextInputLayout object, TextInputLayout textInputLayout) {
        CharSequence charSequence = object.getError();
        boolean bl2 = TextUtils.isEmpty((CharSequence)charSequence);
        if (!bl2) {
            object = object.getError();
            this.error = object;
        } else {
            object = textInputLayout.getError();
            boolean bl3 = TextUtils.isEmpty((CharSequence)object);
            if (!bl3) {
                object = textInputLayout.getError();
                this.error = object;
            } else {
                bl3 = false;
                object = null;
                this.error = null;
            }
        }
    }

    private void updateIfValidTextProposal(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, OnSelectionChangedListener onSelectionChangedListener) {
        Long l2;
        Object object = this.proposedTextStart;
        if (object != null && (l2 = this.proposedTextEnd) != null) {
            Long l3;
            long l4;
            long l7 = (Long)object;
            boolean bl2 = this.isValidRange(l7, l4 = (l3 = this.proposedTextEnd).longValue());
            if (bl2) {
                object = this.proposedTextStart;
                this.selectedStartItem = object;
                object = this.proposedTextEnd;
                this.selectedEndItem = object;
                object = this.getSelection();
                onSelectionChangedListener.onSelectionChanged(object);
            } else {
                this.setInvalidRange(textInputLayout, textInputLayout2);
                onSelectionChangedListener.onIncompleteSelectionChanged();
            }
        } else {
            this.clearInvalidRange(textInputLayout, textInputLayout2);
            onSelectionChangedListener.onIncompleteSelectionChanged();
        }
        this.updateError(textInputLayout, textInputLayout2);
    }

    public int describeContents() {
        return 0;
    }

    public int getDefaultThemeResId(Context context) {
        Resources resources = context.getResources();
        Object object = resources.getDisplayMetrics();
        int n3 = R$dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis;
        int n4 = resources.getDimensionPixelSize(n3);
        n3 = object.widthPixels;
        int n7 = object.heightPixels;
        n4 = (n7 = Math.min(n3, n7)) > n4 ? R$attr.materialCalendarTheme : R$attr.materialCalendarFullscreenTheme;
        object = MaterialDatePicker.class.getCanonicalName();
        return MaterialAttributes.resolveOrThrow(context, n4, (String)object);
    }

    public int getDefaultTitleResId() {
        return R$string.mtrl_picker_range_header_title;
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
        Long l2 = this.selectedStartItem;
        if (l2 != null) {
            arrayList.add(l2);
        }
        if ((l2 = this.selectedEndItem) != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    public Collection getSelectedRanges() {
        ArrayList<lm2> arrayList = new ArrayList<lm2>();
        Long l2 = this.selectedStartItem;
        Long l3 = this.selectedEndItem;
        lm2 lm22 = new lm2(l2, l3);
        arrayList.add(lm22);
        return arrayList;
    }

    public lm2 getSelection() {
        Long l2 = this.selectedStartItem;
        Long l3 = this.selectedEndItem;
        lm2 lm22 = new lm2(l2, l3);
        return lm22;
    }

    public String getSelectionContentDescription(Context context) {
        context = context.getResources();
        Object object = this.selectedStartItem;
        Object object2 = this.selectedEndItem;
        object = DateStrings.getDateRangeString((Long)object, (Long)object2);
        object2 = ((lm2)object).a;
        if (object2 == null) {
            int n3 = R$string.mtrl_picker_announce_current_selection_none;
            object2 = context.getString(n3);
        } else {
            object2 = (String)object2;
        }
        object = ((lm2)object).b;
        if (object == null) {
            int n4 = R$string.mtrl_picker_announce_current_selection_none;
            object = context.getString(n4);
        } else {
            object = (String)object;
        }
        int n7 = R$string.mtrl_picker_announce_current_range_selection;
        Object[] objectArray = new Object[]{object2, object};
        return context.getString(n7, objectArray);
    }

    public String getSelectionDisplayString(Context context) {
        Object object;
        int n3 = 0;
        int n4 = 1;
        context = context.getResources();
        Object object2 = this.selectedStartItem;
        if (object2 == null && (object = this.selectedEndItem) == null) {
            n3 = R$string.mtrl_picker_range_header_unselected;
            return context.getString(n3);
        }
        object = this.selectedEndItem;
        if (object == null) {
            int n7 = R$string.mtrl_picker_range_header_only_start_selected;
            object2 = DateStrings.getDateString((Long)object2);
            Object[] objectArray = new Object[n4];
            objectArray[0] = object2;
            return context.getString(n7, objectArray);
        }
        if (object2 == null) {
            int n8 = R$string.mtrl_picker_range_header_only_end_selected;
            object = DateStrings.getDateString((Long)object);
            Object[] objectArray = new Object[n4];
            objectArray[0] = object;
            return context.getString(n8, objectArray);
        }
        object2 = DateStrings.getDateRangeString((Long)object2, (Long)object);
        int n10 = R$string.mtrl_picker_range_header_selected;
        Object object3 = ((lm2)object2).a;
        object2 = ((lm2)object2).b;
        Object[] objectArray = new Object[2];
        objectArray[0] = object3;
        objectArray[n4] = object2;
        return context.getString(n10, objectArray);
    }

    public boolean isSelectionComplete() {
        Long l2;
        long l3;
        long l4;
        boolean bl2;
        Long l7;
        Long l8 = this.selectedStartItem;
        if (l8 != null && (l7 = this.selectedEndItem) != null && (bl2 = this.isValidRange(l4 = l8.longValue(), l3 = (l2 = this.selectedEndItem).longValue()))) {
            bl2 = true;
        } else {
            bl2 = false;
            l8 = null;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, OnSelectionChangedListener onSelectionChangedListener) {
        RangeDateSelector$2 rangeDateSelector$2;
        CalendarConstraints calendarConstraints2;
        void var11_27;
        Long l2;
        void var11_16;
        String string2;
        RangeDateSelector rangeDateSelector = this;
        int n3 = R$layout.mtrl_picker_text_input_date_range;
        EditText editText = null;
        ViewGroup viewGroup2 = viewGroup;
        View view = layoutInflater.inflate(n3, viewGroup, false);
        n3 = R$id.mtrl_picker_text_input_range_start;
        View view2 = view.findViewById(n3);
        Object object = view2;
        object = (TextInputLayout)view2;
        n3 = R$id.mtrl_picker_text_input_range_end;
        View view3 = view.findViewById(n3);
        Object object2 = view3;
        object2 = (TextInputLayout)view3;
        EditText editText2 = ((TextInputLayout)((Object)object)).getEditText();
        EditText editText3 = ((TextInputLayout)((Object)object2)).getEditText();
        n3 = (int)(ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters() ? 1 : 0);
        if (n3 != 0) {
            n3 = 17;
            editText2.setInputType(n3);
            editText3.setInputType(n3);
        }
        Resources resources = view.getResources();
        int n4 = R$string.mtrl_picker_invalid_range;
        rangeDateSelector.invalidRangeStartError = string2 = resources.getString(n4);
        SimpleDateFormat simpleDateFormat = rangeDateSelector.textInputFormat;
        n4 = simpleDateFormat != null ? 1 : 0;
        if (n4 == 0) {
            SimpleDateFormat simpleDateFormat2 = UtcDates.getDefaultTextInputFormat();
        }
        Object object3 = var11_16;
        Long l3 = rangeDateSelector.selectedStartItem;
        if (l3 != null) {
            Long l4;
            String string3 = ((Format)object3).format(l3);
            editText2.setText((CharSequence)string3);
            rangeDateSelector.proposedTextStart = l4 = rangeDateSelector.selectedStartItem;
        }
        if ((l2 = rangeDateSelector.selectedEndItem) != null) {
            Long l7;
            String string4 = ((Format)object3).format(l2);
            editText3.setText((CharSequence)string4);
            rangeDateSelector.proposedTextEnd = l7 = rangeDateSelector.selectedEndItem;
        }
        if (n4 != 0) {
            String string5 = ((SimpleDateFormat)object3).toPattern();
        } else {
            String string6 = UtcDates.getDefaultTextInputHint(view.getResources(), (SimpleDateFormat)object3);
        }
        void var18_39 = var11_27;
        ((TextInputLayout)((Object)object)).setPlaceholderText((CharSequence)var11_27);
        ((TextInputLayout)((Object)object2)).setPlaceholderText((CharSequence)var11_27);
        RangeDateSelector$1 rangeDateSelector$1 = calendarConstraints2;
        viewGroup2 = var18_39;
        void var20_42 = object3;
        RangeDateSelector$1 rangeDateSelector$12 = calendarConstraints2;
        calendarConstraints2 = calendarConstraints;
        Object object4 = object;
        object3 = object2;
        editText = editText3;
        OnSelectionChangedListener onSelectionChangedListener2 = onSelectionChangedListener;
        rangeDateSelector$1(this, (String)viewGroup2, (DateFormat)var20_42, (TextInputLayout)((Object)object), calendarConstraints, (TextInputLayout)((Object)object), (TextInputLayout)((Object)object2), onSelectionChangedListener);
        editText2.addTextChangedListener((TextWatcher)rangeDateSelector$1);
        RangeDateSelector$2 rangeDateSelector$22 = rangeDateSelector$2;
        rangeDateSelector$2 = new RangeDateSelector$2(this, (String)viewGroup2, (DateFormat)var20_42, (TextInputLayout)((Object)object2), calendarConstraints, (TextInputLayout)((Object)object), (TextInputLayout)((Object)object2), onSelectionChangedListener);
        editText.addTextChangedListener((TextWatcher)rangeDateSelector$2);
        EditText[] editTextArray = new EditText[]{editText2, editText};
        ki0_1.c(editTextArray);
        return view;
    }

    public void select(long l2) {
        Long l3 = this.selectedStartItem;
        if (l3 == null) {
            Long l4;
            this.selectedStartItem = l4 = Long.valueOf(l2);
        } else {
            long l7;
            boolean bl2;
            Long l8 = this.selectedEndItem;
            if (l8 == null && (bl2 = this.isValidRange(l7 = l3.longValue(), l2))) {
                Long l12;
                this.selectedEndItem = l12 = Long.valueOf(l2);
            } else {
                Long l14;
                bl2 = false;
                l3 = null;
                this.selectedEndItem = null;
                this.selectedStartItem = l14 = Long.valueOf(l2);
            }
        }
    }

    public void setSelection(lm2 object) {
        boolean bl2;
        long l2;
        Object object2 = ((lm2)object).a;
        Object object3 = ((lm2)object).b;
        if (object2 != null && object3 != null) {
            l2 = (Long)object2;
            object2 = object3;
            object2 = (Long)object3;
            long l3 = (Long)object2;
            bl2 = this.isValidRange(l2, l3);
            if (!bl2) {
                object = new IllegalArgumentException();
                throw object;
            }
        }
        bl2 = false;
        object2 = null;
        object = ((lm2)object).a;
        if (object == null) {
            object = null;
        } else {
            l2 = UtcDates.canonicalYearMonthDay((Long)object);
            object = l2;
        }
        this.selectedStartItem = object;
        if (object3 != null) {
            object3 = (Long)object3;
            long l4 = UtcDates.canonicalYearMonthDay((Long)object3);
            object2 = l4;
        }
        this.selectedEndItem = object2;
    }

    public void setTextInputFormat(SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat)UtcDates.getNormalizedFormat(simpleDateFormat);
        }
        this.textInputFormat = simpleDateFormat;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Long l2 = this.selectedStartItem;
        parcel.writeValue((Object)l2);
        l2 = this.selectedEndItem;
        parcel.writeValue((Object)l2);
    }
}


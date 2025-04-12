/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.text.InputFilter
 *  android.text.TextWatcher
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.google.android.material.timepicker;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.a;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.google.android.material.timepicker.TimeModel;
import com.google.android.material.timepicker.TimePickerPresenter;
import com.google.android.material.timepicker.TimePickerTextInputKeyController;
import com.google.android.material.timepicker.TimePickerTextInputPresenter$1;
import com.google.android.material.timepicker.TimePickerTextInputPresenter$3;
import com.google.android.material.timepicker.TimePickerTextInputPresenter$4;
import com.google.android.material.timepicker.TimePickerTextInputPresenter$5;
import com.google.android.material.timepicker.TimePickerView$OnSelectionChange;
import com.google.android.material.timepicker.c;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.util.Locale;

class TimePickerTextInputPresenter
implements TimePickerView$OnSelectionChange,
TimePickerPresenter {
    private final TimePickerTextInputKeyController controller;
    private final EditText hourEditText;
    private final ChipTextInputComboView hourTextInput;
    private final TextWatcher hourTextWatcher;
    private final EditText minuteEditText;
    private final ChipTextInputComboView minuteTextInput;
    private final TextWatcher minuteTextWatcher;
    private final TimeModel time;
    private final LinearLayout timePickerView;
    private MaterialButtonToggleGroup toggle;

    public TimePickerTextInputPresenter(LinearLayout linearLayout, TimeModel timeModel) {
        ChipTextInputComboView chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2;
        Object object = new TimePickerTextInputPresenter$1(this);
        this.minuteTextWatcher = object;
        super(this);
        this.hourTextWatcher = object;
        this.timePickerView = linearLayout;
        this.time = timeModel;
        object = linearLayout.getResources();
        int n3 = R$id.material_minute_text_input;
        this.minuteTextInput = chipTextInputComboView2 = (ChipTextInputComboView)linearLayout.findViewById(n3);
        int n4 = R$id.material_hour_text_input;
        this.hourTextInput = chipTextInputComboView = (ChipTextInputComboView)linearLayout.findViewById(n4);
        int n7 = R$id.material_label;
        Object object2 = (TextView)chipTextInputComboView2.findViewById(n7);
        int n8 = R$id.material_label;
        TextView textView = (TextView)chipTextInputComboView.findViewById(n8);
        int n10 = R$string.material_timepicker_minute;
        String string2 = object.getString(n10);
        object2.setText((CharSequence)string2);
        n7 = R$string.material_timepicker_hour;
        object = object.getString(n7);
        textView.setText((CharSequence)object);
        int n14 = R$id.selection_type;
        object2 = 12;
        chipTextInputComboView2.setTag(n14, object2);
        n14 = R$id.selection_type;
        n7 = 10;
        object2 = n7;
        chipTextInputComboView.setTag(n14, object2);
        n14 = timeModel.format;
        if (n14 == 0) {
            this.setupPeriodToggle();
        }
        object = new TimePickerTextInputPresenter$3(this);
        chipTextInputComboView.setOnClickListener((View.OnClickListener)object);
        chipTextInputComboView2.setOnClickListener((View.OnClickListener)object);
        object = timeModel.getHourInputValidator();
        chipTextInputComboView.addInputFilter((InputFilter)object);
        object = timeModel.getMinuteInputValidator();
        chipTextInputComboView2.addInputFilter((InputFilter)object);
        object = chipTextInputComboView.getTextInput().getEditText();
        this.hourEditText = object;
        object = chipTextInputComboView2.getTextInput().getEditText();
        this.minuteEditText = object;
        this.controller = object = new TimePickerTextInputKeyController(chipTextInputComboView, chipTextInputComboView2, timeModel);
        object2 = linearLayout.getContext();
        n8 = R$string.material_hour_selection;
        object = new TimePickerTextInputPresenter$4(this, (Context)object2, n8, timeModel);
        chipTextInputComboView.setChipDelegate((a)object);
        linearLayout = linearLayout.getContext();
        n4 = R$string.material_minute_selection;
        object = new TimePickerTextInputPresenter$5(this, (Context)linearLayout, n4, timeModel);
        chipTextInputComboView2.setChipDelegate((a)object);
        this.initialize();
    }

    public static /* synthetic */ void a(TimePickerTextInputPresenter timePickerTextInputPresenter, MaterialButtonToggleGroup materialButtonToggleGroup, int n3, boolean bl2) {
        timePickerTextInputPresenter.lambda$setupPeriodToggle$0(materialButtonToggleGroup, n3, bl2);
    }

    public static /* synthetic */ TimeModel access$000(TimePickerTextInputPresenter timePickerTextInputPresenter) {
        return timePickerTextInputPresenter.time;
    }

    private void addTextWatchers() {
        EditText editText = this.hourEditText;
        TextWatcher textWatcher = this.hourTextWatcher;
        editText.addTextChangedListener(textWatcher);
        editText = this.minuteEditText;
        textWatcher = this.minuteTextWatcher;
        editText.addTextChangedListener(textWatcher);
    }

    private /* synthetic */ void lambda$setupPeriodToggle$0(MaterialButtonToggleGroup materialButtonToggleGroup, int n3, boolean bl2) {
        if (!bl2) {
            return;
        }
        int n4 = R$id.material_clock_period_pm_button;
        n4 = n3 == n4 ? 1 : 0;
        this.time.setPeriod(n4);
    }

    private void removeTextWatchers() {
        EditText editText = this.hourEditText;
        TextWatcher textWatcher = this.hourTextWatcher;
        editText.removeTextChangedListener(textWatcher);
        editText = this.minuteEditText;
        textWatcher = this.minuteTextWatcher;
        editText.removeTextChangedListener(textWatcher);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void setCursorDrawableColor(EditText object, int n3) {
        Object object2;
        Context context;
        int n4 = 1;
        AnnotatedElement annotatedElement = TextView.class;
        try {
            context = object.getContext();
            object2 = "mCursorDrawableRes";
        }
        catch (Throwable throwable) {
            return;
        }
        object2 = ((Class)annotatedElement).getDeclaredField((String)object2);
        ((AccessibleObject)object2).setAccessible(n4 != 0);
        int n7 = ((Field)object2).getInt(object);
        String string2 = "mEditor";
        annotatedElement = ((Class)annotatedElement).getDeclaredField(string2);
        ((AccessibleObject)annotatedElement).setAccessible(n4 != 0);
        object = ((Field)annotatedElement).get(object);
        annotatedElement = object.getClass();
        string2 = "mCursorDrawable";
        annotatedElement = ((Class)annotatedElement).getDeclaredField(string2);
        ((AccessibleObject)annotatedElement).setAccessible(n4 != 0);
        context = xn.a(context, n7);
        object2 = PorterDuff.Mode.SRC_IN;
        context.setColorFilter(n3, (PorterDuff.Mode)object2);
        n3 = 2;
        Drawable[] drawableArray = new Drawable[n3];
        n7 = 0;
        object2 = null;
        drawableArray[0] = context;
        drawableArray[n4] = context;
        ((Field)annotatedElement).set(object, drawableArray);
    }

    private void setTime(TimeModel object) {
        this.removeTextWatchers();
        Locale locale = this.timePickerView.getResources().getConfiguration().locale;
        Object object2 = ((TimeModel)object).minute;
        int n3 = 1;
        Object object3 = new Object[n3];
        object3[0] = object2;
        object2 = "%02d";
        object3 = String.format(locale, (String)object2, object3);
        object = ((TimeModel)object).getHourForDisplay();
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        object = String.format(locale, (String)object2, objectArray);
        this.minuteTextInput.setText((CharSequence)object3);
        this.hourTextInput.setText((CharSequence)object);
        this.addTextWatchers();
        this.updateSelection();
    }

    private void setupPeriodToggle() {
        LinearLayout linearLayout = this.timePickerView;
        int n3 = R$id.material_clock_period_toggle;
        linearLayout = (MaterialButtonToggleGroup)linearLayout.findViewById(n3);
        this.toggle = linearLayout;
        c c2 = new c(this);
        linearLayout.addOnButtonCheckedListener(c2);
        this.toggle.setVisibility(0);
        this.updateSelection();
    }

    private void updateSelection() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.toggle;
        if (materialButtonToggleGroup == null) {
            return;
        }
        TimeModel timeModel = this.time;
        int n3 = timeModel.period;
        n3 = n3 == 0 ? R$id.material_clock_period_am_button : R$id.material_clock_period_pm_button;
        materialButtonToggleGroup.check(n3);
    }

    public void clearCheck() {
        this.minuteTextInput.setChecked(false);
        this.hourTextInput.setChecked(false);
    }

    public void hide() {
        View view = this.timePickerView.getFocusedChild();
        if (view != null) {
            ViewUtils.hideKeyboard(view, false);
        }
        this.timePickerView.setVisibility(8);
    }

    public void initialize() {
        this.addTextWatchers();
        TimeModel timeModel = this.time;
        this.setTime(timeModel);
        this.controller.bind();
    }

    public void invalidate() {
        TimeModel timeModel = this.time;
        this.setTime(timeModel);
    }

    public void onSelectionChanged(int n3) {
        this.time.selection = n3;
        ChipTextInputComboView chipTextInputComboView = this.minuteTextInput;
        int n4 = 12;
        boolean bl2 = false;
        n4 = n3 == n4 ? 1 : 0;
        chipTextInputComboView.setChecked(n4 != 0);
        chipTextInputComboView = this.hourTextInput;
        n4 = 10;
        if (n3 == n4) {
            bl2 = true;
        }
        chipTextInputComboView.setChecked(bl2);
        this.updateSelection();
    }

    public void resetChecked() {
        ChipTextInputComboView chipTextInputComboView = this.minuteTextInput;
        TimeModel timeModel = this.time;
        int n3 = timeModel.selection;
        int n4 = 12;
        boolean bl2 = false;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            timeModel = null;
        }
        chipTextInputComboView.setChecked(n3 != 0);
        chipTextInputComboView = this.hourTextInput;
        timeModel = this.time;
        n3 = timeModel.selection;
        n4 = 10;
        if (n3 == n4) {
            bl2 = true;
        }
        chipTextInputComboView.setChecked(bl2);
    }

    public void show() {
        this.timePickerView.setVisibility(0);
        int n3 = this.time.selection;
        this.onSelectionChanged(n3);
    }
}


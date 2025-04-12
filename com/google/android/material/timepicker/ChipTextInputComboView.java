/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Build$VERSION
 *  android.os.LocaleList
 *  android.text.InputFilter
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Checkable
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.TextView
 */
package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.ChipTextInputComboView$TextFormatter;
import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;

class ChipTextInputComboView
extends FrameLayout
implements Checkable {
    private final Chip chip;
    private final EditText editText;
    private TextView label;
    private final TextInputLayout textInputLayout;
    private TextWatcher watcher;

    public ChipTextInputComboView(Context context) {
        this(context, null);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context object, AttributeSet object2, int n3) {
        super((Context)object, (AttributeSet)object2, n3);
        EditText editText;
        object = LayoutInflater.from((Context)object);
        int n4 = R$layout.material_time_chip;
        object2 = (Chip)object.inflate(n4, (ViewGroup)this, false);
        this.chip = object2;
        ((Chip)object2).setAccessibilityClassName("android.view.View");
        int n7 = R$layout.material_time_input;
        object = (TextInputLayout)object.inflate(n7, (ViewGroup)this, false);
        this.textInputLayout = object;
        this.editText = editText = ((TextInputLayout)((Object)object)).getEditText();
        editText.setVisibility(4);
        ChipTextInputComboView$TextFormatter chipTextInputComboView$TextFormatter = new ChipTextInputComboView$TextFormatter(this, null);
        this.watcher = chipTextInputComboView$TextFormatter;
        editText.addTextChangedListener((TextWatcher)chipTextInputComboView$TextFormatter);
        this.updateHintLocales();
        this.addView((View)object2);
        this.addView((View)object);
        int n8 = R$id.material_label;
        object = (TextView)this.findViewById(n8);
        this.label = object;
        object = ViewCompat.a;
        n8 = View.generateViewId();
        editText.setId(n8);
        object = this.label;
        n4 = editText.getId();
        object.setLabelFor(n4);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static /* synthetic */ String access$100(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return chipTextInputComboView.formatText(charSequence);
    }

    public static /* synthetic */ Chip access$200(ChipTextInputComboView chipTextInputComboView) {
        return chipTextInputComboView.chip;
    }

    private String formatText(CharSequence charSequence) {
        return TimeModel.formatText(this.getResources(), charSequence);
    }

    private void updateHintLocales() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            LocaleList localeList = Zm.b(this.getContext().getResources().getConfiguration());
            EditText editText = this.editText;
            pu_1.a(editText, localeList);
        }
    }

    public void addInputFilter(InputFilter inputFilter) {
        InputFilter[] inputFilterArray = this.editText.getFilters();
        int n3 = inputFilterArray.length + 1;
        InputFilter[] inputFilterArray2 = Arrays.copyOf(inputFilterArray, n3);
        int n4 = inputFilterArray.length;
        inputFilterArray2[n4] = inputFilter;
        this.editText.setFilters(inputFilterArray2);
    }

    public CharSequence getChipText() {
        return this.chip.getText();
    }

    public TextInputLayout getTextInput() {
        return this.textInputLayout;
    }

    public boolean isChecked() {
        return this.chip.isChecked();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.updateHintLocales();
    }

    /*
     * WARNING - void declaration
     */
    public void setChecked(boolean bl2) {
        void var1_4;
        EditText editText;
        this.chip.setChecked(bl2);
        Object object = this.editText;
        int n3 = bl2 ? 0 : 4;
        object.setVisibility(n3);
        object = this.chip;
        if (bl2) {
            int n4 = 8;
        } else {
            boolean bl3 = false;
            editText = null;
        }
        object.setVisibility((int)var1_4);
        boolean bl4 = this.isChecked();
        if (bl4) {
            editText = this.editText;
            ViewUtils.requestFocusAndShowKeyboard((View)editText, false);
        }
    }

    public void setChipDelegate(a a2) {
        ViewCompat.s((View)this.chip, a2);
    }

    public void setCursorVisible(boolean bl2) {
        this.editText.setCursorVisible(bl2);
    }

    public void setHelperText(CharSequence charSequence) {
        this.label.setText(charSequence);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.chip.setOnClickListener(onClickListener);
    }

    public void setTag(int n3, Object object) {
        this.chip.setTag(n3, object);
    }

    public void setText(CharSequence charSequence) {
        charSequence = this.formatText(charSequence);
        Chip chip = this.chip;
        chip.setText(charSequence);
        boolean bl2 = TextUtils.isEmpty((CharSequence)charSequence);
        if (!bl2) {
            chip = this.editText;
            TextWatcher textWatcher = this.watcher;
            chip.removeTextChangedListener(textWatcher);
            this.editText.setText(charSequence);
            charSequence = this.editText;
            chip = this.watcher;
            charSequence.addTextChangedListener((TextWatcher)chip);
        }
    }

    public void toggle() {
        this.chip.toggle();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnKeyListener
 *  android.widget.EditText
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.google.android.material.timepicker.TimeModel;

class TimePickerTextInputKeyController
implements TextView.OnEditorActionListener,
View.OnKeyListener {
    private final ChipTextInputComboView hourLayoutComboView;
    private boolean keyListenerRunning = false;
    private final ChipTextInputComboView minuteLayoutComboView;
    private final TimeModel time;

    public TimePickerTextInputKeyController(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.hourLayoutComboView = chipTextInputComboView;
        this.minuteLayoutComboView = chipTextInputComboView2;
        this.time = timeModel;
    }

    private void clearPrefilledText(EditText editText) {
        int n3;
        int n4 = editText.getSelectionStart();
        if (n4 == 0 && (n4 = editText.length()) == (n3 = 2)) {
            editText = editText.getText();
            editText.clear();
        }
    }

    private void moveSelection(int n3) {
        ChipTextInputComboView chipTextInputComboView = this.minuteLayoutComboView;
        int n4 = 12;
        boolean bl2 = false;
        n4 = n3 == n4 ? 1 : 0;
        chipTextInputComboView.setChecked(n4 != 0);
        chipTextInputComboView = this.hourLayoutComboView;
        n4 = 10;
        if (n3 == n4) {
            bl2 = true;
        }
        chipTextInputComboView.setChecked(bl2);
        this.time.selection = n3;
    }

    private boolean onHourKeyPress(int n3, KeyEvent keyEvent, EditText editText) {
        int n4;
        Editable editable = editText.getText();
        if (editable == null) {
            return false;
        }
        int n7 = 7;
        if (n3 >= n7 && n3 <= (n7 = 16) && (n3 = keyEvent.getAction()) == (n4 = 1) && (n3 = editText.getSelectionStart()) == (n7 = 2) && (n3 = editable.length()) == n7) {
            this.moveSelection(12);
            return n4;
        }
        this.clearPrefilledText(editText);
        return false;
    }

    private boolean onMinuteKeyPress(int n3, KeyEvent keyEvent, EditText editText) {
        Editable editable;
        int n4 = 67;
        if (n3 == n4 && (n3 = keyEvent.getAction()) == 0 && (n3 = (int)(TextUtils.isEmpty((CharSequence)(editable = editText.getText())) ? 1 : 0)) != 0) {
            this.moveSelection(10);
            return true;
        }
        this.clearPrefilledText(editText);
        return false;
    }

    public void bind() {
        TextInputLayout textInputLayout = this.hourLayoutComboView.getTextInput();
        TextInputLayout textInputLayout2 = this.minuteLayoutComboView.getTextInput();
        textInputLayout = textInputLayout.getEditText();
        textInputLayout2 = textInputLayout2.getEditText();
        textInputLayout.setImeOptions(0x10000005);
        textInputLayout2.setImeOptions(0x10000006);
        textInputLayout.setOnEditorActionListener(this);
        textInputLayout.setOnKeyListener(this);
        textInputLayout2.setOnKeyListener(this);
    }

    public boolean onEditorAction(TextView textView, int n3, KeyEvent keyEvent) {
        int n4 = 5;
        n4 = n3 == n4 ? 1 : 0;
        if (n4 != 0) {
            n3 = 12;
            this.moveSelection(n3);
        }
        return n4 != 0;
    }

    public boolean onKey(View view, int n3, KeyEvent keyEvent) {
        int n4 = this.keyListenerRunning;
        if (n4 != 0) {
            return false;
        }
        this.keyListenerRunning = true;
        view = (EditText)view;
        TimeModel timeModel = this.time;
        n4 = timeModel.selection;
        int n7 = 12;
        boolean bl2 = n4 == n7 ? this.onMinuteKeyPress(n3, keyEvent, (EditText)view) : this.onHourKeyPress(n3, keyEvent, (EditText)view);
        this.keyListenerRunning = false;
        return bl2;
    }
}


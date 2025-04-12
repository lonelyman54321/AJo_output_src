/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.Editable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.accessibility.AccessibilityEvent
 *  android.widget.EditText
 */
package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.EndCompoundLayout;
import com.google.android.material.textfield.TextInputLayout;

abstract class EndIconDelegate {
    final Context context;
    final CheckableImageButton endIconView;
    final EndCompoundLayout endLayout;
    final TextInputLayout textInputLayout;

    public EndIconDelegate(EndCompoundLayout object) {
        TextInputLayout textInputLayout;
        this.textInputLayout = textInputLayout = object.textInputLayout;
        this.endLayout = object;
        textInputLayout = object.getContext();
        this.context = textInputLayout;
        object = object.getEndIconView();
        this.endIconView = object;
    }

    public void afterEditTextChanged(Editable editable) {
    }

    public void beforeEditTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }

    public int getIconContentDescriptionResId() {
        return 0;
    }

    public int getIconDrawableResId() {
        return 0;
    }

    public View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return null;
    }

    public View.OnClickListener getOnIconClickListener() {
        return null;
    }

    public View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
        return null;
    }

    public Q1 getTouchExplorationStateChangeListener() {
        return null;
    }

    public boolean isBoxBackgroundModeSupported(int n3) {
        return true;
    }

    public boolean isIconActivable() {
        return false;
    }

    public boolean isIconActivated() {
        return false;
    }

    public boolean isIconCheckable() {
        return false;
    }

    public boolean isIconChecked() {
        return false;
    }

    public void onEditTextAttached(EditText editText) {
    }

    public void onInitializeAccessibilityNodeInfo(View view, C2 c2) {
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
    }

    public void onSuffixVisibilityChanged(boolean bl2) {
    }

    public final void refreshIconState() {
        this.endLayout.refreshIconState(false);
    }

    public void setUp() {
    }

    public boolean shouldTintIconOnError() {
        return false;
    }

    public void tearDown() {
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.method.PasswordTransformationMethod
 *  android.text.method.TransformationMethod
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 */
package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.textfield.EndCompoundLayout;
import com.google.android.material.textfield.EndIconDelegate;

class PasswordToggleEndIconDelegate
extends EndIconDelegate {
    private EditText editText;
    private int iconResId;
    private final View.OnClickListener onIconClickListener;

    public PasswordToggleEndIconDelegate(EndCompoundLayout object, int n3) {
        super((EndCompoundLayout)((Object)object));
        int n4;
        this.iconResId = n4 = R$drawable.design_password_eye;
        super(this);
        this.onIconClickListener = object;
        if (n3 != 0) {
            this.iconResId = n3;
        }
    }

    public static /* synthetic */ void a(PasswordToggleEndIconDelegate passwordToggleEndIconDelegate, View view) {
        passwordToggleEndIconDelegate.lambda$new$0(view);
    }

    private boolean hasPasswordTransformation() {
        boolean bl2;
        EditText editText = this.editText;
        if (editText != null && (bl2 = (editText = editText.getTransformationMethod()) instanceof PasswordTransformationMethod)) {
            bl2 = true;
        } else {
            bl2 = false;
            editText = null;
        }
        return bl2;
    }

    private static boolean isInputTypePassword(EditText editText) {
        int n3;
        int n4;
        int n7;
        if (editText != null && ((n7 = editText.getInputType()) == (n4 = 16) || (n7 = editText.getInputType()) == (n4 = 128) || (n7 = editText.getInputType()) == (n4 = 144) || (n3 = editText.getInputType()) == (n7 = 224))) {
            n3 = 1;
        } else {
            n3 = 0;
            editText = null;
        }
        return n3 != 0;
    }

    private /* synthetic */ void lambda$new$0(View view) {
        EditText editText;
        view = this.editText;
        if (view == null) {
            return;
        }
        int n3 = view.getSelectionEnd();
        boolean bl2 = this.hasPasswordTransformation();
        if (bl2) {
            editText = this.editText;
            Object var5_5 = null;
            editText.setTransformationMethod(null);
        } else {
            editText = this.editText;
            PasswordTransformationMethod passwordTransformationMethod = PasswordTransformationMethod.getInstance();
            editText.setTransformationMethod((TransformationMethod)passwordTransformationMethod);
        }
        if (n3 >= 0) {
            editText = this.editText;
            editText.setSelection(n3);
        }
        this.refreshIconState();
    }

    public void beforeEditTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        this.refreshIconState();
    }

    public int getIconContentDescriptionResId() {
        return R$string.password_toggle_content_description;
    }

    public int getIconDrawableResId() {
        return this.iconResId;
    }

    public View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    public boolean isIconCheckable() {
        return true;
    }

    public boolean isIconChecked() {
        return this.hasPasswordTransformation() ^ true;
    }

    public void onEditTextAttached(EditText editText) {
        this.editText = editText;
        this.refreshIconState();
    }

    public void setUp() {
        EditText editText = this.editText;
        boolean bl2 = PasswordToggleEndIconDelegate.isInputTypePassword(editText);
        if (bl2) {
            editText = this.editText;
            PasswordTransformationMethod passwordTransformationMethod = PasswordTransformationMethod.getInstance();
            editText.setTransformationMethod((TransformationMethod)passwordTransformationMethod);
        }
    }

    public void tearDown() {
        EditText editText = this.editText;
        if (editText != null) {
            PasswordTransformationMethod passwordTransformationMethod = PasswordTransformationMethod.getInstance();
            editText.setTransformationMethod((TransformationMethod)passwordTransformationMethod);
        }
    }
}


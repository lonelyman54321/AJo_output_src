/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewParent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 */
package com.google.android.material.textfield;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class TextInputEditText
extends AppCompatEditText {
    private final Rect parentRect;
    private boolean textInputLayoutFocusedRectEnabled;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.editTextStyle;
        this(context, attributeSet, n3);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int n3) {
        Context context2 = MaterialThemeOverlay.wrap(context, attributeSet, n3, 0);
        super(context2, attributeSet, n3);
        super();
        this.parentRect = context2;
        int[] nArray = R$styleable.TextInputEditText;
        int n4 = R$style.Widget_Design_TextInputEditText;
        int[] nArray2 = new int[]{};
        context = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, nArray, n3, n4, nArray2);
        int bl2 = R$styleable.TextInputEditText_textInputLayoutFocusedRectEnabled;
        boolean bl3 = context.getBoolean(bl2, false);
        this.setTextInputLayoutFocusedRectEnabled(bl3);
        context.recycle();
    }

    private String getAccessibilityNodeInfoText(TextInputLayout object) {
        Object object2 = this.getText();
        object = ((TextInputLayout)((Object)object)).getHint();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2) ^ true;
        boolean bl3 = TextUtils.isEmpty((CharSequence)object) ^ true;
        String string2 = "";
        object = bl3 ? object.toString() : string2;
        if (bl2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(object2);
            boolean bl4 = TextUtils.isEmpty((CharSequence)object);
            if (!bl4) {
                object2 = ", ";
                string2 = kp1_0.c((String)object2, (String)object);
            }
            stringBuilder.append(string2);
            return stringBuilder.toString();
        }
        boolean bl5 = TextUtils.isEmpty((CharSequence)object);
        if (!bl5) {
            return object;
        }
        return string2;
    }

    private CharSequence getHintFromLayout() {
        Object object = this.getTextInputLayout();
        object = object != null ? object.getHint() : null;
        return object;
    }

    private TextInputLayout getTextInputLayout() {
        boolean bl2;
        ViewParent viewParent = this.getParent();
        while (bl2 = viewParent instanceof View) {
            bl2 = viewParent instanceof TextInputLayout;
            if (bl2) {
                return (TextInputLayout)viewParent;
            }
            viewParent = viewParent.getParent();
        }
        return null;
    }

    private boolean shouldUseTextInputLayoutFocusedRect(TextInputLayout textInputLayout) {
        boolean bl2;
        if (textInputLayout != null && (bl2 = this.textInputLayoutFocusedRectEnabled)) {
            bl2 = true;
        } else {
            bl2 = false;
            textInputLayout = null;
        }
        return bl2;
    }

    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = this.getTextInputLayout();
        boolean bl2 = this.shouldUseTextInputLayoutFocusedRect(textInputLayout);
        if (bl2 && rect != null) {
            int n3;
            Rect rect2 = this.parentRect;
            textInputLayout.getFocusedRect(rect2);
            textInputLayout = this.parentRect;
            rect.bottom = n3 = ((Rect)textInputLayout).bottom;
        }
    }

    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = this.getTextInputLayout();
        int n3 = this.shouldUseTextInputLayoutFocusedRect(textInputLayout);
        if (n3 != 0) {
            boolean bl2 = textInputLayout.getGlobalVisibleRect(rect, point);
            if (bl2 && point != null) {
                int n4 = -this.getScrollX();
                n3 = -this.getScrollY();
                point.offset(n4, n3);
            }
            return bl2;
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    public CharSequence getHint() {
        boolean bl2;
        TextInputLayout textInputLayout = this.getTextInputLayout();
        if (textInputLayout != null && (bl2 = textInputLayout.isProvidingHint())) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    public boolean isTextInputLayoutFocusedRectEnabled() {
        return this.textInputLayoutFocusedRectEnabled;
    }

    public void onAttachedToWindow() {
        boolean bl2;
        super.onAttachedToWindow();
        Object object = this.getTextInputLayout();
        if (object != null && (bl2 = object.isProvidingHint()) && (object = super.getHint()) == null && (bl2 = ManufacturerUtils.isMeizuDevice())) {
            object = "";
            this.setHint((CharSequence)object);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        CharSequence charSequence;
        InputConnection inputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnection != null && (charSequence = editorInfo.hintText) == null) {
            editorInfo.hintText = charSequence = this.getHintFromLayout();
        }
        return inputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Object object = this.getTextInputLayout();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 < n4 && object != null) {
            object = this.getAccessibilityNodeInfoText((TextInputLayout)((Object)object));
            accessibilityNodeInfo.setText((CharSequence)object);
        }
    }

    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = this.getTextInputLayout();
        int n3 = this.shouldUseTextInputLayoutFocusedRect(textInputLayout);
        if (n3 != 0 && rect != null) {
            int n4 = textInputLayout.getHeight();
            n3 = this.getHeight();
            Rect rect2 = this.parentRect;
            int n7 = rect.left;
            int n8 = rect.top;
            int n10 = rect.right;
            int n14 = rect.bottom + (n4 -= n3);
            rect2.set(n7, n8, n10, n14);
            rect = this.parentRect;
            return super.requestRectangleOnScreen(rect);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean bl2) {
        this.textInputLayoutFocusedRectEnabled = bl2;
    }
}


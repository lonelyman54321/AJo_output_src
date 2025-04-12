/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.widget.EditText
 */
package com.google.android.material.textfield;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.core.view.a;
import com.google.android.material.textfield.TextInputLayout;

public class TextInputLayout$AccessibilityDelegate
extends a {
    private final TextInputLayout layout;

    public TextInputLayout$AccessibilityDelegate(TextInputLayout textInputLayout) {
        this.layout = textInputLayout;
    }

    public void onInitializeAccessibilityNodeInfo(View view, C2 c2) {
        boolean bl2;
        int n3;
        super.onInitializeAccessibilityNodeInfo(view, c2);
        EditText editText = this.layout.getEditText();
        if (editText != null) {
            editText = editText.getText();
        } else {
            n3 = 0;
            editText = null;
        }
        CharSequence charSequence = this.layout.getHint();
        CharSequence charSequence2 = this.layout.getError();
        CharSequence charSequence3 = this.layout.getPlaceholderText();
        TextInputLayout textInputLayout = this.layout;
        int n4 = textInputLayout.getCounterMaxLength();
        CharSequence charSequence4 = this.layout.getCounterOverflowDescription();
        boolean bl3 = TextUtils.isEmpty((CharSequence)editText);
        boolean bl4 = bl3 ^ true;
        boolean bl5 = TextUtils.isEmpty((CharSequence)charSequence);
        int n7 = 1;
        bl5 ^= n7;
        Object object = this.layout;
        int n8 = ((TextInputLayout)((Object)object)).isHintExpanded() ^ n7;
        boolean bl6 = TextUtils.isEmpty((CharSequence)charSequence2) ^ n7;
        if (!bl6 && (bl2 = TextUtils.isEmpty((CharSequence)charSequence4))) {
            n7 = 0;
        }
        charSequence = bl5 ? charSequence.toString() : "";
        TextInputLayout.access$400(this.layout).setupAccessibilityNodeInfo(c2);
        String string2 = ", ";
        if (bl4) {
            c2.s((CharSequence)editText);
        } else {
            bl2 = TextUtils.isEmpty((CharSequence)charSequence);
            if (!bl2) {
                c2.s(charSequence);
                if (n8 != 0 && charSequence3 != null) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)charSequence);
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append((Object)charSequence3);
                    charSequence3 = ((StringBuilder)object).toString();
                    c2.s(charSequence3);
                }
            } else if (charSequence3 != null) {
                c2.s(charSequence3);
            }
        }
        int n10 = TextUtils.isEmpty((CharSequence)charSequence);
        if (n10 == 0) {
            n10 = Build.VERSION.SDK_INT;
            n8 = 26;
            if (n10 >= n8) {
                c2.q(charSequence);
            } else {
                if (bl4) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(editText);
                    stringBuilder.append(string2);
                    stringBuilder.append((String)charSequence);
                    charSequence = stringBuilder.toString();
                }
                c2.s(charSequence);
            }
            if (n10 >= n8) {
                charSequence = c2.a;
                e2_0.b((AccessibilityNodeInfo)charSequence, bl3);
            } else {
                int n14 = 4;
                c2.j(n14, bl3);
            }
        }
        if (editText == null || (n3 = editText.length()) != n4) {
            n4 = -1;
        }
        c2.a.setMaxTextLength(n4);
        editText = c2.a;
        if (n7 != 0) {
            if (!bl6) {
                charSequence2 = charSequence4;
            }
            editText.setError(charSequence2);
        }
        if ((charSequence = TextInputLayout.access$500(this.layout).getHelperTextView()) != null) {
            editText.setLabelFor((View)charSequence);
        }
        TextInputLayout.access$300(this.layout).getEndIconDelegate().onInitializeAccessibilityNodeInfo(view, c2);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        TextInputLayout.access$300(this.layout).getEndIconDelegate().onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
}


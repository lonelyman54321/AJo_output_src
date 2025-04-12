/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.ril.ajio.payment.fragment;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputLayout$AccessibilityDelegate;
import kotlin.jvm.internal.Intrinsics;

public final class h$b
extends TextInputLayout$AccessibilityDelegate {
    public final TextInputLayout a;
    public final String b;

    public h$b(TextInputLayout textInputLayout, String string2) {
        Intrinsics.checkNotNullParameter((Object)textInputLayout, "layout");
        super(textInputLayout);
        this.a = textInputLayout;
        this.b = string2;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C2 c2) {
        Intrinsics.checkNotNullParameter(view, "host");
        String string2 = "info";
        Intrinsics.checkNotNullParameter(c2, string2);
        super.onInitializeAccessibilityNodeInfo(view, c2);
        view = this.a.getEditText();
        if (view != null) {
            int n3;
            string2 = view.getText();
            String string3 = this.b;
            if (string2 != null && (n3 = string2.length()) != 0) {
                view = view.getText();
                c2.s((CharSequence)view);
            } else {
                c2.s(string3);
            }
            c2.q(string3);
        }
    }
}


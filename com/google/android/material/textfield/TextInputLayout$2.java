/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import com.google.android.material.textfield.TextInputLayout;

class TextInputLayout$2
implements Runnable {
    final /* synthetic */ TextInputLayout this$0;

    public TextInputLayout$2(TextInputLayout textInputLayout) {
        this.this$0 = textInputLayout;
    }

    public void run() {
        TextInputLayout.access$300(this.this$0).checkEndIcon();
    }
}


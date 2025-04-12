/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 */
package com.google.android.material.textfield;

import android.view.View;
import com.google.android.material.textfield.EndCompoundLayout;

class EndCompoundLayout$3
implements View.OnAttachStateChangeListener {
    final /* synthetic */ EndCompoundLayout this$0;

    public EndCompoundLayout$3(EndCompoundLayout endCompoundLayout) {
        this.this$0 = endCompoundLayout;
    }

    public void onViewAttachedToWindow(View view) {
        EndCompoundLayout.access$300(this.this$0);
    }

    public void onViewDetachedFromWindow(View view) {
        EndCompoundLayout.access$400(this.this$0);
    }
}


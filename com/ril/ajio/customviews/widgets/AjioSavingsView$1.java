/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.ril.ajio.customviews.widgets;

import android.view.View;
import com.ril.ajio.customviews.widgets.AjioSavingsDoneClickListener;
import com.ril.ajio.customviews.widgets.AjioSavingsView;

class AjioSavingsView$1
implements View.OnClickListener {
    final /* synthetic */ AjioSavingsView this$0;
    final /* synthetic */ AjioSavingsDoneClickListener val$onDoneClickListener;

    public AjioSavingsView$1(AjioSavingsView ajioSavingsView, AjioSavingsDoneClickListener ajioSavingsDoneClickListener) {
        this.this$0 = ajioSavingsView;
        this.val$onDoneClickListener = ajioSavingsDoneClickListener;
    }

    public void onClick(View view) {
        this.val$onDoneClickListener.onDoneClick();
    }
}


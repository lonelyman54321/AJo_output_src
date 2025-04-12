/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
package com.ril.ajio.customviews.widgets;

import android.widget.CompoundButton;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;

class AjioCustomExpandablePanel$ToggleCheckedListener
implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ AjioCustomExpandablePanel this$0;

    private AjioCustomExpandablePanel$ToggleCheckedListener(AjioCustomExpandablePanel ajioCustomExpandablePanel) {
        this.this$0 = ajioCustomExpandablePanel;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean bl2) {
        if (!bl2) {
            compoundButton = AjioCustomExpandablePanel.b(this.this$0);
            int n3 = 8;
            compoundButton.setVisibility(n3);
        } else {
            compoundButton = AjioCustomExpandablePanel.b(this.this$0);
            boolean bl3 = false;
            compoundButton.setVisibility(0);
        }
    }
}


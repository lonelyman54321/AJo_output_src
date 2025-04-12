/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.CompoundButton
 */
package com.ril.ajio.customviews.widgets;

import android.view.View;
import android.widget.CompoundButton;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;

class AjioCustomExpandablePanel$PanelToggler
implements View.OnClickListener {
    final /* synthetic */ AjioCustomExpandablePanel this$0;

    private AjioCustomExpandablePanel$PanelToggler(AjioCustomExpandablePanel ajioCustomExpandablePanel) {
        this.this$0 = ajioCustomExpandablePanel;
    }

    public /* synthetic */ AjioCustomExpandablePanel$PanelToggler(AjioCustomExpandablePanel ajioCustomExpandablePanel, int n3) {
        this(ajioCustomExpandablePanel);
    }

    public void onClick(View object) {
        object = this.this$0;
        boolean bl2 = AjioCustomExpandablePanel.a((AjioCustomExpandablePanel)((Object)object));
        if (bl2) {
            return;
        }
        object = this.this$0;
        CompoundButton compoundButton = (CompoundButton)AjioCustomExpandablePanel.d((AjioCustomExpandablePanel)((Object)object));
        boolean bl3 = compoundButton.isChecked();
        AjioCustomExpandablePanel.e((AjioCustomExpandablePanel)((Object)object), bl3);
        object = this.this$0;
        bl2 = AjioCustomExpandablePanel.c((AjioCustomExpandablePanel)((Object)object));
        if (!bl2) {
            object = this.this$0;
            object.hideContentContainer();
        } else {
            object = this.this$0;
            object.showContentContainer();
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.CompoundButton
 *  android.widget.LinearLayout
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.ril.ajio.R$styleable;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel$PanelToggler;

public class AjioCustomExpandablePanel
extends LinearLayout {
    private boolean disableExpand;
    private int mContentContainerId;
    private View mContentContainerLayout;
    private boolean mExpanded = false;
    private View mExpansionButton;
    private int mHandleId;

    public AjioCustomExpandablePanel(Context context) {
        this(context, null);
        this.init(context, null);
    }

    public AjioCustomExpandablePanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(context, attributeSet);
    }

    public static /* bridge */ /* synthetic */ boolean a(AjioCustomExpandablePanel ajioCustomExpandablePanel) {
        return ajioCustomExpandablePanel.disableExpand;
    }

    public static /* bridge */ /* synthetic */ View b(AjioCustomExpandablePanel ajioCustomExpandablePanel) {
        return ajioCustomExpandablePanel.mContentContainerLayout;
    }

    public static /* bridge */ /* synthetic */ boolean c(AjioCustomExpandablePanel ajioCustomExpandablePanel) {
        return ajioCustomExpandablePanel.mExpanded;
    }

    public static /* bridge */ /* synthetic */ View d(AjioCustomExpandablePanel ajioCustomExpandablePanel) {
        return ajioCustomExpandablePanel.mExpansionButton;
    }

    public static /* bridge */ /* synthetic */ void e(AjioCustomExpandablePanel ajioCustomExpandablePanel, boolean bl2) {
        ajioCustomExpandablePanel.mExpanded = bl2;
    }

    private void init(Context object, AttributeSet attributeSet) {
        int n3 = 1;
        this.setOrientation(n3);
        int[] nArray = R$styleable.AjioCustomExpandablePanel;
        object = object.obtainStyledAttributes(attributeSet, nArray, 0, 0);
        int n4 = R$styleable.AjioCustomExpandablePanel_handle;
        n4 = object.getResourceId(n4, 0);
        if (n4 != 0) {
            n3 = R$styleable.AjioCustomExpandablePanel_contentContainer;
            if ((n3 = object.getResourceId(n3, 0)) != 0) {
                this.mHandleId = n4;
                this.mContentContainerId = n3;
                object.recycle();
                return;
            }
            object = new IllegalArgumentException("The content attribute is required and must refer to a valid child.");
            throw object;
        }
        object = new IllegalArgumentException("The handle attribute is required and must refer to a valid child.");
        throw object;
    }

    public void hideContentContainer() {
        this.mContentContainerLayout.setVisibility(8);
    }

    public boolean isDisableExpand() {
        return this.disableExpand;
    }

    public void onFinishInflate() {
        Object object;
        super.onFinishInflate();
        int n3 = this.mHandleId;
        this.mExpansionButton = object = this.findViewById(n3);
        if (object != null) {
            n3 = this.mContentContainerId;
            this.mContentContainerLayout = object = this.findViewById(n3);
            if (object != null) {
                object = this.mExpansionButton;
                boolean bl2 = object instanceof CompoundButton;
                if (bl2) {
                    n3 = (int)(((CompoundButton)object).isChecked() ? 1 : 0);
                    this.mExpanded = n3;
                    object = this.mContentContainerLayout;
                    int n4 = -2;
                    object.measure(-1, n4);
                    n3 = (int)(this.mExpanded ? 1 : 0);
                    bl2 = false;
                    if (n3 == 0) {
                        object = this.mContentContainerLayout;
                        n4 = 8;
                        object.setVisibility(n4);
                    } else {
                        object = this.mContentContainerLayout;
                        object.setVisibility(0);
                    }
                    object = this.mExpansionButton;
                    AjioCustomExpandablePanel$PanelToggler ajioCustomExpandablePanel$PanelToggler = new AjioCustomExpandablePanel$PanelToggler(this, 0);
                    object.setOnClickListener((View.OnClickListener)ajioCustomExpandablePanel$PanelToggler);
                    return;
                }
                object = new IllegalStateException("The Handler UI Widget is suppose to be a Compound button child");
                throw object;
            }
            object = new IllegalArgumentException("The content container attribute must refer to an existing child. This value cannot be left empty.");
            throw object;
        }
        object = new IllegalArgumentException("The handle attribute is must refer to an existing child. This value cannot be left empty.");
        throw object;
    }

    public void setDisableExpand(boolean bl2) {
        this.disableExpand = bl2;
    }

    public void showContentContainer() {
        this.mContentContainerLayout.setVisibility(0);
    }
}


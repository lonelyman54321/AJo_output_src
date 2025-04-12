/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.AjioToggleButton;
import com.ril.ajio.databinding.ItemCcAttachmentReturnFlowOptimizationBinding;

public final class RowCcAttachmentReturnFlowOptimizationBinding
implements BC3 {
    public final LinearLayout attachParent;
    public final LinearLayout attachmentContainer;
    public final AjioToggleButton expandAttachment;
    private final AjioCustomExpandablePanel rootView;
    public final ItemCcAttachmentReturnFlowOptimizationBinding rowCcAttachContainer;

    private RowCcAttachmentReturnFlowOptimizationBinding(AjioCustomExpandablePanel ajioCustomExpandablePanel, LinearLayout linearLayout, LinearLayout linearLayout2, AjioToggleButton ajioToggleButton, ItemCcAttachmentReturnFlowOptimizationBinding itemCcAttachmentReturnFlowOptimizationBinding) {
        this.rootView = ajioCustomExpandablePanel;
        this.attachParent = linearLayout;
        this.attachmentContainer = linearLayout2;
        this.expandAttachment = ajioToggleButton;
        this.rowCcAttachContainer = itemCcAttachmentReturnFlowOptimizationBinding;
    }

    public static RowCcAttachmentReturnFlowOptimizationBinding bind(View object) {
        View view;
        int n3 = R$id.attachParent;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.attachment_container;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.expand_attachment;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioToggleButton)view;
                if (object2 != null && (view = dd2_2.a(n3 = R$id.row_cc_attach_container, object)) != null) {
                    ItemCcAttachmentReturnFlowOptimizationBinding itemCcAttachmentReturnFlowOptimizationBinding = ItemCcAttachmentReturnFlowOptimizationBinding.bind(view);
                    Object object3 = object;
                    object3 = (AjioCustomExpandablePanel)((Object)object);
                    RowCcAttachmentReturnFlowOptimizationBinding rowCcAttachmentReturnFlowOptimizationBinding = new RowCcAttachmentReturnFlowOptimizationBinding((AjioCustomExpandablePanel)((Object)object3), (LinearLayout)view2, (LinearLayout)view3, (AjioToggleButton)object2, itemCcAttachmentReturnFlowOptimizationBinding);
                    return rowCcAttachmentReturnFlowOptimizationBinding;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCcAttachmentReturnFlowOptimizationBinding inflate(LayoutInflater layoutInflater) {
        return RowCcAttachmentReturnFlowOptimizationBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcAttachmentReturnFlowOptimizationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_attachment_return_flow_optimization;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcAttachmentReturnFlowOptimizationBinding.bind((View)layoutInflater);
    }

    public AjioCustomExpandablePanel getRoot() {
        return this.rootView;
    }
}


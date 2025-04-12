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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.AjioToggleButton;

public final class NewRowPdpShopthelookBinding
implements BC3 {
    public final RecyclerView completeTheLookRv;
    public final View divider5;
    public final AjioCustomExpandablePanel expandablePanelShopTheLook;
    private final LinearLayout rootView;
    public final LinearLayout shopContentContainer;
    public final AjioToggleButton shopTheLookToggleExpand;
    public final AjioTextView tvCombooffermessage;

    private NewRowPdpShopthelookBinding(LinearLayout linearLayout, RecyclerView recyclerView, View view, AjioCustomExpandablePanel ajioCustomExpandablePanel, LinearLayout linearLayout2, AjioToggleButton ajioToggleButton, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.completeTheLookRv = recyclerView;
        this.divider5 = view;
        this.expandablePanelShopTheLook = ajioCustomExpandablePanel;
        this.shopContentContainer = linearLayout2;
        this.shopTheLookToggleExpand = ajioToggleButton;
        this.tvCombooffermessage = ajioTextView;
    }

    public static NewRowPdpShopthelookBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.complete_the_look_rv;
        Object object2 = view2 = dd2_2.a(n3, object);
        object2 = (RecyclerView)view2;
        if (object2 != null && (view = dd2_2.a(n3 = R$id.divider5, object)) != null) {
            n3 = R$id.expandable_panel_shop_the_look;
            Object object3 = view2 = dd2_2.a(n3, object);
            object3 = (AjioCustomExpandablePanel)view2;
            if (object3 != null) {
                n3 = R$id.shop_contentContainer;
                View view3 = view2 = dd2_2.a(n3, object);
                view3 = (LinearLayout)view2;
                if (view3 != null) {
                    n3 = R$id.shop_the_look_toggle_expand;
                    Object object4 = view2 = dd2_2.a(n3, object);
                    object4 = (AjioToggleButton)view2;
                    if (object4 != null) {
                        n3 = R$id.tv_combooffermessage;
                        Object object5 = view2 = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view2;
                        if (object5 != null) {
                            Object object6 = object;
                            object6 = (LinearLayout)object;
                            NewRowPdpShopthelookBinding newRowPdpShopthelookBinding = new NewRowPdpShopthelookBinding((LinearLayout)object6, (RecyclerView)object2, view, (AjioCustomExpandablePanel)((Object)object3), (LinearLayout)view3, (AjioToggleButton)object4, (AjioTextView)object5);
                            return newRowPdpShopthelookBinding;
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewRowPdpShopthelookBinding inflate(LayoutInflater layoutInflater) {
        return NewRowPdpShopthelookBinding.inflate(layoutInflater, null, false);
    }

    public static NewRowPdpShopthelookBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_row_pdp_shopthelook;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewRowPdpShopthelookBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


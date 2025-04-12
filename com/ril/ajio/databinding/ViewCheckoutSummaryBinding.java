/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.CheckBox
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.RowCheckoutOrdersummaryRevampBinding;

public final class ViewCheckoutSummaryBinding
implements BC3 {
    public final CheckBox checkoutExpandableCheckboxExpand;
    public final RelativeLayout checkoutExpandableLayout;
    public final AjioTextView checkoutExpandableTvStatus;
    public final AjioTextView checkoutExpandableTvTitle;
    public final RowCheckoutOrdersummaryRevampBinding checkoutSummaryExpandableLayout;
    private final LinearLayout rootView;

    private ViewCheckoutSummaryBinding(LinearLayout linearLayout, CheckBox checkBox, RelativeLayout relativeLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, RowCheckoutOrdersummaryRevampBinding rowCheckoutOrdersummaryRevampBinding) {
        this.rootView = linearLayout;
        this.checkoutExpandableCheckboxExpand = checkBox;
        this.checkoutExpandableLayout = relativeLayout;
        this.checkoutExpandableTvStatus = ajioTextView;
        this.checkoutExpandableTvTitle = ajioTextView2;
        this.checkoutSummaryExpandableLayout = rowCheckoutOrdersummaryRevampBinding;
    }

    public static ViewCheckoutSummaryBinding bind(View object) {
        View view;
        int n3 = R$id.checkout_expandable_checkbox_expand;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (CheckBox)view;
        if (view2 != null) {
            n3 = R$id.checkout_expandable_layout;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (RelativeLayout)view;
            if (view3 != null) {
                n3 = R$id.checkout_expandable_tv_status;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioTextView)view;
                if (object2 != null) {
                    n3 = R$id.checkout_expandable_tv_title;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null && (view = dd2_2.a(n3 = R$id.checkout_summary_expandable_layout, object)) != null) {
                        RowCheckoutOrdersummaryRevampBinding rowCheckoutOrdersummaryRevampBinding = RowCheckoutOrdersummaryRevampBinding.bind(view);
                        Object object4 = object;
                        object4 = (LinearLayout)object;
                        ViewCheckoutSummaryBinding viewCheckoutSummaryBinding = new ViewCheckoutSummaryBinding((LinearLayout)object4, (CheckBox)view2, (RelativeLayout)view3, (AjioTextView)object2, (AjioTextView)object3, rowCheckoutOrdersummaryRevampBinding);
                        return viewCheckoutSummaryBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ViewCheckoutSummaryBinding inflate(LayoutInflater layoutInflater) {
        return ViewCheckoutSummaryBinding.inflate(layoutInflater, null, false);
    }

    public static ViewCheckoutSummaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_checkout_summary;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewCheckoutSummaryBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


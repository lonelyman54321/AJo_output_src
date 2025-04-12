/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowCartFooterLuxeBinding
implements BC3 {
    public final RelativeLayout LayoutHighlightOffer;
    public final LinearLayout fragmentCartListLayoutDetail;
    public final AjioTextView fragmentCartListTvPrice;
    public final AjioTextView fragmentCartListTvProceed;
    private final ConstraintLayout rootView;
    public final TextView txtCheersText;
    public final TextView txtHighlightOffer;
    public final AjioTextView viewDetailTvOrderSummary;

    private RowCartFooterLuxeBinding(ConstraintLayout constraintLayout, RelativeLayout relativeLayout, LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, TextView textView, TextView textView2, AjioTextView ajioTextView3) {
        this.rootView = constraintLayout;
        this.LayoutHighlightOffer = relativeLayout;
        this.fragmentCartListLayoutDetail = linearLayout;
        this.fragmentCartListTvPrice = ajioTextView;
        this.fragmentCartListTvProceed = ajioTextView2;
        this.txtCheersText = textView;
        this.txtHighlightOffer = textView2;
        this.viewDetailTvOrderSummary = ajioTextView3;
    }

    public static RowCartFooterLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.LayoutHighlightOffer;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (RelativeLayout)view;
        if (view2 != null) {
            n3 = R$id.fragment_cart_list_layout_detail;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.fragment_cart_list_tv_price;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioTextView)view;
                if (object2 != null) {
                    n3 = R$id.fragment_cart_list_tv_proceed;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        n3 = R$id.txtCheersText;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (TextView)view;
                        if (view4 != null) {
                            n3 = R$id.txtHighlightOffer;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (TextView)view;
                            if (view5 != null) {
                                n3 = R$id.view_detail_tv_order_summary;
                                Object object4 = view = dd2_2.a(n3, object);
                                object4 = (AjioTextView)view;
                                if (object4 != null) {
                                    Object object5 = object;
                                    object5 = (ConstraintLayout)((Object)object);
                                    RowCartFooterLuxeBinding rowCartFooterLuxeBinding = new RowCartFooterLuxeBinding((ConstraintLayout)((Object)object5), (RelativeLayout)view2, (LinearLayout)view3, (AjioTextView)object2, (AjioTextView)object3, (TextView)view4, (TextView)view5, (AjioTextView)object4);
                                    return rowCartFooterLuxeBinding;
                                }
                            }
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

    public static RowCartFooterLuxeBinding inflate(LayoutInflater layoutInflater) {
        return RowCartFooterLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static RowCartFooterLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cart_footer_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCartFooterLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


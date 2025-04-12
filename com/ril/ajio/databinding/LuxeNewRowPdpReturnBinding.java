/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxeNewRowPdpReturnBinding
implements BC3 {
    public final AjioTextView accessibilityClickHere;
    public final LinearLayout parentPanelProductReturn;
    public final View returnDivider;
    public final LinearLayout returnsContainer;
    public final TextView returnsTitle;
    private final LinearLayout rootView;
    public final AjioTextView rowPdpTvNoReturnInfo;
    public final AjioTextView rowPdpTvReturnInfo;

    private LuxeNewRowPdpReturnBinding(LinearLayout linearLayout, AjioTextView ajioTextView, LinearLayout linearLayout2, View view, LinearLayout linearLayout3, TextView textView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = linearLayout;
        this.accessibilityClickHere = ajioTextView;
        this.parentPanelProductReturn = linearLayout2;
        this.returnDivider = view;
        this.returnsContainer = linearLayout3;
        this.returnsTitle = textView;
        this.rowPdpTvNoReturnInfo = ajioTextView2;
        this.rowPdpTvReturnInfo = ajioTextView3;
    }

    public static LuxeNewRowPdpReturnBinding bind(View object) {
        View view;
        int n3 = R$id.accessibility_click_here;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            View view2 = object;
            view2 = (LinearLayout)object;
            n3 = R$id.return_divider;
            View view3 = dd2_2.a(n3, object);
            if (view3 != null) {
                n3 = R$id.returns_container;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (LinearLayout)view;
                if (view4 != null) {
                    n3 = R$id.returns_title;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        n3 = R$id.row_pdp_tv_no_return_info;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (AjioTextView)view;
                        if (object3 != null) {
                            n3 = R$id.row_pdp_tv_return_info;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (AjioTextView)view;
                            if (object4 != null) {
                                object = new LuxeNewRowPdpReturnBinding((LinearLayout)view2, (AjioTextView)object2, (LinearLayout)view2, view3, (LinearLayout)view4, (TextView)view5, (AjioTextView)object3, (AjioTextView)object4);
                                return object;
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

    public static LuxeNewRowPdpReturnBinding inflate(LayoutInflater layoutInflater) {
        return LuxeNewRowPdpReturnBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeNewRowPdpReturnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_new_row_pdp_return;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeNewRowPdpReturnBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


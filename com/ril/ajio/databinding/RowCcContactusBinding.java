/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowCcContactusBinding
implements BC3 {
    private final LinearLayout rootView;
    public final RelativeLayout rowCcContactusLayoutOne;
    public final RelativeLayout rowCcContactusLayoutThree;
    public final AjioTextView rowCcContactusLblEmail;
    public final AjioTextView rowCcContactusTvNumberOne;
    public final AjioTextView rowCcContactusTvNumberTwo;
    public final AjioTextView rowCcContactusTvSubtitle;

    private RowCcContactusBinding(LinearLayout linearLayout, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4) {
        this.rootView = linearLayout;
        this.rowCcContactusLayoutOne = relativeLayout;
        this.rowCcContactusLayoutThree = relativeLayout2;
        this.rowCcContactusLblEmail = ajioTextView;
        this.rowCcContactusTvNumberOne = ajioTextView2;
        this.rowCcContactusTvNumberTwo = ajioTextView3;
        this.rowCcContactusTvSubtitle = ajioTextView4;
    }

    public static RowCcContactusBinding bind(View object) {
        View view;
        int n3 = R$id.row_cc_contactus_layout_one;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (RelativeLayout)view;
        if (view2 != null) {
            n3 = R$id.row_cc_contactus_layout_three;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (RelativeLayout)view;
            if (view3 != null) {
                n3 = R$id.row_cc_contactus_lbl_email;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioTextView)view;
                if (object2 != null) {
                    n3 = R$id.row_cc_contactus_tv_number_one;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        n3 = R$id.row_cc_contactus_tv_number_two;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            n3 = R$id.row_cc_contactus_tv_subtitle;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (AjioTextView)view;
                            if (object5 != null) {
                                Object object6 = object;
                                object6 = (LinearLayout)object;
                                RowCcContactusBinding rowCcContactusBinding = new RowCcContactusBinding((LinearLayout)object6, (RelativeLayout)view2, (RelativeLayout)view3, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5);
                                return rowCcContactusBinding;
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

    public static RowCcContactusBinding inflate(LayoutInflater layoutInflater) {
        return RowCcContactusBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcContactusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_contactus;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcContactusBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


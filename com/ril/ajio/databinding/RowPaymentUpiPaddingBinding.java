/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCheckBox;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEAutoCompleteTextView;
import com.ril.ajio.customviews.widgets.PENonScrollableListView;
import com.ril.ajio.customviews.widgets.PEToggleButton;

public final class RowPaymentUpiPaddingBinding
implements BC3 {
    public final AjioCustomExpandablePanel expandablePaymentUpi;
    public final ImageView imageUpi;
    public final AjioTextView proceedBtnTv;
    private final LinearLayout rootView;
    public final AjioTextView tvEnterUpiid;
    public final RelativeLayout upiContentContainer;
    public final AjioCheckBox upiEnrollCheckBox;
    public final PENonScrollableListView upiIntentApp;
    public final AjioTextView upiInvalidErrorTv;
    public final LinearLayout upiLl;
    public final LinearLayout upiProceedButton;
    public final LinearLayout upiTitleLl;
    public final PEToggleButton upiToggleExpand;
    public final PEAutoCompleteTextView upiValue;

    private RowPaymentUpiPaddingBinding(LinearLayout linearLayout, AjioCustomExpandablePanel ajioCustomExpandablePanel, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, RelativeLayout relativeLayout, AjioCheckBox ajioCheckBox, PENonScrollableListView pENonScrollableListView, AjioTextView ajioTextView3, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, PEToggleButton pEToggleButton, PEAutoCompleteTextView pEAutoCompleteTextView) {
        this.rootView = linearLayout;
        this.expandablePaymentUpi = ajioCustomExpandablePanel;
        this.imageUpi = imageView;
        this.proceedBtnTv = ajioTextView;
        this.tvEnterUpiid = ajioTextView2;
        this.upiContentContainer = relativeLayout;
        this.upiEnrollCheckBox = ajioCheckBox;
        this.upiIntentApp = pENonScrollableListView;
        this.upiInvalidErrorTv = ajioTextView3;
        this.upiLl = linearLayout2;
        this.upiProceedButton = linearLayout3;
        this.upiTitleLl = linearLayout4;
        this.upiToggleExpand = pEToggleButton;
        this.upiValue = pEAutoCompleteTextView;
    }

    public static RowPaymentUpiPaddingBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.expandable_payment_upi;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioCustomExpandablePanel)view2;
        if (object2 != null) {
            n3 = R$id.image_upi;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (ImageView)view2;
            if (view3 != null) {
                n3 = R$id.proceed_btn_tv;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (AjioTextView)view2;
                if (object3 != null) {
                    n3 = R$id.tv_enter_upiid;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        n3 = R$id.upi_contentContainer;
                        View view4 = view2 = dd2_2.a(n3, view);
                        view4 = (RelativeLayout)view2;
                        if (view4 != null) {
                            n3 = R$id.upi_enroll_check_box;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (AjioCheckBox)view2;
                            if (object5 != null) {
                                n3 = R$id.upi_intent_app;
                                Object object6 = view2 = dd2_2.a(n3, view);
                                object6 = (PENonScrollableListView)view2;
                                if (object6 != null) {
                                    n3 = R$id.upi_invalid_error_tv;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (AjioTextView)view2;
                                    if (object7 != null) {
                                        n3 = R$id.upi_ll;
                                        View view5 = view2 = dd2_2.a(n3, view);
                                        view5 = (LinearLayout)view2;
                                        if (view5 != null) {
                                            n3 = R$id.upi_proceed_button;
                                            View view6 = view2 = dd2_2.a(n3, view);
                                            view6 = (LinearLayout)view2;
                                            if (view6 != null) {
                                                n3 = R$id.upi_title_ll;
                                                View view7 = view2 = dd2_2.a(n3, view);
                                                view7 = (LinearLayout)view2;
                                                if (view7 != null) {
                                                    n3 = R$id.upi_toggle_expand;
                                                    Object object8 = view2 = dd2_2.a(n3, view);
                                                    object8 = (PEToggleButton)view2;
                                                    if (object8 != null) {
                                                        n3 = R$id.upi_value;
                                                        Object object9 = view2 = dd2_2.a(n3, view);
                                                        object9 = (PEAutoCompleteTextView)view2;
                                                        if (object9 != null) {
                                                            View view8 = view;
                                                            view8 = (LinearLayout)view;
                                                            RowPaymentUpiPaddingBinding rowPaymentUpiPaddingBinding = new RowPaymentUpiPaddingBinding((LinearLayout)view8, (AjioCustomExpandablePanel)((Object)object2), (ImageView)view3, (AjioTextView)object3, (AjioTextView)object4, (RelativeLayout)view4, (AjioCheckBox)object5, (PENonScrollableListView)((Object)object6), (AjioTextView)object7, (LinearLayout)view5, (LinearLayout)view6, (LinearLayout)view7, (PEToggleButton)object8, (PEAutoCompleteTextView)object9);
                                                            return rowPaymentUpiPaddingBinding;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowPaymentUpiPaddingBinding inflate(LayoutInflater layoutInflater) {
        return RowPaymentUpiPaddingBinding.inflate(layoutInflater, null, false);
    }

    public static RowPaymentUpiPaddingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_payment_upi_padding;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowPaymentUpiPaddingBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCheckBox;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PENonScrollableListView;
import com.ril.ajio.customviews.widgets.PEToggleButton;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;

public final class PesdkRowPaymentUpiBinding
implements BC3 {
    public final AjioCustomExpandablePanel expandablePaymentUpi;
    public final PesdkLoyaltyCardInfoView layoutLoyaltyCardInfo;
    public final TextView pfContainer;
    public final AjioTextView proceedBtnTv;
    private final LinearLayout rootView;
    public final ConstraintLayout savedUpiCard;
    public final AjioTextView tvEnterUpiid;
    public final AjioTextView tvHowToFindUpi;
    public final LinearLayout upiContentContainer;
    public final AjioCheckBox upiEnrollCheckBox;
    public final PENonScrollableListView upiIntentApp;
    public final AjioTextView upiInvalidErrorTv;
    public final LinearLayout upiLl;
    public final PEToggleButton upiToggleExpand;
    public final EditText upiValue;

    private PesdkRowPaymentUpiBinding(LinearLayout linearLayout, AjioCustomExpandablePanel ajioCustomExpandablePanel, PesdkLoyaltyCardInfoView pesdkLoyaltyCardInfoView, TextView textView, AjioTextView ajioTextView, ConstraintLayout constraintLayout, AjioTextView ajioTextView2, AjioTextView ajioTextView3, LinearLayout linearLayout2, AjioCheckBox ajioCheckBox, PENonScrollableListView pENonScrollableListView, AjioTextView ajioTextView4, LinearLayout linearLayout3, PEToggleButton pEToggleButton, EditText editText) {
        this.rootView = linearLayout;
        this.expandablePaymentUpi = ajioCustomExpandablePanel;
        this.layoutLoyaltyCardInfo = pesdkLoyaltyCardInfoView;
        this.pfContainer = textView;
        this.proceedBtnTv = ajioTextView;
        this.savedUpiCard = constraintLayout;
        this.tvEnterUpiid = ajioTextView2;
        this.tvHowToFindUpi = ajioTextView3;
        this.upiContentContainer = linearLayout2;
        this.upiEnrollCheckBox = ajioCheckBox;
        this.upiIntentApp = pENonScrollableListView;
        this.upiInvalidErrorTv = ajioTextView4;
        this.upiLl = linearLayout3;
        this.upiToggleExpand = pEToggleButton;
        this.upiValue = editText;
    }

    public static PesdkRowPaymentUpiBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.expandable_payment_upi;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioCustomExpandablePanel)view2;
        if (object2 != null) {
            n3 = R$id.layout_loyaltyCardInfo;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (PesdkLoyaltyCardInfoView)view2;
            if (object3 != null) {
                n3 = R$id.pf_container;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (TextView)view2;
                if (view3 != null) {
                    n3 = R$id.proceed_btn_tv;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        n3 = R$id.saved_upi_card;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (ConstraintLayout)view2;
                        if (object5 != null) {
                            n3 = R$id.tv_enter_upiid;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (AjioTextView)view2;
                            if (object6 != null) {
                                n3 = R$id.tv_how_to_find_upi;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (AjioTextView)view2;
                                if (object7 != null) {
                                    n3 = R$id.upi_contentContainer;
                                    View view4 = view2 = dd2_2.a(n3, view);
                                    view4 = (LinearLayout)view2;
                                    if (view4 != null) {
                                        n3 = R$id.upi_enroll_check_box;
                                        Object object8 = view2 = dd2_2.a(n3, view);
                                        object8 = (AjioCheckBox)view2;
                                        if (object8 != null) {
                                            n3 = R$id.upi_intent_app;
                                            Object object9 = view2 = dd2_2.a(n3, view);
                                            object9 = (PENonScrollableListView)view2;
                                            if (object9 != null) {
                                                n3 = R$id.upi_invalid_error_tv;
                                                Object object10 = view2 = dd2_2.a(n3, view);
                                                object10 = (AjioTextView)view2;
                                                if (object10 != null) {
                                                    n3 = R$id.upi_ll;
                                                    View view5 = view2 = dd2_2.a(n3, view);
                                                    view5 = (LinearLayout)view2;
                                                    if (view5 != null) {
                                                        n3 = R$id.upi_toggle_expand;
                                                        Object object11 = view2 = dd2_2.a(n3, view);
                                                        object11 = (PEToggleButton)view2;
                                                        if (object11 != null) {
                                                            n3 = R$id.upi_value;
                                                            View view6 = view2 = dd2_2.a(n3, view);
                                                            view6 = (EditText)view2;
                                                            if (view6 != null) {
                                                                View view7 = view;
                                                                view7 = (LinearLayout)view;
                                                                PesdkRowPaymentUpiBinding pesdkRowPaymentUpiBinding = new PesdkRowPaymentUpiBinding((LinearLayout)view7, (AjioCustomExpandablePanel)((Object)object2), (PesdkLoyaltyCardInfoView)((Object)object3), (TextView)view3, (AjioTextView)object4, (ConstraintLayout)((Object)object5), (AjioTextView)object6, (AjioTextView)object7, (LinearLayout)view4, (AjioCheckBox)object8, (PENonScrollableListView)((Object)object9), (AjioTextView)object10, (LinearLayout)view5, (PEToggleButton)object11, (EditText)view6);
                                                                return pesdkRowPaymentUpiBinding;
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
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkRowPaymentUpiBinding inflate(LayoutInflater layoutInflater) {
        return PesdkRowPaymentUpiBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkRowPaymentUpiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_row_payment_upi;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkRowPaymentUpiBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


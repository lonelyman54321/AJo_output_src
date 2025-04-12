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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioCircularImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewExchangeReturnVerifyMainBinding
implements BC3 {
    public final AjioTextView btnSaveFullWidth;
    public final AjioLoaderView exReturnVerifyProgressView;
    public final LinearLayout exchangeItemsListActionbuttonLayout;
    public final AjioButton exchangeItemsListCancel;
    public final LinearLayout exchangeItemsListDisclaimerlayout;
    public final AjioButton exchangeItemsListRequestexchange;
    public final LinearLayout linearLayoutSubmitBackButton;
    private final ConstraintLayout rootView;
    public final AjioCircularImageView selectedIconExchange;
    public final AjioTextView selectedTv;

    private NewExchangeReturnVerifyMainBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioLoaderView ajioLoaderView, LinearLayout linearLayout, AjioButton ajioButton, LinearLayout linearLayout2, AjioButton ajioButton2, LinearLayout linearLayout3, AjioCircularImageView ajioCircularImageView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.btnSaveFullWidth = ajioTextView;
        this.exReturnVerifyProgressView = ajioLoaderView;
        this.exchangeItemsListActionbuttonLayout = linearLayout;
        this.exchangeItemsListCancel = ajioButton;
        this.exchangeItemsListDisclaimerlayout = linearLayout2;
        this.exchangeItemsListRequestexchange = ajioButton2;
        this.linearLayoutSubmitBackButton = linearLayout3;
        this.selectedIconExchange = ajioCircularImageView;
        this.selectedTv = ajioTextView2;
    }

    public static NewExchangeReturnVerifyMainBinding bind(View object) {
        View view;
        int n3 = R$id.btnSaveFullWidth;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.ex_return_verify_progressView;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioLoaderView)view;
            if (object3 != null) {
                n3 = R$id.exchange_items_list_actionbutton_layout;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (LinearLayout)view;
                if (view2 != null) {
                    n3 = R$id.exchange_items_list_cancel;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioButton)view;
                    if (object4 != null) {
                        n3 = R$id.exchange_items_list_disclaimerlayout;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (LinearLayout)view;
                        if (view3 != null) {
                            n3 = R$id.exchange_items_list_requestexchange;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (AjioButton)view;
                            if (object5 != null) {
                                n3 = R$id.linearLayout_submit_back_button;
                                View view4 = view = dd2_2.a(n3, object);
                                view4 = (LinearLayout)view;
                                if (view4 != null) {
                                    n3 = R$id.selected_icon_exchange;
                                    Object object6 = view = dd2_2.a(n3, object);
                                    object6 = (AjioCircularImageView)view;
                                    if (object6 != null) {
                                        n3 = R$id.selected_tv;
                                        Object object7 = view = dd2_2.a(n3, object);
                                        object7 = (AjioTextView)view;
                                        if (object7 != null) {
                                            Object object8 = object;
                                            object8 = (ConstraintLayout)((Object)object);
                                            NewExchangeReturnVerifyMainBinding newExchangeReturnVerifyMainBinding = new NewExchangeReturnVerifyMainBinding((ConstraintLayout)((Object)object8), (AjioTextView)object2, (AjioLoaderView)((Object)object3), (LinearLayout)view2, (AjioButton)object4, (LinearLayout)view3, (AjioButton)object5, (LinearLayout)view4, (AjioCircularImageView)((Object)object6), (AjioTextView)object7);
                                            return newExchangeReturnVerifyMainBinding;
                                        }
                                    }
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

    public static NewExchangeReturnVerifyMainBinding inflate(LayoutInflater layoutInflater) {
        return NewExchangeReturnVerifyMainBinding.inflate(layoutInflater, null, false);
    }

    public static NewExchangeReturnVerifyMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_exchange_return_verify_main;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewExchangeReturnVerifyMainBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


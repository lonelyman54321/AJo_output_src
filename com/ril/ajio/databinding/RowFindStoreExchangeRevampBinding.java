/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RadioButton
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowFindStoreExchangeRevampBinding
implements BC3 {
    public final ConstraintLayout clCard;
    public final View divider;
    public final LinearLayout findStoreLayoutLandmark;
    public final LinearLayout findStoreLayoutMobile;
    public final AjioTextView findStoreLblLandmark;
    public final AjioTextView findStoreLblMobile;
    public final RadioButton findStoreRbSelect;
    public final AjioTextView findStoreTvAddress;
    public final AjioTextView findStoreTvCod;
    public final AjioTextView findStoreTvLandmark;
    public final AjioTextView findStoreTvMobile;
    public final AjioTextView findStoreTvName;
    public final AjioTextView findStoreTvTiming;
    private final LinearLayout rootView;
    public final LinearLayout rowFindStore;

    private RowFindStoreExchangeRevampBinding(LinearLayout linearLayout, ConstraintLayout constraintLayout, View view, LinearLayout linearLayout2, LinearLayout linearLayout3, AjioTextView ajioTextView, AjioTextView ajioTextView2, RadioButton radioButton, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, LinearLayout linearLayout4) {
        this.rootView = linearLayout;
        this.clCard = constraintLayout;
        this.divider = view;
        this.findStoreLayoutLandmark = linearLayout2;
        this.findStoreLayoutMobile = linearLayout3;
        this.findStoreLblLandmark = ajioTextView;
        this.findStoreLblMobile = ajioTextView2;
        this.findStoreRbSelect = radioButton;
        this.findStoreTvAddress = ajioTextView3;
        this.findStoreTvCod = ajioTextView4;
        this.findStoreTvLandmark = ajioTextView5;
        this.findStoreTvMobile = ajioTextView6;
        this.findStoreTvName = ajioTextView7;
        this.findStoreTvTiming = ajioTextView8;
        this.rowFindStore = linearLayout4;
    }

    public static RowFindStoreExchangeRevampBinding bind(View view) {
        View view2;
        View view3;
        Object object = view;
        int n3 = R$id.clCard;
        Object object2 = view3 = dd2_2.a(n3, view);
        object2 = (ConstraintLayout)view3;
        if (object2 != null && (view2 = dd2_2.a(n3 = R$id.divider, view)) != null) {
            n3 = R$id.find_store_layout_landmark;
            View view4 = view3 = dd2_2.a(n3, view);
            view4 = (LinearLayout)view3;
            if (view4 != null) {
                n3 = R$id.find_store_layout_mobile;
                View view5 = view3 = dd2_2.a(n3, view);
                view5 = (LinearLayout)view3;
                if (view5 != null) {
                    n3 = R$id.find_store_lbl_landmark;
                    Object object3 = view3 = dd2_2.a(n3, view);
                    object3 = (AjioTextView)view3;
                    if (object3 != null) {
                        n3 = R$id.find_store_lbl_mobile;
                        Object object4 = view3 = dd2_2.a(n3, view);
                        object4 = (AjioTextView)view3;
                        if (object4 != null) {
                            n3 = R$id.find_store_rb_select;
                            View view6 = view3 = dd2_2.a(n3, view);
                            view6 = (RadioButton)view3;
                            if (view6 != null) {
                                n3 = R$id.find_store_tv_address;
                                Object object5 = view3 = dd2_2.a(n3, view);
                                object5 = (AjioTextView)view3;
                                if (object5 != null) {
                                    n3 = R$id.find_store_tv_cod;
                                    Object object6 = view3 = dd2_2.a(n3, view);
                                    object6 = (AjioTextView)view3;
                                    if (object6 != null) {
                                        n3 = R$id.find_store_tv_landmark;
                                        Object object7 = view3 = dd2_2.a(n3, view);
                                        object7 = (AjioTextView)view3;
                                        if (object7 != null) {
                                            n3 = R$id.find_store_tv_mobile;
                                            Object object8 = view3 = dd2_2.a(n3, view);
                                            object8 = (AjioTextView)view3;
                                            if (object8 != null) {
                                                n3 = R$id.find_store_tv_name;
                                                Object object9 = view3 = dd2_2.a(n3, view);
                                                object9 = (AjioTextView)view3;
                                                if (object9 != null) {
                                                    n3 = R$id.find_store_tv_timing;
                                                    Object object10 = view3 = dd2_2.a(n3, view);
                                                    object10 = (AjioTextView)view3;
                                                    if (object10 != null) {
                                                        View view7 = view;
                                                        view7 = (LinearLayout)view;
                                                        object = new RowFindStoreExchangeRevampBinding((LinearLayout)view7, (ConstraintLayout)((Object)object2), view2, (LinearLayout)view4, (LinearLayout)view5, (AjioTextView)object3, (AjioTextView)object4, (RadioButton)view6, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (LinearLayout)view7);
                                                        return object;
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

    public static RowFindStoreExchangeRevampBinding inflate(LayoutInflater layoutInflater) {
        return RowFindStoreExchangeRevampBinding.inflate(layoutInflater, null, false);
    }

    public static RowFindStoreExchangeRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_find_store_exchange_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowFindStoreExchangeRevampBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


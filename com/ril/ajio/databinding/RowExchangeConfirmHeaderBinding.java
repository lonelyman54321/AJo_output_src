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
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowExchangeConfirmHeaderBinding
implements BC3 {
    public final AjioAspectRatioImageView exchangeConfirmImage;
    public final AjioTextView exchangeConfirmTvId;
    public final AjioTextView exchangeConfirmTvMessage;
    public final AjioTextView exchangeConfirmTvType;
    public final AjioTextView infoTvVerificationProcess;
    public final LinearLayout layoutVerificationProcess;
    public final RelativeLayout rlReturnHeader;
    private final LinearLayout rootView;
    public final LinearLayout statusIdLl;

    private RowExchangeConfirmHeaderBinding(LinearLayout linearLayout, AjioAspectRatioImageView ajioAspectRatioImageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, LinearLayout linearLayout2, RelativeLayout relativeLayout, LinearLayout linearLayout3) {
        this.rootView = linearLayout;
        this.exchangeConfirmImage = ajioAspectRatioImageView;
        this.exchangeConfirmTvId = ajioTextView;
        this.exchangeConfirmTvMessage = ajioTextView2;
        this.exchangeConfirmTvType = ajioTextView3;
        this.infoTvVerificationProcess = ajioTextView4;
        this.layoutVerificationProcess = linearLayout2;
        this.rlReturnHeader = relativeLayout;
        this.statusIdLl = linearLayout3;
    }

    public static RowExchangeConfirmHeaderBinding bind(View object) {
        View view;
        int n3 = R$id.exchange_confirm_image;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioAspectRatioImageView)view;
        if (object2 != null) {
            n3 = R$id.exchange_confirm_tv_id;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.exchange_confirm_tv_message;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.exchange_confirm_tv_type;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.info_tv_verification_process;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.layout_verification_process;
                            View view2 = view = dd2_2.a(n3, object);
                            view2 = (LinearLayout)view;
                            if (view2 != null) {
                                n3 = R$id.rlReturnHeader;
                                View view3 = view = dd2_2.a(n3, object);
                                view3 = (RelativeLayout)view;
                                if (view3 != null) {
                                    n3 = R$id.status_id_ll;
                                    View view4 = view = dd2_2.a(n3, object);
                                    view4 = (LinearLayout)view;
                                    if (view4 != null) {
                                        Object object7 = object;
                                        object7 = (LinearLayout)object;
                                        RowExchangeConfirmHeaderBinding rowExchangeConfirmHeaderBinding = new RowExchangeConfirmHeaderBinding((LinearLayout)object7, (AjioAspectRatioImageView)((Object)object2), (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (LinearLayout)view2, (RelativeLayout)view3, (LinearLayout)view4);
                                        return rowExchangeConfirmHeaderBinding;
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

    public static RowExchangeConfirmHeaderBinding inflate(LayoutInflater layoutInflater) {
        return RowExchangeConfirmHeaderBinding.inflate(layoutInflater, null, false);
    }

    public static RowExchangeConfirmHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_exchange_confirm_header;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowExchangeConfirmHeaderBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


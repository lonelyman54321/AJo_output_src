/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PesdkLuxDialogInternalWalletBinding
implements BC3 {
    public final ImageView imvDialogClose;
    public final AjioTextView lblCash;
    public final AjioTextView lblPoint;
    private final LinearLayout rootView;
    public final AjioTextView tvAjioWalletBalanceValue;
    public final AjioTextView tvAjioWalletUsablePointsMessage;
    public final AjioTextView tvAjioWalletUsableTotalAmountValue;
    public final AjioTextView tvAjioWalletUsableTotalCashValue;
    public final AjioTextView tvAjioWalletUsableTotalPointsValue;
    public final AjioTextView tvOkay;

    private PesdkLuxDialogInternalWalletBinding(LinearLayout linearLayout, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8) {
        this.rootView = linearLayout;
        this.imvDialogClose = imageView;
        this.lblCash = ajioTextView;
        this.lblPoint = ajioTextView2;
        this.tvAjioWalletBalanceValue = ajioTextView3;
        this.tvAjioWalletUsablePointsMessage = ajioTextView4;
        this.tvAjioWalletUsableTotalAmountValue = ajioTextView5;
        this.tvAjioWalletUsableTotalCashValue = ajioTextView6;
        this.tvAjioWalletUsableTotalPointsValue = ajioTextView7;
        this.tvOkay = ajioTextView8;
    }

    public static PesdkLuxDialogInternalWalletBinding bind(View object) {
        View view;
        int n3 = R$id.imv_dialog_close;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.lbl_cash;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.lbl_point;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.tv_ajio_wallet_balance_value;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        n3 = R$id.tv_ajio_wallet_usable_points_message;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            n3 = R$id.tv_ajio_wallet_usable_total_amount_value;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                n3 = R$id.tv_ajio_wallet_usable_total_cash_value;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (AjioTextView)view;
                                if (object7 != null) {
                                    n3 = R$id.tv_ajio_wallet_usable_total_points_value;
                                    Object object8 = view = dd2_2.a(n3, object);
                                    object8 = (AjioTextView)view;
                                    if (object8 != null) {
                                        n3 = R$id.tvOkay;
                                        Object object9 = view = dd2_2.a(n3, object);
                                        object9 = (AjioTextView)view;
                                        if (object9 != null) {
                                            Object object10 = object;
                                            object10 = (LinearLayout)object;
                                            PesdkLuxDialogInternalWalletBinding pesdkLuxDialogInternalWalletBinding = new PesdkLuxDialogInternalWalletBinding((LinearLayout)object10, (ImageView)view2, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9);
                                            return pesdkLuxDialogInternalWalletBinding;
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

    public static PesdkLuxDialogInternalWalletBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxDialogInternalWalletBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxDialogInternalWalletBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_dialog_internal_wallet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxDialogInternalWalletBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


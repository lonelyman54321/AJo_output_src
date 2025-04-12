/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ImpsNotPossibleRevampBinding
implements BC3 {
    public final AjioTextView ajioCashAvlblTv;
    public final AjioTextView ajioCashToBeTransferTv;
    public final ConstraintLayout clImpsNotPossibleHeader;
    public final AjioTextView goToWallet;
    public final AjioImageView imvImpsNotPossible;
    private final ConstraintLayout rootView;
    public final AjioTextView tvImpsNotPossible;
    public final AjioTextView tvWalletBalanceLow;

    private ImpsNotPossibleRevampBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, ConstraintLayout constraintLayout2, AjioTextView ajioTextView3, AjioImageView ajioImageView, AjioTextView ajioTextView4, AjioTextView ajioTextView5) {
        this.rootView = constraintLayout;
        this.ajioCashAvlblTv = ajioTextView;
        this.ajioCashToBeTransferTv = ajioTextView2;
        this.clImpsNotPossibleHeader = constraintLayout2;
        this.goToWallet = ajioTextView3;
        this.imvImpsNotPossible = ajioImageView;
        this.tvImpsNotPossible = ajioTextView4;
        this.tvWalletBalanceLow = ajioTextView5;
    }

    public static ImpsNotPossibleRevampBinding bind(View object) {
        View view;
        int n3 = R$id.ajio_cash_avlbl_tv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.ajio_cash_to_be_transfer_tv;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.clImpsNotPossibleHeader;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (ConstraintLayout)view;
                if (object4 != null) {
                    n3 = R$id.go_to_wallet;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.imvImpsNotPossible;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioImageView)view;
                        if (object6 != null) {
                            n3 = R$id.tvImpsNotPossible;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                n3 = R$id.tvWalletBalanceLow;
                                Object object8 = view = dd2_2.a(n3, object);
                                object8 = (AjioTextView)view;
                                if (object8 != null) {
                                    Object object9 = object;
                                    object9 = (ConstraintLayout)((Object)object);
                                    ImpsNotPossibleRevampBinding impsNotPossibleRevampBinding = new ImpsNotPossibleRevampBinding((ConstraintLayout)((Object)object9), (AjioTextView)object2, (AjioTextView)object3, (ConstraintLayout)((Object)object4), (AjioTextView)object5, (AjioImageView)((Object)object6), (AjioTextView)object7, (AjioTextView)object8);
                                    return impsNotPossibleRevampBinding;
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

    public static ImpsNotPossibleRevampBinding inflate(LayoutInflater layoutInflater) {
        return ImpsNotPossibleRevampBinding.inflate(layoutInflater, null, false);
    }

    public static ImpsNotPossibleRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.imps_not_possible_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ImpsNotPossibleRevampBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


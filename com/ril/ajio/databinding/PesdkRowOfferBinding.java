/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PesdkRowOfferBinding
implements BC3 {
    public final ConstraintLayout offersParentContainer;
    private final ConstraintLayout rootView;
    public final ImageView rowOfferImvBankLogo;
    public final AjioTextView rowOfferLblTitle;
    public final AjioTextView rowOfferTvMoreOffer;
    public final AjioTextView rowOfferTvOfferDetail;

    private PesdkRowOfferBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = constraintLayout;
        this.offersParentContainer = constraintLayout2;
        this.rowOfferImvBankLogo = imageView;
        this.rowOfferLblTitle = ajioTextView;
        this.rowOfferTvMoreOffer = ajioTextView2;
        this.rowOfferTvOfferDetail = ajioTextView3;
    }

    public static PesdkRowOfferBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.row_offer_imv_bank_logo;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.row_offer_lbl_title;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.row_offer_tv_more_offer;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.row_offer_tv_offer_detail;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        Object object6 = object;
                        view = object2;
                        object = new PesdkRowOfferBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), (ImageView)view2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkRowOfferBinding inflate(LayoutInflater layoutInflater) {
        return PesdkRowOfferBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkRowOfferBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_row_offer;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkRowOfferBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


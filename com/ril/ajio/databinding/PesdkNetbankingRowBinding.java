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
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;

public final class PesdkNetbankingRowBinding
implements BC3 {
    public final ImageView itemViewImg;
    public final AjioTextView itemViewName;
    public final PesdkLoyaltyCardInfoView layoutLoyaltyCardInfo;
    public final LinearLayout nbProceedButton;
    public final AjioTextView nbProceedButtonTv;
    private final LinearLayout rootView;
    public final LinearLayout selectNetbankingLayout;

    private PesdkNetbankingRowBinding(LinearLayout linearLayout, ImageView imageView, AjioTextView ajioTextView, PesdkLoyaltyCardInfoView pesdkLoyaltyCardInfoView, LinearLayout linearLayout2, AjioTextView ajioTextView2, LinearLayout linearLayout3) {
        this.rootView = linearLayout;
        this.itemViewImg = imageView;
        this.itemViewName = ajioTextView;
        this.layoutLoyaltyCardInfo = pesdkLoyaltyCardInfoView;
        this.nbProceedButton = linearLayout2;
        this.nbProceedButtonTv = ajioTextView2;
        this.selectNetbankingLayout = linearLayout3;
    }

    public static PesdkNetbankingRowBinding bind(View object) {
        View view;
        int n3 = R$id.item_view_img;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.item_view_name;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.layout_loyaltyCardInfo;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (PesdkLoyaltyCardInfoView)view;
                if (object3 != null) {
                    n3 = R$id.nb_proceed_button;
                    View view3 = view = dd2_2.a(n3, object);
                    view3 = (LinearLayout)view;
                    if (view3 != null) {
                        n3 = R$id.nb_proceed_button_tv;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            n3 = R$id.select_netbanking_layout;
                            View view4 = view = dd2_2.a(n3, object);
                            view4 = (LinearLayout)view;
                            if (view4 != null) {
                                Object object5 = object;
                                object5 = (LinearLayout)object;
                                PesdkNetbankingRowBinding pesdkNetbankingRowBinding = new PesdkNetbankingRowBinding((LinearLayout)object5, (ImageView)view2, (AjioTextView)object2, (PesdkLoyaltyCardInfoView)((Object)object3), (LinearLayout)view3, (AjioTextView)object4, (LinearLayout)view4);
                                return pesdkNetbankingRowBinding;
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

    public static PesdkNetbankingRowBinding inflate(LayoutInflater layoutInflater) {
        return PesdkNetbankingRowBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkNetbankingRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_netbanking_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkNetbankingRowBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


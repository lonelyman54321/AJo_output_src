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

public final class PesdkListRowUpiBinding
implements BC3 {
    public final ImageView imgUpi;
    public final PesdkLoyaltyCardInfoView layoutLoyaltyCardInfo;
    public final LinearLayout peCardDetailParent;
    public final AjioTextView proceedBtnTxt;
    private final LinearLayout rootView;
    public final View space;
    public final AjioTextView tvUpi;

    private PesdkListRowUpiBinding(LinearLayout linearLayout, ImageView imageView, PesdkLoyaltyCardInfoView pesdkLoyaltyCardInfoView, LinearLayout linearLayout2, AjioTextView ajioTextView, View view, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.imgUpi = imageView;
        this.layoutLoyaltyCardInfo = pesdkLoyaltyCardInfoView;
        this.peCardDetailParent = linearLayout2;
        this.proceedBtnTxt = ajioTextView;
        this.space = view;
        this.tvUpi = ajioTextView2;
    }

    public static PesdkListRowUpiBinding bind(View object) {
        View view;
        int n3 = R$id.img_upi;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.layout_loyaltyCardInfo;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (PesdkLoyaltyCardInfoView)view;
            if (object2 != null) {
                View view3;
                Object object3 = object;
                object3 = (LinearLayout)object;
                n3 = R$id.proceed_btn_txt;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null && (view3 = dd2_2.a(n3 = R$id.space, object)) != null) {
                    n3 = R$id.tv_upi;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        object = new PesdkListRowUpiBinding((LinearLayout)object3, (ImageView)view2, (PesdkLoyaltyCardInfoView)((Object)object2), (LinearLayout)object3, (AjioTextView)object4, view3, (AjioTextView)object5);
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

    public static PesdkListRowUpiBinding inflate(LayoutInflater layoutInflater) {
        return PesdkListRowUpiBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkListRowUpiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_list_row_upi;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkListRowUpiBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


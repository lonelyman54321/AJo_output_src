/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;

public final class LuxeSaleInfoPopupBinding
implements BC3 {
    public final AjioAspectRatioImageView closeSalePopup;
    private final LinearLayoutCompat rootView;
    public final ImageView saleStarImg;
    public final TextView saleStartTv;
    public final LottieAnimationView showPriceAnim;
    public final TextView topInfoTv;
    public final TextView wishlistYourProduct;

    private LuxeSaleInfoPopupBinding(LinearLayoutCompat linearLayoutCompat, AjioAspectRatioImageView ajioAspectRatioImageView, ImageView imageView, TextView textView, LottieAnimationView lottieAnimationView, TextView textView2, TextView textView3) {
        this.rootView = linearLayoutCompat;
        this.closeSalePopup = ajioAspectRatioImageView;
        this.saleStarImg = imageView;
        this.saleStartTv = textView;
        this.showPriceAnim = lottieAnimationView;
        this.topInfoTv = textView2;
        this.wishlistYourProduct = textView3;
    }

    public static LuxeSaleInfoPopupBinding bind(View object) {
        View view;
        int n3 = R$id.close_sale_popup;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioAspectRatioImageView)view;
        if (object2 != null) {
            n3 = R$id.sale_star_img;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.sale_start_tv;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (TextView)view;
                if (view3 != null) {
                    n3 = R$id.show_price_anim;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (LottieAnimationView)view;
                    if (object3 != null) {
                        n3 = R$id.top_info_tv;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (TextView)view;
                        if (view4 != null) {
                            n3 = R$id.wishlist_your_product;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (TextView)view;
                            if (view5 != null) {
                                Object object4 = object;
                                object4 = (LinearLayoutCompat)((Object)object);
                                LuxeSaleInfoPopupBinding luxeSaleInfoPopupBinding = new LuxeSaleInfoPopupBinding((LinearLayoutCompat)((Object)object4), (AjioAspectRatioImageView)((Object)object2), (ImageView)view2, (TextView)view3, (LottieAnimationView)((Object)object3), (TextView)view4, (TextView)view5);
                                return luxeSaleInfoPopupBinding;
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

    public static LuxeSaleInfoPopupBinding inflate(LayoutInflater layoutInflater) {
        return LuxeSaleInfoPopupBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeSaleInfoPopupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_sale_info_popup;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeSaleInfoPopupBinding.bind((View)layoutInflater);
    }

    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}


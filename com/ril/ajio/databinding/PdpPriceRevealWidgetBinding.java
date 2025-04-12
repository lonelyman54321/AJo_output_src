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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PdpPriceRevealWidgetBinding
implements BC3 {
    public final ImageView prBgIv;
    public final TextView prDiscount;
    public final TextView prInfo;
    public final ConstraintLayout prParent;
    public final TextView prPrice;
    public final TextView prTitle;
    public final TextView revealPriceBtn;
    private final ConstraintLayout rootView;
    public final TextView saleInfo;
    public final LottieAnimationView showPriceAnim;

    private PdpPriceRevealWidgetBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, LottieAnimationView lottieAnimationView) {
        this.rootView = constraintLayout;
        this.prBgIv = imageView;
        this.prDiscount = textView;
        this.prInfo = textView2;
        this.prParent = constraintLayout2;
        this.prPrice = textView3;
        this.prTitle = textView4;
        this.revealPriceBtn = textView5;
        this.saleInfo = textView6;
        this.showPriceAnim = lottieAnimationView;
    }

    public static PdpPriceRevealWidgetBinding bind(View object) {
        View view;
        int n3 = R$id.prBgIv;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.prDiscount;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.prInfo;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    Object object2 = object;
                    object2 = (ConstraintLayout)((Object)object);
                    n3 = R$id.prPrice;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        n3 = R$id.prTitle;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (TextView)view;
                        if (view6 != null) {
                            n3 = R$id.revealPriceBtn;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (TextView)view;
                            if (view7 != null) {
                                n3 = R$id.saleInfo;
                                View view8 = view = dd2_2.a(n3, object);
                                view8 = (TextView)view;
                                if (view8 != null) {
                                    n3 = R$id.show_price_anim;
                                    Object object3 = view = dd2_2.a(n3, object);
                                    object3 = (LottieAnimationView)view;
                                    if (object3 != null) {
                                        object = new PdpPriceRevealWidgetBinding((ConstraintLayout)((Object)object2), (ImageView)view2, (TextView)view3, (TextView)view4, (ConstraintLayout)((Object)object2), (TextView)view5, (TextView)view6, (TextView)view7, (TextView)view8, (LottieAnimationView)((Object)object3));
                                        return object;
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

    public static PdpPriceRevealWidgetBinding inflate(LayoutInflater layoutInflater) {
        return PdpPriceRevealWidgetBinding.inflate(layoutInflater, null, false);
    }

    public static PdpPriceRevealWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_price_reveal_widget;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpPriceRevealWidgetBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


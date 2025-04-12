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
import com.ril.ajio.customviews.widgets.LuxeUnderLineTextView;

public final class LuxePdpPriceRevealWidgetBinding
implements BC3 {
    public final ImageView prBgIv;
    public final TextView prDiscount;
    public final TextView prInfo;
    public final ConstraintLayout prParent;
    public final TextView prPrice;
    public final TextView prTitle;
    public final TextView revealPriceBtn;
    private final ConstraintLayout rootView;
    public final LuxeUnderLineTextView saleInfo;
    public final LottieAnimationView showPriceAnim;

    private LuxePdpPriceRevealWidgetBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, TextView textView3, TextView textView4, TextView textView5, LuxeUnderLineTextView luxeUnderLineTextView, LottieAnimationView lottieAnimationView) {
        this.rootView = constraintLayout;
        this.prBgIv = imageView;
        this.prDiscount = textView;
        this.prInfo = textView2;
        this.prParent = constraintLayout2;
        this.prPrice = textView3;
        this.prTitle = textView4;
        this.revealPriceBtn = textView5;
        this.saleInfo = luxeUnderLineTextView;
        this.showPriceAnim = lottieAnimationView;
    }

    public static LuxePdpPriceRevealWidgetBinding bind(View object) {
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
                                Object object3 = view = dd2_2.a(n3, object);
                                object3 = (LuxeUnderLineTextView)view;
                                if (object3 != null) {
                                    n3 = R$id.show_price_anim;
                                    Object object4 = view = dd2_2.a(n3, object);
                                    object4 = (LottieAnimationView)view;
                                    if (object4 != null) {
                                        object = new LuxePdpPriceRevealWidgetBinding((ConstraintLayout)((Object)object2), (ImageView)view2, (TextView)view3, (TextView)view4, (ConstraintLayout)((Object)object2), (TextView)view5, (TextView)view6, (TextView)view7, (LuxeUnderLineTextView)object3, (LottieAnimationView)((Object)object4));
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

    public static LuxePdpPriceRevealWidgetBinding inflate(LayoutInflater layoutInflater) {
        return LuxePdpPriceRevealWidgetBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePdpPriceRevealWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_pdp_price_reveal_widget;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePdpPriceRevealWidgetBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


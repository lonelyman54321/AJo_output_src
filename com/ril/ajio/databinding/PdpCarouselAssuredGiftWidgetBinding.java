/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PdpCarouselAssuredGiftWidgetBinding
implements BC3 {
    public final AppCompatImageView icSpcAssuredGift;
    public final TextView idOsViewGifts;
    public final TextView idPdpGiftDetails;
    public final TextView idPdpGiftTitle;
    public final LottieAnimationView pdpAssuredGiftAnim;
    private final FrameLayout rootView;
    public final ConstraintLayout rwParent;

    private PdpCarouselAssuredGiftWidgetBinding(FrameLayout frameLayout, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextView textView3, LottieAnimationView lottieAnimationView, ConstraintLayout constraintLayout) {
        this.rootView = frameLayout;
        this.icSpcAssuredGift = appCompatImageView;
        this.idOsViewGifts = textView;
        this.idPdpGiftDetails = textView2;
        this.idPdpGiftTitle = textView3;
        this.pdpAssuredGiftAnim = lottieAnimationView;
        this.rwParent = constraintLayout;
    }

    public static PdpCarouselAssuredGiftWidgetBinding bind(View object) {
        View view;
        int n3 = R$id.ic_spc_assured_gift;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view;
        if (object2 != null) {
            n3 = R$id.id_os_view_gifts;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (TextView)view;
            if (view2 != null) {
                n3 = R$id.id_pdp_gift_details;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (TextView)view;
                if (view3 != null) {
                    n3 = R$id.id_pdp_gift_title;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        n3 = R$id.pdp_assured_gift_anim;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (LottieAnimationView)view;
                        if (object3 != null) {
                            n3 = R$id.rw_parent;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (ConstraintLayout)view;
                            if (object4 != null) {
                                Object object5 = object;
                                object5 = (FrameLayout)object;
                                PdpCarouselAssuredGiftWidgetBinding pdpCarouselAssuredGiftWidgetBinding = new PdpCarouselAssuredGiftWidgetBinding((FrameLayout)object5, (AppCompatImageView)((Object)object2), (TextView)view2, (TextView)view3, (TextView)view4, (LottieAnimationView)((Object)object3), (ConstraintLayout)((Object)object4));
                                return pdpCarouselAssuredGiftWidgetBinding;
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

    public static PdpCarouselAssuredGiftWidgetBinding inflate(LayoutInflater layoutInflater) {
        return PdpCarouselAssuredGiftWidgetBinding.inflate(layoutInflater, null, false);
    }

    public static PdpCarouselAssuredGiftWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_carousel_assured_gift_widget;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpCarouselAssuredGiftWidgetBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioEllipsisTextView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxePdpBrandDescBinding
implements BC3 {
    public final AppCompatImageView brandDescLogoIv;
    public final AjioTextView brandDescTitleTv;
    public final AjioEllipsisTextView brandDescTv;
    public final AjioTextView descReadMoreTv;
    public final CardView logoCardView;
    private final LinearLayout rootView;

    private LuxePdpBrandDescBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AjioTextView ajioTextView, AjioEllipsisTextView ajioEllipsisTextView, AjioTextView ajioTextView2, CardView cardView) {
        this.rootView = linearLayout;
        this.brandDescLogoIv = appCompatImageView;
        this.brandDescTitleTv = ajioTextView;
        this.brandDescTv = ajioEllipsisTextView;
        this.descReadMoreTv = ajioTextView2;
        this.logoCardView = cardView;
    }

    public static LuxePdpBrandDescBinding bind(View object) {
        View view;
        int n3 = R$id.brand_desc_logo_iv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view;
        if (object2 != null) {
            n3 = R$id.brand_desc_title_tv;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.brand_desc_tv;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioEllipsisTextView)view;
                if (object4 != null) {
                    n3 = R$id.desc_read_more_tv;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.logo_card_view;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (CardView)view;
                        if (object6 != null) {
                            Object object7 = object;
                            object7 = (LinearLayout)object;
                            LuxePdpBrandDescBinding luxePdpBrandDescBinding = new LuxePdpBrandDescBinding((LinearLayout)object7, (AppCompatImageView)((Object)object2), (AjioTextView)object3, (AjioEllipsisTextView)object4, (AjioTextView)object5, (CardView)((Object)object6));
                            return luxePdpBrandDescBinding;
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

    public static LuxePdpBrandDescBinding inflate(LayoutInflater layoutInflater) {
        return LuxePdpBrandDescBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePdpBrandDescBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_pdp_brand_desc;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePdpBrandDescBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


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

public final class PdpBrandDescBinding
implements BC3 {
    public final View brandDescDivider;
    public final AppCompatImageView brandDescLogoIv;
    public final AjioTextView brandDescTitleTv;
    public final AjioEllipsisTextView brandDescTv;
    public final AjioTextView descReadMoreTv;
    public final CardView logoCardView;
    private final LinearLayout rootView;

    private PdpBrandDescBinding(LinearLayout linearLayout, View view, AppCompatImageView appCompatImageView, AjioTextView ajioTextView, AjioEllipsisTextView ajioEllipsisTextView, AjioTextView ajioTextView2, CardView cardView) {
        this.rootView = linearLayout;
        this.brandDescDivider = view;
        this.brandDescLogoIv = appCompatImageView;
        this.brandDescTitleTv = ajioTextView;
        this.brandDescTv = ajioEllipsisTextView;
        this.descReadMoreTv = ajioTextView2;
        this.logoCardView = cardView;
    }

    public static PdpBrandDescBinding bind(View object) {
        int n3 = R$id.brand_desc_divider;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            Object object2;
            n3 = R$id.brand_desc_logo_iv;
            Object object3 = object2 = dd2_2.a(n3, object);
            object3 = (AppCompatImageView)((Object)object2);
            if (object3 != null) {
                n3 = R$id.brand_desc_title_tv;
                Object object4 = object2 = dd2_2.a(n3, object);
                object4 = (AjioTextView)object2;
                if (object4 != null) {
                    n3 = R$id.brand_desc_tv;
                    Object object5 = object2 = dd2_2.a(n3, object);
                    object5 = (AjioEllipsisTextView)object2;
                    if (object5 != null) {
                        n3 = R$id.desc_read_more_tv;
                        Object object6 = object2 = dd2_2.a(n3, object);
                        object6 = (AjioTextView)object2;
                        if (object6 != null) {
                            n3 = R$id.logo_card_view;
                            Object object7 = object2 = dd2_2.a(n3, object);
                            object7 = (CardView)((Object)object2);
                            if (object7 != null) {
                                PdpBrandDescBinding pdpBrandDescBinding;
                                Object object8 = object;
                                object8 = (LinearLayout)object;
                                object2 = pdpBrandDescBinding;
                                pdpBrandDescBinding = new PdpBrandDescBinding((LinearLayout)object8, view, (AppCompatImageView)((Object)object3), (AjioTextView)object4, (AjioEllipsisTextView)object5, (AjioTextView)object6, (CardView)((Object)object7));
                                return pdpBrandDescBinding;
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

    public static PdpBrandDescBinding inflate(LayoutInflater layoutInflater) {
        return PdpBrandDescBinding.inflate(layoutInflater, null, false);
    }

    public static PdpBrandDescBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_brand_desc;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpBrandDescBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


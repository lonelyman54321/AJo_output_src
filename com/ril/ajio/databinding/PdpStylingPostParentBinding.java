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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;

public final class PdpStylingPostParentBinding
implements BC3 {
    public final ConstraintLayout constraintProductView;
    public final ImageView ivBag;
    public final AjioRoundedCornerImageView ivStylingPost;
    private final ConstraintLayout rootView;
    public final CardView stylingCardView;
    public final ConstraintLayout stylingImageView;
    public final TextView txtProductCount;

    private PdpStylingPostParentBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, AjioRoundedCornerImageView ajioRoundedCornerImageView, CardView cardView, ConstraintLayout constraintLayout3, TextView textView) {
        this.rootView = constraintLayout;
        this.constraintProductView = constraintLayout2;
        this.ivBag = imageView;
        this.ivStylingPost = ajioRoundedCornerImageView;
        this.stylingCardView = cardView;
        this.stylingImageView = constraintLayout3;
        this.txtProductCount = textView;
    }

    public static PdpStylingPostParentBinding bind(View object) {
        View view;
        int n3 = R$id.constraint_product_view;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (ConstraintLayout)view;
        if (object2 != null) {
            n3 = R$id.iv_bag;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.iv_styling_post;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioRoundedCornerImageView)view;
                if (object3 != null) {
                    n3 = R$id.styling_card_view;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (CardView)view;
                    if (object4 != null) {
                        n3 = R$id.styling_image_view;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (ConstraintLayout)view;
                        if (object5 != null) {
                            n3 = R$id.txt_product_count;
                            View view3 = view = dd2_2.a(n3, object);
                            view3 = (TextView)view;
                            if (view3 != null) {
                                Object object6 = object;
                                object6 = (ConstraintLayout)((Object)object);
                                PdpStylingPostParentBinding pdpStylingPostParentBinding = new PdpStylingPostParentBinding((ConstraintLayout)((Object)object6), (ConstraintLayout)((Object)object2), (ImageView)view2, (AjioRoundedCornerImageView)((Object)object3), (CardView)((Object)object4), (ConstraintLayout)((Object)object5), (TextView)view3);
                                return pdpStylingPostParentBinding;
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

    public static PdpStylingPostParentBinding inflate(LayoutInflater layoutInflater) {
        return PdpStylingPostParentBinding.inflate(layoutInflater, null, false);
    }

    public static PdpStylingPostParentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_styling_post_parent;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpStylingPostParentBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


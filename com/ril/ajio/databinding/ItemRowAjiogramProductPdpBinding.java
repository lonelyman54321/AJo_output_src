/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;

public final class ItemRowAjiogramProductPdpBinding
implements BC3 {
    public final ConstraintLayout ajiogramProductsLayout;
    public final AjioRoundedCornerImageView iv1;
    public final AjioRoundedCornerImageView iv2;
    public final AjioRoundedCornerImageView iv3;
    public final AjioRoundedCornerImageView iv4;
    public final AjioRoundedCornerImageView iv5;
    private final ConstraintLayout rootView;

    private ItemRowAjiogramProductPdpBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AjioRoundedCornerImageView ajioRoundedCornerImageView, AjioRoundedCornerImageView ajioRoundedCornerImageView2, AjioRoundedCornerImageView ajioRoundedCornerImageView3, AjioRoundedCornerImageView ajioRoundedCornerImageView4, AjioRoundedCornerImageView ajioRoundedCornerImageView5) {
        this.rootView = constraintLayout;
        this.ajiogramProductsLayout = constraintLayout2;
        this.iv1 = ajioRoundedCornerImageView;
        this.iv2 = ajioRoundedCornerImageView2;
        this.iv3 = ajioRoundedCornerImageView3;
        this.iv4 = ajioRoundedCornerImageView4;
        this.iv5 = ajioRoundedCornerImageView5;
    }

    public static ItemRowAjiogramProductPdpBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.iv_1;
        Object object3 = view = dd2_2.a(n3, object);
        object3 = (AjioRoundedCornerImageView)view;
        if (object3 != null) {
            n3 = R$id.iv_2;
            Object object4 = view = dd2_2.a(n3, object);
            object4 = (AjioRoundedCornerImageView)view;
            if (object4 != null) {
                n3 = R$id.iv_3;
                Object object5 = view = dd2_2.a(n3, object);
                object5 = (AjioRoundedCornerImageView)view;
                if (object5 != null) {
                    n3 = R$id.iv_4;
                    Object object6 = view = dd2_2.a(n3, object);
                    object6 = (AjioRoundedCornerImageView)view;
                    if (object6 != null) {
                        n3 = R$id.iv_5;
                        Object object7 = view = dd2_2.a(n3, object);
                        object7 = (AjioRoundedCornerImageView)view;
                        if (object7 != null) {
                            Object object8 = object;
                            view = object2;
                            object = new ItemRowAjiogramProductPdpBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), (AjioRoundedCornerImageView)((Object)object3), (AjioRoundedCornerImageView)((Object)object4), (AjioRoundedCornerImageView)((Object)object5), (AjioRoundedCornerImageView)((Object)object6), (AjioRoundedCornerImageView)((Object)object7));
                            return object;
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

    public static ItemRowAjiogramProductPdpBinding inflate(LayoutInflater layoutInflater) {
        return ItemRowAjiogramProductPdpBinding.inflate(layoutInflater, null, false);
    }

    public static ItemRowAjiogramProductPdpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_row_ajiogram_product_pdp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemRowAjiogramProductPdpBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.FreebieFreeTagBinding;

public final class PdpFreebieProductItemBinding
implements BC3 {
    public final FreebieFreeTagBinding freeTag;
    public final ImageView productImage;
    public final AjioTextView productName;
    public final AjioTextView productPrice;
    public final AjioTextView quantityLabel;
    public final AjioTextView returnLabel;
    private final ConstraintLayout rootView;

    private PdpFreebieProductItemBinding(ConstraintLayout constraintLayout, FreebieFreeTagBinding freebieFreeTagBinding, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4) {
        this.rootView = constraintLayout;
        this.freeTag = freebieFreeTagBinding;
        this.productImage = imageView;
        this.productName = ajioTextView;
        this.productPrice = ajioTextView2;
        this.quantityLabel = ajioTextView3;
        this.returnLabel = ajioTextView4;
    }

    public static PdpFreebieProductItemBinding bind(View object) {
        int n3 = R$id.free_tag;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            FreebieFreeTagBinding freebieFreeTagBinding = FreebieFreeTagBinding.bind(view);
            n3 = R$id.productImage;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.productName;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioTextView)view;
                if (object2 != null) {
                    n3 = R$id.productPrice;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        n3 = R$id.quantityLabel;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            n3 = R$id.returnLabel;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (AjioTextView)view;
                            if (object5 != null) {
                                Object object6 = object;
                                object6 = (ConstraintLayout)((Object)object);
                                PdpFreebieProductItemBinding pdpFreebieProductItemBinding = new PdpFreebieProductItemBinding((ConstraintLayout)((Object)object6), freebieFreeTagBinding, (ImageView)view2, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5);
                                return pdpFreebieProductItemBinding;
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

    public static PdpFreebieProductItemBinding inflate(LayoutInflater layoutInflater) {
        return PdpFreebieProductItemBinding.inflate(layoutInflater, null, false);
    }

    public static PdpFreebieProductItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_freebie_product_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpFreebieProductItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


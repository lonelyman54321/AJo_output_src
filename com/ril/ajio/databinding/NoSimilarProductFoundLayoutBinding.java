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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NoSimilarProductFoundLayoutBinding
implements BC3 {
    public final AjioTextView ajioTextView;
    public final CardView cardView;
    public final AjioTextView errorMessageTv;
    public final AjioTextView errorTitleTv;
    public final AjioTextView okayBtn;
    public final ConstraintLayout parentLayout;
    public final AjioTextView productBrandName;
    public final ImageView productImg;
    private final CardView rootView;

    private NoSimilarProductFoundLayoutBinding(CardView cardView, AjioTextView ajioTextView, CardView cardView2, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, ConstraintLayout constraintLayout, AjioTextView ajioTextView5, ImageView imageView) {
        this.rootView = cardView;
        this.ajioTextView = ajioTextView;
        this.cardView = cardView2;
        this.errorMessageTv = ajioTextView2;
        this.errorTitleTv = ajioTextView3;
        this.okayBtn = ajioTextView4;
        this.parentLayout = constraintLayout;
        this.productBrandName = ajioTextView5;
        this.productImg = imageView;
    }

    public static NoSimilarProductFoundLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.ajioTextView;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            Object object3 = object;
            object3 = (CardView)((Object)object);
            n3 = R$id.errorMessageTv;
            Object object4 = view = dd2_2.a(n3, object);
            object4 = (AjioTextView)view;
            if (object4 != null) {
                n3 = R$id.errorTitleTv;
                Object object5 = view = dd2_2.a(n3, object);
                object5 = (AjioTextView)view;
                if (object5 != null) {
                    n3 = R$id.okayBtn;
                    Object object6 = view = dd2_2.a(n3, object);
                    object6 = (AjioTextView)view;
                    if (object6 != null) {
                        n3 = R$id.parent_layout;
                        Object object7 = view = dd2_2.a(n3, object);
                        object7 = (ConstraintLayout)view;
                        if (object7 != null) {
                            n3 = R$id.productBrandName;
                            Object object8 = view = dd2_2.a(n3, object);
                            object8 = (AjioTextView)view;
                            if (object8 != null) {
                                n3 = R$id.productImg;
                                View view2 = view = dd2_2.a(n3, object);
                                view2 = (ImageView)view;
                                if (view2 != null) {
                                    object = new NoSimilarProductFoundLayoutBinding((CardView)((Object)object3), (AjioTextView)object2, (CardView)((Object)object3), (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (ConstraintLayout)((Object)object7), (AjioTextView)object8, (ImageView)view2);
                                    return object;
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

    public static NoSimilarProductFoundLayoutBinding inflate(LayoutInflater layoutInflater) {
        return NoSimilarProductFoundLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static NoSimilarProductFoundLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.no_similar_product_found_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NoSimilarProductFoundLayoutBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}


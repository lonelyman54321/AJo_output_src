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
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class IfscInfoLayoutBinding
implements BC3 {
    public final AjioAspectRatioImageView closeButton;
    public final AjioTextView ifscDesc;
    public final ImageView ifscImg;
    public final AjioTextView or;
    public final ConstraintLayout parentLayout;
    private final ConstraintLayout rootView;
    public final AjioTextView tvFindIfsc;
    public final AjioTextView whatIsIfsc;

    private IfscInfoLayoutBinding(ConstraintLayout constraintLayout, AjioAspectRatioImageView ajioAspectRatioImageView, AjioTextView ajioTextView, ImageView imageView, AjioTextView ajioTextView2, ConstraintLayout constraintLayout2, AjioTextView ajioTextView3, AjioTextView ajioTextView4) {
        this.rootView = constraintLayout;
        this.closeButton = ajioAspectRatioImageView;
        this.ifscDesc = ajioTextView;
        this.ifscImg = imageView;
        this.or = ajioTextView2;
        this.parentLayout = constraintLayout2;
        this.tvFindIfsc = ajioTextView3;
        this.whatIsIfsc = ajioTextView4;
    }

    public static IfscInfoLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.close_button;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioAspectRatioImageView)view;
        if (object2 != null) {
            n3 = R$id.ifsc_desc;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.ifsc_img;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (ImageView)view;
                if (view2 != null) {
                    n3 = R$id.or;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        Object object5 = object;
                        object5 = (ConstraintLayout)((Object)object);
                        n3 = R$id.tv_find_ifsc;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.what_is_ifsc;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                object = new IfscInfoLayoutBinding((ConstraintLayout)((Object)object5), (AjioAspectRatioImageView)((Object)object2), (AjioTextView)object3, (ImageView)view2, (AjioTextView)object4, (ConstraintLayout)((Object)object5), (AjioTextView)object6, (AjioTextView)object7);
                                return object;
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

    public static IfscInfoLayoutBinding inflate(LayoutInflater layoutInflater) {
        return IfscInfoLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static IfscInfoLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.ifsc_info_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IfscInfoLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


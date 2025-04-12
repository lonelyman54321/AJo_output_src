/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutImageUploadErrorPlpBinding
implements BC3 {
    public final Button btnUploadedImageAction;
    public final CardView cvUploadedImageContainer;
    public final ImageView ivUploadedImage;
    private final ConstraintLayout rootView;
    public final TextView tvMessage;

    private LayoutImageUploadErrorPlpBinding(ConstraintLayout constraintLayout, Button button, CardView cardView, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.btnUploadedImageAction = button;
        this.cvUploadedImageContainer = cardView;
        this.ivUploadedImage = imageView;
        this.tvMessage = textView;
    }

    public static LayoutImageUploadErrorPlpBinding bind(View object) {
        View view;
        int n3 = R$id.btn_uploaded_image_action;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (Button)view;
        if (view2 != null) {
            n3 = R$id.cv_uploaded_image_container;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (CardView)view;
            if (object2 != null) {
                n3 = R$id.iv_uploaded_image;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (ImageView)view;
                if (view3 != null) {
                    n3 = R$id.tv_message;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        Object object3 = object;
                        object3 = (ConstraintLayout)((Object)object);
                        LayoutImageUploadErrorPlpBinding layoutImageUploadErrorPlpBinding = new LayoutImageUploadErrorPlpBinding((ConstraintLayout)((Object)object3), (Button)view2, (CardView)((Object)object2), (ImageView)view3, (TextView)view4);
                        return layoutImageUploadErrorPlpBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutImageUploadErrorPlpBinding inflate(LayoutInflater layoutInflater) {
        return LayoutImageUploadErrorPlpBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutImageUploadErrorPlpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_image_upload_error_plp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutImageUploadErrorPlpBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


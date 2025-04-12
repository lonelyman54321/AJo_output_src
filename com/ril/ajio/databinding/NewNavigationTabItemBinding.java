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
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewNavigationTabItemBinding
implements BC3 {
    public final AjioImageView categoryImg;
    public final AjioTextView categoryLabel;
    private final ConstraintLayout rootView;

    private NewNavigationTabItemBinding(ConstraintLayout constraintLayout, AjioImageView ajioImageView, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.categoryImg = ajioImageView;
        this.categoryLabel = ajioTextView;
    }

    public static NewNavigationTabItemBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.category_img;
        AjioImageView ajioImageView = (AjioImageView)dd2_2.a(n3, object);
        if (ajioImageView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.category_label, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            NewNavigationTabItemBinding newNavigationTabItemBinding = new NewNavigationTabItemBinding((ConstraintLayout)((Object)object), ajioImageView, ajioTextView);
            return newNavigationTabItemBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewNavigationTabItemBinding inflate(LayoutInflater layoutInflater) {
        return NewNavigationTabItemBinding.inflate(layoutInflater, null, false);
    }

    public static NewNavigationTabItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_navigation_tab_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewNavigationTabItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


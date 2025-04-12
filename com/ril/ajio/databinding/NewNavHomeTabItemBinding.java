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

public final class NewNavHomeTabItemBinding
implements BC3 {
    public final AjioImageView categoryImg;
    private final ConstraintLayout rootView;

    private NewNavHomeTabItemBinding(ConstraintLayout constraintLayout, AjioImageView ajioImageView) {
        this.rootView = constraintLayout;
        this.categoryImg = ajioImageView;
    }

    public static NewNavHomeTabItemBinding bind(View object) {
        int n3 = R$id.category_img;
        AjioImageView ajioImageView = (AjioImageView)dd2_2.a(n3, object);
        if (ajioImageView != null) {
            object = (ConstraintLayout)((Object)object);
            NewNavHomeTabItemBinding newNavHomeTabItemBinding = new NewNavHomeTabItemBinding((ConstraintLayout)((Object)object), ajioImageView);
            return newNavHomeTabItemBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewNavHomeTabItemBinding inflate(LayoutInflater layoutInflater) {
        return NewNavHomeTabItemBinding.inflate(layoutInflater, null, false);
    }

    public static NewNavHomeTabItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_nav_home_tab_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewNavHomeTabItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


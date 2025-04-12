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
import com.ril.ajio.databinding.NewPdpEddLayoutBinding;
import com.ril.ajio.databinding.NewPdpEddLayoutNewBinding;

public final class EddLayoutAjioBinding
implements BC3 {
    public final NewPdpEddLayoutBinding eddLayout;
    public final NewPdpEddLayoutNewBinding eddLayoutNew;
    private final ConstraintLayout rootView;

    private EddLayoutAjioBinding(ConstraintLayout constraintLayout, NewPdpEddLayoutBinding newPdpEddLayoutBinding, NewPdpEddLayoutNewBinding newPdpEddLayoutNewBinding) {
        this.rootView = constraintLayout;
        this.eddLayout = newPdpEddLayoutBinding;
        this.eddLayoutNew = newPdpEddLayoutNewBinding;
    }

    public static EddLayoutAjioBinding bind(View object) {
        Object object2;
        int n3 = R$id.edd_layout;
        Object object3 = dd2_2.a(n3, object);
        if (object3 != null) {
            object2 = NewPdpEddLayoutBinding.bind(object3);
            int n4 = R$id.edd_layout_new;
            Object object4 = dd2_2.a(n4, object);
            if (object4 != null) {
                object3 = NewPdpEddLayoutNewBinding.bind(object4);
                object = (ConstraintLayout)((Object)object);
                object4 = new EddLayoutAjioBinding((ConstraintLayout)((Object)object), (NewPdpEddLayoutBinding)object2, (NewPdpEddLayoutNewBinding)object3);
                return object4;
            }
            n3 = n4;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static EddLayoutAjioBinding inflate(LayoutInflater layoutInflater) {
        return EddLayoutAjioBinding.inflate(layoutInflater, null, false);
    }

    public static EddLayoutAjioBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.edd_layout_ajio;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return EddLayoutAjioBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


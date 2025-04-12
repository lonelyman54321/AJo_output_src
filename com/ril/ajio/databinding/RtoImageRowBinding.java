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
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;

public abstract class RtoImageRowBinding
extends ViewDataBinding {
    public final AjioRoundedCornerImageView imgProduct;

    public RtoImageRowBinding(Object object, View view, int n3, AjioRoundedCornerImageView ajioRoundedCornerImageView) {
        super(object, view, n3);
        this.imgProduct = ajioRoundedCornerImageView;
    }

    public static RtoImageRowBinding bind(View view) {
        return RtoImageRowBinding.bind(view, null);
    }

    public static RtoImageRowBinding bind(View view, Object object) {
        int n3 = R$layout.rto_image_row;
        return (RtoImageRowBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static RtoImageRowBinding inflate(LayoutInflater layoutInflater) {
        return RtoImageRowBinding.inflate(layoutInflater, null);
    }

    public static RtoImageRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return RtoImageRowBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static RtoImageRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.rto_image_row;
        return (RtoImageRowBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static RtoImageRowBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.rto_image_row;
        return (RtoImageRowBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}


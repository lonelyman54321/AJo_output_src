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
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public abstract class RtoReasonRowBinding
extends ViewDataBinding {
    public final ImageView radioRto;
    public final AjioTextView rtoReasonTitle;

    public RtoReasonRowBinding(Object object, View view, int n3, ImageView imageView, AjioTextView ajioTextView) {
        super(object, view, n3);
        this.radioRto = imageView;
        this.rtoReasonTitle = ajioTextView;
    }

    public static RtoReasonRowBinding bind(View view) {
        return RtoReasonRowBinding.bind(view, null);
    }

    public static RtoReasonRowBinding bind(View view, Object object) {
        int n3 = R$layout.rto_reason_row;
        return (RtoReasonRowBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static RtoReasonRowBinding inflate(LayoutInflater layoutInflater) {
        return RtoReasonRowBinding.inflate(layoutInflater, null);
    }

    public static RtoReasonRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return RtoReasonRowBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static RtoReasonRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.rto_reason_row;
        return (RtoReasonRowBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static RtoReasonRowBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.rto_reason_row;
        return (RtoReasonRowBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}


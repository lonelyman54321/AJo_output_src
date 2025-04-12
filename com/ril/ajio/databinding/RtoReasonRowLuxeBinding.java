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

public abstract class RtoReasonRowLuxeBinding
extends ViewDataBinding {
    public final ImageView radioRto;
    public final AjioTextView rtoReasonTitle;

    public RtoReasonRowLuxeBinding(Object object, View view, int n3, ImageView imageView, AjioTextView ajioTextView) {
        super(object, view, n3);
        this.radioRto = imageView;
        this.rtoReasonTitle = ajioTextView;
    }

    public static RtoReasonRowLuxeBinding bind(View view) {
        return RtoReasonRowLuxeBinding.bind(view, null);
    }

    public static RtoReasonRowLuxeBinding bind(View view, Object object) {
        int n3 = R$layout.rto_reason_row_luxe;
        return (RtoReasonRowLuxeBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static RtoReasonRowLuxeBinding inflate(LayoutInflater layoutInflater) {
        return RtoReasonRowLuxeBinding.inflate(layoutInflater, null);
    }

    public static RtoReasonRowLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return RtoReasonRowLuxeBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static RtoReasonRowLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.rto_reason_row_luxe;
        return (RtoReasonRowLuxeBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static RtoReasonRowLuxeBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.rto_reason_row_luxe;
        return (RtoReasonRowLuxeBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}


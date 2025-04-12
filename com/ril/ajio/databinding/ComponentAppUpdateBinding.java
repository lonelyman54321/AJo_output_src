/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ComponentAppUpdateBinding
implements BC3 {
    public final TextView appUpdateBtn;
    public final TextView appUpdateHeaderTV;
    public final TextView appUpdateInfoTV;
    private final FrameLayout rootView;
    public final AppCompatImageView updateAlertIV;
    public final TextView updateLaterBtn;
    public final ProgressBar updateProgressBar;
    public final FrameLayout updateWidgetContainer;

    private ComponentAppUpdateBinding(FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3, AppCompatImageView appCompatImageView, TextView textView4, ProgressBar progressBar, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.appUpdateBtn = textView;
        this.appUpdateHeaderTV = textView2;
        this.appUpdateInfoTV = textView3;
        this.updateAlertIV = appCompatImageView;
        this.updateLaterBtn = textView4;
        this.updateProgressBar = progressBar;
        this.updateWidgetContainer = frameLayout2;
    }

    public static ComponentAppUpdateBinding bind(View object) {
        View view;
        int n3 = R$id.appUpdateBtn;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.appUpdateHeaderTV;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.appUpdateInfoTV;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.updateAlertIV;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (AppCompatImageView)view;
                    if (object2 != null) {
                        n3 = R$id.updateLaterBtn;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (TextView)view;
                        if (view5 != null) {
                            n3 = R$id.updateProgressBar;
                            View view6 = view = dd2_2.a(n3, object);
                            view6 = (ProgressBar)view;
                            if (view6 != null) {
                                n3 = R$id.updateWidgetContainer;
                                View view7 = view = dd2_2.a(n3, object);
                                view7 = (FrameLayout)view;
                                if (view7 != null) {
                                    Object object3 = object;
                                    object3 = (FrameLayout)object;
                                    ComponentAppUpdateBinding componentAppUpdateBinding = new ComponentAppUpdateBinding((FrameLayout)object3, (TextView)view2, (TextView)view3, (TextView)view4, (AppCompatImageView)((Object)object2), (TextView)view5, (ProgressBar)view6, (FrameLayout)view7);
                                    return componentAppUpdateBinding;
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

    public static ComponentAppUpdateBinding inflate(LayoutInflater layoutInflater) {
        return ComponentAppUpdateBinding.inflate(layoutInflater, null, false);
    }

    public static ComponentAppUpdateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.component_app_update;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ComponentAppUpdateBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class DynamicfeatureProgressViewLayoutBinding
implements BC3 {
    public final RelativeLayout ajioProgressLayout;
    public final ProgressBar pbDynamicFeature;
    private final RelativeLayout rootView;
    public final AjioTextView tvProgressSubtext;
    public final AjioTextView tvProgressText;

    private DynamicfeatureProgressViewLayoutBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ProgressBar progressBar, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = relativeLayout;
        this.ajioProgressLayout = relativeLayout2;
        this.pbDynamicFeature = progressBar;
        this.tvProgressSubtext = ajioTextView;
        this.tvProgressText = ajioTextView2;
    }

    public static DynamicfeatureProgressViewLayoutBinding bind(View object) {
        View view;
        View view2 = object;
        view2 = (RelativeLayout)object;
        int n3 = R$id.pb_dynamic_feature;
        View view3 = view = dd2_2.a(n3, object);
        view3 = (ProgressBar)view;
        if (view3 != null) {
            n3 = R$id.tv_progress_subtext;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.tv_progress_text;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    Object object4 = object;
                    view = view2;
                    object = new DynamicfeatureProgressViewLayoutBinding((RelativeLayout)view2, (RelativeLayout)view2, (ProgressBar)view3, (AjioTextView)object2, (AjioTextView)object3);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static DynamicfeatureProgressViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        return DynamicfeatureProgressViewLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static DynamicfeatureProgressViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dynamicfeature_progress_view_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DynamicfeatureProgressViewLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}


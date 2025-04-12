/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RedirectProgressViewLayoutBinding
implements BC3 {
    public final RelativeLayout ajioProgressLayout;
    private final RelativeLayout rootView;
    public final AjioTextView tvLabel2;
    public final AjioTextView tvRedirectingLabel;

    private RedirectProgressViewLayoutBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = relativeLayout;
        this.ajioProgressLayout = relativeLayout2;
        this.tvLabel2 = ajioTextView;
        this.tvRedirectingLabel = ajioTextView2;
    }

    public static RedirectProgressViewLayoutBinding bind(View object) {
        AjioTextView ajioTextView;
        Object object2 = object;
        object2 = (RelativeLayout)object;
        int n3 = R$id.tv_label2;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tv_redirecting_label, object)) != null) {
            object = new RedirectProgressViewLayoutBinding((RelativeLayout)object2, (RelativeLayout)object2, ajioTextView2, ajioTextView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static RedirectProgressViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        return RedirectProgressViewLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static RedirectProgressViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.redirect_progress_view_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RedirectProgressViewLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}


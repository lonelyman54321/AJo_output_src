/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PesdkViewToolbarBinding
implements BC3 {
    public final AjioTextView pesdkToolbarTitleTv;
    private final LinearLayout rootView;

    private PesdkViewToolbarBinding(LinearLayout linearLayout, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.pesdkToolbarTitleTv = ajioTextView;
    }

    public static PesdkViewToolbarBinding bind(View object) {
        int n3 = R$id.pesdk_toolbar_title_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (LinearLayout)object;
            PesdkViewToolbarBinding pesdkViewToolbarBinding = new PesdkViewToolbarBinding((LinearLayout)object, ajioTextView);
            return pesdkViewToolbarBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkViewToolbarBinding inflate(LayoutInflater layoutInflater) {
        return PesdkViewToolbarBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkViewToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_view_toolbar;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkViewToolbarBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


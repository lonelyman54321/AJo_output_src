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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxeFooterLayoutBinding
implements BC3 {
    public final AjioTextView luxeFooterTitleTv;
    private final ConstraintLayout rootView;

    private LuxeFooterLayoutBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.luxeFooterTitleTv = ajioTextView;
    }

    public static LuxeFooterLayoutBinding bind(View object) {
        int n3 = R$id.luxe_footer_title_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (ConstraintLayout)((Object)object);
            LuxeFooterLayoutBinding luxeFooterLayoutBinding = new LuxeFooterLayoutBinding((ConstraintLayout)((Object)object), ajioTextView);
            return luxeFooterLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxeFooterLayoutBinding inflate(LayoutInflater layoutInflater) {
        return LuxeFooterLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeFooterLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_footer_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeFooterLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


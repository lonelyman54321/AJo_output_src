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
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PesdkLayoutBottomMsgBinding
implements BC3 {
    public final AjioTextView plbmTvMsg;
    private final AjioTextView rootView;

    private PesdkLayoutBottomMsgBinding(AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = ajioTextView;
        this.plbmTvMsg = ajioTextView2;
    }

    public static PesdkLayoutBottomMsgBinding bind(View object) {
        if (object != null) {
            object = (AjioTextView)object;
            PesdkLayoutBottomMsgBinding pesdkLayoutBottomMsgBinding = new PesdkLayoutBottomMsgBinding((AjioTextView)object, (AjioTextView)object);
            return pesdkLayoutBottomMsgBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static PesdkLayoutBottomMsgBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLayoutBottomMsgBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLayoutBottomMsgBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_layout_bottom_msg;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLayoutBottomMsgBinding.bind((View)layoutInflater);
    }

    public AjioTextView getRoot() {
        return this.rootView;
    }
}


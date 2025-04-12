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

public final class LayoutTextviewInfoMsgBinding
implements BC3 {
    public final AjioTextView rilEmployeeInfoMsg;
    private final AjioTextView rootView;

    private LayoutTextviewInfoMsgBinding(AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = ajioTextView;
        this.rilEmployeeInfoMsg = ajioTextView2;
    }

    public static LayoutTextviewInfoMsgBinding bind(View object) {
        if (object != null) {
            object = (AjioTextView)object;
            LayoutTextviewInfoMsgBinding layoutTextviewInfoMsgBinding = new LayoutTextviewInfoMsgBinding((AjioTextView)object, (AjioTextView)object);
            return layoutTextviewInfoMsgBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutTextviewInfoMsgBinding inflate(LayoutInflater layoutInflater) {
        return LayoutTextviewInfoMsgBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutTextviewInfoMsgBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_textview_info_msg;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutTextviewInfoMsgBinding.bind((View)layoutInflater);
    }

    public AjioTextView getRoot() {
        return this.rootView;
    }
}


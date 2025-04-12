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

public final class RowPdpNoReturnBinding
implements BC3 {
    private final AjioTextView rootView;
    public final AjioTextView rowPdpTvNoReturnInfo;

    private RowPdpNoReturnBinding(AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = ajioTextView;
        this.rowPdpTvNoReturnInfo = ajioTextView2;
    }

    public static RowPdpNoReturnBinding bind(View object) {
        if (object != null) {
            object = (AjioTextView)object;
            RowPdpNoReturnBinding rowPdpNoReturnBinding = new RowPdpNoReturnBinding((AjioTextView)object, (AjioTextView)object);
            return rowPdpNoReturnBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowPdpNoReturnBinding inflate(LayoutInflater layoutInflater) {
        return RowPdpNoReturnBinding.inflate(layoutInflater, null, false);
    }

    public static RowPdpNoReturnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_pdp_no_return;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowPdpNoReturnBinding.bind((View)layoutInflater);
    }

    public AjioTextView getRoot() {
        return this.rootView;
    }
}


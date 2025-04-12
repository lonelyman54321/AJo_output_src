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

public final class RowLuxBrandSectionBinding
implements BC3 {
    private final AjioTextView rootView;
    public final AjioTextView rowLuxBrandTv;

    private RowLuxBrandSectionBinding(AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = ajioTextView;
        this.rowLuxBrandTv = ajioTextView2;
    }

    public static RowLuxBrandSectionBinding bind(View object) {
        if (object != null) {
            object = (AjioTextView)object;
            RowLuxBrandSectionBinding rowLuxBrandSectionBinding = new RowLuxBrandSectionBinding((AjioTextView)object, (AjioTextView)object);
            return rowLuxBrandSectionBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowLuxBrandSectionBinding inflate(LayoutInflater layoutInflater) {
        return RowLuxBrandSectionBinding.inflate(layoutInflater, null, false);
    }

    public static RowLuxBrandSectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_lux_brand_section;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowLuxBrandSectionBinding.bind((View)layoutInflater);
    }

    public AjioTextView getRoot() {
        return this.rootView;
    }
}


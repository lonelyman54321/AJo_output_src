/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ril.ajio.R$layout;

public final class RowCcItemdetailTitleRefreshBinding
implements BC3 {
    private final TextView rootView;
    public final TextView rowCcItemDetailTvTitle;

    private RowCcItemdetailTitleRefreshBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.rowCcItemDetailTvTitle = textView2;
    }

    public static RowCcItemdetailTitleRefreshBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            RowCcItemdetailTitleRefreshBinding rowCcItemdetailTitleRefreshBinding = new RowCcItemdetailTitleRefreshBinding((TextView)object, (TextView)object);
            return rowCcItemdetailTitleRefreshBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowCcItemdetailTitleRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCcItemdetailTitleRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcItemdetailTitleRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_itemdetail_title_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcItemdetailTitleRefreshBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}


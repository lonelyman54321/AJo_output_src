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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowCcFaqSearchLayoutRefreshBinding
implements BC3 {
    private final LinearLayout rootView;
    public final ConstraintLayout searchbarLayout;

    private RowCcFaqSearchLayoutRefreshBinding(LinearLayout linearLayout, ConstraintLayout constraintLayout) {
        this.rootView = linearLayout;
        this.searchbarLayout = constraintLayout;
    }

    public static RowCcFaqSearchLayoutRefreshBinding bind(View object) {
        int n3 = R$id.searchbar_layout;
        ConstraintLayout constraintLayout = (ConstraintLayout)dd2_2.a(n3, object);
        if (constraintLayout != null) {
            object = (LinearLayout)object;
            RowCcFaqSearchLayoutRefreshBinding rowCcFaqSearchLayoutRefreshBinding = new RowCcFaqSearchLayoutRefreshBinding((LinearLayout)object, constraintLayout);
            return rowCcFaqSearchLayoutRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCcFaqSearchLayoutRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCcFaqSearchLayoutRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcFaqSearchLayoutRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_faq_search_layout_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcFaqSearchLayoutRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


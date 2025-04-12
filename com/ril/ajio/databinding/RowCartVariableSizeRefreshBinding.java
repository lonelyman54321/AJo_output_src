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
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowCartVariableSizeRefreshBinding
implements BC3 {
    private final CardView rootView;
    public final CardView rowCartVariableSizeLayout;
    public final TextView rowCartVariableSizeTv;

    private RowCartVariableSizeRefreshBinding(CardView cardView, CardView cardView2, TextView textView) {
        this.rootView = cardView;
        this.rowCartVariableSizeLayout = cardView2;
        this.rowCartVariableSizeTv = textView;
    }

    public static RowCartVariableSizeRefreshBinding bind(View object) {
        Object object2 = object;
        object2 = (CardView)((Object)object);
        int n3 = R$id.row_cart_variable_size_tv;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = new RowCartVariableSizeRefreshBinding((CardView)((Object)object2), (CardView)((Object)object2), textView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static RowCartVariableSizeRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCartVariableSizeRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCartVariableSizeRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cart_variable_size_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCartVariableSizeRefreshBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}


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

public final class RowPdpS1Binding
implements BC3 {
    public final TextView closetSizeItemTv;
    private final CardView rootView;
    public final CardView s1ParentView;

    private RowPdpS1Binding(CardView cardView, TextView textView, CardView cardView2) {
        this.rootView = cardView;
        this.closetSizeItemTv = textView;
        this.s1ParentView = cardView2;
    }

    public static RowPdpS1Binding bind(View object) {
        int n3 = R$id.closet_size_item_tv;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = (CardView)((Object)object);
            RowPdpS1Binding rowPdpS1Binding = new RowPdpS1Binding((CardView)((Object)object), textView, (CardView)((Object)object));
            return rowPdpS1Binding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowPdpS1Binding inflate(LayoutInflater layoutInflater) {
        return RowPdpS1Binding.inflate(layoutInflater, null, false);
    }

    public static RowPdpS1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_pdp_s1;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowPdpS1Binding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}


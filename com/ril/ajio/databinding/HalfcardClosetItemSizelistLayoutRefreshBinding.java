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

public final class HalfcardClosetItemSizelistLayoutRefreshBinding
implements BC3 {
    public final TextView closetSizeItemTv;
    private final CardView rootView;

    private HalfcardClosetItemSizelistLayoutRefreshBinding(CardView cardView, TextView textView) {
        this.rootView = cardView;
        this.closetSizeItemTv = textView;
    }

    public static HalfcardClosetItemSizelistLayoutRefreshBinding bind(View object) {
        int n3 = R$id.closet_size_item_tv;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = (CardView)((Object)object);
            HalfcardClosetItemSizelistLayoutRefreshBinding halfcardClosetItemSizelistLayoutRefreshBinding = new HalfcardClosetItemSizelistLayoutRefreshBinding((CardView)((Object)object), textView);
            return halfcardClosetItemSizelistLayoutRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static HalfcardClosetItemSizelistLayoutRefreshBinding inflate(LayoutInflater layoutInflater) {
        return HalfcardClosetItemSizelistLayoutRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static HalfcardClosetItemSizelistLayoutRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.halfcard_closet_item_sizelist_layout_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return HalfcardClosetItemSizelistLayoutRefreshBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}


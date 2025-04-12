/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class NewPlpSizeListBinding
implements BC3 {
    public final TextView itemPlpSize1;
    public final TextView itemPlpSize2;
    public final TextView itemPlpSize3;
    public final TextView itemPlpSize4;
    private final LinearLayout rootView;

    private NewPlpSizeListBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.itemPlpSize1 = textView;
        this.itemPlpSize2 = textView2;
        this.itemPlpSize3 = textView3;
        this.itemPlpSize4 = textView4;
    }

    public static NewPlpSizeListBinding bind(View object) {
        View view;
        int n3 = R$id.item_plp_size_1;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.item_plp_size_2;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.item_plp_size_3;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.item_plp_size_4;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (LinearLayout)object;
                        NewPlpSizeListBinding newPlpSizeListBinding = new NewPlpSizeListBinding((LinearLayout)object2, (TextView)view2, (TextView)view3, (TextView)view4, (TextView)view5);
                        return newPlpSizeListBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewPlpSizeListBinding inflate(LayoutInflater layoutInflater) {
        return NewPlpSizeListBinding.inflate(layoutInflater, null, false);
    }

    public static NewPlpSizeListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_plp_size_list;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewPlpSizeListBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


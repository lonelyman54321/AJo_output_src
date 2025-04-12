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

public final class ItemQuestionBinding
implements BC3 {
    public final TextView responseItem;
    private final TextView rootView;

    private ItemQuestionBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.responseItem = textView2;
    }

    public static ItemQuestionBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            ItemQuestionBinding itemQuestionBinding = new ItemQuestionBinding((TextView)object, (TextView)object);
            return itemQuestionBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ItemQuestionBinding inflate(LayoutInflater layoutInflater) {
        return ItemQuestionBinding.inflate(layoutInflater, null, false);
    }

    public static ItemQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_question;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemQuestionBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}


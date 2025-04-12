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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ItemRatingQuestionsBinding
implements BC3 {
    public final TextView questionTitle;
    public final RecyclerView responseList;
    private final ConstraintLayout rootView;

    private ItemRatingQuestionsBinding(ConstraintLayout constraintLayout, TextView textView, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.questionTitle = textView;
        this.responseList = recyclerView;
    }

    public static ItemRatingQuestionsBinding bind(View object) {
        RecyclerView recyclerView;
        int n3 = R$id.question_title;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null && (recyclerView = (RecyclerView)dd2_2.a(n3 = R$id.response_list, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            ItemRatingQuestionsBinding itemRatingQuestionsBinding = new ItemRatingQuestionsBinding((ConstraintLayout)((Object)object), textView, recyclerView);
            return itemRatingQuestionsBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ItemRatingQuestionsBinding inflate(LayoutInflater layoutInflater) {
        return ItemRatingQuestionsBinding.inflate(layoutInflater, null, false);
    }

    public static ItemRatingQuestionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_rating_questions;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemRatingQuestionsBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


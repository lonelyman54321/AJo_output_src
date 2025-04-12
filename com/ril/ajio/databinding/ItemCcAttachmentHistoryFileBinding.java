/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ItemCcAttachmentHistoryFileBinding
implements BC3 {
    public final CardView cardAttachment;
    public final ImageView ivAttachment;
    private final ConstraintLayout rootView;
    public final TextView tvFileName;

    private ItemCcAttachmentHistoryFileBinding(ConstraintLayout constraintLayout, CardView cardView, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.cardAttachment = cardView;
        this.ivAttachment = imageView;
        this.tvFileName = textView;
    }

    public static ItemCcAttachmentHistoryFileBinding bind(View object) {
        TextView textView;
        ImageView imageView;
        int n3 = R$id.card_attachment;
        CardView cardView = (CardView)dd2_2.a(n3, object);
        if (cardView != null && (imageView = (ImageView)dd2_2.a(n3 = R$id.iv_attachment, object)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.tv_file_name, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            ItemCcAttachmentHistoryFileBinding itemCcAttachmentHistoryFileBinding = new ItemCcAttachmentHistoryFileBinding((ConstraintLayout)((Object)object), cardView, imageView, textView);
            return itemCcAttachmentHistoryFileBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ItemCcAttachmentHistoryFileBinding inflate(LayoutInflater layoutInflater) {
        return ItemCcAttachmentHistoryFileBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCcAttachmentHistoryFileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_cc_attachment_history_file;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCcAttachmentHistoryFileBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


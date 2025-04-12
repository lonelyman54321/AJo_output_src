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
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ItemCcAttachFileBinding
implements BC3 {
    public final Barrier barrierCCAttach;
    public final Barrier barrierCCAttachDelete;
    public final CardView cardAttachment;
    public final ImageView ivAttachmentFile;
    public final ImageView ivAttachmentImage;
    public final ConstraintLayout layoutItemAttachment;
    private final ConstraintLayout rootView;
    public final TextView tvAttachCta;
    public final TextView tvAttachmentLabel;
    public final TextView tvAttachmentName;
    public final TextView tvAttachmentPlaceholder;
    public final TextView tvDeleteCta;

    private ItemCcAttachFileBinding(ConstraintLayout constraintLayout, Barrier barrier, Barrier barrier2, CardView cardView, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.barrierCCAttach = barrier;
        this.barrierCCAttachDelete = barrier2;
        this.cardAttachment = cardView;
        this.ivAttachmentFile = imageView;
        this.ivAttachmentImage = imageView2;
        this.layoutItemAttachment = constraintLayout2;
        this.tvAttachCta = textView;
        this.tvAttachmentLabel = textView2;
        this.tvAttachmentName = textView3;
        this.tvAttachmentPlaceholder = textView4;
        this.tvDeleteCta = textView5;
    }

    public static ItemCcAttachFileBinding bind(View object) {
        View view;
        int n3 = R$id.barrierCCAttach;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (Barrier)view;
        if (view2 != null) {
            n3 = R$id.barrierCCAttachDelete;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (Barrier)view;
            if (view3 != null) {
                n3 = R$id.card_attachment;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (CardView)view;
                if (object2 != null) {
                    n3 = R$id.iv_attachment_file;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (ImageView)view;
                    if (view4 != null) {
                        n3 = R$id.iv_attachment_image;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (ImageView)view;
                        if (view5 != null) {
                            Object object3 = object;
                            object3 = (ConstraintLayout)((Object)object);
                            n3 = R$id.tv_attach_cta;
                            View view6 = view = dd2_2.a(n3, object);
                            view6 = (TextView)view;
                            if (view6 != null) {
                                n3 = R$id.tv_attachment_label;
                                View view7 = view = dd2_2.a(n3, object);
                                view7 = (TextView)view;
                                if (view7 != null) {
                                    n3 = R$id.tv_attachment_name;
                                    View view8 = view = dd2_2.a(n3, object);
                                    view8 = (TextView)view;
                                    if (view8 != null) {
                                        n3 = R$id.tv_attachment_placeholder;
                                        View view9 = view = dd2_2.a(n3, object);
                                        view9 = (TextView)view;
                                        if (view9 != null) {
                                            n3 = R$id.tv_delete_cta;
                                            View view10 = view = dd2_2.a(n3, object);
                                            view10 = (TextView)view;
                                            if (view10 != null) {
                                                object = new ItemCcAttachFileBinding((ConstraintLayout)((Object)object3), (Barrier)view2, (Barrier)view3, (CardView)((Object)object2), (ImageView)view4, (ImageView)view5, (ConstraintLayout)((Object)object3), (TextView)view6, (TextView)view7, (TextView)view8, (TextView)view9, (TextView)view10);
                                                return object;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ItemCcAttachFileBinding inflate(LayoutInflater layoutInflater) {
        return ItemCcAttachFileBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCcAttachFileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_cc_attach_file;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCcAttachFileBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


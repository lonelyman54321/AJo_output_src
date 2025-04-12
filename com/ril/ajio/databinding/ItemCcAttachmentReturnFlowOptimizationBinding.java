/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ItemCcAttachmentReturnFlowOptimizationBinding
implements BC3 {
    public final Barrier barrierComment;
    public final TextView characterLimit;
    private final ConstraintLayout rootView;
    public final EditText rowCcAttachComment;
    public final TextView rowCcAttachUpload;
    public final TextView rowCcSubmitBtn;
    public final LinearLayout rowCcWriteContainer;
    public final RecyclerView rvAttachments;
    public final TextView tvAddMoreImages;

    private ItemCcAttachmentReturnFlowOptimizationBinding(ConstraintLayout constraintLayout, Barrier barrier, TextView textView, EditText editText, TextView textView2, TextView textView3, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView4) {
        this.rootView = constraintLayout;
        this.barrierComment = barrier;
        this.characterLimit = textView;
        this.rowCcAttachComment = editText;
        this.rowCcAttachUpload = textView2;
        this.rowCcSubmitBtn = textView3;
        this.rowCcWriteContainer = linearLayout;
        this.rvAttachments = recyclerView;
        this.tvAddMoreImages = textView4;
    }

    public static ItemCcAttachmentReturnFlowOptimizationBinding bind(View object) {
        View view;
        int n3 = R$id.barrier_comment;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (Barrier)view;
        if (view2 != null) {
            n3 = R$id.character_limit;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.row_cc_attach_comment;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (EditText)view;
                if (view4 != null) {
                    n3 = R$id.row_cc_attach_upload;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        n3 = R$id.row_cc_submit_btn;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (TextView)view;
                        if (view6 != null) {
                            n3 = R$id.row_cc_write_container;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (LinearLayout)view;
                            if (view7 != null) {
                                n3 = R$id.rv_attachments;
                                Object object2 = view = dd2_2.a(n3, object);
                                object2 = (RecyclerView)view;
                                if (object2 != null) {
                                    n3 = R$id.tv_add_more_images;
                                    View view8 = view = dd2_2.a(n3, object);
                                    view8 = (TextView)view;
                                    if (view8 != null) {
                                        Object object3 = object;
                                        object3 = (ConstraintLayout)((Object)object);
                                        ItemCcAttachmentReturnFlowOptimizationBinding itemCcAttachmentReturnFlowOptimizationBinding = new ItemCcAttachmentReturnFlowOptimizationBinding((ConstraintLayout)((Object)object3), (Barrier)view2, (TextView)view3, (EditText)view4, (TextView)view5, (TextView)view6, (LinearLayout)view7, (RecyclerView)object2, (TextView)view8);
                                        return itemCcAttachmentReturnFlowOptimizationBinding;
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

    public static ItemCcAttachmentReturnFlowOptimizationBinding inflate(LayoutInflater layoutInflater) {
        return ItemCcAttachmentReturnFlowOptimizationBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCcAttachmentReturnFlowOptimizationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_cc_attachment_return_flow_optimization;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCcAttachmentReturnFlowOptimizationBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


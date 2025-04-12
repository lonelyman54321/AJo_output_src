/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ItemCcAttachmentRefreshBinding
implements BC3 {
    public final Barrier barrierCCAttach;
    public final Barrier barrierCCAttachDelete;
    public final TextView ccAttachDelete;
    public final TextView ccAttachTxt;
    public final ImageView ccAttachmentImage;
    public final TextView characterLimit;
    public final TextView mandatoryTxt;
    private final ConstraintLayout rootView;
    public final CardView rowCcAttachAttachment;
    public final ImageView rowCcAttachAttachmentSample;
    public final EditText rowCcAttachComment;
    public final TextView rowCcAttachCommentRead;
    public final TextView rowCcAttachInfo;
    public final TextView rowCcAttachOptional;
    public final ConstraintLayout rowCcAttachParent;
    public final TextView rowCcAttachText;
    public final TextView rowCcAttachUpload;
    public final TextView rowCcSubmitBtn;
    public final LinearLayout rowCcWriteContainer;

    private ItemCcAttachmentRefreshBinding(ConstraintLayout constraintLayout, Barrier barrier, Barrier barrier2, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, CardView cardView, ImageView imageView2, EditText editText, TextView textView5, TextView textView6, TextView textView7, ConstraintLayout constraintLayout2, TextView textView8, TextView textView9, TextView textView10, LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.barrierCCAttach = barrier;
        this.barrierCCAttachDelete = barrier2;
        this.ccAttachDelete = textView;
        this.ccAttachTxt = textView2;
        this.ccAttachmentImage = imageView;
        this.characterLimit = textView3;
        this.mandatoryTxt = textView4;
        this.rowCcAttachAttachment = cardView;
        this.rowCcAttachAttachmentSample = imageView2;
        this.rowCcAttachComment = editText;
        this.rowCcAttachCommentRead = textView5;
        this.rowCcAttachInfo = textView6;
        this.rowCcAttachOptional = textView7;
        this.rowCcAttachParent = constraintLayout2;
        this.rowCcAttachText = textView8;
        this.rowCcAttachUpload = textView9;
        this.rowCcSubmitBtn = textView10;
        this.rowCcWriteContainer = linearLayout;
    }

    public static ItemCcAttachmentRefreshBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.barrierCCAttach;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (Barrier)view2;
        if (view3 != null) {
            n3 = R$id.barrierCCAttachDelete;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (Barrier)view2;
            if (view4 != null) {
                n3 = R$id.cc_attach_delete;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (TextView)view2;
                if (view5 != null) {
                    n3 = R$id.cc_attach_txt;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (TextView)view2;
                    if (view6 != null) {
                        n3 = R$id.cc_attachment_image;
                        View view7 = view2 = dd2_2.a(n3, view);
                        view7 = (ImageView)view2;
                        if (view7 != null) {
                            n3 = R$id.character_limit;
                            View view8 = view2 = dd2_2.a(n3, view);
                            view8 = (TextView)view2;
                            if (view8 != null) {
                                n3 = R$id.mandatory_txt;
                                View view9 = view2 = dd2_2.a(n3, view);
                                view9 = (TextView)view2;
                                if (view9 != null) {
                                    n3 = R$id.row_cc_attach_attachment;
                                    Object object2 = view2 = dd2_2.a(n3, view);
                                    object2 = (CardView)view2;
                                    if (object2 != null) {
                                        n3 = R$id.row_cc_attach_attachment_sample;
                                        View view10 = view2 = dd2_2.a(n3, view);
                                        view10 = (ImageView)view2;
                                        if (view10 != null) {
                                            n3 = R$id.row_cc_attach_comment;
                                            View view11 = view2 = dd2_2.a(n3, view);
                                            view11 = (EditText)view2;
                                            if (view11 != null) {
                                                n3 = R$id.row_cc_attach_comment_read;
                                                View view12 = view2 = dd2_2.a(n3, view);
                                                view12 = (TextView)view2;
                                                if (view12 != null) {
                                                    n3 = R$id.row_cc_attach_info;
                                                    View view13 = view2 = dd2_2.a(n3, view);
                                                    view13 = (TextView)view2;
                                                    if (view13 != null) {
                                                        n3 = R$id.row_cc_attach_optional;
                                                        View view14 = view2 = dd2_2.a(n3, view);
                                                        view14 = (TextView)view2;
                                                        if (view14 != null) {
                                                            n3 = R$id.row_cc_attach_parent;
                                                            Object object3 = view2 = dd2_2.a(n3, view);
                                                            object3 = (ConstraintLayout)view2;
                                                            if (object3 != null) {
                                                                n3 = R$id.row_cc_attach_text;
                                                                View view15 = view2 = dd2_2.a(n3, view);
                                                                view15 = (TextView)view2;
                                                                if (view15 != null) {
                                                                    n3 = R$id.row_cc_attach_upload;
                                                                    View view16 = view2 = dd2_2.a(n3, view);
                                                                    view16 = (TextView)view2;
                                                                    if (view16 != null) {
                                                                        n3 = R$id.row_cc_submit_btn;
                                                                        View view17 = view2 = dd2_2.a(n3, view);
                                                                        view17 = (TextView)view2;
                                                                        if (view17 != null) {
                                                                            n3 = R$id.row_cc_write_container;
                                                                            View view18 = view2 = dd2_2.a(n3, view);
                                                                            view18 = (LinearLayout)view2;
                                                                            if (view18 != null) {
                                                                                Object object4 = view;
                                                                                object4 = (ConstraintLayout)view;
                                                                                ItemCcAttachmentRefreshBinding itemCcAttachmentRefreshBinding = new ItemCcAttachmentRefreshBinding((ConstraintLayout)((Object)object4), (Barrier)view3, (Barrier)view4, (TextView)view5, (TextView)view6, (ImageView)view7, (TextView)view8, (TextView)view9, (CardView)((Object)object2), (ImageView)view10, (EditText)view11, (TextView)view12, (TextView)view13, (TextView)view14, (ConstraintLayout)((Object)object3), (TextView)view15, (TextView)view16, (TextView)view17, (LinearLayout)view18);
                                                                                return itemCcAttachmentRefreshBinding;
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
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ItemCcAttachmentRefreshBinding inflate(LayoutInflater layoutInflater) {
        return ItemCcAttachmentRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCcAttachmentRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_cc_attachment_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCcAttachmentRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


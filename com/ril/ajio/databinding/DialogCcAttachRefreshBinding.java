/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class DialogCcAttachRefreshBinding
implements BC3 {
    public final ImageView attachCamIcon;
    public final TextView attachCamTxt;
    public final ImageView attachFileIcon;
    public final TextView attachFileTxt;
    public final TextView attachmentHeader;
    public final LinearLayout cameraContainer;
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final LinearLayout fileContainer;
    private final ConstraintLayout rootView;

    private DialogCcAttachRefreshBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, TextView textView3, LinearLayout linearLayout, ImageView imageView3, FrameLayout frameLayout, LinearLayout linearLayout2) {
        this.rootView = constraintLayout;
        this.attachCamIcon = imageView;
        this.attachCamTxt = textView;
        this.attachFileIcon = imageView2;
        this.attachFileTxt = textView2;
        this.attachmentHeader = textView3;
        this.cameraContainer = linearLayout;
        this.cancelBtn = imageView3;
        this.cancelContainer = frameLayout;
        this.fileContainer = linearLayout2;
    }

    public static DialogCcAttachRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.attach_cam_icon;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.attach_cam_txt;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.attach_file_icon;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.attach_file_txt;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        n3 = R$id.attachment_header;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (TextView)view;
                        if (view6 != null) {
                            n3 = R$id.camera_container;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (LinearLayout)view;
                            if (view7 != null) {
                                n3 = R$id.cancelBtn;
                                View view8 = view = dd2_2.a(n3, object);
                                view8 = (ImageView)view;
                                if (view8 != null) {
                                    n3 = R$id.cancelContainer;
                                    View view9 = view = dd2_2.a(n3, object);
                                    view9 = (FrameLayout)view;
                                    if (view9 != null) {
                                        n3 = R$id.file_container;
                                        View view10 = view = dd2_2.a(n3, object);
                                        view10 = (LinearLayout)view;
                                        if (view10 != null) {
                                            Object object2 = object;
                                            object2 = (ConstraintLayout)((Object)object);
                                            DialogCcAttachRefreshBinding dialogCcAttachRefreshBinding = new DialogCcAttachRefreshBinding((ConstraintLayout)((Object)object2), (ImageView)view2, (TextView)view3, (ImageView)view4, (TextView)view5, (TextView)view6, (LinearLayout)view7, (ImageView)view8, (FrameLayout)view9, (LinearLayout)view10);
                                            return dialogCcAttachRefreshBinding;
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

    public static DialogCcAttachRefreshBinding inflate(LayoutInflater layoutInflater) {
        return DialogCcAttachRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static DialogCcAttachRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_cc_attach_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogCcAttachRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


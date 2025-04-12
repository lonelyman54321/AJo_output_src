/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class DialogCcReopenComplaintRefreshBinding
implements BC3 {
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final ImageView close;
    public final EditText comment;
    public final TextView newComplaintMsg;
    public final TextView repoenComplaintTxt;
    private final ConstraintLayout rootView;
    public final TextView submitBtn;

    private DialogCcReopenComplaintRefreshBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, EditText editText, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.close = imageView2;
        this.comment = editText;
        this.newComplaintMsg = textView;
        this.repoenComplaintTxt = textView2;
        this.submitBtn = textView3;
    }

    public static DialogCcReopenComplaintRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.cancelBtn;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.cancelContainer;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (FrameLayout)view;
            if (view3 != null) {
                n3 = R$id.close;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.comment;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (EditText)view;
                    if (view5 != null) {
                        n3 = R$id.new_complaint_msg;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (TextView)view;
                        if (view6 != null) {
                            n3 = R$id.repoen_complaint_txt;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (TextView)view;
                            if (view7 != null) {
                                n3 = R$id.submit_btn;
                                View view8 = view = dd2_2.a(n3, object);
                                view8 = (TextView)view;
                                if (view8 != null) {
                                    Object object2 = object;
                                    object2 = (ConstraintLayout)((Object)object);
                                    DialogCcReopenComplaintRefreshBinding dialogCcReopenComplaintRefreshBinding = new DialogCcReopenComplaintRefreshBinding((ConstraintLayout)((Object)object2), (ImageView)view2, (FrameLayout)view3, (ImageView)view4, (EditText)view5, (TextView)view6, (TextView)view7, (TextView)view8);
                                    return dialogCcReopenComplaintRefreshBinding;
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

    public static DialogCcReopenComplaintRefreshBinding inflate(LayoutInflater layoutInflater) {
        return DialogCcReopenComplaintRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static DialogCcReopenComplaintRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_cc_reopen_complaint_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogCcReopenComplaintRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


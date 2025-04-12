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
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class InfoBottomSheetLayoutBinding
implements BC3 {
    public final AjioTextView btnOkay;
    public final FrameLayout cancelContainer;
    public final ImageView closeDialog;
    public final AjioTextView infoDesc;
    public final AjioTextView infoTitle;
    public final LinearLayout parentLayout;
    private final LinearLayout rootView;

    private InfoBottomSheetLayoutBinding(LinearLayout linearLayout, AjioTextView ajioTextView, FrameLayout frameLayout, ImageView imageView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.btnOkay = ajioTextView;
        this.cancelContainer = frameLayout;
        this.closeDialog = imageView;
        this.infoDesc = ajioTextView2;
        this.infoTitle = ajioTextView3;
        this.parentLayout = linearLayout2;
    }

    public static InfoBottomSheetLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.btn_okay;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.cancelContainer;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (FrameLayout)view;
            if (view2 != null) {
                n3 = R$id.close_dialog;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (ImageView)view;
                if (view3 != null) {
                    n3 = R$id.info_desc;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        n3 = R$id.info_title;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            n3 = R$id.parent_layout;
                            View view4 = view = dd2_2.a(n3, object);
                            view4 = (LinearLayout)view;
                            if (view4 != null) {
                                Object object5 = object;
                                object5 = (LinearLayout)object;
                                InfoBottomSheetLayoutBinding infoBottomSheetLayoutBinding = new InfoBottomSheetLayoutBinding((LinearLayout)object5, (AjioTextView)object2, (FrameLayout)view2, (ImageView)view3, (AjioTextView)object3, (AjioTextView)object4, (LinearLayout)view4);
                                return infoBottomSheetLayoutBinding;
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

    public static InfoBottomSheetLayoutBinding inflate(LayoutInflater layoutInflater) {
        return InfoBottomSheetLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static InfoBottomSheetLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.info_bottom_sheet_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return InfoBottomSheetLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


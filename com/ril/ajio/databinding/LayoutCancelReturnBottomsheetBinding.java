/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutCancelReturnBottomsheetBinding
implements BC3 {
    public final AjioTextView btnCancel;
    public final LinearLayout cancelReturnLayout;
    public final LinearLayout cancelReturnSuccess;
    public final ImageView cancellationSuccessIcon;
    public final AjioAspectRatioImageView closeStl;
    public final LinearLayout parentLayout;
    private final LinearLayout rootView;
    public final AjioTextView tvCancelSuccessDescription;
    public final AjioTextView tvCancelSuccessTitle;
    public final AjioTextView tvDescription;
    public final AjioTextView tvInfo;
    public final AjioTextView tvTitle;

    private LayoutCancelReturnBottomsheetBinding(LinearLayout linearLayout, AjioTextView ajioTextView, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView, AjioAspectRatioImageView ajioAspectRatioImageView, LinearLayout linearLayout4, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6) {
        this.rootView = linearLayout;
        this.btnCancel = ajioTextView;
        this.cancelReturnLayout = linearLayout2;
        this.cancelReturnSuccess = linearLayout3;
        this.cancellationSuccessIcon = imageView;
        this.closeStl = ajioAspectRatioImageView;
        this.parentLayout = linearLayout4;
        this.tvCancelSuccessDescription = ajioTextView2;
        this.tvCancelSuccessTitle = ajioTextView3;
        this.tvDescription = ajioTextView4;
        this.tvInfo = ajioTextView5;
        this.tvTitle = ajioTextView6;
    }

    public static LayoutCancelReturnBottomsheetBinding bind(View object) {
        View view;
        int n3 = R$id.btn_cancel;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.cancel_return_layout;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (LinearLayout)view;
            if (view2 != null) {
                n3 = R$id.cancel_return_success;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (LinearLayout)view;
                if (view3 != null) {
                    n3 = R$id.cancellation_success_icon;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (ImageView)view;
                    if (view4 != null) {
                        n3 = R$id.close_stl;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (AjioAspectRatioImageView)view;
                        if (object3 != null) {
                            n3 = R$id.parent_layout;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (LinearLayout)view;
                            if (view5 != null) {
                                n3 = R$id.tv_cancel_success_description;
                                Object object4 = view = dd2_2.a(n3, object);
                                object4 = (AjioTextView)view;
                                if (object4 != null) {
                                    n3 = R$id.tv_cancel_success_title;
                                    Object object5 = view = dd2_2.a(n3, object);
                                    object5 = (AjioTextView)view;
                                    if (object5 != null) {
                                        n3 = R$id.tv_description;
                                        Object object6 = view = dd2_2.a(n3, object);
                                        object6 = (AjioTextView)view;
                                        if (object6 != null) {
                                            n3 = R$id.tv_info;
                                            Object object7 = view = dd2_2.a(n3, object);
                                            object7 = (AjioTextView)view;
                                            if (object7 != null) {
                                                n3 = R$id.tv_title;
                                                Object object8 = view = dd2_2.a(n3, object);
                                                object8 = (AjioTextView)view;
                                                if (object8 != null) {
                                                    Object object9 = object;
                                                    object9 = (LinearLayout)object;
                                                    LayoutCancelReturnBottomsheetBinding layoutCancelReturnBottomsheetBinding = new LayoutCancelReturnBottomsheetBinding((LinearLayout)object9, (AjioTextView)object2, (LinearLayout)view2, (LinearLayout)view3, (ImageView)view4, (AjioAspectRatioImageView)((Object)object3), (LinearLayout)view5, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8);
                                                    return layoutCancelReturnBottomsheetBinding;
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
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutCancelReturnBottomsheetBinding inflate(LayoutInflater layoutInflater) {
        return LayoutCancelReturnBottomsheetBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutCancelReturnBottomsheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_cancel_return_bottomsheet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutCancelReturnBottomsheetBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


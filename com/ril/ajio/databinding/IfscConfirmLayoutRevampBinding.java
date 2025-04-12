/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class IfscConfirmLayoutRevampBinding
implements BC3 {
    public final AjioAspectRatioImageView closeButton;
    private final ConstraintLayout rootView;
    public final ConstraintLayout topLayout;
    public final AjioTextView tvCancel;
    public final AjioTextView tvConfirm;
    public final AjioTextView tvEnterCorrectIfsc;
    public final AjioTextView tvIFSCLabel;
    public final AjioTextView tvIfscCode;
    public final AjioTextView tvSubmit;

    private IfscConfirmLayoutRevampBinding(ConstraintLayout constraintLayout, AjioAspectRatioImageView ajioAspectRatioImageView, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6) {
        this.rootView = constraintLayout;
        this.closeButton = ajioAspectRatioImageView;
        this.topLayout = constraintLayout2;
        this.tvCancel = ajioTextView;
        this.tvConfirm = ajioTextView2;
        this.tvEnterCorrectIfsc = ajioTextView3;
        this.tvIFSCLabel = ajioTextView4;
        this.tvIfscCode = ajioTextView5;
        this.tvSubmit = ajioTextView6;
    }

    public static IfscConfirmLayoutRevampBinding bind(View object) {
        View view;
        int n3 = R$id.close_button;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioAspectRatioImageView)view;
        if (object2 != null) {
            n3 = R$id.top_layout;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (ConstraintLayout)view;
            if (object3 != null) {
                n3 = R$id.tv_cancel;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.tvConfirm;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.tvEnterCorrectIfsc;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.tvIFSCLabel;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                n3 = R$id.tv_ifsc_code;
                                Object object8 = view = dd2_2.a(n3, object);
                                object8 = (AjioTextView)view;
                                if (object8 != null) {
                                    n3 = R$id.tv_submit;
                                    Object object9 = view = dd2_2.a(n3, object);
                                    object9 = (AjioTextView)view;
                                    if (object9 != null) {
                                        Object object10 = object;
                                        object10 = (ConstraintLayout)((Object)object);
                                        IfscConfirmLayoutRevampBinding ifscConfirmLayoutRevampBinding = new IfscConfirmLayoutRevampBinding((ConstraintLayout)((Object)object10), (AjioAspectRatioImageView)((Object)object2), (ConstraintLayout)((Object)object3), (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9);
                                        return ifscConfirmLayoutRevampBinding;
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

    public static IfscConfirmLayoutRevampBinding inflate(LayoutInflater layoutInflater) {
        return IfscConfirmLayoutRevampBinding.inflate(layoutInflater, null, false);
    }

    public static IfscConfirmLayoutRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.ifsc_confirm_layout_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IfscConfirmLayoutRevampBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


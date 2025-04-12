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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.LuxeUnderlineButton;

public final class NewLuxeEddLayoutBinding
implements BC3 {
    public final LuxeUnderlineButton changePincode;
    public final LuxeUnderlineButton checkEdd;
    public final ImageView codImg;
    public final AjioTextView codMsgTv;
    public final ConstraintLayout deliveryDetailsLayout;
    public final AjioTextView eddDetailsTitle;
    public final ImageView eddImg;
    public final AjioTextView eddMsgTv;
    public final AjioTextView eddSuccessFooter;
    public final View eddTopDivider;
    public final LinearLayout pincodeLayout;
    public final AjioTextView pincodeTv;
    private final ConstraintLayout rootView;
    public final AjioTextView rowPdpEddErrorTvError;

    private NewLuxeEddLayoutBinding(ConstraintLayout constraintLayout, LuxeUnderlineButton luxeUnderlineButton, LuxeUnderlineButton luxeUnderlineButton2, ImageView imageView, AjioTextView ajioTextView, ConstraintLayout constraintLayout2, AjioTextView ajioTextView2, ImageView imageView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, View view, LinearLayout linearLayout, AjioTextView ajioTextView5, AjioTextView ajioTextView6) {
        this.rootView = constraintLayout;
        this.changePincode = luxeUnderlineButton;
        this.checkEdd = luxeUnderlineButton2;
        this.codImg = imageView;
        this.codMsgTv = ajioTextView;
        this.deliveryDetailsLayout = constraintLayout2;
        this.eddDetailsTitle = ajioTextView2;
        this.eddImg = imageView2;
        this.eddMsgTv = ajioTextView3;
        this.eddSuccessFooter = ajioTextView4;
        this.eddTopDivider = view;
        this.pincodeLayout = linearLayout;
        this.pincodeTv = ajioTextView5;
        this.rowPdpEddErrorTvError = ajioTextView6;
    }

    public static NewLuxeEddLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.change_pincode;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (LuxeUnderlineButton)view2;
        if (object2 != null) {
            n3 = R$id.check_edd;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (LuxeUnderlineButton)view2;
            if (object3 != null) {
                n3 = R$id.cod_img;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (ImageView)view2;
                if (view3 != null) {
                    n3 = R$id.cod_msg_tv;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        Object object5 = view;
                        object5 = (ConstraintLayout)view;
                        n3 = R$id.edd_details_title;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AjioTextView)view2;
                        if (object6 != null) {
                            n3 = R$id.edd_img;
                            View view4 = view2 = dd2_2.a(n3, view);
                            view4 = (ImageView)view2;
                            if (view4 != null) {
                                n3 = R$id.edd_msg_tv;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (AjioTextView)view2;
                                if (object7 != null) {
                                    View view5;
                                    n3 = R$id.edd_success_footer;
                                    Object object8 = view2 = dd2_2.a(n3, view);
                                    object8 = (AjioTextView)view2;
                                    if (object8 != null && (view5 = dd2_2.a(n3 = R$id.edd_top_divider, view)) != null) {
                                        n3 = R$id.pincode_layout;
                                        View view6 = view2 = dd2_2.a(n3, view);
                                        view6 = (LinearLayout)view2;
                                        if (view6 != null) {
                                            n3 = R$id.pincode_tv;
                                            Object object9 = view2 = dd2_2.a(n3, view);
                                            object9 = (AjioTextView)view2;
                                            if (object9 != null) {
                                                n3 = R$id.row_pdp_edd_error_tv_error;
                                                Object object10 = view2 = dd2_2.a(n3, view);
                                                object10 = (AjioTextView)view2;
                                                if (object10 != null) {
                                                    object = new NewLuxeEddLayoutBinding((ConstraintLayout)((Object)object5), (LuxeUnderlineButton)object2, (LuxeUnderlineButton)object3, (ImageView)view3, (AjioTextView)object4, (ConstraintLayout)((Object)object5), (AjioTextView)object6, (ImageView)view4, (AjioTextView)object7, (AjioTextView)object8, view5, (LinearLayout)view6, (AjioTextView)object9, (AjioTextView)object10);
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
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewLuxeEddLayoutBinding inflate(LayoutInflater layoutInflater) {
        return NewLuxeEddLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static NewLuxeEddLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_luxe_edd_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewLuxeEddLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


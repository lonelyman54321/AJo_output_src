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
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewPdpEddLayoutBinding
implements BC3 {
    public final AjioButton changePincode;
    public final AjioButton checkEdd;
    public final ImageView codImg;
    public final AjioTextView codMsgTv;
    public final ConstraintLayout constraintLayout;
    public final ConstraintLayout eddCodLayout;
    public final ConstraintLayout eddDeliveryLayout;
    public final AjioTextView eddDetailsTitle;
    public final ImageView eddImg;
    public final ImageView eddImgReturn;
    public final AjioTextView eddMsgReturn;
    public final AjioTextView eddMsgTv;
    public final ConstraintLayout eddReturnLayout;
    public final AjioTextView eddSuccessFooter;
    public final View eddTopDivider;
    public final LinearLayout pincodeLayout;
    public final AjioTextView pincodeTv;
    public final AjioButton returnPoliciesBtn;
    private final ConstraintLayout rootView;
    public final AjioTextView rowPdpEddErrorTvError;

    private NewPdpEddLayoutBinding(ConstraintLayout constraintLayout, AjioButton ajioButton, AjioButton ajioButton2, ImageView imageView, AjioTextView ajioTextView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, AjioTextView ajioTextView2, ImageView imageView2, ImageView imageView3, AjioTextView ajioTextView3, AjioTextView ajioTextView4, ConstraintLayout constraintLayout5, AjioTextView ajioTextView5, View view, LinearLayout linearLayout, AjioTextView ajioTextView6, AjioButton ajioButton3, AjioTextView ajioTextView7) {
        this.rootView = constraintLayout;
        this.changePincode = ajioButton;
        this.checkEdd = ajioButton2;
        this.codImg = imageView;
        this.codMsgTv = ajioTextView;
        this.constraintLayout = constraintLayout2;
        this.eddCodLayout = constraintLayout3;
        this.eddDeliveryLayout = constraintLayout4;
        this.eddDetailsTitle = ajioTextView2;
        this.eddImg = imageView2;
        this.eddImgReturn = imageView3;
        this.eddMsgReturn = ajioTextView3;
        this.eddMsgTv = ajioTextView4;
        this.eddReturnLayout = constraintLayout5;
        this.eddSuccessFooter = ajioTextView5;
        this.eddTopDivider = view;
        this.pincodeLayout = linearLayout;
        this.pincodeTv = ajioTextView6;
        this.returnPoliciesBtn = ajioButton3;
        this.rowPdpEddErrorTvError = ajioTextView7;
    }

    public static NewPdpEddLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.change_pincode;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioButton)view2;
        if (object2 != null) {
            n3 = R$id.check_edd;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioButton)view2;
            if (object3 != null) {
                n3 = R$id.cod_img;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (ImageView)view2;
                if (view3 != null) {
                    n3 = R$id.cod_msg_tv;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        n3 = R$id.constraintLayout;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (ConstraintLayout)view2;
                        if (object5 != null) {
                            n3 = R$id.edd_cod_layout;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (ConstraintLayout)view2;
                            if (object6 != null) {
                                n3 = R$id.edd_delivery_layout;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (ConstraintLayout)view2;
                                if (object7 != null) {
                                    n3 = R$id.edd_details_title;
                                    Object object8 = view2 = dd2_2.a(n3, view);
                                    object8 = (AjioTextView)view2;
                                    if (object8 != null) {
                                        n3 = R$id.edd_img;
                                        View view4 = view2 = dd2_2.a(n3, view);
                                        view4 = (ImageView)view2;
                                        if (view4 != null) {
                                            n3 = R$id.edd_img_return;
                                            View view5 = view2 = dd2_2.a(n3, view);
                                            view5 = (ImageView)view2;
                                            if (view5 != null) {
                                                n3 = R$id.edd_msg_return;
                                                Object object9 = view2 = dd2_2.a(n3, view);
                                                object9 = (AjioTextView)view2;
                                                if (object9 != null) {
                                                    n3 = R$id.edd_msg_tv;
                                                    Object object10 = view2 = dd2_2.a(n3, view);
                                                    object10 = (AjioTextView)view2;
                                                    if (object10 != null) {
                                                        n3 = R$id.edd_return_layout;
                                                        Object object11 = view2 = dd2_2.a(n3, view);
                                                        object11 = (ConstraintLayout)view2;
                                                        if (object11 != null) {
                                                            View view6;
                                                            n3 = R$id.edd_success_footer;
                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                            object12 = (AjioTextView)view2;
                                                            if (object12 != null && (view6 = dd2_2.a(n3 = R$id.edd_top_divider, view)) != null) {
                                                                n3 = R$id.pincode_layout;
                                                                View view7 = view2 = dd2_2.a(n3, view);
                                                                view7 = (LinearLayout)view2;
                                                                if (view7 != null) {
                                                                    n3 = R$id.pincode_tv;
                                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                                    object13 = (AjioTextView)view2;
                                                                    if (object13 != null) {
                                                                        n3 = R$id.return_policies_btn;
                                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                                        object14 = (AjioButton)view2;
                                                                        if (object14 != null) {
                                                                            n3 = R$id.row_pdp_edd_error_tv_error;
                                                                            Object object15 = view2 = dd2_2.a(n3, view);
                                                                            object15 = (AjioTextView)view2;
                                                                            if (object15 != null) {
                                                                                Object object16 = view;
                                                                                object16 = (ConstraintLayout)view;
                                                                                NewPdpEddLayoutBinding newPdpEddLayoutBinding = new NewPdpEddLayoutBinding((ConstraintLayout)((Object)object16), (AjioButton)object2, (AjioButton)object3, (ImageView)view3, (AjioTextView)object4, (ConstraintLayout)((Object)object5), (ConstraintLayout)((Object)object6), (ConstraintLayout)((Object)object7), (AjioTextView)object8, (ImageView)view4, (ImageView)view5, (AjioTextView)object9, (AjioTextView)object10, (ConstraintLayout)((Object)object11), (AjioTextView)object12, view6, (LinearLayout)view7, (AjioTextView)object13, (AjioButton)object14, (AjioTextView)object15);
                                                                                return newPdpEddLayoutBinding;
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

    public static NewPdpEddLayoutBinding inflate(LayoutInflater layoutInflater) {
        return NewPdpEddLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static NewPdpEddLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_pdp_edd_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewPdpEddLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


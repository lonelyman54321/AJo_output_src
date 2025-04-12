/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ViewReturnBarcodeRevampBinding
implements BC3 {
    public final RelativeLayout clProductCode;
    public final AjioEditText etBarcode;
    public final AjioTextView imvBarcode;
    public final ImageView ivDeleteOne;
    public final ImageView ivDeleteThree;
    public final ImageView ivDeleteTwo;
    public final ImageView ivImageOne;
    public final ImageView ivImageThree;
    public final ImageView ivImageTwo;
    public final ConstraintLayout layoutImage;
    public final AjioTextView lblCaptureImage;
    public final AjioTextView lblErrorEan;
    public final AjioTextView lblNoProductCode;
    public final AjioTextView lblReturnVerification;
    public final AjioTextView lblUploadPhoto;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilBarcode;
    public final AjioTextView tvErrorImage;
    public final AjioTextView tvProductCode;
    public final AjioTextView tvTakeImage;

    private ViewReturnBarcodeRevampBinding(ConstraintLayout constraintLayout, RelativeLayout relativeLayout, AjioEditText ajioEditText, AjioTextView ajioTextView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ConstraintLayout constraintLayout2, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, TextInputLayout textInputLayout, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9) {
        this.rootView = constraintLayout;
        this.clProductCode = relativeLayout;
        this.etBarcode = ajioEditText;
        this.imvBarcode = ajioTextView;
        this.ivDeleteOne = imageView;
        this.ivDeleteThree = imageView2;
        this.ivDeleteTwo = imageView3;
        this.ivImageOne = imageView4;
        this.ivImageThree = imageView5;
        this.ivImageTwo = imageView6;
        this.layoutImage = constraintLayout2;
        this.lblCaptureImage = ajioTextView2;
        this.lblErrorEan = ajioTextView3;
        this.lblNoProductCode = ajioTextView4;
        this.lblReturnVerification = ajioTextView5;
        this.lblUploadPhoto = ajioTextView6;
        this.tilBarcode = textInputLayout;
        this.tvErrorImage = ajioTextView7;
        this.tvProductCode = ajioTextView8;
        this.tvTakeImage = ajioTextView9;
    }

    public static ViewReturnBarcodeRevampBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.clProductCode;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (RelativeLayout)view2;
        if (view3 != null) {
            n3 = R$id.et_barcode;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (AjioEditText)view2;
            if (object2 != null) {
                n3 = R$id.imv_barcode;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (AjioTextView)view2;
                if (object3 != null) {
                    n3 = R$id.ivDeleteOne;
                    View view4 = view2 = dd2_2.a(n3, view);
                    view4 = (ImageView)view2;
                    if (view4 != null) {
                        n3 = R$id.ivDeleteThree;
                        View view5 = view2 = dd2_2.a(n3, view);
                        view5 = (ImageView)view2;
                        if (view5 != null) {
                            n3 = R$id.ivDeleteTwo;
                            View view6 = view2 = dd2_2.a(n3, view);
                            view6 = (ImageView)view2;
                            if (view6 != null) {
                                n3 = R$id.ivImageOne;
                                View view7 = view2 = dd2_2.a(n3, view);
                                view7 = (ImageView)view2;
                                if (view7 != null) {
                                    n3 = R$id.ivImageThree;
                                    View view8 = view2 = dd2_2.a(n3, view);
                                    view8 = (ImageView)view2;
                                    if (view8 != null) {
                                        n3 = R$id.ivImageTwo;
                                        View view9 = view2 = dd2_2.a(n3, view);
                                        view9 = (ImageView)view2;
                                        if (view9 != null) {
                                            n3 = R$id.layout_image;
                                            Object object4 = view2 = dd2_2.a(n3, view);
                                            object4 = (ConstraintLayout)view2;
                                            if (object4 != null) {
                                                n3 = R$id.lbl_capture_image;
                                                Object object5 = view2 = dd2_2.a(n3, view);
                                                object5 = (AjioTextView)view2;
                                                if (object5 != null) {
                                                    n3 = R$id.lbl_error_ean;
                                                    Object object6 = view2 = dd2_2.a(n3, view);
                                                    object6 = (AjioTextView)view2;
                                                    if (object6 != null) {
                                                        n3 = R$id.lbl_no_product_code;
                                                        Object object7 = view2 = dd2_2.a(n3, view);
                                                        object7 = (AjioTextView)view2;
                                                        if (object7 != null) {
                                                            n3 = R$id.lbl_return_verification;
                                                            Object object8 = view2 = dd2_2.a(n3, view);
                                                            object8 = (AjioTextView)view2;
                                                            if (object8 != null) {
                                                                n3 = R$id.lbl_upload_photo;
                                                                Object object9 = view2 = dd2_2.a(n3, view);
                                                                object9 = (AjioTextView)view2;
                                                                if (object9 != null) {
                                                                    n3 = R$id.tilBarcode;
                                                                    Object object10 = view2 = dd2_2.a(n3, view);
                                                                    object10 = (TextInputLayout)view2;
                                                                    if (object10 != null) {
                                                                        n3 = R$id.tvErrorImage;
                                                                        Object object11 = view2 = dd2_2.a(n3, view);
                                                                        object11 = (AjioTextView)view2;
                                                                        if (object11 != null) {
                                                                            n3 = R$id.tvProductCode;
                                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                                            object12 = (AjioTextView)view2;
                                                                            if (object12 != null) {
                                                                                n3 = R$id.tvTakeImage;
                                                                                Object object13 = view2 = dd2_2.a(n3, view);
                                                                                object13 = (AjioTextView)view2;
                                                                                if (object13 != null) {
                                                                                    Object object14 = view;
                                                                                    object14 = (ConstraintLayout)view;
                                                                                    ViewReturnBarcodeRevampBinding viewReturnBarcodeRevampBinding = new ViewReturnBarcodeRevampBinding((ConstraintLayout)((Object)object14), (RelativeLayout)view3, (AjioEditText)object2, (AjioTextView)object3, (ImageView)view4, (ImageView)view5, (ImageView)view6, (ImageView)view7, (ImageView)view8, (ImageView)view9, (ConstraintLayout)((Object)object4), (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (TextInputLayout)((Object)object10), (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13);
                                                                                    return viewReturnBarcodeRevampBinding;
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
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ViewReturnBarcodeRevampBinding inflate(LayoutInflater layoutInflater) {
        return ViewReturnBarcodeRevampBinding.inflate(layoutInflater, null, false);
    }

    public static ViewReturnBarcodeRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_return_barcode_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewReturnBarcodeRevampBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


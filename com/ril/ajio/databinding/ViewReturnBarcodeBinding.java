/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ViewReturnBarcodeBinding
implements BC3 {
    public final View divider;
    public final AjioEditText etBarcode;
    public final AjioEditText etComment;
    public final ImageView imvBarcode;
    public final ImageView imvProductCodeInfo;
    public final ImageView ivDeleteOne;
    public final ImageView ivDeleteTwo;
    public final ImageView ivImageOne;
    public final ImageView ivImageTwo;
    public final RelativeLayout layoutImage;
    public final LinearLayout layoutProductCode;
    public final AjioTextView lblCaptureImage;
    public final AjioTextView lblCharacter;
    public final AjioTextView lblErrorEan;
    public final AjioTextView lblNoProductCode;
    public final AjioTextView lblReturnVerification;
    public final AjioTextView lblUploadPhoto;
    private final RelativeLayout rootView;
    public final AjioTextView tvErrorImage;
    public final AjioTextView tvFeedback;
    public final AjioTextView tvTakeImage;
    public final AjioTextView tvWriteAComment;

    private ViewReturnBarcodeBinding(RelativeLayout relativeLayout, View view, AjioEditText ajioEditText, AjioEditText ajioEditText2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, RelativeLayout relativeLayout2, LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioTextView ajioTextView10) {
        this.rootView = relativeLayout;
        this.divider = view;
        this.etBarcode = ajioEditText;
        this.etComment = ajioEditText2;
        this.imvBarcode = imageView;
        this.imvProductCodeInfo = imageView2;
        this.ivDeleteOne = imageView3;
        this.ivDeleteTwo = imageView4;
        this.ivImageOne = imageView5;
        this.ivImageTwo = imageView6;
        this.layoutImage = relativeLayout2;
        this.layoutProductCode = linearLayout;
        this.lblCaptureImage = ajioTextView;
        this.lblCharacter = ajioTextView2;
        this.lblErrorEan = ajioTextView3;
        this.lblNoProductCode = ajioTextView4;
        this.lblReturnVerification = ajioTextView5;
        this.lblUploadPhoto = ajioTextView6;
        this.tvErrorImage = ajioTextView7;
        this.tvFeedback = ajioTextView8;
        this.tvTakeImage = ajioTextView9;
        this.tvWriteAComment = ajioTextView10;
    }

    public static ViewReturnBarcodeBinding bind(View view) {
        Object object = view;
        int n3 = R$id.divider;
        View view2 = dd2_2.a(n3, view);
        if (view2 != null) {
            Object object2;
            n3 = R$id.et_barcode;
            Object object3 = object2 = dd2_2.a(n3, view);
            object3 = (AjioEditText)object2;
            if (object3 != null) {
                n3 = R$id.et_comment;
                Object object4 = object2 = dd2_2.a(n3, view);
                object4 = (AjioEditText)object2;
                if (object4 != null) {
                    n3 = R$id.imv_barcode;
                    View view3 = object2 = dd2_2.a(n3, view);
                    view3 = (ImageView)object2;
                    if (view3 != null) {
                        n3 = R$id.imv_product_code_info;
                        View view4 = object2 = dd2_2.a(n3, view);
                        view4 = (ImageView)object2;
                        if (view4 != null) {
                            n3 = R$id.ivDeleteOne;
                            View view5 = object2 = dd2_2.a(n3, view);
                            view5 = (ImageView)object2;
                            if (view5 != null) {
                                n3 = R$id.ivDeleteTwo;
                                View view6 = object2 = dd2_2.a(n3, view);
                                view6 = (ImageView)object2;
                                if (view6 != null) {
                                    n3 = R$id.ivImageOne;
                                    View view7 = object2 = dd2_2.a(n3, view);
                                    view7 = (ImageView)object2;
                                    if (view7 != null) {
                                        n3 = R$id.ivImageTwo;
                                        View view8 = object2 = dd2_2.a(n3, view);
                                        view8 = (ImageView)object2;
                                        if (view8 != null) {
                                            n3 = R$id.layout_image;
                                            View view9 = object2 = dd2_2.a(n3, view);
                                            view9 = (RelativeLayout)object2;
                                            if (view9 != null) {
                                                n3 = R$id.layout_product_code;
                                                View view10 = object2 = dd2_2.a(n3, view);
                                                view10 = (LinearLayout)object2;
                                                if (view10 != null) {
                                                    n3 = R$id.lbl_capture_image;
                                                    Object object5 = object2 = dd2_2.a(n3, view);
                                                    object5 = (AjioTextView)object2;
                                                    if (object5 != null) {
                                                        n3 = R$id.lbl_character;
                                                        Object object6 = object2 = dd2_2.a(n3, view);
                                                        object6 = (AjioTextView)object2;
                                                        if (object6 != null) {
                                                            n3 = R$id.lbl_error_ean;
                                                            Object object7 = object2 = dd2_2.a(n3, view);
                                                            object7 = (AjioTextView)object2;
                                                            if (object7 != null) {
                                                                n3 = R$id.lbl_no_product_code;
                                                                Object object8 = object2 = dd2_2.a(n3, view);
                                                                object8 = (AjioTextView)object2;
                                                                if (object8 != null) {
                                                                    n3 = R$id.lbl_return_verification;
                                                                    Object object9 = object2 = dd2_2.a(n3, view);
                                                                    object9 = (AjioTextView)object2;
                                                                    if (object9 != null) {
                                                                        n3 = R$id.lbl_upload_photo;
                                                                        Object object10 = object2 = dd2_2.a(n3, view);
                                                                        object10 = (AjioTextView)object2;
                                                                        if (object10 != null) {
                                                                            n3 = R$id.tvErrorImage;
                                                                            Object object11 = object2 = dd2_2.a(n3, view);
                                                                            object11 = (AjioTextView)object2;
                                                                            if (object11 != null) {
                                                                                n3 = R$id.tv_feedback;
                                                                                Object object12 = object2 = dd2_2.a(n3, view);
                                                                                object12 = (AjioTextView)object2;
                                                                                if (object12 != null) {
                                                                                    n3 = R$id.tvTakeImage;
                                                                                    Object object13 = object2 = dd2_2.a(n3, view);
                                                                                    object13 = (AjioTextView)object2;
                                                                                    if (object13 != null) {
                                                                                        n3 = R$id.tv_write_a_comment;
                                                                                        Object object14 = object2 = dd2_2.a(n3, view);
                                                                                        object14 = (AjioTextView)object2;
                                                                                        if (object14 != null) {
                                                                                            ViewReturnBarcodeBinding viewReturnBarcodeBinding;
                                                                                            object2 = viewReturnBarcodeBinding;
                                                                                            View view11 = view;
                                                                                            view11 = (RelativeLayout)view;
                                                                                            viewReturnBarcodeBinding = new ViewReturnBarcodeBinding((RelativeLayout)view11, view2, (AjioEditText)object3, (AjioEditText)object4, (ImageView)view3, (ImageView)view4, (ImageView)view5, (ImageView)view6, (ImageView)view7, (ImageView)view8, (RelativeLayout)view9, (LinearLayout)view10, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14);
                                                                                            return viewReturnBarcodeBinding;
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
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ViewReturnBarcodeBinding inflate(LayoutInflater layoutInflater) {
        return ViewReturnBarcodeBinding.inflate(layoutInflater, null, false);
    }

    public static ViewReturnBarcodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_return_barcode;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewReturnBarcodeBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}


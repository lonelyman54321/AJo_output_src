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
 *  android.widget.Spinner
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioCheckBox;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentProductCodeBinding
implements BC3 {
    public final AjioButton btnDone;
    public final AjioTextView btnSaveFullWidth;
    public final RelativeLayout cancelReasonsSpinnerLayout;
    public final AjioCheckBox checkboxMissingTag;
    public final AjioAspectRatioImageView close;
    public final TextInputEditText edt;
    public final ImageView imvBack;
    public final ImageView ivDeleteOne;
    public final ImageView ivDeleteTwo;
    public final ImageView ivImageOne;
    public final ImageView ivImageTwo;
    public final ImageView ivProductTagMissingSpinner;
    public final LinearLayout layoutCheckbox;
    public final ConstraintLayout layoutImage;
    public final AjioTextView lblCaptureImage;
    public final AjioTextView lblUploadPhoto;
    public final LinearLayout llProductCode;
    public final Spinner productTagMissingSpinner;
    private final ConstraintLayout rootView;
    public final TextInputLayout til;
    public final AjioTextView tvDescription;
    public final AjioTextView tvErrorImage;
    public final AjioTextView tvHeader;
    public final AjioTextView tvLink;
    public final AjioTextView tvTakeImage;

    private FragmentProductCodeBinding(ConstraintLayout constraintLayout, AjioButton ajioButton, AjioTextView ajioTextView, RelativeLayout relativeLayout, AjioCheckBox ajioCheckBox, AjioAspectRatioImageView ajioAspectRatioImageView, TextInputEditText textInputEditText, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout, ConstraintLayout constraintLayout2, AjioTextView ajioTextView2, AjioTextView ajioTextView3, LinearLayout linearLayout2, Spinner spinner, TextInputLayout textInputLayout, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8) {
        this.rootView = constraintLayout;
        this.btnDone = ajioButton;
        this.btnSaveFullWidth = ajioTextView;
        this.cancelReasonsSpinnerLayout = relativeLayout;
        this.checkboxMissingTag = ajioCheckBox;
        this.close = ajioAspectRatioImageView;
        this.edt = textInputEditText;
        this.imvBack = imageView;
        this.ivDeleteOne = imageView2;
        this.ivDeleteTwo = imageView3;
        this.ivImageOne = imageView4;
        this.ivImageTwo = imageView5;
        this.ivProductTagMissingSpinner = imageView6;
        this.layoutCheckbox = linearLayout;
        this.layoutImage = constraintLayout2;
        this.lblCaptureImage = ajioTextView2;
        this.lblUploadPhoto = ajioTextView3;
        this.llProductCode = linearLayout2;
        this.productTagMissingSpinner = spinner;
        this.til = textInputLayout;
        this.tvDescription = ajioTextView4;
        this.tvErrorImage = ajioTextView5;
        this.tvHeader = ajioTextView6;
        this.tvLink = ajioTextView7;
        this.tvTakeImage = ajioTextView8;
    }

    public static FragmentProductCodeBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.btn_done;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioButton)view2;
        if (object2 != null) {
            n3 = R$id.btnSaveFullWidth;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioTextView)view2;
            if (object3 != null) {
                n3 = R$id.cancel_reasons_spinner_layout;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (RelativeLayout)view2;
                if (view3 != null) {
                    n3 = R$id.checkbox_missing_tag;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioCheckBox)view2;
                    if (object4 != null) {
                        n3 = R$id.close;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (AjioAspectRatioImageView)view2;
                        if (object5 != null) {
                            n3 = R$id.edt;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (TextInputEditText)view2;
                            if (object6 != null) {
                                n3 = R$id.imv_back;
                                View view4 = view2 = dd2_2.a(n3, view);
                                view4 = (ImageView)view2;
                                if (view4 != null) {
                                    n3 = R$id.ivDeleteOne;
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
                                                n3 = R$id.ivImageTwo;
                                                View view8 = view2 = dd2_2.a(n3, view);
                                                view8 = (ImageView)view2;
                                                if (view8 != null) {
                                                    n3 = R$id.ivProductTagMissingSpinner;
                                                    View view9 = view2 = dd2_2.a(n3, view);
                                                    view9 = (ImageView)view2;
                                                    if (view9 != null) {
                                                        n3 = R$id.layout_checkbox;
                                                        View view10 = view2 = dd2_2.a(n3, view);
                                                        view10 = (LinearLayout)view2;
                                                        if (view10 != null) {
                                                            n3 = R$id.layout_image;
                                                            Object object7 = view2 = dd2_2.a(n3, view);
                                                            object7 = (ConstraintLayout)view2;
                                                            if (object7 != null) {
                                                                n3 = R$id.lbl_capture_image;
                                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                                object8 = (AjioTextView)view2;
                                                                if (object8 != null) {
                                                                    n3 = R$id.lbl_upload_photo;
                                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                                    object9 = (AjioTextView)view2;
                                                                    if (object9 != null) {
                                                                        n3 = R$id.llProductCode;
                                                                        View view11 = view2 = dd2_2.a(n3, view);
                                                                        view11 = (LinearLayout)view2;
                                                                        if (view11 != null) {
                                                                            n3 = R$id.productTagMissingSpinner;
                                                                            View view12 = view2 = dd2_2.a(n3, view);
                                                                            view12 = (Spinner)view2;
                                                                            if (view12 != null) {
                                                                                n3 = R$id.til;
                                                                                Object object10 = view2 = dd2_2.a(n3, view);
                                                                                object10 = (TextInputLayout)view2;
                                                                                if (object10 != null) {
                                                                                    n3 = R$id.tv_description;
                                                                                    Object object11 = view2 = dd2_2.a(n3, view);
                                                                                    object11 = (AjioTextView)view2;
                                                                                    if (object11 != null) {
                                                                                        n3 = R$id.tvErrorImage;
                                                                                        Object object12 = view2 = dd2_2.a(n3, view);
                                                                                        object12 = (AjioTextView)view2;
                                                                                        if (object12 != null) {
                                                                                            n3 = R$id.tv_header;
                                                                                            Object object13 = view2 = dd2_2.a(n3, view);
                                                                                            object13 = (AjioTextView)view2;
                                                                                            if (object13 != null) {
                                                                                                n3 = R$id.tv_link;
                                                                                                Object object14 = view2 = dd2_2.a(n3, view);
                                                                                                object14 = (AjioTextView)view2;
                                                                                                if (object14 != null) {
                                                                                                    n3 = R$id.tvTakeImage;
                                                                                                    Object object15 = view2 = dd2_2.a(n3, view);
                                                                                                    object15 = (AjioTextView)view2;
                                                                                                    if (object15 != null) {
                                                                                                        Object object16 = view;
                                                                                                        object16 = (ConstraintLayout)view;
                                                                                                        FragmentProductCodeBinding fragmentProductCodeBinding = new FragmentProductCodeBinding((ConstraintLayout)((Object)object16), (AjioButton)object2, (AjioTextView)object3, (RelativeLayout)view3, (AjioCheckBox)object4, (AjioAspectRatioImageView)((Object)object5), (TextInputEditText)object6, (ImageView)view4, (ImageView)view5, (ImageView)view6, (ImageView)view7, (ImageView)view8, (ImageView)view9, (LinearLayout)view10, (ConstraintLayout)((Object)object7), (AjioTextView)object8, (AjioTextView)object9, (LinearLayout)view11, (Spinner)view12, (TextInputLayout)((Object)object10), (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14, (AjioTextView)object15);
                                                                                                        return fragmentProductCodeBinding;
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
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentProductCodeBinding inflate(LayoutInflater layoutInflater) {
        return FragmentProductCodeBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentProductCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_product_code;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentProductCodeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


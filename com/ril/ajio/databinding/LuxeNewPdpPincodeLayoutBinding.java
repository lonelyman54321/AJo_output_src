/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.LuxeUnderlineButton;

public final class LuxeNewPdpPincodeLayoutBinding
implements BC3 {
    public final AjioEditText fragmentPincodeEtPincode;
    public final RelativeLayout fragmentPincodeLayoutPincode;
    public final LuxeUnderlineButton fragmentPincodeTvCheck;
    public final AjioTextView fragmentPincodeTvError;
    public final TextInputLayout pincodeEddTextInput;
    public final AjioTextView pincodeHeader;
    public final AjioTextView pincodeInfo;
    private final RelativeLayout rootView;

    private LuxeNewPdpPincodeLayoutBinding(RelativeLayout relativeLayout, AjioEditText ajioEditText, RelativeLayout relativeLayout2, LuxeUnderlineButton luxeUnderlineButton, AjioTextView ajioTextView, TextInputLayout textInputLayout, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = relativeLayout;
        this.fragmentPincodeEtPincode = ajioEditText;
        this.fragmentPincodeLayoutPincode = relativeLayout2;
        this.fragmentPincodeTvCheck = luxeUnderlineButton;
        this.fragmentPincodeTvError = ajioTextView;
        this.pincodeEddTextInput = textInputLayout;
        this.pincodeHeader = ajioTextView2;
        this.pincodeInfo = ajioTextView3;
    }

    public static LuxeNewPdpPincodeLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.fragment_pincode_et_pincode;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioEditText)view;
        if (object2 != null) {
            n3 = R$id.fragment_pincode_layout_pincode;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (RelativeLayout)view;
            if (view2 != null) {
                n3 = R$id.fragment_pincode_tv_check;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (LuxeUnderlineButton)view;
                if (object3 != null) {
                    n3 = R$id.fragment_pincode_tv_error;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        n3 = R$id.pincode_edd_text_input;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (TextInputLayout)view;
                        if (object5 != null) {
                            n3 = R$id.pincode_header;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                n3 = R$id.pincode_info;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (AjioTextView)view;
                                if (object7 != null) {
                                    Object object8 = object;
                                    object8 = (RelativeLayout)object;
                                    LuxeNewPdpPincodeLayoutBinding luxeNewPdpPincodeLayoutBinding = new LuxeNewPdpPincodeLayoutBinding((RelativeLayout)object8, (AjioEditText)object2, (RelativeLayout)view2, (LuxeUnderlineButton)object3, (AjioTextView)object4, (TextInputLayout)((Object)object5), (AjioTextView)object6, (AjioTextView)object7);
                                    return luxeNewPdpPincodeLayoutBinding;
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

    public static LuxeNewPdpPincodeLayoutBinding inflate(LayoutInflater layoutInflater) {
        return LuxeNewPdpPincodeLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeNewPdpPincodeLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_new_pdp_pincode_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeNewPdpPincodeLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}


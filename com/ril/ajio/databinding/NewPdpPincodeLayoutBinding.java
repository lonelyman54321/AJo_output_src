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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewPdpPincodeLayoutBinding
implements BC3 {
    public final AjioEditText fragmentPincodeEtPincode;
    public final RelativeLayout fragmentPincodeLayoutPincode;
    public final AjioTextView fragmentPincodeTvCheck;
    public final AjioTextView fragmentPincodeTvError;
    public final RelativeLayout parentLayout;
    public final AjioTextView pincodeHeader;
    public final AjioTextView pincodeInfo;
    private final RelativeLayout rootView;

    private NewPdpPincodeLayoutBinding(RelativeLayout relativeLayout, AjioEditText ajioEditText, RelativeLayout relativeLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, RelativeLayout relativeLayout3, AjioTextView ajioTextView3, AjioTextView ajioTextView4) {
        this.rootView = relativeLayout;
        this.fragmentPincodeEtPincode = ajioEditText;
        this.fragmentPincodeLayoutPincode = relativeLayout2;
        this.fragmentPincodeTvCheck = ajioTextView;
        this.fragmentPincodeTvError = ajioTextView2;
        this.parentLayout = relativeLayout3;
        this.pincodeHeader = ajioTextView3;
        this.pincodeInfo = ajioTextView4;
    }

    public static NewPdpPincodeLayoutBinding bind(View object) {
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
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.fragment_pincode_tv_error;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        Object object5 = object;
                        object5 = (RelativeLayout)object;
                        n3 = R$id.pincode_header;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.pincode_info;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                object = new NewPdpPincodeLayoutBinding((RelativeLayout)object5, (AjioEditText)object2, (RelativeLayout)view2, (AjioTextView)object3, (AjioTextView)object4, (RelativeLayout)object5, (AjioTextView)object6, (AjioTextView)object7);
                                return object;
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

    public static NewPdpPincodeLayoutBinding inflate(LayoutInflater layoutInflater) {
        return NewPdpPincodeLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static NewPdpPincodeLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_pdp_pincode_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewPdpPincodeLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RadioGroup
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioRadioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CartAddAddressRevampBinding
implements BC3 {
    public final AjioTextView addAddressBtnSave;
    public final TextView addAddressTitle;
    public final NestedScrollView addresscontainer;
    public final AjioLoaderView ajioLoaderView;
    public final AjioEditText areaLocalityEt;
    public final TextInputLayout areaLocalityTextInput;
    public final AppCompatCheckBox checkBox;
    public final AjioEditText cityEt;
    public final TextInputLayout cityTextInput;
    public final AppCompatImageView closeDialog;
    public final ConstraintLayout constraintAddressInfo;
    public final ConstraintLayout constraintContactInfo;
    public final AjioEditText faaEtAddressType;
    public final AjioEditText faaEtName;
    public final LinearLayout faaLayoutAddressType;
    public final AjioRadioButton faaRbHome;
    public final AjioRadioButton faaRbOthers;
    public final AjioRadioButton faaRbWork;
    public final RadioGroup faaRgAddressType;
    public final TextInputLayout faaTilAddressType;
    public final TextInputLayout faaTilName;
    public final TextView faaTvAddressInfo;
    public final TextView faaTvAddressType;
    public final TextView faaTvContactInfo;
    public final View faaVAISep;
    public final View faaVAdSep;
    public final View faaVCISep;
    public final AjioEditText flatBuildingEt;
    public final TextInputLayout flatBuildingTextInput;
    public final AppCompatImageView ivBackClick;
    public final AjioEditText landmarkEt;
    public final TextInputLayout landmarkTextInput;
    public final LinearLayout llAddAddressBtn;
    public final AjioEditText mobileEt;
    public final TextInputLayout mobileTextInput;
    public final AjioEditText pincodeEt;
    public final TextInputLayout pincodeTextInput;
    private final RelativeLayout rootView;
    public final AjioEditText stateEt;
    public final TextInputLayout stateTextInput;
    public final TextView toolbarReset;
    public final ConstraintLayout topHeaderView;

    private CartAddAddressRevampBinding(RelativeLayout relativeLayout, AjioTextView ajioTextView, TextView textView, NestedScrollView nestedScrollView, AjioLoaderView ajioLoaderView, AjioEditText ajioEditText, TextInputLayout textInputLayout, AppCompatCheckBox appCompatCheckBox, AjioEditText ajioEditText2, TextInputLayout textInputLayout2, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AjioEditText ajioEditText3, AjioEditText ajioEditText4, LinearLayout linearLayout, AjioRadioButton ajioRadioButton, AjioRadioButton ajioRadioButton2, AjioRadioButton ajioRadioButton3, RadioGroup radioGroup, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextView textView2, TextView textView3, TextView textView4, View view, View view2, View view3, AjioEditText ajioEditText5, TextInputLayout textInputLayout5, AppCompatImageView appCompatImageView2, AjioEditText ajioEditText6, TextInputLayout textInputLayout6, LinearLayout linearLayout2, AjioEditText ajioEditText7, TextInputLayout textInputLayout7, AjioEditText ajioEditText8, TextInputLayout textInputLayout8, AjioEditText ajioEditText9, TextInputLayout textInputLayout9, TextView textView5, ConstraintLayout constraintLayout3) {
        this.rootView = relativeLayout;
        this.addAddressBtnSave = ajioTextView;
        this.addAddressTitle = textView;
        this.addresscontainer = nestedScrollView;
        this.ajioLoaderView = ajioLoaderView;
        this.areaLocalityEt = ajioEditText;
        this.areaLocalityTextInput = textInputLayout;
        this.checkBox = appCompatCheckBox;
        this.cityEt = ajioEditText2;
        this.cityTextInput = textInputLayout2;
        this.closeDialog = appCompatImageView;
        this.constraintAddressInfo = constraintLayout;
        this.constraintContactInfo = constraintLayout2;
        this.faaEtAddressType = ajioEditText3;
        this.faaEtName = ajioEditText4;
        this.faaLayoutAddressType = linearLayout;
        this.faaRbHome = ajioRadioButton;
        this.faaRbOthers = ajioRadioButton2;
        this.faaRbWork = ajioRadioButton3;
        this.faaRgAddressType = radioGroup;
        this.faaTilAddressType = textInputLayout3;
        this.faaTilName = textInputLayout4;
        this.faaTvAddressInfo = textView2;
        this.faaTvAddressType = textView3;
        this.faaTvContactInfo = textView4;
        this.faaVAISep = view;
        this.faaVAdSep = view2;
        this.faaVCISep = view3;
        this.flatBuildingEt = ajioEditText5;
        this.flatBuildingTextInput = textInputLayout5;
        this.ivBackClick = appCompatImageView2;
        this.landmarkEt = ajioEditText6;
        this.landmarkTextInput = textInputLayout6;
        this.llAddAddressBtn = linearLayout2;
        this.mobileEt = ajioEditText7;
        this.mobileTextInput = textInputLayout7;
        this.pincodeEt = ajioEditText8;
        this.pincodeTextInput = textInputLayout8;
        this.stateEt = ajioEditText9;
        this.stateTextInput = textInputLayout9;
        this.toolbarReset = textView5;
        this.topHeaderView = constraintLayout3;
    }

    public static CartAddAddressRevampBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.add_address_btn_save;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.add_address_title;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (TextView)view2;
            if (view3 != null) {
                n3 = R$id.addresscontainer;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (NestedScrollView)view2;
                if (object3 != null) {
                    n3 = R$id.ajio_loader_view;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioLoaderView)view2;
                    if (object4 != null) {
                        n3 = R$id.area_locality_et;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (AjioEditText)view2;
                        if (object5 != null) {
                            n3 = R$id.area_locality_text_input;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (TextInputLayout)view2;
                            if (object6 != null) {
                                n3 = R$id.checkBox;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (AppCompatCheckBox)view2;
                                if (object7 != null) {
                                    n3 = R$id.city_et;
                                    Object object8 = view2 = dd2_2.a(n3, view);
                                    object8 = (AjioEditText)view2;
                                    if (object8 != null) {
                                        n3 = R$id.city_text_input;
                                        Object object9 = view2 = dd2_2.a(n3, view);
                                        object9 = (TextInputLayout)view2;
                                        if (object9 != null) {
                                            n3 = R$id.close_dialog;
                                            Object object10 = view2 = dd2_2.a(n3, view);
                                            object10 = (AppCompatImageView)view2;
                                            if (object10 != null) {
                                                n3 = R$id.constraint_address_info;
                                                Object object11 = view2 = dd2_2.a(n3, view);
                                                object11 = (ConstraintLayout)view2;
                                                if (object11 != null) {
                                                    n3 = R$id.constraint_contact_info;
                                                    Object object12 = view2 = dd2_2.a(n3, view);
                                                    object12 = (ConstraintLayout)view2;
                                                    if (object12 != null) {
                                                        n3 = R$id.faaEtAddressType;
                                                        Object object13 = view2 = dd2_2.a(n3, view);
                                                        object13 = (AjioEditText)view2;
                                                        if (object13 != null) {
                                                            n3 = R$id.faaEtName;
                                                            Object object14 = view2 = dd2_2.a(n3, view);
                                                            object14 = (AjioEditText)view2;
                                                            if (object14 != null) {
                                                                n3 = R$id.faaLayoutAddressType;
                                                                View view4 = view2 = dd2_2.a(n3, view);
                                                                view4 = (LinearLayout)view2;
                                                                if (view4 != null) {
                                                                    n3 = R$id.faaRbHome;
                                                                    Object object15 = view2 = dd2_2.a(n3, view);
                                                                    object15 = (AjioRadioButton)view2;
                                                                    if (object15 != null) {
                                                                        n3 = R$id.faaRbOthers;
                                                                        Object object16 = view2 = dd2_2.a(n3, view);
                                                                        object16 = (AjioRadioButton)view2;
                                                                        if (object16 != null) {
                                                                            n3 = R$id.faaRbWork;
                                                                            Object object17 = view2 = dd2_2.a(n3, view);
                                                                            object17 = (AjioRadioButton)view2;
                                                                            if (object17 != null) {
                                                                                n3 = R$id.faaRgAddressType;
                                                                                View view5 = view2 = dd2_2.a(n3, view);
                                                                                view5 = (RadioGroup)view2;
                                                                                if (view5 != null) {
                                                                                    n3 = R$id.faaTilAddressType;
                                                                                    Object object18 = view2 = dd2_2.a(n3, view);
                                                                                    object18 = (TextInputLayout)view2;
                                                                                    if (object18 != null) {
                                                                                        n3 = R$id.faaTilName;
                                                                                        Object object19 = view2 = dd2_2.a(n3, view);
                                                                                        object19 = (TextInputLayout)view2;
                                                                                        if (object19 != null) {
                                                                                            n3 = R$id.faaTvAddressInfo;
                                                                                            View view6 = view2 = dd2_2.a(n3, view);
                                                                                            view6 = (TextView)view2;
                                                                                            if (view6 != null) {
                                                                                                n3 = R$id.faaTvAddressType;
                                                                                                View view7 = view2 = dd2_2.a(n3, view);
                                                                                                view7 = (TextView)view2;
                                                                                                if (view7 != null) {
                                                                                                    View view8;
                                                                                                    View view9;
                                                                                                    View view10;
                                                                                                    n3 = R$id.faaTvContactInfo;
                                                                                                    View view11 = view2 = dd2_2.a(n3, view);
                                                                                                    view11 = (TextView)view2;
                                                                                                    if (view11 != null && (view10 = dd2_2.a(n3 = R$id.faaVAISep, view)) != null && (view9 = dd2_2.a(n3 = R$id.faaVAdSep, view)) != null && (view8 = dd2_2.a(n3 = R$id.faaVCISep, view)) != null) {
                                                                                                        n3 = R$id.flat_building_et;
                                                                                                        Object object20 = view2 = dd2_2.a(n3, view);
                                                                                                        object20 = (AjioEditText)view2;
                                                                                                        if (object20 != null) {
                                                                                                            n3 = R$id.flat_building_text_input;
                                                                                                            Object object21 = view2 = dd2_2.a(n3, view);
                                                                                                            object21 = (TextInputLayout)view2;
                                                                                                            if (object21 != null) {
                                                                                                                n3 = R$id.iv_back_click;
                                                                                                                Object object22 = view2 = dd2_2.a(n3, view);
                                                                                                                object22 = (AppCompatImageView)view2;
                                                                                                                if (object22 != null) {
                                                                                                                    n3 = R$id.landmark_et;
                                                                                                                    Object object23 = view2 = dd2_2.a(n3, view);
                                                                                                                    object23 = (AjioEditText)view2;
                                                                                                                    if (object23 != null) {
                                                                                                                        n3 = R$id.landmark_text_input;
                                                                                                                        Object object24 = view2 = dd2_2.a(n3, view);
                                                                                                                        object24 = (TextInputLayout)view2;
                                                                                                                        if (object24 != null) {
                                                                                                                            n3 = R$id.ll_add_address_btn;
                                                                                                                            View view12 = view2 = dd2_2.a(n3, view);
                                                                                                                            view12 = (LinearLayout)view2;
                                                                                                                            if (view12 != null) {
                                                                                                                                n3 = R$id.mobile_et;
                                                                                                                                Object object25 = view2 = dd2_2.a(n3, view);
                                                                                                                                object25 = (AjioEditText)view2;
                                                                                                                                if (object25 != null) {
                                                                                                                                    n3 = R$id.mobile_text_input;
                                                                                                                                    Object object26 = view2 = dd2_2.a(n3, view);
                                                                                                                                    object26 = (TextInputLayout)view2;
                                                                                                                                    if (object26 != null) {
                                                                                                                                        n3 = R$id.pincode_et;
                                                                                                                                        Object object27 = view2 = dd2_2.a(n3, view);
                                                                                                                                        object27 = (AjioEditText)view2;
                                                                                                                                        if (object27 != null) {
                                                                                                                                            n3 = R$id.pincode_text_input;
                                                                                                                                            Object object28 = view2 = dd2_2.a(n3, view);
                                                                                                                                            object28 = (TextInputLayout)view2;
                                                                                                                                            if (object28 != null) {
                                                                                                                                                n3 = R$id.state_et;
                                                                                                                                                Object object29 = view2 = dd2_2.a(n3, view);
                                                                                                                                                object29 = (AjioEditText)view2;
                                                                                                                                                if (object29 != null) {
                                                                                                                                                    n3 = R$id.state_text_input;
                                                                                                                                                    Object object30 = view2 = dd2_2.a(n3, view);
                                                                                                                                                    object30 = (TextInputLayout)view2;
                                                                                                                                                    if (object30 != null) {
                                                                                                                                                        n3 = R$id.toolbar_reset;
                                                                                                                                                        View view13 = view2 = dd2_2.a(n3, view);
                                                                                                                                                        view13 = (TextView)view2;
                                                                                                                                                        if (view13 != null) {
                                                                                                                                                            n3 = R$id.top_header_view;
                                                                                                                                                            Object object31 = view2 = dd2_2.a(n3, view);
                                                                                                                                                            object31 = (ConstraintLayout)view2;
                                                                                                                                                            if (object31 != null) {
                                                                                                                                                                View view14 = view;
                                                                                                                                                                view14 = (RelativeLayout)view;
                                                                                                                                                                CartAddAddressRevampBinding cartAddAddressRevampBinding = new CartAddAddressRevampBinding((RelativeLayout)view14, (AjioTextView)object2, (TextView)view3, (NestedScrollView)object3, (AjioLoaderView)((Object)object4), (AjioEditText)object5, (TextInputLayout)((Object)object6), (AppCompatCheckBox)object7, (AjioEditText)object8, (TextInputLayout)((Object)object9), (AppCompatImageView)((Object)object10), (ConstraintLayout)((Object)object11), (ConstraintLayout)((Object)object12), (AjioEditText)object13, (AjioEditText)object14, (LinearLayout)view4, (AjioRadioButton)object15, (AjioRadioButton)object16, (AjioRadioButton)object17, (RadioGroup)view5, (TextInputLayout)((Object)object18), (TextInputLayout)((Object)object19), (TextView)view6, (TextView)view7, (TextView)view11, view10, view9, view8, (AjioEditText)object20, (TextInputLayout)((Object)object21), (AppCompatImageView)((Object)object22), (AjioEditText)object23, (TextInputLayout)((Object)object24), (LinearLayout)view12, (AjioEditText)object25, (TextInputLayout)((Object)object26), (AjioEditText)object27, (TextInputLayout)((Object)object28), (AjioEditText)object29, (TextInputLayout)((Object)object30), (TextView)view13, (ConstraintLayout)((Object)object31));
                                                                                                                                                                return cartAddAddressRevampBinding;
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

    public static CartAddAddressRevampBinding inflate(LayoutInflater layoutInflater) {
        return CartAddAddressRevampBinding.inflate(layoutInflater, null, false);
    }

    public static CartAddAddressRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_add_address_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartAddAddressRevampBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}


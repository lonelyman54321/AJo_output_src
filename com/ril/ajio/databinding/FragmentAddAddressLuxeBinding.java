/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  android.widget.RadioGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioRadioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.LuxeUnderLineTextView;

public final class FragmentAddAddressLuxeBinding
implements BC3 {
    public final AjioTextView addAddressBtnSave;
    public final AjioProgressView addaddressProgressview;
    public final ImageButton addressBack;
    public final AjioTextView addressTitleTv;
    public final NestedScrollView addresscontainer;
    public final AjioLoaderView ajioLoaderView;
    public final AppBarLayout appBarLayout;
    public final AjioEditText areaLocalityEt;
    public final TextInputLayout areaLocalityTextInput;
    public final AppCompatCheckBox checkBox;
    public final AjioEditText cityEt;
    public final TextInputLayout cityTextInput;
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
    public final View faaVTopSep;
    public final AjioEditText flatBuildingEt;
    public final TextInputLayout flatBuildingTextInput;
    public final AjioEditText landmarkEt;
    public final TextInputLayout landmarkTextInput;
    public final AjioEditText mobileEt;
    public final TextInputLayout mobileTextInput;
    public final AjioEditText pincodeEt;
    public final TextInputLayout pincodeTextInput;
    private final CoordinatorLayout rootView;
    public final AjioEditText stateEt;
    public final TextInputLayout stateTextInput;
    public final LuxeUnderLineTextView toolbarReset;

    private FragmentAddAddressLuxeBinding(CoordinatorLayout coordinatorLayout, AjioTextView ajioTextView, AjioProgressView ajioProgressView, ImageButton imageButton, AjioTextView ajioTextView2, NestedScrollView nestedScrollView, AjioLoaderView ajioLoaderView, AppBarLayout appBarLayout, AjioEditText ajioEditText, TextInputLayout textInputLayout, AppCompatCheckBox appCompatCheckBox, AjioEditText ajioEditText2, TextInputLayout textInputLayout2, AjioEditText ajioEditText3, AjioEditText ajioEditText4, LinearLayout linearLayout, AjioRadioButton ajioRadioButton, AjioRadioButton ajioRadioButton2, AjioRadioButton ajioRadioButton3, RadioGroup radioGroup, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextView textView, TextView textView2, TextView textView3, View view, View view2, View view3, View view4, AjioEditText ajioEditText5, TextInputLayout textInputLayout5, AjioEditText ajioEditText6, TextInputLayout textInputLayout6, AjioEditText ajioEditText7, TextInputLayout textInputLayout7, AjioEditText ajioEditText8, TextInputLayout textInputLayout8, AjioEditText ajioEditText9, TextInputLayout textInputLayout9, LuxeUnderLineTextView luxeUnderLineTextView) {
        this.rootView = coordinatorLayout;
        this.addAddressBtnSave = ajioTextView;
        this.addaddressProgressview = ajioProgressView;
        this.addressBack = imageButton;
        this.addressTitleTv = ajioTextView2;
        this.addresscontainer = nestedScrollView;
        this.ajioLoaderView = ajioLoaderView;
        this.appBarLayout = appBarLayout;
        this.areaLocalityEt = ajioEditText;
        this.areaLocalityTextInput = textInputLayout;
        this.checkBox = appCompatCheckBox;
        this.cityEt = ajioEditText2;
        this.cityTextInput = textInputLayout2;
        this.faaEtAddressType = ajioEditText3;
        this.faaEtName = ajioEditText4;
        this.faaLayoutAddressType = linearLayout;
        this.faaRbHome = ajioRadioButton;
        this.faaRbOthers = ajioRadioButton2;
        this.faaRbWork = ajioRadioButton3;
        this.faaRgAddressType = radioGroup;
        this.faaTilAddressType = textInputLayout3;
        this.faaTilName = textInputLayout4;
        this.faaTvAddressInfo = textView;
        this.faaTvAddressType = textView2;
        this.faaTvContactInfo = textView3;
        this.faaVAISep = view;
        this.faaVAdSep = view2;
        this.faaVCISep = view3;
        this.faaVTopSep = view4;
        this.flatBuildingEt = ajioEditText5;
        this.flatBuildingTextInput = textInputLayout5;
        this.landmarkEt = ajioEditText6;
        this.landmarkTextInput = textInputLayout6;
        this.mobileEt = ajioEditText7;
        this.mobileTextInput = textInputLayout7;
        this.pincodeEt = ajioEditText8;
        this.pincodeTextInput = textInputLayout8;
        this.stateEt = ajioEditText9;
        this.stateTextInput = textInputLayout9;
        this.toolbarReset = luxeUnderLineTextView;
    }

    public static FragmentAddAddressLuxeBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.add_address_btn_save;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.addaddress_progressview;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioProgressView)view2;
            if (object3 != null) {
                n3 = R$id.address_back;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (ImageButton)view2;
                if (view3 != null) {
                    n3 = R$id.address_title_tv;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        n3 = R$id.addresscontainer;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (NestedScrollView)view2;
                        if (object5 != null) {
                            n3 = R$id.ajio_loader_view;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (AjioLoaderView)view2;
                            if (object6 != null) {
                                n3 = R$id.app_bar_layout;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (AppBarLayout)view2;
                                if (object7 != null) {
                                    n3 = R$id.area_locality_et;
                                    Object object8 = view2 = dd2_2.a(n3, view);
                                    object8 = (AjioEditText)view2;
                                    if (object8 != null) {
                                        n3 = R$id.area_locality_text_input;
                                        Object object9 = view2 = dd2_2.a(n3, view);
                                        object9 = (TextInputLayout)view2;
                                        if (object9 != null) {
                                            n3 = R$id.checkBox;
                                            Object object10 = view2 = dd2_2.a(n3, view);
                                            object10 = (AppCompatCheckBox)view2;
                                            if (object10 != null) {
                                                n3 = R$id.city_et;
                                                Object object11 = view2 = dd2_2.a(n3, view);
                                                object11 = (AjioEditText)view2;
                                                if (object11 != null) {
                                                    n3 = R$id.city_text_input;
                                                    Object object12 = view2 = dd2_2.a(n3, view);
                                                    object12 = (TextInputLayout)view2;
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
                                                                                                    View view11;
                                                                                                    n3 = R$id.faaTvContactInfo;
                                                                                                    View view12 = view2 = dd2_2.a(n3, view);
                                                                                                    view12 = (TextView)view2;
                                                                                                    if (view12 != null && (view11 = dd2_2.a(n3 = R$id.faaVAISep, view)) != null && (view10 = dd2_2.a(n3 = R$id.faaVAdSep, view)) != null && (view9 = dd2_2.a(n3 = R$id.faaVCISep, view)) != null && (view8 = dd2_2.a(n3 = R$id.faaVTopSep, view)) != null) {
                                                                                                        n3 = R$id.flat_building_et;
                                                                                                        Object object20 = view2 = dd2_2.a(n3, view);
                                                                                                        object20 = (AjioEditText)view2;
                                                                                                        if (object20 != null) {
                                                                                                            n3 = R$id.flat_building_text_input;
                                                                                                            Object object21 = view2 = dd2_2.a(n3, view);
                                                                                                            object21 = (TextInputLayout)view2;
                                                                                                            if (object21 != null) {
                                                                                                                n3 = R$id.landmark_et;
                                                                                                                Object object22 = view2 = dd2_2.a(n3, view);
                                                                                                                object22 = (AjioEditText)view2;
                                                                                                                if (object22 != null) {
                                                                                                                    n3 = R$id.landmark_text_input;
                                                                                                                    Object object23 = view2 = dd2_2.a(n3, view);
                                                                                                                    object23 = (TextInputLayout)view2;
                                                                                                                    if (object23 != null) {
                                                                                                                        n3 = R$id.mobile_et;
                                                                                                                        Object object24 = view2 = dd2_2.a(n3, view);
                                                                                                                        object24 = (AjioEditText)view2;
                                                                                                                        if (object24 != null) {
                                                                                                                            n3 = R$id.mobile_text_input;
                                                                                                                            Object object25 = view2 = dd2_2.a(n3, view);
                                                                                                                            object25 = (TextInputLayout)view2;
                                                                                                                            if (object25 != null) {
                                                                                                                                n3 = R$id.pincode_et;
                                                                                                                                Object object26 = view2 = dd2_2.a(n3, view);
                                                                                                                                object26 = (AjioEditText)view2;
                                                                                                                                if (object26 != null) {
                                                                                                                                    n3 = R$id.pincode_text_input;
                                                                                                                                    Object object27 = view2 = dd2_2.a(n3, view);
                                                                                                                                    object27 = (TextInputLayout)view2;
                                                                                                                                    if (object27 != null) {
                                                                                                                                        n3 = R$id.state_et;
                                                                                                                                        Object object28 = view2 = dd2_2.a(n3, view);
                                                                                                                                        object28 = (AjioEditText)view2;
                                                                                                                                        if (object28 != null) {
                                                                                                                                            n3 = R$id.state_text_input;
                                                                                                                                            Object object29 = view2 = dd2_2.a(n3, view);
                                                                                                                                            object29 = (TextInputLayout)view2;
                                                                                                                                            if (object29 != null) {
                                                                                                                                                n3 = R$id.toolbar_reset;
                                                                                                                                                Object object30 = view2 = dd2_2.a(n3, view);
                                                                                                                                                object30 = (LuxeUnderLineTextView)view2;
                                                                                                                                                if (object30 != null) {
                                                                                                                                                    Object object31 = view;
                                                                                                                                                    object31 = (CoordinatorLayout)view;
                                                                                                                                                    FragmentAddAddressLuxeBinding fragmentAddAddressLuxeBinding = new FragmentAddAddressLuxeBinding((CoordinatorLayout)object31, (AjioTextView)object2, (AjioProgressView)((Object)object3), (ImageButton)view3, (AjioTextView)object4, (NestedScrollView)object5, (AjioLoaderView)((Object)object6), (AppBarLayout)object7, (AjioEditText)object8, (TextInputLayout)((Object)object9), (AppCompatCheckBox)object10, (AjioEditText)object11, (TextInputLayout)((Object)object12), (AjioEditText)object13, (AjioEditText)object14, (LinearLayout)view4, (AjioRadioButton)object15, (AjioRadioButton)object16, (AjioRadioButton)object17, (RadioGroup)view5, (TextInputLayout)((Object)object18), (TextInputLayout)((Object)object19), (TextView)view6, (TextView)view7, (TextView)view12, view11, view10, view9, view8, (AjioEditText)object20, (TextInputLayout)((Object)object21), (AjioEditText)object22, (TextInputLayout)((Object)object23), (AjioEditText)object24, (TextInputLayout)((Object)object25), (AjioEditText)object26, (TextInputLayout)((Object)object27), (AjioEditText)object28, (TextInputLayout)((Object)object29), (LuxeUnderLineTextView)object30);
                                                                                                                                                    return fragmentAddAddressLuxeBinding;
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

    public static FragmentAddAddressLuxeBinding inflate(LayoutInflater layoutInflater) {
        return FragmentAddAddressLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentAddAddressLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_add_address_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentAddAddressLuxeBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}


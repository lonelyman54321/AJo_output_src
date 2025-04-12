/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentCartAddressRevampBinding
implements BC3 {
    public final ConstraintLayout addressBottomView;
    public final Button btEnableAppLocation;
    public final Button btEnableLocation;
    public final RecyclerView cartAddressRv;
    public final AjioTextView cartAddressTvName;
    public final AjioLoaderView checkoutAddressLoader;
    public final ConstraintLayout clAppPermissionOff;
    public final ConstraintLayout clLocationPermissionOff;
    public final AppCompatImageView closeDialog;
    public final ConstraintLayout currentLocationContainer;
    public final AppCompatImageView enableAppLocation;
    public final AppCompatImageView enableLocation;
    public final AppCompatImageView imgCurrentLocation;
    public final View labVSep;
    public final View lineSeparator;
    public final View lineSeparator1;
    private final ConstraintLayout rootView;
    public final AjioTextView tvAddNewAddress;
    public final AjioTextView tvAppLocationOff;
    public final AjioTextView tvCartUseCurrentLocation;
    public final AjioTextView tvEnterNewPincode;
    public final AjioTextView tvLocationInf;
    public final AjioTextView tvLocationInfo;
    public final AjioTextView tvLocationOff;

    private FragmentCartAddressRevampBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Button button, Button button2, RecyclerView recyclerView, AjioTextView ajioTextView, AjioLoaderView ajioLoaderView, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout5, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, View view, View view2, View view3, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8) {
        this.rootView = constraintLayout;
        this.addressBottomView = constraintLayout2;
        this.btEnableAppLocation = button;
        this.btEnableLocation = button2;
        this.cartAddressRv = recyclerView;
        this.cartAddressTvName = ajioTextView;
        this.checkoutAddressLoader = ajioLoaderView;
        this.clAppPermissionOff = constraintLayout3;
        this.clLocationPermissionOff = constraintLayout4;
        this.closeDialog = appCompatImageView;
        this.currentLocationContainer = constraintLayout5;
        this.enableAppLocation = appCompatImageView2;
        this.enableLocation = appCompatImageView3;
        this.imgCurrentLocation = appCompatImageView4;
        this.labVSep = view;
        this.lineSeparator = view2;
        this.lineSeparator1 = view3;
        this.tvAddNewAddress = ajioTextView2;
        this.tvAppLocationOff = ajioTextView3;
        this.tvCartUseCurrentLocation = ajioTextView4;
        this.tvEnterNewPincode = ajioTextView5;
        this.tvLocationInf = ajioTextView6;
        this.tvLocationInfo = ajioTextView7;
        this.tvLocationOff = ajioTextView8;
    }

    public static FragmentCartAddressRevampBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.address_bottom_view;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (ConstraintLayout)view2;
        if (object2 != null) {
            n3 = R$id.bt_enable_app_location;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (Button)view2;
            if (view3 != null) {
                n3 = R$id.bt_enable_location;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (Button)view2;
                if (view4 != null) {
                    n3 = R$id.cart_address_rv;
                    Object object3 = view2 = dd2_2.a(n3, view);
                    object3 = (RecyclerView)view2;
                    if (object3 != null) {
                        n3 = R$id.cart_address_tv_name;
                        Object object4 = view2 = dd2_2.a(n3, view);
                        object4 = (AjioTextView)view2;
                        if (object4 != null) {
                            n3 = R$id.checkout_address_loader;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (AjioLoaderView)view2;
                            if (object5 != null) {
                                n3 = R$id.cl_app_permission_off;
                                Object object6 = view2 = dd2_2.a(n3, view);
                                object6 = (ConstraintLayout)view2;
                                if (object6 != null) {
                                    n3 = R$id.cl_location_permission_off;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (ConstraintLayout)view2;
                                    if (object7 != null) {
                                        n3 = R$id.close_dialog;
                                        Object object8 = view2 = dd2_2.a(n3, view);
                                        object8 = (AppCompatImageView)view2;
                                        if (object8 != null) {
                                            n3 = R$id.current_location_container;
                                            Object object9 = view2 = dd2_2.a(n3, view);
                                            object9 = (ConstraintLayout)view2;
                                            if (object9 != null) {
                                                n3 = R$id.enable_app_location;
                                                Object object10 = view2 = dd2_2.a(n3, view);
                                                object10 = (AppCompatImageView)view2;
                                                if (object10 != null) {
                                                    n3 = R$id.enable_location;
                                                    Object object11 = view2 = dd2_2.a(n3, view);
                                                    object11 = (AppCompatImageView)view2;
                                                    if (object11 != null) {
                                                        View view5;
                                                        View view6;
                                                        View view7;
                                                        n3 = R$id.img_current_location;
                                                        Object object12 = view2 = dd2_2.a(n3, view);
                                                        object12 = (AppCompatImageView)view2;
                                                        if (object12 != null && (view7 = dd2_2.a(n3 = R$id.labVSep, view)) != null && (view6 = dd2_2.a(n3 = R$id.line_separator, view)) != null && (view5 = dd2_2.a(n3 = R$id.line_separator1, view)) != null) {
                                                            n3 = R$id.tv_add_new_address;
                                                            Object object13 = view2 = dd2_2.a(n3, view);
                                                            object13 = (AjioTextView)view2;
                                                            if (object13 != null) {
                                                                n3 = R$id.tv_app_location_off;
                                                                Object object14 = view2 = dd2_2.a(n3, view);
                                                                object14 = (AjioTextView)view2;
                                                                if (object14 != null) {
                                                                    n3 = R$id.tv_cart_use_current_location;
                                                                    Object object15 = view2 = dd2_2.a(n3, view);
                                                                    object15 = (AjioTextView)view2;
                                                                    if (object15 != null) {
                                                                        n3 = R$id.tv_enter_new_pincode;
                                                                        Object object16 = view2 = dd2_2.a(n3, view);
                                                                        object16 = (AjioTextView)view2;
                                                                        if (object16 != null) {
                                                                            n3 = R$id.tv_location_inf;
                                                                            Object object17 = view2 = dd2_2.a(n3, view);
                                                                            object17 = (AjioTextView)view2;
                                                                            if (object17 != null) {
                                                                                n3 = R$id.tv_location_info;
                                                                                Object object18 = view2 = dd2_2.a(n3, view);
                                                                                object18 = (AjioTextView)view2;
                                                                                if (object18 != null) {
                                                                                    n3 = R$id.tv_location_off;
                                                                                    Object object19 = view2 = dd2_2.a(n3, view);
                                                                                    object19 = (AjioTextView)view2;
                                                                                    if (object19 != null) {
                                                                                        Object object20 = view;
                                                                                        object20 = (ConstraintLayout)view;
                                                                                        FragmentCartAddressRevampBinding fragmentCartAddressRevampBinding = new FragmentCartAddressRevampBinding((ConstraintLayout)((Object)object20), (ConstraintLayout)((Object)object2), (Button)view3, (Button)view4, (RecyclerView)object3, (AjioTextView)object4, (AjioLoaderView)((Object)object5), (ConstraintLayout)((Object)object6), (ConstraintLayout)((Object)object7), (AppCompatImageView)((Object)object8), (ConstraintLayout)((Object)object9), (AppCompatImageView)((Object)object10), (AppCompatImageView)((Object)object11), (AppCompatImageView)((Object)object12), view7, view6, view5, (AjioTextView)object13, (AjioTextView)object14, (AjioTextView)object15, (AjioTextView)object16, (AjioTextView)object17, (AjioTextView)object18, (AjioTextView)object19);
                                                                                        return fragmentCartAddressRevampBinding;
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

    public static FragmentCartAddressRevampBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCartAddressRevampBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCartAddressRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_cart_address_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCartAddressRevampBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


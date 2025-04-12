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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentCartAddressLuxBinding
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
    public final View dividerAddDeliveryAddress;
    public final View dividerChooseDeliveryAddress;
    public final AppCompatImageView enableAppLocation;
    public final AppCompatImageView enableLocation;
    public final AppCompatImageView imgCurrentLocation;
    public final View lineSeparator1;
    private final CoordinatorLayout rootView;
    public final AjioTextView tvAddNewAddress;
    public final AjioTextView tvAppLocationOff;
    public final AjioTextView tvCartUseCurrentLocation;
    public final AjioTextView tvEnterNewPincode;
    public final AjioTextView tvLocationInf;
    public final AjioTextView tvLocationInfo;
    public final AjioTextView tvLocationOff;
    public final View viewBg2;
    public final View viewBg3;

    private FragmentCartAddressLuxBinding(CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, Button button, Button button2, RecyclerView recyclerView, AjioTextView ajioTextView, AjioLoaderView ajioLoaderView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout4, View view, View view2, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, View view3, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, View view4, View view5) {
        this.rootView = coordinatorLayout;
        this.addressBottomView = constraintLayout;
        this.btEnableAppLocation = button;
        this.btEnableLocation = button2;
        this.cartAddressRv = recyclerView;
        this.cartAddressTvName = ajioTextView;
        this.checkoutAddressLoader = ajioLoaderView;
        this.clAppPermissionOff = constraintLayout2;
        this.clLocationPermissionOff = constraintLayout3;
        this.closeDialog = appCompatImageView;
        this.currentLocationContainer = constraintLayout4;
        this.dividerAddDeliveryAddress = view;
        this.dividerChooseDeliveryAddress = view2;
        this.enableAppLocation = appCompatImageView2;
        this.enableLocation = appCompatImageView3;
        this.imgCurrentLocation = appCompatImageView4;
        this.lineSeparator1 = view3;
        this.tvAddNewAddress = ajioTextView2;
        this.tvAppLocationOff = ajioTextView3;
        this.tvCartUseCurrentLocation = ajioTextView4;
        this.tvEnterNewPincode = ajioTextView5;
        this.tvLocationInf = ajioTextView6;
        this.tvLocationInfo = ajioTextView7;
        this.tvLocationOff = ajioTextView8;
        this.viewBg2 = view4;
        this.viewBg3 = view5;
    }

    public static FragmentCartAddressLuxBinding bind(View view) {
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
                                            View view5;
                                            View view6;
                                            n3 = R$id.current_location_container;
                                            Object object9 = view2 = dd2_2.a(n3, view);
                                            object9 = (ConstraintLayout)view2;
                                            if (object9 != null && (view6 = dd2_2.a(n3 = R$id.divider_add_delivery_address, view)) != null && (view5 = dd2_2.a(n3 = R$id.divider_choose_delivery_address, view)) != null) {
                                                n3 = R$id.enable_app_location;
                                                Object object10 = view2 = dd2_2.a(n3, view);
                                                object10 = (AppCompatImageView)view2;
                                                if (object10 != null) {
                                                    n3 = R$id.enable_location;
                                                    Object object11 = view2 = dd2_2.a(n3, view);
                                                    object11 = (AppCompatImageView)view2;
                                                    if (object11 != null) {
                                                        View view7;
                                                        n3 = R$id.img_current_location;
                                                        Object object12 = view2 = dd2_2.a(n3, view);
                                                        object12 = (AppCompatImageView)view2;
                                                        if (object12 != null && (view7 = dd2_2.a(n3 = R$id.line_separator1, view)) != null) {
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
                                                                                    View view8;
                                                                                    View view9;
                                                                                    n3 = R$id.tv_location_off;
                                                                                    Object object19 = view2 = dd2_2.a(n3, view);
                                                                                    object19 = (AjioTextView)view2;
                                                                                    if (object19 != null && (view9 = dd2_2.a(n3 = R$id.view_bg2, view)) != null && (view8 = dd2_2.a(n3 = R$id.view_bg3, view)) != null) {
                                                                                        Object object20 = view;
                                                                                        object20 = (CoordinatorLayout)view;
                                                                                        FragmentCartAddressLuxBinding fragmentCartAddressLuxBinding = new FragmentCartAddressLuxBinding((CoordinatorLayout)object20, (ConstraintLayout)((Object)object2), (Button)view3, (Button)view4, (RecyclerView)object3, (AjioTextView)object4, (AjioLoaderView)((Object)object5), (ConstraintLayout)((Object)object6), (ConstraintLayout)((Object)object7), (AppCompatImageView)((Object)object8), (ConstraintLayout)((Object)object9), view6, view5, (AppCompatImageView)((Object)object10), (AppCompatImageView)((Object)object11), (AppCompatImageView)((Object)object12), view7, (AjioTextView)object13, (AjioTextView)object14, (AjioTextView)object15, (AjioTextView)object16, (AjioTextView)object17, (AjioTextView)object18, (AjioTextView)object19, view9, view8);
                                                                                        return fragmentCartAddressLuxBinding;
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

    public static FragmentCartAddressLuxBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCartAddressLuxBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCartAddressLuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_cart_address_lux;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCartAddressLuxBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}


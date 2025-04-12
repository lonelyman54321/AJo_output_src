/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class CartLocationBottomSheetBinding
implements BC3 {
    public final AppCompatImageView closeDialog;
    public final Button confirmButton;
    public final Button editButton;
    public final ConstraintLayout fetchingLocationLayout;
    public final ProgressBar fetchingProgressBar;
    public final ImageView loadingIcon;
    public final ConstraintLayout locationDetailsLayout;
    public final ImageView locationIcon;
    private final ConstraintLayout rootView;
    public final TextView tvAddress;
    public final TextView tvFetchingLocation;
    public final TextView tvPinCode;

    private CartLocationBottomSheetBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, Button button, Button button2, ConstraintLayout constraintLayout2, ProgressBar progressBar, ImageView imageView, ConstraintLayout constraintLayout3, ImageView imageView2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.closeDialog = appCompatImageView;
        this.confirmButton = button;
        this.editButton = button2;
        this.fetchingLocationLayout = constraintLayout2;
        this.fetchingProgressBar = progressBar;
        this.loadingIcon = imageView;
        this.locationDetailsLayout = constraintLayout3;
        this.locationIcon = imageView2;
        this.tvAddress = textView;
        this.tvFetchingLocation = textView2;
        this.tvPinCode = textView3;
    }

    public static CartLocationBottomSheetBinding bind(View object) {
        View view;
        int n3 = R$id.close_dialog;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view;
        if (object2 != null) {
            n3 = R$id.confirmButton;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (Button)view;
            if (view2 != null) {
                n3 = R$id.editButton;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (Button)view;
                if (view3 != null) {
                    n3 = R$id.fetchingLocationLayout;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (ConstraintLayout)view;
                    if (object3 != null) {
                        n3 = R$id.fetchingProgressBar;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (ProgressBar)view;
                        if (view4 != null) {
                            n3 = R$id.loadingIcon;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (ImageView)view;
                            if (view5 != null) {
                                n3 = R$id.locationDetailsLayout;
                                Object object4 = view = dd2_2.a(n3, object);
                                object4 = (ConstraintLayout)view;
                                if (object4 != null) {
                                    n3 = R$id.locationIcon;
                                    View view6 = view = dd2_2.a(n3, object);
                                    view6 = (ImageView)view;
                                    if (view6 != null) {
                                        n3 = R$id.tv_address;
                                        View view7 = view = dd2_2.a(n3, object);
                                        view7 = (TextView)view;
                                        if (view7 != null) {
                                            n3 = R$id.tv_fetching_location;
                                            View view8 = view = dd2_2.a(n3, object);
                                            view8 = (TextView)view;
                                            if (view8 != null) {
                                                n3 = R$id.tv_pinCode;
                                                View view9 = view = dd2_2.a(n3, object);
                                                view9 = (TextView)view;
                                                if (view9 != null) {
                                                    Object object5 = object;
                                                    object5 = (ConstraintLayout)((Object)object);
                                                    CartLocationBottomSheetBinding cartLocationBottomSheetBinding = new CartLocationBottomSheetBinding((ConstraintLayout)((Object)object5), (AppCompatImageView)((Object)object2), (Button)view2, (Button)view3, (ConstraintLayout)((Object)object3), (ProgressBar)view4, (ImageView)view5, (ConstraintLayout)((Object)object4), (ImageView)view6, (TextView)view7, (TextView)view8, (TextView)view9);
                                                    return cartLocationBottomSheetBinding;
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
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CartLocationBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return CartLocationBottomSheetBinding.inflate(layoutInflater, null, false);
    }

    public static CartLocationBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_location_bottom_sheet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartLocationBottomSheetBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentDeliveryAddressBottomSheetLuxeBinding
implements BC3 {
    public final View fdabsClose;
    public final ImageView fdabsIvClose;
    public final LinearLayout fdabsLayoutContent;
    public final TextView fdabsTvAddress;
    public final TextView fdabsTvCod;
    public final TextView fdabsTvDeliDate;
    public final TextView fdabsTvDeliHeader;
    public final TextView fdabsTvHeader;
    public final TextView fdabsTvName;
    public final TextView fdabsTvPhone;
    public final TextView fdabsTvPhoneHeader;
    public final View fdabsVSep;
    private final ConstraintLayout rootView;

    private FragmentDeliveryAddressBottomSheetLuxeBinding(ConstraintLayout constraintLayout, View view, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, View view2) {
        this.rootView = constraintLayout;
        this.fdabsClose = view;
        this.fdabsIvClose = imageView;
        this.fdabsLayoutContent = linearLayout;
        this.fdabsTvAddress = textView;
        this.fdabsTvCod = textView2;
        this.fdabsTvDeliDate = textView3;
        this.fdabsTvDeliHeader = textView4;
        this.fdabsTvHeader = textView5;
        this.fdabsTvName = textView6;
        this.fdabsTvPhone = textView7;
        this.fdabsTvPhoneHeader = textView8;
        this.fdabsVSep = view2;
    }

    public static FragmentDeliveryAddressBottomSheetLuxeBinding bind(View object) {
        int n3 = R$id.fdabsClose;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            Object object2;
            n3 = R$id.fdabsIvClose;
            View view2 = object2 = dd2_2.a(n3, object);
            view2 = (ImageView)object2;
            if (view2 != null) {
                n3 = R$id.fdabsLayoutContent;
                View view3 = object2 = dd2_2.a(n3, object);
                view3 = (LinearLayout)object2;
                if (view3 != null) {
                    n3 = R$id.fdabsTvAddress;
                    View view4 = object2 = dd2_2.a(n3, object);
                    view4 = (TextView)object2;
                    if (view4 != null) {
                        n3 = R$id.fdabsTvCod;
                        View view5 = object2 = dd2_2.a(n3, object);
                        view5 = (TextView)object2;
                        if (view5 != null) {
                            n3 = R$id.fdabsTvDeliDate;
                            View view6 = object2 = dd2_2.a(n3, object);
                            view6 = (TextView)object2;
                            if (view6 != null) {
                                n3 = R$id.fdabsTvDeliHeader;
                                View view7 = object2 = dd2_2.a(n3, object);
                                view7 = (TextView)object2;
                                if (view7 != null) {
                                    n3 = R$id.fdabsTvHeader;
                                    View view8 = object2 = dd2_2.a(n3, object);
                                    view8 = (TextView)object2;
                                    if (view8 != null) {
                                        n3 = R$id.fdabsTvName;
                                        View view9 = object2 = dd2_2.a(n3, object);
                                        view9 = (TextView)object2;
                                        if (view9 != null) {
                                            n3 = R$id.fdabsTvPhone;
                                            View view10 = object2 = dd2_2.a(n3, object);
                                            view10 = (TextView)object2;
                                            if (view10 != null) {
                                                View view11;
                                                n3 = R$id.fdabsTvPhoneHeader;
                                                View view12 = object2 = dd2_2.a(n3, object);
                                                view12 = (TextView)object2;
                                                if (view12 != null && (view11 = dd2_2.a(n3 = R$id.fdabsVSep, object)) != null) {
                                                    FragmentDeliveryAddressBottomSheetLuxeBinding fragmentDeliveryAddressBottomSheetLuxeBinding;
                                                    Object object3 = object;
                                                    object3 = (ConstraintLayout)((Object)object);
                                                    object2 = fragmentDeliveryAddressBottomSheetLuxeBinding;
                                                    fragmentDeliveryAddressBottomSheetLuxeBinding = new FragmentDeliveryAddressBottomSheetLuxeBinding((ConstraintLayout)((Object)object3), view, (ImageView)view2, (LinearLayout)view3, (TextView)view4, (TextView)view5, (TextView)view6, (TextView)view7, (TextView)view8, (TextView)view9, (TextView)view10, (TextView)view12, view11);
                                                    return fragmentDeliveryAddressBottomSheetLuxeBinding;
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

    public static FragmentDeliveryAddressBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater) {
        return FragmentDeliveryAddressBottomSheetLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentDeliveryAddressBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_delivery_address_bottom_sheet_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentDeliveryAddressBottomSheetLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


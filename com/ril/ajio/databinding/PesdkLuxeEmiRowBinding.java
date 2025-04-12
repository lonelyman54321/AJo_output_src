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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PesdkLuxeEmiRowBinding
implements BC3 {
    public final AjioTextView emiMessage;
    public final AjioTextView emiNotAvailable;
    public final LinearLayout emiProceedButton;
    public final AjioTextView emiProceedButtonTv;
    public final RelativeLayout emiTextRow;
    public final ImageView itemBankImg;
    public final AjioTextView itemBankName;
    private final LinearLayout rootView;
    public final LinearLayout selectEmiLayout;

    private PesdkLuxeEmiRowBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, LinearLayout linearLayout2, AjioTextView ajioTextView3, RelativeLayout relativeLayout, ImageView imageView, AjioTextView ajioTextView4, LinearLayout linearLayout3) {
        this.rootView = linearLayout;
        this.emiMessage = ajioTextView;
        this.emiNotAvailable = ajioTextView2;
        this.emiProceedButton = linearLayout2;
        this.emiProceedButtonTv = ajioTextView3;
        this.emiTextRow = relativeLayout;
        this.itemBankImg = imageView;
        this.itemBankName = ajioTextView4;
        this.selectEmiLayout = linearLayout3;
    }

    public static PesdkLuxeEmiRowBinding bind(View object) {
        View view;
        int n3 = R$id.emi_message;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.emi_not_available;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.emi_proceed_button;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (LinearLayout)view;
                if (view2 != null) {
                    n3 = R$id.emi_proceed_button_tv;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        n3 = R$id.emi_text_row;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (RelativeLayout)view;
                        if (view3 != null) {
                            n3 = R$id.item_bank_img;
                            View view4 = view = dd2_2.a(n3, object);
                            view4 = (ImageView)view;
                            if (view4 != null) {
                                n3 = R$id.item_bank_name;
                                Object object5 = view = dd2_2.a(n3, object);
                                object5 = (AjioTextView)view;
                                if (object5 != null) {
                                    n3 = R$id.select_emi_layout;
                                    View view5 = view = dd2_2.a(n3, object);
                                    view5 = (LinearLayout)view;
                                    if (view5 != null) {
                                        Object object6 = object;
                                        object6 = (LinearLayout)object;
                                        PesdkLuxeEmiRowBinding pesdkLuxeEmiRowBinding = new PesdkLuxeEmiRowBinding((LinearLayout)object6, (AjioTextView)object2, (AjioTextView)object3, (LinearLayout)view2, (AjioTextView)object4, (RelativeLayout)view3, (ImageView)view4, (AjioTextView)object5, (LinearLayout)view5);
                                        return pesdkLuxeEmiRowBinding;
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

    public static PesdkLuxeEmiRowBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxeEmiRowBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxeEmiRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_luxe_emi_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxeEmiRowBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


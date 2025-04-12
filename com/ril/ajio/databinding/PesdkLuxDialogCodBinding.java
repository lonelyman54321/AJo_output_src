/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PesdkLuxDialogCodBinding
implements BC3 {
    public final AjioTextView chooseOtherOption;
    public final AjioTextView codDialogTvPlaceorder;
    public final AjioTextView codFrictionTv;
    public final ImageView codPopupClose;
    public final ImageView idFrictionImage;
    public final AjioTextView idFrictionTitle;
    public final LinearLayout parentLayout;
    private final LinearLayout rootView;

    private PesdkLuxDialogCodBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, ImageView imageView, ImageView imageView2, AjioTextView ajioTextView4, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.chooseOtherOption = ajioTextView;
        this.codDialogTvPlaceorder = ajioTextView2;
        this.codFrictionTv = ajioTextView3;
        this.codPopupClose = imageView;
        this.idFrictionImage = imageView2;
        this.idFrictionTitle = ajioTextView4;
        this.parentLayout = linearLayout2;
    }

    public static PesdkLuxDialogCodBinding bind(View object) {
        View view;
        int n3 = R$id.choose_other_option;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.cod_dialog_tv_placeorder;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.cod_friction_tv;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.cod_popup_close;
                    View view2 = view = dd2_2.a(n3, object);
                    view2 = (ImageView)view;
                    if (view2 != null) {
                        n3 = R$id.id_friction_image;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (ImageView)view;
                        if (view3 != null) {
                            n3 = R$id.id_friction_title;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (AjioTextView)view;
                            if (object5 != null) {
                                n3 = R$id.parent_layout;
                                View view4 = view = dd2_2.a(n3, object);
                                view4 = (LinearLayout)view;
                                if (view4 != null) {
                                    Object object6 = object;
                                    object6 = (LinearLayout)object;
                                    PesdkLuxDialogCodBinding pesdkLuxDialogCodBinding = new PesdkLuxDialogCodBinding((LinearLayout)object6, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (ImageView)view2, (ImageView)view3, (AjioTextView)object5, (LinearLayout)view4);
                                    return pesdkLuxDialogCodBinding;
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

    public static PesdkLuxDialogCodBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxDialogCodBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxDialogCodBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_dialog_cod;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxDialogCodBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


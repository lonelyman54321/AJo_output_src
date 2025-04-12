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
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEToggleButton;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;

public final class PesdkLuxRowPaymentMopUpiBinding
implements BC3 {
    public final AjioCustomExpandablePanel expandablePaymentUpi;
    public final ImageView imgUpi;
    public final PesdkLoyaltyCardInfoView layoutLoyaltyCardInfo;
    public final AjioTextView proceedBtnTxt;
    private final LinearLayout rootView;
    public final View space;
    public final AjioTextView tvPreferredUpiTitle;
    public final AjioTextView tvUpi;
    public final AjioTextView tvUpiId;
    public final LinearLayout upiContentContainer;
    public final LinearLayout upiLl;
    public final PEToggleButton upiToggleExpand;

    private PesdkLuxRowPaymentMopUpiBinding(LinearLayout linearLayout, AjioCustomExpandablePanel ajioCustomExpandablePanel, ImageView imageView, PesdkLoyaltyCardInfoView pesdkLoyaltyCardInfoView, AjioTextView ajioTextView, View view, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, LinearLayout linearLayout2, LinearLayout linearLayout3, PEToggleButton pEToggleButton) {
        this.rootView = linearLayout;
        this.expandablePaymentUpi = ajioCustomExpandablePanel;
        this.imgUpi = imageView;
        this.layoutLoyaltyCardInfo = pesdkLoyaltyCardInfoView;
        this.proceedBtnTxt = ajioTextView;
        this.space = view;
        this.tvPreferredUpiTitle = ajioTextView2;
        this.tvUpi = ajioTextView3;
        this.tvUpiId = ajioTextView4;
        this.upiContentContainer = linearLayout2;
        this.upiLl = linearLayout3;
        this.upiToggleExpand = pEToggleButton;
    }

    public static PesdkLuxRowPaymentMopUpiBinding bind(View object) {
        View view;
        int n3 = R$id.expandable_payment_upi;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioCustomExpandablePanel)view;
        if (object2 != null) {
            n3 = R$id.img_upi;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.layout_loyaltyCardInfo;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (PesdkLoyaltyCardInfoView)view;
                if (object3 != null) {
                    View view3;
                    n3 = R$id.proceed_btn_txt;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null && (view3 = dd2_2.a(n3 = R$id.space, object)) != null) {
                        n3 = R$id.tv_preferred_upi_title;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            n3 = R$id.tv_upi;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                n3 = R$id.tv_upi_id;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (AjioTextView)view;
                                if (object7 != null) {
                                    n3 = R$id.upi_contentContainer;
                                    View view4 = view = dd2_2.a(n3, object);
                                    view4 = (LinearLayout)view;
                                    if (view4 != null) {
                                        n3 = R$id.upi_ll;
                                        View view5 = view = dd2_2.a(n3, object);
                                        view5 = (LinearLayout)view;
                                        if (view5 != null) {
                                            n3 = R$id.upi_toggle_expand;
                                            Object object8 = view = dd2_2.a(n3, object);
                                            object8 = (PEToggleButton)view;
                                            if (object8 != null) {
                                                Object object9 = object;
                                                object9 = (LinearLayout)object;
                                                PesdkLuxRowPaymentMopUpiBinding pesdkLuxRowPaymentMopUpiBinding = new PesdkLuxRowPaymentMopUpiBinding((LinearLayout)object9, (AjioCustomExpandablePanel)((Object)object2), (ImageView)view2, (PesdkLoyaltyCardInfoView)((Object)object3), (AjioTextView)object4, view3, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (LinearLayout)view4, (LinearLayout)view5, (PEToggleButton)object8);
                                                return pesdkLuxRowPaymentMopUpiBinding;
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

    public static PesdkLuxRowPaymentMopUpiBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxRowPaymentMopUpiBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxRowPaymentMopUpiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_row_payment_mop_upi;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxRowPaymentMopUpiBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


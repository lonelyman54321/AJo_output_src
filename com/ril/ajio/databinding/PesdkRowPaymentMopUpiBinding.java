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
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEToggleButton;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;

public final class PesdkRowPaymentMopUpiBinding
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
    public final RelativeLayout upiIdParentLayout;
    public final LinearLayout upiLl;
    public final PEToggleButton upiToggleExpand;

    private PesdkRowPaymentMopUpiBinding(LinearLayout linearLayout, AjioCustomExpandablePanel ajioCustomExpandablePanel, ImageView imageView, PesdkLoyaltyCardInfoView pesdkLoyaltyCardInfoView, AjioTextView ajioTextView, View view, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, LinearLayout linearLayout2, RelativeLayout relativeLayout, LinearLayout linearLayout3, PEToggleButton pEToggleButton) {
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
        this.upiIdParentLayout = relativeLayout;
        this.upiLl = linearLayout3;
        this.upiToggleExpand = pEToggleButton;
    }

    public static PesdkRowPaymentMopUpiBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.expandable_payment_upi;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioCustomExpandablePanel)view2;
        if (object2 != null) {
            n3 = R$id.img_upi;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (ImageView)view2;
            if (view3 != null) {
                n3 = R$id.layout_loyaltyCardInfo;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (PesdkLoyaltyCardInfoView)view2;
                if (object3 != null) {
                    View view4;
                    n3 = R$id.proceed_btn_txt;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view2;
                    if (object4 != null && (view4 = dd2_2.a(n3 = R$id.space, view)) != null) {
                        n3 = R$id.tv_preferred_upi_title;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (AjioTextView)view2;
                        if (object5 != null) {
                            n3 = R$id.tv_upi;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (AjioTextView)view2;
                            if (object6 != null) {
                                n3 = R$id.tv_upi_id;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (AjioTextView)view2;
                                if (object7 != null) {
                                    n3 = R$id.upi_contentContainer;
                                    View view5 = view2 = dd2_2.a(n3, view);
                                    view5 = (LinearLayout)view2;
                                    if (view5 != null) {
                                        n3 = R$id.upi_id_parent_layout;
                                        View view6 = view2 = dd2_2.a(n3, view);
                                        view6 = (RelativeLayout)view2;
                                        if (view6 != null) {
                                            n3 = R$id.upi_ll;
                                            View view7 = view2 = dd2_2.a(n3, view);
                                            view7 = (LinearLayout)view2;
                                            if (view7 != null) {
                                                n3 = R$id.upi_toggle_expand;
                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                object8 = (PEToggleButton)view2;
                                                if (object8 != null) {
                                                    View view8 = view;
                                                    view8 = (LinearLayout)view;
                                                    PesdkRowPaymentMopUpiBinding pesdkRowPaymentMopUpiBinding = new PesdkRowPaymentMopUpiBinding((LinearLayout)view8, (AjioCustomExpandablePanel)((Object)object2), (ImageView)view3, (PesdkLoyaltyCardInfoView)((Object)object3), (AjioTextView)object4, view4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (LinearLayout)view5, (RelativeLayout)view6, (LinearLayout)view7, (PEToggleButton)object8);
                                                    return pesdkRowPaymentMopUpiBinding;
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

    public static PesdkRowPaymentMopUpiBinding inflate(LayoutInflater layoutInflater) {
        return PesdkRowPaymentMopUpiBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkRowPaymentMopUpiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_row_payment_mop_upi;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkRowPaymentMopUpiBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}


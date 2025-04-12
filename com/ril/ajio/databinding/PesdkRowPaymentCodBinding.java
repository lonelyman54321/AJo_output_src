/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEToggleButton;

public final class PesdkRowPaymentCodBinding
implements BC3 {
    public final RelativeLayout codContentContainer;
    public final AjioTextView codInfo;
    public final PEToggleButton codToggleExpand;
    public final AjioCustomExpandablePanel expandablePaymentCod;
    public final AjioTextView idCodExtraFeeText;
    public final LinearLayout idCodExtraFeeView;
    public final AjioTextView idCodExtraFeeWhats;
    public final AjioTextView proceedBtnTv;
    private final AjioCustomExpandablePanel rootView;

    private PesdkRowPaymentCodBinding(AjioCustomExpandablePanel ajioCustomExpandablePanel, RelativeLayout relativeLayout, AjioTextView ajioTextView, PEToggleButton pEToggleButton, AjioCustomExpandablePanel ajioCustomExpandablePanel2, AjioTextView ajioTextView2, LinearLayout linearLayout, AjioTextView ajioTextView3, AjioTextView ajioTextView4) {
        this.rootView = ajioCustomExpandablePanel;
        this.codContentContainer = relativeLayout;
        this.codInfo = ajioTextView;
        this.codToggleExpand = pEToggleButton;
        this.expandablePaymentCod = ajioCustomExpandablePanel2;
        this.idCodExtraFeeText = ajioTextView2;
        this.idCodExtraFeeView = linearLayout;
        this.idCodExtraFeeWhats = ajioTextView3;
        this.proceedBtnTv = ajioTextView4;
    }

    public static PesdkRowPaymentCodBinding bind(View object) {
        View view;
        int n3 = R$id.cod_contentContainer;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (RelativeLayout)view;
        if (view2 != null) {
            n3 = R$id.cod_info;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.cod_toggle_expand;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (PEToggleButton)view;
                if (object3 != null) {
                    Object object4 = object;
                    object4 = (AjioCustomExpandablePanel)((Object)object);
                    n3 = R$id.id_cod_extra_fee_text;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.id_cod_extra_fee_view;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (LinearLayout)view;
                        if (view3 != null) {
                            n3 = R$id.id_cod_extra_fee_whats;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                n3 = R$id.proceed_btn_tv;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (AjioTextView)view;
                                if (object7 != null) {
                                    object = new PesdkRowPaymentCodBinding((AjioCustomExpandablePanel)((Object)object4), (RelativeLayout)view2, (AjioTextView)object2, (PEToggleButton)object3, (AjioCustomExpandablePanel)((Object)object4), (AjioTextView)object5, (LinearLayout)view3, (AjioTextView)object6, (AjioTextView)object7);
                                    return object;
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

    public static PesdkRowPaymentCodBinding inflate(LayoutInflater layoutInflater) {
        return PesdkRowPaymentCodBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkRowPaymentCodBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_row_payment_cod;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkRowPaymentCodBinding.bind((View)layoutInflater);
    }

    public AjioCustomExpandablePanel getRoot() {
        return this.rootView;
    }
}


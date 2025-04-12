/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEToggleButton;
import com.ril.ajio.databinding.PesdkLuxViewNetbankingBankBinding;

public final class PesdkLuxRowNetbankingBinding
implements BC3 {
    public final AjioCustomExpandablePanel expandablePaymentNetbanking;
    public final PesdkLuxViewNetbankingBankBinding netbankingBankFour;
    public final PesdkLuxViewNetbankingBankBinding netbankingBankOne;
    public final PesdkLuxViewNetbankingBankBinding netbankingBankThree;
    public final PesdkLuxViewNetbankingBankBinding netbankingBankTwo;
    public final LinearLayout netbankingContentContainer;
    public final PEToggleButton netbankingToggleExpand;
    private final AjioCustomExpandablePanel rootView;
    public final AjioTextView viewNetbankingTvShowMorebank;

    private PesdkLuxRowNetbankingBinding(AjioCustomExpandablePanel ajioCustomExpandablePanel, AjioCustomExpandablePanel ajioCustomExpandablePanel2, PesdkLuxViewNetbankingBankBinding pesdkLuxViewNetbankingBankBinding, PesdkLuxViewNetbankingBankBinding pesdkLuxViewNetbankingBankBinding2, PesdkLuxViewNetbankingBankBinding pesdkLuxViewNetbankingBankBinding3, PesdkLuxViewNetbankingBankBinding pesdkLuxViewNetbankingBankBinding4, LinearLayout linearLayout, PEToggleButton pEToggleButton, AjioTextView ajioTextView) {
        this.rootView = ajioCustomExpandablePanel;
        this.expandablePaymentNetbanking = ajioCustomExpandablePanel2;
        this.netbankingBankFour = pesdkLuxViewNetbankingBankBinding;
        this.netbankingBankOne = pesdkLuxViewNetbankingBankBinding2;
        this.netbankingBankThree = pesdkLuxViewNetbankingBankBinding3;
        this.netbankingBankTwo = pesdkLuxViewNetbankingBankBinding4;
        this.netbankingContentContainer = linearLayout;
        this.netbankingToggleExpand = pEToggleButton;
        this.viewNetbankingTvShowMorebank = ajioTextView;
    }

    public static PesdkLuxRowNetbankingBinding bind(View object) {
        Object object2 = object;
        object2 = (AjioCustomExpandablePanel)((Object)object);
        int n3 = R$id.netbanking_bank_four;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            PesdkLuxViewNetbankingBankBinding pesdkLuxViewNetbankingBankBinding = PesdkLuxViewNetbankingBankBinding.bind(view);
            n3 = R$id.netbanking_bank_one;
            view = dd2_2.a(n3, object);
            if (view != null) {
                PesdkLuxViewNetbankingBankBinding pesdkLuxViewNetbankingBankBinding2 = PesdkLuxViewNetbankingBankBinding.bind(view);
                n3 = R$id.netbanking_bank_three;
                view = dd2_2.a(n3, object);
                if (view != null) {
                    PesdkLuxViewNetbankingBankBinding pesdkLuxViewNetbankingBankBinding3 = PesdkLuxViewNetbankingBankBinding.bind(view);
                    n3 = R$id.netbanking_bank_two;
                    view = dd2_2.a(n3, object);
                    if (view != null) {
                        PesdkLuxViewNetbankingBankBinding pesdkLuxViewNetbankingBankBinding4 = PesdkLuxViewNetbankingBankBinding.bind(view);
                        n3 = R$id.netbanking_contentContainer;
                        View view2 = view = dd2_2.a(n3, object);
                        view2 = (LinearLayout)view;
                        if (view2 != null) {
                            n3 = R$id.netbanking_toggle_expand;
                            Object object3 = view = dd2_2.a(n3, object);
                            object3 = (PEToggleButton)view;
                            if (object3 != null) {
                                n3 = R$id.view_netbanking_tv_showMorebank;
                                Object object4 = view = dd2_2.a(n3, object);
                                object4 = (AjioTextView)view;
                                if (object4 != null) {
                                    Object object5 = object;
                                    view = object2;
                                    object = new PesdkLuxRowNetbankingBinding((AjioCustomExpandablePanel)((Object)object2), (AjioCustomExpandablePanel)((Object)object2), pesdkLuxViewNetbankingBankBinding, pesdkLuxViewNetbankingBankBinding2, pesdkLuxViewNetbankingBankBinding3, pesdkLuxViewNetbankingBankBinding4, (LinearLayout)view2, (PEToggleButton)object3, (AjioTextView)object4);
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

    public static PesdkLuxRowNetbankingBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxRowNetbankingBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxRowNetbankingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_row_netbanking;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxRowNetbankingBinding.bind((View)layoutInflater);
    }

    public AjioCustomExpandablePanel getRoot() {
        return this.rootView;
    }
}


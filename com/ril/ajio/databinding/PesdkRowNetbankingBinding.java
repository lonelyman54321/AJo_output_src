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
import com.ril.ajio.databinding.PesdkViewNetbankingBankBinding;

public final class PesdkRowNetbankingBinding
implements BC3 {
    public final AjioCustomExpandablePanel expandablePaymentNetbanking;
    public final PesdkViewNetbankingBankBinding netbankingBankFour;
    public final PesdkViewNetbankingBankBinding netbankingBankOne;
    public final PesdkViewNetbankingBankBinding netbankingBankThree;
    public final PesdkViewNetbankingBankBinding netbankingBankTwo;
    public final LinearLayout netbankingContentContainer;
    public final PEToggleButton netbankingToggleExpand;
    public final LinearLayout payProceedButton;
    public final AjioTextView proceedBtnTv;
    private final AjioCustomExpandablePanel rootView;
    public final AjioTextView viewNetbankingTvShowMorebank;

    private PesdkRowNetbankingBinding(AjioCustomExpandablePanel ajioCustomExpandablePanel, AjioCustomExpandablePanel ajioCustomExpandablePanel2, PesdkViewNetbankingBankBinding pesdkViewNetbankingBankBinding, PesdkViewNetbankingBankBinding pesdkViewNetbankingBankBinding2, PesdkViewNetbankingBankBinding pesdkViewNetbankingBankBinding3, PesdkViewNetbankingBankBinding pesdkViewNetbankingBankBinding4, LinearLayout linearLayout, PEToggleButton pEToggleButton, LinearLayout linearLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = ajioCustomExpandablePanel;
        this.expandablePaymentNetbanking = ajioCustomExpandablePanel2;
        this.netbankingBankFour = pesdkViewNetbankingBankBinding;
        this.netbankingBankOne = pesdkViewNetbankingBankBinding2;
        this.netbankingBankThree = pesdkViewNetbankingBankBinding3;
        this.netbankingBankTwo = pesdkViewNetbankingBankBinding4;
        this.netbankingContentContainer = linearLayout;
        this.netbankingToggleExpand = pEToggleButton;
        this.payProceedButton = linearLayout2;
        this.proceedBtnTv = ajioTextView;
        this.viewNetbankingTvShowMorebank = ajioTextView2;
    }

    public static PesdkRowNetbankingBinding bind(View object) {
        Object object2 = object;
        object2 = (AjioCustomExpandablePanel)((Object)object);
        int n3 = R$id.netbanking_bank_four;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            PesdkViewNetbankingBankBinding pesdkViewNetbankingBankBinding = PesdkViewNetbankingBankBinding.bind(view);
            n3 = R$id.netbanking_bank_one;
            view = dd2_2.a(n3, object);
            if (view != null) {
                PesdkViewNetbankingBankBinding pesdkViewNetbankingBankBinding2 = PesdkViewNetbankingBankBinding.bind(view);
                n3 = R$id.netbanking_bank_three;
                view = dd2_2.a(n3, object);
                if (view != null) {
                    PesdkViewNetbankingBankBinding pesdkViewNetbankingBankBinding3 = PesdkViewNetbankingBankBinding.bind(view);
                    n3 = R$id.netbanking_bank_two;
                    view = dd2_2.a(n3, object);
                    if (view != null) {
                        PesdkViewNetbankingBankBinding pesdkViewNetbankingBankBinding4 = PesdkViewNetbankingBankBinding.bind(view);
                        n3 = R$id.netbanking_contentContainer;
                        View view2 = view = dd2_2.a(n3, object);
                        view2 = (LinearLayout)view;
                        if (view2 != null) {
                            n3 = R$id.netbanking_toggle_expand;
                            Object object3 = view = dd2_2.a(n3, object);
                            object3 = (PEToggleButton)view;
                            if (object3 != null) {
                                n3 = R$id.pay_proceed_button;
                                View view3 = view = dd2_2.a(n3, object);
                                view3 = (LinearLayout)view;
                                if (view3 != null) {
                                    n3 = R$id.proceed_btn_tv;
                                    Object object4 = view = dd2_2.a(n3, object);
                                    object4 = (AjioTextView)view;
                                    if (object4 != null) {
                                        n3 = R$id.view_netbanking_tv_showMorebank;
                                        Object object5 = view = dd2_2.a(n3, object);
                                        object5 = (AjioTextView)view;
                                        if (object5 != null) {
                                            Object object6 = object;
                                            view = object2;
                                            object = new PesdkRowNetbankingBinding((AjioCustomExpandablePanel)((Object)object2), (AjioCustomExpandablePanel)((Object)object2), pesdkViewNetbankingBankBinding, pesdkViewNetbankingBankBinding2, pesdkViewNetbankingBankBinding3, pesdkViewNetbankingBankBinding4, (LinearLayout)view2, (PEToggleButton)object3, (LinearLayout)view3, (AjioTextView)object4, (AjioTextView)object5);
                                            return object;
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

    public static PesdkRowNetbankingBinding inflate(LayoutInflater layoutInflater) {
        return PesdkRowNetbankingBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkRowNetbankingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_row_netbanking;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkRowNetbankingBinding.bind((View)layoutInflater);
    }

    public AjioCustomExpandablePanel getRoot() {
        return this.rootView;
    }
}


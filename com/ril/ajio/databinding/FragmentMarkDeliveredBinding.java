/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.notifications.AspectFitImageView;

public final class FragmentMarkDeliveredBinding
implements BC3 {
    public final AjioEditText fmdEtInvDigit1;
    public final AjioEditText fmdEtInvDigit2;
    public final AjioEditText fmdEtInvDigit3;
    public final AjioEditText fmdEtInvDigit4;
    public final AspectFitImageView fmdIvInvoice;
    public final ConstraintLayout fmdLayout;
    public final ConstraintLayout fmdLayoutInvoice;
    public final AjioTextView fmdTvBack;
    public final AjioTextView fmdTvCancel;
    public final AjioTextView fmdTvFindInvoiceNumber;
    public final AjioTextView fmdTvInfo;
    public final AjioTextView fmdTvInvoiceErrorMessage;
    public final AjioTextView fmdTvMarkAsDelivered;
    public final AjioTextView fmdTvTitle;
    private final FrameLayout rootView;

    private FragmentMarkDeliveredBinding(FrameLayout frameLayout, AjioEditText ajioEditText, AjioEditText ajioEditText2, AjioEditText ajioEditText3, AjioEditText ajioEditText4, AspectFitImageView aspectFitImageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7) {
        this.rootView = frameLayout;
        this.fmdEtInvDigit1 = ajioEditText;
        this.fmdEtInvDigit2 = ajioEditText2;
        this.fmdEtInvDigit3 = ajioEditText3;
        this.fmdEtInvDigit4 = ajioEditText4;
        this.fmdIvInvoice = aspectFitImageView;
        this.fmdLayout = constraintLayout;
        this.fmdLayoutInvoice = constraintLayout2;
        this.fmdTvBack = ajioTextView;
        this.fmdTvCancel = ajioTextView2;
        this.fmdTvFindInvoiceNumber = ajioTextView3;
        this.fmdTvInfo = ajioTextView4;
        this.fmdTvInvoiceErrorMessage = ajioTextView5;
        this.fmdTvMarkAsDelivered = ajioTextView6;
        this.fmdTvTitle = ajioTextView7;
    }

    public static FragmentMarkDeliveredBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.fmd_et_inv_digit_1;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioEditText)view2;
        if (object2 != null) {
            n3 = R$id.fmd_et_inv_digit_2;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioEditText)view2;
            if (object3 != null) {
                n3 = R$id.fmd_et_inv_digit_3;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioEditText)view2;
                if (object4 != null) {
                    n3 = R$id.fmd_et_inv_digit_4;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AjioEditText)view2;
                    if (object5 != null) {
                        n3 = R$id.fmd_iv_invoice;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AspectFitImageView)view2;
                        if (object6 != null) {
                            n3 = R$id.fmd_layout;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (ConstraintLayout)view2;
                            if (object7 != null) {
                                n3 = R$id.fmd_layout_invoice;
                                Object object8 = view2 = dd2_2.a(n3, view);
                                object8 = (ConstraintLayout)view2;
                                if (object8 != null) {
                                    n3 = R$id.fmd_tv_back;
                                    Object object9 = view2 = dd2_2.a(n3, view);
                                    object9 = (AjioTextView)view2;
                                    if (object9 != null) {
                                        n3 = R$id.fmd_tv_cancel;
                                        Object object10 = view2 = dd2_2.a(n3, view);
                                        object10 = (AjioTextView)view2;
                                        if (object10 != null) {
                                            n3 = R$id.fmd_tv_find_invoice_number;
                                            Object object11 = view2 = dd2_2.a(n3, view);
                                            object11 = (AjioTextView)view2;
                                            if (object11 != null) {
                                                n3 = R$id.fmd_tv_info;
                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                object12 = (AjioTextView)view2;
                                                if (object12 != null) {
                                                    n3 = R$id.fmd_tv_invoice_error_message;
                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                    object13 = (AjioTextView)view2;
                                                    if (object13 != null) {
                                                        n3 = R$id.fmd_tv_mark_as_delivered;
                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                        object14 = (AjioTextView)view2;
                                                        if (object14 != null) {
                                                            n3 = R$id.fmd_tv_title;
                                                            Object object15 = view2 = dd2_2.a(n3, view);
                                                            object15 = (AjioTextView)view2;
                                                            if (object15 != null) {
                                                                View view3 = view;
                                                                view3 = (FrameLayout)view;
                                                                FragmentMarkDeliveredBinding fragmentMarkDeliveredBinding = new FragmentMarkDeliveredBinding((FrameLayout)view3, (AjioEditText)object2, (AjioEditText)object3, (AjioEditText)object4, (AjioEditText)object5, (AspectFitImageView)((Object)object6), (ConstraintLayout)((Object)object7), (ConstraintLayout)((Object)object8), (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14, (AjioTextView)object15);
                                                                return fragmentMarkDeliveredBinding;
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

    public static FragmentMarkDeliveredBinding inflate(LayoutInflater layoutInflater) {
        return FragmentMarkDeliveredBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentMarkDeliveredBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_mark_delivered;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentMarkDeliveredBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ReturnRefundNextStepsBinding
implements BC3 {
    public final Barrier barrier;
    public final AjioButton btnExchange;
    public final AjioButton btnReturn;
    public final AjioButton btnReturnExchange;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;
    public final AjioTextView tvDescription;
    public final AjioTextView tvNudeReturnExchangeDate;
    public final AjioTextView tvReturnExchangeDate;
    public final AjioTextView tvSubStatusHeader;
    public final AjioTextView tvTitle;

    private ReturnRefundNextStepsBinding(ConstraintLayout constraintLayout, Barrier barrier, AjioButton ajioButton, AjioButton ajioButton2, AjioButton ajioButton3, RecyclerView recyclerView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5) {
        this.rootView = constraintLayout;
        this.barrier = barrier;
        this.btnExchange = ajioButton;
        this.btnReturn = ajioButton2;
        this.btnReturnExchange = ajioButton3;
        this.recyclerView = recyclerView;
        this.tvDescription = ajioTextView;
        this.tvNudeReturnExchangeDate = ajioTextView2;
        this.tvReturnExchangeDate = ajioTextView3;
        this.tvSubStatusHeader = ajioTextView4;
        this.tvTitle = ajioTextView5;
    }

    public static ReturnRefundNextStepsBinding bind(View object) {
        View view;
        int n3 = R$id.barrier;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (Barrier)view;
        if (view2 != null) {
            n3 = R$id.btnExchange;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioButton)view;
            if (object2 != null) {
                n3 = R$id.btnReturn;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioButton)view;
                if (object3 != null) {
                    n3 = R$id.btnReturnExchange;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioButton)view;
                    if (object4 != null) {
                        n3 = R$id.recycler_view;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (RecyclerView)view;
                        if (object5 != null) {
                            n3 = R$id.tvDescription;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                n3 = R$id.tvNudeReturnExchangeDate;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (AjioTextView)view;
                                if (object7 != null) {
                                    n3 = R$id.tvReturnExchangeDate;
                                    Object object8 = view = dd2_2.a(n3, object);
                                    object8 = (AjioTextView)view;
                                    if (object8 != null) {
                                        n3 = R$id.tvSubStatusHeader;
                                        Object object9 = view = dd2_2.a(n3, object);
                                        object9 = (AjioTextView)view;
                                        if (object9 != null) {
                                            n3 = R$id.tvTitle;
                                            Object object10 = view = dd2_2.a(n3, object);
                                            object10 = (AjioTextView)view;
                                            if (object10 != null) {
                                                Object object11 = object;
                                                object11 = (ConstraintLayout)((Object)object);
                                                ReturnRefundNextStepsBinding returnRefundNextStepsBinding = new ReturnRefundNextStepsBinding((ConstraintLayout)((Object)object11), (Barrier)view2, (AjioButton)object2, (AjioButton)object3, (AjioButton)object4, (RecyclerView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10);
                                                return returnRefundNextStepsBinding;
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

    public static ReturnRefundNextStepsBinding inflate(LayoutInflater layoutInflater) {
        return ReturnRefundNextStepsBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnRefundNextStepsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_refund_next_steps;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnRefundNextStepsBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


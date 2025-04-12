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
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ReturnRefundNewReturnCreationBinding
implements BC3 {
    public final View divider;
    public final LinearLayout linkContainer;
    public final AjioTextView linkOne;
    public final AjioTextView linkTwo;
    public final AjioTextView newReturnSubtitleTv;
    public final AjioTextView newReturnTitleTv;
    private final CardView rootView;

    private ReturnRefundNewReturnCreationBinding(CardView cardView, View view, LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4) {
        this.rootView = cardView;
        this.divider = view;
        this.linkContainer = linearLayout;
        this.linkOne = ajioTextView;
        this.linkTwo = ajioTextView2;
        this.newReturnSubtitleTv = ajioTextView3;
        this.newReturnTitleTv = ajioTextView4;
    }

    public static ReturnRefundNewReturnCreationBinding bind(View object) {
        int n3 = R$id.divider;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            Object object2;
            n3 = R$id.link_container;
            View view2 = object2 = dd2_2.a(n3, object);
            view2 = (LinearLayout)object2;
            if (view2 != null) {
                n3 = R$id.link_one;
                Object object3 = object2 = dd2_2.a(n3, object);
                object3 = (AjioTextView)object2;
                if (object3 != null) {
                    n3 = R$id.link_two;
                    Object object4 = object2 = dd2_2.a(n3, object);
                    object4 = (AjioTextView)object2;
                    if (object4 != null) {
                        n3 = R$id.new_return_subtitle_tv;
                        Object object5 = object2 = dd2_2.a(n3, object);
                        object5 = (AjioTextView)object2;
                        if (object5 != null) {
                            n3 = R$id.new_return_title_tv;
                            Object object6 = object2 = dd2_2.a(n3, object);
                            object6 = (AjioTextView)object2;
                            if (object6 != null) {
                                ReturnRefundNewReturnCreationBinding returnRefundNewReturnCreationBinding;
                                Object object7 = object;
                                object7 = (CardView)((Object)object);
                                object2 = returnRefundNewReturnCreationBinding;
                                returnRefundNewReturnCreationBinding = new ReturnRefundNewReturnCreationBinding((CardView)((Object)object7), view, (LinearLayout)view2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6);
                                return returnRefundNewReturnCreationBinding;
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

    public static ReturnRefundNewReturnCreationBinding inflate(LayoutInflater layoutInflater) {
        return ReturnRefundNewReturnCreationBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnRefundNewReturnCreationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_refund_new_return_creation;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnRefundNewReturnCreationBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}


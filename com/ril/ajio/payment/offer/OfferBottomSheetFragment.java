/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.payment.offer;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import com.ril.ajio.payment.offer.OfferBottomSheetFragment$1;
import com.ril.ajio.services.data.Payment.OfferDetails;
import java.io.Serializable;
import java.util.List;

public class OfferBottomSheetFragment
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public OfferDetails a;
    public RecyclerView b;
    public TextView c;

    public static OfferBottomSheetFragment Oa(OfferDetails offerDetails, Float object) {
        offerDetails.setNetPayableAmount((Float)object);
        object = new OfferBottomSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("OfferDetails", (Serializable)offerDetails);
        ((Fragment)object).setArguments(bundle);
        return object;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        bundle = this.getDialog();
        if (bundle != null && (bundle = this.getDialog().getWindow()) != null) {
            bundle = this.getDialog().getWindow();
            int n3 = R$style.DialogAnimation;
            bundle.setWindowAnimations(n3);
        }
    }

    public final void onClick(View view) {
        int n3;
        int n4;
        int n7 = view.getId();
        if (n7 == (n4 = R$id.imv_close) || (n3 = view.getId()) == (n7 = R$id.btnOk)) {
            this.dismiss();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n3 = R$style.MobileBottomSheetFragment;
        this.setStyle(0, n3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int n3 = R$layout.offer_bottom_sheet;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onViewCreated(View object, Bundle object2) {
        boolean bl2;
        Object object3;
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.getArguments();
        if (object2 != null) {
            object2 = this.getArguments();
            object3 = "OfferDetails";
            this.a = object2 = (OfferDetails)object2.getSerializable((String)object3);
        }
        int n3 = R$id.imv_close;
        object.findViewById(n3).setOnClickListener((View.OnClickListener)this);
        n3 = R$id.btnOk;
        object.findViewById(n3).setOnClickListener((View.OnClickListener)this);
        n3 = R$id.parent_layout;
        object2 = (LinearLayout)object.findViewById(n3);
        int n4 = R$id.wallet_excluded_products;
        this.b = object3 = (RecyclerView)object.findViewById(n4);
        n4 = R$id.tvWalletExProductTitle;
        object3 = (TextView)object.findViewById(n4);
        this.c = object3;
        Looper looper = Looper.getMainLooper();
        object3 = new Handler(looper);
        OfferBottomSheetFragment$1 offerBottomSheetFragment$1 = new OfferBottomSheetFragment$1((LinearLayout)object2);
        long l2 = 100;
        object3.postDelayed((Runnable)offerBottomSheetFragment$1, l2);
        n3 = R$id.tv_order_value;
        object2 = (TextView)object.findViewById(n3);
        n4 = R$id.tv_discount;
        object3 = (TextView)object.findViewById(n4);
        int n7 = R$id.tv_payable_amount;
        TextView textView = (TextView)object.findViewById(n7);
        int n8 = R$id.tv_footer;
        object = (TextView)object.findViewById(n8);
        String string2 = qz2_0.u(this.a.getAmountConsideredForOffer().floatValue());
        object2.setText((CharSequence)string2);
        object2 = new StringBuilder("-");
        float f5 = this.a.getOfferAmountApplied().floatValue();
        string2 = qz2_0.u(f5);
        ((StringBuilder)object2).append(string2);
        object2 = ((StringBuilder)object2).toString();
        object3.setText((CharSequence)object2);
        float f6 = this.a.getNetPayableAmount().floatValue();
        object2 = qz2_0.u(f6);
        textView.setText((CharSequence)object2);
        object2 = new StringBuilder("*Maximum discount applicable ");
        float f7 = this.a.getMaximumOfferAmount().floatValue();
        object3 = qz2_0.u(f7);
        ((StringBuilder)object2).append((String)object3);
        object2 = ((StringBuilder)object2).toString();
        object.setText((CharSequence)object2);
        object = this.a.getOfferExcludedProducts();
        if (object != null && !(bl2 = (object = this.a.getOfferExcludedProducts()).isEmpty())) {
            object = h40_0.a;
            bl2 = h40_0.h1();
            if (bl2) {
                object = this.c;
                n3 = 0;
                f6 = 0.0f;
                object.setVisibility(0);
                object3 = this.getActivity();
                object = new LinearLayoutManager((Context)object3, 0, false);
                this.b.setLayoutManager((RecyclerView$o)object);
                object = this.b;
                object3 = this.a.getOfferExcludedProducts();
                object2 = new ve3_0((List)object3);
                ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
                return;
            }
        }
        object = this.b;
        n3 = 8;
        f6 = 1.1E-44f;
        object.setVisibility(n3);
    }
}


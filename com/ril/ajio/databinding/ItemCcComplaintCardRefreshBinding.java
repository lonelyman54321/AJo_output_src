/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ItemCcComplaintCardRefreshBinding
implements BC3 {
    public final TextView categoryText;
    public final TextView ccComplaintId;
    public final TextView ccComplaintIdText;
    public final TextView ccRaisedDate;
    public final TextView ccRaisedDateText;
    public final TextView ccViewOrder;
    private final ConstraintLayout rootView;

    private ItemCcComplaintCardRefreshBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.categoryText = textView;
        this.ccComplaintId = textView2;
        this.ccComplaintIdText = textView3;
        this.ccRaisedDate = textView4;
        this.ccRaisedDateText = textView5;
        this.ccViewOrder = textView6;
    }

    public static ItemCcComplaintCardRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.category_text;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.cc_complaint_id;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.cc_complaint_id_text;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.cc_raised_date;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        n3 = R$id.cc_raised_date_text;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (TextView)view;
                        if (view6 != null) {
                            n3 = R$id.cc_view_order;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (TextView)view;
                            if (view7 != null) {
                                Object object2 = object;
                                object2 = (ConstraintLayout)((Object)object);
                                ItemCcComplaintCardRefreshBinding itemCcComplaintCardRefreshBinding = new ItemCcComplaintCardRefreshBinding((ConstraintLayout)((Object)object2), (TextView)view2, (TextView)view3, (TextView)view4, (TextView)view5, (TextView)view6, (TextView)view7);
                                return itemCcComplaintCardRefreshBinding;
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

    public static ItemCcComplaintCardRefreshBinding inflate(LayoutInflater layoutInflater) {
        return ItemCcComplaintCardRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCcComplaintCardRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_cc_complaint_card_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCcComplaintCardRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


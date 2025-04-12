/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ItemCcComplaintCardBinding
implements BC3 {
    public final TextView categoryText;
    public final TextView ccComplaintId;
    public final TextView ccComplaintIdText;
    public final TextView ccDueDate;
    public final LinearLayout ccDueDateContainer;
    public final TextView ccDueDateText;
    public final TextView ccRaisedDate;
    public final TextView ccRaisedDateText;
    private final ConstraintLayout rootView;

    private ItemCcComplaintCardBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = constraintLayout;
        this.categoryText = textView;
        this.ccComplaintId = textView2;
        this.ccComplaintIdText = textView3;
        this.ccDueDate = textView4;
        this.ccDueDateContainer = linearLayout;
        this.ccDueDateText = textView5;
        this.ccRaisedDate = textView6;
        this.ccRaisedDateText = textView7;
    }

    public static ItemCcComplaintCardBinding bind(View object) {
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
                    n3 = R$id.cc_due_date;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        n3 = R$id.cc_due_date_container;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (LinearLayout)view;
                        if (view6 != null) {
                            n3 = R$id.cc_due_date_text;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (TextView)view;
                            if (view7 != null) {
                                n3 = R$id.cc_raised_date;
                                View view8 = view = dd2_2.a(n3, object);
                                view8 = (TextView)view;
                                if (view8 != null) {
                                    n3 = R$id.cc_raised_date_text;
                                    View view9 = view = dd2_2.a(n3, object);
                                    view9 = (TextView)view;
                                    if (view9 != null) {
                                        Object object2 = object;
                                        object2 = (ConstraintLayout)((Object)object);
                                        ItemCcComplaintCardBinding itemCcComplaintCardBinding = new ItemCcComplaintCardBinding((ConstraintLayout)((Object)object2), (TextView)view2, (TextView)view3, (TextView)view4, (TextView)view5, (LinearLayout)view6, (TextView)view7, (TextView)view8, (TextView)view9);
                                        return itemCcComplaintCardBinding;
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

    public static ItemCcComplaintCardBinding inflate(LayoutInflater layoutInflater) {
        return ItemCcComplaintCardBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCcComplaintCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_cc_complaint_card;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCcComplaintCardBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


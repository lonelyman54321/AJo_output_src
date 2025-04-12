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
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class CcComplaintCardRefreshBinding
implements BC3 {
    public final TextView ccDueDate;
    public final LinearLayout ccDueDateContainer;
    public final TextView ccDueDateText;
    public final CardView complaintCardContainer;
    private final CardView rootView;

    private CcComplaintCardRefreshBinding(CardView cardView, TextView textView, LinearLayout linearLayout, TextView textView2, CardView cardView2) {
        this.rootView = cardView;
        this.ccDueDate = textView;
        this.ccDueDateContainer = linearLayout;
        this.ccDueDateText = textView2;
        this.complaintCardContainer = cardView2;
    }

    public static CcComplaintCardRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.cc_due_date;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.cc_due_date_container;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.cc_due_date_text;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    Object object2 = object;
                    object2 = (CardView)((Object)object);
                    object = new CcComplaintCardRefreshBinding((CardView)((Object)object2), (TextView)view2, (LinearLayout)view3, (TextView)view4, (CardView)((Object)object2));
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CcComplaintCardRefreshBinding inflate(LayoutInflater layoutInflater) {
        return CcComplaintCardRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static CcComplaintCardRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cc_complaint_card_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CcComplaintCardRefreshBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}


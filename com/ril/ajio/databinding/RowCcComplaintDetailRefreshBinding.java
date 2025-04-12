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
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ItemCcComplaintCardRefreshBinding;

public final class RowCcComplaintDetailRefreshBinding
implements BC3 {
    public final ItemCcComplaintCardRefreshBinding ccComplaintCard;
    public final TextView ccDueDate;
    public final LinearLayout ccDueDateContainer;
    public final TextView ccDueDateText;
    public final TextView complaintDetailText;
    public final TextView complaintInfo;
    public final TextView complaintNewId;
    public final AjioTextView notificationText;
    private final ConstraintLayout rootView;

    private RowCcComplaintDetailRefreshBinding(ConstraintLayout constraintLayout, ItemCcComplaintCardRefreshBinding itemCcComplaintCardRefreshBinding, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.ccComplaintCard = itemCcComplaintCardRefreshBinding;
        this.ccDueDate = textView;
        this.ccDueDateContainer = linearLayout;
        this.ccDueDateText = textView2;
        this.complaintDetailText = textView3;
        this.complaintInfo = textView4;
        this.complaintNewId = textView5;
        this.notificationText = ajioTextView;
    }

    public static RowCcComplaintDetailRefreshBinding bind(View object) {
        int n3 = R$id.cc_complaint_card;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            ItemCcComplaintCardRefreshBinding itemCcComplaintCardRefreshBinding = ItemCcComplaintCardRefreshBinding.bind(view);
            n3 = R$id.cc_due_date;
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
                        n3 = R$id.complaint_detail_text;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (TextView)view;
                        if (view5 != null) {
                            n3 = R$id.complaint_info;
                            View view6 = view = dd2_2.a(n3, object);
                            view6 = (TextView)view;
                            if (view6 != null) {
                                n3 = R$id.complaint_new_id;
                                View view7 = view = dd2_2.a(n3, object);
                                view7 = (TextView)view;
                                if (view7 != null) {
                                    n3 = R$id.notification_text;
                                    Object object2 = view = dd2_2.a(n3, object);
                                    object2 = (AjioTextView)view;
                                    if (object2 != null) {
                                        Object object3 = object;
                                        object3 = (ConstraintLayout)((Object)object);
                                        RowCcComplaintDetailRefreshBinding rowCcComplaintDetailRefreshBinding = new RowCcComplaintDetailRefreshBinding((ConstraintLayout)((Object)object3), itemCcComplaintCardRefreshBinding, (TextView)view2, (LinearLayout)view3, (TextView)view4, (TextView)view5, (TextView)view6, (TextView)view7, (AjioTextView)object2);
                                        return rowCcComplaintDetailRefreshBinding;
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

    public static RowCcComplaintDetailRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCcComplaintDetailRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcComplaintDetailRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_complaint_detail_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcComplaintDetailRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}


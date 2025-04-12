/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ActivityReturnExchangeItemsListVerifyBinding
implements BC3 {
    public final RelativeLayout activityReturnExchangeItemsList;
    public final RecyclerView exchangeItemsListview;
    public final LinearLayout notification;
    public final AjioTextView notificationText;
    public final RecyclerView returnItemsListview;
    private final RelativeLayout rootView;

    private ActivityReturnExchangeItemsListVerifyBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RecyclerView recyclerView, LinearLayout linearLayout, AjioTextView ajioTextView, RecyclerView recyclerView2) {
        this.rootView = relativeLayout;
        this.activityReturnExchangeItemsList = relativeLayout2;
        this.exchangeItemsListview = recyclerView;
        this.notification = linearLayout;
        this.notificationText = ajioTextView;
        this.returnItemsListview = recyclerView2;
    }

    public static ActivityReturnExchangeItemsListVerifyBinding bind(View object) {
        View view;
        View view2 = object;
        view2 = (RelativeLayout)object;
        int n3 = R$id.exchange_items_listview;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (RecyclerView)view;
        if (object2 != null) {
            n3 = R$id.notification;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.notification_text;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.return_items_listview;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (RecyclerView)view;
                    if (object4 != null) {
                        Object object5 = object;
                        view = view2;
                        object = new ActivityReturnExchangeItemsListVerifyBinding((RelativeLayout)view2, (RelativeLayout)view2, (RecyclerView)object2, (LinearLayout)view3, (AjioTextView)object3, (RecyclerView)object4);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityReturnExchangeItemsListVerifyBinding inflate(LayoutInflater layoutInflater) {
        return ActivityReturnExchangeItemsListVerifyBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityReturnExchangeItemsListVerifyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_return_exchange_items_list_verify;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityReturnExchangeItemsListVerifyBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}


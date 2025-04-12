/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PriorityDeliveryTrackerInfoViewBinding
implements BC3 {
    public final AjioTextView priorityDeliveryTextInfoTv;
    public final RelativeLayout priorityDeliveryTrackerInfoRv;
    private final RelativeLayout rootView;

    private PriorityDeliveryTrackerInfoViewBinding(RelativeLayout relativeLayout, AjioTextView ajioTextView, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.priorityDeliveryTextInfoTv = ajioTextView;
        this.priorityDeliveryTrackerInfoRv = relativeLayout2;
    }

    public static PriorityDeliveryTrackerInfoViewBinding bind(View object) {
        int n3 = R$id.priority_delivery_text_info_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (RelativeLayout)object;
            PriorityDeliveryTrackerInfoViewBinding priorityDeliveryTrackerInfoViewBinding = new PriorityDeliveryTrackerInfoViewBinding((RelativeLayout)object, ajioTextView, (RelativeLayout)object);
            return priorityDeliveryTrackerInfoViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PriorityDeliveryTrackerInfoViewBinding inflate(LayoutInflater layoutInflater) {
        return PriorityDeliveryTrackerInfoViewBinding.inflate(layoutInflater, null, false);
    }

    public static PriorityDeliveryTrackerInfoViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.priority_delivery_tracker_info_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PriorityDeliveryTrackerInfoViewBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}


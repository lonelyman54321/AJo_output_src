/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.ondemand.customercare.callmeback;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.ondemand.customercare.callmeback.CallMeAdapterListener;
import com.ril.ajio.ondemand.customercare.callmeback.CallMeTimeSlotViewHolder;
import com.ril.ajio.services.data.CustomerCare.TimeSlots;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class CallMeTimeSlotAdapter
extends RecyclerView$f {
    private final ArrayList data;
    private final CallMeAdapterListener listener;

    public CallMeTimeSlotAdapter(ArrayList arrayList, CallMeAdapterListener callMeAdapterListener) {
        Intrinsics.checkNotNullParameter(arrayList, "data");
        Intrinsics.checkNotNullParameter(callMeAdapterListener, "listener");
        this.data = arrayList;
        this.listener = callMeAdapterListener;
    }

    public final ArrayList getData() {
        return this.data;
    }

    public int getItemCount() {
        return this.data.size();
    }

    public void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof CallMeTimeSlotViewHolder;
        if (bl2) {
            recyclerView$B = (CallMeTimeSlotViewHolder)recyclerView$B;
            object = this.data;
            TimeSlots timeSlots = (TimeSlots)((ArrayList)object).get(n3);
            ((CallMeTimeSlotViewHolder)recyclerView$B).setData(timeSlots);
        }
    }

    public RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.call_me_lang_row_view;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.listener;
        CallMeTimeSlotViewHolder callMeTimeSlotViewHolder = new CallMeTimeSlotViewHolder((View)viewGroup, (CallMeAdapterListener)object);
        return callMeTimeSlotViewHolder;
    }
}


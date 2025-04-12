/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.callmeback;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.ondemand.customercare.callmeback.CallMeAdapterListener;
import com.ril.ajio.services.data.CustomerCare.TimeSlots;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class CallMeTimeSlotViewHolder
extends RecyclerView$B {
    private final CallMeAdapterListener listener;
    private final TextView timeSlotTv;

    public CallMeTimeSlotViewHolder(View view, CallMeAdapterListener callMeAdapterListener) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(callMeAdapterListener, "listener");
        super(view);
        this.listener = callMeAdapterListener;
        int n3 = R$id.lang_tv;
        view = (TextView)view.findViewById(n3);
        this.timeSlotTv = view;
    }

    private static final void setData$lambda$0(CallMeTimeSlotViewHolder callMeTimeSlotViewHolder, TimeSlots timeSlots, View view) {
        Intrinsics.checkNotNullParameter(callMeTimeSlotViewHolder, "this$0");
        callMeTimeSlotViewHolder.listener.onTimeSlotClick(timeSlots);
    }

    public static /* synthetic */ void w(CallMeTimeSlotViewHolder callMeTimeSlotViewHolder, TimeSlots timeSlots, View view) {
        CallMeTimeSlotViewHolder.setData$lambda$0(callMeTimeSlotViewHolder, timeSlots, view);
    }

    public final TextView getTimeSlotTv() {
        return this.timeSlotTv;
    }

    public final void setData(TimeSlots timeSlots) {
        int n3;
        Object object;
        if (timeSlots != null && (object = timeSlots.getSlotDisplayText()) != null && (n3 = object.length()) != 0) {
            boolean bl2;
            CharSequence charSequence;
            object = timeSlots.getSlotDisplayText();
            Object object2 = timeSlots.getSlotDay();
            int n4 = b.i((String)object2, (String)(charSequence = "TODAY"), bl2 = true);
            if (n4 != 0 && (n4 = b.i((String)(object2 = timeSlots.getSlotTime()), (String)(charSequence = "NOW"), bl2)) != 0) {
                int n7;
                long l2 = System.currentTimeMillis();
                Object object3 = this.listener.getEstimatedWaitTime();
                if (object3 != null && (n7 = object3.length()) != 0) {
                    try {
                        long l3 = Long.parseLong((String)object3);
                    }
                    catch (NumberFormatException numberFormatException) {}
                    long l4 = 60;
                    l3 *= l4;
                    int n8 = 1000;
                    l4 = n8;
                    l2 += (l3 *= l4);
                    String string2 = "hh:mm a";
                    Locale locale = Locale.ENGLISH;
                    object3 = new SimpleDateFormat(string2, locale);
                    object2 = l2;
                    object2 = ((Format)object3).format(object2);
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append((String)object);
                    object3 = " by ";
                    ((StringBuilder)charSequence).append((String)object3);
                    ((StringBuilder)charSequence).append((String)object2);
                    object = ((StringBuilder)charSequence).toString();
                }
            }
            object2 = this.timeSlotTv;
            object2.setText((CharSequence)object);
            object = this.listener;
            n3 = (int)(object.isTimeSlotSelected(timeSlots) ? 1 : 0);
            if (n3 != 0) {
                object = this.timeSlotTv;
                n4 = hv3_0.m(R$color.accent_color_10);
                object.setBackgroundColor(n4);
                object = this.timeSlotTv;
                n4 = hv3_0.m(R$color.accent_color_11);
                object.setTextColor(n4);
            } else {
                object = this.timeSlotTv;
                n4 = hv3_0.m(R$color.accent_color_11);
                object.setBackgroundColor(n4);
                object = this.timeSlotTv;
                n4 = hv3_0.m(R$color.accent_color_10);
                object.setTextColor(n4);
            }
            object = this.timeSlotTv;
            object2 = new pj_2(this, timeSlots);
            object.setOnClickListener((View.OnClickListener)object2);
        }
    }
}


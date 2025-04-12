/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.ondemand.customercare.callmeback;

import com.ril.ajio.services.data.CustomerCare.TimeSlots;

public interface CallMeAdapterListener {
    public String getEstimatedWaitTime();

    public String getSelectedLang();

    public boolean isTimeSlotSelected(TimeSlots var1);

    public void onLanguageClick(String var1);

    public void onTimeSlotClick(TimeSlots var1);
}


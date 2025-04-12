/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.ondemand.customercare.callmeback.CallMeTimeSlotViewHolder;
import com.ril.ajio.services.data.CustomerCare.TimeSlots;

/*
 * Renamed from PJ
 */
public final class pj_2
implements View.OnClickListener {
    public final /* synthetic */ CallMeTimeSlotViewHolder a;
    public final /* synthetic */ TimeSlots b;

    public /* synthetic */ pj_2(CallMeTimeSlotViewHolder callMeTimeSlotViewHolder, TimeSlots timeSlots) {
        this.a = callMeTimeSlotViewHolder;
        this.b = timeSlots;
    }

    public final void onClick(View view) {
        CallMeTimeSlotViewHolder callMeTimeSlotViewHolder = this.a;
        TimeSlots timeSlots = this.b;
        CallMeTimeSlotViewHolder.w(callMeTimeSlotViewHolder, timeSlots, view);
    }
}


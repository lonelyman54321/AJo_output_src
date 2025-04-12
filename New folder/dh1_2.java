/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.CalendarView
 *  android.widget.CalendarView$OnDateChangeListener
 */
import android.widget.CalendarView;
import in.juspay.hypersdk.core.InflateView;

/*
 * Renamed from dh1
 */
public final class dh1_2
implements CalendarView.OnDateChangeListener {
    public final /* synthetic */ InflateView a;
    public final /* synthetic */ String b;

    public /* synthetic */ dh1_2(InflateView inflateView, String string2) {
        this.a = inflateView;
        this.b = string2;
    }

    public final void onSelectedDayChange(CalendarView calendarView, int n3, int n4, int n7) {
        InflateView inflateView = this.a;
        String string2 = this.b;
        InflateView.d(inflateView, string2, calendarView, n3, n4, n7);
    }
}


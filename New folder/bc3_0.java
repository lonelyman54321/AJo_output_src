/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.BatteryManager
 *  android.text.StaticLayout$Builder
 *  android.view.SearchEvent
 *  android.view.Window$Callback
 */
import android.os.BatteryManager;
import android.text.StaticLayout;
import android.view.SearchEvent;
import android.view.Window;

/*
 * Renamed from bc3
 */
public final class bc3_0 {
    public static /* bridge */ /* synthetic */ void a(StaticLayout.Builder builder, int n3) {
        builder.setEllipsizedWidth(n3);
    }

    public static /* bridge */ /* synthetic */ boolean b(BatteryManager batteryManager) {
        return batteryManager.isCharging();
    }

    public static /* bridge */ /* synthetic */ boolean c(Window.Callback callback2, SearchEvent searchEvent) {
        return callback2.onSearchRequested(searchEvent);
    }
}


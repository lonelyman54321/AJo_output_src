/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager$Companion;

/*
 * Renamed from Vb0
 */
public final class vb0_0 {
    public static void a(AnalyticsManager$Companion analyticsManager$Companion, String string2, Bundle bundle) {
        analyticsManager$Companion.getInstance().getGtmEvents().pushOpenScreenEvent(string2, bundle);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 */
import android.os.Message;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler$Companion;

/*
 * Renamed from VG
 */
public final class vg_1 {
    public static AnalyticsGAEventHandler a(AnalyticsGAEventHandler$Companion analyticsGAEventHandler$Companion, Message message) {
        analyticsGAEventHandler$Companion.getInstance().sendMessage(message);
        return analyticsGAEventHandler$Companion.getInstance();
    }
}


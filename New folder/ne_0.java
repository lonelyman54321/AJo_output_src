/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import java.util.List;

/*
 * Renamed from ne
 */
public final class ne_0 {
    public static int a(int n3, int n4, List list) {
        return (((Object)list).hashCode() + n3) * n4;
    }

    public static AnalyticsData b(Bundle bundle) {
        AnalyticsData$Builder analyticsData$Builder = new AnalyticsData$Builder();
        return analyticsData$Builder.bundle(bundle).build();
    }
}


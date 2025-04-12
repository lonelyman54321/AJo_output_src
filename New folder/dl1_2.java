/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.retargeting.JioAdsEventService;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from dl1
 */
public final class dl1_2
implements Function0 {
    public final Object invoke() {
        Object object = el1_2.a;
        JioAdsEventService jioAdsEventService = new JioAdsEventService((Context)object);
        boolean bl2 = vl1_2.c();
        if (bl2) {
            object = JioAds.Companion.getInstance();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.DEBUG;
            ((JioAds)object).setLogLevel(jioAds$LogLevel);
            object = "stg";
            jioAdsEventService.setConfigEnvironment((String)object);
        }
        return jioAdsEventService;
    }
}


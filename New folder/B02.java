/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.internal.Intrinsics;

public final class B02 {
    public final yi2_1 a;
    public final sj2_0 b;
    public final zi2_1 c;
    public final NewCustomEventsRevamp d;

    public B02(Context object, View view, UserInformation userInformation, yi2_1 yi2_12, sj2_0 sj2_02) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(view, "parentView");
        Intrinsics.checkNotNullParameter(userInformation, "userInformation");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(sj2_02, "pdpuiDelegateListener");
        this.a = yi2_12;
        this.b = sj2_02;
        object = yi2_12.Aa();
        this.c = object;
        object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.d = object;
    }
}


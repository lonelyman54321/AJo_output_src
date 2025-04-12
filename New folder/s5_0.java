/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.ajiocash.AjioCashTransferStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from S5
 */
public final class s5_0
implements Function2 {
    public final /* synthetic */ AjioCashTransferStatus a;

    public /* synthetic */ s5_0(AjioCashTransferStatus ajioCashTransferStatus) {
        this.a = ajioCashTransferStatus;
    }

    public final Object invoke(Object object, Object object2) {
        float f5;
        object = (String)object;
        object2 = (String)object2;
        String string2 = "status";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, "id");
        Object object3 = ye3_0.a;
        object3 = this.a;
        if (object3 != null && (object3 = ((AjioCashTransferStatus)object3).getAmount()) != null) {
            double d2 = (Double)object3;
            f5 = (float)d2;
        } else {
            f5 = 0.0f;
            object3 = null;
        }
        string2 = dm_1.a((String)object, string2, (String)object2, "transferId");
        String string3 = ye3_0.b;
        string2.putFloat(string3, f5);
        object3 = AnalyticsManager.Companion;
        GTMEvents gTMEvents = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
        String string4 = n1.a((String)object, "_", (String)object2);
        String string5 = av_0.a((AnalyticsManager$Companion)object3);
        AnalyticsData analyticsData = ne_0.b((Bundle)string2);
        GTMEvents.pushButtonTapEvent$default(gTMEvents, "bank transfer status", string4, string5, analyticsData, null, 16, null);
        return Unit.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.ServiceErrorEventTracker;
import com.ril.ajio.services.data.Product.EddResult;

/*
 * Renamed from sS
 */
public final class ss_1 {
    public static final NewCustomEventsRevamp a = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();

    public static void a(EddResult eddResult, DataError dataError) {
        boolean bl2;
        Object object;
        int n3;
        Object object2;
        boolean bl3 = false;
        Object object3 = null;
        if (eddResult != null) {
            object2 = eddResult.getStatus();
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null) {
            n3 = eddResult.getStatus().getStatusCode();
            object2 = UX.a(n3, " ");
            object = eddResult.getStatus().getMessageDescription();
            boolean bl4 = TextUtils.isEmpty((CharSequence)object);
            if (!bl4) {
                object = eddResult.getStatus().getMessageDescription();
                object2 = Ft2.a((String)object2, (String)object);
            }
        } else {
            object2 = "";
        }
        if (dataError != null) {
            object3 = dataError.getErrorMessage();
        }
        if (object3 != null && !(bl3 = TextUtils.isEmpty((CharSequence)(object3 = dataError.getErrorMessage().getMessage())))) {
            object3 = dataError.getErrorMessage();
            object2 = ((DataError$ErrorMessage)object3).getMessage();
        }
        if (eddResult == null && (bl2 = TextUtils.isEmpty((CharSequence)object2))) {
            object2 = "eddResult is null";
        } else if (dataError == null && (bl2 = TextUtils.isEmpty((CharSequence)object2))) {
            object2 = "dataError is null";
        }
        bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl2) {
            object = ServiceErrorEventTracker.INSTANCE;
            Boolean bl5 = Boolean.FALSE;
            int n4 = 200;
            String string2 = "ShippingEddCheck";
            String string3 = "";
            String string4 = "";
            ((ServiceErrorEventTracker)object).trackServiceErrorEvent(string2, (String)object2, n4, null, bl5, string3, string4);
        }
    }
}


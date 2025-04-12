/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.Toast
 */
import android.content.Context;
import android.widget.Toast;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.kmm.shared.util.KMMInitializer;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Y3
 */
public final class y3_0
extends FunctionReferenceImpl
implements Function1 {
    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (AdvertisingIdClient$Info)object;
        Intrinsics.checkNotNullParameter(object2, "p0");
        Object object3 = (a4_0)this.receiver;
        object3.getClass();
        Intrinsics.checkNotNullParameter(object2, "info");
        Object object4 = yn3_0.a;
        Object object5 = ((AdvertisingIdClient$Info)object2).getId();
        object5 = kp1_0.c("AdIdInitializer ", (String)object5);
        String string2 = null;
        Object object6 = new Object[]{};
        ((yn3$a)object4).a((String)object5, object6);
        object5 = "qa";
        object6 = "prod";
        if (object6 == object5 || object6 == (object5 = "qaregression")) {
            object5 = cp_1.Companion;
            boolean bl2 = km_1.b((cp$a)object5);
            object6 = "onAdIdSuccess";
            if (!bl2) {
                AJIOApplication.Companion.getClass();
                object5 = AJIOApplication$a.a();
                int n3 = 1;
                object5 = Toast.makeText((Context)object5, (CharSequence)object6, (int)n3);
                object5.show();
            }
            ((yn3$a)object4).l("AdIdWorker");
            object5 = new Object[]{};
            ((yn3$a)object4).a((String)object6, (Object[])object5);
        }
        HashMap<String, Toast> hashMap = object4;
        object4 = new HashMap();
        object5 = ((AdvertisingIdClient$Info)object2).getId();
        string2 = "adId";
        ((HashMap)object4).put(string2, object5);
        object4 = AnalyticsManager.Companion.getInstance().getCt();
        long l2 = 0L;
        int n4 = 65279;
        object5 = new AnalyticsData(null, null, null, l2, null, null, null, null, hashMap, null, null, null, null, null, null, null, n4, null);
        ((CleverTapEvents)object4).sendAdId((AnalyticsData)object5);
        object4 = ((AdvertisingIdClient$Info)object2).getId();
        object5 = ((a4_0)object3).a;
        if (object4 != null) {
            ((sw_0)object5).putPreference(string2, (String)object4);
        } else {
            object5.getClass();
        }
        object4 = ((AdvertisingIdClient$Info)object2).getId();
        if (object4 != null) {
            object5 = ((a4_0)object3).b;
            object5.getClass();
            string2 = "ad_id";
            Intrinsics.checkNotNullParameter(object4, string2);
            ((sw_0)object5).putPreference(string2, (String)object4);
        }
        object4 = KMMInitializer.INSTANCE;
        object2 = ((AdvertisingIdClient$Info)object2).getId();
        ((KMMInitializer)object4).updateAdId((String)object2);
        object2 = ((a4_0)object3).c;
        if (object2 != null) {
            object3 = Boolean.TRUE;
            object2 = (H53$a)object2;
            ((H53$a)object2).a(object3);
        }
        return Unit.a;
    }
}


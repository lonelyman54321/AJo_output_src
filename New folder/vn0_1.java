/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.services.helper.UrlHelper;

/*
 * Renamed from vN0
 */
public final class vn0_1
implements jn_0 {
    public final FirebaseEvents a;

    public vn0_1() {
        FirebaseEvents firebaseEvents;
        this.a = firebaseEvents = FirebaseEvents.Companion.getInstance();
    }

    public final void a() {
        Object object = this.a;
        ((FirebaseEvents)object).setPlatform();
        ((FirebaseEvents)object).updatePDPUserExperiment();
        ((FirebaseEvents)object).updateNotificationVariant();
        ((FirebaseEvents)object).updateFreqHours();
        object = UrlHelper.Companion.getInstance();
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        ((UrlHelper)object).initApiHashMap((Context)aJIOApplication);
    }
}


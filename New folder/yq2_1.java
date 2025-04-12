/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.preference.PreferenceManager
 *  android.widget.Toast
 */
import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Toast;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.ServiceErrorEventTracker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YQ2
 */
public final class yq2_1
implements E40,
v53_0 {
    public final A40 a;
    public l53_0 b;

    public yq2_1() {
        boolean bl2;
        Iterator iterator;
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        Intrinsics.checkNotNullParameter(object, "application");
        Object object2 = "com.ril.ajio_preferences";
        super((String)object2, (Context)object);
        this.a = iterator;
        in_1.Companion.getClass();
        iterator = in_1.b;
        if (iterator == null) {
            iterator = new Iterator();
            in_1.b = iterator;
        }
        iterator = in_1.b;
        Intrinsics.checkNotNull(iterator, "null cannot be cast to non-null type com.ril.ajio.launch.config.AppConfigInitializer");
        iterator.getClass();
        object = z40_0.Companion;
        object2 = AJIOApplication$a.a();
        object.getClass();
        object = z40$a.a((Context)object2).a;
        object.getClass();
        object2 = yn3_0.a;
        Object object3 = new Object[]{};
        String string2 = "Remote Config Initialised";
        ((yn3$a)object2).a(string2, (Object[])object3);
        object3 = cw.Companion;
        object = ((cw)object).c();
        object3.getClass();
        cw.c = object;
        object3 = K40.o();
        ((FirebaseRemoteConfig)object).setDefaultsAsync((Map)object3);
        ((yn3$a)object2).l("AppConfigInitializer");
        Object[] objectArray = new Object[]{};
        ((yn3$a)object2).a("App Config Initialized", objectArray);
        iterator = ((in_1)((Object)iterator)).a.iterator();
        object = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(iterator, (String)object);
        while (bl2 = iterator.hasNext()) {
            object = iterator.next();
            object2 = "next(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = (jn_0)object;
            object.getClass();
        }
    }

    public final void a() {
        Object object = yn3_0.a;
        boolean bl2 = false;
        Object object2 = null;
        Object object3 = new Object[]{};
        String string2 = "onConfigSuccess";
        ((yn3$a)object).a(string2, (Object[])object3);
        object3 = this.a;
        int n3 = 3444;
        ((sw_0)object3).putPreference("CONFIG_FETCHED_VERSION_CODE", n3);
        long l2 = System.currentTimeMillis();
        ((sw_0)object3).putPreference("CONFIG_FETCHED_TIME", l2);
        int n4 = 1;
        li0_2.a = n4;
        Object object4 = "qa";
        String string3 = "prod";
        if (string3 == object4 || string3 == (object4 = "qaregression")) {
            object4 = cp_1.Companion;
            boolean bl3 = km_1.b((cp$a)object4);
            if (!bl3) {
                AJIOApplication.Companion.getClass();
                object4 = AJIOApplication$a.a();
                object3 = Toast.makeText((Context)object4, (CharSequence)string2, (int)n4);
                object3.show();
            }
            object3 = "ConfigWorker";
            ((yn3$a)object).l((String)object3);
            object2 = new Object[]{};
            ((yn3$a)object).a(string2, (Object[])object2);
        }
        in_1.Companion.getClass();
        object = in_1.b;
        if (object == null) {
            in_1.b = object = new in_1();
        }
        object = in_1.b;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.launch.config.AppConfigInitializer");
        object = ((in_1)object).a.iterator();
        object2 = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        while (bl2 = object.hasNext()) {
            object2 = object.next();
            object3 = "next(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            object2 = (jn_0)object2;
            object2.a();
        }
        object = this.b;
        if (object != null) {
            object2 = Boolean.TRUE;
            object = (H53$a)object;
            ((H53$a)object).a(object2);
        }
        object = new Bundle();
        GAEcommerceEvents.pushEventBundle("ajio_firebase_remote_config_success", (Bundle)object);
        object = new y72_0();
        ((y72_0)object).a();
    }

    public final void b(H53$a object) {
        int n3 = 1;
        aw_0 aw_02 = null;
        Intrinsics.checkNotNullParameter(object, "emitter");
        this.b = object;
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = this.a;
        Object object3 = "CONFIG_FETCHED_VERSION_CODE";
        int n4 = ((sw_0)object2).getPreference((String)object3, 0);
        int n7 = 3444;
        if (n4 == n7) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        object.getClass();
        Intrinsics.checkNotNullParameter(this, "configResultListener");
        object3 = TimeUnit.MINUTES;
        long l2 = 30;
        long l3 = ((TimeUnit)((Object)object3)).toMinutes(l2);
        Object object4 = PreferenceManager.getDefaultSharedPreferences((Context)((cw)object).a);
        String string2 = "CONFIG_STALE";
        boolean bl2 = object4.getBoolean(string2, false);
        if (bl2 || n4 != 0) {
            l3 = 0L;
        }
        object2 = yn3_0.a;
        ((yn3$a)object2).l("FirebaseRemoteConfig");
        object4 = l3;
        Object object5 = new Object[n3];
        object5[0] = object4;
        ((yn3$a)object2).a("Cache expiration time in seconds: %s", (Object[])object5);
        object5 = ((cw)object).c().fetch(l3);
        aw_02 = new aw_0((ao0_0)object, this);
        ((Task)object5).addOnCompleteListener(aw_02);
    }

    public final void c(String string2, String string3) {
        Object[] objectArray;
        Object object;
        Intrinsics.checkNotNullParameter(string2, "exceptionType");
        Intrinsics.checkNotNullParameter(string3, "exceptionMessage");
        Object object2 = z40_0.Companion;
        object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
        boolean bl2 = ((ao0_0)object2).a("firebase_setup_failure_event_enable");
        String string4 = ":";
        if (bl2) {
            object = ServiceErrorEventTracker.INSTANCE;
            String string5 = n1.a(string2, string4, string3);
            objectArray = "firebase_config";
            int n3 = 120;
            ServiceErrorEventTracker.trackServiceErrorEvent$default((ServiceErrorEventTracker)object, (String)objectArray, string5, 0, null, null, null, null, n3, null);
        }
        if ((object = "prod") == (object2 = "qa") || object == (object2 = "qaregression")) {
            object2 = AJIOApplication$a.a();
            object = new StringBuilder();
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(string4);
            ((StringBuilder)object).append(string3);
            object = ((StringBuilder)object).toString();
            Toast.makeText((Context)object2, (CharSequence)object, (int)1).show();
            object2 = yn3_0.a;
            ((yn3$a)object2).l("ConfigWorker");
            object = new StringBuilder();
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(string4);
            ((StringBuilder)object).append(string3);
            object = ((StringBuilder)object).toString();
            objectArray = new Object[]{};
            ((yn3$a)object2).a((String)object, objectArray);
        }
        if ((object2 = this.b) != null) {
            string2 = n1.a(string2, string4, string3);
            object = new Exception(string2);
            object2 = (H53$a)object2;
            ((H53$a)object2).b((Throwable)object);
        }
        string2 = new Bundle();
        GAEcommerceEvents.pushEventBundle("ajio_firebase_remote_config_failed", (Bundle)string2);
    }
}


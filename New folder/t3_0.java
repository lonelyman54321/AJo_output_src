/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.preference.PreferenceManager
 */
import android.content.Context;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from t3
 */
public final class t3_0
implements Runnable {
    public final void run() {
        Object object = v3.h;
        if (object == null) {
            object = PreferenceManager.getDefaultSharedPreferences((Context)FacebookSdk.a());
            long l2 = 0L;
            long l3 = object.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", l2);
            long l4 = object.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", l2);
            Object object2 = null;
            String string2 = object.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            Object object3 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (object3 != false && (object3 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1)) != false && string2 != null) {
                int bl2;
                Object object4 = l3;
                Long l7 = l4;
                t03 t032 = new t03((Long)object4, l7);
                l7 = null;
                t032.d = bl2 = object.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                object = PreferenceManager.getDefaultSharedPreferences((Context)FacebookSdk.a());
                boolean bl3 = object.contains((String)(object4 = "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage"));
                if (bl3) {
                    object4 = object.getString((String)object4, null);
                    String string3 = "com.facebook.appevents.SourceApplicationInfo.openedByApplink";
                    boolean bl4 = object.getBoolean(string3, false);
                    object2 = new c93_0((String)object4, bl4);
                }
                t032.f = object2;
                long l8 = System.currentTimeMillis();
                t032.e = object = Long.valueOf(l8);
                object = UUID.fromString(string2);
                Intrinsics.checkNotNullExpressionValue(object, "fromString(sessionIDStr)");
                string2 = "<set-?>";
                Intrinsics.checkNotNullParameter(object, string2);
                t032.c = object;
                object2 = t032;
            }
            v3.h = object2;
        }
    }
}


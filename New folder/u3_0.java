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
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from u3
 */
public final class u3_0
implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;

    public /* synthetic */ u3_0(long l2, String string2) {
        this.a = l2;
        this.b = string2;
    }

    public final void run() {
        Object object;
        int n3;
        Object object2;
        long l2 = this.a;
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$activityName");
        t03 t032 = v3.h;
        if (t032 == null) {
            object2 = l2;
            v3.h = t032 = new t03((Long)object2, null);
        }
        if ((n3 = ((AtomicInteger)(object2 = v3.g)).get()) <= 0) {
            object2 = v3.h;
            object = v3.j;
            v03.d(string2, (t03)object2, (String)object);
            object2 = PreferenceManager.getDefaultSharedPreferences((Context)FacebookSdk.a()).edit();
            object2.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            object2.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            object2.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            object2.remove("com.facebook.appevents.SessionInfo.sessionId");
            object2.apply();
            object2 = PreferenceManager.getDefaultSharedPreferences((Context)FacebookSdk.a()).edit();
            object2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            object = "com.facebook.appevents.SourceApplicationInfo.openedByApplink";
            object2.remove((String)object);
            object2.apply();
            v3.h = null;
        }
        object2 = v3.f;
        synchronized (object2) {
            v3.e = null;
            object = Unit.a;
            return;
        }
    }
}


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

public final class t03 {
    public final Long a;
    public Long b;
    public UUID c;
    public int d;
    public Long e;
    public c93_0 f;

    public t03(Long l2, Long l3) {
        UUID uUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uUID, "randomUUID()");
        Intrinsics.checkNotNullParameter(uUID, "sessionId");
        this.a = l2;
        this.b = l3;
        this.c = uUID;
    }

    public final void a() {
        Object object = PreferenceManager.getDefaultSharedPreferences((Context)FacebookSdk.a()).edit();
        long l2 = 0L;
        Object object2 = this.a;
        long l3 = object2 != null ? (Long)object2 : l2;
        String string2 = "com.facebook.appevents.SessionInfo.sessionStartTime";
        object.putLong(string2, l3);
        object2 = this.b;
        if (object2 != null) {
            l2 = (Long)object2;
        }
        object2 = "com.facebook.appevents.SessionInfo.sessionEndTime";
        object.putLong((String)object2, l2);
        int n3 = this.d;
        object.putInt("com.facebook.appevents.SessionInfo.interruptionCount", n3);
        String string3 = this.c.toString();
        String string4 = "com.facebook.appevents.SessionInfo.sessionId";
        object.putString(string4, string3);
        object.apply();
        object = this.f;
        if (object != null && object != null) {
            string3 = PreferenceManager.getDefaultSharedPreferences((Context)FacebookSdk.a()).edit();
            object2 = object.a;
            string3.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", (String)object2);
            string4 = "com.facebook.appevents.SourceApplicationInfo.openedByApplink";
            boolean bl2 = object.b;
            string3.putBoolean(string4, bl2);
            string3.apply();
        }
    }
}


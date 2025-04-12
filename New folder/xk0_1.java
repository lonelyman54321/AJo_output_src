/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from XK0
 */
public final class xk0_1
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    public /* synthetic */ xk0_1(Context context, String string2, String string3) {
        this.a = string2;
        this.b = context;
        this.c = string3;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$applicationId");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$context");
        String string2 = this.c;
        Intrinsics.checkNotNullParameter(string2, "$gateKeepersKey");
        zk0_1.a.getClass();
        JSONObject jSONObject = zk0_1.a();
        int n3 = jSONObject.length();
        if (n3 != 0) {
            zk0_1.d((String)object, jSONObject);
            object = object2.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit();
            object2 = jSONObject.toString();
            object.putString(string2, (String)object2).apply();
            long l2 = System.currentTimeMillis();
            zk0_1.e = object = Long.valueOf(l2);
        }
        zk0_1.e();
        zk0_1.b.set(false);
    }
}


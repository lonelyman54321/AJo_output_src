/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.app.Application;
import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.appevents.g;
import com.facebook.appevents.g$a;
import com.facebook.j;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from bL0
 */
public final class bl0_2
implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ bl0_2(Context context, String string2, String string3) {
        this.a = context;
        this.b = string2;
        this.c = string3;
    }

    public final void run() {
        int n3;
        Object object;
        int n4 = 1;
        boolean bl2 = false;
        Object object2 = null;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "$context");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$settingsKey");
        String string3 = this.c;
        Intrinsics.checkNotNullParameter(string3, "$applicationId");
        object3 = object3.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        Object object4 = null;
        Object object5 = object3.getString(string2, null);
        boolean bl3 = lz3_0.A((String)object5);
        dl0_2 dl0_22 = dl0_2.a;
        if (!bl3) {
            if (object5 != null) {
                try {
                    object = new JSONObject((String)object5);
                }
                catch (JSONException jSONException) {
                    object5 = FacebookSdk.a;
                    bl3 = false;
                    object = null;
                }
                if (object != null) {
                    dl0_22.getClass();
                    object4 = dl0_2.e(string3, object);
                }
            } else {
                object2 = "Required value was null.".toString();
                IllegalStateException illegalStateException = new IllegalStateException((String)object2);
                throw illegalStateException;
            }
        }
        dl0_22.getClass();
        object5 = dl0_2.a();
        dl0_2.e(string3, (JSONObject)object5);
        object3 = object3.edit();
        object5 = object5.toString();
        object3 = object3.putString(string2, (String)object5);
        object3.apply();
        if (object4 != null && (n3 = dl0_2.f) == 0 && (object3 = object4.l) != null && (n3 = ((String)object3).length()) > 0) {
            dl0_2.f = n4;
        }
        object3 = zk0_1.a;
        Intrinsics.checkNotNullParameter(string3, "applicationId");
        zk0_1.a.getClass();
        object3 = zk0_1.a();
        string2 = FacebookSdk.a();
        object4 = StringCompanionObject.INSTANCE;
        object4 = new Object[n4];
        object4[0] = string3;
        object5 = "com.facebook.internal.APP_GATEKEEPERS.%s";
        object = "format(format, *args)";
        Object object6 = xh2_0.a(object4, n4, (String)object5, (String)object);
        object4 = "com.facebook.internal.preferences.APP_GATEKEEPERS";
        object2 = string2.getSharedPreferences((String)object4, 0).edit();
        string2 = object3.toString();
        object2.putString((String)object6, string2).apply();
        zk0_1.d(string3, (JSONObject)object3);
        object6 = ct.a;
        object6 = FacebookSdk.a();
        object2 = FacebookSdk.b();
        n3 = (int)(j.c() ? 1 : 0);
        if (n3 != 0 && (n3 = object6 instanceof Application) != 0) {
            object6 = (Application)object6;
            Intrinsics.checkNotNullParameter(object6, "application");
            object3 = g.c;
            g$a.b((Application)object6, (String)object2);
        }
        object6 = dl0_2.d;
        object2 = dl0_2.c;
        bl2 = ((ConcurrentHashMap)object2).containsKey(string3);
        object2 = bl2 ? dl0$a_0.SUCCESS : dl0$a_0.ERROR;
        ((AtomicReference)object6).set(object2);
        dl0_22.j();
    }
}


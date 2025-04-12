/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import com.facebook.appevents.j;
import in.juspay.hypersdk.analytics.LogPusher;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from Mw1
 */
public final class mw1_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mw1_2(LogPusher logPusher, JSONObject jSONObject) {
        this.a = 0;
        this.b = logPusher;
        this.c = jSONObject;
    }

    public /* synthetic */ mw1_2(String string2) {
        this.a = 1;
        this.b = "com.facebook.appevents.UserDataStore.internalUserData";
        this.c = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                String string2 = (String)this.b;
                String string3 = (String)this.c;
                Class<j> clazz = j.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return;
                }
                Object object = "$key";
                try {
                    Intrinsics.checkNotNullParameter(string2, (String)object);
                    object = "$value";
                    Intrinsics.checkNotNullParameter(string3, (String)object);
                    object = j.c;
                    bl2 = ((AtomicBoolean)object).get();
                    if (!bl2) {
                        object = j.a;
                        ((j)object).b();
                    }
                    if ((object = j.b) == null) {
                        object = "sharedPreferences";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                        bl2 = false;
                        object = null;
                    }
                    object = object.edit();
                    string2 = object.putString(string2, string3);
                    string2.apply();
                    return;
                }
                catch (Throwable throwable) {}
                td0.a(clazz, throwable);
                return;
            }
            case 0: 
        }
        LogPusher logPusher = (LogPusher)this.b;
        JSONObject jSONObject = (JSONObject)this.c;
        LogPusher.c(logPusher, jSONObject);
    }
}


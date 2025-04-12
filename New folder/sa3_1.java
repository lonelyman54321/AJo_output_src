/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.a$a;
import com.clevertap.android.sdk.b;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from sA3
 */
public final class sa3_1
implements Callable {
    public final /* synthetic */ ta3_1 a;

    public /* synthetic */ sa3_1(ta3_1 ta3_12) {
        this.a = ta3_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Object object;
        Object object2;
        block5: {
            object2 = this.a;
            object2.getClass();
            b.d();
            object = ((ta3_1)object2).d;
            if (object != null) {
                try {
                    JSONObject jSONObject = wm1_1.d((Map)object);
                    object = jSONObject.toString();
                    break block5;
                }
                catch (JSONException jSONException) {
                    object.toString();
                    b.l();
                }
            }
            object = null;
        }
        b.d();
        CleverTapInstanceConfig cleverTapInstanceConfig = ((ta3_1)object2).h;
        String string2 = "variablesKey";
        String string3 = gc3_0.l(cleverTapInstanceConfig, string2);
        try {
            object2 = ((ta3_1)object2).f;
            gc3_0.k((Context)object2, string3, (String)object);
            return null;
        }
        catch (Throwable throwable) {
            object2 = a$a.INFO;
            ((a$a)((Object)object2)).intValue();
        }
        return null;
    }
}


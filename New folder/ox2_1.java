/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.view.View
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.SharedPreferences;
import android.view.View;
import com.facebook.FacebookSdk;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from Ox2
 */
public final class ox2_1 {
    public static final ox2_1 a;
    public static final LinkedHashMap b;
    public static SharedPreferences c;
    public static final AtomicBoolean d;

    static {
        Serializable serializable = new Serializable();
        a = serializable;
        b = serializable = new Serializable();
        serializable = new Serializable(false);
        d = serializable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(String string2, String string3) {
        Throwable throwable2;
        Class<ox2_1> clazz;
        block5: {
            Object object;
            block4: {
                clazz = ox2_1.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return;
                }
                object = "pathID";
                try {
                    Intrinsics.checkNotNullParameter(string2, (String)object);
                    object = "predictedEvent";
                    Intrinsics.checkNotNullParameter(string3, (String)object);
                    object = d;
                    bl2 = ((AtomicBoolean)object).get();
                    if (bl2) break block4;
                    object = a;
                    ((ox2_1)object).c();
                }
                catch (Throwable throwable2) {
                    break block5;
                }
            }
            object = b;
            object.put(string2, string3);
            string2 = c;
            if (string2 == null) {
                string2 = "shardPreferences";
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                string2 = null;
            }
            string2 = string2.edit();
            string3 = "SUGGESTED_EVENTS_HISTORY";
            object = fh1_2.o((Map)object);
            object = lz3_0.E((Map)object);
            string2 = string2.putString(string3, (String)object);
            string2.apply();
            return;
        }
        td0.a(clazz, throwable2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public static final String b(View var0, String var1_2) {
        block7: {
            block8: {
                var2_3 = "text";
                var3_4 = ox2_1.class;
                var4_5 = td0.b(var3_4);
                if (var4_5) {
                    return null;
                }
                var5_6 = "view";
                Intrinsics.checkNotNullParameter(var0, var5_6);
                Intrinsics.checkNotNullParameter(var1_2, (String)var2_3);
                var5_6 = new JSONObject();
                var5_6.put((String)var2_3, (Object)var1_2);
                var1_2 = new JSONArray();
                while (var0 != null) {
                    var2_3 = var0.getClass();
                    var2_3 = var2_3.getSimpleName();
                    var1_2.put(var2_3);
                    var0 = xc3_0.i((View)var0);
                }
                break block8;
                catch (Throwable var0_1) {}
                break block7;
            }
            var0 = "classname";
            var5_6.put((String)var0, (Object)var1_2);
lbl29:
            // 2 sources

            while (true) {
                var0 = var5_6.toString();
                return lz3_0.O((String)var0);
            }
        }
        td0.a(var3_4, var0_1);
        return null;
        {
            catch (JSONException v0) {
                ** continue;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        Throwable throwable2;
        block6: {
            String string2;
            Object object;
            Object object2;
            AtomicBoolean atomicBoolean;
            Object object3;
            block5: {
                object3 = "";
                boolean bl2 = td0.b(this);
                if (bl2) {
                    return;
                }
                try {
                    atomicBoolean = d;
                    boolean bl3 = atomicBoolean.get();
                    if (bl3) {
                        return;
                    }
                    object2 = FacebookSdk.a();
                    object = "com.facebook.internal.SUGGESTED_EVENTS_HISTORY";
                    string2 = null;
                    object2 = object2.getSharedPreferences((String)object, 0);
                    object = "getApplicationContext()\n\u2026RE, Context.MODE_PRIVATE)";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                    c = object2;
                    object = b;
                    if (object2 != null) break block5;
                    object2 = "shardPreferences";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    bl3 = false;
                    object2 = null;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
            }
            if ((object2 = object2.getString(string2 = "SUGGESTED_EVENTS_HISTORY", (String)object3)) != null) {
                object3 = object2;
            }
            object3 = lz3_0.D((String)object3);
            object.putAll(object3);
            boolean bl4 = true;
            atomicBoolean.set(bl4);
            return;
        }
        td0.a(this, throwable2);
    }
}


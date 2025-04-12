/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from og1
 */
public final class og1_0 {
    public final CleverTapInstanceConfig a;
    public final kd3_0 b;

    public og1_0(CleverTapInstanceConfig cleverTapInstanceConfig, kd3_0 kd3_02) {
        Intrinsics.checkNotNullParameter(cleverTapInstanceConfig, "config");
        Intrinsics.checkNotNullParameter(kd3_02, "storeRegistry");
        this.a = cleverTapInstanceConfig;
        this.b = kd3_02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(JSONArray object) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                String string2 = "jsonArray";
                try {
                    Intrinsics.checkNotNullParameter(object, string2);
                    string2 = this.b();
                    int n3 = object.length();
                    for (int i3 = 0; i3 < n3; ++i3) {
                        try {
                            JSONObject jSONObject = object.getJSONObject(i3);
                            string2.put((Object)jSONObject);
                            continue;
                        }
                        catch (Exception exception) {
                            Object object2 = this.a;
                            object2 = ((CleverTapInstanceConfig)object2).a;
                            exception.getMessage();
                            com.clevertap.android.sdk.b.d();
                        }
                    }
                    object = this.b;
                    object = ((kd3_0)object).a;
                    if (object == null) break block7;
                    ((rg1_2)object).b((JSONArray)string2);
                    object = Unit.a;
                }
                catch (Throwable throwable2) {}
            }
            return;
            throw throwable2;
        }
    }

    public final JSONArray b() {
        rg1_2 rg1_22 = this.b.a;
        if (rg1_22 == null) {
            rg1_22 = new JSONArray();
            return rg1_22;
        }
        Object object = rg1_22.d;
        String string2 = "null cannot be cast to non-null type org.json.JSONArray";
        if (object != null) {
            Intrinsics.checkNotNull(object, string2);
        } else {
            boolean bl2;
            object = rg1_22.a;
            String string3 = "inApp";
            Object object2 = "";
            if ((object = ((vi_2)object).d(string3, (String)object2)) != null && !(bl2 = kotlin.text.b.k((CharSequence)object))) {
                object2 = rg1_22.b;
                object2.getClass();
                Intrinsics.checkNotNullParameter(object, "cipherText");
                O o3 = ((ae0_1)object2).b;
                object2 = ((ae0_1)object2).c;
                object = o3.Z((String)object, (String)object2);
                string3 = new JSONArray((String)object);
                object = string3;
            } else {
                object = new JSONArray();
            }
            rg1_22.d = object;
            Intrinsics.checkNotNull(object, string2);
        }
        return object;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class Di1 {
    public String a;
    public Di1$b b;
    public JSONArray c;
    public String d;
    public String e;
    public String f;
    public Long g;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a() {
        int n3;
        Di1$b di1$b = this.b;
        if (di1$b == null) {
            n3 = -1;
        } else {
            int[] nArray = Di1$c.$EnumSwitchMapping$0;
            n3 = di1$b.ordinal();
            n3 = nArray[n3];
        }
        Long l2 = this.g;
        boolean bl2 = false;
        int n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            String string2 = this.f;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7 && n3 != (n7 = 4) && n3 != (n7 = 5)) return bl2;
                if (string2 == null) return bl2;
                if (l2 == null) return bl2;
                return true;
            }
            if (string2 == null) return bl2;
            String string3 = this.e;
            if (string3 == null) return bl2;
            if (l2 == null) return bl2;
            return true;
        }
        JSONArray jSONArray = this.c;
        if (jSONArray == null) return bl2;
        if (l2 == null) return bl2;
        return true;
    }

    public final void b() {
        boolean bl2 = this.a();
        if (!bl2) {
            return;
        }
        String string2 = this.a;
        String string3 = this.toString();
        ii1_0.g(string2, string3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        Object object;
        Object object2;
        block16: {
            Long l2;
            String string2;
            Object object3;
            block15: {
                int n3;
                int n4;
                object2 = this.b;
                if (object2 == null) {
                    n4 = -1;
                } else {
                    object3 = Di1$c.$EnumSwitchMapping$0;
                    n3 = object2.ordinal();
                    n4 = object3[n3];
                }
                n3 = 1;
                string2 = "timestamp";
                l2 = this.g;
                object = null;
                if (n4 == n3) break block15;
                n3 = 2;
                if (n4 == n3 || n4 == (n3 = 3) || n4 == (n3 = 4) || n4 == (n3 = 5)) {
                    block14: {
                        object3 = new JSONObject;
                        object3();
                        String string3 = "device_os_version";
                        String string4 = Build.VERSION.RELEASE;
                        object3.put(string3, (Object)string4);
                        string3 = "device_model";
                        string4 = Build.MODEL;
                        object3.put(string3, (Object)string4);
                        string3 = this.d;
                        if (string3 != null) {
                            string4 = "app_version";
                            object3.put(string4, (Object)string3);
                        }
                        if (l2 != null) {
                            object3.put(string2, (Object)l2);
                        }
                        if ((string3 = this.e) != null) {
                            string2 = "reason";
                            object3.put(string2, (Object)string3);
                        }
                        if ((string3 = this.f) != null) {
                            string2 = "callstack";
                            object3.put(string2, (Object)string3);
                        }
                        if (object2 == null) break block14;
                        string3 = "type";
                        object3.put(string3, object2);
                    }
                    object = object3;
                }
                break block16;
            }
            object2 = new JSONObject();
            try {
                object3 = this.c;
                if (object3 != null) {
                    String string5 = "feature_names";
                    object2.put(string5, object3);
                }
                if (l2 != null) {
                    object2.put(string2, l2);
                }
                object = object2;
            }
            catch (JSONException jSONException) {}
        }
        if (object == null) {
            object2 = new JSONObject();
            object2 = object2.toString();
            Intrinsics.checkNotNullExpressionValue(object2, "JSONObject().toString()");
            return object2;
        }
        object2 = object.toString();
        Intrinsics.checkNotNullExpressionValue(object2, "params.toString()");
        return object2;
    }
}


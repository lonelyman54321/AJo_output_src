/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.task.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from AI
 */
public final class ai_0 {
    public final Map a;
    public final Map b;
    public final AtomicBoolean c;
    public final lm0_1 d;
    public final CleverTapInstanceConfig e;
    public final AtomicBoolean f;
    public final tf_0 g;
    public final cA2 h;
    public final Map i;

    public ai_0(CleverTapInstanceConfig cleverTapInstanceConfig, tf_0 tf_02, cA2 cA22, lm0_1 lm0_12) {
        Map map2 = new Map();
        map2 = Collections.synchronizedMap(map2);
        this.a = map2;
        map2 = new Map();
        map2 = Collections.synchronizedMap(map2);
        this.b = map2;
        map2 = new Map(false);
        this.c = map2;
        map2 = new Map(false);
        this.f = map2;
        map2 = new Map();
        this.i = map2 = Collections.synchronizedMap(map2);
        this.e = cleverTapInstanceConfig;
        this.g = tf_02;
        this.h = cA22;
        this.d = lm0_12;
        this.f();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HashMap a(ai_0 object, String object2) {
        boolean bl2;
        Object object3;
        Object object4;
        Object object5 = ((ai_0)object).e;
        CharSequence charSequence = "GetStoredValues reading file success:[ ";
        HashMap<CharSequence, Object> hashMap = new HashMap<CharSequence, Object>();
        try {
            object = ((ai_0)object).d;
            object = ((lm0_1)object).b((String)object2);
            object4 = ((CleverTapInstanceConfig)object5).b();
            object3 = da2_0.a((CleverTapInstanceConfig)object5);
            StringBuilder stringBuilder = new StringBuilder((String)charSequence);
            stringBuilder.append((String)object2);
            object2 = "]--[Content]";
            stringBuilder.append((String)object2);
            stringBuilder.append((String)object);
            object2 = stringBuilder.toString();
            ((b)object4).b((String)object3, (String)object2);
        }
        catch (Exception exception) {
            object2 = ((CleverTapInstanceConfig)object5).b();
            object5 = da2_0.a((CleverTapInstanceConfig)object5);
            String string2 = "GetStoredValues reading file failed: ";
            charSequence = new StringBuilder(string2);
            String string3 = exception.getLocalizedMessage();
            ((StringBuilder)charSequence).append(string3);
            string3 = ((StringBuilder)charSequence).toString();
            ((b)object2).b((String)object5, string3);
            return hashMap;
        }
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        if (bl3) return hashMap;
        try {
            object2 = new JSONObject((String)object);
        }
        catch (Exception exception) {
            object2 = ((CleverTapInstanceConfig)object5).b();
            object5 = da2_0.a((CleverTapInstanceConfig)object5);
            object4 = "GetStoredValues failed due to malformed json: ";
            charSequence = new StringBuilder((String)object4);
            String string4 = exception.getLocalizedMessage();
            ((StringBuilder)charSequence).append(string4);
            string4 = ((StringBuilder)charSequence).toString();
            ((b)object2).b((String)object5, string4);
            return hashMap;
        }
        object = object2.keys();
        while (bl2 = object.hasNext()) {
            charSequence = (String)object.next();
            boolean bl4 = TextUtils.isEmpty((CharSequence)charSequence);
            if (bl4) continue;
            try {
                object4 = object2.get((String)charSequence);
            }
            catch (Exception exception) {
                object3 = ((CleverTapInstanceConfig)object5).b();
                String string5 = da2_0.a((CleverTapInstanceConfig)object5);
                String string6 = "GetStoredValues for key ";
                String string7 = " while parsing json: ";
                charSequence = Gn.a(string6, (String)charSequence, string7);
                object4 = exception.getLocalizedMessage();
                ((StringBuilder)charSequence).append((String)object4);
                charSequence = ((StringBuilder)charSequence).toString();
                ((b)object3).b(string5, (String)charSequence);
                continue;
            }
            boolean bl5 = TextUtils.isEmpty((CharSequence)(object4 = String.valueOf(object4)));
            if (bl5) continue;
            hashMap.put(charSequence, object4);
        }
        return hashMap;
    }

    public final void b() {
        Object object = this.h.b;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return;
        }
        object = jh_1.a(this.e).a();
        Object object2 = new AI$c(this);
        ((a)object).b((e92)object2);
        object2 = new AI$b(this);
        ((a)object).c("activateProductConfigs", (Callable)object2);
    }

    public final HashMap c(JSONObject jSONObject) {
        int n3;
        Object object = this.e;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Object object2 = "kv";
        try {
            jSONObject = jSONObject.getJSONArray((String)object2);
        }
        catch (JSONException jSONException) {
            object2 = ((CleverTapInstanceConfig)object).b();
            object = da2_0.a((CleverTapInstanceConfig)object);
            StringBuilder stringBuilder = new StringBuilder("ConvertServerJsonToMap failed - ");
            String string2 = jSONException.getLocalizedMessage();
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            ((b)object2).b((String)object, string2);
            return hashMap;
        }
        if (jSONObject != null && (n3 = jSONObject.length()) > 0) {
            int n4;
            object2 = null;
            for (n3 = 0; n3 < (n4 = jSONObject.length()); ++n3) {
                Object object3 = jSONObject.get(n3);
                object3 = (JSONObject)object3;
                if (object3 == null) continue;
                Object object4 = "n";
                object4 = object3.getString((String)object4);
                String string3 = "v";
                object3 = object3.getString(string3);
                boolean bl2 = TextUtils.isEmpty((CharSequence)object4);
                if (bl2) continue;
                try {
                    hashMap.put(object4, object3);
                    continue;
                }
                catch (Exception exception) {
                    object4 = ((CleverTapInstanceConfig)object).b();
                    string3 = da2_0.a((CleverTapInstanceConfig)object);
                    String string4 = "ConvertServerJsonToMap failed: ";
                    StringBuilder stringBuilder = new StringBuilder(string4);
                    object3 = exception.getLocalizedMessage();
                    stringBuilder.append((String)object3);
                    object3 = stringBuilder.toString();
                    ((b)object4).b(string3, (String)object3);
                }
            }
        }
        return hashMap;
    }

    public final String d() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.e();
        stringBuilder.append(string2);
        stringBuilder.append("/activated.json");
        return stringBuilder.toString();
    }

    public final String e() {
        StringBuilder stringBuilder = new StringBuilder("Product_Config_");
        String string2 = this.e.a;
        stringBuilder.append(string2);
        stringBuilder.append("_");
        string2 = this.h.b;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void f() {
        Object object = this.h.b;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return;
        }
        object = jh_1.a(this.e).a();
        Object object2 = new AI$e(this);
        ((a)object).b((e92)object2);
        object2 = new AI$d(this);
        ((a)object).c("ProductConfig#initAsync", (Callable)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(JSONObject object) {
        Object object2 = "ParseFetchedResponse failed: ";
        Object object3 = "Product Config: Fetched response:";
        synchronized (this) {
            Throwable throwable22;
            block6: {
                int n3;
                try {
                    Object object5 = this.c((JSONObject)object);
                    Object object4 = this.i;
                    object4.clear();
                    object4 = this.i;
                    object4.putAll(object5);
                    object5 = this.e;
                    object5 = ((CleverTapInstanceConfig)object5).b();
                    object4 = this.e;
                    object4 = da2_0.a((CleverTapInstanceConfig)object4);
                    StringBuilder stringBuilder = new StringBuilder((String)object3);
                    stringBuilder.append(object);
                    object3 = stringBuilder.toString();
                    ((b)object5).b((String)object4, (String)object3);
                    object3 = "ts";
                    try {
                        object = object.get((String)object3);
                        object = (Integer)object;
                    }
                    catch (Exception exception) {
                        object3 = this.e;
                        object3 = ((CleverTapInstanceConfig)object3).b();
                        object5 = this.e;
                        object5 = da2_0.a((CleverTapInstanceConfig)object5);
                        object4 = new StringBuilder((String)object2);
                        object = exception.getLocalizedMessage();
                        ((StringBuilder)object4).append((String)object);
                        object = ((StringBuilder)object4).toString();
                        ((b)object3).b((String)object5, (String)object);
                        return;
                    }
                    if (object == null) return;
                    object2 = this.h;
                    n3 = (Integer)object;
                }
                catch (Throwable throwable22) {}
                long l2 = n3;
                long l3 = 1000L;
                l2 *= l3;
                ((cA2)object2).h(l2);
                break block6;
                return;
            }
            throw throwable22;
        }
    }

    public final void h(AI$f aI$f) {
        if (aI$f != null) {
            int[] nArray = AI$a.a;
            int n3 = aI$f.ordinal();
            n3 = nArray[n3];
            int n4 = 1;
            tf_0 tf_02 = this.g;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 == n4) {
                        tf_02.getClass();
                    }
                } else {
                    tf_02.getClass();
                }
            } else {
                tf_02.getClass();
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void i(JSONObject var1_1) {
        var2_2 = this.h;
        var2_2.getClass();
        var3_3 = var1_1.keys();
        while ((var4_4 = var3_3.hasNext()) != 0) {
            block13: {
                block12: {
                    var5_5 = (String)var3_3.next();
                    try {}
lbl8:
                    // 4 sources

                    catch (Exception var5_6) {}
                    var6_8 = TextUtils.isEmpty((CharSequence)var5_5);
                    if (var6_8 != 0 || !(var8_10 = (var7_9 = var1_1.get((String)var5_5)) instanceof Number)) continue;
                    var7_9 = (Number)var7_9;
                    var9_11 = var7_9.doubleValue();
                    var6_8 = (int)var9_11;
                    var11_12 = "rc_n";
                    var8_10 = var11_12.equalsIgnoreCase((String)var5_5);
                    if (!var8_10 && !(var8_10 = (var11_12 = "rc_w").equalsIgnoreCase((String)var5_5))) continue;
                    var5_5.getClass();
                    var11_12 = "rc_n";
                    var8_10 = var5_5.equals(var11_12);
                    if (var8_10) break block12;
                    var11_12 = "rc_w";
                    var4_4 = var5_5.equals(var11_12);
                    if (var4_4 == 0) continue;
                    var4_4 = var2_2.d();
                    if (var6_8 > 0 && var4_4 != var6_8) {
                        var5_5 = var2_2.d;
                        var11_12 = "rc_w";
                        var7_9 = String.valueOf(var6_8);
                        var5_5.put(var11_12, var7_9);
                        var2_2.j();
                    }
                    {
                        catch (Throwable var5_7) {
                            throw var5_7;
                        }
                        ** try [egrp 5[TRYBLOCK] [13 : 245->264)] { 
lbl40:
                        // 1 sources

                        // MONITOREXIT : var2_2
                        continue;
                    }
                    break block13;
                }
                var2_2.i(var6_8);
                continue;
            }
            var7_9 = var2_2.a.b();
            var11_12 = da2_0.a(var2_2.a);
            var13_14 = "Product Config setARPValue failed ";
            var12_13 = new StringBuilder(var13_14);
            var5_5 = var5_6.getLocalizedMessage();
            var12_13.append((String)var5_5);
            var5_5 = var12_13.toString();
            var7_9.b(var11_12, (String)var5_5);
        }
    }
}


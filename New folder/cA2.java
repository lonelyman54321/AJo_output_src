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
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class cA2 {
    public final CleverTapInstanceConfig a;
    public String b;
    public final lm0_1 c;
    public final Map d;

    public cA2(String string2, CleverTapInstanceConfig cleverTapInstanceConfig, lm0_1 lm0_12) {
        Map map2 = new Map();
        this.d = map2 = Collections.synchronizedMap(map2);
        this.b = string2;
        this.a = cleverTapInstanceConfig;
        this.c = lm0_12;
        this.e();
    }

    public final JSONObject a(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            Object object;
            try {
                object = new JSONObject(string2);
                return object;
            }
            catch (JSONException jSONException) {
                object = this.a;
                b b2 = ((CleverTapInstanceConfig)object).b();
                object = da2_0.a((CleverTapInstanceConfig)object);
                String string3 = "LoadSettings failed: ";
                StringBuilder stringBuilder = new StringBuilder(string3);
                String string4 = jSONException.getLocalizedMessage();
                stringBuilder.append(string4);
                string4 = stringBuilder.toString();
                b2.b((String)object, string4);
            }
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long b() {
        String string2 = "GetLastFetchTimeStampInMillis failed: ";
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object = this.d;
                String string3 = "ts";
                object = object.get(string3);
                object = (String)object;
                long l2 = 0L;
                boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                if (bl2) return l2;
                double d2 = Double.parseDouble((String)object);
                return (long)d2;
                {
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    catch (Exception exception) {}
                    {
                        Object object2 = this.a;
                        object2 = ((CleverTapInstanceConfig)object2).b();
                        Object object3 = this.a;
                        object3 = da2_0.a((CleverTapInstanceConfig)object3);
                        StringBuilder stringBuilder = new StringBuilder(string2);
                        string2 = exception.getLocalizedMessage();
                        stringBuilder.append(string2);
                        string2 = stringBuilder.toString();
                        ((b)object2).b((String)object3, string2);
                        return l2;
                    }
                }
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int c() {
        String string2 = "GetNoOfCallsInAllowedWindow failed: ";
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object = this.d;
                String string3 = "rc_n";
                object = object.get(string3);
                object = (String)object;
                int n3 = 5;
                boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                if (bl2) return n3;
                double d2 = Double.parseDouble((String)object);
                return (int)d2;
                {
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    catch (Exception exception) {}
                    {
                        Object object2 = this.a;
                        object2 = ((CleverTapInstanceConfig)object2).b();
                        Object object3 = this.a;
                        object3 = da2_0.a((CleverTapInstanceConfig)object3);
                        StringBuilder stringBuilder = new StringBuilder(string2);
                        string2 = exception.getLocalizedMessage();
                        stringBuilder.append(string2);
                        string2 = stringBuilder.toString();
                        ((b)object2).b((String)object3, string2);
                        return n3;
                    }
                }
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int d() {
        String string2 = "GetWindowIntervalInMinutes failed: ";
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object = this.d;
                String string3 = "rc_w";
                object = object.get(string3);
                object = (String)object;
                int n3 = 60;
                boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                if (bl2) return n3;
                double d2 = Double.parseDouble((String)object);
                return (int)d2;
                {
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    catch (Exception exception) {}
                    {
                        Object object2 = this.a;
                        object2 = ((CleverTapInstanceConfig)object2).b();
                        Object object3 = this.a;
                        object3 = da2_0.a((CleverTapInstanceConfig)object3);
                        StringBuilder stringBuilder = new StringBuilder(string2);
                        string2 = exception.getLocalizedMessage();
                        stringBuilder.append(string2);
                        string2 = stringBuilder.toString();
                        ((b)object2).b((String)object3, string2);
                        return n3;
                    }
                }
            }
            throw throwable2;
        }
    }

    public final void e() {
        Object object = String.valueOf(5);
        Object object2 = this.d;
        object2.put("rc_n", object);
        object = String.valueOf(60);
        object2.put("rc_w", object);
        object = String.valueOf(0);
        object2.put("ts", object);
        object = String.valueOf(zi_2.a);
        object2.put("fetch_min_interval_seconds", object);
        object = this.a;
        b b2 = ((CleverTapInstanceConfig)object).b();
        object = da2_0.a((CleverTapInstanceConfig)object);
        StringBuilder stringBuilder = new StringBuilder("Settings loaded with default values: ");
        stringBuilder.append(object2);
        object2 = stringBuilder.toString();
        b2.b((String)object, (String)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(lm0_1 object) {
        String string2 = "LoadSettings failed while reading file: ";
        synchronized (this) {
            Throwable throwable2;
            block6: {
                if (object != null) {
                    try {
                        try {
                            CharSequence charSequence = new StringBuilder();
                            Object object2 = "Product_Config_";
                            CharSequence charSequence2 = new StringBuilder((String)object2);
                            object2 = this.a;
                            object2 = ((CleverTapInstanceConfig)object2).a;
                            charSequence2.append((String)object2);
                            object2 = "_";
                            charSequence2.append((String)object2);
                            object2 = this.b;
                            charSequence2.append((String)object2);
                            charSequence2 = charSequence2.toString();
                            charSequence.append((String)charSequence2);
                            charSequence2 = "/config_settings.json";
                            charSequence.append((String)charSequence2);
                            charSequence = charSequence.toString();
                            object = ((lm0_1)object).b((String)charSequence);
                            object = this.a((String)object);
                            this.g((JSONObject)object);
                        }
                        catch (Exception exception) {
                            Object object3 = this.a;
                            object3 = ((CleverTapInstanceConfig)object3).b();
                            Object object4 = this.a;
                            object4 = da2_0.a((CleverTapInstanceConfig)object4);
                            StringBuilder stringBuilder = new StringBuilder(string2);
                            String string3 = exception.getLocalizedMessage();
                            stringBuilder.append(string3);
                            string3 = stringBuilder.toString();
                            ((b)object3).b((String)object4, string3);
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                string2 = "fileutils can't be null";
                object = new IllegalArgumentException(string2);
                throw object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(JSONObject object) {
        synchronized (this) {
            Object object2;
            if (object == null) {
                return;
            }
            try {
                object2 = object.keys();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (true) {
                Object object3;
                Object object4;
                Object object5;
                boolean bl2;
                if (!(bl2 = object2.hasNext())) {
                    object = this.a;
                    object = ((CleverTapInstanceConfig)object).b();
                    object2 = this.a;
                    object2 = da2_0.a((CleverTapInstanceConfig)object2);
                    object5 = new StringBuilder();
                    object4 = "LoadSettings completed with settings: ";
                    ((StringBuilder)object5).append((String)object4);
                    object4 = this.d;
                    ((StringBuilder)object5).append(object4);
                    object5 = ((StringBuilder)object5).toString();
                    ((b)object).b((String)object2, (String)object5);
                    return;
                }
                object5 = object2.next();
                boolean bl3 = TextUtils.isEmpty(object5 = (String)object5);
                if (bl3) continue;
                try {
                    object4 = object.get(object5);
                }
                catch (Exception exception) {
                    object3 = this.a;
                    object3 = ((CleverTapInstanceConfig)object3).b();
                    Object object6 = this.a;
                    object6 = da2_0.a((CleverTapInstanceConfig)object6);
                    StringBuilder stringBuilder = new StringBuilder();
                    String string2 = "Failed loading setting for key ";
                    stringBuilder.append(string2);
                    stringBuilder.append((String)object5);
                    object5 = " Error: ";
                    stringBuilder.append((String)object5);
                    object5 = exception.getLocalizedMessage();
                    stringBuilder.append((String)object5);
                    object5 = stringBuilder.toString();
                    ((b)object3).b((String)object6, (String)object5);
                    continue;
                }
                boolean bl4 = TextUtils.isEmpty((CharSequence)(object4 = String.valueOf(object4)));
                if (bl4) continue;
                object3 = this.d;
                object3.put(object5, object4);
                continue;
                break;
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(long l2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        long l3;
                        long l4 = this.b();
                        long l7 = 0L;
                        long l8 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
                        if (l8 < 0 || (l3 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1)) == false) break block4;
                        Map map2 = this.d;
                        String string2 = "ts";
                        String string3 = String.valueOf(l2);
                        map2.put(string2, string3);
                        this.j();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        long l2;
                        long l3;
                        long l4;
                        int n4 = this.c();
                        long l7 = n4;
                        if (n3 <= 0 || (l4 = (l3 = l7 - (l2 = (long)n3)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) break block4;
                        Map map2 = this.d;
                        String string2 = "rc_n";
                        String string3 = String.valueOf(n3);
                        map2.put(string2, string3);
                        this.j();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j() {
        synchronized (this) {
            Object object = this.a;
            object = jh_1.a((CleverTapInstanceConfig)object);
            object = ((kh_1)object).a();
            Object object2 = new cA2$b(this);
            ((a)object).b((e92)object2);
            object2 = "ProductConfigSettings#updateConfigToFile";
            cA2$a cA2$a = new cA2$a(this);
            ((a)object).c((String)object2, cA2$a);
            return;
        }
    }
}


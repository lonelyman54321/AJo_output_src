/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.a$a;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.events.EventQueueManager;
import com.clevertap.android.sdk.task.a;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from TU1
 */
public final class tu1_1 {
    public final tf_0 a;
    public final ArrayList b;
    public final CleverTapInstanceConfig c;
    public final Context d;
    public final l80_0 e;
    public final E80 f;
    public final He0 g;
    public final Nh0 h;
    public final mp0_0 i;
    public final b j;
    public int k;
    public int l;
    public final ea3_1 m;
    public final ha3_1 n;
    public int o;
    public final ArrayList p;

    public tu1_1(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, mp0_0 mp0_02, E80 e80, ea3_1 ea3_12, l80_0 l80_02, Nh0 nh0, ck_1 ck_12, ti_0 ti_02, ha3_1 ha3_12, qg1_1 qg1_12, He0 he0) {
        wb2_0 wb2_02;
        Object object;
        ArrayList<Object> arrayList;
        Object object2 = mp0_02;
        this.b = arrayList = new ArrayList<Object>();
        this.k = 0;
        this.l = 0;
        this.o = 0;
        this.p = object = new ArrayList();
        object = context;
        this.d = context;
        this.c = cleverTapInstanceConfig;
        this.i = mp0_02;
        this.a = ck_12;
        this.n = ha3_12;
        Object object3 = cleverTapInstanceConfig.b();
        this.j = object3;
        this.f = e80;
        object3 = ea3_12;
        this.m = ea3_12;
        this.e = l80_02;
        object3 = nh0;
        this.h = nh0;
        Object object4 = he0;
        this.g = he0;
        object4 = qg1_12;
        arrayList.add(qg1_12);
        object4 = new jo1_1(cleverTapInstanceConfig, mp0_02, this);
        arrayList.add(object4);
        object2 = new x0(cleverTapInstanceConfig, this, ha3_12, l80_02);
        arrayList.add(object2);
        object2 = new m50_0(cleverTapInstanceConfig);
        arrayList.add(object2);
        object2 = new xg1_1(cleverTapInstanceConfig, ti_02, ck_12, l80_02);
        arrayList.add(object2);
        object2 = wb2_02;
        object = cleverTapInstanceConfig;
        object4 = ck_12;
        wb2_02 = new wb2_0(context, cleverTapInstanceConfig, nh0, ck_12, l80_02);
        arrayList.add(wb2_02);
        object2 = new wk0_1(ck_12, l80_02, cleverTapInstanceConfig);
        arrayList.add(object2);
        object2 = new xr0_1(ck_12, l80_02, cleverTapInstanceConfig);
        arrayList.add(object2);
        object2 = new jj0_1(cleverTapInstanceConfig, l80_02);
        arrayList.add(object2);
        object2 = new aA2(cleverTapInstanceConfig, e80, l80_02);
        arrayList.add(object2);
        object2 = new iz0_1(cleverTapInstanceConfig, ck_12);
        arrayList.add(object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean h(Context object) {
        ConnectivityManager connectivityManager;
        boolean bl2;
        block6: {
            Object object2;
            bl2 = true;
            String string2 = "connectivity";
            try {
                object2 = object.getSystemService(string2);
            }
            catch (Exception exception) {
                return bl2;
            }
            connectivityManager = (ConnectivityManager)object2;
            if (connectivityManager != null) break block6;
            return bl2;
        }
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo == null) return false;
        boolean bl3 = networkInfo.isConnected();
        if (!bl3) return false;
        return bl2;
    }

    public final el2_1 a(FB0 object, lz2_0 object2) {
        Object object3 = FB0.VARIABLES;
        boolean bl2 = false;
        String string2 = "body";
        Object object4 = this.g;
        if (object == object3) {
            object = ((He0)object4).a();
            object.getClass();
            Intrinsics.checkNotNullParameter(object2, string2);
            object3 = ((ge0_0)object).b(false);
            if (object3 == null) {
                object3 = ((ge0_0)object).b;
            }
            Object object5 = object3;
            String string3 = ((lz2_0)object2).toString();
            Map map2 = ((ge0_0)object).k;
            object2 = ((ge0_0)object).a((String)object3, "defineVars", string3, true, map2);
            return ((ge0_0)object).a.a((jj2_0)object2);
        }
        ge0_0 ge0_02 = ((He0)object4).a();
        object3 = FB0.PUSH_NOTIFICATION_VIEWED;
        if (object == object3) {
            bl2 = true;
        }
        ge0_02.getClass();
        Intrinsics.checkNotNullParameter(object2, string2);
        object = ge0_02.b(bl2);
        if (object == null) {
            object = ge0_02.b;
        }
        object4 = ((lz2_0)object2).toString();
        Map map3 = ge0_02.k;
        object3 = ge0_02;
        object = ge0_02.a((String)object, "a1", (String)object4, true, map3);
        return ge0_02.a.a((jj2_0)object);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Context object, FB0 object2, String string2) {
        String string3;
        block17: {
            Object object3 = this.c.b();
            String string4 = this.c.a;
            Object object4 = "Somebody has invoked me to send the queue to CleverTap servers";
            ((b)object3).b(string4, (String)object4);
            boolean bl2 = true;
            string4 = null;
            Object var8_11 = null;
            int n3 = 1;
            while (n3 != 0) {
                int n4;
                void var8_12;
                Object object5;
                Object object6;
                Object object7;
                object4 = this.h;
                object4.getClass();
                Intrinsics.checkNotNullParameter(object, "context");
                Intrinsics.checkNotNullParameter(object2, "eventGroup");
                FB0 fB0 = FB0.PUSH_NOTIFICATION_VIEWED;
                if (object2 == fB0) {
                    object7 = ((Nh0)object4).a.b();
                    object6 = ((Nh0)object4).a.a;
                    object5 = "Returning Queued Notification Viewed events";
                    ((b)object7).b((String)object6, (String)object5);
                    Intrinsics.checkNotNullParameter(object, "context");
                    object7 = ci3_1.PUSH_NOTIFICATION_VIEWED;
                    object4 = ((Nh0)object4).b((Context)object, (ci3_1)((Object)object7), (tC2)var8_12);
                } else {
                    object7 = ((Nh0)object4).a.b();
                    object6 = ((Nh0)object4).a.a;
                    object5 = "Returning Queued events";
                    ((b)object7).b((String)object6, (String)object5);
                    Intrinsics.checkNotNullParameter(object, "context");
                    object7 = ((Nh0)object4).b.a;
                    object6 = "ctLockManager.eventLock";
                    Intrinsics.checkNotNullExpressionValue(object7, (String)object6);
                    synchronized (object7) {
                        try {
                            ci3_1 ci3_12;
                            object6 = ci3_1.EVENTS;
                            object5 = ((Nh0)object4).b((Context)object, (ci3_1)((Object)object6), (tC2)var8_12);
                            boolean bl3 = ((tC2)object5).a();
                            if (bl3 && (ci3_12 = ((tC2)object5).a) == object6) {
                                object6 = ci3_1.PROFILE_EVENTS;
                                object4 = ((Nh0)object4).b((Context)object, (ci3_1)((Object)object6), null);
                            }
                        }
                        catch (Throwable throwable) {}
                        object4 = object5;
                    }
                }
                boolean bl4 = ((tC2)object4).a();
                if (bl4) {
                    object = this.c.b();
                    string3 = this.c.a;
                    object3 = "No events in the queue, failing";
                    ((b)object).b(string3, (String)object3);
                    if (object2 != fB0) return;
                    if (var8_12 == null) return;
                    object = var8_12.b;
                    if (object == null) return;
                    try {
                        this.l((JSONArray)object);
                        return;
                    }
                    catch (Exception exception) {
                        object = this.c.b();
                        String string5 = this.c.a;
                        string3 = "met with exception while notifying listeners for PushImpressionSentToServer event";
                        ((b)object).b(string5, string3);
                        return;
                    }
                }
                JSONArray jSONArray = ((tC2)object4).b;
                if (jSONArray == null || (n4 = jSONArray.length()) <= 0) break block17;
                n4 = (int)(this.n((Context)object, (FB0)((Object)object2), jSONArray, string3) ? 1 : 0);
                if (n4 == 0) {
                    object7 = this.e;
                    object6 = ((l80_0)object7).n;
                    if (object6 != null) {
                        object6 = ((l80_0)object7).h;
                        object6.getClass();
                        object7 = ((l80_0)object7).n;
                        ((ki_1)object7).b();
                    }
                    if ((object7 = ((ck_1)this.e.h).h) != null) {
                        object6 = null;
                        object7.a(jSONArray, false);
                    }
                } else {
                    object7 = ((ck_1)this.e.h).h;
                    if (object7 != null) {
                        object7.a(jSONArray, bl2);
                    }
                }
                Object object8 = object4;
                n3 = n4;
            }
            return;
        }
        object = this.c.b();
        String string6 = this.c.a;
        string3 = "No events in the queue, failing";
        ((b)object).b(string6, string3);
    }

    /*
     * Unable to fully structure code
     */
    public final JSONObject c() {
        block33: {
            block34: {
                block32: {
                    block31: {
                        var1_1 = this.d;
                        var2_2 = this.j;
                        var3_3 = this.c;
                        var4_4 = this.d();
                        if (var4_4 != null) break block31;
                        return null;
                    }
                    var5_5 = gc3_0.f((Context)var1_1, var4_4);
                    var5_5 = var5_5.getAll();
                    var6_6 = var5_5.isEmpty();
                    if (var6_6) break block32;
                    var1_1 = gc3_0.f((Context)var1_1, var4_4);
                    break block33;
                }
                var1_1 = var3_3.a;
                if (var1_1 == null) {
                    var1_1 = null;
                    break block34;
                }
                var5_5 = "Old ARP Key = ARP:";
                var5_5 = var5_5.concat((String)var1_1);
                var2_2.b((String)var1_1, (String)var5_5);
                var5_5 = "ARP:";
                var1_1 = var5_5.concat((String)var1_1);
            }
            var1_1 = this.i(var4_4, (String)var1_1);
        }
        var1_1 = var1_1.getAll();
        var5_5 = var1_1.entrySet();
        var5_5 = var5_5.iterator();
        while (true) {
            var7_7 = var5_5.hasNext();
            if (var7_7 == 0) break;
            var8_8 = var5_5.next();
            var8_8 = (Map.Entry)var8_8;
            ** try [egrp 16[TRYBLOCK] [16 : 177->184)] { 
lbl52:
            // 1 sources

            var9_9 = (var8_8 = var8_8.getValue()) instanceof Number;
            if (var9_9 == 0) continue;
            var8_8 = (Number)var8_8;
            var7_7 = var8_8.intValue();
            if (var7_7 != (var9_9 = -1)) continue;
            var5_5.remove();
            continue;
            break;
        }
        try {
            var5_5 = new JSONObject((Map)var1_1);
            var8_8 = var3_3.a;
        }
lbl65:
        // 27 sources

        catch (Exception v0) {
            var1_1 = var3_3.a;
            var2_2.getClass();
            com.clevertap.android.sdk.b.m();
            return null;
        }
        var10_10 = new StringBuilder();
        var11_11 = "Fetched ARP for namespace key: ";
        var10_10.append(var11_11);
        var10_10.append(var4_4);
        var4_4 = " values: ";
        var10_10.append(var4_4);
        var10_10.append(var1_1);
        var1_1 = var10_10.toString();
        var2_2.b((String)var8_8, (String)var1_1);
        return var5_5;
    }

    public final String d() {
        String string2 = this.c.a;
        if (string2 == null) {
            return null;
        }
        String string3 = ":";
        CharSequence charSequence = Gn.a("New ARP Key = ARP:", string2, string3);
        mp0_0 mp0_02 = this.i;
        String string4 = mp0_02.f();
        ((StringBuilder)charSequence).append(string4);
        charSequence = ((StringBuilder)charSequence).toString();
        this.j.b(string2, (String)charSequence);
        charSequence = new StringBuilder("ARP:");
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(string3);
        string2 = mp0_02.f();
        ((StringBuilder)charSequence).append(string2);
        return ((StringBuilder)charSequence).toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean e(el2_1 object, lz2_0 object2, jz0_1 object3) {
        int n3;
        Object object4;
        int n4;
        CharSequence charSequence;
        int n7 = ((el2_1)object).a;
        int n8 = 200;
        boolean bl2 = false;
        int n10 = 1;
        if (n7 == n8) {
            n7 = 1;
        } else {
            n7 = 0;
            charSequence = null;
        }
        Object object5 = this.j;
        if (n7 == 0) {
            object5.getClass();
            a$a.INFO.intValue();
            return false;
        }
        charSequence = ((el2_1)object).a("X-WZRK-RD");
        Context context = this.d;
        Object object6 = this.c;
        Object object7 = null;
        if (charSequence != null && (n4 = ((String)(object4 = ((String)charSequence).trim())).isEmpty()) == 0 && (n4 = ((String)charSequence).equals(object4 = gc3_0.h(context, (CleverTapInstanceConfig)object6, "comms_dmn", null)) ^ n10) != 0) {
            this.o(context, (String)charSequence);
            object = new StringBuilder("The domain has changed to ");
            ((StringBuilder)object).append((String)charSequence);
            ((StringBuilder)object).append(". The request will be retried shortly.");
            object = ((StringBuilder)object).toString();
            object5.getClass();
            com.clevertap.android.sdk.b.f((String)object);
            return false;
        }
        charSequence = ((lz2_0)object2).a;
        object2 = ((lz2_0)object2).b;
        if (charSequence != null) {
            boolean bl3;
            object4 = this.p.iterator();
            while (bl3 = object4.hasNext()) {
                void var17_17;
                ru1_1 ru1_12 = (ru1_1)object4.next();
                JSONObject jSONObject = object2.optJSONObject(0);
                boolean bl4 = jSONObject.has("profile");
                QB0$a qB0$a = QB0.Companion;
                qB0$a.getClass();
                if (bl4) {
                    QB0 qB0 = QB0.PROFILE;
                } else {
                    QB0 qB0 = QB0.RAISED;
                }
                ru1_12.b((JSONObject)charSequence, (jz0_1)((Object)object3), (QB0)var17_17);
            }
        }
        if ((n3 = this.m(context, (el2_1)object)) == 0) {
            return false;
        }
        object3 = ((CleverTapInstanceConfig)object6).a;
        object5.getClass();
        com.clevertap.android.sdk.b.f("Queue sent successfully");
        object3 = this.g;
        n7 = ((He0)object3).a().n;
        object4 = gc3_0.l((CleverTapInstanceConfig)object6, "comms_last_ts");
        gc3_0.j(context, n7, (String)object4);
        object3 = ((He0)object3).a();
        n3 = ((ge0_0)object3).n;
        charSequence = "comms_first_ts";
        n4 = gc3_0.c(context, (CleverTapInstanceConfig)object6, (String)charSequence);
        if (n4 <= 0) {
            charSequence = gc3_0.l((CleverTapInstanceConfig)object6, (String)charSequence);
            gc3_0.j(context, n3, (String)charSequence);
        }
        object = ((el2_1)object).d;
        object = object != null ? vm3_0.b((Reader)object) : null;
        if (object != null) {
            try {
                object7 = object3 = new JSONObject((String)object);
            }
            catch (JSONException jSONException) {}
        }
        object3 = ((CleverTapInstanceConfig)object6).a;
        object6 = "Processing response : ";
        charSequence = new StringBuilder((String)object6);
        ((StringBuilder)charSequence).append(object7);
        charSequence = ((StringBuilder)charSequence).toString();
        ((b)object5).b((String)object3, (String)charSequence);
        object3 = null;
        for (n3 = 0; n3 < (n7 = object2.length()); ++n3) {
            try {
                charSequence = object2.getJSONObject(n3);
                object5 = "type";
                object5 = charSequence.getString((String)object5);
                object6 = "event";
                n8 = (int)(((String)object6).equals(object5) ? 1 : 0);
                if (n8 == 0) continue;
                object5 = "evtName";
                object5 = "App Launched";
                n8 = (int)(((String)object5).equals(charSequence = charSequence.getString((String)object5)) ? 1 : 0);
                if (n8 == 0 && (n7 = (int)(((String)(object5 = "wzrk_fetch")).equals(charSequence) ? 1 : 0)) == 0) continue;
                bl2 = true;
                break;
            }
            catch (JSONException jSONException) {}
        }
        object2 = this.b.iterator();
        while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object3 = (yv_0)object2.next();
            ((yv_0)object3).a = bl2;
            ((yv_0)object3).a(context, (JSONObject)object7, (String)object);
        }
        return n10 != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean f(el2_1 object) {
        void var7_9;
        Object object2;
        Object object3;
        boolean bl2;
        Object object4;
        block14: {
            String string2;
            void var7_11;
            int n3;
            int n4;
            block15: {
                n4 = ((el2_1)object).a;
                n3 = 200;
                object4 = null;
                bl2 = true;
                if (n4 == n3) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    object3 = null;
                }
                Object var7_7 = null;
                object = ((el2_1)object).d;
                object2 = this.j;
                if (n3 == 0) break block15;
                if (object != null) {
                    object = vm3_0.b((Reader)object);
                } else {
                    boolean bl3 = false;
                    object = null;
                }
                if (object == null) break block14;
                try {
                    JSONObject jSONObject;
                    JSONObject jSONObject2 = jSONObject = new JSONObject((String)object);
                    break block14;
                }
                catch (JSONException jSONException) {}
            }
            n3 = 400;
            if (n4 != n3) {
                int n7 = 401;
                if (n4 != n7) {
                    object2.getClass();
                    com.clevertap.android.sdk.b.i();
                    return false;
                }
                object2.getClass();
                com.clevertap.android.sdk.b.i();
                return false;
            }
            if (object != null) {
                object = vm3_0.b((Reader)object);
            } else {
                boolean bl4 = false;
                object = null;
            }
            if (object != null) {
                try {
                    JSONObject jSONObject;
                    JSONObject jSONObject3 = jSONObject = new JSONObject((String)object);
                }
                catch (JSONException jSONException) {}
            }
            if (var7_11 != null && (n4 = (int)(TextUtils.isEmpty((CharSequence)(string2 = var7_11.optString((String)(object = "error")))) ? 1 : 0)) == 0) {
                var7_11.optString((String)object);
                object2.getClass();
                com.clevertap.android.sdk.b.i();
                return false;
            }
            object2.getClass();
            com.clevertap.android.sdk.b.i();
            return false;
        }
        CleverTapInstanceConfig cleverTapInstanceConfig = this.c;
        object3 = cleverTapInstanceConfig.a;
        object4 = new StringBuilder("Processing variables response : ");
        ((StringBuilder)object4).append(var7_9);
        object4 = ((StringBuilder)object4).toString();
        ((b)object2).b((String)object3, (String)object4);
        object4 = this.n;
        object2 = this.e;
        object3 = new x0(cleverTapInstanceConfig, this, (ha3_1)object4, (l80_0)object2);
        Context context = this.d;
        ((x0)object3).a(context, (JSONObject)var7_9, (String)object);
        return bl2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(FB0 object, Runnable object2) {
        Throwable throwable222;
        b b2;
        CleverTapInstanceConfig cleverTapInstanceConfig;
        block15: {
            block14: {
                int n3;
                String string2;
                CharSequence charSequence;
                block13: {
                    boolean bl2;
                    boolean bl3 = false;
                    charSequence = null;
                    this.k = 0;
                    Object object3 = this.d;
                    cleverTapInstanceConfig = this.c;
                    b2 = this.j;
                    string2 = "Invalid HTTP status code received for handshake - ";
                    Object object4 = this.g;
                    object4 = ((He0)object4).a();
                    FB0 fB0 = FB0.PUSH_NOTIFICATION_VIEWED;
                    if (object == fB0) {
                        bl2 = true;
                    } else {
                        bl2 = false;
                        object = null;
                    }
                    object = ((ge0_0)object4).c(bl2);
                    int n4 = 200;
                    n3 = ((el2_1)object).a;
                    if (n3 == n4) {
                        bl3 = true;
                    }
                    if (!bl3) break block13;
                    {
                        catch (Exception exception) {}
                    }
                    try {
                        charSequence = cleverTapInstanceConfig.a;
                        string2 = "Received success from handshake :)";
                        b2.b((String)charSequence, string2);
                        bl3 = this.m((Context)object3, (el2_1)object);
                        if (bl3) {
                            charSequence = cleverTapInstanceConfig.a;
                            object3 = "We are not muted";
                            b2.b((String)charSequence, (String)object3);
                            object2.run();
                        }
                        break block14;
                    }
                    catch (Throwable throwable222) {
                        break block15;
                    }
                }
                object2 = cleverTapInstanceConfig.a;
                charSequence = new StringBuilder(string2);
                ((StringBuilder)charSequence).append(n3);
                charSequence = ((StringBuilder)charSequence).toString();
                b2.b((String)object2, (String)charSequence);
            }
            ((el2_1)object).close();
            return;
        }
        try {
            ((el2_1)object).close();
            throw throwable222;
        }
        catch (Throwable throwable3) {
            throwable222.addSuppressed(throwable3);
            throw throwable222;
        }
        object = cleverTapInstanceConfig.a;
        b2.getClass();
        com.clevertap.android.sdk.b.m();
    }

    public final SharedPreferences i(String string2, String string3) {
        b b2;
        Object object;
        Context context = this.d;
        string3 = gc3_0.f(context, string3);
        context = gc3_0.f(context, string2);
        SharedPreferences.Editor editor = context.edit();
        Object object2 = string3.getAll().entrySet().iterator();
        while (true) {
            boolean bl2;
            boolean bl3 = object2.hasNext();
            object = this.c;
            b2 = this.j;
            if (!bl3) break;
            Map.Entry entry = object2.next();
            Object object3 = entry.getValue();
            int n3 = object3 instanceof Number;
            if (n3 != 0) {
                object3 = (Number)object3;
                bl2 = ((Number)object3).intValue();
                entry = (String)entry.getKey();
                editor.putInt((String)((Object)entry), (int)(bl2 ? 1 : 0));
                continue;
            }
            n3 = object3 instanceof String;
            String string4 = "ARP update for key ";
            if (n3 != 0) {
                int n4;
                n3 = ((String)(object3 = (String)object3)).length();
                if (n3 < (n4 = 100)) {
                    entry = (String)entry.getKey();
                    editor.putString((String)((Object)entry), (String)object3);
                    continue;
                }
                object = ((CleverTapInstanceConfig)object).a;
                object3 = new StringBuilder(string4);
                entry = (String)entry.getKey();
                ((StringBuilder)object3).append((String)((Object)entry));
                ((StringBuilder)object3).append(" rejected (string value too long)");
                entry = ((StringBuilder)object3).toString();
                b2.b((String)object, (String)((Object)entry));
                continue;
            }
            n3 = object3 instanceof Boolean;
            if (n3 != 0) {
                entry = (String)entry.getKey();
                object3 = (Boolean)object3;
                bl2 = (Boolean)object3;
                editor.putBoolean((String)((Object)entry), bl2);
                continue;
            }
            object = ((CleverTapInstanceConfig)object).a;
            object3 = new StringBuilder(string4);
            entry = (String)entry.getKey();
            ((StringBuilder)object3).append((String)((Object)entry));
            ((StringBuilder)object3).append(" rejected (invalid data type)");
            entry = ((StringBuilder)object3).toString();
            b2.b((String)object, (String)((Object)entry));
        }
        object2 = ((CleverTapInstanceConfig)object).a;
        string2 = "Completed ARP update for namespace key: ".concat(string2);
        b2.b((String)object2, string2);
        gc3_0.i(editor);
        string3.edit().clear().apply();
        return context;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean j(FB0 var1_1) {
        var2_2 /* !! */  = FB0.PUSH_NOTIFICATION_VIEWED;
        var3_3 = false;
        if (var1_1 /* !! */  == var2_2 /* !! */ ) {
            var4_4 = true;
        } else {
            var4_4 = false;
            var1_1 /* !! */  = null;
        }
        var2_2 /* !! */  = this.g.a();
        var5_5 = var2_2 /* !! */ .e;
        var6_6 = qi_2.e(var5_5);
        if (var6_6 != 0) {
            while (true) {
                var4_4 = false;
                var1_1 /* !! */  = null;
                break;
            }
        } else {
            if ((var6_6 = qi_2.e(var5_5 = var4_4 != false ? var2_2 /* !! */ .g : var2_2 /* !! */ .f)) != 0 || (var1_1 /* !! */  = var4_4 != false ? var2_2 /* !! */ .d : var2_2 /* !! */ .c) != null && !(var4_4 = kotlin.text.b.k((CharSequence)var1_1 /* !! */ ))) ** continue;
            var4_4 = true;
        }
        var7_7 = this.k;
        var6_6 = 5;
        if (var7_7 > var6_6) {
            var7_7 = 1;
        } else {
            var7_7 = 0;
            var2_2 /* !! */  = null;
        }
        if (var7_7 != 0) {
            var5_5 = this.d;
            this.o((Context)var5_5, null);
        }
        if (var4_4 || var7_7 != 0) {
            var3_3 = true;
        }
        return var3_3;
    }

    public final void k(String string2) {
        A52 a52 = (A52)com.clevertap.android.sdk.a.g.get(string2);
        if (a52 != null) {
            String string3 = this.c.a;
            String string4 = ", that push impression sent successfully";
            string2 = cP.a("notifying listener ", string2, string4);
            b b2 = this.j;
            b2.b(string3, string2);
            a52.a();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(JSONArray object) {
        int n3 = 0;
        while (true) {
            int n4 = object.length();
            Object object2 = this.c;
            b b2 = this.j;
            if (n3 >= n4) {
                String string2 = ((CleverTapInstanceConfig)object2).a;
                b2.b(string2, "push notification viewed event sent successfully");
                return;
            }
            try {
                JSONObject jSONObject = object.getJSONObject(n3);
                String string3 = "evtData";
                JSONObject jSONObject2 = jSONObject.optJSONObject(string3);
                if (jSONObject2 != null) {
                    string3 = "wzrk_pid";
                    string3 = jSONObject2.optString(string3);
                    CharSequence charSequence = "wzrk_acct_id";
                    String string4 = jSONObject2.optString((String)charSequence);
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(string4);
                    String string5 = "_";
                    ((StringBuilder)charSequence).append(string5);
                    ((StringBuilder)charSequence).append(string3);
                    String string6 = ((StringBuilder)charSequence).toString();
                    this.k(string6);
                }
            }
            catch (JSONException jSONException) {
                String string7 = ((CleverTapInstanceConfig)object2).a;
                object2 = "Encountered an exception while parsing the push notification viewed event queue";
                b2.b(string7, (String)object2);
            }
            catch (Exception exception) {}
            ++n3;
        }
    }

    public final boolean m(Context context, el2_1 object) {
        String string2;
        int n3;
        String string3 = ((el2_1)object).a("X-WZRK-MUTE");
        boolean bl2 = true;
        if (string3 != null && (n3 = (string2 = string3.trim()).length()) > 0) {
            string2 = "true";
            boolean bl3 = string3.equals(string2);
            if (bl3) {
                this.p(context, bl2);
                return false;
            }
            this.p(context, false);
        }
        string3 = ((el2_1)object).a("X-WZRK-RD");
        com.clevertap.android.sdk.b.j();
        if (string3 != null && (n3 = (string2 = string3.trim()).length()) != 0) {
            string2 = "X-WZRK-SPIKY-RD";
            object = ((el2_1)object).a(string2);
            com.clevertap.android.sdk.b.j();
            this.p(context, false);
            this.o(context, string3);
            com.clevertap.android.sdk.b.j();
            if (object == null) {
                this.q(context, string3);
            } else {
                this.q(context, (String)object);
            }
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean n(Context var1_1, FB0 var2_2, JSONArray var3_4, String var4_6) {
        block47: {
            block46: {
                if (var3_4 == null) return false;
                var5_7 = var3_4.length();
                if (var5_7 <= 0) {
                    return false;
                }
                var6_8 /* !! */  = this.i.f();
                if (var6_8 /* !! */  == null) {
                    var1_1 = this.j;
                    var2_2 = this.c.a;
                    var1_1.getClass();
                    com.clevertap.android.sdk.b.f("CleverTap Id not finalized, unable to send queue");
                    return false;
                }
                var6_8 /* !! */  = jz0_1.fromEventGroup((FB0)var2_2);
                var7_9 = 1;
                var8_10 /* !! */  = null;
                var9_11 = new JSONObject();
                if (var4_6 != null) {
                    var10_12 = "d_src";
                    var9_11.put((String)var10_12, var4_6);
                }
                var4_6 = this.i;
                if ((var4_6 = var4_6.f()) != null && (var11_13 = var4_6.equals(var10_12 = "")) == 0) {
                    var10_12 = "g";
                    var9_11.put((String)var10_12, var4_6);
                } else {
                    var4_6 = this.j;
                    var10_12 = this.c;
                    var10_12 = var10_12.a;
                    var12_14 /* !! */  = "CRITICAL: Couldn't finalise on a device ID! Using error device ID instead!";
                    var4_6.b((String)var10_12, (String)var12_14 /* !! */ );
                }
                var4_6 = "type";
                var10_12 = "meta";
                var9_11.put((String)var4_6, var10_12);
                var4_6 = this.i;
                var4_6 = var4_6.d();
                var10_12 = this.f;
                var10_12.getClass();
                var10_12 = "af";
                var9_11.put((String)var10_12, var4_6);
                var4_6 = this.d;
                var10_12 = this.c;
                var12_14 /* !! */  = "comms_i";
                var13_15 = gc3_0.d((Context)var4_6, (CleverTapInstanceConfig)var10_12, (String)var12_14 /* !! */ );
                var15_16 = 0L;
                var17_17 = var13_15 == var15_16 ? 0 : (var13_15 < var15_16 ? -1 : 1);
                if (var17_17 > 0) {
                    var4_6 = "_i";
                    var9_11.put((String)var4_6, var13_15);
                }
                if ((var17_17 = (int)((cfr_temp_0 = (var13_15 = gc3_0.d((Context)(var4_6 = this.d), (CleverTapInstanceConfig)(var10_12 = this.c), (String)(var12_14 /* !! */  = "comms_j"))) - var15_16) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) > 0) {
                    var4_6 = "_j";
                    var9_11.put((String)var4_6, var13_15);
                }
                var4_6 = this.c;
                var10_12 = var4_6.a;
                var4_6 = var4_6.c;
                if (var10_12 == null || var4_6 == null) ** GOTO lbl208
                var12_14 /* !! */  = "id";
                var9_11.put((String)var12_14 /* !! */ , var10_12);
                var10_12 = "tk";
                var9_11.put((String)var10_12, var4_6);
                var4_6 = "l_ts";
                var10_12 = "comms_last_ts";
                var12_14 /* !! */  = this.d;
                var18_18 /* !! */  = this.c;
                var11_13 = gc3_0.c((Context)var12_14 /* !! */ , (CleverTapInstanceConfig)var18_18 /* !! */ , (String)var10_12);
                var9_11.put((String)var4_6, var11_13);
                var4_6 = "f_ts";
                var10_12 = this.d;
                var12_14 /* !! */  = this.c;
                var18_18 /* !! */  = "comms_first_ts";
                var11_13 = gc3_0.c((Context)var10_12, (CleverTapInstanceConfig)var12_14 /* !! */ , (String)var18_18 /* !! */ );
                var9_11.put((String)var4_6, var11_13);
                var4_6 = "ct_pi";
                var10_12 = this.d;
                var12_14 /* !! */  = this.c;
                var18_18 /* !! */  = this.i;
                var19_19 /* !! */  = this.m;
                var10_12 = bf0_0.b((Context)var10_12, (CleverTapInstanceConfig)var12_14 /* !! */ , (mp0_0)var18_18 /* !! */ , (ea3_1)var19_19 /* !! */ );
                var10_12 = var10_12.b();
                var10_12 = var10_12.toString();
                var9_11.put((String)var4_6, var10_12);
                var4_6 = "ddnd";
                var10_12 = this.d;
                var11_13 = (int)qi_2.a((Context)var10_12);
                if (var11_13 == 0) ** GOTO lbl-1000
                var10_12 = this.e;
                var10_12 = var10_12.m;
                if (var10_12 == null) ** GOTO lbl-1000
                var12_14 /* !! */  = new ArrayList();
                var18_18 /* !! */  = var10_12.b;
                var18_18 /* !! */  = var18_18 /* !! */ .iterator();
                while (var20_20 = var18_18 /* !! */ .hasNext()) {
                    var19_19 /* !! */  = var18_18 /* !! */ .next();
                    var19_19 /* !! */  = (ci_0)var19_19 /* !! */ ;
                    var19_19 /* !! */  = var19_19 /* !! */ .getPushType();
                    var12_14 /* !! */ .add(var19_19 /* !! */ );
                }
                var12_14 /* !! */  = var12_14 /* !! */ .iterator();
                while (var21_21 = var12_14 /* !! */ .hasNext()) {
                    var18_18 /* !! */  = var12_14 /* !! */ .next();
                    var18_18 /* !! */  = (XB2$a)var18_18 /* !! */ ;
                    if ((var18_18 /* !! */  = var10_12.d((XB2$a)var18_18 /* !! */ )) == null) continue;
                    var11_13 = 1;
                    break block46;
                }
                var11_13 = 0;
                var10_12 = null;
            }
            if (var11_13 != 0) lbl-1000:
            // 2 sources

            {
                var11_13 = 0;
                var10_12 = null;
            } else lbl-1000:
            // 2 sources

            {
                var11_13 = 1;
            }
            var9_11.put((String)var4_6, (boolean)var11_13);
            var4_6 = this.f;
            var17_17 = (int)var4_6.j;
            if (var17_17 != 0) {
                var4_6 = "bk";
                var9_11.put((String)var4_6, var7_9);
                var4_6 = this.f;
                var4_6.j = false;
            }
            var4_6 = "rtl";
            var10_12 = this.h;
            var12_14 /* !! */  = this.d;
            var10_12 = var10_12.c((Context)var12_14 /* !! */ );
            var10_12 = si_2.c((mh0_0)var10_12);
            var9_11.put((String)var4_6, var10_12);
            var4_6 = this.f;
            var11_13 = var4_6.i;
            if (var11_13 == 0) {
                var10_12 = "rct";
                var22_22 = var4_6.p;
                var9_11.put((String)var10_12, var22_22);
                var4_6 = "ait";
                var10_12 = this.f;
                var13_15 = var10_12.a;
                var9_11.put((String)var4_6, var13_15);
            }
            var4_6 = "frs";
            var10_12 = this.f;
            var11_13 = var10_12.f;
            var9_11.put((String)var4_6, (boolean)var11_13);
            var17_17 = com.clevertap.android.sdk.a.c;
            var11_13 = 3;
            if (var17_17 == var11_13) {
                var4_6 = "debug";
                var9_11.put((String)var4_6, (boolean)var7_9);
            }
            var4_6 = this.f;
            var4_6.f = false;
            try {
                var4_6 = this.c();
                if (var4_6 != null && (var11_13 = var4_6.length()) > 0) {
                    var10_12 = "arp";
                    var9_11.put((String)var10_12, var4_6);
                }
                ** GOTO lbl182
            }
            catch (JSONException v0) {
                var4_6 = this.j;
                var10_12 = this.c;
                var10_12 = var10_12.a;
                var4_6.getClass();
                com.clevertap.android.sdk.b.m();
lbl182:
                // 2 sources

                var4_6 = new JSONObject();
                var10_12 = this.f;
                var10_12 = var10_12.f();
                if (var10_12 != null) {
                    var12_14 /* !! */  = "us";
                    var4_6.put((String)var12_14 /* !! */ , var10_12);
                }
                var10_12 = this.f;
                synchronized (var10_12) {
                    var12_14 /* !! */  = var10_12.r;
                    ** if (var12_14 /* !! */  == null) goto lbl197
                }
lbl-1000:
                // 1 sources

                {
                    var10_12 = "um";
                    var4_6.put((String)var10_12, var12_14 /* !! */ );
                }
lbl197:
                // 2 sources

                var10_12 = this.f;
                if ((var10_12 = var10_12.d()) != null) {
                    var12_14 /* !! */  = "uc";
                    var4_6.put((String)var12_14 /* !! */ , var10_12);
                }
                if ((var11_13 = var4_6.length()) > 0) {
                    var10_12 = "ref";
                    var9_11.put((String)var10_12, var4_6);
                }
                ** GOTO lbl221
                {
                    catch (JSONException v1) {}
lbl208:
                    // 1 sources

                    var4_6 = this.j;
                    var9_11 = "Account ID/token not found, unable to configure queue request";
                    var4_6.getClass();
                    com.clevertap.android.sdk.b.f((String)var9_11);
                    ** try [egrp 8[TRYBLOCK] [114 : 1235->1492)] { 
lbl215:
                    // 1 sources

                    var4_6 = this.j;
                    var10_12 = this.c;
                    var10_12 = var10_12.a;
                    var4_6.getClass();
                    com.clevertap.android.sdk.b.m();
lbl221:
                    // 2 sources

                    var4_6 = this.f;
                    if ((var4_6 = var4_6.g()) != null && (var11_13 = var4_6.length()) > 0) {
                        var10_12 = "wzrk_ref";
                        var9_11.put((String)var10_12, var4_6);
                    }
                    var4_6 = this.e;
                    var4_6 = var4_6.a;
                    if (var4_6 != null) {
                        com.clevertap.android.sdk.b.j();
                        var4_6 = "imp";
                        var10_12 = this.e;
                        var10_12 = var10_12.a;
                        var12_14 /* !! */  = "istc_inapp";
                        var18_18 /* !! */  = var10_12.d;
                        var12_14 /* !! */  = Gf1.e((String)var12_14 /* !! */ , var18_18 /* !! */ );
                        var11_13 = var10_12.d(0, (String)var12_14 /* !! */ );
                        var9_11.put((String)var4_6, var11_13);
                        var4_6 = "tlc";
                        var10_12 = this.e;
                        var10_12 = var10_12.a;
                        var10_12 = var10_12.c((Context)var1_1);
                        var9_11.put((String)var4_6, var10_12);
                    } else {
                        var4_6 = this.j;
                        var10_12 = this.c;
                        var10_12 = var10_12.a;
                        var12_14 /* !! */  = "controllerManager.getInAppFCManager() is NULL, not Attaching InAppFC to Header";
                        var4_6.b((String)var10_12, (String)var12_14 /* !! */ );
                    }
                    var8_10 /* !! */  = var9_11;
                }
lbl253:
                // 3 sources

                catch (JSONException v2) {
                    var4_6 = this.j;
                    var9_11 = this.c.a;
                    var4_6.getClass();
                    com.clevertap.android.sdk.b.m();
                }
            }
            var4_6 = var3_4.optJSONObject(0);
            var9_11 = "profile";
            var17_17 = var4_6.has((String)var9_11);
            if (var8_10 /* !! */  != null) {
                var9_11 = this.p.iterator();
                while ((var11_13 = var9_11.hasNext()) != 0) {
                    var10_12 = (ru1_1)var9_11.next();
                    var12_14 /* !! */  = QB0.Companion;
                    var12_14 /* !! */ .getClass();
                    var12_14 /* !! */  = var17_17 != 0 ? QB0.PROFILE : QB0.RAISED;
                    if ((var10_12 = var10_12.a((jz0_1)var6_8 /* !! */ , (QB0)var12_14 /* !! */ )) == null) continue;
                    qi_2.c((JSONObject)var8_10 /* !! */ , (JSONObject)var10_12);
                }
            }
            var4_6 = new lz2_0((JSONArray)var3_4, (JSONObject)var8_10 /* !! */ );
            var8_10 /* !! */  = this.j;
            var9_11 = this.c.a;
            var10_12 = "Send queue contains ";
            var9_11 = new StringBuilder((String)var10_12);
            var24_23 = var3_4.length();
            var9_11.append(var24_23);
            var9_11.append(" items: ");
            var9_11.append(var4_6);
            var3_4 = var9_11.toString();
            var8_10 /* !! */ .getClass();
            com.clevertap.android.sdk.b.f((String)var3_4);
            var3_4 = this.a((FB0)var2_2, (lz2_0)var4_6);
            {
                catch (Exception v3) {}
            }
            try {
                this.l = 0;
                var8_10 /* !! */  = FB0.VARIABLES;
                var25_24 = var2_2 == var8_10 /* !! */  ? (boolean)this.f((el2_1)var3_4) : (boolean)this.e((el2_1)var3_4, (lz2_0)var4_6, (jz0_1)var6_8 /* !! */ );
            }
            catch (Throwable var2_3) {
                break block47;
            }
            this.k = var25_24 != false ? 0 : (var17_17 = this.k + var7_9);
            var3_4.close();
            return var25_24;
        }
        try {
            var3_4.close();
            throw var2_3;
        }
        catch (Throwable var3_5) {
            var2_3.addSuppressed(var3_5);
            throw var2_3;
        }
        var25_24 = this.l + var7_9;
        this.l = var25_24;
        var25_24 = this.k + var7_9;
        this.k = var25_24;
        var2_2 = this.j;
        var3_4 = this.c.a;
        var2_2.getClass();
        com.clevertap.android.sdk.b.g();
        var2_2 = ((ck_1)this.a).e;
        if (var2_2 == null) return false;
        var2_2 = (EventQueueManager)var2_2;
        var2_2.e0((Context)var1_1);
        return false;
    }

    public final void o(Context context, String string2) {
        Object object = this.c;
        String string3 = ((CleverTapInstanceConfig)object).a;
        CharSequence charSequence = new StringBuilder("Setting domain to ");
        charSequence.append(string2);
        charSequence = charSequence.toString();
        this.j.b(string3, (String)charSequence);
        object = gc3_0.l((CleverTapInstanceConfig)object, "comms_dmn");
        gc3_0.k(context, (String)object, string2);
        this.g.a().c = string2;
        this.a.getClass();
    }

    public final void p(Context object, boolean bl2) {
        Object object2 = "comms_mtd";
        CleverTapInstanceConfig cleverTapInstanceConfig = this.c;
        if (bl2) {
            long l2 = System.currentTimeMillis();
            long l3 = 1000L;
            int n3 = (int)(l2 /= l3);
            object2 = gc3_0.l(cleverTapInstanceConfig, (String)object2);
            gc3_0.j((Context)object, n3, (String)object2);
            boolean bl3 = false;
            this.o((Context)object, null);
            a a2 = jh_1.a(cleverTapInstanceConfig).b();
            object2 = new su1_1(this, (Context)object);
            object = "CommsManager#setMuted";
            a2.c((String)object, (Callable)object2);
        } else {
            String string2 = gc3_0.l(cleverTapInstanceConfig, (String)object2);
            object2 = null;
            gc3_0.j((Context)object, 0, string2);
        }
    }

    public final void q(Context context, String string2) {
        Object object = this.c;
        String string3 = ((CleverTapInstanceConfig)object).a;
        String string4 = "Setting spiky domain to ".concat(string2);
        this.j.b(string3, string4);
        object = gc3_0.l((CleverTapInstanceConfig)object, "comms_dmn_spiky");
        gc3_0.k(context, (String)object, string2);
        this.g.a().d = string2;
    }
}


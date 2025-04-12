/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.SharedPreferences
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from Wf1
 */
public final class wf1_0 {
    public static final wf1_0 a;
    public static final AtomicBoolean b;
    public static Boolean c;
    public static Boolean d;
    public static sf1_1 e;
    public static vf1_0 f;
    public static Intent g;
    public static Object h;
    public static ng1$a i;

    static {
        Object object = new Object();
        a = object;
        b = object = new AtomicBoolean(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(wf1_0 hashMap, Context object, ArrayList object2, boolean bl2) {
        boolean bl3;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        block10: {
            Object object7;
            boolean bl4;
            hashMap.getClass();
            boolean bl5 = ((ArrayList)object2).isEmpty();
            if (bl5) {
                return;
            }
            hashMap = new HashMap<JSONObject, Object>();
            object6 = new ArrayList();
            object2 = ((ArrayList)object2).iterator();
            while (bl4 = object2.hasNext()) {
                object5 = (String)object2.next();
                try {
                    object4 = new JSONObject((String)object5);
                    object7 = "productId";
                    object4 = object4.getString((String)object7);
                    object7 = "sku";
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object7);
                    object7 = "purchase";
                    Intrinsics.checkNotNullExpressionValue(object5, (String)object7);
                    hashMap.put((JSONObject)object4, object5);
                    ((ArrayList)object6).add(object4);
                }
                catch (JSONException jSONException) {}
            }
            object2 = h;
            object5 = jg1_1.a;
            object4 = jg1_1.class;
            boolean bl6 = td0.b(object4);
            object3 = null;
            if (!bl6) {
                Throwable throwable2;
                block9: {
                    ArrayList arrayList;
                    object7 = "context";
                    try {
                        boolean bl7;
                        Intrinsics.checkNotNullParameter(object, (String)object7);
                        object7 = "skuList";
                        Intrinsics.checkNotNullParameter(object6, (String)object7);
                        object7 = ((jg1_1)object5).j((ArrayList)object6);
                        arrayList = new ArrayList();
                        object6 = ((ArrayList)object6).iterator();
                        while (bl7 = object6.hasNext()) {
                            Object object8 = object6.next();
                            boolean bl8 = object7.containsKey(object8 = (String)object8);
                            if (bl8) continue;
                            arrayList.add(object8);
                        }
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    object = ((jg1_1)object5).g((Context)object, arrayList, object2, bl2);
                    object7.putAll(object);
                    object3 = object7;
                    break block10;
                }
                td0.a(object4, throwable2);
            }
        }
        object = object3.entrySet().iterator();
        while (bl3 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            object6 = (String)object2.getKey();
            object2 = (String)object2.getValue();
            if ((object6 = (String)hashMap.get(object6)) == null) continue;
            object5 = i;
            object4 = null;
            ct.e((String)object6, (String)object2, bl2, (ng1$a)((Object)object5), false);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(ng1$a object) {
        Object object2;
        boolean bl2;
        Object object3;
        int n3;
        Object object4;
        block15: {
            block14: {
                Throwable throwable2;
                Object object5;
                long l2;
                long l3;
                SharedPreferences sharedPreferences2;
                long l4;
                block13: {
                    Intrinsics.checkNotNullParameter(object, "billingClientVersion");
                    a.getClass();
                    object4 = c;
                    n3 = 1;
                    object3 = null;
                    if (object4 != null) break block15;
                    object4 = ng1_1.a("com.android.vending.billing.IInAppBillingService$Stub");
                    if (object4 != null) {
                        bl2 = true;
                    } else {
                        bl2 = false;
                        object4 = null;
                    }
                    object4 = bl2;
                    c = object4;
                    object2 = Boolean.FALSE;
                    bl2 = Intrinsics.areEqual(object4, object2);
                    if (bl2) break block15;
                    object4 = ng1_1.a("com.android.billingclient.api.ProxyBillingActivity");
                    if (object4 != null) {
                        bl2 = true;
                    } else {
                        bl2 = false;
                        object4 = null;
                    }
                    d = bl2;
                    object4 = jg1_1.a;
                    object4 = "LAST_CLEARED_TIME";
                    object2 = jg1_1.class;
                    boolean bl3 = td0.b(object2);
                    if (bl3) break block14;
                    try {
                        l4 = System.currentTimeMillis();
                        long l7 = 1000L;
                        l4 /= l7;
                        sharedPreferences2 = jg1_1.e;
                        l3 = 0L;
                        l2 = sharedPreferences2.getLong((String)object4, l3);
                        object5 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                        if (object5 != false) break block13;
                        sharedPreferences2 = sharedPreferences2.edit();
                        object4 = sharedPreferences2.putLong((String)object4, l4);
                        object4.apply();
                        break block14;
                    }
                    catch (Throwable throwable2) {}
                }
                l3 = l4 - l2;
                long l8 = l3 - (l2 = 604800L);
                object5 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object5 <= 0) break block14;
                sharedPreferences2 = sharedPreferences2.edit();
                sharedPreferences2 = sharedPreferences2.clear();
                object4 = sharedPreferences2.putLong((String)object4, l4);
                object4.apply();
                td0.a(object2, throwable2);
            }
            object4 = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            object4 = object4.setPackage("com.android.vending");
            object2 = "Intent(\"com.android.vend\u2026ge(\"com.android.vending\")";
            Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
            g = object4;
            e = object4 = new Object();
            f = object4 = new Object();
        }
        if (bl2 = Intrinsics.areEqual(object4 = c, object2 = Boolean.FALSE)) {
            return;
        }
        bl2 = ct.d();
        if (!bl2) return;
        i = object;
        object = b;
        boolean bl4 = ((AtomicBoolean)object).compareAndSet(false, n3 != 0);
        if (!bl4) {
            return;
        }
        object = FacebookSdk.a();
        bl2 = object instanceof Application;
        if (!bl2) return;
        object4 = object;
        object4 = (Application)object;
        object3 = f;
        object2 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callbacks");
            object3 = null;
        }
        object4.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object3);
        object4 = g;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("intent");
            bl2 = false;
            object4 = null;
        }
        if ((object3 = e) == null) {
            object3 = "serviceConnection";
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
        } else {
            object2 = object3;
        }
        ((Context)object).bindService((Intent)object4, (ServiceConnection)object2, n3);
    }
}


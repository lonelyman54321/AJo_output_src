/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from dL0
 */
public final class dl0_2 {
    public static final dl0_2 a;
    public static final List b;
    public static final ConcurrentHashMap c;
    public static final AtomicReference d;
    public static final ConcurrentLinkedQueue e;
    public static boolean f;

    static {
        Serializable serializable = new Serializable();
        a = serializable;
        serializable = new Serializable("app_events_config.os_version(");
        Object object = Build.VERSION.RELEASE;
        String string2 = ui0_1.a((StringBuilder)serializable, object, ')');
        b = xx_2.i("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", string2);
        c = serializable = new Serializable();
        object = dl0$a_0.NOT_LOADED;
        serializable = new Serializable(object);
        d = serializable;
        serializable = new Serializable();
        e = serializable;
    }

    public static JSONObject a() {
        boolean bl2;
        Bundle bundle = new Bundle();
        Object object = new ArrayList();
        Object object2 = b;
        ((ArrayList)object).addAll(object2);
        object = TextUtils.join((CharSequence)",", object);
        bundle.putString("fields", (String)object);
        object = GraphRequest.j;
        object = GraphRequest$c.g(null, "app", null);
        ((GraphRequest)object).i = bl2 = true;
        object2 = "<set-?>";
        Intrinsics.checkNotNullParameter(bundle, (String)object2);
        ((GraphRequest)object).d = bundle;
        bundle = ((GraphRequest)object).c().d;
        if (bundle == null) {
            bundle = new JSONObject();
        }
        return bundle;
    }

    public static final al0_2 b(String string2) {
        return (al0_2)c.get(string2);
    }

    public static final HashMap c() {
        Object object = FacebookSdk.a();
        String string2 = FacebookSdk.b();
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        String string3 = "format(format, *args)";
        string2 = xh2_0.a(objectArray, n3, "com.facebook.internal.APP_SETTINGS.%s", string3);
        object = object.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        n3 = 0;
        boolean bl2 = lz3_0.A((String)(object = object.getString(string2, null)));
        if (!bl2) {
            if (object != null) {
                try {
                    string2 = new JSONObject((String)object);
                }
                catch (JSONException jSONException) {
                    object = FacebookSdk.a;
                    bl2 = false;
                    string2 = null;
                }
                if (string2 != null) {
                    a.getClass();
                    return dl0_2.h((JSONObject)string2);
                }
            } else {
                string2 = "Required value was null.".toString();
                object = new IllegalStateException(string2);
                throw object;
            }
        }
        return null;
    }

    public static final void d() {
        boolean bl2;
        int n3 = 1;
        Context context = FacebookSdk.a();
        String string2 = FacebookSdk.b();
        boolean bl3 = lz3_0.A(string2);
        Object object = d;
        dl0_2 dl0_22 = a;
        if (bl3) {
            dl0$a_0 dl0$a_0 = dl0$a_0.ERROR;
            ((AtomicReference)object).set(dl0$a_0);
            dl0_22.j();
            return;
        }
        Object object2 = c;
        bl3 = ((ConcurrentHashMap)object2).containsKey(string2);
        if (bl3) {
            dl0$a_0 dl0$a_0 = dl0$a_0.SUCCESS;
            ((AtomicReference)object).set(dl0$a_0);
            dl0_22.j();
            return;
        }
        object2 = dl0$a_0.NOT_LOADED;
        dl0$a_0 dl0$a_0 = dl0$a_0.LOADING;
        while (!(bl2 = ((AtomicReference)object).compareAndSet(object2, dl0$a_0))) {
            Object object3 = ((AtomicReference)object).get();
            if (object3 == object2) continue;
            object3 = dl0$a_0.ERROR;
            dl0$a_0 dl0$a_02 = dl0$a_0.LOADING;
            do {
                if (!(bl3 = ((AtomicReference)object).compareAndSet(object3, dl0$a_02))) continue;
                object2 = StringCompanionObject.INSTANCE;
                object2 = new Object[n3];
                object2[0] = string2;
                String string3 = xh2_0.a((Object[])object2, n3, "com.facebook.internal.APP_SETTINGS.%s", "format(format, *args)");
                object2 = FacebookSdk.d();
                object = new bl0_2(context, string3, string2);
                object2.execute((Runnable)object);
                return;
            } while ((object2 = ((AtomicReference)object).get()) == object3);
        }
        dl0_22.j();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static al0_2 e(String string2, JSONObject jSONObject) {
        String string3;
        int n3;
        HashMap<String, HashMap<String, String>> hashMap;
        Object object;
        Object object2;
        int n4;
        int n7;
        Object object3;
        Object object4;
        Object object5;
        int n8;
        int n10;
        Object object6;
        int n14;
        String string4 = string2;
        JSONObject jSONObject2 = jSONObject;
        Intrinsics.checkNotNullParameter(string2, "applicationId");
        Intrinsics.checkNotNullParameter(jSONObject, "settingsJSON");
        JSONArray jSONArray = jSONObject.optJSONArray("android_sdk_error_categories");
        Object object7 = si0_1.d;
        Object object8 = "name";
        int n15 = 0;
        String string5 = null;
        if (jSONArray == null) {
            n14 = 0;
            object6 = null;
        } else {
            void var17_26;
            n10 = jSONArray.length();
            n8 = 0;
            object5 = null;
            object4 = null;
            object3 = null;
            n7 = 0;
            Object var17_25 = null;
            n4 = 0;
            object2 = null;
            object = null;
            hashMap = null;
            for (n3 = 0; n3 < n10; n3 += n14) {
                void var24_46;
                void var4_7;
                JSONObject jSONObject3 = var4_7.optJSONObject(n3);
                if (jSONObject3 == null || (string3 = jSONObject3.optString((String)object8)) == null) {
                    void var24_47 = var4_7;
                } else {
                    object6 = "other";
                    n14 = (int)(string3.equalsIgnoreCase((String)object6) ? 1 : 0);
                    void var24_48 = var4_7;
                    String string6 = "recovery_message";
                    if (n14 != 0) {
                        String string7 = jSONObject3.optString(string6, null);
                        object5 = sI0$a.c(jSONObject3);
                    } else {
                        object6 = "transient";
                        n14 = (int)(string3.equalsIgnoreCase((String)object6) ? 1 : 0);
                        if (n14 != 0) {
                            object2 = jSONObject3.optString(string6, null);
                            object4 = sI0$a.c(jSONObject3);
                        } else {
                            object6 = "login_recoverable";
                            n14 = (int)(string3.equalsIgnoreCase((String)object6) ? 1 : 0);
                            if (n14 != 0) {
                                object = jSONObject3.optString(string6, null);
                                object3 = sI0$a.c(jSONObject3);
                            }
                        }
                    }
                }
                n14 = 1;
                void var4_10 = var24_46;
            }
            Object object9 = object6;
            object6 = new si0_1((HashMap)object5, (HashMap)object4, (HashMap)object3, (String)var17_26, (String)object2, (String)object);
        }
        if (object6 == null) {
            object6 = ((sI0$a)object7).a();
        }
        si0_1 si0_12 = object6;
        object6 = "app_events_feature_bitmask";
        Object var4_11 = null;
        n14 = jSONObject2.optInt((String)object6, 0);
        int n16 = n14 & 8;
        boolean bl2 = n16 != 0;
        n16 = n14 & 0x10;
        boolean bl3 = n16 != 0;
        boolean bl4 = (n14 &= 0x20) != 0;
        JSONArray jSONArray2 = jSONObject2.optJSONArray("auto_event_mapping_android");
        object6 = "app_events_config";
        JSONObject jSONObject4 = jSONObject2.optJSONObject((String)object6);
        n10 = 0;
        boolean bl5 = jSONObject2.optBoolean("supports_implicit_sdk_logging", false);
        string3 = jSONObject2.optString("gdpv4_nux_content", "");
        Intrinsics.checkNotNullExpressionValue(string3, "settingsJSON.optString(A\u2026_SETTING_NUX_CONTENT, \"\")");
        boolean bl6 = jSONObject2.optBoolean("gdpv4_nux_enabled", false);
        n3 = 60;
        int n17 = jSONObject2.optInt("app_events_session_timeout", n3);
        Object object10 = y73_0.Companion;
        long l2 = jSONObject2.optLong("seamless_login");
        object10.getClass();
        EnumSet enumSet = y73$a.a(l2);
        object10 = jSONObject2.optJSONObject("android_dialog_configs");
        hashMap = new HashMap<String, HashMap<String, String>>();
        boolean bl7 = true;
        while (true) {
            void var24_55;
            int n18;
            Object object11;
            int n19;
            int n20;
            block27: {
                block31: {
                    block30: {
                        String string8;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        ArrayList arrayList3;
                        ArrayList arrayList4;
                        JSONArray jSONArray3;
                        JSONArray jSONArray4;
                        JSONArray jSONArray5;
                        JSONArray jSONArray6;
                        JSONArray jSONArray7;
                        HashMap hashMap2;
                        JSONArray jSONArray8;
                        JSONArray jSONArray9;
                        String string9;
                        String string10;
                        String string11;
                        block23: {
                            block22: {
                                block25: {
                                    String string12;
                                    block29: {
                                        block28: {
                                            block26: {
                                                block24: {
                                                    String string13;
                                                    if (!bl7 || (bl7 = false)) break block24;
                                                    if (object10 == null || (object10 = object10.optJSONArray(string13 = "data")) == null) break block25;
                                                    n20 = object10.length();
                                                    n8 = 0;
                                                    object5 = null;
                                                }
                                                if (n8 >= n20) break block25;
                                                object4 = object10.optJSONObject(n8);
                                                Intrinsics.checkNotNullExpressionValue(object4, "dialogConfigData.optJSONObject(i)");
                                                Intrinsics.checkNotNullParameter(object4, "dialogConfigJSON");
                                                object3 = object4.optString((String)object8);
                                                n7 = lz3_0.A((String)object3);
                                                if (n7 == 0) break block26;
                                                String string14 = object8;
                                                n19 = 0;
                                                object8 = null;
                                                object11 = object10;
                                                n18 = n20;
                                                break block27;
                                            }
                                            Intrinsics.checkNotNullExpressionValue(object3, "dialogNameWithFeature");
                                            String[] stringArray = new String[]{"|"};
                                            n4 = 6;
                                            string5 = null;
                                            object3 = StringsKt.a0((CharSequence)object3, stringArray, false, 0, n4);
                                            n15 = object3.size();
                                            n7 = 2;
                                            if (n15 != n7) break block28;
                                            string5 = (String)CollectionsKt.L((List)object3);
                                            object3 = (String)CollectionsKt.S((List)object3);
                                            n7 = (int)(lz3_0.A(string5) ? 1 : 0);
                                            if (n7 == 0 && (n7 = (int)(lz3_0.A((String)object3) ? 1 : 0)) == 0) break block29;
                                        }
                                        String string15 = object8;
                                        object11 = object10;
                                        n18 = n20;
                                        n19 = 0;
                                        object8 = null;
                                        break block27;
                                    }
                                    String string16 = object4.optString("url");
                                    n4 = (int)(lz3_0.A(string16) ? 1 : 0);
                                    if (n4 == 0) {
                                        Uri.parse((String)string16);
                                    }
                                    if ((object4 = object4.optJSONArray(string12 = "versions")) != null) break block30;
                                    String string17 = object8;
                                    object11 = object10;
                                    n18 = n20;
                                    n4 = 0;
                                    object2 = null;
                                    break block31;
                                }
                                object8 = jSONObject2.optString("smart_login_bookmark_icon_url");
                                Intrinsics.checkNotNullExpressionValue(object8, "settingsJSON.optString(S\u2026_LOGIN_BOOKMARK_ICON_URL)");
                                string5 = jSONObject2.optString("smart_login_menu_icon_url");
                                Intrinsics.checkNotNullExpressionValue(string5, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
                                object10 = jSONObject2.optString("sdk_update_message");
                                Intrinsics.checkNotNullExpressionValue(object10, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
                                string11 = jSONObject2.optString("aam_rules");
                                string10 = jSONObject2.optString("suggested_events_setting");
                                string9 = jSONObject2.optString("restrictive_data_filter_params");
                                String string18 = "protected_mode_rules";
                                object5 = jSONObject2.optJSONObject(string18);
                                jSONArray9 = dl0_2.i("standard_params", (JSONObject)object5);
                                object5 = jSONObject2.optJSONObject(string18);
                                jSONArray8 = dl0_2.i("maca_rules", (JSONObject)object5);
                                hashMap2 = dl0_2.h(jSONObject);
                                object5 = jSONObject2.optJSONObject(string18);
                                jSONArray7 = dl0_2.i("blocklist_events", (JSONObject)object5);
                                object5 = jSONObject2.optJSONObject(string18);
                                jSONArray6 = dl0_2.i("redacted_events", (JSONObject)object5);
                                object5 = jSONObject2.optJSONObject(string18);
                                jSONArray5 = dl0_2.i("sensitive_params", (JSONObject)object5);
                                object5 = jSONObject2.optJSONObject(string18);
                                object4 = "standard_params_schema";
                                jSONArray4 = dl0_2.i((String)object4, (JSONObject)object5);
                                JSONObject jSONObject5 = jSONObject2.optJSONObject(string18);
                                object5 = "standard_params_blocked";
                                jSONArray3 = dl0_2.i((String)object5, jSONObject5);
                                arrayList4 = dl0_2.f("fb_currency", jSONObject4);
                                arrayList3 = dl0_2.f("_valueToSum", jSONObject4);
                                Object var23_45 = null;
                                arrayList2 = dl0_2.g(jSONObject4, false);
                                n20 = 1;
                                arrayList = dl0_2.g(jSONObject4, n20 != 0);
                                JSONObject jSONObject6 = jSONObject2.optJSONObject((String)object6);
                                if (jSONObject6 != null) {
                                    object6 = "iap_manual_and_auto_log_dedup_window_millis";
                                    try {
                                        long l3 = jSONObject6.optLong((String)object6);
                                        Long l4 = l3;
                                        object = l4;
                                        break block22;
                                    }
                                    catch (Exception exception) {
                                        string8 = null;
                                        break block23;
                                    }
                                }
                                object = null;
                            }
                            string8 = object;
                        }
                        Object object12 = object7;
                        object11 = string3;
                        object7 = new al0_2(bl5, string3, bl6, n17, enumSet, hashMap, bl2, si0_12, (String)object8, string5, bl3, bl4, jSONArray2, (String)object10, string11, string10, string9, jSONArray9, jSONArray8, hashMap2, jSONArray7, jSONArray6, jSONArray5, jSONArray4, jSONArray3, arrayList4, arrayList3, arrayList2, arrayList, (Long)((Object)string8));
                        c.put(string4, object7);
                        return object7;
                    }
                    n7 = object4.length();
                    object2 = new int[n7];
                    String string19 = object8;
                    n19 = 0;
                    object8 = null;
                    while (true) {
                        boolean bl8;
                        object11 = object10;
                        if (n19 >= n7) break;
                        n10 = -1;
                        n18 = n20;
                        n20 = object4.optInt(n19, n10);
                        if (n20 == n10 && !(bl8 = lz3_0.A((String)(object10 = object4.optString(n19))))) {
                            String string20 = "versionString";
                            try {
                                Intrinsics.checkNotNullExpressionValue(object10, string20);
                                n10 = Integer.parseInt((String)object10);
                            }
                            catch (NumberFormatException numberFormatException) {
                                object10 = FacebookSdk.a;
                                n10 = -1;
                            }
                            n20 = n10;
                        }
                        object2[n19] = n20;
                        n10 = 1;
                        n19 += n10;
                        object10 = object11;
                        n20 = n18;
                    }
                    n18 = n20;
                }
                object8 = new al0$a_0(string5, (String)object3, (int[])object2);
            }
            if (object8 != null) {
                string5 = ((al0$a_0)object8).a;
                object10 = (Map)hashMap.get(string5);
                if (object10 == null) {
                    object10 = new HashMap();
                    hashMap.put(string5, (HashMap<String, String>)object10);
                }
                string5 = ((al0$a_0)object8).b;
                object10.put(string5, object8);
            }
            n19 = 1;
            n8 += n19;
            object8 = var24_55;
            object10 = object11;
            n20 = n18;
            n15 = 0;
            string5 = null;
        }
    }

    public static ArrayList f(String arrayList, JSONObject object) {
        String string2;
        String string3 = "key";
        String string4 = "value";
        if (object != null) {
            string2 = "iap_manual_and_auto_log_dedup_keys";
            object = object.getJSONArray(string2);
        } else {
            object = null;
        }
        if (object == null) {
            return null;
        }
        int n3 = object.length();
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            JSONObject jSONObject = object.getJSONObject(i3);
            String string5 = jSONObject.getString(string3);
            String string6 = "prod_keys";
            int n7 = Intrinsics.areEqual(string5, string6);
            if (n7 == 0) continue;
            jSONObject = jSONObject.getJSONArray(string4);
            try {
                n7 = jSONObject.length();
                string6 = null;
            }
            catch (Exception exception) {}
            for (int i8 = 0; i8 < n7; ++i8) {
                JSONObject jSONObject2;
                block26: {
                    jSONObject2 = jSONObject.getJSONObject(i8);
                    String string7 = jSONObject2.getString(string3);
                    boolean bl2 = Intrinsics.areEqual(string7, arrayList);
                    if (bl2) break block26;
                    continue;
                }
                arrayList = jSONObject2.getJSONArray(string4);
                object = new ArrayList();
                int n8 = arrayList.length();
                while (n4 < n8) {
                    string2 = arrayList.getJSONObject(n4);
                    string2 = string2.getString(string4);
                    ((ArrayList)object).add(string2);
                    ++n4;
                }
                arrayList = new ArrayList();
                arrayList.addAll(object);
                return arrayList;
            }
            continue;
            break;
        }
        return null;
    }

    public static ArrayList g(JSONObject jSONObject, boolean bl2) {
        ArrayList<Object> arrayList;
        int n3;
        JSONObject jSONObject2 = jSONObject;
        String string2 = "key";
        String string3 = "value";
        if (jSONObject != null) {
            String string4 = "iap_manual_and_auto_log_dedup_keys";
            jSONObject2 = jSONObject.getJSONArray(string4);
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            return null;
        }
        try {
            n3 = jSONObject2.length();
            arrayList = null;
        }
        catch (Exception exception) {
            return null;
        }
        for (int i3 = 0; i3 < n3; ++i3) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(i3);
            String string5 = jSONObject3.getString(string2);
            String string6 = "prod_keys";
            int n4 = Intrinsics.areEqual(string5, string6);
            if (n4 != 0 && bl2) continue;
            string6 = "test_keys";
            int n7 = Intrinsics.areEqual(string5, string6);
            if (n7 != 0 && !bl2) continue;
            jSONObject3 = jSONObject3.getJSONArray(string3);
            n7 = jSONObject3.length();
            string6 = null;
            for (n4 = 0; n4 < n7; ++n4) {
                Object object;
                JSONObject jSONObject4 = jSONObject3.getJSONObject(n4);
                String string7 = jSONObject4.getString(string2);
                ArrayList<Object> arrayList2 = "_valueToSum";
                boolean bl3 = Intrinsics.areEqual(string7, arrayList2);
                if (bl3) continue;
                arrayList2 = "fb_currency";
                bl3 = Intrinsics.areEqual(string7, arrayList2);
                if (bl3) continue;
                jSONObject4 = jSONObject4.getJSONArray(string3);
                arrayList2 = new ArrayList<Object>();
                int n8 = jSONObject4.length();
                for (int i8 = 0; i8 < n8; ++i8) {
                    object = jSONObject4.getJSONObject(i8);
                    object = object.getString(string3);
                    arrayList2.add(object);
                    continue;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<Object>();
                }
                object = new Pair(string7, arrayList2);
                arrayList.add(object);
            }
        }
        return arrayList;
    }

    public static HashMap h(JSONObject object) {
        boolean bl2;
        HashMap<Object, Boolean> hashMap = new HashMap<Object, Boolean>();
        Object object2 = "auto_log_app_events_default";
        boolean bl3 = object.isNull((String)object2);
        if (!bl3) {
            bl3 = object.getBoolean((String)object2);
            Boolean bl4 = bl3;
            try {
                hashMap.put(object2, bl4);
            }
            catch (JSONException jSONException) {
                object2 = lz3_0.a;
                object2 = FacebookSdk.a;
            }
        }
        if (!(bl3 = object.isNull((String)(object2 = "auto_log_app_events_enabled")))) {
            bl2 = object.getBoolean((String)object2);
            object = bl2;
            try {
                hashMap.put(object2, (Boolean)object);
            }
            catch (JSONException jSONException) {
                object = lz3_0.a;
                object = FacebookSdk.a;
            }
        }
        if (bl2 = hashMap.isEmpty()) {
            hashMap = null;
        }
        return hashMap;
    }

    public static JSONArray i(String string2, JSONObject jSONObject) {
        string2 = jSONObject != null ? jSONObject.optJSONArray(string2) : null;
        return string2;
    }

    public static final al0_2 k(String object, boolean bl2) {
        Object object2;
        boolean bl3;
        Object object3 = "applicationId";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        if (!bl2 && (bl3 = ((ConcurrentHashMap)(object2 = c)).containsKey(object))) {
            return (al0_2)((ConcurrentHashMap)object2).get(object);
        }
        object2 = a;
        object2.getClass();
        object3 = dl0_2.a();
        object3 = dl0_2.e((String)object, (JSONObject)object3);
        Object object4 = FacebookSdk.b();
        boolean bl4 = Intrinsics.areEqual(object, object4);
        if (bl4) {
            object = d;
            object4 = dl0$a_0.SUCCESS;
            ((AtomicReference)object).set(object4);
            ((dl0_2)object2).j();
        }
        return object3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j() {
        synchronized (this) {
            Throwable throwable2;
            block12: {
                block10: {
                    Object object;
                    ConcurrentHashMap concurrentHashMap;
                    Object object2;
                    Object object3;
                    block11: {
                        boolean bl2;
                        object3 = d;
                        object3 = object3.get();
                        object3 = (dl0$a_0)((Object)object3);
                        object2 = dl0$a_0.NOT_LOADED;
                        if (object2 == object3 || (object2 = dl0$a_0.LOADING) == object3) break block10;
                        object2 = FacebookSdk.b();
                        concurrentHashMap = c;
                        object2 = concurrentHashMap.get(object2);
                        object2 = (al0_2)object2;
                        object = Looper.getMainLooper();
                        concurrentHashMap = new Handler(object);
                        object = dl0$a_0.ERROR;
                        if (object != object3) break block11;
                        while (!(bl2 = ((ConcurrentLinkedQueue)(object3 = e)).isEmpty())) {
                            object3 = ((ConcurrentLinkedQueue)object3).poll();
                            object3 = (dl0$b_0)object3;
                            object2 = new cl0_2((dl0$b_0)object3);
                            concurrentHashMap.post((Runnable)object2);
                        }
                        return;
                    }
                    try {
                        while (true) {
                            boolean bl3;
                            if (bl3 = ((ConcurrentLinkedQueue)(object3 = e)).isEmpty()) {
                                return;
                            }
                            object3 = ((ConcurrentLinkedQueue)object3).poll();
                            object3 = (dl0$b_0)object3;
                            object = new ho_1((dl0$b_0)object3, (al0_2)object2);
                            concurrentHashMap.post((Runnable)object);
                        }
                    }
                    catch (Throwable throwable2) {}
                    break block12;
                }
                return;
            }
            throw throwable2;
        }
    }
}


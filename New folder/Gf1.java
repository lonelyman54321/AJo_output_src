/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.task.a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class Gf1 {
    public final SimpleDateFormat a;
    public final CleverTapInstanceConfig b;
    public final Context c;
    public String d;
    public final df1_1 e;
    public final kd3_0 f;

    public Gf1(Context object, CleverTapInstanceConfig object2, String string2, kd3_0 kd3_02, df1_1 df1_12) {
        SimpleDateFormat simpleDateFormat;
        Locale locale = Locale.US;
        this.a = simpleDateFormat = new SimpleDateFormat("ddMMyyyy", locale);
        this.b = object2;
        this.c = object;
        this.d = string2;
        this.f = kd3_02;
        this.e = df1_12;
        object = jh_1.a((CleverTapInstanceConfig)object2).b();
        object2 = new Gf1$a(this);
        ((a)object).c("initInAppFCManager", (Callable)object2);
    }

    public static String b(CTInAppNotification cTInAppNotification) {
        String string2 = cTInAppNotification.p;
        if (string2 == null) {
            return null;
        }
        boolean bl2 = string2.isEmpty();
        if (!bl2) {
            try {
                return cTInAppNotification.p;
            }
            catch (Throwable throwable) {}
        }
        return null;
    }

    public static String e(String string2, String string3) {
        return n1.a(string2, ":", string3);
    }

    public final int[] a(String object) {
        int n3;
        int n4;
        String string2;
        block10: {
            string2 = this.d;
            String string3 = Gf1.e("counts_per_inapp", string2);
            string3 = this.j(string3);
            string3 = gc3_0.f(this.c, string3);
            n4 = 0;
            string2 = null;
            object = string3.getString((String)object, null);
            string3 = null;
            if (object == null) {
                return new int[]{0, 0};
            }
            string2 = ",";
            try {
                object = object.split(string2);
            }
            catch (Throwable throwable) {
                return new int[]{0, 0};
            }
            n4 = ((String[])object).length;
            n3 = 2;
            if (n4 == n3) break block10;
            return new int[]{0, 0};
        }
        string2 = object[0];
        n4 = Integer.parseInt(string2);
        n3 = 1;
        object = object[n3];
        int n7 = Integer.parseInt((String)object);
        return new int[]{n4, n7};
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONArray c(Context object) {
        int n3;
        Object object2;
        JSONArray jSONArray;
        try {
            jSONArray = new JSONArray();
            object2 = "counts_per_inapp";
            String string2 = this.d;
            object2 = Gf1.e((String)object2, string2);
            object2 = this.j((String)object2);
            object = gc3_0.f((Context)object, (String)object2);
            object = object.getAll();
            object = object.entrySet();
            object = object.iterator();
            while ((n3 = object.hasNext()) != 0) {
                object2 = object.next();
            }
        }
        catch (Throwable throwable) {
            com.clevertap.android.sdk.b.l();
            return null;
        }
        {
            int n4;
            String string3;
            Object v4 = (object2 = (Map.Entry)object2).getValue();
            boolean bl2 = v4 instanceof String;
            if (!bl2) continue;
            Object v5 = object2.getValue();
            String string4 = (String)v5;
            String[] stringArray = string4.split(string3 = ",");
            int n7 = stringArray.length;
            if (n7 != (n4 = 2)) continue;
            string3 = new JSONArray();
            object2 = object2.getKey();
            int n8 = 0;
            string3.put(0, object2);
            object2 = stringArray[0];
            n3 = Integer.parseInt((String)object2);
            n8 = 1;
            string3.put(n8, n3);
            object2 = stringArray[n8];
            n3 = Integer.parseInt((String)object2);
            string3.put(n4, n3);
            jSONArray.put((Object)string3);
            continue;
        }
        return jSONArray;
    }

    public final int d(int n3, String string2) {
        Object object = this.b;
        int n4 = ((CleverTapInstanceConfig)object).p;
        Context context = this.c;
        if (n4 != 0) {
            int n7 = -1000;
            object = this.j(string2);
            n4 = gc3_0.b(context, n7, (String)object);
            if (n4 == n7) {
                object = gc3_0.e(context);
                n4 = object.getInt(string2, n3);
            }
            return n4;
        }
        string2 = this.j(string2);
        return gc3_0.b(context, n3, string2);
    }

    public final String f(String string2, String string3) {
        Object object = this.b;
        boolean bl2 = ((CleverTapInstanceConfig)object).p;
        Context context = this.c;
        if (bl2) {
            object = this.j(string2);
            if ((object = gc3_0.g(context, (String)object, string3)) == null) {
                object = gc3_0.e(context).getString(string2, string3);
            }
            return object;
        }
        string2 = this.j(string2);
        return gc3_0.g(context, string2, string3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(String var1_1) {
        var2_4 = "ict_date";
        var3_5 = this.c;
        var4_6 = this.b;
        var5_7 = var4_6.b();
        var6_8 /* !! */  = new StringBuilder();
        var7_9 = var4_6.a;
        var6_8 /* !! */ .append((String)var7_9);
        var6_8 /* !! */ .append(":async_deviceID");
        var6_8 /* !! */  = var6_8 /* !! */ .toString();
        var7_9 = "InAppFCManager init() called";
        var5_7.b((String)var6_8 /* !! */ , (String)var7_9);
        this.h((String)var1_1);
        var5_7 = this.a;
        var6_8 /* !! */  = new Date();
        var5_7 = var5_7.format((Date)var6_8 /* !! */ );
        var6_8 /* !! */  = Gf1.e((String)var2_4, (String)var1_1);
        var7_9 = "20140428";
        var6_8 /* !! */  = this.f((String)var6_8 /* !! */ , (String)var7_9);
        var8_10 = var5_7.equals(var6_8 /* !! */ );
        if (var8_10 != false) return;
        var2_4 = Gf1.e((String)var2_4, (String)var1_1);
        var2_4 = this.j((String)var2_4);
        gc3_0.k((Context)var3_5, (String)var2_4, (String)var5_7);
        var2_4 = "istc_inapp";
        var2_4 = Gf1.e((String)var2_4, (String)var1_1);
        var2_4 = this.j((String)var2_4);
        var9_11 = false;
        var5_7 = null;
        gc3_0.j((Context)var3_5, 0, (String)var2_4);
        var2_4 = "counts_per_inapp";
        var1_1 = Gf1.e((String)var2_4, (String)var1_1);
        var1_1 = this.j((String)var1_1);
        var1_1 = gc3_0.f((Context)var3_5, (String)var1_1);
        var2_4 = var1_1.edit();
        var1_1 = var1_1.getAll();
        var3_5 = var1_1.keySet();
        var3_5 = var3_5.iterator();
        while (var9_11 = var3_5.hasNext()) {
            var5_7 = var3_5.next();
        }
        ** GOTO lbl79
        {
            block7: {
                var6_8 /* !! */  = var1_1.get(var5_7 = (String)var5_7);
                var10_12 = var6_8 /* !! */  instanceof String;
                if (var10_12 != 0) ** GOTO lbl51
                var2_4.remove((String)var5_7);
                continue;
lbl51:
                // 1 sources

                var6_8 /* !! */  = (String)var6_8 /* !! */ ;
                var7_9 = ",";
                var10_12 = (var6_8 /* !! */  = var6_8 /* !! */ .split((String)var7_9)).length;
                if (var10_12 == (var11_13 = 2)) break block7;
                var2_4.remove((String)var5_7);
                continue;
            }
            try {
                var7_9 = new StringBuilder();
                var12_14 = "0,";
                var7_9.append(var12_14);
                var11_13 = 1;
                var6_8 /* !! */  = var6_8 /* !! */ [var11_13];
                var7_9.append((String)var6_8 /* !! */ );
                var6_8 /* !! */  = var7_9.toString();
                var2_4.putString((String)var5_7, (String)var6_8 /* !! */ );
            }
            catch (Throwable v0) {
                try {
                    var5_7 = var4_6.b();
                    var5_7.getClass();
                    com.clevertap.android.sdk.b.m();
                    continue;
lbl79:
                    // 1 sources

                    gc3_0.i((SharedPreferences.Editor)var2_4);
                    return;
                }
                catch (Exception var1_2) {}
                break;
            }
        }
        var2_4 = var4_6.b();
        var3_5 = var4_6.a;
        var5_7 = "Failed to init inapp manager ";
        var4_6 = new StringBuilder((String)var5_7);
        var1_3 = var1_2.getLocalizedMessage();
        var4_6.append(var1_3);
        var1_3 = var4_6.toString();
        var2_4.b((String)var3_5, var1_3);
    }

    public final void h(String string2) {
        boolean bl2;
        Context context = this.c;
        Object object = "counts_per_inapp";
        Object object2 = gc3_0.f(context, (String)object);
        Object object3 = Gf1.e((String)object, string2);
        object3 = gc3_0.f(context, (String)object3);
        object = Gf1.e((String)object, string2);
        object = this.j((String)object);
        object = gc3_0.f(context, (String)object);
        int n3 = 1;
        Object object4 = new pj0_1(n3);
        String string3 = "<this>";
        Intrinsics.checkNotNullParameter(object3, string3);
        Map map2 = object3.getAll();
        String string4 = "all";
        Intrinsics.checkNotNullExpressionValue(map2, string4);
        boolean bl3 = map2.isEmpty() ^ true;
        if (bl3) {
            com.clevertap.android.sdk.b.c();
            object2 = new m23((SharedPreferences)object3, (SharedPreferences)object, (pj0_1)object4);
            ((m23)object2).a();
            com.clevertap.android.sdk.b.c();
        } else {
            Intrinsics.checkNotNullParameter(object2, string3);
            object3 = object2.getAll();
            Intrinsics.checkNotNullExpressionValue(object3, string4);
            bl2 = object3.isEmpty() ^ true;
            if (bl2) {
                com.clevertap.android.sdk.b.c();
                object3 = new m23((SharedPreferences)object2, (SharedPreferences)object, (pj0_1)object4);
                ((m23)object3).a();
                com.clevertap.android.sdk.b.c();
            }
        }
        object = this.f;
        object2 = ((kd3_0)object).a;
        if (object2 != null && (object = ((kd3_0)object).c) != null) {
            object3 = ((pt1_2)object).b;
            Intrinsics.checkNotNull(object3);
            object = ((pt1_2)object).a;
            object4 = ((vi_2)object).d((String)object3, "[]");
            try {
                string3 = new JSONArray((String)object4);
            }
            catch (JSONException jSONException) {
                string3 = new JSONArray();
            }
            int n4 = string3.length();
            if (n4 > 0) {
                com.clevertap.android.sdk.b.c();
                ((rg1_2)object2).b((JSONArray)string3);
                Intrinsics.checkNotNull(object3);
                ((vi_2)object).e((String)object3);
                com.clevertap.android.sdk.b.c();
            }
        }
        object = "ict_date";
        object2 = Gf1.e((String)object, string2);
        bl2 = false;
        object3 = null;
        if ((object2 = this.f((String)object2, null)) == null && (object2 = this.f((String)object, null)) != null) {
            com.clevertap.android.sdk.b.j();
            object2 = this.f((String)object, "20140428");
            object = Gf1.e((String)object, string2);
            object = this.j((String)object);
            gc3_0.k(context, (String)object, (String)object2);
            object = "istc_inapp";
            object2 = this.j((String)object);
            bl2 = false;
            object3 = null;
            int n7 = this.d(0, (String)object2);
            string2 = Gf1.e((String)object, string2);
            string2 = this.j(string2);
            gc3_0.j(context, n7, string2);
        }
    }

    public final void i(Context context, JSONObject jSONObject) {
        int n3;
        String string2;
        block22: {
            string2 = "inapp_stale";
            n3 = jSONObject.has(string2);
            if (n3 != 0) break block22;
            return;
        }
        jSONObject = jSONObject.getJSONArray(string2);
        string2 = "counts_per_inapp";
        Object object = this.d;
        string2 = Gf1.e(string2, (String)object);
        string2 = this.j(string2);
        context = gc3_0.f(context, string2);
        context = context.edit();
        int n4 = 0;
        string2 = null;
        while (true) {
            Object object2;
            n3 = jSONObject.length();
            if (n4 >= n3) break;
            object = jSONObject.get(n4);
            boolean bl2 = object instanceof Integer;
            if (bl2) {
                object2 = new StringBuilder();
                String string3 = "";
                ((StringBuilder)object2).append(string3);
                ((StringBuilder)object2).append(object);
                object2 = ((StringBuilder)object2).toString();
                context.remove((String)object2);
                Objects.toString(object);
                com.clevertap.android.sdk.b.c();
            } else {
                bl2 = object instanceof String;
                if (bl2) {
                    object2 = object;
                    object2 = (String)object;
                    context.remove((String)object2);
                    Objects.toString(object);
                    com.clevertap.android.sdk.b.c();
                }
            }
            ++n4;
        }
        try {
            gc3_0.i((SharedPreferences.Editor)context);
        }
        catch (Throwable throwable) {
            com.clevertap.android.sdk.b.l();
        }
    }

    public final String j(String charSequence) {
        charSequence = nn_2.a((String)charSequence, ":");
        String string2 = this.b.a;
        ((StringBuilder)charSequence).append(string2);
        return ((StringBuilder)charSequence).toString();
    }
}


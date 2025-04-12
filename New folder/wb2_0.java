/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from WB2
 */
public final class wb2_0
extends zV {
    public final tf_0 b;
    public final CleverTapInstanceConfig c;
    public final Context d;
    public final b e;
    public final l80_0 f;
    public final Nh0 g;

    public wb2_0(Context object, CleverTapInstanceConfig cleverTapInstanceConfig, Nh0 nh0, ck_1 ck_12, l80_0 l80_02) {
        this.d = object;
        this.c = cleverTapInstanceConfig;
        object = cleverTapInstanceConfig.b();
        this.e = object;
        this.g = nh0;
        this.b = ck_12;
        this.f = l80_02;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(Context var1_1, JSONObject var2_2, String var3_3) {
        block33: {
            block32: {
                var3_3 = this.g;
                var4_4 = "ack";
                var5_5 = "pf";
                var6_7 = "pushamp_notifs";
                var7_8 = this.c;
                var8_9 = var7_8.h;
                var9_10 = this.e;
                if (var8_9 != 0) {
                    var1_1 = var7_8.a;
                    var9_10.b((String)var1_1, "CleverTap instance is configured to analytics only, not processing push amp response");
                    return;
                }
                var8_9 = var2_2 /* !! */ .has((String)var6_7);
                if (var8_9 == 0) ** GOTO lbl85
                var10_11 = var7_8.a;
                var11_12 = "Processing pushamp messages...";
                var9_10.b(var10_11, var11_12);
                var2_2 /* !! */  = var2_2 /* !! */ .getJSONObject((String)var6_7);
                var6_7 = "list";
                var6_7 = var2_2 /* !! */ .getJSONArray((String)var6_7);
                var8_9 = var6_7.length();
                if (var8_9 <= 0) break block32;
                var7_8 = var7_8.a;
                var10_11 = "Handling Push payload locally";
                var9_10.b((String)var7_8, var10_11);
                this.b((JSONArray)var6_7);
            }
            var12_13 = var2_2 /* !! */ .has((String)var5_5);
            if (var12_13 == 0) break block33;
            var13_14 = var2_2 /* !! */ .getInt((String)var5_5);
            var6_7 = this.f;
            var6_7 = var6_7.m;
            try {
                var6_7.j(var13_14, (Context)var1_1);
            }
            catch (Throwable var5_6) {
                var5_6.getMessage();
                var9_10.a();
            }
        }
        var13_14 = (int)var2_2 /* !! */ .has(var4_4);
        if (var13_14 == 0) ** GOTO lbl85
        var14_15 = var2_2 /* !! */ .getBoolean(var4_4);
        var9_10.a();
        if (!var14_15) ** GOTO lbl85
        var2_2 /* !! */  = var3_3.c((Context)var1_1);
        var2_2 /* !! */  = si_2.c((mh0_0)var2_2 /* !! */ );
        var15_16 = var2_2 /* !! */ .length();
        var5_5 = new String[var15_16];
        var6_7 = null;
        for (var12_13 = 0; var12_13 < var15_16; ++var12_13) {
            var7_8 = var2_2 /* !! */ .getString(var12_13);
            var5_5[var12_13] = var7_8;
            continue;
        }
        var9_10.a();
        {
            catch (Throwable v0) {
                ** continue;
            }
        }
        var1_1 = var3_3.c((Context)var1_1);
        var1_1.n(var5_5);
lbl85:
        // 5 sources

    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(JSONArray object) {
        Object object2 = this.c;
        Context context = this.d;
        b b2 = this.e;
        String string2 = "wzrk_ttl";
        int n3 = 0;
        while (true) {
            block11: {
                String string3;
                Object object3;
                Object object4;
                Object object5;
                Object object6;
                block10: {
                    String string4;
                    try {
                        boolean bl2;
                        int n4 = object.length();
                        if (n3 >= n4) return;
                        object6 = new Bundle();
                        object5 = object.getJSONObject(n3);
                        boolean bl3 = object5.has(string2);
                        if (bl3) {
                            long l2 = object5.getLong(string2);
                            object6.putLong(string2, l2);
                        }
                        object4 = object5.keys();
                        while (bl2 = object4.hasNext()) {
                            object3 = object4.next();
                            object3 = object3.toString();
                            string3 = object5.getString(object3);
                            object6.putString(object3, string3);
                        }
                        bl3 = object6.isEmpty();
                        object3 = "wzrk_pid";
                        if (bl3) break block10;
                        object4 = this.g;
                        object4 = ((Nh0)object4).c(context);
                        string3 = object5.getString(object3);
                        synchronized (object4) {
                            string4 = "id";
                        }
                    }
                    catch (JSONException jSONException) {
                        object = ((CleverTapInstanceConfig)object2).a;
                        object2 = "Error parsing push notification JSON";
                        b2.b((String)object, (String)object2);
                        return;
                    }
                    {
                        Intrinsics.checkNotNullParameter(string3, string4);
                        string4 = ((mh0_0)object4).g(string3);
                        boolean bl4 = Intrinsics.areEqual(string3, string4);
                        {
                            // MONITOREXIT @DISABLED, blocks:[2, 5, 7] lbl40 : MonitorExitStatement: MONITOREXIT : var13_12
                            if (bl4) break block10;
                            b2.a();
                            object5 = this.b;
                            object5.getClass();
                            object5 = YB2$a.a;
                            object4 = XB2$a.FCM;
                            object4 = ((XB2$a)((Object)object4)).toString();
                            ((yb2_0)object5).b(context, (String)object4, (Bundle)object6);
                            break block11;
                        }
                    }
                }
                object6 = ((CleverTapInstanceConfig)object2).a;
                object4 = new StringBuilder();
                string3 = "Push Notification already shown, ignoring local notification :";
                ((StringBuilder)object4).append(string3);
                object5 = object5.getString(object3);
                ((StringBuilder)object4).append((String)object5);
                object5 = ((StringBuilder)object4).toString();
                b2.b((String)object6, (String)object5);
            }
            ++n3;
        }
    }
}


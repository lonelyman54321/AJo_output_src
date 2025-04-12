/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.events;

import android.content.Context;
import android.net.ConnectivityManager;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.LocalDataStore;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.events.EventQueueManager$2;
import com.clevertap.android.sdk.events.EventQueueManager$5;
import com.clevertap.android.sdk.events.EventQueueManager$6;
import com.clevertap.android.sdk.events.EventQueueManager$a;
import com.clevertap.android.sdk.events.EventQueueManager$b;
import com.clevertap.android.sdk.events.EventQueueManager$c;
import com.clevertap.android.sdk.task.a;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class EventQueueManager
extends k0_0
implements si0_0 {
    public Runnable a = null;
    public final Nh0 b;
    public final E80 c;
    public final CleverTapInstanceConfig d;
    public final Context e;
    public final ti_0 f;
    public final mp0_0 g;
    public final KB0 h;
    public final LocalDataStore i;
    public final b j;
    public iz1 k;
    public final cg1_0 l;
    public final tu1_1 m;
    public final x03 n;
    public final ea3_1 o;
    public Runnable p = null;
    public final l80_0 q;
    public final ae0_1 r;

    public EventQueueManager(Nh0 nh0, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, KB0 kB0, x03 x032, ck_1 ck_12, cg1_0 cg1_02, mp0_0 mp0_02, ea3_1 ea3_12, tu1_1 tu1_12, E80 e80, ti_0 ti_02, LocalDataStore localDataStore, l80_0 l80_02, ae0_1 ae0_12) {
        Object object = nh0;
        this.b = nh0;
        object = context;
        this.e = context;
        object = cleverTapInstanceConfig;
        this.d = cleverTapInstanceConfig;
        this.h = kB0;
        this.n = x032;
        this.l = cg1_02;
        this.g = mp0_02;
        this.o = ea3_12;
        this.m = tu1_12;
        this.i = localDataStore;
        this.j = object = cleverTapInstanceConfig.b();
        object = e80;
        this.c = e80;
        object = ti_02;
        this.f = ti_02;
        object = l80_02;
        this.q = l80_02;
        object = ae0_12;
        this.r = ae0_12;
        object = ck_12;
        ck_12.e = this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a0(Context context, JSONObject jSONObject) {
        Object object;
        Object object2;
        String string2 = "mc";
        try {
            object2 = yz3_0.a;
            object2 = Runtime.getRuntime();
            long l2 = ((Runtime)object2).freeMemory();
            Runtime runtime = Runtime.getRuntime();
            long l3 = runtime.totalMemory() - l2;
            jSONObject.put(string2, l3);
        }
        catch (Throwable throwable) {}
        string2 = "nt";
        try {
            object2 = yz3_0.a;
            object2 = "Unavailable";
            object = "connectivity";
        }
        catch (Throwable throwable) {
            return;
        }
        try {
            object = context.getSystemService((String)object);
            object = (ConnectivityManager)object;
            if (object != null) {
                boolean bl2;
                int n3 = 1;
                object2 = (object = object.getNetworkInfo(n3)) != null && (bl2 = object.isConnected()) ? "WiFi" : yz3_0.e(context);
            }
        }
        catch (Throwable throwable) {}
        jSONObject.put(string2, object2);
    }

    public final void T(Context object, FB0 object2, String object3) {
        boolean bl2 = tu1_1.h((Context)object);
        Object object4 = this.d;
        b b2 = this.j;
        if (!bl2) {
            object = ((CleverTapInstanceConfig)object4).a;
            b2.b((String)object, "Network connectivity unavailable. Will retry later");
            object = this.q;
            object2 = ((l80_0)object).n;
            object3 = ((l80_0)object).h;
            if (object2 != null) {
                object3.getClass();
                object = ((l80_0)object).n;
                ((ki_1)object).b();
            }
            object = new JSONArray();
            object3 = (ck_1)object3;
            object2 = ((ck_1)object3).h;
            if (object2 != null) {
                object3 = null;
                object2.a((JSONArray)object, false);
            }
            return;
        }
        this.c.getClass();
        tu1_1 tu1_12 = this.m;
        boolean bl3 = tu1_12.j((FB0)((Object)object2));
        if (bl3) {
            object4 = new EventQueueManager$2(this, (Context)object, (FB0)((Object)object2), (String)object3);
            tu1_12.g((FB0)((Object)object2), (Runnable)object4);
        } else {
            object4 = ((CleverTapInstanceConfig)object4).a;
            String string2 = "Pushing Notification Viewed event onto queue DB flush";
            b2.b((String)object4, string2);
            tu1_12.b((Context)object, (FB0)((Object)object2), (String)object3);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void W(JSONObject var1_1, boolean var2_2) {
        var3_3 = this.g;
        var4_4 = this.d;
        var5_5 = var3_3.f();
        var6_6 = new JSONObject();
        var7_7 = this.e;
        if (var1_1 == null || (var8_8 = var1_1.length()) <= 0) ** GOTO lbl45
        var9_9 = var1_1.keys();
        var10_10 = this.o;
        var10_10 = bf0_0.b(var7_7, var4_4, (mp0_0)var3_3, (ea3_1)var10_10);
        var12_12 = this.r;
        var11_11 = new iz1(var7_7, var4_4, (mp0_0)var3_3, (ae0_1)var12_12);
        this.k = var11_11;
        while (var13_13 = var9_9.hasNext()) {
            var11_11 = var9_9.next();
            var11_11 = (String)var11_11;
        }
        ** GOTO lbl45
        {
            try {
                var12_12 = var1_1.getJSONObject((String)var11_11);
                ** GOTO lbl27
            }
            catch (Throwable v0) {
                block16: {
                    try {
                        var12_12 = var1_1.get((String)var11_11);
                    }
                    catch (JSONException v1) {
                        var12_12 = null;
                    }
lbl27:
                    // 3 sources

                    if (var12_12 == null) continue;
                    var6_6.put((String)var11_11, var12_12);
                    var14_14 = var10_10.a((String)var11_11);
                    if (!var14_14 || !var2_2) break block16;
                    try {
                        var12_12 = this.k;
                        var12_12.f(var5_5, (String)var11_11);
                    }
                    catch (Throwable v2) {}
                    continue;
                }
                if (!var14_14) continue;
                var15_15 = this.k;
                var12_12 = var12_12.toString();
                var15_15.a(var5_5, (String)var11_11, (String)var12_12);
                continue;
lbl45:
                // 2 sources

                try {
                    var1_1 = var3_3.e();
                    var1_1 = var1_1.c;
                    var16_16 = "";
                    if (var1_1 != null && !(var17_18 = var1_1.equals(var16_16))) {
                        var5_5 = "Carrier";
                        var6_6.put(var5_5, var1_1);
                    }
                    var1_1 = var3_3.e();
                    var1_1 = var1_1.d;
                    if (var1_1 != null && !(var2_2 = var1_1.equals(var16_16))) {
                        var16_16 = "cc";
                        var6_6.put((String)var16_16, var1_1);
                    }
                    var1_1 = "tz";
                    var16_16 = TimeZone.getDefault();
                    var16_16 = var16_16.getID();
                    var6_6.put((String)var1_1, var16_16);
                    var1_1 = new JSONObject();
                    var16_16 = "profile";
                    var1_1.put((String)var16_16, (Object)var6_6);
                    var2_2 = 3;
                    this.Y(var7_7, (JSONObject)var1_1, (int)var2_2);
                    return;
                }
                catch (JSONException v3) {
                    try {
                        var1_1 = var4_4.b();
                        var16_17 = var4_4.a;
                        var3_3 = "FATAL: Creating basic profile update event failed!";
                        var1_1.b(var16_17, (String)var3_3);
                        return;
                    }
                    catch (Throwable v4) {
                        var1_1 = var4_4.b();
                        var1_1.getClass();
                        com.clevertap.android.sdk.b.m();
                        return;
                        break;
                    }
                }
            }
        }
    }

    public final void X() {
        Object object = this.c;
        int n3 = ((E80)object).d;
        if (n3 <= 0) {
            object = jh_1.a(this.d).b();
            EventQueueManager$b eventQueueManager$b = new EventQueueManager$b(this);
            String string2 = "CleverTapAPI#pushInitialEventsAsync";
            ((a)object).c(string2, eventQueueManager$b);
        }
    }

    public final Future Y(Context context, JSONObject jSONObject, int n3) {
        a a2 = jh_1.a(this.d).b();
        EventQueueManager$c eventQueueManager$c = new EventQueueManager$c(this, jSONObject, n3, context);
        return a2.d("queueEvent", eventQueueManager$c);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Z(Context object, JSONObject object2, int n3) {
        int n4 = 6;
        if (n3 == n4) {
            Object object3 = this.d.b();
            Object object4 = this.d.a;
            Object object5 = "Pushing Notification Viewed event onto separate queue";
            ((b)object3).b((String)object4, (String)object5);
            object3 = this.f.a;
            synchronized (object3) {
                try {
                    object4 = this.c;
                    int n7 = ((E80)object4).d;
                    object5 = "s";
                    object2.put((String)object5, n7);
                    object4 = "type";
                    object5 = "event";
                    object2.put((String)object4, object5);
                    object4 = "ep";
                    long l2 = System.currentTimeMillis();
                    long l3 = 1000L;
                    int n8 = (int)(l2 /= l3);
                    object2.put((String)object4, n8);
                    object4 = this.o;
                    object4 = ((ea3_1)object4).a();
                    if (object4 != null) {
                        object5 = "wzrk_error";
                        object4 = si_2.b((da3_1)object4);
                        object2.put((String)object5, object4);
                    }
                    object4 = this.d;
                    object4 = ((CleverTapInstanceConfig)object4).b();
                    object5 = this.d;
                    object5 = ((CleverTapInstanceConfig)object5).a;
                    String string2 = "Pushing Notification Viewed event onto DB";
                    ((b)object4).b((String)object5, string2);
                    object4 = this.b;
                    object4.getClass();
                    object5 = "context";
                    Intrinsics.checkNotNullParameter(object, (String)object5);
                    object5 = "event";
                    Intrinsics.checkNotNullParameter(object2, (String)object5);
                    object5 = ci3_1.PUSH_NOTIFICATION_VIEWED;
                    ((Nh0)object4).d((Context)object, (JSONObject)object2, (ci3_1)((Object)object5));
                    this.c0((Context)object, (JSONObject)object2, n3);
                    Object object6 = this.d;
                    object6 = ((CleverTapInstanceConfig)object6).b();
                    object4 = this.d;
                    object4 = ((CleverTapInstanceConfig)object4).a;
                    object5 = "Pushing Notification Viewed event onto queue flush";
                    ((b)object6).b((String)object4, (String)object5);
                    object6 = this.p;
                    if (object6 == null) {
                        object6 = new EventQueueManager$6(this, (Context)object);
                        this.p = object6;
                    }
                    object = this.p;
                    object6 = this.l;
                    object6.removeCallbacks((Runnable)object);
                    object = this.p;
                    object6.post((Runnable)object);
                }
                catch (Throwable throwable) {
                    object = this.d;
                    object = ((CleverTapInstanceConfig)object).b();
                    Object object7 = this.d;
                    object7 = ((CleverTapInstanceConfig)object7).a;
                    object2.toString();
                    object.getClass();
                    com.clevertap.android.sdk.b.m();
                }
                return;
            }
        }
        n4 = 8;
        if (n3 != n4) {
            this.d0((Context)object, (JSONObject)object2, n3);
            return;
        }
        Object object8 = FB0.VARIABLES;
        n4 = (int)(tu1_1.h((Context)object) ? 1 : 0);
        if (n4 == 0) {
            object = this.d.a;
            object2 = "Network connectivity unavailable. Event won't be sent.";
            object8 = this.j;
            ((b)object8).b((String)object, (String)object2);
            return;
        }
        this.c.getClass();
        Object object9 = new JSONArray();
        object2 = object9.put(object2);
        object9 = this.m;
        boolean bl2 = ((tu1_1)object9).j((FB0)((Object)object8));
        if (bl2) {
            NB0 nB0 = new NB0(this, (Context)object, (FB0)((Object)object8), (JSONArray)object2);
            ((tu1_1)object9).g((FB0)((Object)object8), nB0);
            return;
        }
        bl2 = false;
        Object var6_9 = null;
        ((tu1_1)object9).n((Context)object, (FB0)((Object)object8), (JSONArray)object2, null);
    }

    public final void b0(Context context, FB0 fB0) {
        a a2 = jh_1.a(this.d).b();
        EventQueueManager$a eventQueueManager$a = new EventQueueManager$a(this, fB0, context);
        a2.c("CommsManager#flushQueueAsync", eventQueueManager$a);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c0(Context var1_1, JSONObject var2_2, int var3_3) {
        block52: {
            block53: {
                block51: {
                    block46: {
                        var4_4 = this;
                        var5_5 = var2_2;
                        var6_10 = var3_3;
                        var7_11 = "evtData";
                        var8_12 = "Items";
                        var9_13 = this.q;
                        var10_14 /* !! */  = "evtName";
                        var11_15 = this.h;
                        var11_15.getClass();
                        try {
                            var12_16 = var2_2.getString((String)var10_14 /* !! */ );
                        }
                        catch (JSONException v0) {
                            var12_16 = null;
                        }
                        var13_17 = var4_4.c;
                        var13_17.getClass();
                        var14_18 = 4;
                        if (var6_10 == var14_18) {
                            var15_19 = "UserEventLog: Inserting EventLog for event ";
                            var16_20 = "UserEventLog: Updating EventLog for event ";
                            var17_21 = "UserEventLog: Persisting EventLog for event ";
                            var18_22 = var4_4.i;
                            if (var12_16 == null) {
                                var18_22.getClass();
                            } else {
                                var19_23 = var18_22.b;
                                var20_24 = var19_23.b();
                                var19_23 = var19_23.a;
                                try {
                                    var17_21 = var17_21.concat((String)var12_16);
                                    var20_24.b((String)var19_23, (String)var17_21);
                                    var21_25 = var18_22.g((String)var12_16);
                                    if (var21_25 != 0) {
                                        var15_19 = var16_20.concat((String)var12_16);
                                        var20_24.b((String)var19_23, var15_19);
                                        var18_22.l((String)var12_16);
                                    } else {
                                        var15_19 = var15_19.concat((String)var12_16);
                                        var20_24.b((String)var19_23, var15_19);
                                        var18_22.f((String)var12_16);
                                    }
                                }
                                catch (Throwable v1) {
                                    var15_19 = "UserEventLog: Failed to insert user event log: for event";
                                    var15_19.concat((String)var12_16);
                                    var20_24.getClass();
                                    com.clevertap.android.sdk.b.m();
                                }
                            }
                        }
                        try {
                            var22_26 = var5_5.has((String)var10_14 /* !! */ );
                            if (!var22_26 || !(var22_26 = (var20_24 = var5_5.getString((String)var10_14 /* !! */ )).equals(var15_19 = "Charged"))) break block46;
                            var23_27 = var9_13.l;
                        }
                        catch (JSONException v2) {}
                        try {
                            var9_13 = var5_5.getJSONObject((String)var7_11);
                            var9_13 = var9_13.remove((String)var8_12);
                            var10_14 /* !! */  = var5_5.getJSONObject((String)var7_11);
                            var10_14 /* !! */  = wm1_1.c(var10_14 /* !! */ );
                            var11_15 = var5_5.getJSONObject((String)var7_11);
                            var11_15.put((String)var8_12, (Object)var9_13);
                        }
                        catch (JSONException v3) {
                            var10_14 /* !! */  = new HashMap();
                        }
                        try {
                            var5_5 = var5_5.getJSONObject((String)var7_11);
                            var5_5 = var5_5.getJSONArray(var8_12);
                            var5_5 = wm1_1.a((JSONArray)var5_5);
                        }
                        catch (JSONException v4) {
                            var5_5 = new ArrayList();
                        }
                        var13_17 = var5_5;
                        var12_16 = wm1_1.c(var23_27.f.d());
                        var12_16.putAll(var10_14 /* !! */ );
                        var5_5 = var23_27.g;
                        var5_5.getClass();
                        Intrinsics.checkNotNullParameter(var12_16, "details");
                        Intrinsics.checkNotNullParameter(var13_17, "items");
                        var20_24 = "Charged";
                        var15_19 = null;
                        var24_31 = 16;
                        var11_15 = var7_11;
                        var7_11 = new bb0_0((String)var20_24, (HashMap)var12_16, (ArrayList)var13_17, null, var24_31);
                        var7_11 = kotlin.collections.a.b(var7_11);
                        var5_5.e((List)var7_11);
                        var5_5 = var5_5.d((List)var7_11);
                        var25_33 = var5_5.length();
                        if (var25_33 <= 0) return;
                        var23_27.e((JSONArray)var5_5);
                        return;
                    }
                    if ((var25_34 = tu1_1.h(var1_1)) == 0 && (var25_34 = (int)var5_5.has((String)var10_14 /* !! */ )) != 0) {
                        var23_28 = var9_13.l;
                        var5_5 = KB0.a(var2_2);
                        var23_28.l((String)var12_16, (HashMap)var5_5);
                        return;
                    }
                    var25_34 = 3;
                    if (var6_10 != var25_34) break block51;
                    var23_29 = new HashMap();
                    var8_12 = new HashMap();
                    var10_14 /* !! */  = var5_5.optJSONObject("profile");
                    if (var10_14 /* !! */  == null) break block52;
                    break block53;
                }
                try {
                    var6_10 = (int)var5_5.has((String)var10_14 /* !! */ );
                    if (var6_10 != 0 && (var6_10 = (int)(var23_30 = var5_5.getString((String)var10_14 /* !! */ )).equals(var7_11 = "App Launched")) != 0) {
                        return;
                    }
                }
                catch (JSONException v5) {}
                if ((var6_10 = (int)var5_5.has((String)var10_14 /* !! */ )) == 0) return;
                var23_30 = var9_13.l;
                var5_5 = KB0.a(var2_2);
                var23_30.l((String)var12_16, (HashMap)var5_5);
                return;
            }
            var20_24 = var10_14 /* !! */ .keys();
            while (true) {
                block48: {
                    block57: {
                        block50: {
                            block49: {
                                block54: {
                                    block56: {
                                        block55: {
                                            block47: {
                                                var26_35 = var20_24.hasNext();
                                                var12_16 = var11_15.d;
                                                if (!var26_35) break;
                                                var5_5 = var20_24.next();
                                                var15_19 = var5_5;
                                                var15_19 = (String)var5_5;
                                                try {
                                                    var5_5 = q50_0.f;
                                                    var26_35 = var5_5.contains(var15_19);
                                                    if (var26_35) continue;
                                                    var5_5 = var12_16.d(var15_19);
                                                }
                                                catch (JSONException var5_9) {}
                                                var12_16 = var10_14 /* !! */ .get(var15_19);
                                                var24_32 = var12_16 instanceof JSONObject;
                                                if (!var24_32) break block54;
                                                var16_20 = var12_16;
                                                var16_20 = (JSONObject)var12_16;
                                                var17_21 = var16_20.keys();
                                                var17_21 = var17_21.next();
                                                var17_21 = (String)var17_21;
                                                var27_36 = var17_21.hashCode();
                                                var28_37 = 1;
                                                var14_18 = 2;
                                                switch (var27_36) {
                                                    default: {
                                                        break;
                                                    }
                                                    case 950750632: {
                                                        var18_22 = "$remove";
                                                        try {
                                                            var27_36 = (int)var17_21.equals(var18_22);
                                                            if (var27_36 == 0) break;
                                                            var27_36 = 5;
                                                            break block47;
                                                        }
                                                        catch (JSONException var5_6) {
                                                            var25_34 = 3;
                                                            var14_18 = 4;
                                                            break block48;
                                                        }
                                                    }
                                                    case 549903055: {
                                                        var18_22 = "$delete";
                                                        var27_36 = (int)var17_21.equals(var18_22);
                                                        if (var27_36 == 0) break;
                                                        var27_36 = 2;
                                                        break block47;
                                                    }
                                                    case 36483704: {
                                                        var18_22 = "$incr";
                                                        var27_36 = (int)var17_21.equals(var18_22);
                                                        if (var27_36 == 0) break;
                                                        var27_36 = 0;
                                                        var18_22 = null;
                                                        break block47;
                                                    }
                                                    case 36326100: {
                                                        var18_22 = "$decr";
                                                        var27_36 = (int)var17_21.equals(var18_22);
                                                        if (var27_36 == 0) break;
                                                        var27_36 = 1;
                                                        break block47;
                                                    }
                                                    case 1186238: {
                                                        var18_22 = "$set";
                                                        var27_36 = (int)var17_21.equals(var18_22);
                                                        if (var27_36 == 0) break;
                                                        var27_36 = 3;
                                                        break block47;
                                                    }
                                                    case 1168893: {
                                                        var18_22 = "$add";
                                                        var27_36 = (int)var17_21.equals(var18_22);
                                                        if (var27_36 == 0) break;
                                                        var27_36 = 4;
                                                        break block47;
                                                    }
                                                }
                                                var27_36 = -1;
                                            }
                                            var7_11 = var11_15.e;
                                            if (var27_36 == 0 || var27_36 == var28_37) ** GOTO lbl217
                                            if (var27_36 == var14_18) ** GOTO lbl214
                                            var14_18 = 3;
                                            if (var27_36 == var14_18) break block55;
                                            var14_18 = 4;
                                            if (var27_36 == var14_18 || var27_36 == (var28_37 = 5)) break block56;
                                            break block49;
                                        }
                                        var14_18 = 4;
                                    }
                                    var12_16 = var16_20.get((String)var17_21);
                                    var12_16 = (JSONArray)var12_16;
                                    var12_16 = var7_11.c(var15_19, (JSONArray)var12_16, (String)var17_21, var5_5);
                                    break block49;
lbl214:
                                    // 1 sources

                                    var14_18 = 4;
                                    var12_16 = null;
                                    break block49;
lbl217:
                                    // 1 sources

                                    var14_18 = 4;
                                    var12_16 = var16_20.get((String)var17_21);
                                    var12_16 = (Number)var12_16;
                                    var16_20 = var5_5;
                                    var16_20 = (Number)var5_5;
                                    var7_11.getClass();
                                    var12_16 = lb2_0.b((Number)var12_16, (String)var17_21, (Number)var16_20);
                                    break block49;
                                    catch (JSONException var5_8) {
                                        var14_18 = 4;
                                        ** GOTO lbl-1000
                                    }
                                }
                                var25_34 = var12_16 instanceof String;
                                if (var25_34 == 0) break block49;
                                var7_11 = var12_16;
                                try {
                                    var7_11 = (String)var12_16;
                                    var16_20 = "$D_";
                                    var25_34 = (int)var7_11.startsWith((String)var16_20);
                                    if (var25_34 == 0) break block49;
                                    var12_16 = (String)var12_16;
                                    var25_34 = 3;
                                    break block50;
                                }
                                catch (JSONException var5_7) lbl-1000:
                                // 2 sources

                                {
                                    var25_34 = 3;
                                }
                                break block48;
                            }
                            var25_34 = 3;
                            ** GOTO lbl252
                        }
                        var12_16 = var12_16.substring(var25_34);
                        var29_38 = Long.parseLong((String)var12_16);
                        var12_16 = var29_38;
lbl252:
                        // 2 sources

                        var16_20 = new HashMap();
                        if (var5_5 != null && (var21_25 = var5_5 instanceof JSONArray) == 0) {
                            var17_21 = "oldValue";
                            var16_20.put(var17_21, var5_5);
                        }
                        if (var12_16 == null || (var26_35 = var12_16 instanceof JSONArray)) break block57;
                        var5_5 = "newValue";
                        var16_20.put(var5_5, var12_16);
                        break block48;
                    }
                    if (!(var26_35 = var16_20.isEmpty())) {
                        var23_29.put(var15_19, var16_20);
                    }
                    var8_12.put(var15_19, var12_16);
                    continue;
                }
                var12_16 = var11_15.b.b();
                var17_21 = "Error getting user attribute changes for key: ";
                var16_20 = new StringBuilder((String)var17_21);
                var16_20.append(var15_19);
                var16_20.append(var5_5);
                var5_5 = var16_20.toString();
                var12_16.getClass();
                com.clevertap.android.sdk.b.f((String)var5_5);
            }
            var12_16.k((HashMap)var8_12);
        }
        var5_5 = var9_13.l;
        var7_11 = wm1_1.c(var5_5.f.d());
        var8_12 = var5_5.g;
        var8_12.getClass();
        Intrinsics.checkNotNullParameter(var23_29, "eventProperties");
        Intrinsics.checkNotNullParameter(var7_11, "appFields");
        var31_39 = var23_29.size();
        var9_13 = new ArrayList<Object>(var31_39);
        var23_29 = var23_29.entrySet().iterator();
        while (true) {
            if ((var31_39 = (int)var23_29.hasNext()) == 0) {
                var8_12.e(var9_13);
                var23_29 = var8_12.d(var9_13);
                var25_34 = var23_29.length();
                if (var25_34 <= 0) return;
                var5_5.e((JSONArray)var23_29);
                return;
            }
            var10_14 /* !! */  = (Map.Entry)var23_29.next();
            var13_17 = fh1_2.q((Map)var10_14 /* !! */ .getValue());
            var13_17.putAll(var7_11);
            var20_24 = new StringBuilder();
            var12_16 = (String)var10_14 /* !! */ .getKey();
            var12_16 = h30_0.a((StringBuilder)var20_24, (String)var12_16, "_CTUserAttributeChange");
            var10_14 /* !! */  = var10_14 /* !! */ .getKey();
            var16_20 = var10_14 /* !! */ ;
            var16_20 = (String)var10_14 /* !! */ ;
            var15_19 = null;
            var21_25 = 4;
            var20_24 = var11_15;
            var11_15 = new bb0_0((String)var12_16, (HashMap)var13_17, null, (String)var16_20, var21_25);
            var9_13.add(var11_15);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d0(Context object, JSONObject jSONObject, int n3) {
        Object object2 = this.f.a;
        synchronized (object2) {
            Object object3;
            Object object4;
            int n4;
            block16: {
                int n7;
                Object object5;
                int n8;
                n4 = E80.w;
                int n10 = 1;
                if (n4 == 0) {
                    E80.w = n10;
                }
                n4 = 3;
                if (n3 == n10) {
                    object4 = "page";
                } else {
                    n8 = 2;
                    if (n3 == n8) {
                        object3 = "ping";
                        EventQueueManager.a0((Context)object, jSONObject);
                        object5 = "bk";
                        n7 = jSONObject.has((String)object5);
                        if (n7 != 0) {
                            object5 = this.c;
                            ((E80)object5).j = n10;
                            object5 = "bk";
                            jSONObject.remove((String)object5);
                        }
                        object5 = this.c;
                        n7 = ((E80)object5).k;
                        if (n7 != 0) {
                            object5 = "gf";
                            jSONObject.put((String)object5, n10 != 0);
                            object4 = this.c;
                            n7 = 0;
                            object5 = null;
                            ((E80)object4).k = false;
                            String string2 = "gfSDKVersion";
                            n10 = ((E80)object4).h;
                            jSONObject.put(string2, n10);
                            object4 = this.c;
                            ((E80)object4).h = 0;
                        }
                        object4 = object3;
                    } else {
                        object4 = n3 == n4 ? "profile" : (n3 == (n10 = 5) ? "data" : "event");
                    }
                }
                object3 = this.c;
                object3.getClass();
                object3 = this.c;
                n8 = ((E80)object3).d;
                object5 = "s";
                jSONObject.put((String)object5, n8);
                object3 = "pg";
                n7 = E80.w;
                jSONObject.put((String)object3, n7);
                object3 = "type";
                jSONObject.put((String)object3, object4);
                object4 = "ep";
                long l2 = System.currentTimeMillis();
                long l3 = 1000L;
                n7 = (int)(l2 /= l3);
                jSONObject.put((String)object4, n7);
                object4 = "f";
                object3 = this.c;
                n8 = (int)(((E80)object3).g ? 1 : 0);
                jSONObject.put((String)object4, n8 != 0);
                object4 = "lsl";
                object3 = this.c;
                n8 = ((E80)object3).m;
                jSONObject.put((String)object4, n8);
                object4 = "type";
                try {
                    object4 = jSONObject.getString((String)object4);
                    object3 = "event";
                    n10 = (int)(((String)object3).equals(object4) ? 1 : 0);
                    if (n10 == 0) break block16;
                    object4 = "App Launched";
                    object3 = "evtName";
                    n10 = (int)(((String)object4).equals(object3 = jSONObject.getString((String)object3)) ? 1 : 0);
                    if (n10 != 0) {
                        object4 = "pai";
                        object3 = object.getPackageName();
                        jSONObject.put((String)object4, object3);
                    }
                }
                catch (Throwable throwable) {}
            }
            try {
                object4 = this.o;
                object4 = ((ea3_1)object4).a();
                if (object4 != null) {
                    object3 = "wzrk_error";
                    object4 = si_2.b((da3_1)object4);
                    jSONObject.put((String)object3, object4);
                }
                object4 = this.i;
                ((LocalDataStore)object4).i(jSONObject);
                object4 = this.b;
                object4.getClass();
                object3 = "context";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object3 = "event";
                Intrinsics.checkNotNullParameter(jSONObject, (String)object3);
                ci3_1 ci3_12 = n3 == n4 ? ci3_1.PROFILE_EVENTS : ci3_1.EVENTS;
                ((Nh0)object4).d((Context)object, jSONObject, ci3_12);
                this.c0((Context)object, jSONObject, n3);
                this.e0((Context)object);
            }
            catch (Throwable throwable) {
                object = this.d;
                object = ((CleverTapInstanceConfig)object).b();
                Object object6 = this.d;
                object6 = ((CleverTapInstanceConfig)object6).a;
                jSONObject.toString();
                object.getClass();
                com.clevertap.android.sdk.b.m();
            }
            return;
        }
    }

    public final void e0(Context object) {
        Object object2 = this.a;
        if (object2 == null) {
            this.a = object2 = new EventQueueManager$5(this, (Context)object);
        }
        object = this.a;
        object2 = this.l;
        object2.removeCallbacks((Runnable)object);
        object = this.a;
        Object object3 = this.m;
        Object object4 = ((tu1_1)object3).c;
        CharSequence charSequence = ((CleverTapInstanceConfig)object4).a;
        charSequence = new StringBuilder("Network retry #");
        int n3 = ((tu1_1)object3).l;
        ((StringBuilder)charSequence).append(n3);
        charSequence = ((StringBuilder)charSequence).toString();
        Object object5 = ((tu1_1)object3).j;
        object5.getClass();
        com.clevertap.android.sdk.b.f((String)charSequence);
        int n4 = ((tu1_1)object3).l;
        n3 = 10;
        int n7 = 1000;
        if (n4 < n3) {
            object4 = new StringBuilder("Failure count is ");
            n4 = ((tu1_1)object3).l;
            ((StringBuilder)object4).append(n4);
            charSequence = ". Setting delay frequency to 1s";
            ((StringBuilder)object4).append((String)charSequence);
            object4 = ((StringBuilder)object4).toString();
            com.clevertap.android.sdk.b.f((String)object4);
            ((tu1_1)object3).o = n7;
        } else {
            object4 = ((CleverTapInstanceConfig)object4).b;
            if (object4 == null) {
                object3 = "Setting delay frequency to 1s";
                com.clevertap.android.sdk.b.f((String)object3);
            } else {
                object4 = new SecureRandom();
                int n8 = (((Random)object4).nextInt(n3) + 1) * 1000;
                ((tu1_1)object3).o = n4 = ((tu1_1)object3).o + n8;
                n8 = 600000;
                object5 = "Setting delay frequency to ";
                if (n4 < n8) {
                    object4 = new StringBuilder((String)object5);
                    n4 = ((tu1_1)object3).o;
                    ((StringBuilder)object4).append(n4);
                    object4 = ((StringBuilder)object4).toString();
                    com.clevertap.android.sdk.b.f((String)object4);
                    n7 = ((tu1_1)object3).o;
                } else {
                    ((tu1_1)object3).o = n7;
                    object4 = new StringBuilder((String)object5);
                    n4 = ((tu1_1)object3).o;
                    ((StringBuilder)object4).append(n4);
                    object4 = ((StringBuilder)object4).toString();
                    com.clevertap.android.sdk.b.f((String)object4);
                    n7 = ((tu1_1)object3).o;
                }
            }
        }
        long l2 = n7;
        object2.postDelayed((Runnable)object, l2);
        object = this.d.a;
        this.j.b((String)object, "Scheduling delayed queue flush on main event loop");
    }
}


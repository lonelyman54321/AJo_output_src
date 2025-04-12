/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Bundle
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.events.EventQueueManager;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.task.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class we
extends i0_0 {
    public final ti_0 a;
    public final HashMap b;
    public final k0_0 c;
    public final tf_0 d;
    public final CleverTapInstanceConfig e;
    public final Context f;
    public final l80_0 g;
    public final E80 h;
    public final mp0_0 i;
    public final ea3_1 j;
    public final ha3_1 k;
    public final qg1_1 l;
    public final uv_0 m;
    public final Object n;
    public final HashMap o;
    public final HashMap p;

    public we(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, EventQueueManager eventQueueManager, ha3_1 ha3_12, ea3_1 ea3_12, E80 e80, mp0_0 mp0_02, ck_1 ck_12, l80_0 l80_02, ti_0 ti_02, qg1_1 qg1_12) {
        UV$a$a uV$a$a = UV$a.a;
        HashMap hashMap = new HashMap(8);
        this.b = hashMap;
        hashMap = new HashMap();
        this.n = hashMap;
        this.o = hashMap = new HashMap();
        this.p = hashMap = new HashMap();
        this.f = context;
        this.e = cleverTapInstanceConfig;
        this.c = eventQueueManager;
        this.k = ha3_12;
        this.j = ea3_12;
        this.h = e80;
        this.i = mp0_02;
        this.d = ck_12;
        this.a = ti_02;
        this.g = l80_02;
        this.l = qg1_12;
        this.m = uV$a$a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void S(we object, ArrayList object2, String string2, String string3) {
        int n3;
        Object object3;
        object.getClass();
        if (string2 == null) {
            return;
        }
        boolean bl2 = ((ArrayList)object2).isEmpty();
        if (bl2) {
            ((we)object).R(string2);
            return;
        }
        ((we)object).k.getClass();
        Object object4 = ha3_1.c(string2);
        Object object5 = (String[])((da3_1)object4).c;
        String string4 = null;
        int n4 = 523;
        try {
            object3 = ha3$a_0.valueOf((String)object5);
            if (object3 != null) {
                object5 = new String[]{object5};
                int n7 = 24;
                object5 = zB1.a((String[])object5, n4, n7);
                ((da3_1)object4).b = object3 = ((da3_1)object5).b;
                ((da3_1)object4).a = n3 = ((da3_1)object5).a;
                ((da3_1)object4).c = null;
            }
        }
        catch (Throwable throwable) {}
        n3 = ((da3_1)object4).a;
        object3 = ((we)object).j;
        if (n3 != 0) {
            ((ea3_1)object3).b((da3_1)object4);
        }
        if ((object4 = ((da3_1)object4).c) != null) {
            string4 = object4.toString();
        }
        object4 = ((we)object).e;
        if (string4 != null && (n3 = (int)(string4.isEmpty() ? 1 : 0)) == 0) {
            string2 = "Constructed multi-value profile push: ";
            try {
                object5 = new JSONObject();
                JSONArray jSONArray = new JSONArray((Collection)object2);
                object5.put(string3, (Object)jSONArray);
                object2 = new JSONObject();
                object2.put(string4, object5);
                object = ((we)object).c;
                string3 = null;
                ((k0_0)object).W((JSONObject)object2, false);
                object = ((CleverTapInstanceConfig)object4).b();
                string3 = ((CleverTapInstanceConfig)object4).a;
                object5 = new StringBuilder(string2);
                ((StringBuilder)object5).append(object2);
                object2 = ((StringBuilder)object5).toString();
                ((b)object).b(string3, (String)object2);
                return;
            }
            catch (Throwable throwable) {
                object = ((CleverTapInstanceConfig)object4).b();
                object2 = "Error pushing multiValue for key ";
                ((String)object2).concat(string4);
                object.getClass();
                com.clevertap.android.sdk.b.m();
                return;
            }
        }
        int n8 = 23;
        object = zB1.a(new String[]{string2}, n4, n8);
        ((ea3_1)object3).b((da3_1)object);
        object = ((CleverTapInstanceConfig)object4).b();
        string3 = "Invalid multi-value property key ";
        object2 = new StringBuilder(string3);
        ((StringBuilder)object2).append(string2);
        string2 = " profile multi value operation aborted";
        ((StringBuilder)object2).append(string2);
        object2 = ((StringBuilder)object2).toString();
        object.getClass();
        com.clevertap.android.sdk.b.f((String)object2);
    }

    /*
     * Exception decompiling
     */
    public static JSONObject T(we var0, JSONObject var1_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static String V(Bundle object) {
        Object object2 = object.get("wzrk_dd");
        boolean bl2 = false;
        String string2 = null;
        if (object2 != null) {
            boolean bl3 = object2 instanceof String;
            if (bl3) {
                string2 = "true";
                Object object3 = object2;
                object3 = (String)object2;
                bl2 = string2.equalsIgnoreCase((String)object3);
            }
            if (bl3 = object2 instanceof Boolean) {
                object2 = (Boolean)object2;
                bl2 = (Boolean)object2;
            }
        }
        if (bl2) {
            object2 = "wzrk_pid";
            object = object.getString((String)object2);
        } else {
            object2 = "wzrk_id";
            object = object.getString((String)object2);
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void I() {
        String string2;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.e;
        boolean bl2 = cleverTapInstanceConfig.h;
        if (bl2) {
            return;
        }
        cleverTapInstanceConfig = new JSONObject();
        JSONObject jSONObject = new JSONObject();
        Object object = "t";
        int n3 = 1;
        try {
            jSONObject.put((String)object, n3);
            object = "evtName";
            string2 = "wzrk_fetch";
            cleverTapInstanceConfig.put((String)object, string2);
            object = "evtData";
            cleverTapInstanceConfig.put((String)object, jSONObject);
        }
        catch (JSONException jSONException) {}
        object = this.c;
        string2 = this.f;
        ((k0_0)object).Y((Context)string2, (JSONObject)cleverTapInstanceConfig, 7);
    }

    /*
     * Unable to fully structure code
     */
    public final void Q(Double var1_1, String var2_2, String var3_3) {
        block27: {
            block26: {
                var4_4 = this.e;
                if (var2_2 == null) break block27;
                var5_5 = this.k;
                var5_5.getClass();
                var2_2 = ha3_1.c((String)var2_2);
                var5_5 = var2_2.c;
                var5_5 = var5_5.toString();
                var6_6 = var5_5.isEmpty();
                var7_7 = 512;
                var8_8 = this.j;
                if (var6_6 == 0) ** GOTO lbl33
                var1_1 = new String[]{var5_5};
                var9_9 = 2;
                var1_1 = zB1.a((String[])var1_1, var7_7, var9_9);
                var8_8.b((da3_1)var1_1);
                var2_2 = var4_4.b();
                var1_1 = var1_1.b;
                var2_2.getClass();
                com.clevertap.android.sdk.b.f((String)var1_1);
                return;
lbl33:
                // 1 sources

                var6_6 = var1_1.intValue();
                if (var6_6 < 0) ** GOTO lbl65
                var10_11 = var1_1.doubleValue();
                var12_12 = 0.0;
                var6_6 = (int)(var10_11 == var12_12 ? 0 : (var10_11 < var12_12 ? -1 : 1));
                if (var6_6 < 0) ** GOTO lbl65
                var14_13 = var1_1.floatValue();
                cfr_temp_0 = var14_13 - 0.0f;
                var6_6 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                if (var6_6 < 0) ** GOTO lbl65
                var6_6 = var2_2.a;
                if (var6_6 == 0) break block26;
                var8_8.b((da3_1)var2_2);
            }
            var2_2 = new JSONObject();
            var1_1 = var2_2.put(var3_3, var1_1);
            var2_2 = new JSONObject();
            var1_1 = var2_2.put((String)var5_5, var1_1);
            var2_2 = this.c;
            var3_3 = null;
            var2_2.W((JSONObject)var1_1, false);
            break block27;
lbl65:
            // 3 sources

            var1_1 = new String[]{var5_5};
            var9_10 = 25;
            var1_1 = zB1.a((String[])var1_1, var7_7, var9_10);
            var8_8.b((da3_1)var1_1);
            var2_2 = var4_4.b();
            var1_1 = var1_1.b;
            try {
                var2_2.getClass();
                com.clevertap.android.sdk.b.f((String)var1_1);
                return;
            }
            catch (Throwable v0) {
                var1_1 = var4_4.b();
                var1_1.getClass();
                com.clevertap.android.sdk.b.m();
            }
        }
    }

    public final void R(String object) {
        object = zB1.a(new String[]{object}, 512, 1);
        this.j.b((da3_1)object);
        b b2 = this.e.b();
        object = ((da3_1)object).b;
        b2.getClass();
        com.clevertap.android.sdk.b.f((String)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean U(String string2, HashMap hashMap, int n3) {
        Object object = this.n;
        synchronized (object) {
            long l2;
            boolean bl2;
            block6: {
                long l3;
                bl2 = false;
                try {
                    uv_0 uv_02 = this.m;
                    l2 = uv_02.currentTimeMillis();
                    boolean bl3 = hashMap.containsKey(string2);
                    if (!bl3) break block6;
                    Object object2 = hashMap.get(string2);
                    object2 = (Long)object2;
                    l3 = (Long)object2;
                }
                catch (Throwable throwable) {}
                long l4 = n3;
                long l7 = (l3 = l2 - l3) - l4;
                if ((n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1))) < 0) {
                    bl2 = true;
                }
            }
            Long l8 = l2;
            hashMap.put(string2, l8);
            return bl2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void W() {
        Object object = this.e;
        boolean bl2 = ((CleverTapInstanceConfig)object).m;
        boolean bl3 = true;
        E80 e80 = this.h;
        if (bl2) {
            e80.i(bl3);
            ((CleverTapInstanceConfig)object).b().getClass();
            com.clevertap.android.sdk.b.f("App Launched Events disabled in the Android Manifest file");
            return;
        }
        bl2 = e80.h();
        if (bl2) {
            b b2 = ((CleverTapInstanceConfig)object).b();
            object = ((CleverTapInstanceConfig)object).a;
            b2.b((String)object, "App Launched has already been triggered. Will not trigger it ");
            return;
        }
        Object object2 = ((CleverTapInstanceConfig)object).b();
        object = ((CleverTapInstanceConfig)object).a;
        String string2 = "Firing App Launched event";
        ((b)object2).b((String)object, string2);
        e80.i(bl3);
        object = new JSONObject();
        object2 = "evtName";
        Object object3 = "App Launched";
        try {
            object.put((String)object2, object3);
            object2 = "evtData";
            object3 = this.i;
            object3 = ((mp0_0)object3).d();
            object.put((String)object2, object3);
        }
        catch (Throwable throwable) {}
        object3 = this.c;
        e80 = this.f;
        ((k0_0)object3).Y((Context)e80, (JSONObject)object, 4);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void X(boolean bl2, Uri object) {
        synchronized (this) {
            block15: {
                String string2;
                int n3;
                Object object2;
                Object object3;
                block14: {
                    boolean bl3;
                    Object object4;
                    int n4;
                    block13: {
                        if (object == null) {
                            return;
                        }
                        object3 = Yw3.b(object);
                        object2 = "us";
                        n4 = object3.has((String)object2);
                        if (n4 != 0) {
                            object2 = this.h;
                            object4 = "us";
                            object4 = object3.get((String)object4);
                            object4 = object4.toString();
                            ((E80)object2).m((String)object4);
                        }
                        if ((n4 = object3.has((String)(object2 = "um"))) != 0) {
                            object2 = this.h;
                            object4 = "um";
                            object4 = object3.get((String)object4);
                            object4 = object4.toString();
                            ((E80)object2).l((String)object4);
                        }
                        if ((n4 = object3.has((String)(object2 = "uc"))) != 0) {
                            object2 = this.h;
                            object4 = "uc";
                            object4 = object3.get((String)object4);
                            object4 = object4.toString();
                            ((E80)object2).j((String)object4);
                        }
                        object2 = "referrer";
                        object = object.toString();
                        object3.put((String)object2, object);
                        n3 = 1;
                        if (!bl2) break block13;
                        string2 = "install";
                        object3.put(string2, n3 != 0);
                    }
                    try {
                        string2 = new JSONObject();
                        n4 = object3.length();
                        if (n4 <= 0) break block14;
                        object2 = object3.keys();
                    }
                    catch (Throwable throwable) {
                        break block15;
                    }
                    while (bl3 = object2.hasNext()) {
                        try {
                            object4 = object2.next();
                            object4 = (String)object4;
                            String string3 = object3.getString((String)object4);
                            string2.put((String)object4, (Object)string3);
                        }
                        catch (ClassCastException classCastException) {}
                    }
                    break block14;
                    catch (Throwable throwable) {
                        Object object5 = this.e;
                        object5 = ((CleverTapInstanceConfig)object5).b();
                        object = this.e;
                        object = object.a;
                        object5.getClass();
                        com.clevertap.android.sdk.b.m();
                    }
                    break block15;
                }
                object3 = this.c;
                object2 = this.f;
                ((k0_0)object3).Y((Context)object2, (JSONObject)string2, n3);
            }
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Y(boolean var1_1, CTInAppNotification var2_2, Bundle var3_3) {
        var4_4 = new JSONObject();
        try {
            var5_5 = new JSONObject();
            var2_2 = var2_2.v;
            var6_6 = var2_2.keys();
            while (var7_7 = var6_6.hasNext()) {
                var8_8 = var6_6.next();
                var9_9 = "wzrk_";
                var10_10 = (var8_8 = (String)var8_8).startsWith((String)var9_9);
                if (!var10_10) continue;
                var9_9 = var2_2.get((String)var8_8);
                var5_5.put((String)var8_8, var9_9);
            }
            if (var3_3 != null) {
                var2_2 = var3_3.keySet();
                var2_2 = var2_2.iterator();
                while (var11_11 = var2_2.hasNext()) {
                    var6_6 = var2_2.next();
                    var8_8 = var3_3.get((String)(var6_6 = (String)var6_6));
                    if (var8_8 == null) continue;
                    var5_5.put((String)var6_6, var8_8);
                }
            }
            var2_2 = "evtName";
            if (var1_1) {
            }
            ** GOTO lbl41
        }
        catch (Throwable v0) {
            return;
        }
        var12_12 = this.h;
        var12_12.n(var5_5);
lbl34:
        // 2 sources

        while (true) {
            var12_12 = "Notification Clicked";
            break;
        }
        {
            block10: {
                catch (Throwable v1) {
                    ** continue;
                }
                {
                    var4_4.put((String)var2_2, var12_12);
                    break block10;
                }
lbl41:
                // 1 sources

                var12_12 = "Notification Viewed";
                var4_4.put((String)var2_2, var12_12);
            }
            var12_12 = "evtData";
            var4_4.put((String)var12_12, (Object)var5_5);
            var12_12 = this.c;
            var2_2 = this.f;
            var13_13 = 4;
            var12_12.Y((Context)var2_2, var4_4, var13_13);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Z(boolean var1_1, CTInboxMessage var2_2, Bundle var3_3) {
        var4_4 = new JSONObject();
        try {
            var2_2 = var2_2.q;
            if (var2_2 == null) {
                var2_2 = new JSONObject();
            }
            if (var3_3 /* !! */  != null) {
                var5_5 = var3_3 /* !! */ .keySet();
                var5_5 = var5_5.iterator();
                while (var6_6 = var5_5.hasNext()) {
                    var7_7 /* !! */  = var5_5.next();
                    var8_8 = var3_3 /* !! */ .get(var7_7 /* !! */  = (String)var7_7 /* !! */ );
                    if (var8_8 == null) continue;
                    var2_2.put((String)var7_7 /* !! */ , var8_8);
                }
            }
            var3_3 /* !! */  = "evtName";
            if (var1_1) {
            }
            ** GOTO lbl32
        }
        catch (Throwable v0) {
            return;
        }
        var9_9 = this.h;
        var9_9.n((JSONObject)var2_2);
lbl25:
        // 2 sources

        while (true) {
            var9_9 = "Notification Clicked";
            break;
        }
        {
            block10: {
                catch (Throwable v1) {
                    ** continue;
                }
                {
                    var4_4.put((String)var3_3 /* !! */ , var9_9);
                    break block10;
                }
lbl32:
                // 1 sources

                var9_9 = "Notification Viewed";
                var4_4.put((String)var3_3 /* !! */ , var9_9);
            }
            var9_9 = "evtData";
            var4_4.put((String)var9_9, (Object)var2_2);
            var9_9 = this.c;
            var2_2 = this.f;
            var10_10 = 4;
            var9_9.Y((Context)var2_2, var4_4, var10_10);
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void a0(String var1_1) {
        block21: {
            var2_2 = this.e;
            var3_3 = "wzrk://track?install=true&";
            var4_4 = "Referrer received: ";
            try {
                var5_5 = var2_2.b();
            }
lbl6:
            // 18 sources

            catch (Throwable v0) {
                ** continue;
            }
            var6_6 = var2_2.a;
            var7_7 = new StringBuilder((String)var4_4);
            var7_7.append((String)var1_1);
            var4_4 = var7_7.toString();
            var5_5.b((String)var6_6, (String)var4_4);
            if (var1_1 != null) break block21;
            return;
        }
        var8_8 = System.currentTimeMillis();
        var10_9 = 1000L;
        ** try [egrp 7[TRYBLOCK] [8 : 78->81)] { 
lbl25:
        // 1 sources

        var12_10 = (int)(var8_8 /= var10_9);
        var4_4 = this.b;
        var13_11 = var4_4.containsKey(var1_1);
        if (var13_11 == 0) ** GOTO lbl47
        var6_6 = var4_4.get(var1_1);
        var6_6 = (Integer)var6_6;
        var13_11 = var6_6.intValue();
        var13_11 = var12_10 - var13_11;
        var14_12 = 10;
        if (var13_11 >= var14_12) ** GOTO lbl47
        var1_1 = var2_2.b();
        var2_2 = var2_2.a;
        var3_3 = "Skipping install referrer due to duplicate within 10 seconds";
        var1_1.b((String)var2_2, var3_3);
        return;
lbl47:
        // 2 sources

        var2_2 = var12_10;
        var4_4.put(var1_1, var2_2);
        var1_1 = var3_3.concat((String)var1_1);
        var1_1 = Uri.parse((String)var1_1);
        var15_13 = true;
        this.X(var15_13, (Uri)var1_1);
lbl58:
        // 2 sources

    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b0(Bundle object) {
        tf_0 tf_02;
        String string2;
        int n3;
        Object object2;
        Object object3;
        block18: {
            object3 = this.e;
            boolean bl2 = ((CleverTapInstanceConfig)object3).h;
            if (bl2) {
                ((CleverTapInstanceConfig)object3).b().getClass();
                com.clevertap.android.sdk.b.f("is Analytics Only - will not process Notification Clicked event.");
                return;
            }
            if (object != null && !(bl2 = object.isEmpty()) && (object2 = object.get("wzrk_pn")) != null) {
                boolean bl3;
                bl2 = false;
                object2 = null;
                Object object4 = "wzrk_acct_id";
                try {
                    object4 = object.getString((String)object4);
                }
                catch (Throwable throwable) {
                    n3 = 0;
                    object4 = null;
                }
                if (!(object4 == null && (bl3 = ((CleverTapInstanceConfig)object3).p) || (n3 = (string2 = ((CleverTapInstanceConfig)object3).a).equals(object4)) != 0)) {
                    ((CleverTapInstanceConfig)object3).b().getClass();
                    com.clevertap.android.sdk.b.f("Push notification not targeted at this instance, not processing Notification Clicked Event");
                    return;
                }
                object4 = "wzrk_inapp";
                n3 = object.containsKey((String)object4);
                if (n3 != 0) {
                    object3 = jh_1.a((CleverTapInstanceConfig)object3).b();
                    object2 = new re_0(this, (Bundle)object);
                    ((a)object3).c("testInappNotification", (Callable)object2);
                    return;
                }
                object4 = "wzrk_inbox";
                n3 = object.containsKey((String)object4);
                if (n3 != 0) {
                    object3 = jh_1.a((CleverTapInstanceConfig)object3).b();
                    object2 = new qe_2(this, (Bundle)object);
                    ((a)object3).c("testInboxNotification", (Callable)object2);
                    return;
                }
                object4 = "wzrk_adunit";
                n3 = object.containsKey((String)object4);
                string2 = this.f;
                tf_02 = this.d;
                if (n3 != 0) {
                    try {
                        object4 = new JSONObject();
                        Object object5 = "wzrk_adunit";
                        object = object.getString((String)object5);
                        com.clevertap.android.sdk.b.j();
                        object5 = new JSONArray();
                        String string3 = "adUnit_notifs";
                        object4.put(string3, object5);
                        string3 = new JSONObject((String)object);
                        object5.put((Object)string3);
                        object5 = this.g;
                        tf_02 = (ck_1)tf_02;
                        object = new xr0_1((ck_1)tf_02, (l80_0)object5, (CleverTapInstanceConfig)object3);
                        ((xr0_1)object).a((Context)string2, (JSONObject)object4, null);
                        return;
                    }
                    catch (Throwable throwable) {
                        com.clevertap.android.sdk.b.l();
                    }
                    return;
                }
                object2 = "wzrk_id";
                n3 = object.containsKey((String)object2);
                if (n3 != 0 && (object2 = object.getString((String)object2)) != null) {
                    int n4;
                    object2 = we.V((Bundle)object);
                    bl2 = this.U((String)object2, (HashMap)(object4 = this.o), n4 = 5000);
                    if (bl2) {
                        object3 = ((CleverTapInstanceConfig)object3).b();
                        object2 = new StringBuilder("Already processed Notification Clicked event for ");
                        ((StringBuilder)object2).append(object);
                        ((StringBuilder)object2).append(", dropping duplicate.");
                        object = ((StringBuilder)object2).toString();
                        object3.getClass();
                        com.clevertap.android.sdk.b.f((String)object);
                        return;
                    }
                    object3 = "root";
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    object3 = new JSONObject();
                    object2 = f60.l((Bundle)object);
                    object4 = "evtName";
                    String string4 = "Notification Clicked";
                    object3.put((String)object4, (Object)string4);
                    object4 = "evtData";
                    object3.put((String)object4, object2);
                    break block18;
                } else {
                    object3 = ((CleverTapInstanceConfig)object3).b();
                    object2 = new StringBuilder("Push notification ID Tag is null, not processing Notification Clicked event for:  ");
                    ((StringBuilder)object2).append(object);
                    object = ((StringBuilder)object2).toString();
                    object3.getClass();
                    com.clevertap.android.sdk.b.f((String)object);
                    return;
                }
            }
            ((CleverTapInstanceConfig)object3).b().getClass();
            com.clevertap.android.sdk.b.f("Push notification not from CleverTap - will not process Notification Clicked event.");
            return;
            catch (Throwable throwable) {}
        }
        try {
            object2 = this.c;
            n3 = 4;
            ((k0_0)object2).Y((Context)string2, (JSONObject)object3, n3);
            object3 = this.h;
            object = f60.l((Bundle)object);
            ((E80)object3).n((JSONObject)object);
        }
        catch (Throwable throwable) {}
        tf_02.getClass();
        com.clevertap.android.sdk.b.c();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c0(Bundle object) {
        Object object2;
        Object object3;
        Object object4;
        block6: {
            boolean bl2;
            object4 = this.e;
            if (object != null && !(bl2 = object.isEmpty()) && (object3 = object.get("wzrk_pn")) != null) {
                object3 = "wzrk_id";
                boolean bl3 = object.containsKey((String)object3);
                if (bl3 && (object3 = object.getString((String)object3)) != null) {
                    int n3;
                    object3 = we.V((Bundle)object);
                    bl2 = this.U((String)object3, (HashMap)(object2 = this.p), n3 = 2000);
                    if (bl2) {
                        object4 = ((CleverTapInstanceConfig)object4).b();
                        object3 = new StringBuilder("Already processed Notification Viewed event for ");
                        ((StringBuilder)object3).append(object);
                        ((StringBuilder)object3).append(", dropping duplicate.");
                        object = ((StringBuilder)object3).toString();
                        object4.getClass();
                        com.clevertap.android.sdk.b.f((String)object);
                        return;
                    }
                    object4 = ((CleverTapInstanceConfig)object4).b();
                    object.toString();
                    object4.getClass();
                    com.clevertap.android.sdk.b.e();
                    Intrinsics.checkNotNullParameter(object, "root");
                    object4 = new JSONObject();
                    object = f60.l((Bundle)object);
                    object3 = "evtName";
                    object2 = "Notification Viewed";
                    object4.put((String)object3, object2);
                    object3 = "evtData";
                    object4.put((String)object3, object);
                    break block6;
                } else {
                    object4 = ((CleverTapInstanceConfig)object4).b();
                    object3 = new StringBuilder("Push notification ID Tag is null, not processing Notification Viewed event for:  ");
                    ((StringBuilder)object3).append(object);
                    object = ((StringBuilder)object3).toString();
                    object4.getClass();
                    com.clevertap.android.sdk.b.f((String)object);
                    return;
                }
            }
            object4 = ((CleverTapInstanceConfig)object4).b();
            String string2 = "Push notification: ";
            object3 = new StringBuilder(string2);
            object = object == null ? "NULL" : object.toString();
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append(" not from CleverTap - will not process Notification Viewed event.");
            object = ((StringBuilder)object3).toString();
            object4.getClass();
            com.clevertap.android.sdk.b.f((String)object);
            return;
            catch (Throwable throwable) {}
        }
        object3 = this.c;
        object2 = this.f;
        ((k0_0)object3).Y((Context)object2, (JSONObject)object4, 6);
    }

    public final void d0(HashMap object) {
        Object object2;
        boolean bl2;
        if (object != null && !(bl2 = object.isEmpty()) && (object2 = this.i.f()) != null) {
            object2 = jh_1.a(this.e).b();
            se_0 se_02 = new se_0(this, (HashMap)object);
            object = "profilePush";
            ((a)object2).c((String)object, se_02);
        }
    }
}


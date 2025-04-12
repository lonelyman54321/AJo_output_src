/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences$Editor
 *  org.json.JSONObject
 */
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/*
 * Renamed from kg1
 */
public final class kg1_1 {
    public static final kg1_1 a;

    static {
        kg1_1 kg1_12;
        a = kg1_12 = new kg1_1();
    }

    public static final void c() {
        String string2;
        Context context;
        Class<kg1_1> clazz = kg1_1.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return;
        }
        try {
            context = FacebookSdk.a();
            string2 = "com.facebook.internal.SKU_DETAILS";
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return;
        }
        context = context.getSharedPreferences(string2, 0);
        string2 = FacebookSdk.a();
        String string3 = "com.facebook.internal.PURCHASE";
        string2 = string2.getSharedPreferences(string3, 0);
        context = context.edit();
        context = context.clear();
        context.apply();
        context = string2.edit();
        context = context.clear();
        context.apply();
        context = FacebookSdk.a();
        string2 = "com.facebook.internal.iap.PRODUCT_DETAILS";
        context = context.getSharedPreferences(string2, 0);
        context = context.edit();
        context = context.clear();
        context.apply();
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void d(ConcurrentHashMap object, ConcurrentHashMap object2, boolean bl2, String string2, ng1$a ng1$a, boolean bl3) {
        void var4_9;
        Class<kg1_1> clazz = kg1_1.class;
        boolean bl4 = td0.b(clazz);
        if (bl4) {
            return;
        }
        Object object3 = "purchaseDetailsMap";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object3 = "skuDetailsMap";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = "packageName";
        Intrinsics.checkNotNullParameter(string2, (String)object3);
        object3 = "billingClientVersion";
        Intrinsics.checkNotNullParameter(var4_9, (String)object3);
        object3 = a;
        object = ((kg1_1)object3).a((ConcurrentHashMap)object, bl2);
        object = ((kg1_1)object3).b((HashMap)object, (ConcurrentHashMap)object2, string2);
        boolean bl5 = td0.b(object3);
        if (bl5) return;
        object = ((LinkedHashMap)object).entrySet();
        try {
            object = object.iterator();
        }
        catch (Throwable throwable) {
            try {
                td0.a(object3, throwable);
                return;
            }
            catch (Throwable throwable2) {
                td0.a(clazz, throwable2);
                return;
            }
        }
        while (true) {
            bl5 = object.hasNext();
            if (!bl5) return;
            break;
        }
        {
            void var5_10;
            object2 = object.next();
            object2 = (Map.Entry)object2;
            Object k2 = object2.getKey();
            String string3 = (String)k2;
            object2 = object2.getValue();
            object2 = (String)object2;
            ct.e(string3, (String)object2, bl2, (ng1$a)var4_9, (boolean)var5_10);
            continue;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void e() {
        block11: {
            var0 = "PURCHASE_DETAILS_SET";
            var1_2 = "TIME_OF_LAST_LOGGED_SUBSCRIPTION";
            var2_3 = "TIME_OF_LAST_LOGGED_PURCHASE";
            var3_4 = kg1_1.class;
            var4_5 = td0.b(var3_4);
            if (var4_5) {
                return;
            }
            try {
                var5_6 = FacebookSdk.a();
                var6_7 = "com.facebook.internal.iap.IAP_CACHE_GPBLV2V7";
                var5_6 = var5_6.getSharedPreferences((String)var6_7, 0);
                var7_8 = 0L;
                var9_9 = var5_6.getLong(var2_3, var7_8);
                var7_8 = var5_6.getLong(var1_2, var7_8);
                var7_8 = Math.max(var9_9, var7_8);
                var9_9 = 1736528400000L;
                var7_8 = Math.max(var7_8, var9_9);
                var6_7 = new CopyOnWriteArraySet();
                var11_10 = FacebookSdk.a();
                var12_11 = "com.facebook.internal.iap.PRODUCT_DETAILS";
                var11_10 = var11_10.getSharedPreferences((String)var12_11, 0);
                var13_12 = var11_10.contains((String)var0);
                if (var13_12 != 0) {
                    var12_11 = new HashSet<E>();
                    var0 = (var0 = var11_10.getStringSet((String)var0, var12_11)) == null ? new HashSet() : (Collection)var0;
                    var6_7.addAll(var0);
                    var0 = var6_7.iterator();
                    break block11;
                }
                ** GOTO lbl62
            }
            catch (Throwable var0_1) {}
            td0.a(var3_4, var0_1);
            return;
        }
        while (true) {
            if ((var14_13 = var0.hasNext()) == 0) ** GOTO lbl62
            var6_7 = var0.next();
            var6_7 = (String)var6_7;
            var11_10 = ";";
            var11_10 = new String[]{var11_10};
            var13_12 = 2;
            var6_7 = StringsKt.a0((CharSequence)var6_7, var11_10, false, var13_12, var13_12);
            var15_14 = 1;
            var6_7 = var6_7.get(var15_14);
            var6_7 = (String)var6_7;
            var9_9 = Long.parseLong((String)var6_7);
            var16_15 = 1000L;
            var18_16 = 4.94E-321;
            var6_7 = String.valueOf(var9_9 *= var16_15);
            var14_13 = var6_7.length() + -13;
            var14_13 = Math.abs(var14_13);
            var18_16 = var14_13;
            var20_17 = 1000.0;
            var20_17 = Math.log10(var20_17);
            var14_13 = (int)(var18_16 == var20_17 ? 0 : (var18_16 > var20_17 ? 1 : -1));
            if (var14_13 >= 0) continue;
            {
                try {
                    var7_8 = Math.max(var7_8, var9_9);
                }
                catch (Exception v0) {
                }
lbl62:
                // 2 sources

                var0 = var5_6.edit();
                var0 = var0.putLong(var1_2, var7_8);
                var0.apply();
                var0 = var5_6.edit();
                var0 = var0.putLong(var2_3, var7_8);
                var0.apply();
                kg1_1.c();
                return;
                continue;
            }
            break;
        }
    }

    public static final void f() {
        Throwable throwable2;
        Class<kg1_1> clazz;
        block9: {
            block8: {
                boolean bl2;
                String string2;
                Context context;
                clazz = kg1_1.class;
                boolean bl3 = td0.b(clazz);
                if (bl3) {
                    return;
                }
                try {
                    context = FacebookSdk.a();
                    string2 = "com.facebook.internal.iap.IAP_CACHE_GPBLV2V7";
                    bl2 = false;
                }
                catch (Throwable throwable2) {}
                context = context.getSharedPreferences(string2, 0);
                context = context.edit();
                string2 = "APP_HAS_BEEN_LAUNCHED_KEY";
                bl2 = true;
                context = context.putBoolean(string2, bl2);
                try {
                    context.apply();
                    break block8;
                }
                catch (Exception exception) {}
                break block9;
            }
            return;
        }
        td0.a(clazz, throwable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void g() {
        Class<kg1_1> clazz = kg1_1.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return;
        }
        try {
            kg1_1.f();
            try {
                Context context = FacebookSdk.a();
                String string2 = "com.facebook.internal.iap.IAP_CACHE_GPBLV2V7";
                context = context.getSharedPreferences(string2, 0);
                long l2 = System.currentTimeMillis();
                Object object = context.edit();
                String string3 = "TIME_OF_LAST_LOGGED_SUBSCRIPTION";
                object = object.putLong(string3, l2);
                object.apply();
                context = context.edit();
                object = "TIME_OF_LAST_LOGGED_PURCHASE";
                context = context.putLong((String)object, l2);
                context.apply();
                return;
            }
            catch (Exception exception) {}
            return;
        }
        catch (Throwable throwable22222) {}
        td0.a(clazz, throwable22222);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final HashMap a(ConcurrentHashMap concurrentHashMap, boolean bl2) {
        String string2;
        long l2;
        String string3;
        String string4;
        SharedPreferences.Editor editor;
        ConcurrentHashMap concurrentHashMap2;
        block11: {
            Throwable throwable222;
            block10: {
                concurrentHashMap2 = concurrentHashMap;
                editor = "purchaseTime";
                boolean bl3 = td0.b(this);
                if (bl3) {
                    return null;
                }
                string4 = "purchaseDetailsMap";
                try {
                    Intrinsics.checkNotNullParameter(concurrentHashMap, string4);
                    string4 = FacebookSdk.a();
                    string3 = "com.facebook.internal.iap.IAP_CACHE_GPBLV2V7";
                    string4 = string4.getSharedPreferences(string3, 0);
                    string3 = "TIME_OF_LAST_LOGGED_PURCHASE";
                    l2 = 1736528400000L;
                    string2 = "TIME_OF_LAST_LOGGED_SUBSCRIPTION";
                    l2 = bl2 ? string4.getLong(string2, l2) : string4.getLong(string3, l2);
                }
                catch (Throwable throwable222) {
                    editor = this;
                    break block10;
                }
                break block11;
            }
            td0.a(this, throwable222);
            return null;
        }
        Iterator iterator = fh1_2.o(concurrentHashMap);
        iterator = iterator.entrySet();
        iterator = iterator.iterator();
        long l3 = 0L;
        while (true) {
            Object object;
            if ((object = iterator.hasNext()) != 0) {
                Object object2 = iterator.next();
                object2 = (Map.Entry)object2;
                Object object3 = object2.getKey();
                object3 = (String)object3;
                object2 = object2.getValue();
                object2 = (JSONObject)object2;
                String string5 = "purchaseToken";
                boolean bl4 = object2.has(string5);
                if (!bl4 || !(bl4 = object2.has((String)editor))) continue;
                long l4 = object2.getLong((String)editor);
                long l7 = l4 - l2;
                object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object <= 0) {
                    concurrentHashMap2.remove(object3);
                }
                l3 = Math.max(l3, l4);
            }
            Object object4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (object4 < 0) return new HashMap(concurrentHashMap2);
            if (bl2) {
                editor = string4.edit();
                editor = editor.putLong(string2, l3);
                editor.apply();
                return new HashMap(concurrentHashMap2);
            } else {
                editor = string4.edit();
                editor = editor.putLong(string3, l3);
                editor.apply();
            }
            return new HashMap(concurrentHashMap2);
            catch (Exception exception) {
            }
        }
    }

    public final LinkedHashMap b(HashMap iterator, ConcurrentHashMap concurrentHashMap, String string2) {
        String string3 = "packageName";
        boolean bl2 = td0.b(this);
        if (bl2) {
            return null;
        }
        LinkedHashMap linkedHashMap = "purchaseDetailsMap";
        Intrinsics.checkNotNullParameter(iterator, (String)((Object)linkedHashMap));
        linkedHashMap = "skuDetailsMap";
        Intrinsics.checkNotNullParameter(concurrentHashMap, (String)((Object)linkedHashMap));
        Intrinsics.checkNotNullParameter(string2, string3);
        linkedHashMap = new LinkedHashMap();
        iterator = ((HashMap)((Object)iterator)).entrySet();
        iterator = iterator.iterator();
        while (true) {
            Throwable throwable2;
            block24: {
                block23: {
                    try {
                        boolean bl3 = iterator.hasNext();
                        if (!bl3) break block23;
                    }
                    catch (Throwable throwable2) {
                        break block24;
                    }
                    Object object = iterator.next();
                    object = (Map.Entry)object;
                    Object object2 = object.getKey();
                    object2 = (String)object2;
                    object = object.getValue();
                    object = (JSONObject)object;
                    object2 = concurrentHashMap.get(object2);
                    object2 = (JSONObject)object2;
                    object.put(string3, (Object)string2);
                    if (object2 == null) continue;
                    object = object.toString();
                    String string4 = "purchaseDetail.toString()";
                    Intrinsics.checkNotNullExpressionValue(object, string4);
                    object2 = object2.toString();
                    string4 = "skuDetail.toString()";
                    Intrinsics.checkNotNullExpressionValue(object2, string4);
                    try {
                        linkedHashMap.put(object, object2);
                        continue;
                    }
                    catch (Exception exception) {
                        continue;
                    }
                }
                return linkedHashMap;
            }
            td0.a(this, throwable2);
            return null;
            break;
        }
    }
}


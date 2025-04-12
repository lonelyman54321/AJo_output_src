/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Bundle
 *  android.os.IBinder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.FacebookSdk;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from jg1
 */
public final class jg1_1 {
    public static final jg1_1 a;
    public static final HashMap b;
    public static final HashMap c;
    public static final String d;
    public static final SharedPreferences e;
    public static final SharedPreferences f;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        b = hashMap = new HashMap();
        c = hashMap = new HashMap();
        d = FacebookSdk.a().getPackageName();
        e = FacebookSdk.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
        f = FacebookSdk.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
    }

    public static final ArrayList f(Context object, Object object2) {
        String string2;
        Class<jg1_1> clazz = jg1_1.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return null;
        }
        Object object3 = "context";
        try {
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object3 = a;
            string2 = "inapp";
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return null;
        }
        object = ((jg1_1)object3).e((Context)object, object2, string2);
        return ((jg1_1)object3).a((ArrayList)object);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList a(ArrayList arrayList) {
        Object object;
        SharedPreferences sharedPreferences2 = f;
        boolean bl2 = td0.b(this);
        if (bl2) {
            return null;
        }
        try {
            object = new ArrayList();
            SharedPreferences.Editor editor = sharedPreferences2.edit();
            long l2 = System.currentTimeMillis();
            long l3 = 1000L;
            l2 /= l3;
            Iterator iterator = arrayList.iterator();
            while (true) {
                boolean bl3;
                if (bl3 = iterator.hasNext()) {
                    Object object2 = iterator.next();
                    object2 = (String)object2;
                    Object object3 = new JSONObject(object2);
                    String string2 = "productId";
                    string2 = object3.getString(string2);
                    String string3 = "purchaseTime";
                    long l4 = object3.getLong(string3);
                    String string4 = "purchaseToken";
                    object3 = object3.getString(string4);
                    l4 /= l3;
                    l4 = l2 - l4;
                    long l7 = 86400L;
                    long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
                    if (l8 > 0) continue;
                    string3 = "";
                    boolean bl4 = Intrinsics.areEqual(string3 = sharedPreferences2.getString(string2, string3), object3);
                    if (bl4) continue;
                    editor.putString(string2, (String)object3);
                    ((ArrayList)object).add(object2);
                }
                editor.apply();
                return object;
                catch (JSONException jSONException) {}
            }
        }
        catch (Throwable throwable) {
            object = this;
        }
        td0.a(this, throwable);
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Class b(Context var1_1, String var2_4) {
        block19: {
            block18: {
                block17: {
                    block16: {
                        var3_5 = td0.b(this);
                        if (var3_5) {
                            return null;
                        }
                        var4_6 = jg1_1.c;
                        var5_7 /* !! */  = var4_6.get(var2_4);
                        var5_7 /* !! */  = (Class)var5_7 /* !! */ ;
                        if (var5_7 /* !! */  == null) break block16;
                        return var5_7 /* !! */ ;
                    }
                    ** try [egrp 2[TRYBLOCK] [2 : 39->42)] { 
lbl13:
                    // 1 sources

                    var5_7 /* !! */  = ng1_1.class;
                    var6_8 = td0.b(var5_7 /* !! */ );
                    if (var6_8) {
                        var1_1 = null;
                        break block17;
                    }
                    var7_9 = "context";
                    try {
                        Intrinsics.checkNotNullParameter(var1_1, var7_9);
                        var7_9 = "className";
                    }
                    catch (Throwable var1_2) {}
                    Intrinsics.checkNotNullParameter(var2_4, var7_9);
                    var1_1 = var1_1.getClassLoader();
                    var1_1 = var1_1.loadClass(var2_4);
                    return var1_1;
                    {
                        catch (ClassNotFoundException v0) {}
                    }
                    ** finally { 
                }
                if (var1_1 == null) break block18;
                try {
                    var4_6.put(var2_4, var1_1);
                }
lbl40:
                // 5 sources

                catch (Throwable var1_3) {}
                break block19;
            }
            return var1_1;
        }
        td0.a(this, var1_3);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Method c(Class genericDeclaration, String string2) {
        Throwable throwable2;
        block15: {
            Class[] classArray;
            HashMap hashMap;
            int n3;
            int n4;
            block16: {
                Class<String> clazz;
                Class[] classArray2;
                Object object;
                int n7;
                block17: {
                    Class<Bundle> clazz2;
                    int n8;
                    n7 = 4;
                    n4 = 3;
                    int n10 = 2;
                    n3 = 1;
                    boolean bl2 = td0.b(this);
                    if (bl2) {
                        return null;
                    }
                    try {
                        hashMap = b;
                        object = hashMap.get(string2);
                        object = (Method)object;
                        if (object != null) {
                            return object;
                        }
                        n8 = string2.hashCode();
                        clazz2 = Bundle.class;
                        classArray2 = "TYPE";
                        clazz = String.class;
                    }
                    catch (Throwable throwable2) {
                        break block15;
                    }
                    switch (n8) {
                        default: {
                            break;
                        }
                        case -573310373: {
                            object = "getSkuDetails";
                            n8 = (int)(string2.equals(object) ? 1 : 0);
                            if (n8 == 0) break;
                            object = Integer.TYPE;
                            Intrinsics.checkNotNullExpressionValue(object, (String)classArray2);
                            classArray = new Class[n7];
                            classArray[0] = object;
                            classArray[n3] = clazz;
                            classArray[n10] = clazz;
                            classArray[n4] = clazz2;
                            break block16;
                        }
                        case -594356707: {
                            object = "getPurchaseHistory";
                            n8 = (int)(string2.equals(object) ? 1 : 0);
                            if (n8 == 0) break;
                            object = Integer.TYPE;
                            Intrinsics.checkNotNullExpressionValue(object, (String)classArray2);
                            int n14 = 5;
                            classArray2 = new Class[n14];
                            classArray2[0] = object;
                            classArray2[n3] = clazz;
                            classArray2[n10] = clazz;
                            classArray2[n4] = clazz;
                            classArray2[n7] = clazz2;
                            classArray = classArray2;
                            break block16;
                        }
                        case -1123215065: {
                            Class<IBinder> clazz3;
                            classArray = "asInterface";
                            n7 = (int)(string2.equals(classArray) ? 1 : 0);
                            if (n7 == 0) break;
                            classArray = new Class[n3];
                            classArray[0] = clazz3 = IBinder.class;
                            break block16;
                        }
                        case -1450694211: {
                            classArray = "isBillingSupported";
                            n7 = (int)(string2.equals(classArray) ? 1 : 0);
                            if (n7 == 0) break;
                            classArray = Integer.TYPE;
                            Intrinsics.checkNotNullExpressionValue(classArray, (String)classArray2);
                            Class[] classArray3 = new Class[n4];
                            classArray3[0] = classArray;
                            classArray3[n3] = clazz;
                            classArray3[n10] = clazz;
                            classArray = classArray3;
                            break block16;
                        }
                        case -1801122596: {
                            object = "getPurchases";
                            n8 = (int)(string2.equals(object) ? 1 : 0);
                            if (n8 != 0) break block17;
                        }
                    }
                    n7 = 0;
                    classArray = null;
                    break block16;
                }
                object = Integer.TYPE;
                Intrinsics.checkNotNullExpressionValue(object, (String)classArray2);
                classArray = new Class[n7];
                classArray[0] = object;
                classArray[n3] = clazz;
                classArray[n10] = clazz;
                classArray[n4] = clazz;
            }
            if (classArray == null) {
                classArray = new Class[n3];
                classArray[0] = null;
                genericDeclaration = ng1_1.b(genericDeclaration, string2, classArray);
            } else {
                n4 = classArray.length;
                classArray = Arrays.copyOf(classArray, n4);
                genericDeclaration = ng1_1.b(genericDeclaration, string2, classArray);
            }
            if (genericDeclaration != null) {
                hashMap.put(string2, genericDeclaration);
            }
            return genericDeclaration;
        }
        td0.a(this, throwable2);
        return null;
    }

    /*
     * Exception decompiling
     */
    public final ArrayList d(Context var1_1, Object var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 27[TRYBLOCK] [33 : 408->413)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    public final ArrayList e(Context context, Object object, String string2) {
        Throwable throwable2;
        block23: {
            ArrayList arrayList;
            block21: {
                int n3;
                int n4;
                block20: {
                    n4 = 3;
                    boolean bl2 = td0.b(this);
                    if (bl2) {
                        return null;
                    }
                    arrayList = new ArrayList();
                    if (object != null) break block20;
                    return arrayList;
                }
                boolean bl3 = this.i(context, object, string2);
                if (!bl3) break block21;
                bl3 = false;
                Object object2 = null;
                int n7 = 0;
                do {
                    block22: {
                        int n8;
                        Object object3;
                        try {
                            object3 = n4;
                            n8 = 4;
                        }
                        catch (Throwable throwable2) {}
                        Object[] objectArray = new Object[n8];
                        objectArray[0] = object3;
                        object3 = d;
                        n8 = 1;
                        objectArray[n8] = object3;
                        n3 = 2;
                        objectArray[n3] = string2;
                        objectArray[n4] = object2;
                        String string3 = "com.android.vending.billing.IInAppBillingService";
                        String string4 = "getPurchases";
                        object2 = this;
                        object3 = context;
                        object2 = this.h(context, string3, string4, object, objectArray);
                        if (object2 == null) break block22;
                        object2 = (Bundle)object2;
                        object3 = "RESPONSE_CODE";
                        n3 = object2.getInt((String)object3);
                        if (n3 != 0) break block22;
                        object3 = "INAPP_PURCHASE_DATA_LIST";
                        object3 = object2.getStringArrayList((String)object3);
                        if (object3 == null) break;
                        try {
                            n8 = ((ArrayList)object3).size();
                            n7 += n8;
                            arrayList.addAll(object3);
                            object3 = "INAPP_CONTINUATION_TOKEN";
                            object2 = object2.getString((String)object3);
                            return object2;
                        }
                        finally {
                            break block23;
                        }
                    }
                    bl3 = false;
                    object2 = null;
                } while (n7 < (n3 = 30) && object2 != null);
            }
            return arrayList;
        }
        td0.a(this, throwable2);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final LinkedHashMap g(Context context, ArrayList arrayList, Object object, boolean bl2) {
        Throwable throwable2;
        block6: {
            String string2;
            Object object2;
            Object object3;
            LinkedHashMap<Object, String> linkedHashMap;
            ArrayList arrayList2 = arrayList;
            int n3 = 1;
            int n4 = 3;
            int n7 = td0.b(this);
            if (n7 != 0) {
                return null;
            }
            try {
                linkedHashMap = new LinkedHashMap<Object, String>();
                if (object == null) return linkedHashMap;
                n7 = arrayList.isEmpty();
                if (n7 != 0) {
                    return linkedHashMap;
                }
                object3 = new Bundle();
                object2 = "ITEM_ID_LIST";
                object3.putStringArrayList((String)object2, arrayList);
                object2 = n4;
                string2 = bl2 ? "subs" : "inapp";
            }
            catch (Throwable throwable2) {
                break block6;
            }
            int n8 = 4;
            Object[] objectArray = new Object[n8];
            objectArray[0] = object2;
            objectArray[n3] = object2 = d;
            int n10 = 2;
            objectArray[n10] = string2;
            objectArray[n4] = object3;
            object2 = "com.android.vending.billing.IInAppBillingService";
            string2 = "getSkuDetails";
            Object object4 = this;
            object3 = context;
            Object object5 = object;
            object4 = this.h(context, (String)object2, string2, object, objectArray);
            if (object4 == null) return linkedHashMap;
            object3 = "RESPONSE_CODE";
            n7 = (object4 = (Bundle)object4).getInt((String)object3);
            if (n7 != 0) return linkedHashMap;
            object3 = "DETAILS_LIST";
            if ((object4 = object4.getStringArrayList((String)object3)) != null && (n7 = arrayList.size()) == (n10 = ((ArrayList)object4).size())) {
                n7 = arrayList.size();
                for (int i3 = 0; i3 < n7; i3 += n3) {
                    object2 = arrayList.get(i3);
                    string2 = "skuList[i]";
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                    string2 = ((ArrayList)object4).get(i3);
                    object5 = "skuDetailsList[i]";
                    Intrinsics.checkNotNullExpressionValue(string2, (String)object5);
                    linkedHashMap.put(object2, string2);
                }
            }
            this.k(linkedHashMap);
            return linkedHashMap;
        }
        td0.a(this, throwable2);
        return null;
    }

    public final Object h(Context object, String object2, String objectArray, Object object3, Object[] objectArray2) {
        block8: {
            block7: {
                boolean bl2 = td0.b(this);
                if (bl2) {
                    return null;
                }
                try {
                    object = this.b((Context)object, (String)object2);
                    if (object != null) break block7;
                    return null;
                }
                catch (Throwable throwable) {
                    td0.a(this, throwable);
                    return null;
                }
            }
            object2 = this.c((Class)object, (String)objectArray);
            if (object2 != null) break block8;
            return null;
        }
        int n3 = objectArray2.length;
        objectArray = Arrays.copyOf(objectArray2, n3);
        return ng1_1.d((Class)object, object3, (Method)object2, objectArray);
    }

    public final boolean i(Context object, Object object2, String string2) {
        Throwable throwable2;
        block13: {
            boolean bl2;
            block12: {
                block11: {
                    Integer n3;
                    bl2 = true;
                    int n4 = 3;
                    boolean bl3 = td0.b(this);
                    if (bl3) {
                        return false;
                    }
                    if (object2 == null) {
                        return false;
                    }
                    try {
                        n3 = n4;
                    }
                    catch (Throwable throwable2) {}
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = n3;
                    String string3 = d;
                    objectArray[bl2] = string3;
                    n4 = 2;
                    objectArray[n4] = string2;
                    String string4 = "com.android.vending.billing.IInAppBillingService";
                    String string5 = "isBillingSupported";
                    object = this.h((Context)object, string4, string5, object2, objectArray);
                    if (object == null) break block11;
                    object = (Integer)object;
                    int n7 = (Integer)object;
                    if (n7 != 0) break block11;
                    break block12;
                    break block13;
                }
                bl2 = false;
            }
            return bl2;
        }
        td0.a(this, throwable2);
        return false;
    }

    public final LinkedHashMap j(ArrayList object) {
        Throwable throwable2;
        block21: {
            LinkedHashMap linkedHashMap;
            block20: {
                boolean bl2 = td0.b(this);
                if (bl2) {
                    return null;
                }
                linkedHashMap = new LinkedHashMap();
                long l2 = System.currentTimeMillis();
                long l3 = 1000L;
                l2 /= l3;
                try {
                    object = ((ArrayList)object).iterator();
                }
                catch (Throwable throwable2) {}
                while (true) {
                    boolean bl3 = object.hasNext();
                    if (!bl3) break block20;
                    break;
                }
                {
                    Object object2 = object.next();
                    object2 = (String)object2;
                    Object object3 = e;
                    if ((object3 = object3.getString(object2, null)) == null) continue;
                    Object object4 = ";";
                    object4 = new String[]{object4};
                    int n3 = 2;
                    object3 = StringsKt.a0((CharSequence)object3, object4, false, n3, n3);
                    object4 = object3.get(0);
                    object4 = (String)object4;
                    long l4 = Long.parseLong((String)object4);
                    long l7 = 43200L;
                    long l8 = (l4 = l2 - l4) - l7;
                    Object object5 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                    if (object5 >= 0) continue;
                    object4 = "sku";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                    int n4 = 1;
                    object3 = object3.get(n4);
                    linkedHashMap.put(object2, (SharedPreferences)object3);
                    continue;
                }
                break block21;
            }
            return linkedHashMap;
        }
        td0.a(this, throwable2);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(LinkedHashMap iterator) {
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        try {
            long l2 = System.currentTimeMillis();
            long l3 = 1000L;
            l2 /= l3;
            SharedPreferences sharedPreferences2 = e;
            sharedPreferences2 = sharedPreferences2.edit();
            iterator = ((LinkedHashMap)((Object)iterator)).entrySet();
            iterator = iterator.iterator();
            while (true) {
                boolean bl3;
                if (!(bl3 = iterator.hasNext())) {
                    sharedPreferences2.apply();
                    return;
                }
                Object object = iterator.next();
                object = (Map.Entry)object;
                Object object2 = object.getKey();
                object2 = (String)object2;
                object = object.getValue();
                object = (String)object;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(l2);
                char c2 = ';';
                stringBuilder.append(c2);
                stringBuilder.append((String)object);
                object = stringBuilder.toString();
                sharedPreferences2.putString(object2, object);
            }
        }
        catch (Throwable throwable) {}
        td0.a(this, throwable);
    }
}


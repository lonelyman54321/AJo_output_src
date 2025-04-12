/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  org.json.JSONObject
 */
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/*
 * Renamed from ZK0
 */
public final class zk0_1 {
    public static final zk0_1 a;
    public static final AtomicBoolean b;
    public static final ConcurrentLinkedQueue c;
    public static final ConcurrentHashMap d;
    public static Long e;
    public static ky0_1 f;

    static {
        Serializable serializable = new Serializable();
        a = serializable;
        Reflection.getOrCreateKotlinClass(zk0_1.class).getSimpleName();
        serializable = new Serializable(false);
        b = serializable;
        c = serializable = new Serializable();
        serializable = new Serializable();
        d = serializable;
    }

    public static JSONObject a() {
        Bundle bundle = E1.a("platform", "android");
        Object object = FacebookSdk.a;
        bundle.putString("sdk_version", "18.0.2");
        bundle.putString("fields", "gatekeepers");
        object = GraphRequest.j;
        object = StringCompanionObject.INSTANCE;
        int n3 = 1;
        Object object2 = new Object[n3];
        object2[0] = "mobile_sdk_gk";
        String string2 = "app/%s";
        String string3 = "format(format, *args)";
        object = xh2_0.a(object2, n3, string2, string3);
        object = GraphRequest$c.g(null, (String)object, null);
        object2 = "<set-?>";
        Intrinsics.checkNotNullParameter(bundle, (String)object2);
        ((GraphRequest)object).d = bundle;
        bundle = ((GraphRequest)object).c().d;
        if (bundle == null) {
            bundle = new JSONObject();
        }
        return bundle;
    }

    public static final boolean b(String object, String cloneable, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "name");
        a.getClass();
        boolean bl3 = false;
        ArrayList arrayList = null;
        zk0_1.c(null);
        Object object2 = d;
        boolean bl4 = ((ConcurrentHashMap)object2).containsKey(cloneable);
        if (!bl4) {
            cloneable = new Cloneable();
        } else {
            Object object3;
            int n3;
            Object object4 = f;
            ConcurrentHashMap<Object, Object> concurrentHashMap = "appId";
            if (object4 != null) {
                Intrinsics.checkNotNullParameter(cloneable, (String)((Object)concurrentHashMap));
                object4 = (ConcurrentHashMap)((ky0_1)object4).a.get(cloneable);
                if (object4 != null) {
                    n3 = object4.size();
                    arrayList = new ArrayList(n3);
                    object4 = object4.entrySet().iterator();
                    while ((n3 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                        object3 = (jy0_0)((Map.Entry)object4.next()).getValue();
                        arrayList.add(object3);
                    }
                }
            }
            if (arrayList != null) {
                boolean bl5;
                cloneable = new Cloneable();
                arrayList = arrayList.iterator();
                while (bl5 = arrayList.hasNext()) {
                    object2 = (jy0_0)arrayList.next();
                    object4 = ((jy0_0)object2).a;
                    bl5 = ((jy0_0)object2).b;
                    object2 = bl5;
                    cloneable.put(object4, object2);
                }
            } else {
                Object object5;
                boolean bl6;
                arrayList = new ArrayList();
                if ((object2 = (JSONObject)((ConcurrentHashMap)object2).get(cloneable)) == null) {
                    object2 = new JSONObject();
                }
                object4 = object2.keys();
                while ((n3 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                    object3 = (String)((Object)object4.next());
                    Intrinsics.checkNotNullExpressionValue(object3, "key");
                    bl6 = object2.optBoolean((String)object3);
                    object5 = bl6;
                    ((HashMap)((Object)arrayList)).put(object3, object5);
                }
                object2 = f;
                if (object2 == null) {
                    object2 = new ky0_1();
                }
                n3 = ((HashMap)((Object)arrayList)).size();
                object4 = new ArrayList(n3);
                object3 = ((HashMap)((Object)arrayList)).entrySet().iterator();
                while (bl6 = object3.hasNext()) {
                    object5 = object3.next();
                    String string2 = (String)object5.getKey();
                    object5 = (Boolean)object5.getValue();
                    bl6 = (Boolean)object5;
                    jy0_0 jy0_02 = new jy0_0(string2, bl6);
                    ((ArrayList)object4).add(jy0_02);
                }
                Intrinsics.checkNotNullParameter(cloneable, (String)((Object)concurrentHashMap));
                Intrinsics.checkNotNullParameter(object4, "gateKeeperList");
                concurrentHashMap = new ConcurrentHashMap<Object, Object>();
                object4 = ((ArrayList)object4).iterator();
                while ((n3 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                    object3 = (jy0_0)object4.next();
                    object5 = ((jy0_0)object3).a;
                    concurrentHashMap.put(object5, object3);
                }
                object4 = ((ky0_1)object2).a;
                ((ConcurrentHashMap)object4).put(cloneable, concurrentHashMap);
                f = object2;
                cloneable = arrayList;
            }
        }
        bl3 = cloneable.containsKey(object);
        if (bl3 && (object = (Boolean)cloneable.get(object)) != null) {
            bl2 = (Boolean)object;
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    public static final void c(lj0_0 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 36->39)] java.lang.Throwable
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

    /*
     * Exception decompiling
     */
    public static final JSONObject d(String var0, JSONObject var1_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [6 : 54->59)] java.lang.Throwable
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

    public static void e() {
        boolean bl2;
        Object object = Looper.getMainLooper();
        Handler handler = new Handler((Looper)object);
        while (!(bl2 = ((ConcurrentLinkedQueue)(object = c)).isEmpty())) {
            if ((object = (ZK0$a)((ConcurrentLinkedQueue)object).poll()) == null) continue;
            yk0_1 yk0_12 = new yk0_1((ZK0$a)object);
            handler.post((Runnable)yk0_12);
        }
    }
}


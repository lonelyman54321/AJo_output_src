/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import java.lang.constant.Constable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;

/*
 * Renamed from hg1
 */
public final class hg1_2
implements bg1_0 {
    public static final hg1$a G;
    public static final AtomicBoolean H;
    public static hg1_2 I;
    public static final ConcurrentHashMap J;
    public static final ConcurrentHashMap K;
    public static final ConcurrentHashMap L;
    public final Method A;
    public final Method B;
    public final Method C;
    public final Method D;
    public final Method E;
    public final Method F;
    public final Object a;
    public final Class b;
    public final Class c;
    public final Class d;
    public final Class e;
    public final Class f;
    public final Class g;
    public final Class h;
    public final Class i;
    public final Class j;
    public final Class k;
    public final Class l;
    public final Class m;
    public final Class n;
    public final Class o;
    public final Method p;
    public final Method q;
    public final Method r;
    public final Method s;
    public final Method t;
    public final Method u;
    public final Method v;
    public final Method w;
    public final Method x;
    public final Method y;
    public final Method z;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        G = concurrentHashMap;
        concurrentHashMap = new ConcurrentHashMap(false);
        H = concurrentHashMap;
        J = concurrentHashMap = new ConcurrentHashMap();
        K = concurrentHashMap = new ConcurrentHashMap();
        L = concurrentHashMap = new ConcurrentHashMap();
    }

    public hg1_2() {
        throw null;
    }

    public hg1_2(Object object, Class clazz, Class clazz2, Class clazz3, Class clazz4, Class clazz5, Class clazz6, Class clazz7, Class clazz8, Class clazz9, Class clazz10, Class clazz11, Class clazz12, Class clazz13, Class clazz14, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17) {
        this.a = object;
        this.b = clazz;
        this.c = clazz2;
        this.d = clazz3;
        this.e = clazz4;
        this.f = clazz5;
        this.g = clazz6;
        this.h = clazz7;
        this.i = clazz8;
        this.j = clazz9;
        this.k = clazz10;
        this.l = clazz11;
        this.m = clazz12;
        this.n = clazz13;
        this.o = clazz14;
        this.p = method;
        this.q = method2;
        this.r = method3;
        this.s = method4;
        this.t = method5;
        this.u = method6;
        this.v = method7;
        this.w = method8;
        this.x = method9;
        this.y = method10;
        this.z = method11;
        this.A = method12;
        this.B = method13;
        this.C = method14;
        this.D = method15;
        this.E = method16;
        this.F = method17;
    }

    public static final /* synthetic */ void b() {
        td0.b(hg1_2.class);
    }

    public final void a(ng1$b ng1$b, Runnable runnable2) {
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        Object object = "productType";
        try {
            Intrinsics.checkNotNullParameter((Object)ng1$b, (String)object);
            object = "completionHandler";
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return;
        }
        Intrinsics.checkNotNullParameter(runnable2, (String)object);
        object = new fg1_2(this, ng1$b, runnable2);
        this.c((Runnable)object);
    }

    /*
     * Exception decompiling
     */
    public final void c(Runnable var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 40->44)] java.lang.Throwable
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

    public final String d(String object) {
        Throwable throwable22;
        block9: {
            Object object2;
            block8: {
                String string2;
                boolean n3 = td0.b(this);
                object2 = null;
                if (n3) {
                    return null;
                }
                Object object3 = "productDetailsString";
                try {
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    string2 = "jsonString='(.*?)'";
                }
                catch (Throwable throwable22) {}
                object3 = new Regex(string2);
                object = Regex.a((Regex)object3, (CharSequence)object);
                if (object == null) break block8;
                object = ((oh1_1)object).a();
                if (object == null) break block8;
                int n4 = 1;
                object = CollectionsKt.N(n4, (List)object);
                object2 = object = (String)object;
                break block9;
            }
            return object2;
        }
        td0.a(this, throwable22);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object e(ng1$b object, ArrayList object2) {
        int n3 = 1;
        Class clazz = this.j;
        Object[] objectArray = this.l;
        boolean bl2 = td0.b(this);
        if (bl2) {
            return null;
        }
        try {
            bl2 = ((ArrayList)object2).isEmpty();
            if (bl2) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            object2 = ((ArrayList)object2).iterator();
            while (true) {
                boolean bl3;
                if (!(bl3 = object2.hasNext())) {
                    object = this.h;
                    object2 = this.w;
                    objectArray = new Object[]{};
                    object = ng1_1.d((Class)object, null, (Method)object2, objectArray);
                    object2 = this.y;
                    Object[] objectArray2 = new Object[n3];
                    objectArray2[0] = arrayList;
                    object = ng1_1.d(clazz, object, (Method)object2, objectArray2);
                    object2 = this.x;
                    objectArray2 = new Object[]{};
                    return ng1_1.d(clazz, object, (Method)object2, objectArray2);
                }
                Object object3 = object2.next();
                object3 = (String)object3;
                Object object4 = this.f;
                Object[] objectArray3 = this.z;
                Object[] objectArray4 = new Object[]{};
                object4 = ng1_1.d((Class)object4, null, (Method)objectArray3, objectArray4);
                objectArray3 = this.B;
                objectArray4 = new Object[n3];
                objectArray4[0] = object3;
                object3 = ng1_1.d((Class)objectArray, object4, (Method)objectArray3, objectArray4);
                object4 = this.C;
                objectArray3 = ((ng1$b)((Object)object)).getType();
                objectArray4 = new Object[n3];
                objectArray4[0] = objectArray3;
                object3 = ng1_1.d((Class)objectArray, object3, (Method)object4, objectArray4);
                object4 = this.A;
                objectArray3 = new Object[0];
                if ((object3 = ng1_1.d((Class)objectArray, object3, (Method)object4, objectArray3)) == null) continue;
                arrayList.add(object3);
            }
        }
        catch (Throwable throwable) {}
        td0.a(this, throwable);
        return null;
    }

    public final void f(Object[] object, Object[] object2) {
        block16: {
            Throwable throwable2;
            block18: {
                block17: {
                    int n3 = td0.b(this);
                    if (n3 != 0) {
                        return;
                    }
                    if (object2 == null) break block16;
                    try {
                        n3 = ((Object[])object2).length;
                        if (n3 == 0) break block16;
                        n3 = 0;
                    }
                    catch (Throwable throwable2) {}
                    object2 = object2[0];
                    Constable constable = this.g;
                    Method method = this.F;
                    Object[] objectArray = new Object[]{};
                    object2 = ng1_1.d(constable, object2, method, objectArray);
                    constable = Integer.valueOf(0);
                    int n4 = Intrinsics.areEqual(object2, constable);
                    if (n4 == 0) break block17;
                    object2 = H;
                    boolean bl2 = true;
                    ((AtomicBoolean)object2).set(bl2);
                    if (object == null) break block17;
                    n4 = ((Object[])object).length;
                    if (n4 == 0) break block17;
                    object = object[0];
                    n4 = object instanceof Runnable;
                    if (n4 == 0) break block17;
                    object = (Runnable)object;
                    if (object == null) break block17;
                    object.run();
                    break block18;
                }
                return;
            }
            td0.a(this, throwable2);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(Object[] var1_1, Object[] var2_3) {
        block12: {
            block11: {
                block13: {
                    var3_4 = "productId";
                    var4_5 = td0.b(this);
                    if (var4_5) {
                        return;
                    }
                    var4_5 = false;
                    if (var1_1 == null) break block13;
                    try {
                        var1_1 = tp_2.E(0, (Object[])var1_1);
                        break block11;
                    }
                    catch (Throwable var1_2) {
                        ** GOTO lbl36
                    }
                }
                var1_1 = null;
            }
            if (var2_3 != null) {
                var5_6 = 1;
                var2_3 = tp_2.E(var5_6, (Object[])var2_3);
            } else {
                var6_7 = false;
                var2_3 = null;
            }
            if (var2_3 == null) return;
            var5_6 = var2_3 instanceof List;
            if (var5_6 != 0) ** GOTO lbl-1000
            return;
lbl-1000:
            // 1 sources

            {
                var2_3 = (List)var2_3;
                var2_3 = var2_3.iterator();
lbl27:
                // 4 sources

                while ((var5_6 = (int)var2_3.hasNext()) != 0) {
                    var7_8 /* !! */  = var2_3.next();
                    var8_9 = this.d;
                    var9_10 = this.D;
                    var10_11 = new Object[]{};
                    var7_8 /* !! */  = ng1_1.d(var8_9, var7_8 /* !! */ , (Method)var9_10, var10_11);
                }
                break block12;
lbl36:
                // 1 sources

                td0.a(this, var1_2);
                return;
                catch (Exception v0) {
                    ** GOTO lbl27
                }
            }
            var11_12 = var7_8 /* !! */  instanceof String;
            if (!var11_12) ** GOTO lbl44
            {
                block14: {
                    var7_8 /* !! */  = (String)var7_8 /* !! */ ;
                    break block14;
lbl44:
                    // 1 sources

                    var5_6 = 0;
                    var7_8 /* !! */  = null;
                }
                if (var7_8 /* !! */  == null || (var7_8 /* !! */  = this.d((String)var7_8 /* !! */ )) == null || (var5_6 = (int)(var8_9 = new JSONObject(var7_8 /* !! */ )).has(var3_4)) == 0) ** GOTO lbl27
                var7_8 /* !! */  = var8_9.getString(var3_4);
                var9_10 = hg1_2.L;
                Intrinsics.checkNotNullExpressionValue(var7_8 /* !! */ , var3_4);
                var9_10.put(var7_8 /* !! */ , var8_9);
                ** GOTO lbl27
            }
        }
        if (var1_1 == null) return;
        var6_7 = var1_1 instanceof Runnable;
        if (var6_7 == false) return;
        {
            var1_1 = (Runnable)var1_1;
            var1_1.run();
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void h(Object[] var1_1, Object[] var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 65->69)] java.lang.Throwable
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
    public final void i(Object[] var1_1, Object[] var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 65->69)] java.lang.Throwable
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
}


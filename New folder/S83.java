/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

public final class S83 {
    public final Function1 a;
    public final AtomicReference b;
    public boolean c;
    public final S83$b d;
    public final S83$c e;
    public final WR1 f;
    public oq_2 g;
    public boolean h;
    public S83$a i;
    public long j;

    public S83(Function1 object) {
        this.a = object;
        object = new AtomicReference(null);
        this.b = object;
        super(this);
        this.d = object;
        super(this);
        this.e = object;
        Object[] objectArray = new S83$a[16];
        this.f = object = new WR1(objectArray);
        this.j = -1;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final boolean a(S83 s83) {
        boolean bl2;
        int n3 = 1;
        WR1 wR1 = s83.f;
        synchronized (wR1) {
            bl2 = s83.c;
        }
        boolean bl3 = false;
        wR1 = null;
        if (bl2) {
            return bl3;
        }
        bl2 = false;
        while (true) {
            Object object = s83.b;
            Object object2 = ((AtomicReference)object).get();
            int n4 = 0;
            List list = null;
            boolean bl4 = true;
            do {
                int n7;
                Object object3;
                int n8;
                block21: {
                    Object object4;
                    block20: {
                        if (!bl4 || (bl4 = false)) break block20;
                        if (object2 == null) break block21;
                        n8 = object2 instanceof Set;
                        if (n8 != 0) {
                            object4 = object2;
                            object4 = (Set)object2;
                            object3 = object4;
                        } else {
                            int n10;
                            n8 = object2 instanceof List;
                            if (n8 == 0) {
                                p30_0.d("Unexpected notification");
                                throw null;
                            }
                            object4 = object2;
                            object4 = (List)object2;
                            object3 = (Set)object4.get(0);
                            n7 = object4.size();
                            if (n7 == (n10 = 2)) {
                                list = (List)object4.get(n3);
                            } else {
                                n7 = object4.size();
                                if (n7 > n10) {
                                    n4 = object4.size();
                                    list = object4.subList(n3, n4);
                                }
                            }
                        }
                        object4 = list;
                    }
                    if ((n4 = ((AtomicReference)object).compareAndSet(object2, object4)) == 0) continue;
                    list = (List)object3;
                }
                if (list == null) {
                    return bl2;
                }
                object = s83.f;
                synchronized (object) {
                    try {
                        object2 = s83.f;
                        n8 = ((WR1)object2).c;
                        if (n8 > 0) {
                            object2 = ((WR1)object2).a;
                            int n14 = 0;
                            object3 = null;
                            do {
                                Object object5 = object2[n14];
                                n7 = ((S83$a)(object5 = (S83$a)object5)).b((Set)((Object)list)) ? 1 : 0;
                                if (n7 == 0 && !bl2) {
                                    bl2 = false;
                                    continue;
                                }
                                bl2 = true;
                            } while ((n14 += n3) < n8);
                        }
                        object2 = Unit.a;
                    }
                    catch (Throwable throwable) {
                    }
                    throw throwable;
                }
            } while ((list = (List)((AtomicReference)object).get()) == object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        WR1 wR1 = this.f;
        synchronized (wR1) {
            Throwable throwable2;
            block5: {
                Object[] objectArray;
                block4: {
                    try {
                        objectArray = this.f;
                        int n3 = objectArray.c;
                        if (n3 <= 0) break block4;
                        objectArray = objectArray.a;
                        int n4 = 0;
                        do {
                            Object object = objectArray[n4];
                            object = (S83$a)object;
                            Object object2 = ((S83$a)object).e;
                            object2 = ((vt2_0)object2).a;
                            ((nr1_1)object2).c();
                            object2 = ((S83$a)object).f;
                            ((nr1_1)object2).c();
                            object2 = ((S83$a)object).k;
                            object2 = ((vt2_0)object2).a;
                            ((nr1_1)object2).c();
                            object = ((S83$a)object).l;
                            ((HashMap)object).clear();
                        } while (++n4 < n3);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                objectArray = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    public final void c(Object var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 21[TRYBLOCK] [21 : 452->457)] java.lang.Throwable
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
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(Object object, Function1 object2, Function0 function0) {
        long l2;
        Object object3;
        Object object4;
        S83$c s83$c;
        Object object5 = this.f;
        synchronized (object5) {
            int n3;
            WR1 wR1;
            block10: {
                wR1 = this.f;
                n3 = wR1.c;
                s83$c = null;
                if (n3 > 0) {
                    Object[] objectArray = wR1.a;
                    int n4 = 0;
                    do {
                        Object object6 = object4 = objectArray[n4];
                        object6 = (S83$a)object4;
                        object6 = ((S83$a)object6).a;
                        if (object6 == object3) break block10;
                    } while (++n4 < n3);
                }
                object4 = null;
            }
            if ((object4 = (S83$a)object4) == null) {
                String string2 = "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>";
                Intrinsics.checkNotNull(object3, string2);
                n3 = 1;
                object3 = TypeIntrinsics.beforeCheckcastToFunctionOfArity(object3, n3);
                object3 = (Function1)object3;
                object4 = new S83$a((Function1)object3);
                wR1.b(object4);
            }
        }
        boolean bl2 = this.h;
        object5 = this.i;
        long l3 = this.j;
        long l4 = -1;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 != false && (l7 = (l2 = l3 - (l4 = zn0_2.a())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
            object = D70.c(l3, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            long l8 = zn0_2.a();
            ((StringBuilder)object).append(l8);
            ((StringBuilder)object).append(", name=");
            object3 = Thread.currentThread().getName();
            ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object).append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            sn2.b(((StringBuilder)object).toString());
            throw null;
        }
        try {
            void var3_4;
            long l12;
            this.h = false;
            this.i = object4;
            this.j = l12 = zn0_2.a();
            s83$c = this.e;
            ((S83$a)object4).a(object, s83$c, (Function0)var3_4);
            return;
        }
        finally {
            this.i = object5;
            this.h = bl2;
            this.j = l3;
        }
    }

    public final void e() {
        S83$b s83$b = this.d;
        A83.f(A83.a);
        Object object = A83.c;
        synchronized (object) {
            Object object2 = A83.h;
            object2 = (Collection)object2;
            object2 = CollectionsKt.X((Collection)object2, s83$b);
            A83.h = object2;
            object2 = Unit.a;
            this.g = object = new oq_2(s83$b);
            return;
        }
    }
}


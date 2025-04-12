/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 */
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class F30
implements k80,
tO2,
EF2 {
    public final A30 a;
    public final mp b;
    public final AtomicReference c;
    public final Object d;
    public final pr1$a_0 e;
    public final l73 f;
    public final vt2_0 g;
    public final pr1_1 h;
    public final pr1_1 i;
    public final vt2_0 j;
    public final zr_1 k;
    public final zr_1 l;
    public final vt2_0 m;
    public vt2_0 n;
    public boolean o;
    public F30 p;
    public int q;
    public final P30 r;
    public final j30_0 s;
    public final CoroutineContext t;
    public boolean u;
    public Function2 v;

    public F30() {
        throw null;
    }

    public F30(A30 object, ru3 ru32) {
        zr_1 zr_12;
        zr_1 zr_13;
        pr1$a_0 pr1$a_0;
        this.a = object;
        this.b = ru32;
        Object object2 = new AtomicReference(null);
        this.c = object2;
        this.d = object2 = new Object();
        object2 = new pr1_1(null);
        this.e = pr1$a_0 = new pr1$a_0((pr1_1)object2);
        l73 l732 = new l73();
        boolean bl2 = ((A30)object).d();
        if (bl2) {
            l732.j = object2 = new tr1_1();
        }
        if (bl2 = ((A30)object).f()) {
            l732.g();
        }
        this.f = l732;
        this.g = object2 = new vt2_0();
        this.h = object2 = new pr1_1(null);
        this.i = object2 = new pr1_1(null);
        this.j = object2 = new vt2_0();
        this.k = zr_13 = new zr_1();
        this.l = zr_12 = new zr_1();
        this.m = object2 = new vt2_0();
        this.n = object2 = new vt2_0();
        object2 = new Object();
        ((P30)object2).a = false;
        this.r = object2;
        object2 = new j30_0(ru32, (A30)object, l732, pr1$a_0, zr_13, zr_12, this);
        ((A30)object).n((j30_0)object2);
        this.s = object2;
        boolean cfr_ignored_0 = object instanceof FF2;
        object = J10.a;
    }

    public final void A() {
        Object object3;
        AtomicReference atomicReference = this.c;
        int n3 = 0;
        Object object2 = atomicReference.getAndSet(null);
        boolean bl2 = Intrinsics.areEqual(object2, object3 = tu1_2.b);
        if (!bl2) {
            bl2 = object2 instanceof Set;
            if (bl2) {
                object2 = (Set[])object2;
                this.p((Set)object2, false);
            } else {
                bl2 = object2 instanceof Object[];
                if (bl2) {
                    for (Set set : (Set[])object2) {
                        this.p(set, false);
                    }
                } else {
                    if (object2 == null) {
                        p30_0.d("calling recordModificationsOf and applyChanges concurrently is not supported");
                        throw null;
                    }
                    object2 = new StringBuilder("corrupt pendingModifications drain: ");
                    ((StringBuilder)object2).append(atomicReference);
                    p30_0.d(((StringBuilder)object2).toString());
                    throw null;
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final jk1 B(CF2 var1_1, Ae var2_2, Object var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [13 : 184->189)] java.lang.Throwable
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

    public final void C(Object object) {
        Object object2 = object;
        Object object3 = this.g.a.b(object);
        if (object3 != null) {
            boolean bl2 = object3 instanceof pr1_1;
            vt2_0 vt2_02 = this.m;
            if (bl2) {
                object3 = (pr1_1)object3;
                Object[] objectArray = ((ft2_0)object3).b;
                object3 = ((ft2_0)object3).a;
                int n3 = ((Object)object3).length + -2;
                if (n3 >= 0) {
                    int n4 = 0;
                    while (true) {
                        reference var9_10 = object3[n4];
                        reference var11_11 = var9_10 ^ (long)-1;
                        int n7 = 7;
                        var11_11 = var11_11 << n7 & var9_10;
                        long l2 = -9187201950435737472L;
                        reference cfr_temp_0 = (var11_11 &= l2) - l2;
                        Object object4 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                        if (object4 != false) {
                            int n8 = ~(n4 - n3) >>> 31;
                            int n10 = 8;
                            n8 = 8 - n8;
                            for (n7 = 0; n7 < n8; ++n7) {
                                jk1 jk12;
                                int n14;
                                CF2 cF2;
                                jk1 jk13;
                                long l3 = 0xFFL & var9_10;
                                long l4 = 128L;
                                long l7 = l3 - l4;
                                Object object5 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                                if (object5 < 0 && (jk13 = (cF2 = (CF2)objectArray[n14 = (n4 << 3) + n7]).c(object2)) == (jk12 = jk1.IMMINENT)) {
                                    vt2_02.a(object2, cF2);
                                }
                                var9_10 >>= n10;
                            }
                            if (n8 != n10) break;
                        }
                        if (n4 != n3) {
                            ++n4;
                            continue;
                        }
                        break;
                    }
                }
            } else {
                jk1 jk14;
                jk1 jk15 = ((CF2)(object3 = (CF2)object3)).c(object);
                if (jk15 == (jk14 = jk1.IMMINENT)) {
                    vt2_02.a(object, object3);
                }
            }
        }
    }

    public final void D() {
        P30 p30 = this.r;
        boolean bl2 = p30.a;
        if (!bl2) {
            this.a.getClass();
            bl2 = false;
            p30 = null;
            Intrinsics.areEqual(null, null);
        }
    }

    public final void a() {
        this.o = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(Object object) {
        mp0$a mp0$a;
        Object[] objectArray;
        int n3;
        Object object2;
        F30 f30 = this;
        Object object3 = object;
        Object object4 = this.s;
        int n4 = ((j30_0)object4).z;
        if (n4 > 0) {
            return;
        }
        if ((object4 = ((j30_0)object4).b0()) == null) return;
        n4 = ((CF2)object4).a;
        int n7 = 1;
        ((CF2)object4).a = n4 |= n7;
        int n8 = 0;
        if ((n4 &= 0x20) == 0) {
            int n10;
            object2 = ((CF2)object4).f;
            if (object2 == null) {
                ((CF2)object4).f = object2 = new gr1_1(null);
            }
            n3 = ((CF2)object4).e;
            int n14 = ((gr1_1)object2).e(object3);
            if (n14 < 0) {
                n14 ^= 0xFFFFFFFF;
                n10 = -1;
            } else {
                int[] nArray = ((i62)object2).c;
                n10 = nArray[n14];
            }
            objectArray = ((i62)object2).b;
            objectArray[n14] = object3;
            object2 = ((i62)object2).c;
            object2[n14] = n3;
            n4 = ((CF2)object4).e;
            if (n10 == n4) {
                return;
            }
        }
        if ((n4 = object3 instanceof qb3_0) != 0) {
            object2 = object3;
            object2 = (qb3_0)object3;
            ((qb3_0)object2).v(n7);
        }
        object2 = f30.g;
        ((vt2_0)object2).a(object3, object4);
        n4 = object3 instanceof np0_0;
        if (n4 == 0) return;
        object2 = object3;
        object2 = (np0_0)object3;
        Object object5 = object2.s();
        vt2_0 vt2_02 = f30.j;
        vt2_02.c(object3);
        i62 i622 = ((mp0$a)object5).e;
        objectArray = i622.b;
        long[] lArray = i622.a;
        int n15 = lArray.length + -2;
        if (n15 < 0) {
            mp0$a = object5;
        } else {
            int n16 = 0;
            while (true) {
                long l2 = lArray[n16];
                mp0$a = object5;
                long l3 = l2 ^ (long)-1;
                int n17 = 7;
                l3 = l3 << n17 & l2;
                long l4 = -9187201950435737472L;
                long l7 = (l3 &= l4) - l4;
                Object object6 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object6 != false) {
                    n8 = ~(n16 - n15) >>> 31;
                    n3 = 8;
                    n8 = 8 - n8;
                    for (int i3 = 0; i3 < n8; l2 >>= n3, ++i3) {
                        Object object7;
                        long l8 = l2 & 0xFFL;
                        long l12 = 128L;
                        long l14 = l8 - l12;
                        Object object8 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                        if (object8 >= 0) continue;
                        int n18 = (n16 << 3) + i3;
                        Object object9 = object7 = objectArray[n18];
                        object9 = (pb3_0)object7;
                        n3 = object9 instanceof qb3_0;
                        if (n3 != 0) {
                            object5 = object9;
                            object5 = (qb3_0)object9;
                            ((qb3_0)object5).v(n7);
                        }
                        vt2_02.a(object9, object3);
                        n3 = 8;
                    }
                    if (n8 != n3) break;
                }
                if (n16 == n15) break;
                ++n16;
                object5 = mp0$a;
                n8 = 0;
            }
        }
        object3 = mp0$a;
        object3 = mp0$a.f;
        nr1_1 nr1_12 = ((CF2)object4).g;
        if (nr1_12 == null) {
            n8 = 0;
            ((CF2)object4).g = nr1_12 = new nr1_1(null);
        }
        nr1_12.i(object2, object3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        Object object = this.d;
        synchronized (object) {
            Throwable throwable4;
            block16: {
                Exception exception2;
                block17: {
                    Throwable throwable22;
                    block18: {
                        boolean bl2;
                        Object object2;
                        Object object3;
                        Throwable throwable32;
                        block15: {
                            Object object4;
                            block14: {
                                try {
                                    object4 = this.l;
                                    object4 = ((zr_1)object4).a;
                                    boolean bl3 = ((R92)object4).U();
                                    if (!bl3) break block14;
                                    object4 = this.l;
                                    this.u((zr_1)object4);
                                }
                                catch (Throwable throwable32) {
                                    break block15;
                                }
                            }
                            object4 = Unit.a;
                            return;
                        }
                        try {
                            object3 = this.e;
                            object3 = ((fT2$a)object3).a;
                            boolean bl4 = ((ft2_0)object3).b() ^ true;
                            if (!bl4) throw throwable32;
                        }
                        catch (Throwable throwable4) {
                            break block16;
                        }
                        catch (Exception exception2) {
                            break block17;
                        }
                        {
                            object3 = this.e;
                            object2 = new ArrayList();
                            object2 = new ArrayList();
                            object2 = new ArrayList();
                            object2 = new ArrayList();
                            object2 = ((fT2$a)object3).a;
                            bl2 = ((ft2_0)object2).b() ^ true;
                            if (!bl2) throw throwable32;
                            object2 = "Compose:abandons";
                        }
                        {
                            Trace.beginSection((String)object2);
                        }
                        try {
                            object3 = ((pr1$a_0)object3).iterator();
                            while (true) {
                                object2 = object3;
                                object2 = (PR1$a$a)object3;
                                object2 = ((PR1$a$a)object2).b;
                                bl2 = ((wz2_1)object2).hasNext();
                                if (bl2) {
                                    object2 = object3;
                                    object2 = (PR1$a$a)object3;
                                    object2 = ((PR1$a$a)object2).b;
                                    object2 = ((wz2_1)object2).next();
                                    object2 = (ti2_0)object2;
                                    Object object5 = object3;
                                    object5 = (PR1$a$a)object3;
                                    ((PR1$a$a)object5).remove();
                                    object2.onAbandoned();
                                    continue;
                                }
                                break;
                            }
                        }
                        catch (Throwable throwable22) {
                            break block18;
                        }
                        object3 = Unit.a;
                        Trace.endSection();
                        throw throwable32;
                    }
                    Trace.endSection();
                    throw throwable22;
                }
                this.x();
                throw exception2;
            }
            throw throwable4;
        }
    }

    public final Object d(k80 k802, int n3, Function0 object) {
        boolean bl2;
        if (k802 != null && !(bl2 = Intrinsics.areEqual(k802, this)) && n3 >= 0) {
            k802 = (F30)k802;
            this.p = k802;
            this.q = n3;
            k802 = null;
            n3 = 0;
            try {
                object = object.invoke();
            }
            finally {
                this.p = null;
                this.q = 0;
            }
        } else {
            object = object.invoke();
        }
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void deactivate() {
        var1_1 = this.d;
        synchronized (var1_1) {
            block16: {
                block15: {
                    block14: {
                        try {
                            var2_2 = this.f;
                            var3_5 = var2_2.b;
                            var4_6 = null;
                            var5_7 = true;
                            if (var3_5 > 0) {
                                var3_5 = 1;
                            } else {
                                var3_5 = 0;
                                var2_2 = null;
                            }
                            if (var3_5 != 0) break block14;
                            var6_8 = this.e;
                            var6_8 = var6_8.a;
                            var7_9 = var6_8.b() ^ var5_7;
                            if (var7_9) {
                            }
                            ** GOTO lbl47
                        }
                        catch (Throwable var2_3) {
                            break block16;
                        }
                    }
                    var6_8 = "Compose:deactivate";
                    {
                        Trace.beginSection((String)var6_8);
                    }
                    try {
                        var8_10 = this.e;
                        var6_8 = new F30$a(var8_10);
                        if (var3_5 == 0) break block15;
                        var2_2 = this.b;
                        var2_2.getClass();
                        var2_2 = this.f;
                        var2_2 = var2_2.i();
                    }
                    catch (Throwable var2_4) {
                        ** GOTO lbl-1000
                    }
                    {
                        p30_0.e((q73)var2_2, (F30$a)var6_8);
                        var4_6 = Unit.a;
                    }
                    var2_2.e(var5_7);
                    var2_2 = this.b;
                    var2_2.e();
                    var6_8.b();
                }
                var6_8.a();
                var2_2 = Unit.a;
                {
                    Trace.endSection();
lbl47:
                    // 2 sources

                    var2_2 = this.g;
                    var2_2 = var2_2.a;
                    var2_2.c();
                    var2_2 = this.j;
                    var2_2 = var2_2.a;
                    var2_2.c();
                    var2_2 = this.n;
                    var2_2 = var2_2.a;
                    var2_2.c();
                    var2_2 = this.k;
                    var2_2 = var2_2.a;
                    var2_2.R();
                    var2_2 = this.l;
                    var2_2 = var2_2.a;
                    var2_2.R();
                    var2_2 = this.s;
                    var4_6 = var2_2.D;
                    var4_6 = var4_6.a;
                    var4_6.clear();
                    var4_6 = var2_2.r;
                    var4_6.clear();
                    var4_6 = var2_2.e;
                    var4_6 = var4_6.a;
                    var4_6.R();
                    var4_6 = null;
                    var2_2.u = null;
                    var2_2 = Unit.a;
                }
                return;
lbl-1000:
                // 1 sources

                {
                    Trace.endSection();
                    throw var2_4;
                }
            }
            throw var2_3;
        }
    }

    public final void e(Function2 function2) {
        function2 = (u10)function2;
        boolean bl2 = this.u ^ true;
        if (bl2) {
            this.a.a(this, (u10)function2);
            return;
        }
        sn2.c("The composition is disposed");
        throw null;
    }

    public final void f(uq1_0 object) {
        Object object2 = this.e;
        F30$a f30$a = new F30$a((Set)object2);
        object = ((uq1_0)object).a.i();
        try {
            p30_0.g((q73)object, f30$a);
            object2 = Unit.a;
            ((q73)object).e(true);
            f30$a.b();
            return;
        }
        catch (Throwable throwable) {
            ((q73)object).e(false);
            throw throwable;
        }
    }

    public final void g(u10 u102) {
        boolean bl2;
        int n3;
        j30_0 j30_02 = this.s;
        j30_02.y = n3 = 100;
        j30_02.x = bl2 = true;
        boolean bl3 = this.u;
        bl2 ^= bl3;
        bl3 = false;
        if (bl2) {
            A30 a30 = this.a;
            a30.a(this, u102);
            int n4 = j30_02.E;
            if (n4 == 0 && (n4 = j30_02.y) == n3) {
                j30_02.y = -1;
                j30_02.x = false;
                return;
            }
            sn2.b("Cannot disable reuse from root if it was caused by other groups");
            throw null;
        }
        sn2.c("The composition is disposed");
        throw null;
    }

    public final jk1 h(CF2 cF2, Object object) {
        Object object2;
        int n3 = cF2.a;
        int n4 = n3 & 2;
        if (n4 != 0) {
            cF2.a = n3 |= 4;
        }
        if ((object2 = cF2.c) != null && (n4 = (int)(((Ae)object2).a() ? 1 : 0)) != 0) {
            Object object3 = this.f;
            n4 = (int)(((l73)object3).j((Ae)object2) ? 1 : 0);
            if (n4 == 0) {
                object2 = this.d;
                synchronized (object2) {
                    block9: {
                        boolean bl2;
                        object3 = this.p;
                        if (object3 == null) break block9;
                        object2 = ((F30)object3).s;
                        n4 = (int)(((j30_0)object2).E ? 1 : 0);
                        if (n4 != 0 && (bl2 = ((j30_0)object2).y0(cF2, object))) {
                            return jk1.IMMINENT;
                        }
                    }
                    return jk1.IGNORED;
                    finally {
                    }
                }
            }
            object3 = cF2.d;
            if (object3 != null) {
                return this.B(cF2, (Ae)object2, object);
            }
            return jk1.IGNORED;
        }
        return jk1.IGNORED;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean i() {
        var1_1 = this.d;
        synchronized (var1_1) {
            block18: {
                this.z();
                {
                    block21: {
                        block22: {
                            block20: {
                                block19: {
                                    catch (Throwable var2_5) {
                                        break block18;
                                    }
                                    try {
                                        var2_2 = this.n;
                                        var3_7 = new vt2_0();
                                        this.n = var3_7;
                                        this.D();
                                        var3_7 = this.s;
                                        var4_10 = var3_7.g0(var2_2);
                                        if (var4_10 != false) return var4_10;
                                        this.A();
                                        break block19;
                                    }
                                    catch (Throwable var2_3) {
                                        break block20;
                                    }
                                    catch (Exception var3_8) {
                                        ** GOTO lbl-1000
                                    }
                                }
                                return var4_10;
lbl-1000:
                                // 1 sources

                                {
                                    this.n = var2_2;
                                    throw var3_8;
                                }
                            }
                            try {
                                var3_9 = this.e;
                                var3_9 = var3_9.a;
                                var4_11 = var3_9.b() ^ true;
                                if (var4_11 == false) throw var2_3;
                            }
                            catch (Exception var2_6) {
                                break block21;
                            }
                            {
                                var3_9 = this.e;
                                var5_12 = new ArrayList();
                                var5_12 = new ArrayList();
                                var5_12 = new ArrayList();
                                var5_12 = new ArrayList();
                                var5_12 = var3_9.a;
                                var6_13 = var5_12.b() ^ true;
                                if (var6_13 == false) throw var2_3;
                                var5_12 = "Compose:abandons";
                            }
                            {
                                Trace.beginSection((String)var5_12);
                            }
                            try {
                                var3_9 = var3_9.iterator();
                                while (true) {
                                    var5_12 = var3_9;
                                    var5_12 = (PR1$a$a)var3_9;
                                    var5_12 = var5_12.b;
                                    var6_13 = var5_12.hasNext();
                                    if (var6_13) {
                                        var5_12 = var3_9;
                                        var5_12 = (PR1$a$a)var3_9;
                                        var5_12 = var5_12.b;
                                        var5_12 = var5_12.next();
                                        var5_12 = (ti2_0)var5_12;
                                        var7_14 = var3_9;
                                        var7_14 = (PR1$a$a)var3_9;
                                        var7_14.remove();
                                        var5_12.onAbandoned();
                                        continue;
                                    }
                                    break;
                                }
                            }
                            catch (Throwable var2_4) {
                                break block22;
                            }
                            var3_9 = Unit.a;
                            Trace.endSection();
                            throw var2_3;
                        }
                        Trace.endSection();
                        throw var2_4;
                    }
                    this.x();
                }
                throw var2_6;
            }
            throw var2_5;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void invalidateAll() {
        var1_1 = this.d;
        synchronized (var1_1) {
            block8: {
                block7: {
                    block6: {
                        try {
                            var2_2 /* !! */  = this.f;
                            var2_2 /* !! */  = var2_2 /* !! */ .c;
                            var3_4 = var2_2 /* !! */ .length;
                            var4_5 = 0;
lbl8:
                            // 2 sources

                            while (var4_5 < var3_4) {
                                break block6;
                            }
                            break block7;
                        }
                        catch (Throwable var2_3) {
                            break block8;
                        }
                    }
                    var5_6 = var2_2 /* !! */ [var4_5];
                    var6_7 = var5_6 instanceof CF2;
                    var5_6 = var6_7 != false ? (CF2)var5_6 : null;
                    if (var5_6 != null) {
                        var5_6.invalidate();
                    }
                    ++var4_5;
                    ** GOTO lbl8
                }
                var2_2 /* !! */  = Unit.a;
                return;
            }
            throw var2_3;
        }
    }

    public final boolean isDisposed() {
        return this.u;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j(u10 var1_1) {
        block18: {
            try {
                var2_7 = this.d;
                ** synchronized (var2_7)
            }
            catch (Throwable var1_2) {}
lbl-1000:
            // 1 sources

            {
                try {
                    this.z();
                    var3_8 = this.n;
                    var4_10 = new vt2_0();
                    this.n = var4_10;
                    this.D();
                    var4_10 = this.s;
                    var5_12 = var4_10.e;
                    var5_12 = var5_12.a;
                    var6_13 = var5_12.T();
                    if (var6_13) {
                        var4_10.R(var3_8, (u10)var1_1);
                        return;
                    }
                    var1_1 = "Expected applyChanges() to have been called";
                    p30_0.c((String)var1_1);
                    var1_1 = null;
                    throw null;
                }
                catch (Throwable var1_3) {
                    break block18;
                }
                catch (Exception var1_4) {
                    this.n = var3_8;
                    throw var1_4;
                }
            }
        }
        throw var1_3;
        var2_7 = this.e;
        var2_7 = var2_7.a;
        var7_14 = var2_7.b() ^ true;
        if (var7_14 == false) throw var1_2;
        var2_7 = this.e;
        var3_9 = new ArrayList();
        var3_9 = new ArrayList();
        var3_9 = new ArrayList();
        var3_9 = new ArrayList();
        var3_9 = var2_7.a;
        var8_15 = var3_9.b() ^ true;
        if (var8_15 == false) throw var1_2;
        var3_9 = "Compose:abandons";
        Trace.beginSection((String)var3_9);
        try {
            var2_7 = var2_7.iterator();
            while (true) {
                var3_9 = var2_7;
                var3_9 = (PR1$a$a)var2_7;
                var3_9 = var3_9.b;
                var8_15 = var3_9.hasNext();
                if (var8_15) {
                    var3_9 = var2_7;
                    var3_9 = (PR1$a$a)var2_7;
                    var3_9 = var3_9.b;
                    var3_9 = var3_9.next();
                    var3_9 = (ti2_0)var3_9;
                    var4_11 = var2_7;
                    var4_11 = (PR1$a$a)var2_7;
                    var4_11.remove();
                    var3_9.onAbandoned();
                    continue;
                }
                break;
            }
        }
        catch (Throwable var1_5) {
            ** GOTO lbl71
        }
        var2_7 = Unit.a;
        try {
            Trace.endSection();
            throw var1_2;
lbl71:
            // 1 sources

            Trace.endSection();
            throw var1_5;
        }
        catch (Exception var1_6) {}
        this.x();
        throw var1_6;
    }

    public final void k(Object object, boolean bl2) {
        Object object2 = object;
        Object object3 = this.g.a.b(object);
        if (object3 != null) {
            boolean bl3 = object3 instanceof pr1_1;
            pr1_1 pr1_12 = this.h;
            pr1_1 pr1_13 = this.i;
            vt2_0 vt2_02 = this.m;
            if (bl3) {
                object3 = (pr1_1)object3;
                Object[] objectArray = ((ft2_0)object3).b;
                object3 = ((ft2_0)object3).a;
                int n3 = ((Object)object3).length + -2;
                if (n3 >= 0) {
                    int n4 = 0;
                    while (true) {
                        reference var12_13 = object3[n4];
                        reference var14_14 = var12_13 ^ (long)-1;
                        int n7 = 7;
                        var14_14 = var14_14 << n7 & var12_13;
                        long l2 = -9187201950435737472L;
                        reference cfr_temp_0 = (var14_14 &= l2) - l2;
                        Object object4 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                        if (object4 != false) {
                            int n8;
                            int n10 = ~(n4 - n3) >>> 31;
                            n10 = 8 - n10;
                            for (n7 = 0; n7 < n10; ++n7) {
                                jk1 jk12;
                                Object object5;
                                int n14;
                                CF2 cF2;
                                long l3 = 0xFFL & var12_13;
                                long l4 = 128L;
                                long l7 = l3 - l4;
                                Object object6 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                                if (object6 < 0 && (object4 = (Object)vt2_02.b(object2, cF2 = (CF2)objectArray[n14 = (n4 << 3) + n7])) == false && (object5 = cF2.c(object2)) != (jk12 = jk1.IGNORED)) {
                                    object5 = cF2.g;
                                    if (object5 != null && !bl2) {
                                        pr1_13.d(cF2);
                                    } else {
                                        pr1_12.d(cF2);
                                    }
                                }
                                n8 = 8;
                                var12_13 >>= n8;
                            }
                            n8 = 8;
                            if (n10 != n8) break;
                        }
                        if (n4 != n3) {
                            ++n4;
                            continue;
                        }
                        break;
                    }
                }
            } else {
                jk1 jk13;
                bl3 = vt2_02.b(object, object3 = (CF2)object3);
                if (!bl3 && (object2 = ((CF2)object3).c(object)) != (jk13 = jk1.IGNORED)) {
                    object2 = ((CF2)object3).g;
                    if (object2 != null && !bl2) {
                        pr1_13.d(object3);
                    } else {
                        pr1_12.d(object3);
                    }
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void l(ht2_1 object) {
        Object object2;
        int n3 = 1;
        while (true) {
            Object v4;
            int n4;
            Object object3;
            Object object4;
            int n7;
            if ((object2 = this.c.get()) == null) {
                n7 = 1;
            } else {
                object4 = tu1_2.b;
                n7 = Intrinsics.areEqual(object2, object4);
            }
            if (n7 != 0) {
                object4 = object;
            } else {
                int n8;
                n7 = object2 instanceof Set;
                if (n7 != 0) {
                    n7 = 2;
                    object4 = new Set[n7];
                    n8 = 0;
                    object3 = null;
                    object4[0] = object2;
                    object4[n3] = object;
                } else {
                    n7 = object2 instanceof Object[];
                    if (n7 == 0) break;
                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                    object4 = object2;
                    object4 = (Set[])object2;
                    object3 = "<this>";
                    Intrinsics.checkNotNullParameter(object4, (String)object3);
                    n8 = ((Set[])object4).length;
                    n4 = n8 + 1;
                    object4 = Arrays.copyOf(object4, n4);
                    object4[n8] = object;
                    Intrinsics.checkNotNull(object4);
                }
            }
            object3 = this.c;
            do {
                if ((n4 = ((AtomicReference)object3).compareAndSet(object2, object4)) == 0) continue;
                if (object2 != null) return;
                object = this.d;
                synchronized (object) {
                    this.A();
                    Unit unit = Unit.a;
                    return;
                }
            } while ((v4 = ((AtomicReference)object3).get()) == object2);
        }
        CharSequence charSequence = new StringBuilder("corrupt pendingModifications: ");
        object2 = this.c;
        charSequence.append(object2);
        charSequence = charSequence.toString().toString();
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public final boolean m(Set set) {
        Object object = set;
        boolean bl2 = set instanceof ht2_1;
        vt2_0 vt2_02 = this.j;
        vt2_0 vt2_03 = this.g;
        boolean bl3 = true;
        if (bl2) {
            object = ((ht2_1)set).a;
            Object[] objectArray = ((ft2_0)object).b;
            object = ((ft2_0)object).a;
            int n3 = ((Object)object).length + -2;
            if (n3 >= 0) {
                int n4 = 0;
                while (true) {
                    reference var10_12 = object[n4];
                    reference var12_13 = var10_12 ^ (long)-1;
                    int n7 = 7;
                    var12_13 = var12_13 << n7 & var10_12;
                    long l2 = -9187201950435737472L;
                    reference cfr_temp_0 = (var12_13 &= l2) - l2;
                    Object object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                    if (object2 != false) {
                        int n8 = ~(n4 - n3) >>> 31;
                        int n10 = 8;
                        n8 = 8 - n8;
                        for (n7 = 0; n7 < n8; ++n7) {
                            int n14;
                            Object object3;
                            nr1_1 nr1_12;
                            long l3 = 0xFFL & var10_12;
                            long l4 = 128L;
                            long l7 = l3 - l4;
                            Object object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                            if (object4 < 0 && ((object2 = (Object)(nr1_12 = vt2_03.a).a(object3 = objectArray[n14 = (n4 << 3) + n7])) != false || (n14 = (int)((nr1_12 = vt2_02.a).a(object3) ? 1 : 0)) != 0)) {
                                return bl3;
                            }
                            var10_12 >>= n10;
                        }
                        if (n8 != n10) break;
                    }
                    if (n4 != n3) {
                        ++n4;
                        continue;
                    }
                    break;
                }
            }
        } else {
            object = ((Iterable)set).iterator();
            while (bl2 = object.hasNext()) {
                nr1_1 nr1_13 = vt2_03.a;
                Object e2 = object.next();
                boolean bl4 = nr1_13.a(e2);
                if (!bl4 && !(bl2 = (nr1_13 = vt2_02.a).a(e2))) continue;
                return bl3;
            }
        }
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(ArrayList var1_1) {
        block16: {
            var2_6 = 1;
            var3_7 = var1_1.size();
            var4_8 = 0;
            var5_9 = null;
            for (var6_10 = 0; var6_10 < var3_7; var6_10 += var2_6) {
                var7_11 = ((vQ1)((Pair)var1_1.get((int)var6_10)).a).c;
                var8_12 = Intrinsics.areEqual(var7_11, this);
                if (var8_12) {
                    continue;
                }
                break block16;
            }
            var4_8 = 1;
        }
        p30_0.h((boolean)var4_8);
        var9_13 = this.s;
        var9_13.getClass();
        {
            catch (Throwable var1_2) {
                break block17;
            }
        }
        ** try [egrp 1[TRYBLOCK] [2 : 93->97)] { 
lbl-1000:
        // 1 sources

        {
            catch (Throwable var1_3) {
                var9_13.L();
                throw var1_3;
            }
        }
lbl-1000:
        // 1 sources

        {
            block17: {
                var9_13.d0((ArrayList)var1_1);
                var9_13.N();
                var1_1 = Unit.a;
                return;
            }
            var9_13 = this.e;
        }
        try {
            var5_9 = var9_13.a;
            var4_8 = var5_9.b() ^ var2_6;
            if (var4_8 == 0) throw var1_2;
        }
        catch (Exception var1_5) {
            this.x();
            throw var1_5;
        }
        {
            var5_9 = new ArrayList();
            var5_9 = new ArrayList();
            var5_9 = new ArrayList();
            var5_9 = new ArrayList();
            var5_9 = var9_13.a;
            var4_8 = (int)var5_9.b();
            if ((var2_6 ^= var4_8) == 0) throw var1_2;
            var10_14 = "Compose:abandons";
        }
        {
            Trace.beginSection((String)var10_14);
        }
        try {
            var10_14 = var9_13.iterator();
            while (true) {
                var9_13 = var10_14;
                var9_13 = (PR1$a$a)var10_14;
                var9_13 = var9_13.b;
                var3_7 = (int)var9_13.hasNext();
                if (var3_7 != 0) {
                    var9_13 = var10_14;
                    var9_13 = (PR1$a$a)var10_14;
                    var9_13 = var9_13.b;
                    var9_13 = var9_13.next();
                    var9_13 = (ti2_0)var9_13;
                    var5_9 = var10_14;
                    var5_9 = (PR1$a$a)var10_14;
                    var5_9.remove();
                    var9_13.onAbandoned();
                    continue;
                }
                break;
            }
        }
        catch (Throwable var1_4) {
            ** GOTO lbl72
        }
        var10_14 = Unit.a;
        {
            Trace.endSection();
            throw var1_2;
lbl72:
            // 1 sources

            Trace.endSection();
            throw var1_4;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void o() {
        var1_1 = this.d;
        synchronized (var1_1) {
            try {
                var2_2 = this.s;
                var3_5 = var2_2.E;
                var4_6 = true;
                if (!(var3_5 ^= var4_6)) ** break block16
            }
            catch (Throwable var2_3) {
                break block17;
            }
            var3_5 = this.u;
            if (var3_5) ** GOTO lbl-1000
            this.u = var4_6;
            var5_7 = J10.b;
            var2_2 = var2_2.K;
            if (var2_2 != null) {
                this.u((zr_1)var2_2);
            }
            var2_2 = this.f;
            var6_8 = var2_2.b;
            var3_5 = false;
            var5_7 = null;
            if (var6_8 > 0) {
                var6_8 = 1;
            } else {
                var6_8 = 0;
                var2_2 = null;
            }
            if (var6_8 != 0) ** GOTO lbl-1000
            var7_9 = this.e;
            var7_9 = var7_9.a;
            var8_10 = var7_9.b() ^ var4_6;
            if (!var8_10) ** GOTO lbl54
lbl-1000:
            // 2 sources

            {
                var9_11 = this.e;
                var7_9 = new F30$a(var9_11);
                if (var6_8 == 0) ** GOTO lbl53
                var2_2 = this.b;
                var2_2.getClass();
                var2_2 = this.f;
                var2_2 = var2_2.i();
            }
            p30_0.g((q73)var2_2, (F30$a)var7_9);
            var5_7 = Unit.a;
            {
                catch (Throwable var10_12) {
                    var2_2.e(false);
                    throw var10_12;
                }
                var2_2.e(var4_6);
                var2_2 = this.b;
                var2_2.clear();
                var2_2 = this.b;
                var2_2.e();
                var7_9.b();
lbl53:
                // 2 sources

                var7_9.a();
lbl54:
                // 2 sources

                var2_2 = this.s;
                var2_2.getClass();
                var5_7 = "Compose:Composer.dispose";
                Trace.beginSection((String)var5_7);
            }
            try {
                var5_7 = var2_2.b;
                var5_7.q((b30_0)var2_2);
                var5_7 = var2_2.D;
                var5_7 = var5_7.a;
                var5_7.clear();
                var5_7 = var2_2.r;
                var5_7.clear();
                var5_7 = var2_2.e;
                var5_7 = var5_7.a;
                var5_7.R();
                var2_2.u = null;
                var2_2 = var2_2.a;
                var2_2.clear();
                var2_2 = Unit.a;
            }
            finally {
                Trace.endSection();
            }
lbl-1000:
            // 2 sources

            {
                var2_2 = Unit.a;
            }
        }
        this.a.r(this);
        return;
        {
            block17: {
                var2_2 = "Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.";
                {
                    sn2.c((String)var2_2);
                    throw null;
                }
            }
            throw var2_3;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void p(Set var1_1, boolean var2_2) {
        block80: {
            block84: {
                var3_3 = this;
                var4_4 /* !! */  = var1_1 /* !! */ ;
                var5_5 = var2_2;
                var6_6 = var1_1 /* !! */  instanceof ht2_1;
                var7_7 = this.j;
                var8_8 = 7;
                var9_9 = -9187201950435737472L;
                var11_10 = 8;
                if (var6_6 == 0) break block84;
                var4_4 /* !! */  = ((ht2_1)var1_1 /* !! */ ).a;
                var12_11 /* !! */  = var4_4 /* !! */ .b;
                var4_4 /* !! */  = var4_4 /* !! */ .a;
                var13_12 = var4_4 /* !! */ .length + -2;
                if (var13_12 < 0) break block80;
                var14_13 /* !! */  = 0;
                var15_14 = null;
                while (true) {
                    if ((var22_18 = (cfr_temp_0 = (var20_17 = (var18_16 = (var16_15 = var4_4 /* !! */ [var14_13 /* !! */ ]) ^ (long)-1) << var8_8 & var16_15 & var9_9) - var9_9) == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1)) != false) {
                        var23_19 = ~(var14_13 /* !! */  - var13_12) >>> 31;
                        var23_19 = 8 - var23_19;
                        var24_20 = 0;
                        while (var24_20 < var23_19) {
                            var25_21 = 255L;
                            var27_22 = var16_15 & var25_21;
                            var29_23 = 128L;
                            cfr_temp_1 = var27_22 - var29_23;
                            var22_18 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                            if (var22_18 < 0) {
                                var22_18 = (var14_13 /* !! */  << 3) + var24_20;
                                var31_24 = var12_11 /* !! */ [var22_18];
                                var11_10 = var31_24 instanceof CF2;
                                if (var11_10 != 0) {
                                    var31_24 = (CF2)var31_24;
                                    var11_10 = 0;
                                    var32_25 = null;
                                    var31_24.c(null);
                                } else {
                                    var3_3.k(var31_24, (boolean)var5_5);
                                    var32_25 = var7_7.a;
                                    var31_24 = var32_25.b(var31_24);
                                    if (var31_24 != null) {
                                        var11_10 = var31_24 instanceof pr1_1;
                                        if (var11_10 != 0) {
                                            var31_24 = (pr1_1)var31_24;
                                            var32_25 = var31_24.b;
                                            var31_24 = var31_24.a;
                                            var33_26 = ((Object)var31_24).length + -2;
                                            if (var33_26 >= 0) {
                                                var1_1 /* !! */  = var12_11 /* !! */ ;
                                                var34_27 = var7_7;
                                                var35_28 = 0;
                                                var36_29 /* !! */  = null;
                                                while (true) {
                                                    var37_30 = var31_24[var35_28];
                                                    var39_31 /* !! */  = var23_19;
                                                    var40_32 = var24_20;
                                                    var20_17 = (var37_30 ^ (long)-1) << var8_8 & var37_30;
                                                    var41_33 = -9187201950435737472L;
                                                    cfr_temp_2 = (var20_17 &= var41_33) - var41_33;
                                                    var43_34 /* !! */  = (int)(cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1));
                                                    if (var43_34 /* !! */  != 0) {
                                                        var23_19 = ~(var35_28 - var33_26) >>> 31;
                                                        var23_19 = 8 - var23_19;
                                                        for (var24_20 = 0; var24_20 < var23_19; ++var24_20) {
                                                            var25_21 = 255L;
                                                            var44_35 = var37_30 & var25_21;
                                                            var29_23 = 128L;
                                                            cfr_temp_3 = var44_35 - var29_23;
                                                            var46_36 = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 < 0 ? -1 : 1);
                                                            if (var46_36 < 0) {
                                                                var43_34 /* !! */  = (var35_28 << 3) + var24_20;
                                                                var48_38 = var47_37 = var32_25[var43_34 /* !! */ ];
                                                                var48_38 = (np0_0)var47_37;
                                                                var3_3.k(var48_38, (boolean)var5_5);
                                                            }
                                                            var37_30 >>= 8;
                                                            var8_8 = 7;
                                                        }
                                                        var8_8 = 8;
                                                        if (var23_19 != var8_8) break block79;
                                                    }
                                                    if (var35_28 != var33_26) {
                                                        ++var35_28;
                                                        var23_19 = var39_31 /* !! */ ;
                                                        var24_20 = var40_32;
                                                        var8_8 = 7;
                                                        continue;
                                                    }
                                                    break block79;
                                                    break;
                                                }
                                            }
                                        } else {
                                            block79: {
                                                var1_1 /* !! */  = var12_11 /* !! */ ;
                                                var34_27 = var7_7;
                                                var39_31 /* !! */  = var23_19;
                                                var40_32 = var24_20;
                                                var31_24 = (np0_0)var31_24;
                                                var3_3.k(var31_24, (boolean)var5_5);
                                            }
lbl96:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            var1_1 /* !! */  = var12_11 /* !! */ ;
                            var34_27 = var7_7;
                            var39_31 /* !! */  = var23_19;
                            var40_32 = var24_20;
                            ** continue;
                            var6_6 = 8;
                            var16_15 >>= var6_6;
                            var24_20 = var40_32 + 1;
                            var12_11 /* !! */  = var1_1 /* !! */ ;
                            var7_7 = var34_27;
                            var23_19 = var39_31 /* !! */ ;
                            var8_8 = 7;
                            var9_9 = -9187201950435737472L;
                            var11_10 = 8;
                        }
                        var1_1 /* !! */  = var12_11 /* !! */ ;
                        var34_27 = var7_7;
                        var11_10 = var23_19;
                        var6_6 = 8;
                        if (var23_19 != var6_6) break block80;
                    } else {
                        var1_1 /* !! */  = var12_11 /* !! */ ;
                        var34_27 = var7_7;
                    }
                    if (var14_13 /* !! */  != var13_12) {
                        ++var14_13 /* !! */ ;
                        var12_11 /* !! */  = var1_1 /* !! */ ;
                        var7_7 = var34_27;
                        var8_8 = 7;
                        var9_9 = -9187201950435737472L;
                        var11_10 = 8;
                        continue;
                    }
                    break block80;
                    break;
                }
            }
            var34_27 = var7_7;
            var4_4 /* !! */  = ((Iterable)var1_1 /* !! */ ).iterator();
            while ((var6_6 = var4_4 /* !! */ .hasNext()) != 0) {
                var12_11 /* !! */  = var4_4 /* !! */ .next();
                var49_39 = var12_11 /* !! */  instanceof CF2;
                if (var49_39 != 0) {
                    var12_11 /* !! */  = (CF2)var12_11 /* !! */ ;
                    var49_39 = 0;
                    var7_7 = null;
                    var12_11 /* !! */ .c(null);
                    var50_40 = var34_27;
                } else {
                    var49_39 = 0;
                    var7_7 = null;
                    var3_3.k(var12_11 /* !! */ , (boolean)var5_5);
                    var50_40 = var34_27;
                    var51_41 = var34_27.a;
                    var12_11 /* !! */  = var51_41.b(var12_11 /* !! */ );
                    if (var12_11 /* !! */  != null) {
                        var52_42 = var12_11 /* !! */  instanceof pr1_1;
                        if (var52_42) {
                            var12_11 /* !! */  = (pr1_1)var12_11 /* !! */ ;
                            var51_41 = var12_11 /* !! */ .b;
                            var12_11 /* !! */  = var12_11 /* !! */ .a;
                            var23_19 = var12_11 /* !! */ .length + -2;
                            if (var23_19 >= 0) {
                                var24_20 = 0;
                                while (true) {
                                    var53_43 = var12_11 /* !! */ [var24_20];
                                    var9_9 = (long)(var53_43 ^ (long)-1);
                                    var14_13 /* !! */  = 7;
                                    var9_9 = var9_9 << var14_13 /* !! */  & var53_43;
                                    var55_44 = -9187201950435737472L;
                                    cfr_temp_4 = (var9_9 &= var55_44) - var55_44;
                                    var13_12 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                                    if (var13_12 != 0) {
                                        var33_26 = ~(var24_20 - var23_19) >>> 31;
                                        var35_28 = 8;
                                        var11_10 = 8 - var33_26;
                                        var57_45 = null;
                                        for (var33_26 = 0; var33_26 < var11_10; ++var33_26) {
                                            var58_46 = (long)(var53_43 & 255L);
                                            var60_47 = 128L;
                                            cfr_temp_5 = var58_46 - var60_47;
                                            var13_12 = (int)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                                            if (var13_12 < 0) {
                                                var35_28 = (var24_20 << 3) + var33_26;
                                                var36_29 /* !! */  = (Object[])var51_41[var35_28];
                                                var3_3.k(var36_29 /* !! */ , (boolean)var5_5);
                                            }
                                            var35_28 = 8;
                                            var53_43 >>= var35_28;
                                        }
                                        var35_28 = 8;
                                        if (var11_10 != var35_28) break;
                                    }
                                    if (var24_20 != var23_19) {
                                        ++var24_20;
                                        continue;
                                    }
                                    break;
                                }
                            }
                        } else {
                            var12_11 /* !! */  = (np0_0)var12_11 /* !! */ ;
                            var3_3.k(var12_11 /* !! */ , (boolean)var5_5);
                        }
                    }
                }
                var34_27 = var50_40;
            }
        }
        var12_11 /* !! */  = "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2";
        var7_7 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        var50_40 = var3_3.g;
        var51_41 = var3_3.h;
        if (var5_5 != 0 && (var23_19 = (var62_48 = var3_3.i).c()) != 0) {
            var50_40 = var50_40.a;
            var63_49 = var50_40.a;
            var24_20 = var63_49.length + -2;
            if (var24_20 >= 0) {
                var22_18 = false;
                var31_24 = null;
                while (true) {
                    var64_50 = var63_49[var22_18];
                    var60_47 = var64_50 ^ (long)-1;
                    var11_10 = 7;
                    var60_47 = var60_47 << var11_10 & var64_50;
                    var66_51 = -9187201950435737472L;
                    cfr_temp_6 = (var60_47 &= var66_51) - var66_51;
                    var68_52 /* !! */  = (long)(cfr_temp_6 == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1));
                    if (var68_52 /* !! */  != false) {
                        var35_28 = ~(var22_18 - var24_20) >>> 31;
                        var14_13 /* !! */  = 8;
                        var11_10 = 8 - var35_28;
                        var36_29 /* !! */  = null;
                        for (var35_28 = 0; var35_28 < var11_10; ++var35_28) {
                            var25_21 = 255L;
                            var58_46 = var64_50 & var25_21;
                            var69_53 = 128L;
                            cfr_temp_7 = var58_46 - var69_53;
                            var14_13 /* !! */  = (int)(cfr_temp_7 == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1));
                            if (var14_13 /* !! */  < 0) {
                                var14_13 /* !! */  = (int)((var22_18 << 3) + var35_28);
                                var71_54 = var50_40.b[var14_13 /* !! */ ];
                                var71_54 = var50_40.c[var14_13 /* !! */ ];
                                var72_55 = var71_54 instanceof pr1_1;
                                if (var72_55) {
                                    block82: {
                                        Intrinsics.checkNotNull(var71_54, (String)var7_7);
                                        var71_54 = (pr1_1)var71_54;
                                        var4_4 /* !! */  = var71_54.b;
                                        var3_3 = var71_54.a;
                                        var73_57 = var63_49;
                                        var23_19 = ((Object)var3_3).length + -2;
                                        var34_27 = var7_7;
                                        var2_2 = var24_20;
                                        var39_31 /* !! */  = (int)var22_18;
                                        if (var23_19 >= 0) {
                                            var49_39 = 0;
                                            var7_7 = null;
                                            while (true) {
                                                var18_16 = var3_3[var49_39];
                                                var74_59 = var64_50;
                                                var64_50 = (long)(var18_16 ^ (long)-1);
                                                var76_60 = 7;
                                                var64_50 = var64_50 << var76_60 & var18_16;
                                                var41_33 = -9187201950435737472L;
                                                cfr_temp_8 = (var64_50 &= var41_33) - var41_33;
                                                var46_36 = cfr_temp_8 == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1);
                                                if (var46_36 != false) {
                                                    var8_8 = ~(var49_39 - var23_19) >>> 31;
                                                    var8_8 = 8 - var8_8;
                                                    var57_45 = null;
                                                    for (var33_26 = 0; var33_26 < var8_8; ++var33_26) {
                                                        var25_21 = 255L;
                                                        var77_62 = var18_16 & var25_21;
                                                        var29_23 = 128L;
                                                        cfr_temp_9 = var77_62 - var29_23;
                                                        var79_63 = cfr_temp_9 == 0 ? 0 : (cfr_temp_9 < 0 ? -1 : 1);
                                                        if (var79_63 < 0) {
                                                            var46_36 = var49_39 << 3;
                                                            var80_64 = var3_3;
                                                            var81_66 = var46_36 + var33_26;
                                                            var82_68 = var4_4 /* !! */ [var81_66];
                                                            var83_70 = var4_4 /* !! */ ;
                                                            var4_4 /* !! */  = var82_68;
                                                            var4_4 /* !! */  = (CF2)var82_68;
                                                            var46_36 = var62_48.a(var4_4 /* !! */ );
                                                            if (var46_36 != false || (var72_55 = var51_41.a(var4_4 /* !! */ ))) {
                                                                var71_54.k((int)var81_66);
                                                            }
lbl275:
                                                            // 4 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        var80_64 = var3_3;
                                                        var83_70 = var4_4 /* !! */ ;
                                                        ** continue;
                                                        var81_66 = (reference)8;
                                                        var18_16 >>= var81_66;
                                                        var3_3 = var80_64;
                                                        var4_4 /* !! */  = var83_70;
                                                    }
                                                    var80_64 = var3_3;
                                                    var83_70 = var4_4 /* !! */ ;
                                                    var81_66 = (reference)8;
                                                    if (var8_8 != var81_66) break block82;
                                                } else {
                                                    var80_64 = var3_3;
                                                    var83_70 = var4_4 /* !! */ ;
                                                }
                                                if (var49_39 != var23_19) {
                                                    ++var49_39;
                                                    var64_50 = var74_59;
                                                    var3_3 = var80_64;
                                                    var4_4 /* !! */  = var83_70;
                                                    continue;
                                                }
                                                break block82;
                                                break;
                                            }
                                        }
                                        var74_59 = var64_50;
                                    }
                                    var81_66 = (reference)var71_54.b();
                                } else {
                                    var34_27 = var7_7;
                                    var73_57 = var63_49;
                                    var2_2 = var24_20;
                                    var39_31 /* !! */  = (int)var22_18;
                                    var74_59 = var64_50;
                                    Intrinsics.checkNotNull(var71_54, (String)var12_11 /* !! */ );
                                    var71_54 = (CF2)var71_54;
                                    var81_66 = (reference)var62_48.a(var71_54);
                                    if (var81_66 == false && (var81_66 = (reference)var51_41.a(var71_54)) == false) {
                                        var81_66 = (reference)false;
                                        var3_3 = null;
                                    } else {
                                        var81_66 = (reference)true;
                                    }
                                }
                                if (var81_66 != false) {
                                    var50_40.h(var14_13 /* !! */ );
                                }
lbl319:
                                // 4 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var34_27 = var7_7;
                            var73_57 = var63_49;
                            var2_2 = var24_20;
                            var39_31 /* !! */  = (int)var22_18;
                            var74_59 = var64_50;
                            ** continue;
                            var81_66 = (reference)8;
                            var64_50 = var74_59 >> var81_66;
                            var3_3 = this;
                            var24_20 = var2_2;
                            var63_49 = var73_57;
                            var7_7 = var34_27;
                            var22_18 = var39_31 /* !! */ ;
                        }
                        var34_27 = var7_7;
                        var73_57 = var63_49;
                        var2_2 = var24_20;
                        var39_31 /* !! */  = (int)var22_18;
                        var81_66 = (reference)8;
                        if (var11_10 != var81_66) break;
                        var81_66 = var22_18;
                    } else {
                        var34_27 = var7_7;
                        var73_57 = var63_49;
                        var81_66 = var22_18;
                    }
                    if (var81_66 == var24_20) break;
                    var22_18 = var81_66 + true;
                    var3_3 = this;
                    var63_49 = var73_57;
                    var7_7 = var34_27;
                }
            }
            var62_48.e();
            this.w();
        } else {
            var34_27 = var7_7;
            var81_67 = var51_41.c();
            if (var81_67) {
                var3_3 = var50_40.a;
                var4_4 /* !! */  = var3_3.a;
                var5_5 = var4_4 /* !! */ .length + -2;
                if (var5_5 >= 0) {
                    var49_39 = 0;
                    var7_7 = null;
                    while (true) {
                        var20_17 = var4_4 /* !! */ [var49_39];
                        var53_43 = (var20_17 ^ (long)-1) << 7 & var20_17;
                        var9_9 = -9187201950435737472L;
                        cfr_temp_10 = (var53_43 &= var9_9) - var9_9;
                        var84_71 = cfr_temp_10 == 0 ? 0 : (cfr_temp_10 < 0 ? -1 : 1);
                        if (var84_71 != false) {
                            var84_71 = ~(var49_39 - var5_5) >>> 31;
                            var22_18 = 8;
                            var11_10 = 8 - var84_71;
                            var84_71 = false;
                            var50_40 = null;
                            while (var84_71 < var11_10) {
                                var9_9 = (long)(var20_17 & 255L);
                                var53_43 = (reference)128L;
                                cfr_temp_11 = var9_9 - var53_43;
                                var14_13 /* !! */  = (int)(cfr_temp_11 == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1));
                                if (var14_13 /* !! */  < 0) {
                                    var22_18 = true;
                                } else {
                                    var22_18 = false;
                                    var31_24 = null;
                                }
                                if (var22_18 != false) {
                                    var22_18 = (var49_39 << 3) + var84_71;
                                    var48_38 = var3_3.b[var22_18];
                                    var48_38 = var3_3.c[var22_18];
                                    var33_26 = var48_38 instanceof pr1_1;
                                    if (var33_26 != 0) {
                                        block83: {
                                            var57_45 = var34_27;
                                            Intrinsics.checkNotNull(var48_38, (String)var34_27);
                                            var48_38 = (pr1_1)var48_38;
                                            var36_29 /* !! */  = var48_38.b;
                                            var15_14 = var48_38.a;
                                            var13_12 = var15_14.length + -2;
                                            var73_58 = var4_4 /* !! */ ;
                                            var2_2 = var49_39;
                                            var85_72 = var84_71;
                                            if (var13_12 >= 0) {
                                                var72_56 = 0;
                                                var4_4 /* !! */  = null;
                                                while (true) {
                                                    var86_73 = var15_14[var72_56];
                                                    var88_74 = var15_14;
                                                    var39_31 /* !! */  = var11_10;
                                                    var55_44 = var86_73 ^ (long)-1;
                                                    var43_34 /* !! */  = 7;
                                                    var55_44 = var55_44 << var43_34 /* !! */  & var86_73;
                                                    var41_33 = -9187201950435737472L;
                                                    cfr_temp_12 = (var55_44 &= var41_33) - var41_33;
                                                    var76_61 /* !! */  = (long)(cfr_temp_12 == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1));
                                                    if (var76_61 /* !! */  != false) {
                                                        var14_13 /* !! */  = ~(var72_56 - var13_12) >>> 31;
                                                        var14_13 /* !! */  = 8 - var14_13 /* !! */ ;
                                                        var32_25 = null;
                                                        for (var11_10 = 0; var11_10 < var14_13 /* !! */ ; ++var11_10) {
                                                            var25_21 = 255L;
                                                            var89_75 = var86_73 & var25_21;
                                                            var29_23 = 128L;
                                                            cfr_temp_13 = var89_75 - var29_23;
                                                            var91_76 /* !! */  = (long)(cfr_temp_13 == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1));
                                                            if (var91_76 /* !! */  < 0) {
                                                                var76_61 /* !! */  = 1;
                                                            } else {
                                                                var76_61 /* !! */  = 0;
                                                                var92_77 = null;
                                                            }
                                                            if (var76_61 /* !! */  != false) {
                                                                var76_61 /* !! */  = var72_56 << 3;
                                                                var82_69 = var57_45;
                                                                var33_26 = (int)(var76_61 /* !! */  + var11_10);
                                                                var92_77 = var36_29 /* !! */ [var33_26];
                                                                var80_65 = var36_29 /* !! */ ;
                                                                var36_29 /* !! */  = var92_77;
                                                                var36_29 /* !! */  = (CF2)var92_77;
                                                                var35_28 = (int)var51_41.a(var36_29 /* !! */ );
                                                                if (var35_28 != 0) {
                                                                    var48_38.k(var33_26);
                                                                }
lbl440:
                                                                // 4 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                            var82_69 = var57_45;
                                                            var80_65 = var36_29 /* !! */ ;
                                                            ** continue;
                                                            var33_26 = 8;
                                                            var86_73 >>= var33_26;
                                                            var57_45 = var82_69;
                                                            var36_29 /* !! */  = var80_65;
                                                        }
                                                        var82_69 = var57_45;
                                                        var80_65 = var36_29 /* !! */ ;
                                                        var33_26 = 8;
                                                        var29_23 = 128L;
                                                        var25_21 = 255L;
                                                        if (var14_13 /* !! */  != var33_26) break block83;
                                                    } else {
                                                        var82_69 = var57_45;
                                                        var80_65 = var36_29 /* !! */ ;
                                                        var29_23 = 128L;
                                                        var25_21 = 255L;
                                                    }
                                                    if (var72_56 != var13_12) {
                                                        ++var72_56;
                                                        var11_10 = var39_31 /* !! */ ;
                                                        var15_14 = var88_74;
                                                        var57_45 = var82_69;
                                                        var36_29 /* !! */  = var80_65;
                                                        continue;
                                                    }
                                                    break block83;
                                                    break;
                                                }
                                            }
                                            var82_69 = var34_27;
                                            var39_31 /* !! */  = var11_10;
                                            var29_23 = 128L;
                                            var25_21 = 255L;
                                            var41_33 = -9187201950435737472L;
                                            var43_34 /* !! */  = 7;
                                        }
                                        var72_56 = (int)var48_38.b();
                                    } else {
                                        var73_58 = var4_4 /* !! */ ;
                                        var2_2 = var49_39;
                                        var39_31 /* !! */  = var11_10;
                                        var82_69 = var34_27;
                                        var29_23 = 128L;
                                        var25_21 = 255L;
                                        var41_33 = -9187201950435737472L;
                                        var43_34 /* !! */  = 7;
                                        var85_72 = var84_71;
                                        Intrinsics.checkNotNull(var48_38, (String)var12_11 /* !! */ );
                                        var48_38 = (CF2)var48_38;
                                        var72_56 = (int)var51_41.a(var48_38);
                                    }
                                    if (var72_56 != 0) {
                                        var3_3.h((int)var22_18);
                                    }
lbl493:
                                    // 4 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var73_58 = var4_4 /* !! */ ;
                                var2_2 = var49_39;
                                var39_31 /* !! */  = var11_10;
                                var82_69 = var34_27;
                                var29_23 = 128L;
                                var25_21 = 255L;
                                var41_33 = -9187201950435737472L;
                                var43_34 /* !! */  = 7;
                                var85_72 = var84_71;
                                ** continue;
                                var72_56 = 8;
                                var20_17 >>= var72_56;
                                var84_71 = var85_72 + true;
                                var49_39 = var2_2;
                                var4_4 /* !! */  = var73_58;
                                var11_10 = var39_31 /* !! */ ;
                                var34_27 = var82_69;
                            }
                            var73_58 = var4_4 /* !! */ ;
                            var2_2 = var49_39;
                            var82_69 = var34_27;
                            var72_56 = 8;
                            var29_23 = 128L;
                            var25_21 = 255L;
                            var41_33 = -9187201950435737472L;
                            var43_34 /* !! */  = 7;
                            if (var11_10 != var72_56) break;
                        } else {
                            var73_58 = var4_4 /* !! */ ;
                            var82_69 = var34_27;
                            var72_56 = 8;
                            var29_23 = 128L;
                            var25_21 = 255L;
                            var41_33 = -9187201950435737472L;
                            var43_34 /* !! */  = 7;
                        }
                        if (var49_39 == var5_5) break;
                        ++var49_39;
                        var4_4 /* !! */  = var73_58;
                        var34_27 = var82_69;
                    }
                }
                this.w();
                var51_41.e();
            }
        }
    }

    public final void q(IF2 iF2) {
        j30_0 j30_02 = this.s;
        boolean bl2 = j30_02.E;
        boolean bl3 = true;
        if (bl2 ^= bl3) {
            j30_02.E = bl3;
            bl2 = false;
            try {
                iF2.invoke();
                return;
            }
            finally {
                j30_02.E = false;
            }
        }
        p30_0.c("Preparing a composition while composing is not supported");
        throw null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void r() {
        Object object = this.d;
        synchronized (object) {
            try {
                Object object2 = this.k;
                this.u((zr_1)object2);
                this.A();
                object2 = Unit.a;
            }
            catch (Throwable throwable) {
                Throwable throwable22;
                block14: {
                    Exception exception2;
                    block15: {
                        Throwable throwable32;
                        block16: {
                            boolean bl2;
                            Object object3;
                            Object object4;
                            try {
                                object4 = this.e;
                                object4 = ((fT2$a)object4).a;
                                boolean bl3 = ((ft2_0)object4).b() ^ true;
                                if (!bl3) throw throwable;
                            }
                            catch (Throwable throwable22) {
                                break block14;
                            }
                            catch (Exception exception2) {
                                break block15;
                            }
                            {
                                object4 = this.e;
                                object3 = new ArrayList();
                                object3 = new ArrayList();
                                object3 = new ArrayList();
                                object3 = new ArrayList();
                                object3 = ((fT2$a)object4).a;
                                bl2 = ((ft2_0)object3).b() ^ true;
                                if (!bl2) throw throwable;
                                object3 = "Compose:abandons";
                            }
                            {
                                Trace.beginSection((String)object3);
                            }
                            try {
                                object4 = ((pr1$a_0)object4).iterator();
                                while (true) {
                                    object3 = object4;
                                    object3 = (PR1$a$a)object4;
                                    object3 = ((PR1$a$a)object3).b;
                                    bl2 = ((wz2_1)object3).hasNext();
                                    if (bl2) {
                                        object3 = object4;
                                        object3 = (PR1$a$a)object4;
                                        object3 = ((PR1$a$a)object3).b;
                                        object3 = ((wz2_1)object3).next();
                                        object3 = (ti2_0)object3;
                                        Object object5 = object4;
                                        object5 = (PR1$a$a)object4;
                                        ((PR1$a$a)object5).remove();
                                        object3.onAbandoned();
                                        continue;
                                    }
                                    break;
                                }
                            }
                            catch (Throwable throwable32) {
                                break block16;
                            }
                            object4 = Unit.a;
                            Trace.endSection();
                            throw throwable;
                        }
                        Trace.endSection();
                        throw throwable32;
                    }
                    this.x();
                    throw exception2;
                }
                throw throwable22;
            }
            return;
        }
    }

    public final boolean s() {
        return this.s.E;
    }

    /*
     * Exception decompiling
     */
    public final void t(Object var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [12 : 278->283)] java.lang.Throwable
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
    public final void u(zr_1 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 27[TRYBLOCK] [35 : 718->723)] java.lang.Throwable
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
     */
    public final boolean v() {
        Object object = this.d;
        synchronized (object) {
            void var3_7;
            block6: {
                Object object2 = this.n;
                object2 = ((vt2_0)object2).a;
                int bl2 = ((dt2_0)object2).e;
                if (bl2 > 0) {
                    boolean bl3 = true;
                    break block6;
                }
                boolean bl4 = false;
                object2 = null;
            }
            return (boolean)var3_7;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void w() {
        var1_1 = this;
        var2_2 = this.j.a;
        var3_3 /* !! */  = var2_2.a;
        var4_4 = var3_3 /* !! */ .length + -2;
        var5_5 = 255L;
        var7_6 = 7;
        var8_7 = -9187201950435737472L;
        var10_8 = 8;
        if (var4_4 < 0) ** GOTO lbl143
        var11_9 = 0;
        block0: while (true) {
            block37: {
                block36: {
                    if ((var16_12 = (cfr_temp_0 = (var14_11 = ((var12_10 = var3_3 /* !! */ [var11_9]) ^ (long)-1) << var7_6 & var12_10 & var8_7) - var8_7) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) break block36;
                    var17_13 = ~(var11_9 - var4_4) >>> 31;
                    var17_13 = 8 - var17_13;
                    var18_14 = 0;
                    while (var18_14 < var17_13) {
                        var19_15 = var12_10 & var5_5;
                        var21_16 = 128L;
                        cfr_temp_1 = var19_15 - var21_16;
                        var23_17 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                        if (var23_17 /* !! */  < 0) {
                            var16_12 = var11_9 << 3;
                            var24_18 = var16_12 + var18_14;
                            var25_19 = var2_2.b[var24_18];
                            var25_19 = var2_2.c[var24_18];
                            var26_20 = var25_19 instanceof pr1_1;
                            var27_21 = var1_1.g;
                            if (var26_20 != 0) {
                                block35: {
                                    Intrinsics.checkNotNull(var25_19, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                    var25_19 = (pr1_1)var25_19;
                                    var28_22 /* !! */  = var25_19.b;
                                    var29_23 = var25_19.a;
                                    var30_24 = var29_23.length + -2;
                                    var31_25 /* !! */  = var3_3 /* !! */ ;
                                    var32_26 = var4_4;
                                    if (var30_24 >= 0) {
                                        var7_6 = 0;
                                        var33_27 = null;
                                        while (true) {
                                            var34_28 = var29_23[var7_6];
                                            var36_29 = var17_13;
                                            var37_30 = var18_14;
                                            var14_11 = var34_28 ^ (long)-1;
                                            var38_31 = 7;
                                            var14_11 = var14_11 << var38_31 & var34_28;
                                            var39_32 = -9187201950435737472L;
                                            cfr_temp_2 = (var14_11 &= var39_32) - var39_32;
                                            var41_33 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                            if (var41_33 /* !! */  != false) {
                                                var17_13 = ~(var7_6 - var30_24) >>> 31;
                                                var17_13 = 8 - var17_13;
                                                for (var18_14 = 0; var18_14 < var17_13; ++var18_14) {
                                                    var42_34 = 255L;
                                                    var44_35 = var34_28 & var42_34;
                                                    var21_16 = 128L;
                                                    cfr_temp_3 = var44_35 - var21_16;
                                                    var46_36 /* !! */  = (long)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                                    if (var46_36 /* !! */  < 0) {
                                                        var41_33 /* !! */  = var7_6 << 3;
                                                        var47_37 = var29_23;
                                                        var48_38 = var41_33 /* !! */  + var18_14;
                                                        var49_39 = var28_22 /* !! */ [var48_38];
                                                        var50_40 = var28_22 /* !! */ ;
                                                        var28_22 /* !! */  = var49_39;
                                                        var28_22 /* !! */  = (np0_0)var49_39;
                                                        var1_1 = var27_21.a;
                                                        var51_41 = (int)var1_1.a(var28_22 /* !! */ );
                                                        var26_20 = 1;
                                                        if ((var51_41 ^= var26_20) != 0) {
                                                            var25_19.k((int)var48_38);
                                                        }
lbl71:
                                                        // 4 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    var50_40 = var28_22 /* !! */ ;
                                                    var47_37 = var29_23;
                                                    ** continue;
                                                    var51_41 = 8;
                                                    var34_28 >>= var51_41;
                                                    var1_1 = this;
                                                    var29_23 = var47_37;
                                                    var28_22 /* !! */  = var50_40;
                                                }
                                                var50_40 = var28_22 /* !! */ ;
                                                var47_37 = var29_23;
                                                var51_41 = 8;
                                                if (var17_13 != var51_41) break block35;
                                            } else {
                                                var50_40 = var28_22 /* !! */ ;
                                                var47_37 = var29_23;
                                            }
                                            if (var7_6 != var30_24) {
                                                ++var7_6;
                                                var1_1 = this;
                                                var17_13 = var36_29;
                                                var18_14 = var37_30;
                                                var29_23 = var47_37;
                                                var28_22 /* !! */  = var50_40;
                                                continue;
                                            }
                                            break block35;
                                            break;
                                        }
                                    }
                                    var36_29 = var17_13;
                                    var37_30 = var18_14;
                                }
                                var26_20 = (int)var25_19.b();
                            } else {
                                var31_25 /* !! */  = var3_3 /* !! */ ;
                                var32_26 = var4_4;
                                var36_29 = var17_13;
                                var37_30 = var18_14;
                                Intrinsics.checkNotNull(var25_19, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                var25_19 = (np0_0)var25_19;
                                var1_1 = var27_21.a;
                                var51_41 = (int)var1_1.a(var25_19);
                                if (var51_41 == 0) {
                                    var26_20 = 1;
                                } else {
                                    var26_20 = 0;
                                    var28_22 /* !! */  = null;
                                }
                            }
                            if (var26_20 != 0) {
                                var2_2.h((int)var24_18);
                            }
lbl119:
                            // 4 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var31_25 /* !! */  = var3_3 /* !! */ ;
                        var32_26 = var4_4;
                        var36_29 = var17_13;
                        var37_30 = var18_14;
                        ** continue;
                        var51_41 = 8;
                        var12_10 >>= var51_41;
                        var18_14 = var37_30 + 1;
                        var1_1 = this;
                        var3_3 /* !! */  = var31_25 /* !! */ ;
                        var4_4 = var32_26;
                        var17_13 = var36_29;
                        var5_5 = 255L;
                        var7_6 = 7;
                        var8_7 = -9187201950435737472L;
                        var10_8 = 8;
                    }
                    var31_25 /* !! */  = var3_3 /* !! */ ;
                    var32_26 = var4_4;
                    var10_8 = var17_13;
                    var51_41 = 8;
                    if (var17_13 == var51_41) break block37;
lbl143:
                    // 3 sources

                    break block0;
                }
                var31_25 /* !! */  = var3_3 /* !! */ ;
            }
            if (var11_9 == var4_4) ** continue;
            ++var11_9;
            var1_1 = this;
            var3_3 /* !! */  = var31_25 /* !! */ ;
            var5_5 = 255L;
            var7_6 = 7;
            var8_7 = -9187201950435737472L;
            var10_8 = 8;
        }
        var1_1 = this;
        var2_2 = this.i;
        var52_42 = var2_2.c();
        if (var52_42) {
            var3_3 /* !! */  = (long[])var2_2.b;
            var53_43 = var2_2.a;
            var54_44 = var53_43.length + -2;
            if (var54_44 >= 0) {
                var55_45 = 0;
                while (true) {
                    var14_11 = var53_43[var55_45];
                    var5_5 = var14_11 ^ (long)-1;
                    var7_6 = 7;
                    var5_5 = var5_5 << var7_6 & var14_11;
                    var8_7 = -9187201950435737472L;
                    cfr_temp_4 = (var5_5 &= var8_7) - var8_7;
                    var10_8 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                    if (var10_8 != 0) {
                        var56_46 = ~(var55_45 - var54_44) >>> 31;
                        var26_20 = 8;
                        var10_8 = 8 - var56_46;
                        var25_19 = null;
                        for (var56_46 = 0; var56_46 < var10_8; ++var56_46) {
                            var57_47 = 255L;
                            var42_34 = var14_11 & var57_47;
                            var21_16 = 128L;
                            cfr_temp_5 = var42_34 - var21_16;
                            var26_20 = (int)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                            if (var26_20 < 0) {
                                var26_20 = 1;
                            } else {
                                var26_20 = 0;
                                var28_22 /* !! */  = null;
                            }
                            if (var26_20 != 0) {
                                var26_20 = (var55_45 << 3) + var56_46;
                                var59_48 = var3_3 /* !! */ [var26_20];
                                var33_27 = (nr1_1)var59_48;
                                var33_27 = ((CF2)var59_48).g;
                                if (var33_27 != null) {
                                    var7_6 = 1;
                                    var60_49 = true;
                                } else {
                                    var7_6 = 1;
                                    var60_49 = false;
                                }
                                if (var60_49 ^= true) {
                                    var2_2.k(var26_20);
                                }
lbl204:
                                // 4 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var7_6 = 1;
                            ** continue;
                            var26_20 = 8;
                            var14_11 >>= var26_20;
                            var7_6 = 7;
                        }
                        var26_20 = 8;
                        var7_6 = 1;
                        var57_47 = 255L;
                        var21_16 = 128L;
                        if (var10_8 != var26_20) break;
                    } else {
                        var26_20 = 8;
                        var7_6 = 1;
                        var57_47 = 255L;
                        var21_16 = 128L;
                    }
                    if (var55_45 == var54_44) break;
                    ++var55_45;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void x() {
        Throwable throwable2;
        block4: {
            this.c.set(null);
            this.k.a.R();
            this.l.a.R();
            Object object = this.e;
            Object object2 = ((fT2$a)object).a;
            boolean bl2 = ((ft2_0)object2).b() ^ true;
            if (!bl2) return;
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new ArrayList();
            object2 = ((fT2$a)object).a;
            bl2 = ((ft2_0)object2).b() ^ true;
            if (!bl2) return;
            object2 = "Compose:abandons";
            Trace.beginSection((String)object2);
            try {
                object = ((pr1$a_0)object).iterator();
                while (true) {
                    object2 = object;
                    object2 = (PR1$a$a)object;
                    object2 = ((PR1$a$a)object2).b;
                    bl2 = ((wz2_1)object2).hasNext();
                    if (bl2) {
                        object2 = object;
                        object2 = (PR1$a$a)object;
                        object2 = ((PR1$a$a)object2).b;
                        object2 = ((wz2_1)object2).next();
                        object2 = (ti2_0)object2;
                        Object object3 = object;
                        object3 = (PR1$a$a)object;
                        ((PR1$a$a)object3).remove();
                        object2.onAbandoned();
                        continue;
                    }
                    break;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            object = Unit.a;
            Trace.endSection();
            return;
        }
        Trace.endSection();
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void y() {
        Object object = this.d;
        synchronized (object) {
            Throwable throwable5;
            block24: {
                Exception exception2;
                block25: {
                    Throwable throwable22;
                    block26: {
                        boolean bl2;
                        Object object2;
                        Throwable throwable32;
                        Object object3;
                        boolean bl3;
                        block22: {
                            Object object4;
                            block21: {
                                Throwable throwable42;
                                block23: {
                                    try {
                                        object4 = this.s;
                                        bl3 = false;
                                        object3 = null;
                                        ((j30_0)object4).u = null;
                                        object4 = this.e;
                                        object4 = ((fT2$a)object4).a;
                                        boolean bl4 = ((ft2_0)object4).b() ^ true;
                                        if (!bl4) break block21;
                                    }
                                    catch (Throwable throwable32) {
                                        break block22;
                                    }
                                    {
                                        object4 = this.e;
                                        object3 = new ArrayList();
                                        object3 = new ArrayList();
                                        object3 = new ArrayList();
                                        object3 = new ArrayList();
                                        object3 = ((fT2$a)object4).a;
                                        bl3 = ((ft2_0)object3).b() ^ true;
                                        if (!bl3) break block21;
                                        object3 = "Compose:abandons";
                                    }
                                    {
                                        Trace.beginSection((String)object3);
                                    }
                                    try {
                                        object4 = ((pr1$a_0)object4).iterator();
                                        while (true) {
                                            object3 = object4;
                                            object3 = (PR1$a$a)object4;
                                            object3 = ((PR1$a$a)object3).b;
                                            bl3 = ((wz2_1)object3).hasNext();
                                            if (bl3) {
                                                object3 = object4;
                                                object3 = (PR1$a$a)object4;
                                                object3 = ((PR1$a$a)object3).b;
                                                object3 = ((wz2_1)object3).next();
                                                object3 = (ti2_0)object3;
                                                object2 = object4;
                                                object2 = (PR1$a$a)object4;
                                                ((PR1$a$a)object2).remove();
                                                object3.onAbandoned();
                                                continue;
                                            }
                                            break;
                                        }
                                    }
                                    catch (Throwable throwable42) {
                                        break block23;
                                    }
                                    object4 = Unit.a;
                                    Trace.endSection();
                                    break block21;
                                }
                                Trace.endSection();
                                throw throwable42;
                            }
                            object4 = Unit.a;
                            return;
                        }
                        try {
                            object3 = this.e;
                            object3 = ((fT2$a)object3).a;
                            bl3 = ((ft2_0)object3).b() ^ true;
                            if (!bl3) throw throwable32;
                        }
                        catch (Throwable throwable5) {
                            break block24;
                        }
                        catch (Exception exception2) {
                            break block25;
                        }
                        {
                            object3 = this.e;
                            object2 = new ArrayList();
                            object2 = new ArrayList();
                            object2 = new ArrayList();
                            object2 = new ArrayList();
                            object2 = ((fT2$a)object3).a;
                            bl2 = ((ft2_0)object2).b() ^ true;
                            if (!bl2) throw throwable32;
                            object2 = "Compose:abandons";
                        }
                        {
                            Trace.beginSection((String)object2);
                        }
                        try {
                            object3 = ((pr1$a_0)object3).iterator();
                            while (true) {
                                object2 = object3;
                                object2 = (PR1$a$a)object3;
                                object2 = ((PR1$a$a)object2).b;
                                bl2 = ((wz2_1)object2).hasNext();
                                if (bl2) {
                                    object2 = object3;
                                    object2 = (PR1$a$a)object3;
                                    object2 = ((PR1$a$a)object2).b;
                                    object2 = ((wz2_1)object2).next();
                                    object2 = (ti2_0)object2;
                                    Object object5 = object3;
                                    object5 = (PR1$a$a)object3;
                                    ((PR1$a$a)object5).remove();
                                    object2.onAbandoned();
                                    continue;
                                }
                                break;
                            }
                        }
                        catch (Throwable throwable22) {
                            break block26;
                        }
                        object3 = Unit.a;
                        Trace.endSection();
                        throw throwable32;
                    }
                    Trace.endSection();
                    throw throwable22;
                }
                this.x();
                throw exception2;
            }
            throw throwable5;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void z() {
        AtomicReference atomicReference = this.c;
        Object object = tu1_2.b;
        Set[] setArray = atomicReference.getAndSet(object);
        if (setArray == null) return;
        int n3 = Intrinsics.areEqual(setArray, object);
        Set set = null;
        if (n3 != 0) {
            p30_0.d("pending composition has not been applied");
            throw null;
        }
        n3 = setArray instanceof Set;
        boolean bl2 = true;
        if (n3 != 0) {
            setArray = (Set)setArray;
            this.p((Set)setArray, bl2);
            return;
        }
        n3 = setArray instanceof Object[];
        if (n3 == 0) {
            object = new StringBuilder("corrupt pendingModifications drain: ");
            ((StringBuilder)object).append(atomicReference);
            p30_0.d(((StringBuilder)object).toString());
            throw null;
        }
        setArray = setArray;
        int n4 = setArray.length;
        n3 = 0;
        object = null;
        while (n3 < n4) {
            set = setArray[n3];
            this.p(set, bl2);
            ++n3;
        }
    }
}


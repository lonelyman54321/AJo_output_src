/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public final class FF2
extends A30 {
    public static final kb3_2 v;
    public static final AtomicReference w;
    public final WD a;
    public final Object b;
    public i c;
    public Throwable d;
    public final ArrayList e;
    public List f;
    public pr1_1 g;
    public final WR1 h;
    public final ArrayList i;
    public final ArrayList j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public ArrayList m;
    public Set n;
    public bl_2 o;
    public FF2$b p;
    public boolean q;
    public final kb3_2 r;
    public final xl1_2 s;
    public final CoroutineContext t;
    public final FF2$c u;

    static {
        AtomicReference<Boolean> atomicReference;
        v = lb3_2.a(jr2_1.e);
        Boolean bl2 = Boolean.FALSE;
        w = atomicReference = new AtomicReference<Boolean>(bl2);
    }

    public FF2(CoroutineContext object) {
        WD wD;
        Object object2 = new FF2$e(this);
        this.a = wD = new WD((FF2$e)object2);
        this.b = object2 = new Object();
        object2 = new ArrayList();
        this.e = object2;
        this.g = object2 = new pr1_1(null);
        k80[] k80Array = new k80[16];
        this.h = object2 = new WR1(k80Array);
        object2 = new ArrayList();
        this.i = object2;
        object2 = new ArrayList();
        this.j = object2;
        this.k = object2;
        super();
        this.l = object2;
        this.r = object2 = lb3_2.a((Object)FF2$d.Inactive);
        object2 = i$a.a;
        object2 = (i)object.get((CoroutineContext$a)object2);
        super((i)object2);
        object2 = new FF2$f(this);
        k80Array.G((Function1)object2);
        this.s = k80Array;
        object = object.plus(wD).plus((CoroutineContext)k80Array);
        this.t = object;
        this.u = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void G(ArrayList object, FF2 iterator, k80 k802) {
        ((ArrayList)object).clear();
        Object object2 = ((FF2)((Object)iterator)).b;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2;
                    iterator = ((FF2)((Object)iterator)).j;
                    iterator = ((ArrayList)((Object)iterator)).iterator();
                    while (bl2 = iterator.hasNext()) {
                        Object object3 = iterator.next();
                        object3 = (vQ1)object3;
                        k80 k803 = ((vQ1)object3).c;
                        boolean bl3 = Intrinsics.areEqual(k803, k802);
                        if (!bl3) continue;
                        ((ArrayList)object).add(object3);
                        iterator.remove();
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    public static /* synthetic */ void J(FF2 fF2, Exception exception, boolean bl2, int n3) {
        if ((n3 &= 4) != 0) {
            bl2 = false;
        }
        fF2.I(exception, null, bl2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static final Object s(FF2 object, f80_0 f80_02) {
        j90_0 j90_02;
        void var1_1;
        boolean bl2 = ((FF2)object).C();
        if (bl2) {
            return Unit.a;
        }
        Object object2 = zj1_2.b((f80_0)var1_1);
        int n3 = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(n3, (f80_0)object2);
        cancellableContinuationImpl.r();
        object2 = ((FF2)object).b;
        // MONITORENTER : object2
        n3 = (int)(((FF2)object).C() ? 1 : 0);
        if (n3 != 0) {
            object = cancellableContinuationImpl;
        } else {
            ((FF2)object).o = cancellableContinuationImpl;
            object = null;
        }
        // MONITOREXIT : object2
        if (object != null) {
            object2 = tl2_2.b;
            object2 = Unit.a;
            ((CancellableContinuationImpl)object).resumeWith(object2);
        }
        if ((object = cancellableContinuationImpl.q()) == (j90_02 = j90_0.COROUTINE_SUSPENDED)) {
            object2 = "frame";
            Intrinsics.checkNotNullParameter(var1_1, (String)object2);
        }
        if (object != j90_02) return Unit.a;
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static final void t(FF2 object) {
        Object object2;
        int n3;
        ArrayList<Pair> arrayList;
        Object object3;
        block9: {
            block8: {
                Object object4;
                LinkedHashMap linkedHashMap;
                int n4;
                object3 = ((FF2)object).b;
                // MONITORENTER : object3
                arrayList = ((FF2)object).k;
                boolean bl2 = arrayList.isEmpty() ^ true;
                n3 = 0;
                if (!bl2) break block8;
                arrayList = ((FF2)object).k;
                arrayList = ((LinkedHashMap)((Object)arrayList)).values();
                arrayList = arrayList;
                object2 = "<this>";
                Intrinsics.checkNotNullParameter(arrayList, (String)object2);
                object2 = new ArrayList();
                arrayList = arrayList.iterator();
                while ((n4 = arrayList.hasNext()) != 0) {
                    Object object5 = arrayList.next();
                    object5 = (Iterable)object5;
                    cx_2.r(object5, (Collection)object2);
                }
                arrayList = ((FF2)object).k;
                ((LinkedHashMap)((Object)arrayList)).clear();
                n4 = ((ArrayList)object2).size();
                arrayList = new ArrayList<Pair>(n4);
                n4 = ((ArrayList)object2).size();
                for (int n7 = 0; n7 < n4; linkedHashMap = linkedHashMap.get(object4), ++n7) {
                    object4 = ((ArrayList)object2).get(n7);
                    object4 = (vQ1)object4;
                    linkedHashMap = ((FF2)object).l;
                    Pair pair = new Pair(object4, linkedHashMap);
                    arrayList.add(pair);
                }
                object = ((FF2)object).l;
                ((LinkedHashMap)object).clear();
                break block9;
            }
            arrayList = mz0_2.a;
        }
        // MONITOREXIT : object3
        int n8 = arrayList.size();
        while (n3 < n8) {
            object3 = (Pair)arrayList.get(n3);
            object2 = (vQ1)((Pair)object3).a;
            object3 = (uq1_0)((Pair)object3).b;
            if (object3 != null) {
                object2 = ((vQ1)object2).c;
                object2.f((uq1_0)object3);
            }
            ++n3;
        }
    }

    public static final boolean u(FF2 fF2) {
        Object object = fF2.b;
        synchronized (object) {
            boolean bl2 = fF2.B();
            return bl2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final k80 v(FF2 object, k80 object2, pr1_1 pr1_12) {
        boolean bl2;
        boolean bl3;
        object.getClass();
        boolean bl4 = object2.s();
        Object object3 = null;
        if (bl4) return object3;
        bl4 = object2.isDisposed();
        if (bl4) return object3;
        object = ((FF2)object).n;
        bl4 = true;
        if (object != null && (bl3 = object.contains(object2)) == bl4) {
            return object3;
        }
        object = new JF2((k80)object2);
        Object object4 = new MF2((k80)object2, pr1_12);
        v83_0 v83_02 = A83.k();
        boolean bl5 = v83_02 instanceof RR1;
        if (bl5) {
            v83_02 = (RR1)v83_02;
        } else {
            bl2 = false;
            v83_02 = null;
        }
        if (v83_02 != null && (object = ((RR1)v83_02).C((Function1)object, (Function1)object4)) != null) {
            Throwable throwable2;
            block13: {
                block12: {
                    object4 = ((v83_0)object).j();
                    if (pr1_12 == null) break block12;
                    try {
                        bl2 = pr1_12.c();
                        if (bl2 != bl4) break block12;
                        IF2 iF2 = new IF2((k80)object2, pr1_12);
                        object2.q(iF2);
                    }
                    catch (Throwable throwable2) {
                        break block13;
                    }
                }
                boolean bl6 = object2.i();
                v83_0.p((v83_0)object4);
                if (!bl6) {
                    object2 = null;
                }
                object3 = object2;
                return object3;
            }
            try {
                v83_0.p((v83_0)object4);
                throw throwable2;
            }
            finally {
                FF2.y((RR1)object);
            }
        }
        object2 = "Cannot create a mutable snapshot of an read-only snapshot".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final boolean w(FF2 object) {
        Throwable throwable2;
        Object[] objectArray;
        ht2_1 ht2_12;
        Object object2;
        Object object3;
        Object object4;
        block22: {
            boolean bl2;
            int n3 = 1;
            object4 = ((FF2)object).b;
            synchronized (object4) {
                object3 = ((FF2)object).g;
                bl2 = ((ft2_0)object3).b();
                object2 = null;
                if (bl2) {
                    object3 = ((FF2)object).h;
                    bl2 = ((WR1)object3).l();
                    if (bl2) return n3 != 0;
                    boolean bl3 = ((FF2)object).B();
                    if (!bl3) return 0 != 0;
                    return n3 != 0;
                }
                object3 = ((FF2)object).g;
                ht2_12 = new ht2_1((ft2_0)object3);
                objectArray = null;
                ((FF2)object).g = object3 = new pr1_1(null);
            }
            object4 = ((FF2)object).b;
            synchronized (object4) {
                object3 = ((FF2)object).D();
            }
            try {
                int n4 = object3.size();
                for (int i3 = 0; i3 < n4; i3 += n3) {
                    Object object5 = object3.get(i3);
                    object5 = (k80)object5;
                    object5.l(ht2_12);
                    object5 = ((FF2)object).r;
                    object5 = ((kb3_2)object5).getValue();
                    object5 = (FF2$d)((Object)object5);
                    FF2$d fF2$d = FF2$d.ShuttingDown;
                    int n7 = ((Enum)object5).compareTo((FF2$d)fF2$d);
                    if (n7 > 0) {
                        continue;
                    }
                    break;
                }
            }
            catch (Throwable throwable2) {
                break block22;
            }
            object4 = ((FF2)object).b;
            synchronized (object4) {
                ((FF2)object).g = object3 = new pr1_1(null);
                object3 = Unit.a;
            }
            object4 = ((FF2)object).b;
            synchronized (object4) {
                object3 = ((FF2)object).A();
                if (object3 != null) {
                    String string2 = "called outside of runRecomposeAndApplyChanges";
                    string2 = string2.toString();
                    object = new IllegalStateException(string2);
                    throw object;
                }
                object3 = ((FF2)object).h;
                bl2 = ((WR1)object3).l();
                if (bl2) return n3 != 0;
                boolean bl4 = ((FF2)object).B();
                if (!bl4) return 0 != 0;
                return n3 != 0;
            }
        }
        object4 = ((FF2)object).b;
        synchronized (object4) {
            object = ((FF2)object).g;
            object.getClass();
            object3 = "elements";
            Intrinsics.checkNotNullParameter(ht2_12, (String)object3);
            Intrinsics.checkNotNullParameter(ht2_12, (String)object3);
            object3 = ht2_12.iterator();
            while (true) {
                object2 = object3;
                object2 = (wz2_1)object3;
                int n8 = ((wz2_1)object2).hasNext();
                if (n8 == 0) throw throwable2;
                object2 = ((wz2_1)object2).next();
                n8 = ((pr1_1)object).f(object2);
                objectArray = ((ft2_0)object).b;
                objectArray[n8] = object2;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void x(FF2 object, i object2) {
        Object object3 = ((FF2)object).b;
        synchronized (object3) {
            Throwable throwable2;
            block6: {
                try {
                    Object object4 = ((FF2)object).d;
                    if (object4 != null) {
                        throw object4;
                    }
                    object4 = ((FF2)object).r;
                    object4 = ((kb3_2)object4).getValue();
                    FF2$d fF2$d = FF2$d.ShuttingDown;
                    int n3 = ((Enum)(object4 = (FF2$d)((Object)object4))).compareTo(fF2$d);
                    if (n3 <= 0) {
                        object2 = "Recomposer shut down";
                        object2 = object2.toString();
                        object = new IllegalStateException((String)object2);
                        throw object;
                    }
                    object4 = ((FF2)object).c;
                    if (object4 == null) {
                        ((FF2)object).c = object2;
                        ((FF2)object).A();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                object2 = "Recomposer already running";
                object2 = object2.toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            throw throwable2;
        }
    }

    public static void y(RR1 rR1) {
        Object object;
        try {
            object = rR1.v();
        }
        catch (Throwable throwable) {
            rR1.c();
            throw throwable;
        }
        boolean bl2 = object instanceof w83_0.a;
        if (!bl2) {
            rR1.c();
            return;
        }
        String string2 = "Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.";
        string2 = string2.toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final bl_2 A() {
        Object object = this.r;
        Object object2 = (FF2$d)((Object)((kb3_2)object).getValue());
        Object object3 = FF2$d.ShuttingDown;
        int n3 = object2.compareTo(object3);
        object3 = this.j;
        ArrayList arrayList = this.i;
        WR1 wR1 = this.h;
        Object object4 = null;
        if (n3 <= 0) {
            this.e.clear();
            this.f = object = mz0_2.a;
            object = new pr1_1(null);
            this.g = object;
            wR1.g();
            arrayList.clear();
            ((ArrayList)object3).clear();
            this.m = null;
            object = this.o;
            if (object != null) {
                object.e(null);
            }
            this.o = null;
            this.p = null;
            return null;
        }
        object2 = this.p;
        if (object2 != null) {
            object2 = FF2$d.Inactive;
        } else {
            object2 = this.c;
            if (object2 == null) {
                object2 = new pr1_1(null);
                this.g = object2;
                wR1.g();
                n3 = (int)(this.B() ? 1 : 0);
                object2 = n3 != 0 ? FF2$d.InactivePendingWork : FF2$d.Inactive;
            } else {
                n3 = (int)(wR1.l() ? 1 : 0);
                object2 = n3 == 0 && (n3 = (int)(((ft2_0)(object2 = this.g)).c() ? 1 : 0)) == 0 && (n3 = arrayList.isEmpty() ^ 1) == 0 && (n3 = ((ArrayList)object3).isEmpty() ^ 1) == 0 && (n3 = (int)(this.B() ? 1 : 0)) == 0 ? FF2$d.Idle : FF2$d.PendingWork;
            }
        }
        ((kb3_2)object).setValue(object2);
        object = FF2$d.PendingWork;
        if (object2 == object) {
            object = this.o;
            this.o = null;
            object4 = object;
        }
        return object4;
    }

    public final boolean B() {
        Uq uq;
        int n3 = this.q;
        if (n3 == 0 && (n3 = (uq = this.a.f).get()) != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            uq = null;
        }
        return n3 != 0;
    }

    public final boolean C() {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block9: {
                boolean bl2;
                block8: {
                    block7: {
                        Object object2;
                        try {
                            object2 = this.g;
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                        bl2 = ((ft2_0)object2).c();
                        if (bl2) break block7;
                        object2 = this.h;
                        bl2 = ((WR1)object2).l();
                        if (bl2) break block7;
                        bl2 = this.B();
                        if (bl2) break block7;
                        bl2 = false;
                        object2 = null;
                        break block8;
                    }
                    bl2 = true;
                }
                return bl2;
            }
            throw throwable2;
        }
    }

    public final List D() {
        List list = this.f;
        if (list == null) {
            ArrayList arrayList;
            list = this.e;
            boolean bl2 = list.isEmpty();
            list = bl2 ? mz0_2.a : (arrayList = new ArrayList(list));
            this.f = list;
        }
        return list;
    }

    public final void E() {
        Object object = this.b;
        synchronized (object) {
            boolean bl2 = true;
            this.q = bl2;
            Unit unit = Unit.a;
            return;
        }
    }

    public final void F(k80 k802) {
        ArrayList arrayList = this.b;
        synchronized (arrayList) {
            Throwable throwable2;
            block11: {
                Object object = this.j;
                int n3 = ((ArrayList)object).size();
                for (int i3 = 0; i3 < n3; ++i3) {
                    boolean bl2;
                    Object object2 = ((ArrayList)object).get(i3);
                    object2 = (vQ1)object2;
                    object2 = ((vQ1)object2).c;
                    boolean bl3 = Intrinsics.areEqual(object2, k802);
                    if (!bl3) continue;
                    try {
                        object = Unit.a;
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                    // MONITOREXIT @DISABLED, blocks:[7, 9] lbl19 : MonitorExitStatement: MONITOREXIT : var2_3
                    arrayList = new ArrayList();
                    FF2.G(arrayList, this, k802);
                    while (bl2 = arrayList.isEmpty() ^ true) {
                        bl2 = false;
                        object = null;
                        this.H(arrayList, null);
                        FF2.G(arrayList, this, k802);
                    }
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    public final List H(List var1_1, pr1_1 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 34[TRYBLOCK] [37 : 701->707)] java.lang.Throwable
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void I(Exception exception, k80 object, boolean bl2) {
        Object object2 = (Boolean)w.get();
        bl2 = (Boolean)object2;
        if (bl2 && !(bl2 = exception instanceof ComposeRuntimeError)) {
            object2 = this.b;
            synchronized (object2) {
                Throwable throwable2;
                block10: {
                    block9: {
                        try {
                            // empty try
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                        Object object3 = this.i;
                        ((ArrayList)object3).clear();
                        object3 = this.h;
                        ((WR1)object3).g();
                        this.g = object3 = new pr1_1(null);
                        object3 = this.j;
                        ((ArrayList)object3).clear();
                        object3 = this.k;
                        ((LinkedHashMap)object3).clear();
                        object3 = this.l;
                        ((LinkedHashMap)object3).clear();
                        this.p = object3 = new FF2$b(exception);
                        if (object == null) break block9;
                        this.K((k80)object);
                    }
                    this.A();
                    return;
                }
                throw throwable2;
            }
        }
        object = this.b;
        synchronized (object) {
            Throwable throwable3;
            block11: {
                try {
                    object2 = this.p;
                    if (object2 != null) break block11;
                    this.p = object2 = new FF2$b(exception);
                    object2 = Unit.a;
                }
                catch (Throwable throwable3) {}
                throw (Throwable)exception;
            }
            exception = ((FF2$b)object2).a;
            throw exception;
            throw throwable3;
        }
    }

    public final void K(k80 k802) {
        boolean bl2;
        ArrayList<k80> arrayList = this.m;
        if (arrayList == null) {
            this.m = arrayList = new ArrayList<k80>();
        }
        if (!(bl2 = arrayList.contains(k802))) {
            arrayList.add(k802);
        }
        this.e.remove(k802);
        this.f = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void L() {
        bl_2 bl_22;
        Object object;
        block4: {
            boolean bl2;
            block3: {
                object = this.b;
                // MONITORENTER : object
                bl2 = this.q;
                if (!bl2) break block3;
                bl2 = false;
                bl_22 = null;
                this.q = false;
                bl_22 = this.A();
                break block4;
            }
            bl2 = false;
            bl_22 = null;
        }
        // MONITOREXIT : object
        if (bl_22 == null) return;
        object = tl2_2.b;
        object = Unit.a;
        bl_22.resumeWith(object);
    }

    /*
     * Exception decompiling
     */
    public final void a(k80 var1_1, u10 var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 22[TRYBLOCK] [27 : 285->295)] java.lang.Exception
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(vQ1 vQ12) {
        Object object = this.b;
        synchronized (object) {
            LinkedHashMap linkedHashMap = this.k;
            tq1_0 tq1_02 = vQ12.a;
            Object object2 = linkedHashMap.get(tq1_02);
            if (object2 == null) {
                object2 = new ArrayList();
                linkedHashMap.put(tq1_02, object2);
            }
            object2 = (List)object2;
            object2.add((vQ1)vQ12);
            return;
        }
    }

    public final boolean d() {
        return (Boolean)w.get();
    }

    public final boolean e() {
        return false;
    }

    public final boolean f() {
        return false;
    }

    public final int h() {
        return 1000;
    }

    public final CoroutineContext i() {
        return this.t;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void j(k80 object) {
        Object object2;
        block4: {
            block3: {
                object2 = this.b;
                // MONITORENTER : object2
                WR1 wR1 = this.h;
                boolean bl2 = wR1.h(object);
                if (bl2) break block3;
                wR1 = this.h;
                wR1.b(object);
                object = this.A();
                break block4;
            }
            object = null;
        }
        // MONITOREXIT : object2
        if (object == null) return;
        object2 = tl2_2.b;
        object2 = Unit.a;
        object.resumeWith(object2);
    }

    public final void k(vQ1 object, uq1_0 uq1_02) {
        Object object2 = this.b;
        synchronized (object2) {
            LinkedHashMap linkedHashMap = this.l;
            linkedHashMap.put(object, uq1_02);
            object = Unit.a;
            return;
        }
    }

    public final uq1_0 l(vQ1 object) {
        Object object2 = this.b;
        synchronized (object2) {
            LinkedHashMap linkedHashMap = this.l;
            object = linkedHashMap.remove(object);
            object = (uq1_0)object;
            return object;
        }
    }

    public final void m(Set set) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void o(k80 k802) {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                LinkedHashSet<k80> linkedHashSet;
                block3: {
                    try {
                        linkedHashSet = this.n;
                        if (linkedHashSet != null) break block3;
                        this.n = linkedHashSet = new LinkedHashSet<k80>();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                linkedHashSet.add(k802);
                return;
            }
            throw throwable2;
        }
    }

    public final void r(k80 object) {
        Object object2 = this.b;
        synchronized (object2) {
            RandomAccess randomAccess = this.e;
            ((ArrayList)randomAccess).remove(object);
            randomAccess = null;
            this.f = null;
            randomAccess = this.h;
            ((WR1)randomAccess).m(object);
            randomAccess = this.i;
            ((ArrayList)randomAccess).remove(object);
            object = Unit.a;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void z() {
        Object object = this.b;
        // MONITORENTER : object
        Object object2 = this.r;
        object2 = ((kb3_2)object2).getValue();
        object2 = (FF2$d)((Object)object2);
        FF2$d fF2$d = FF2$d.Idle;
        int n3 = ((Enum)object2).compareTo(fF2$d);
        if (n3 >= 0) {
            object2 = this.r;
            fF2$d = FF2$d.ShuttingDown;
            ((kb3_2)object2).setValue((Object)fF2$d);
        }
        object2 = Unit.a;
        // MONITOREXIT : object
        this.s.d(null);
    }
}


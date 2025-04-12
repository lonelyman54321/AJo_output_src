/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jq1
 */
public final class jq1_2
implements C20 {
    public final xp1_0 a;
    public A30 b;
    public yf3_1 c;
    public int d;
    public int e;
    public final HashMap f;
    public final HashMap g;
    public final jq1$c h;
    public final jq1$b i;
    public final HashMap j;
    public final yf3$a k;
    public final LinkedHashMap l;
    public final WR1 m;
    public int n;
    public int o;
    public final String p;

    public jq1_2(xp1_0 object, yf3_1 objectArray) {
        this.a = object;
        this.c = objectArray;
        object = new HashMap();
        this.f = object;
        object = new HashMap();
        this.g = object;
        this.h = object = new jq1$c(this);
        this.i = object = new jq1$b(this);
        object = new HashMap();
        this.j = object;
        this.k = object = new yf3$a(0);
        object = new LinkedHashMap();
        this.l = object;
        objectArray = new Object[16];
        this.m = object = new WR1(objectArray);
        this.p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public final void a() {
        boolean bl2;
        boolean bl3 = true;
        xp1_0 xp1_02 = this.a;
        xp1_02.l = bl3;
        HashMap hashMap = this.f;
        Iterator iterator = ((Iterable)hashMap.values()).iterator();
        while (bl2 = iterator.hasNext()) {
            tO2 tO22 = ((jq1$a)iterator.next()).c;
            if (tO22 == null) continue;
            tO22.o();
        }
        xp1_02.T();
        xp1_02.l = false;
        hashMap.clear();
        this.g.clear();
        this.o = 0;
        this.n = 0;
        this.j.clear();
        this.d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b(int n3) {
        Object object;
        boolean bl2;
        int n4;
        int n7;
        Object object2;
        boolean bl3;
        block19: {
            Throwable throwable2;
            Object object3;
            Object object4;
            Object object5;
            block18: {
                bl3 = false;
                Object var3_3 = null;
                this.n = 0;
                object2 = this.a.x();
                n7 = object2.size();
                n4 = this.o;
                n7 -= n4;
                n4 = 1;
                if (n3 > (n7 -= n4)) {
                    bl2 = false;
                    Object var12_14 = null;
                } else {
                    object5 = this.k;
                    ((yf3$a)object5).clear();
                    if (n3 <= n7) {
                        int n8 = n3;
                        while (true) {
                            object4 = (xp1_0)this.a.x().get(n8);
                            object4 = this.f.get(object4);
                            Intrinsics.checkNotNull(object4);
                            object4 = ((jq1$a)object4).a;
                            object3 = this.k.a;
                            object3.add(object4);
                            if (n8 == n7) break;
                            n8 += n4;
                        }
                    }
                    object5 = this.c;
                    object4 = this.k;
                    object5.a((yf3$a)object4);
                    object5 = v83$a.a();
                    object4 = object5 != null ? ((v83_0)object5).f() : null;
                    object3 = v83$a.b((v83_0)object5);
                    bl2 = false;
                    Object object6 = null;
                    while (n7 >= n3) {
                        Object object7;
                        Object object8;
                        block17: {
                            Object object9;
                            Object object10;
                            block16: {
                                try {
                                    object8 = this.a;
                                    object8 = ((xp1_0)object8).x();
                                    object8 = object8.get(n7);
                                    object8 = (xp1_0)object8;
                                    object10 = this.f;
                                    object10 = ((HashMap)object10).get(object8);
                                    Intrinsics.checkNotNull(object10);
                                    object10 = (jq1$a)object10;
                                    object7 = ((jq1$a)object10).a;
                                    object9 = this.k;
                                    object9 = ((yf3$a)object9).a;
                                    int n10 = object9.contains(object7);
                                    if (n10 == 0) break block16;
                                    this.n = n10 = this.n + n4;
                                    object9 = ((jq1$a)object10).f;
                                    object9 = object9.getValue();
                                    n10 = (int)(((Boolean)(object9 = (Boolean)object9)).booleanValue() ? 1 : 0);
                                    if (n10 != 0) {
                                        object6 = ((xp1_0)object8).z;
                                        object8 = ((bq1)object6).r;
                                        object9 = Xp1$f.NotUsed;
                                        ((bq1$b)object8).k = object9;
                                        object6 = ((bq1)object6).s;
                                        if (object6 != null) {
                                            ((bq1$a_0)object6).i = object9;
                                        }
                                        object6 = ((jq1$a)object10).f;
                                        object8 = Boolean.FALSE;
                                        object6.setValue(object8);
                                        bl2 = true;
                                    }
                                    break block17;
                                }
                                catch (Throwable throwable2) {
                                    break block18;
                                }
                            }
                            object9 = this.a;
                            ((xp1_0)object9).l = n4;
                            HashMap hashMap = this.f;
                            hashMap.remove(object8);
                            object8 = ((jq1$a)object10).c;
                            if (object8 != null) {
                                object8.o();
                            }
                            object8 = this.a;
                            ((xp1_0)object8).U(n7, n4);
                            ((xp1_0)object9).l = false;
                        }
                        object8 = this.g;
                        ((HashMap)object8).remove(object7);
                        n7 += -1;
                    }
                    object = Unit.a;
                    v83$a.e((v83_0)object5, (v83_0)object3, (Function1)object4);
                }
                break block19;
            }
            v83$a.e((v83_0)object5, (v83_0)object3, (Function1)object4);
            throw throwable2;
        }
        if (bl2) {
            object = A83.c;
            // MONITORENTER : object
            object2 = A83.j;
            object2 = ((AtomicReference)object2).get();
            object2 = (f01_0)object2;
            object2 = ((RR1)object2).h;
            if (object2 != null && (n7 = (int)(((ft2_0)object2).c() ? 1 : 0)) == n4) {
                bl3 = true;
            }
            if (bl3) {
                A83.a();
            }
        }
        this.d();
    }

    public final void c() {
        this.e(true);
    }

    public final void d() {
        Object object = this.a.x();
        int n3 = object.size();
        Serializable serializable = this.f;
        int n4 = ((HashMap)serializable).size();
        if (n4 == n3) {
            int n7 = this.n;
            n7 = n3 - n7;
            n4 = this.o;
            if ((n7 -= n4) >= 0) {
                object = this.j;
                n7 = ((HashMap)object).size();
                if (n7 == (n4 = this.o)) {
                    return;
                }
                serializable = new StringBuilder("Incorrect state. Precomposed children ");
                n4 = this.o;
                ((StringBuilder)serializable).append(n4);
                ((StringBuilder)serializable).append(". Map size ");
                n3 = ((HashMap)object).size();
                ((StringBuilder)serializable).append(n3);
                object = ((StringBuilder)serializable).toString();
                object = object.toString();
                serializable = new IllegalArgumentException((String)object);
                throw serializable;
            }
            object = wk0_0.a(n3, "Incorrect state. Total children ", ". Reusable children ");
            n7 = this.n;
            ((StringBuilder)object).append(n7);
            ((StringBuilder)object).append(". Precomposed children ");
            n7 = this.o;
            ((StringBuilder)object).append(n7);
            object = ((StringBuilder)object).toString();
            object = object.toString();
            serializable = new IllegalArgumentException((String)object);
            throw serializable;
        }
        StringBuilder stringBuilder = new StringBuilder("Inconsistency between the count of nodes tracked by the state (");
        int n8 = ((HashMap)serializable).size();
        stringBuilder.append(n8);
        stringBuilder.append(") and the children count on the SubcomposeLayout (");
        stringBuilder.append(n3);
        stringBuilder.append("). Are you trying to use the state of the disposed SubcomposeLayout?");
        object = stringBuilder.toString();
        object = object.toString();
        serializable = new IllegalArgumentException((String)object);
        throw serializable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(boolean bl2) {
        block7: {
            Throwable throwable2;
            v83_0 v83_02;
            Function1 function1;
            v83_0 v83_03;
            block6: {
                this.o = 0;
                this.j.clear();
                xp1_0 xp1_02 = this.a;
                List list = xp1_02.x();
                int n3 = list.size();
                int n4 = this.n;
                if (n4 == n3) break block7;
                this.n = n3;
                v83_03 = v83$a.a();
                function1 = v83_03 != null ? v83_03.f() : null;
                v83_02 = v83$a.b(v83_03);
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object object;
                    block8: {
                        Object object2;
                        Object object3;
                        block4: {
                            block5: {
                                try {
                                    Xp1$f xp1$f;
                                    object = xp1_02.x();
                                    object = object.get(i3);
                                    object = (xp1_0)object;
                                    object3 = this.f;
                                    object3 = ((HashMap)object3).get(object);
                                    object3 = (jq1$a)object3;
                                    if (object3 == null) continue;
                                    object2 = ((jq1$a)object3).f;
                                    object2 = object2.getValue();
                                    boolean bl3 = (Boolean)(object2 = (Boolean)object2);
                                    if (!bl3) continue;
                                    object = ((xp1_0)object).z;
                                    object2 = ((bq1)object).r;
                                    ((bq1$b)object2).k = xp1$f = Xp1$f.NotUsed;
                                    object = ((bq1)object).s;
                                    if (object != null) {
                                        ((bq1$a_0)object).i = xp1$f;
                                    }
                                    if (!bl2) break block4;
                                    object = ((jq1$a)object3).c;
                                    if (object == null) break block5;
                                    object.deactivate();
                                }
                                catch (Throwable throwable2) {
                                    break block6;
                                }
                            }
                            object = Boolean.FALSE;
                            ((jq1$a)object3).f = object = J83.g(object);
                            break block8;
                        }
                        object = ((jq1$a)object3).f;
                        object2 = Boolean.FALSE;
                        object.setValue(object2);
                    }
                    ((jq1$a)object3).a = object = tf3.a;
                }
                Object object = Unit.a;
                v83$a.e(v83_03, v83_02, function1);
                object = this.g;
                ((HashMap)object).clear();
                break block7;
            }
            v83$a.e(v83_03, v83_02, function1);
            throw throwable2;
        }
        this.d();
    }

    public final wf3$a_0 f(Object object, Function2 object2) {
        xp1_0 xp1_02 = this.a;
        boolean bl2 = xp1_02.e();
        if (!bl2) {
            object = new Object();
            return object;
        }
        this.d();
        HashMap hashMap = this.g;
        bl2 = hashMap.containsKey(object);
        if (!bl2) {
            this.l.remove(object);
            hashMap = this.j;
            Object object3 = hashMap.get(object);
            if (object3 == null) {
                object3 = this.i(object);
                int n3 = 1;
                if (object3 != null) {
                    int n4;
                    List list = xp1_02.x();
                    int n7 = list.indexOf(object3);
                    List list2 = xp1_02.x();
                    int n8 = list2.size();
                    xp1_02.l = n3;
                    xp1_02.O(n7, n8, n3);
                    xp1_02.l = false;
                    this.o = n4 = this.o + n3;
                } else {
                    int n10;
                    int n14 = xp1_02.x().size();
                    int n15 = 2;
                    xp1_0 xp1_03 = new xp1_0(n15, 0, n3 != 0);
                    xp1_02.l = n3;
                    xp1_02.F(n14, xp1_03);
                    xp1_02.l = false;
                    this.o = n10 = this.o + n3;
                    object3 = xp1_03;
                }
                hashMap.put(object, object3);
            }
            object3 = (xp1_0)object3;
            this.h((xp1_0)object3, object, (Function2)object2);
        }
        object2 = new jq1$e(this, object);
        return object2;
    }

    public final void g() {
        this.e(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(xp1_0 object, Object object2, Function2 object3) {
        Function1 function1;
        Object object4;
        block9: {
            Object object5;
            object4 = this.f;
            Object object6 = ((HashMap)object4).get(object);
            function1 = null;
            if (object6 == null) {
                object5 = k20.a;
                object6 = new Object();
                ((jq1$a)object6).a = object2;
                ((jq1$a)object6).b = object5;
                ((jq1$a)object6).c = null;
                ((jq1$a)object6).f = object2 = J83.g(Boolean.TRUE);
                ((HashMap)object4).put(object, object6);
            }
            object6 = (jq1$a)object6;
            object2 = ((jq1$a)object6).c;
            boolean bl2 = true;
            boolean bl3 = object2 != null ? object2.v() : true;
            object5 = ((jq1$a)object6).b;
            if (object5 != object3 || bl3 || (bl3 = ((jq1$a)object6).d)) {
                ((jq1$a)object6).b = object3;
                object2 = v83$a.a();
                if (object2 != null) {
                    function1 = ((v83_0)object2).f();
                }
                object3 = v83$a.b((v83_0)object2);
                object5 = this.a;
                ((xp1_0)object5).l = bl2;
                Function2 function2 = ((jq1$a)object6).b;
                tO2 tO22 = ((jq1$a)object6).c;
                A30 a30 = this.b;
                if (a30 == null) break block9;
                boolean bl4 = ((jq1$a)object6).e;
                nq1_2 nq1_22 = new nq1_2((jq1$a)object6, function2);
                int n3 = -1750409193;
                function2 = new u10(n3, nq1_22, bl2);
                if (tO22 == null || (bl2 = tO22.isDisposed())) {
                    object4 = nj3_0.a;
                    object4 = new ru3(object);
                    tO22 = new F30(a30, (ru3)object4);
                }
                if (!bl4) {
                    tO22.e(function2);
                } else {
                    tO22.g((u10)function2);
                }
                ((jq1$a)object6).c = tO22;
                object = null;
                ((jq1$a)object6).e = false;
                ((xp1_0)object5).l = false;
                object4 = Unit.a;
                v83$a.e((v83_0)object2, (v83_0)object3, function1);
                ((jq1$a)object6).d = false;
            }
            return;
        }
        try {
            object4 = "parent composition reference not set";
            object4 = object4.toString();
            object = new IllegalStateException((String)object4);
            throw object;
        }
        catch (Throwable throwable) {}
        v83$a.e((v83_0)object2, (v83_0)object3, function1);
        throw throwable;
    }

    public final xp1_0 i(Object object) {
        int n3;
        int n4;
        HashMap hashMap;
        int n7;
        int n8;
        int n10;
        Object object2;
        Object object3;
        block9: {
            int n14;
            block8: {
                int n15 = this.n;
                object3 = null;
                if (n15 == 0) {
                    return null;
                }
                object2 = this.a;
                List list = ((xp1_0)object2).x();
                n14 = list.size();
                n10 = this.o;
                n14 -= n10;
                n10 = this.n;
                n10 = n14 - n10;
                n8 = 1;
                n7 = n14 -= n8;
                while (true) {
                    hashMap = this.f;
                    n4 = -1;
                    if (n7 < n10) break;
                    Object object4 = (xp1_0)((xp1_0)object2).x().get(n7);
                    object4 = hashMap.get(object4);
                    Intrinsics.checkNotNull(object4);
                    object4 = ((jq1$a)object4).a;
                    n3 = (int)(Intrinsics.areEqual(object4, object) ? 1 : 0);
                    if (n3 != 0) {
                        n3 = n7;
                        break block8;
                    }
                    n7 += -1;
                }
                n3 = -1;
            }
            if (n3 == n4) {
                while (n14 >= n10) {
                    boolean bl2;
                    Object object5 = (xp1_0)((xp1_0)object2).x().get(n14);
                    object5 = hashMap.get(object5);
                    Intrinsics.checkNotNull(object5);
                    object5 = (jq1$a)object5;
                    Object object6 = ((jq1$a)object5).a;
                    Object object7 = tf3.a;
                    if (object6 != object7 && !(bl2 = (object7 = this.c).b(object, object6))) {
                        n14 += -1;
                        continue;
                    }
                    ((jq1$a)object5).a = object;
                    n7 = n14;
                    n3 = n14;
                    break block9;
                }
                n7 = n14;
            }
        }
        if (n3 != n4) {
            int n16;
            if (n7 != n10) {
                ((xp1_0)object2).l = n8;
                ((xp1_0)object2).O(n7, n10, n8);
                n16 = 0;
                object = null;
                ((xp1_0)object2).l = false;
            }
            this.n = n16 = this.n + n4;
            object3 = object = ((xp1_0)object2).x().get(n10);
            object3 = (xp1_0)object;
            object = hashMap.get(object3);
            Intrinsics.checkNotNull(object);
            object = (jq1$a)object;
            ((jq1$a)object).f = object2 = J83.g(Boolean.TRUE);
            ((jq1$a)object).e = n8;
            ((jq1$a)object).d = n8;
        }
        return object3;
    }
}


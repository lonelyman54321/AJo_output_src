/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public abstract class Sc {
    public final Tc a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public Tc h;
    public final HashMap i;

    public Sc(Tc hashMap) {
        this.a = hashMap;
        this.b = true;
        this.i = hashMap = new HashMap();
    }

    public static final void a(Sc object, Oc oc, int n3, w32_0 object2) {
        Object object3;
        object.getClass();
        float f5 = n3;
        long l2 = h72.a(f5, f5);
        while (true) {
            l2 = ((Sc)object).b((w32_0)object2, l2);
            object2 = ((w32_0)object2).q;
            Intrinsics.checkNotNull(object2);
            object3 = ((Sc)object).a.K();
            n3 = Intrinsics.areEqual(object2, object3) ? 1 : 0;
            if (n3 != 0) break;
            object3 = ((Sc)object).c((w32_0)object2);
            n3 = object3.containsKey(oc) ? 1 : 0;
            if (n3 == 0) continue;
            n3 = ((Sc)object).d((w32_0)object2, oc);
            f5 = n3;
            l2 = h72.a(f5, f5);
        }
        n3 = oc instanceof m91;
        f5 = n3 != 0 ? e72.e(l2) : e72.d(l2);
        n3 = Math.round(f5);
        object = ((Sc)object).i;
        boolean n4 = ((HashMap)object).containsKey(oc);
        if (n4) {
            int n7 = ((Number)fh1_2.g(oc, (Map)object)).intValue();
            Object object4 = Pc.a;
            object4 = oc.a;
            object2 = n7;
            object3 = n3;
            object3 = (Number)object4.invoke(object2, object3);
            n3 = ((Number)object3).intValue();
        }
        object3 = n3;
        ((HashMap)object).put(oc, object3);
    }

    public abstract long b(w32_0 var1, long var2);

    public abstract Map c(w32_0 var1);

    public abstract int d(w32_0 var1, Oc var2);

    public final boolean e() {
        boolean bl2 = this.c;
        bl2 = bl2 || (bl2 = this.e) || (bl2 = this.f) || (bl2 = this.g);
        return bl2;
    }

    public final boolean f() {
        boolean bl2;
        this.i();
        Tc tc = this.h;
        if (tc != null) {
            bl2 = true;
        } else {
            bl2 = false;
            tc = null;
        }
        return bl2;
    }

    public final void g() {
        boolean bl2;
        this.b = bl2 = true;
        Tc tc = this.a;
        Tc tc2 = tc.x();
        if (tc2 == null) {
            return;
        }
        boolean bl3 = this.c;
        if (bl3) {
            tc2.b0();
        } else {
            bl3 = this.e;
            if (bl3 || (bl3 = this.d)) {
                tc2.requestLayout();
            }
        }
        bl3 = this.f;
        if (bl3) {
            tc.b0();
        }
        if (bl3 = this.g) {
            tc.requestLayout();
        }
        tc2.p().g();
    }

    public final void h() {
        HashMap hashMap = this.i;
        hashMap.clear();
        Object object = new Sc$a(this);
        Tc tc = this.a;
        tc.V((Function1)object);
        object = tc.K();
        object = this.c((w32_0)object);
        hashMap.putAll(object);
        this.b = false;
    }

    public final void i() {
        block8: {
            Object object;
            block7: {
                boolean bl2;
                boolean bl3 = this.e();
                object = this.a;
                if (bl3) break block7;
                Object object2 = object.x();
                if (object2 == null) {
                    return;
                }
                object2 = object2.p();
                object = ((Sc)object2).h;
                if (object != null && (bl3 = ((Sc)(object2 = object.p())).e())) break block7;
                object2 = this.h;
                if (object2 == null || (bl2 = ((Sc)(object = object2.p())).e())) break block8;
                object = object2.x();
                if (object != null && (object = object.p()) != null) {
                    ((Sc)object).i();
                }
                if ((object2 = object2.x()) != null && (object2 = object2.p()) != null) {
                    object = ((Sc)object2).h;
                } else {
                    bl2 = false;
                    object = null;
                }
            }
            this.h = object;
        }
    }
}


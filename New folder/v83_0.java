/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from v83
 */
public abstract class v83_0 {
    public y83 a;
    public int b;
    public boolean c;
    public int d;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public v83_0(int object, y83 object2) {
        void var1_10;
        block9: {
            block4: {
                Object object3;
                Object object4;
                block6: {
                    void var1_4;
                    int n3;
                    block8: {
                        long l2;
                        long l3;
                        block7: {
                            block5: {
                                this.a = object4;
                                this.b = object;
                                if (object == 0) break block4;
                                object4 = this.e();
                                object3 = A83.a;
                                object3 = ((y83)object4).d;
                                if (object3 == null) break block5;
                                Object var4_13 = null;
                                Object object5 = object3[0];
                                break block6;
                            }
                            n3 = ((y83)object4).c;
                            l3 = ((y83)object4).b;
                            l2 = 0L;
                            long l4 = l3 - l2;
                            Object object6 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                            if (object6 == false) break block7;
                            int n4 = Long.numberOfTrailingZeros(l3);
                            break block8;
                        }
                        l3 = ((y83)object4).a;
                        long l7 = l3 - l2;
                        Object object7 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                        if (object7 == false) break block6;
                        n3 += 64;
                        int n7 = Long.numberOfTrailingZeros(l3);
                    }
                    void var1_5 = var1_4 + n3;
                }
                object4 = A83.c;
                synchronized (object4) {
                    void var1_7;
                    object3 = A83.f;
                    int n8 = ((x83_0)object3).a((int)var1_7);
                    break block9;
                }
            }
            int n10 = -1;
        }
        this.d = var1_10;
    }

    public static void p(v83_0 v83_02) {
        A83.b.b(v83_02);
    }

    public final void a() {
        Object object = A83.c;
        synchronized (object) {
            this.b();
            this.o();
            Unit unit = Unit.a;
            return;
        }
    }

    public void b() {
        y83 y832 = A83.d;
        int n3 = this.d();
        A83.d = y832.c(n3);
    }

    public void c() {
        boolean bl2;
        this.c = bl2 = true;
        Object object = A83.c;
        synchronized (object) {
            int n3 = this.d;
            if (n3 >= 0) {
                A83.v(n3);
                this.d = n3 = -1;
            }
            Unit unit = Unit.a;
            return;
        }
    }

    public int d() {
        return this.b;
    }

    public y83 e() {
        return this.a;
    }

    public abstract Function1 f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract Function1 i();

    public final v83_0 j() {
        U83 u83 = A83.b;
        v83_0 v83_02 = (v83_0)u83.a();
        u83.b(this);
        return v83_02;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(pb3_0 var1);

    public void o() {
        int n3 = this.d;
        if (n3 >= 0) {
            A83.v(n3);
            this.d = n3 = -1;
        }
    }

    public void q(int n3) {
        this.b = n3;
    }

    public void r(y83 y832) {
        this.a = y832;
    }

    public void s(int n3) {
        String string2 = "Updating write count is not supported for this snapshot".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public abstract v83_0 t(Function1 var1);
}


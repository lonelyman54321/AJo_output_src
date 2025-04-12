/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from N11
 */
public final class n11_0
extends Uz3 {
    public float[] b;
    public final ArrayList c;
    public boolean d;
    public long e;
    public List f;
    public boolean g;
    public ki h;
    public Function1 i;
    public final N11$a j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public n11_0() {
        float f5;
        long l2;
        boolean bl2;
        ArrayList arrayList;
        this.c = arrayList = new ArrayList();
        this.d = bl2 = true;
        this.e = l2 = OX.l;
        Serializable serializable = DA3.a;
        this.f = serializable;
        this.g = bl2;
        super(this);
        this.j = serializable;
        this.k = "";
        this.o = f5 = 1.0f;
        this.p = f5;
        this.s = bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Kt0 kt0) {
        Throwable throwable2;
        long l2;
        Object object;
        block12: {
            Object object2;
            Object object3;
            int n3;
            int n4;
            int n7;
            block11: {
                float f5;
                boolean bl2 = this.s;
                n7 = 0;
                if (bl2) {
                    object = this.b;
                    if (object == null) {
                        object = QK1.a();
                        this.b = object;
                    } else {
                        QK1.d(object);
                    }
                    f5 = this.q;
                    float f6 = this.m;
                    f5 += f6;
                    f6 = this.r;
                    float f7 = this.n;
                    f6 += f7;
                    f7 = 0.0f;
                    QK1.h(f5, f6, 0.0f, object);
                    QK1.e(this.l, object);
                    f5 = this.o;
                    f6 = this.p;
                    n4 = 1065353216;
                    float f8 = 1.0f;
                    QK1.f(f5, f6, f8, object);
                    f5 = -this.m;
                    f6 = -this.n;
                    QK1.h(f5, f6, 0.0f, object);
                    this.s = false;
                }
                bl2 = this.g;
                n3 = 1;
                f5 = Float.MIN_VALUE;
                if (bl2) {
                    object = this.f;
                    bl2 = object.isEmpty() ^ n3;
                    if (bl2) {
                        object = this.h;
                        if (object == null) {
                            this.h = object = ni.a();
                        }
                        List list = this.f;
                        un2.b(list, (gn2)object);
                    }
                    this.g = false;
                }
                object = kt0.M0();
                l2 = object.l();
                object3 = object.a();
                object3.p();
                try {
                    object3 = object.a;
                    object2 = this.b;
                    if (object2 == null) break block11;
                    ((yl_0)object3).f((float[])object2);
                }
                catch (Throwable throwable2) {
                    break block12;
                }
            }
            object2 = this.h;
            Collection collection = this.f;
            boolean bl3 = (collection = (Collection)collection).isEmpty() ^ n3;
            if (bl3 && object2 != null) {
                ((yl_0)object3).a((gn2)object2, n3);
            }
            ArrayList arrayList = this.c;
            n4 = arrayList.size();
            while (n7 < n4) {
                object2 = arrayList.get(n7);
                object2 = (Uz3)object2;
                ((Uz3)object2).a(kt0);
                ++n7;
            }
            jz.b((xL$b)object, l2);
            return;
        }
        jz.b((xL$b)object, l2);
        throw throwable2;
    }

    public final Function1 b() {
        return this.i;
    }

    public final void d(N11$a n11$a) {
        this.i = n11$a;
    }

    public final void e(int n3, Uz3 uz3) {
        ArrayList arrayList = this.c;
        int n4 = arrayList.size();
        if (n3 < n4) {
            arrayList.set(n3, uz3);
        } else {
            arrayList.add(uz3);
        }
        this.g(uz3);
        N11$a n11$a = this.j;
        uz3.d(n11$a);
        this.c();
    }

    public final void f(long l2) {
        Object object = this.d;
        if (!object) {
            return;
        }
        long l3 = 16;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            long l7 = this.e;
            long l8 = l7 - l3;
            Object object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object3 == false) {
                this.e = l2;
            } else {
                float f5;
                float f6;
                boolean bl2;
                float f7;
                float f8;
                float f11 = OX.h(l7);
                float f12 = f11 - (f8 = OX.h(l2));
                object = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                if (object || (object = (f7 = (f11 = OX.g(l7)) - (f8 = OX.g(l2))) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) || (bl2 = (f6 = (f11 = OX.e(l7)) - (f5 = OX.e(l2))) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1))) {
                    bl2 = false;
                    f5 = 0.0f;
                    this.d = false;
                    this.e = l2 = OX.l;
                }
            }
        }
    }

    public final void g(Uz3 object) {
        boolean bl2 = object instanceof jn2;
        if (bl2) {
            object = (jn2)object;
            ZD zD = ((jn2)object).b;
            boolean bl3 = this.d;
            if (bl3 && zD != null) {
                bl3 = zD instanceof i93_0;
                if (bl3) {
                    zD = (i93_0)zD;
                    long l2 = ((i93_0)zD).a;
                    this.f(l2);
                } else {
                    long l3;
                    this.d = false;
                    this.e = l3 = OX.l;
                }
            }
            object = ((jn2)object).g;
            bl2 = this.d;
            if (bl2 && object != null) {
                bl2 = object instanceof i93_0;
                if (bl2) {
                    object = (i93_0)object;
                    long l4 = ((i93_0)object).a;
                    this.f(l4);
                } else {
                    long l7;
                    this.d = false;
                    this.e = l7 = OX.l;
                }
            }
        } else {
            bl2 = object instanceof n11_0;
            if (bl2) {
                object = (n11_0)object;
                bl2 = ((n11_0)object).d;
                if (bl2 && (bl2 = this.d)) {
                    long l8 = ((n11_0)object).e;
                    this.f(l8);
                } else {
                    long l12;
                    this.d = false;
                    this.e = l12 = OX.l;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("VGroup: ");
        Object object = this.k;
        stringBuilder.append((String)object);
        object = this.c;
        int n3 = ((ArrayList)object).size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = (Uz3)((ArrayList)object).get(i3);
            String string2 = "\t";
            stringBuilder.append(string2);
            object2 = object2.toString();
            stringBuilder.append((String)object2);
            object2 = "\n";
            stringBuilder.append((String)object2);
        }
        return stringBuilder.toString();
    }
}


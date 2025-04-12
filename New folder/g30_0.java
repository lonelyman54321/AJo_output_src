/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Matrix
 *  android.graphics.RectF
 */
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from G30
 */
public final class g30_0
extends kw_1 {
    public iw_0 D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final d72 I;
    public final d72$a J;
    public float K;
    public boolean L;
    public final ew0_1 M;

    public g30_0(yc1_1 object, pp1 object2, List object3, QB1 qB1) {
        super((yc1_1)((Object)object), (pp1)object2);
        int n3;
        int n4;
        Object object4;
        this.E = object4 = new ArrayList();
        this.F = object4 = new RectF();
        this.G = object4 = new RectF();
        this.H = object4 = new RectF();
        super();
        this.I = object4;
        super();
        this.J = object4;
        int n7 = 1;
        this.L = n7;
        object2 = ((pp1)object2).s;
        if (object2 != null) {
            this.D = object2 = ((oj_1)object2).d();
            this.g((iw_0)object2);
            object2 = this.D;
            ((iw_0)object2).a(this);
        } else {
            this.D = null;
        }
        List list = qB1.j;
        int n8 = list.size();
        object2 = new pb1_0(n8);
        n8 = object3.size() - n7;
        Object object5 = null;
        while (true) {
            int[] nArray = null;
            if (n8 < 0) break;
            Object object6 = (pp1)object3.get(n8);
            Object object7 = kw$a.a;
            Object object8 = ((pp1)object6).e;
            int n10 = ((Enum)object8).ordinal();
            int n14 = object7[n10];
            switch (n14) {
                default: {
                    object7 = new StringBuilder;
                    super("Unknown layer type ");
                    object8 = ((pp1)object6).e;
                    ((StringBuilder)object7).append(object8);
                    rx1.b(((StringBuilder)object7).toString());
                    n14 = 0;
                    object7 = null;
                    break;
                }
                case 6: {
                    object7 = new pl3_0;
                    super((yc1_1)((Object)object), (pp1)object6);
                    break;
                }
                case 5: {
                    object7 = new i52_0;
                    super((yc1_1)((Object)object), (pp1)object6);
                    break;
                }
                case 4: {
                    object7 = new qd1_1;
                    super((yc1_1)((Object)object), (pp1)object6);
                    break;
                }
                case 3: {
                    object7 = new j93_0;
                    super((yc1_1)((Object)object), (pp1)object6);
                    break;
                }
                case 2: {
                    object7 = new g30_0;
                    object8 = qB1.c;
                    String string2 = ((pp1)object6).g;
                    object8 = (List)object8.get(string2);
                    ((g30_0)object7)((yc1_1)((Object)object), (pp1)object6, (List)object8, qB1);
                    break;
                }
                case 1: {
                    object7 = new s13;
                    super((yc1_1)((Object)object), (pp1)object6, this, qB1);
                }
            }
            if (object7 != null) {
                object8 = ((kw_1)object7).p;
                long l2 = ((pp1)object8).d;
                ((pb1_0)object2).l(l2, object7);
                if (object5 != null) {
                    ((kw_1)object5).s = object7;
                    object5 = null;
                } else {
                    object8 = this.E;
                    ((ArrayList)object8).add(0, object7);
                    nArray = G30$a.a;
                    object6 = ((pp1)object6).u;
                    int n15 = ((Enum)object6).ordinal();
                    n4 = nArray[n15];
                    if (n4 == n7 || n4 == (n15 = 2)) {
                        object5 = object7;
                    }
                }
            }
            n8 += -1;
        }
        for (n4 = 0; n4 < (n3 = ((pb1_0)object2).n()); ++n4) {
            long l3 = ((pb1_0)object2).k(n4);
            object = (kw_1)((pb1_0)object2).f(l3);
            if (object == null || (object3 = (kw_1)((pb1_0)object2).f(l3 = ((kw_1)object).p.f)) == null) continue;
            ((kw_1)object).t = object3;
        }
        object = this.p.x;
        if (object != null) {
            this.M = object2 = new ew0_1(this, this, (cw0_1)object);
        }
    }

    public final void f(RectF rectF, Matrix object, boolean n3) {
        super.f(rectF, (Matrix)object, n3 != 0);
        object = this.E;
        n3 = ((ArrayList)object).size();
        int n4 = 1;
        n3 -= n4;
        while (n3 >= 0) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            kw_1 kw_12 = (kw_1)((ArrayList)object).get(n3);
            Matrix matrix = this.n;
            kw_12.f(rectF2, matrix, n4 != 0);
            rectF.union(rectF2);
            n3 += -1;
        }
    }

    public final void h(LC1 object, Object object2) {
        super.h((LC1)object, object2);
        Object object3 = GC1.z;
        if (object2 == object3) {
            object2 = null;
            if (object == null) {
                object = this.D;
                if (object != null) {
                    ((iw_0)object).k(null);
                }
            } else {
                this.D = object3 = new la3_0((LC1)object, null);
                ((iw_0)object3).a(this);
                object = this.D;
                this.g((iw_0)object);
            }
        } else {
            int n3 = 5;
            object3 = n3;
            ew0_1 ew0_12 = this.M;
            if (object2 == object3 && ew0_12 != null) {
                object2 = ew0_12.c;
                ((iw_0)object2).k((LC1)object);
            } else {
                object3 = GC1.B;
                if (object2 == object3 && ew0_12 != null) {
                    ew0_12.c((LC1)object);
                } else {
                    object3 = GC1.C;
                    if (object2 == object3 && ew0_12 != null) {
                        object2 = ew0_12.e;
                        ((iw_0)object2).k((LC1)object);
                    } else {
                        object3 = GC1.D;
                        if (object2 == object3 && ew0_12 != null) {
                            object2 = ew0_12.f;
                            ((iw_0)object2).k((LC1)object);
                        } else {
                            object3 = GC1.E;
                            if (object2 == object3 && ew0_12 != null) {
                                object2 = ew0_12.g;
                                ((iw_0)object2).k((LC1)object);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void l(Canvas object, Matrix matrix, int n3, bw0_0 bw0_02) {
        Canvas canvas;
        String string2;
        RectF rectF;
        int n4;
        Object object2 = Yo1.a;
        object2 = this.M;
        boolean bl2 = false;
        int n7 = 1;
        if (bw0_02 == null && object2 == null) {
            n4 = 0;
            rectF = null;
        } else {
            n4 = 1;
        }
        Object object3 = this.o;
        int n8 = ((yc1_1)((Object)object3)).t;
        ArrayList arrayList = this.E;
        int n10 = 255;
        if (n8 != 0 && (n8 = arrayList.size()) > n7 && n3 != n10 || n4 != 0 && (n4 = ((yc1_1)((Object)object3)).u) != 0) {
            bl2 = true;
        }
        if (!bl2) {
            n10 = n3;
        }
        if (object2 != null) {
            bw0_02 = ((ew0_1)object2).b(matrix, n10);
        }
        boolean bl3 = this.L;
        rectF = this.G;
        object3 = this.p;
        if (!bl3 && (bl3 = (string2 = "__container").equals(object2 = ((pp1)object3).c))) {
            boolean bl4;
            rectF.setEmpty();
            object2 = arrayList.iterator();
            while (bl4 = object2.hasNext()) {
                object3 = (kw_1)object2.next();
                string2 = this.H;
                ((kw_1)object3).f((RectF)string2, matrix, n7 != 0);
                rectF.union((RectF)string2);
            }
        } else {
            float f5 = ((pp1)object3).o;
            n8 = 0;
            string2 = null;
            float f6 = ((pp1)object3).p;
            rectF.set(0.0f, 0.0f, f5, f6);
            matrix.mapRect(rectF);
        }
        object2 = this.I;
        if (bl2) {
            object3 = this.J;
            n8 = 0;
            string2 = null;
            ((d72$a)object3).b = null;
            ((d72$a)object3).a = n3;
            if (bw0_02 != null) {
                n3 = Color.alpha((int)bw0_02.d);
                ((d72$a)object3).b = n3 > 0 ? bw0_02 : null;
                bw0_02 = null;
            }
            canvas = ((d72)object2).e((Canvas)object, rectF, (d72$a)object3);
        } else {
            canvas = object;
        }
        object.save();
        n4 = object.clipRect(rectF);
        if (n4 != 0) {
            for (n4 = arrayList.size() - n7; n4 >= 0; n4 += -1) {
                kw_1 kw_12 = (kw_1)arrayList.get(n4);
                kw_12.i(canvas, matrix, n10, bw0_02);
            }
        }
        if (bl2) {
            ((d72)object2).c();
        }
        object.restore();
        object = Yo1.a;
    }

    public final void q(ko1 ko12, int n3, ArrayList arrayList, ko1 ko13) {
        Object object;
        int n4;
        for (int i3 = 0; i3 < (n4 = ((ArrayList)(object = this.E)).size()); ++i3) {
            object = (kw_1)((ArrayList)object).get(i3);
            ((kw_1)object).c(ko12, n3, arrayList, ko13);
        }
    }

    public final void r(boolean bl2) {
        boolean bl3;
        super.r(bl2);
        Iterator iterator = this.E.iterator();
        while (bl3 = iterator.hasNext()) {
            kw_1 kw_12 = (kw_1)iterator.next();
            kw_12.r(bl2);
        }
    }

    public final void s(float f5) {
        float f6;
        float f7;
        Object object;
        Object object2 = Yo1.a;
        this.K = f5;
        super.s(f5);
        object2 = this.D;
        pp1 pp12 = this.p;
        if (object2 != null) {
            object = this.o.a;
            f7 = object.m;
            f5 = object.l;
            f7 = f7 - f5 + 0.01f;
            object = pp12.b;
            f5 = object.l;
            object2 = (Float)((iw_0)object2).f();
            f6 = ((Float)object2).floatValue();
            QB1 qB1 = pp12.b;
            float f8 = qB1.n;
            f6 = f6 * f8 - f5;
            f5 = f6 / f7;
        }
        if ((object2 = this.D) == null) {
            object2 = pp12.b;
            f7 = ((QB1)object2).m;
            f6 = ((QB1)object2).l;
            f7 -= f6;
            f6 = pp12.n / f7;
            f5 -= f6;
        }
        f6 = pp12.m;
        f7 = 0.0f;
        Object object3 = null;
        float f11 = f6 - 0.0f;
        Object object4 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object4 != false && (object4 = (Object)((String)(object2 = "__container")).equals(object3 = pp12.c)) == false) {
            f6 = pp12.m;
            f5 /= f6;
        }
        object2 = this.E;
        for (int i3 = ((ArrayList)object2).size() + -1; i3 >= 0; i3 += -1) {
            object3 = (kw_1)((ArrayList)object2).get(i3);
            ((kw_1)object3).s(f5);
        }
        object = Yo1.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.inputmethod.ExtractedText
 */
import android.graphics.Rect;
import android.view.inputmethod.ExtractedText;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;

public final class Uh
extends qt1_0 {
    public i b;
    public xt1_0 c;
    public i23_0 d;

    public final void a() {
        Object object = this.a;
        if (object != null) {
            th_0 th_02 = new th_0(null, this, (Qt1$a)object, null);
            this.b = object = object.p(th_02);
        }
    }

    public final void b() {
        Object object = this.b;
        if (object != null) {
            object.d(null);
        }
        this.b = null;
        object = this.k();
        if (object != null) {
            object = (i23_0)object;
            ((i23_0)object).d();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void c(ql3_0 object, ql3_0 object2) {
        Object object3;
        int n3;
        Object object4;
        int n4 = 1;
        Object object5 = this.c;
        if (object5 == null) return;
        Object object6 = ((xt1_0)object5).h;
        long l2 = ((ql3_0)object6).b;
        long l3 = ((ql3_0)object2).b;
        int n7 = mm3.a(l2, l3);
        int n8 = 0;
        if (n7 != 0 && (n7 = Intrinsics.areEqual(object6 = ((xt1_0)object5).h.c, object4 = ((ql3_0)object2).c)) != 0) {
            n7 = 0;
            object6 = null;
        } else {
            n7 = 1;
        }
        ((xt1_0)object5).h = object2;
        object4 = ((xt1_0)object5).j;
        int n10 = ((ArrayList)object4).size();
        Object object7 = null;
        for (n3 = 0; n3 < n10; n3 += n4) {
            object3 = (XF2)((WeakReference)((xt1_0)object5).j.get(n3)).get();
            if (object3 == null) continue;
            ((XF2)object3).g = object2;
        }
        object4 = ((xt1_0)object5).m;
        object7 = ((Nt1)object4).c;
        synchronized (object7) {
            int n14;
            long l4;
            long l7;
            int n15;
            block24: {
                n15 = 0;
                object3 = null;
                ((Nt1)object4).j = null;
                ((Nt1)object4).l = null;
                ((Nt1)object4).k = null;
                ((Nt1)object4).m = null;
                ((Nt1)object4).n = null;
                object4 = Unit.a;
                n10 = (int)(Intrinsics.areEqual(object, object2) ? 1 : 0);
                n3 = -1;
                if (n10 == 0) break block24;
                if (n7 == 0) return;
                object = ((xt1_0)object5).b;
                n4 = mm3.e(((ql3_0)object2).b);
                l2 = ((ql3_0)object2).b;
                int n16 = mm3.d(l2);
                object6 = ((xt1_0)object5).h.c;
                if (object6 != null) {
                    l2 = ((mm3)object6).a;
                    n7 = mm3.e(l2);
                } else {
                    n7 = -1;
                }
                object5 = ((xt1_0)object5).h.c;
                if (object5 != null) {
                    long l8 = ((mm3)object5).a;
                    n3 = mm3.d(l8);
                }
                object.b(n4, n16, n7, n3);
                return;
            }
            if (object != null && ((n7 = Intrinsics.areEqual(object6 = ((ql3_0)object).a.a, object4 = ((ql3_0)object2).a.a)) == 0 || (n7 = (int)(mm3.a(l7 = ((ql3_0)object).b, l4 = ((ql3_0)object2).b) ? 1 : 0)) != 0 && (n14 = (int)(Intrinsics.areEqual(object = ((ql3_0)object).c, object2 = ((ql3_0)object2).c) ? 1 : 0)) == 0)) {
                object = ((xt1_0)object5).b;
                object.c();
                return;
            } else {
                object = ((xt1_0)object5).j;
                n14 = ((ArrayList)object).size();
                while (n8 < n14) {
                    object2 = (XF2)((WeakReference)((xt1_0)object5).j.get(n8)).get();
                    if (object2 != null) {
                        object6 = ((xt1_0)object5).h;
                        object4 = ((xt1_0)object5).b;
                        n15 = ((XF2)object2).k;
                        if (n15 != 0) {
                            int n17;
                            ((XF2)object2).g = object6;
                            n15 = ((XF2)object2).i;
                            if (n15 != 0) {
                                n17 = ((XF2)object2).h;
                                object3 = wi3_2.a((ql3_0)object6);
                                object4.a(n17, (ExtractedText)object3);
                            }
                            if ((object2 = ((ql3_0)object6).c) != null) {
                                l7 = ((mm3)object2).a;
                                n17 = mm3.e(l7);
                            } else {
                                n17 = -1;
                            }
                            object3 = ((ql3_0)object6).c;
                            if (object3 != null) {
                                l7 = ((mm3)object3).a;
                                n15 = mm3.d(l7);
                            } else {
                                n15 = -1;
                            }
                            long l12 = ((ql3_0)object6).b;
                            n7 = mm3.e(l12);
                            int n18 = mm3.d(l12);
                            object4.b(n7, n18, n17, n15);
                        }
                    }
                    n8 += n4;
                }
            }
            return;
            finally {
            }
        }
    }

    public final void d(ql3_0 object, Se1 object2, dk3_0 dk3_02, Vt1$a vt1$a) {
        Sh sh = new Sh((ql3_0)object, this, (Se1)object2, dk3_02, vt1$a);
        object = this.a;
        if (object != null) {
            dk3_02 = null;
            object2 = new th_0(sh, this, (Qt1$a)object, null);
            this.b = object = object.p((th_0)object2);
        }
    }

    public final void f(aG2 object) {
        xt1_0 xt1_02 = this.c;
        if (xt1_02 != null) {
            Rect rect;
            float f5 = ((aG2)object).a;
            int n3 = ok1_1.b(f5);
            float f6 = ((aG2)object).b;
            int n4 = ok1_1.b(f6);
            float f7 = ((aG2)object).c;
            int n7 = ok1_1.b(f7);
            float f8 = ((aG2)object).d;
            int n8 = ok1_1.b(f8);
            xt1_02.l = rect = new Rect(n3, n4, n7, n8);
            object = xt1_02.j;
            n8 = (int)(((ArrayList)object).isEmpty() ? 1 : 0);
            if (n8 != 0 && (object = xt1_02.l) != null) {
                rect = new Rect((Rect)object);
                object = xt1_02.a;
                object.requestRectangleOnScreen(rect);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(ql3_0 object, i72 i722, Tl3 tl3, ek3_0 object2, aG2 aG22, aG2 aG23) {
        object2 = this.c;
        if (object2 == null) return;
        object2 = ((xt1_0)object2).m;
        Object object3 = ((Nt1)object2).c;
        synchronized (object3) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        ((Nt1)object2).j = object;
                        ((Nt1)object2).l = i722;
                        ((Nt1)object2).k = tl3;
                        ((Nt1)object2).m = aG22;
                        ((Nt1)object2).n = aG23;
                        boolean bl2 = ((Nt1)object2).e;
                        if (!bl2 && !(bl2 = ((Nt1)object2).d)) break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    ((Nt1)object2).a();
                }
                object = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    public final void i() {
        qr1_2 qr1_22 = this.k();
        if (qr1_22 != null) {
            Unit unit = Unit.a;
            qr1_22 = (i23_0)qr1_22;
            ((i23_0)qr1_22).a(unit);
        }
    }

    public final qr1_2 k() {
        Object object = this.d;
        if (object != null) {
            return object;
        }
        boolean bl2 = ef3_0.a;
        if (!bl2) {
            return null;
        }
        object = he_2.DROP_LATEST;
        this.d = object = k23_0.b(1, 0, (he_2)((Object)object), 2);
        return object;
    }
}


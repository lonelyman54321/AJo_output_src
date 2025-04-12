/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.Choreographer
 *  android.view.View
 *  android.view.inputmethod.ExtractedText
 */
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Bl3
implements zt2_0 {
    public final View a;
    public final Ph1 b;
    public final Executor c;
    public boolean d;
    public Function1 e;
    public Function1 f;
    public ql3_0 g;
    public Se1 h;
    public final ArrayList i;
    public final rq1_2 j;
    public Rect k;
    public final uf0_0 l;
    public final WR1 m;
    public w6 n;

    public Bl3(View object, Ow2 bl3$aArray) {
        rh1_0 rh1_02 = new rh1_0((View)object);
        Object object2 = Choreographer.getInstance();
        Gl3 gl3 = new Gl3((Choreographer)object2);
        this.a = object;
        this.b = rh1_02;
        this.c = gl3;
        object = el3_0.c;
        this.e = object;
        object = fl3_0.c;
        this.f = object;
        long l2 = mm3.b;
        super("", l2, 4);
        this.g = object;
        object = Se1.g;
        this.h = object;
        super();
        this.i = object;
        object = et1_2.NONE;
        super(this);
        object = yr1_2.a((et1_2)((Object)object), (Function0)object2);
        this.j = object;
        super((Ow2)bl3$aArray, rh1_02);
        this.l = object;
        bl3$aArray = new Bl3$a[16];
        super((Object[])bl3$aArray);
        this.m = object;
    }

    public final void a() {
        Bl3$a bl3$a = Bl3$a.StartInput;
        this.i(bl3$a);
    }

    public final void b() {
        this.d = false;
        Object object = Bl3$c.c;
        this.e = object;
        object = Bl3$d.c;
        this.f = object;
        this.k = null;
        object = Bl3$a.StopInput;
        this.i((Bl3$a)((Object)object));
    }

    public final void c(ql3_0 object, ql3_0 object2) {
        Object object3;
        int n3;
        Object object4;
        int n4 = 1;
        Object object5 = this.g;
        long l2 = ((ql3_0)object5).b;
        long l3 = ((ql3_0)object2).b;
        int n7 = mm3.a(l2, l3);
        int n8 = 0;
        mm3 mm32 = null;
        if (n7 != 0 && (n7 = Intrinsics.areEqual(object5 = this.g.c, object4 = ((ql3_0)object2).c)) != 0) {
            n7 = 0;
            object5 = null;
        } else {
            n7 = 1;
        }
        this.g = object2;
        object4 = this.i;
        int n10 = ((ArrayList)object4).size();
        Object object6 = null;
        for (n3 = 0; n3 < n10; n3 += n4) {
            object3 = (YF2)((WeakReference)this.i.get(n3)).get();
            if (object3 == null) continue;
            ((YF2)object3).d = object2;
        }
        object4 = this.l;
        object6 = ((uf0_0)object4).c;
        synchronized (object6) {
            int n14;
            long l4;
            long l7;
            int n15;
            block25: {
                block26: {
                    n15 = 0;
                    object3 = null;
                    ((uf0_0)object4).j = null;
                    ((uf0_0)object4).l = null;
                    ((uf0_0)object4).k = null;
                    sf0_0 sf0_02 = sf0_0.c;
                    ((uf0_0)object4).m = sf0_02;
                    ((uf0_0)object4).n = null;
                    ((uf0_0)object4).o = null;
                    object4 = Unit.a;
                    n10 = (int)(Intrinsics.areEqual(object, object2) ? 1 : 0);
                    n3 = -1;
                    if (n10 == 0) break block25;
                    if (n7 == 0) break block26;
                    object = this.b;
                    long l8 = ((ql3_0)object2).b;
                    n4 = mm3.e(l8);
                    l2 = ((ql3_0)object2).b;
                    int n16 = mm3.d(l2);
                    object5 = this.g.c;
                    if (object5 != null) {
                        l2 = ((mm3)object5).a;
                        n7 = mm3.e(l2);
                    } else {
                        n7 = -1;
                    }
                    mm32 = this.g.c;
                    if (mm32 != null) {
                        long l12 = mm32.a;
                        n3 = mm3.d(l12);
                    }
                    object.b(n4, n16, n7, n3);
                }
                return;
            }
            if (object != null && ((n7 = Intrinsics.areEqual(object5 = ((ql3_0)object).a.a, object4 = ((ql3_0)object2).a.a)) == 0 || (n7 = (int)(mm3.a(l7 = ((ql3_0)object).b, l4 = ((ql3_0)object2).b) ? 1 : 0)) != 0 && (n14 = (int)(Intrinsics.areEqual(object = ((ql3_0)object).c, object2 = ((ql3_0)object2).c) ? 1 : 0)) == 0)) {
                object = this.b;
                object.c();
            } else {
                object = this.i;
                n14 = ((ArrayList)object).size();
                while (n8 < n14) {
                    object2 = (YF2)((WeakReference)this.i.get(n8)).get();
                    if (object2 != null) {
                        object5 = this.g;
                        object4 = this.b;
                        n15 = ((YF2)object2).h;
                        if (n15 != 0) {
                            int n17;
                            ((YF2)object2).d = object5;
                            n15 = ((YF2)object2).f;
                            if (n15 != 0) {
                                n17 = ((YF2)object2).e;
                                object3 = Zh1.a((ql3_0)object5);
                                object4.a(n17, (ExtractedText)object3);
                            }
                            if ((object2 = ((ql3_0)object5).c) != null) {
                                l7 = ((mm3)object2).a;
                                n17 = mm3.e(l7);
                            } else {
                                n17 = -1;
                            }
                            object3 = ((ql3_0)object5).c;
                            if (object3 != null) {
                                l7 = ((mm3)object3).a;
                                n15 = mm3.d(l7);
                            } else {
                                n15 = -1;
                            }
                            long l14 = ((ql3_0)object5).b;
                            n7 = mm3.e(l14);
                            int n18 = mm3.d(l14);
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

    public final void d(ql3_0 object, Se1 se1, dk3_0 dk3_02, Vt1$a vt1$a) {
        this.d = true;
        this.g = object;
        this.h = se1;
        this.e = dk3_02;
        this.f = vt1$a;
        object = Bl3$a.StartInput;
        this.i((Bl3$a)((Object)object));
    }

    public final void e() {
        Bl3$a bl3$a = Bl3$a.HideKeyboard;
        this.i(bl3$a);
    }

    public final void f(aG2 object) {
        Rect rect;
        float f5 = ((aG2)object).a;
        int n3 = ok1_1.b(f5);
        float f6 = ((aG2)object).b;
        int n4 = ok1_1.b(f6);
        float f7 = ((aG2)object).c;
        int n7 = ok1_1.b(f7);
        float f8 = ((aG2)object).d;
        int n8 = ok1_1.b(f8);
        this.k = rect = new Rect(n3, n4, n7, n8);
        object = this.i;
        n8 = (int)(((ArrayList)object).isEmpty() ? 1 : 0);
        if (n8 != 0 && (object = this.k) != null) {
            rect = new Rect((Rect)object);
            object = this.a;
            object.requestRectangleOnScreen(rect);
        }
    }

    public final void g() {
        Bl3$a bl3$a = Bl3$a.ShowKeyboard;
        this.i(bl3$a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(ql3_0 object, i72 i722, Tl3 tl3, ek3_0 ek3_02, aG2 aG22, aG2 aG23) {
        uf0_0 uf0_02 = this.l;
        Object object2 = uf0_02.c;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        uf0_02.j = object;
                        uf0_02.l = i722;
                        uf0_02.k = tl3;
                        uf0_02.m = ek3_02;
                        uf0_02.n = aG22;
                        uf0_02.o = aG23;
                        boolean bl2 = uf0_02.e;
                        if (!bl2 && !(bl2 = uf0_02.d)) break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    uf0_02.a();
                }
                object = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    public final void i(Bl3$a object) {
        Object object2 = this.m;
        ((WR1)object2).b(object);
        object = this.n;
        if (object == null) {
            int n3 = 1;
            object = new w6(this, n3);
            object2 = this.c;
            object2.execute((Runnable)object);
            this.n = object;
        }
    }
}


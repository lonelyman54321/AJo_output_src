/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.RenderNode
 *  android.os.Build$VERSION
 *  android.widget.EdgeEffect
 */
import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Pt0
 */
public final class pt0_0
extends ni1_0
implements ht0 {
    public final wh_0 c;
    public final lx0 d;
    public RenderNode e;

    public pt0_0(wh_0 wh_02, lx0 lx02, Function1 function1) {
        super(function1);
        this.c = wh_02;
        this.d = lx02;
    }

    public static boolean b(float f5, EdgeEffect edgeEffect, Canvas canvas) {
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object == false) {
            return edgeEffect.draw(canvas);
        }
        object = canvas.save();
        canvas.rotate(f5);
        boolean bl2 = edgeEffect.draw(canvas);
        canvas.restoreToCount((int)object);
        return bl2;
    }

    public final /* synthetic */ boolean all(Function1 function1) {
        return mp1_1.a(this, function1);
    }

    public final /* synthetic */ boolean any(Function1 function1) {
        return mp1_1.c(this, function1);
    }

    public final Object foldIn(Object object, Function2 function2) {
        return function2.invoke(object, this);
    }

    public final RenderNode j() {
        RenderNode renderNode = this.e;
        if (renderNode == null) {
            this.e = renderNode = lt0_0.a();
        }
        return renderNode;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(E60 e60) {
        Throwable throwable2222222;
        long l2;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        block63: {
            EdgeEffect edgeEffect;
            long l3;
            float f5;
            int n3;
            EdgeEffect edgeEffect2;
            EdgeEffect edgeEffect3;
            int n4;
            int n7;
            int n8;
            float f6;
            object6 = e60;
            long l4 = e60.l();
            Object object7 = this.c;
            ((wh_0)object7).l(l4);
            l4 = e60.l();
            boolean bl2 = C63.e(l4);
            if (bl2) {
                e60.e1();
                return;
            }
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((wh_0)object7).c;
            parcelableSnapshotMutableState.getValue();
            float f7 = RV.a;
            f7 = e60.J0(f7);
            Object object8 = Nf.a(e60.M0().a());
            object5 = this.d;
            EdgeEffect edgeEffect4 = ((lx0)object5).d;
            boolean bl3 = lx0.f(edgeEffect4);
            int n10 = 1;
            float f8 = Float.MIN_VALUE;
            if (!(bl3 || (bl3 = lx0.g(edgeEffect4 = ((lx0)object5).h)) || (bl3 = lx0.f(edgeEffect4 = ((lx0)object5).e)) || (bl3 = lx0.g(edgeEffect4 = ((lx0)object5).i)))) {
                bl3 = false;
                f6 = 0.0f;
                edgeEffect4 = null;
            } else {
                bl3 = true;
                f6 = Float.MIN_VALUE;
            }
            object4 = ((lx0)object5).f;
            boolean bl4 = lx0.f(object4);
            if (!(bl4 || (bl4 = lx0.g(object4 = ((lx0)object5).j)) || (bl4 = lx0.f(object4 = ((lx0)object5).g)) || (bl4 = lx0.g(object4 = ((lx0)object5).k)))) {
                bl4 = false;
                object4 = null;
            } else {
                bl4 = true;
            }
            if (bl3 && bl4) {
                object3 = this.j();
                n8 = object8.getWidth();
                n7 = object8.getHeight();
                Mt0.a(object3, n8, n7);
            } else if (bl3) {
                object3 = this.j();
                n8 = object8.getWidth();
                n7 = ok1_1.b(f7) * 2 + n8;
                n8 = object8.getHeight();
                Mt0.a(object3, n7, n8);
            } else {
                if (!bl4) {
                    e60.e1();
                    return;
                }
                object3 = this.j();
                n8 = object8.getWidth();
                n7 = object8.getHeight();
                int n14 = ok1_1.b(f7) * 2 + n7;
                Mt0.a(object3, n8, n14);
            }
            object3 = FJ.a(this.j());
            object2 = ((lx0)object5).j;
            n8 = (int)(lx0.g(object2) ? 1 : 0);
            n7 = 1119092736;
            float f11 = 90.0f;
            if (n8 != 0) {
                object2 = ((lx0)object5).j;
                if (object2 == null) {
                    ((lx0)object5).j = object2 = ((lx0)object5).a();
                }
                pt0_0.b(f11, object2, (Canvas)object3);
                object2.finish();
            }
            object2 = ((lx0)object5).f;
            n8 = (int)(lx0.f(object2) ? 1 : 0);
            bm_0 bm_02 = bm_0.a;
            int n15 = 1132920832;
            float f12 = 270.0f;
            int n16 = 31;
            float f14 = 4.3E-44f;
            if (n8 != 0) {
                object2 = ((lx0)object5).c();
                n4 = pt0_0.b(f12, object2, (Canvas)object3);
                edgeEffect3 = ((lx0)object5).f;
                n7 = (int)(lx0.g(edgeEffect3) ? 1 : 0);
                if (n7 != 0) {
                    long l7 = ((wh_0)object7).f();
                    f11 = e72.e(l7);
                    edgeEffect2 = ((lx0)object5).j;
                    if (edgeEffect2 == null) {
                        ((lx0)object5).j = edgeEffect2 = ((lx0)object5).a();
                    }
                    if ((n3 = Build.VERSION.SDK_INT) >= n16) {
                        f5 = bm_02.b((EdgeEffect)object2);
                    } else {
                        n8 = 0;
                        f5 = 0.0f;
                        object2 = null;
                    }
                    f14 = (float)n10 - f11;
                    n7 = 31;
                    f11 = 4.3E-44f;
                    if (n3 >= n7) {
                        bm_02.c(edgeEffect2, f5, f14);
                    } else {
                        edgeEffect2.onPull(f5, f14);
                    }
                }
            } else {
                n4 = 0;
            }
            object = ((lx0)object5).h;
            n16 = (int)(lx0.g(object) ? 1 : 0);
            n8 = 0x43340000;
            f5 = 180.0f;
            if (n16 != 0) {
                object = ((lx0)object5).h;
                if (object == null) {
                    ((lx0)object5).h = object = ((lx0)object5).a();
                }
                pt0_0.b(f5, object, (Canvas)object3);
                object.finish();
            }
            if ((n16 = (int)(lx0.f(object = ((lx0)object5).d) ? 1 : 0)) != 0) {
                object = ((lx0)object5).e();
                n7 = 0;
                f11 = 0.0f;
                edgeEffect3 = null;
                n15 = (int)(pt0_0.b(0.0f, object, (Canvas)object3) ? 1 : 0);
                n4 = n15 == 0 && n4 == 0 ? 0 : 1;
                edgeEffect3 = ((lx0)object5).d;
                n7 = (int)(lx0.g(edgeEffect3) ? 1 : 0);
                if (n7 != 0) {
                    l3 = ((wh_0)object7).f();
                    f11 = e72.d(l3);
                    edgeEffect2 = ((lx0)object5).h;
                    if (edgeEffect2 == null) {
                        ((lx0)object5).h = edgeEffect2 = ((lx0)object5).a();
                    }
                    n3 = Build.VERSION.SDK_INT;
                    n10 = 31;
                    f8 = 4.3E-44f;
                    if (n3 >= n10) {
                        f14 = bm_02.b((EdgeEffect)object);
                    } else {
                        n16 = 0;
                        f14 = 0.0f;
                        object = null;
                    }
                    if (n3 >= n10) {
                        bm_02.c(edgeEffect2, f14, f11);
                    } else {
                        edgeEffect2.onPull(f14, f11);
                    }
                }
            }
            if ((n10 = lx0.g(edgeEffect = ((lx0)object5).k)) != 0) {
                edgeEffect = ((lx0)object5).k;
                if (edgeEffect == null) {
                    ((lx0)object5).k = edgeEffect = ((lx0)object5).a();
                }
                n16 = 1132920832;
                f14 = 270.0f;
                pt0_0.b(f14, edgeEffect, (Canvas)object3);
                edgeEffect.finish();
            }
            if ((n10 = lx0.f(edgeEffect = ((lx0)object5).g)) != 0) {
                f14 = 90.0f;
                edgeEffect = ((lx0)object5).d();
                n16 = (int)(pt0_0.b(f14, edgeEffect, (Canvas)object3) ? 1 : 0);
                n4 = n16 == 0 && n4 == 0 ? 0 : 1;
                object = ((lx0)object5).g;
                n16 = (int)(lx0.g(object) ? 1 : 0);
                if (n16 != 0) {
                    l3 = ((wh_0)object7).f();
                    f14 = e72.e(l3);
                    edgeEffect3 = ((lx0)object5).k;
                    if (edgeEffect3 == null) {
                        ((lx0)object5).k = edgeEffect3 = ((lx0)object5).a();
                    }
                    if ((n15 = Build.VERSION.SDK_INT) >= (n3 = 31)) {
                        f8 = bm_02.b(edgeEffect);
                    } else {
                        n10 = 0;
                        f8 = 0.0f;
                        edgeEffect = null;
                    }
                    if (n15 >= n3) {
                        bm_02.c(edgeEffect3, f8, f14);
                    } else {
                        edgeEffect3.onPull(f8, f14);
                    }
                }
            }
            if ((n10 = lx0.g(edgeEffect = ((lx0)object5).i)) != 0) {
                edgeEffect = ((lx0)object5).i;
                if (edgeEffect == null) {
                    ((lx0)object5).i = edgeEffect = ((lx0)object5).a();
                }
                n7 = 0;
                f11 = 0.0f;
                edgeEffect3 = null;
                pt0_0.b(0.0f, edgeEffect, (Canvas)object3);
                edgeEffect.finish();
            } else {
                n7 = 0;
                f11 = 0.0f;
                edgeEffect3 = null;
            }
            edgeEffect = ((lx0)object5).e;
            n10 = lx0.f(edgeEffect);
            if (n10 != 0) {
                edgeEffect = ((lx0)object5).b();
                n16 = (int)(pt0_0.b(f5, edgeEffect, (Canvas)object3) ? 1 : 0);
                if (n16 == 0 && n4 == 0) {
                    n16 = 0;
                    f14 = 0.0f;
                    object = null;
                } else {
                    n16 = 1;
                    f14 = Float.MIN_VALUE;
                }
                object2 = ((lx0)object5).e;
                n8 = (int)(lx0.g(object2) ? 1 : 0);
                if (n8 != 0) {
                    int n17;
                    l3 = ((wh_0)object7).f();
                    f5 = e72.d(l3);
                    edgeEffect2 = ((lx0)object5).i;
                    if (edgeEffect2 == null) {
                        ((lx0)object5).i = edgeEffect2 = ((lx0)object5).a();
                    }
                    if ((n17 = Build.VERSION.SDK_INT) >= (n3 = 31)) {
                        f8 = bm_02.b(edgeEffect);
                    } else {
                        n10 = 0;
                        f8 = 0.0f;
                        edgeEffect = null;
                    }
                    n7 = 1;
                    f11 = Float.MIN_VALUE;
                    f11 = (float)n7 - f5;
                    if (n17 >= n3) {
                        bm_02.c(edgeEffect2, f8, f11);
                    } else {
                        edgeEffect2.onPull(f8, f11);
                    }
                }
                n4 = n16;
            }
            if (n4 != 0) {
                ((wh_0)object7).g();
            }
            if (bl4) {
                n7 = 0;
                f11 = 0.0f;
                edgeEffect3 = null;
            } else {
                f11 = f7;
            }
            if (bl3) {
                bl2 = false;
                f7 = 0.0f;
                parcelableSnapshotMutableState = null;
            }
            object7 = e60.getLayoutDirection();
            object5 = new mf_0();
            ((mf_0)object5).a = object3;
            long l8 = e60.l();
            object = e60.M0().c();
            object4 = e60.M0().e();
            object3 = e60.M0().a();
            l2 = e60.M0().l();
            object2 = e60.M0().b;
            xL$b xL$b = e60.M0();
            xL$b.g((Vo0)object6);
            xL$b.i((bp1_0)((Object)object7));
            xL$b.f((iL)object5);
            xL$b.b(l8);
            int n18 = 0;
            object7 = null;
            xL$b.b = null;
            ((mf_0)object5).p();
            object7 = e60.M0();
            object7 = ((xL$b)object7).a;
            ((yl_0)object7).g(f11, f7);
            {
                catch (Throwable throwable2222222) {
                    break block63;
                }
                try {
                    e60.e1();
                    {
                        object7 = e60.M0();
                        object7 = ((xL$b)object7).a;
                    }
                }
                catch (Throwable throwable3) {}
                f6 = -f11;
                f7 = -f7;
                {
                    ((yl_0)object7).g(f6, f7);
                    ((mf_0)object5).h();
                    object7 = e60.M0();
                    ((xL$b)object7).g((Vo0)object);
                    ((xL$b)object7).i((bp1_0)((Object)object4));
                    ((xL$b)object7).f((iL)object3);
                    ((xL$b)object7).b(l2);
                    ((xL$b)object7).b = object2;
                }
                Nt0.a(this.j());
                n18 = object8.save();
                object8.translate(f6, f7);
                object6 = this.j();
                ot0_0.a(object8, (RenderNode)object6);
                object8.restoreToCount(n18);
                return;
                object8 = throwable3;
                {
                    object7 = e60.M0();
                    object7 = ((xL$b)object7).a;
                }
                f6 = -f11;
                f7 = -f7;
                {
                    ((yl_0)object7).g(f6, f7);
                    throw object8;
                }
            }
        }
        ((mf_0)object5).h();
        object6 = e60.M0();
        ((xL$b)object6).g((Vo0)object);
        ((xL$b)object6).i((bp1_0)((Object)object4));
        ((xL$b)object6).f((iL)object3);
        ((xL$b)object6).b(l2);
        ((xL$b)object6).b = object2;
        throw throwable2222222;
    }

    public final /* synthetic */ LP1 then(LP1 lP1) {
        return kp1_0.a(this, lP1);
    }
}


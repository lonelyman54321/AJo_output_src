/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.view.ViewGroup
 */
import android.graphics.Canvas;
import android.view.ViewGroup;
import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class Ri
extends uP2
implements ti2_0,
qp2_0 {
    public final boolean c;
    public final float d;
    public final ib3_0 e;
    public final ib3_0 f;
    public final ViewGroup g;
    public RippleContainer h;
    public final ParcelableSnapshotMutableState i;
    public final ParcelableSnapshotMutableState j;
    public long k;
    public int l;
    public final Qi m;

    public Ri() {
        throw null;
    }

    public Ri(boolean bl2, float f5, tr1_0 tr1_02, tr1_0 tr1_03, ViewGroup viewGroup) {
        super(bl2, tr1_03);
        this.c = bl2;
        this.d = f5;
        this.e = tr1_02;
        this.f = tr1_03;
        this.g = viewGroup;
        Object object = J83.g(null);
        this.i = object;
        object = J83.g(Boolean.TRUE);
        this.j = object;
        this.k = 0L;
        this.l = -1;
        this.m = object = new Qi(this);
    }

    public final void B0() {
        this.i.setValue(null);
    }

    public final void a(E60 e60) {
        long l2;
        this.k = l2 = e60.l();
        float f5 = this.d;
        int n3 = Float.isNaN(f5);
        if (n3 != 0) {
            n3 = this.c;
            long l3 = e60.l();
            float f6 = op2_0.a(e60, n3 != 0, l3);
            n3 = ok1_1.b(f6);
        } else {
            n3 = e60.e0(f5);
        }
        this.l = n3;
        long l4 = ((OX)this.e.getValue()).a;
        Object object = (kP2)this.f.getValue();
        float f7 = ((kP2)object).d;
        e60.e1();
        n3 = (int)(Float.isNaN(f5) ? 1 : 0);
        if (n3 != 0) {
            boolean bl2 = this.a;
            long l7 = e60.l();
            f5 = op2_0.a(e60, bl2, l7);
        } else {
            f5 = e60.J0(f5);
        }
        this.b.a(e60, f5, l4);
        iL iL2 = e60.M0().a();
        ((Boolean)this.j.getValue()).booleanValue();
        object = (RippleHostView)((Object)this.i.getValue());
        if (object != null) {
            long l8 = e60.l();
            ((RippleHostView)((Object)object)).setRippleProperties-07v42R4(l8, l4, f7);
            e60 = Nf.a(iL2);
            object.draw((Canvas)e60);
        }
    }

    public final void b(Ey2$b ey2$b) {
        Object object = this.h;
        if (object != null) {
            Intrinsics.checkNotNull(object);
        } else {
            object = BP2.a(this.g);
            this.h = object;
            Intrinsics.checkNotNull(object);
        }
        object = object.a(this);
        long l2 = this.k;
        int n3 = this.l;
        long l3 = ((OX)this.e.getValue()).a;
        float f5 = ((kP2)this.f.getValue()).d;
        Qi qi = this.m;
        boolean bl2 = this.c;
        ((RippleHostView)((Object)object)).b(ey2$b, bl2, l2, n3, l3, f5, qi);
        this.i.setValue(object);
    }

    public final void c(Ey2$b object) {
        object = (RippleHostView)((Object)this.i.getValue());
        if (object != null) {
            ((RippleHostView)((Object)object)).d();
        }
    }

    public final void onAbandoned() {
        Object object = this.h;
        if (object != null) {
            this.B0();
            Object object2 = object.d;
            RippleHostView rippleHostView = (RippleHostView)((Object)((rP2)object2).a.get(this));
            if (rippleHostView != null) {
                rippleHostView.c();
                LinkedHashMap linkedHashMap = ((rP2)object2).a;
                RippleHostView rippleHostView2 = (RippleHostView)((Object)linkedHashMap.get(this));
                if (rippleHostView2 != null) {
                    object2 = (qp2_0)((rP2)object2).b.remove((Object)rippleHostView2);
                }
                linkedHashMap.remove(this);
                object = object.c;
                ((ArrayList)object).add(rippleHostView);
            }
        }
    }

    public final void onForgotten() {
        Object object = this.h;
        if (object != null) {
            this.B0();
            Object object2 = object.d;
            RippleHostView rippleHostView = (RippleHostView)((Object)((rP2)object2).a.get(this));
            if (rippleHostView != null) {
                rippleHostView.c();
                LinkedHashMap linkedHashMap = ((rP2)object2).a;
                RippleHostView rippleHostView2 = (RippleHostView)((Object)linkedHashMap.get(this));
                if (rippleHostView2 != null) {
                    object2 = (qp2_0)((rP2)object2).b.remove((Object)rippleHostView2);
                }
                linkedHashMap.remove(this);
                object = object.c;
                ((ArrayList)object).add(rippleHostView);
            }
        }
    }

    public final void onRemembered() {
    }
}


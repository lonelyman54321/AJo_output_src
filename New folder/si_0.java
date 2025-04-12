/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.view.View
 */
import android.graphics.Canvas;
import android.view.View;
import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Si
 */
public final class si_0
extends xp2_0
implements qp2_0 {
    public RippleContainer x;
    public RippleHostView y;

    public final void B0() {
        this.y = null;
        jt0_0.a(this);
    }

    public final void k1() {
        Object object = this.x;
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

    public final void r1(Ey2$b ey2$b, long l2, float f5) {
        Object object = this.x;
        if (object != null) {
            Intrinsics.checkNotNull(object);
        } else {
            object = AndroidCompositionLocals_androidKt.f;
            object = BP2.a(BP2.b((View)K30.a(this, (H30)object)));
            this.x = object;
            Intrinsics.checkNotNull(object);
        }
        object = object.a(this);
        int n3 = ok1_1.b(f5);
        long l3 = this.q.a();
        float f6 = ((kP2)this.r.invoke()).d;
        Si$a si$a = new Si$a(this);
        boolean bl2 = this.o;
        ((RippleHostView)((Object)object)).b(ey2$b, bl2, l2, n3, l3, f6, si$a);
        this.y = object;
        jt0_0.a(this);
    }

    public final void s1(Kt0 object) {
        object = object.M0().a();
        RippleHostView rippleHostView = this.y;
        if (rippleHostView != null) {
            long l2 = this.u;
            long l3 = this.q.a();
            float f5 = ((kP2)this.r.invoke()).d;
            rippleHostView.setRippleProperties-07v42R4(l2, l3, f5);
            object = Nf.a((iL)object);
            rippleHostView.draw((Canvas)object);
        }
    }

    public final void u1(Ey2$b object) {
        object = this.y;
        if (object != null) {
            ((RippleHostView)((Object)object)).d();
        }
    }
}


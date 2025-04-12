/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class W80
extends Lambda
implements Function1 {
    public final /* synthetic */ Vt1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ cg3_0 e;
    public final /* synthetic */ Sk3 f;
    public final /* synthetic */ ql3_0 g;
    public final /* synthetic */ i72 h;

    public W80(Vt1 vt1, boolean bl2, cg3_0 cg3_02, Sk3 sk3, ql3_0 ql3_02, i72 i722) {
        this.c = vt1;
        this.d = bl2;
        this.e = cg3_02;
        this.f = sk3;
        this.g = ql3_02;
        this.h = i722;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (zp1)object;
        Object object2 = this.c;
        ((Vt1)object2).h = object;
        Object object3 = ((Vt1)object2).d();
        if (object3 != null) {
            ((Ul3)object3).b = object;
        }
        boolean bl2 = this.d;
        if (bl2) {
            boolean bl3;
            boolean bl4;
            object = ((Vt1)object2).a();
            object3 = x21_0.Selection;
            Object object4 = ((Vt1)object2).o;
            ql3_0 ql3_02 = this.g;
            boolean bl5 = true;
            Object object5 = this.f;
            if (object == object3) {
                object = (Boolean)((Vt1)object2).l.getValue();
                bl2 = (Boolean)object;
                if (bl2 && (bl2 = (object = this.e).a())) {
                    ((Sk3)object5).s();
                } else {
                    ((Sk3)object5).m();
                }
                object = Tk3.b((Sk3)object5, bl5);
                ((Vt1)object2).m.setValue(object);
                object = Tk3.b((Sk3)object5, false);
                object3 = ((Vt1)object2).n;
                ((h83_0)object3).setValue(object);
                long l2 = ql3_02.b;
                bl2 = mm3.b(l2);
                object = bl2;
                ((h83_0)object4).setValue(object);
            } else {
                object = ((Vt1)object2).a();
                if (object == (object3 = x21_0.Cursor)) {
                    bl2 = Tk3.b((Sk3)object5, bl5);
                    object = bl2;
                    ((h83_0)object4).setValue(object);
                }
            }
            object = this.h;
            o90.g((Vt1)object2, ql3_02, (i72)object);
            object = ((Vt1)object2).d();
            if (object != null && (object3 = ((Vt1)object2).e) != null && (bl4 = ((Vt1)object2).b()) && (object2 = ((Ul3)object).b) != null && (bl3 = object2.e()) && (object4 = ((Ul3)object).c) != null) {
                ek3_0 ek3_02 = new ek3_0((zp1)object2);
                aG2 aG22 = qY2.a((zp1)object2);
                aG2 aG23 = object2.G((zp1)object4, false);
                object2 = (Il3)((Il3)object3).a.b.get();
                bl4 = Intrinsics.areEqual(object2, object3);
                if (bl4) {
                    zt2_0 zt2_02 = ((Il3)object3).b;
                    Tl3 tl3 = ((Ul3)object).a;
                    object5 = this.g;
                    i72 i722 = this.h;
                    zt2_02.h((ql3_0)object5, i722, tl3, ek3_02, aG22, aG23);
                }
            }
        }
        return Unit.a;
    }
}


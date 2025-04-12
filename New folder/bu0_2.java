/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Bu0
 */
public final class bu0_2
extends Lambda
implements Function0 {
    public final /* synthetic */ yu0_0 c;
    public final /* synthetic */ Vo0 d;
    public final /* synthetic */ float e;

    public bu0_2(yu0_0 yu0_02, Vo0 vo0, float f5) {
        this.c = yu0_02;
        this.d = vo0;
        this.e = f5;
        super(0);
    }

    public final Object invoke() {
        boolean bl2;
        Object object = this.c;
        Object object2 = this.d;
        ((yu0_0)object).b = object2;
        float f5 = this.e;
        object2 = new au0_0(f5);
        Object object3 = new Ys0();
        ((au0_0)object2).invoke(object3);
        object2 = ((Ys0)object3).a;
        Object object4 = new RG1((Map)object2);
        object = ((yu0_0)object).a;
        object2 = ((Re)object).j;
        float f6 = ((D83)object2).c();
        boolean bl3 = Float.isNaN(f6);
        object3 = ((Re)object).h;
        if (!bl3) {
            f6 = ((Re)object).j.c();
            object2 = ((RG1)object4).b(f6);
            if (object2 == null) {
                object2 = ((mp0)object3).getValue();
            }
        } else {
            object2 = ((mp0)object3).getValue();
        }
        if (!(bl2 = Intrinsics.areEqual(object3 = ((Re)object).d(), object4))) {
            ((Re)object).m.setValue(object4);
            object4 = new qe_1((Re)object, object2);
            object3 = ((Re)object).e.b;
            boolean bl4 = ((ks1_1)object3).f(null);
            if (bl4) {
                try {
                    ((qe_1)object4).invoke();
                }
                finally {
                    ((ks1_1)object3).b(null);
                }
            }
            if (!bl4) {
                ((Re)object).g(object2);
            }
        }
        return Unit.a;
    }
}


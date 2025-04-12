/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public final class xP2$a$a
implements fs0_2 {
    public final /* synthetic */ xp2_0 a;
    public final /* synthetic */ i90_0 b;

    public xP2$a$a(xp2_0 xp2_02, i90_0 i90_02) {
        this.a = xp2_02;
        this.b = i90_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (kj1)object;
        boolean bl2 = object instanceof ey2_0;
        Object object3 = this.a;
        if (bl2) {
            bl2 = ((xp2_0)object3).v;
            if (bl2) {
                object = (ey2_0)object;
                ((xp2_0)object3).t1((ey2_0)object);
            } else {
                object2 = ((xp2_0)object3).w;
                ((hr1_0)object2).b(object);
            }
        } else {
            object2 = ((xp2_0)object3).s;
            if (object2 == null) {
                boolean bl3 = ((xp2_0)object3).o;
                Function0 function0 = ((xp2_0)object3).r;
                object2 = new nb3_0(function0, bl3);
                jt0_0.a((it0_0)object3);
                ((xp2_0)object3).s = object2;
            }
            object3 = this.b;
            ((nb3_0)object2).b((kj1)object, (i90_0)object3);
        }
        return Unit.a;
    }
}


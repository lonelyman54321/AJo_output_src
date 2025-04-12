/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class iP2$a
implements fs0_2 {
    public final /* synthetic */ uP2 a;
    public final /* synthetic */ i90_0 b;

    public iP2$a(uP2 uP22, i90_0 i90_02) {
        this.a = uP22;
        this.b = i90_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (kj1)object;
        boolean bl2 = object instanceof Ey2$b;
        Object object3 = this.a;
        if (bl2) {
            object = (Ey2$b)object;
            ((uP2)object3).b((Ey2$b)object);
        } else {
            bl2 = object instanceof Ey2$c;
            if (bl2) {
                object = ((Ey2$c)object).a;
                ((uP2)object3).c((Ey2$b)object);
            } else {
                bl2 = object instanceof Ey2$a;
                if (bl2) {
                    object = ((Ey2$a)object).a;
                    ((uP2)object3).c((Ey2$b)object);
                } else {
                    object2 = ((uP2)object3).b;
                    object3 = this.b;
                    ((nb3_0)object2).b((kj1)object, (i90_0)object3);
                }
            }
        }
        return Unit.a;
    }
}


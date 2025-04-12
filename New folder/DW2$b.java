/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class DW2$b
implements fs0_2 {
    public final /* synthetic */ yw2_0 a;

    public DW2$b(yw2_0 yw2_02) {
        this.a = yw2_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (List)object;
        object2 = yn3_0.a;
        Object[] objectArray = new Object[]{};
        ((yn3$a)object2).a("load success", objectArray);
        object2 = this.a;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        ((yw2_0)object2).y = object;
        ((yw2_0)object2).m.k(object);
        return Unit.a;
    }
}


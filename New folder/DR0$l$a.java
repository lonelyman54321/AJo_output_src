/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

public final class DR0$l$a
implements fs0_2 {
    public static final DR0$l$a a;

    static {
        DR0$l$a dR0$l$a;
        a = dR0$l$a = new Object();
    }

    public final Object emit(Object object, f80_0 f80_02) {
        boolean bl2;
        boolean bl3 = (object = (kk2_1)object) instanceof KK2$c;
        if (!(bl3 || (bl3 = object instanceof KK2$a) || (bl2 = object instanceof KK2$b))) {
            object = new NoWhenBranchMatchedException();
            throw object;
        }
        return Unit.a;
    }
}


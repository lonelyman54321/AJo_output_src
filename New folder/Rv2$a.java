/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

public final class Rv2$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$BooleanRef c;

    public Rv2$a(Ref$BooleanRef ref$BooleanRef) {
        this.c = ref$BooleanRef;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (rv2_1)object;
        boolean bl2 = ((rv2_1)object).q;
        if (bl2) {
            this.c.element = false;
            object = Xr3.CancelTraversal;
        } else {
            object = Xr3.ContinueTraversal;
        }
        return object;
    }
}


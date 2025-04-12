/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class xA3$a
extends Lambda
implements Function1 {
    public final /* synthetic */ xa3_1 c;

    public xA3$a(xa3_1 xa3_12) {
        this.c = xa3_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Uz3)object;
        object = this.c;
        ((xa3_1)object).d = true;
        ((xa3_1)object).f.invoke();
        return Unit.a;
    }
}


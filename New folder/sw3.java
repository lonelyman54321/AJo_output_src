/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class sw3
extends Lambda
implements Function1 {
    public final /* synthetic */ tw3 c;
    public final /* synthetic */ Function1 d;

    public sw3(tw3 tw32, Function1 function1) {
        this.c = tw32;
        this.d = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        ((Number)object).longValue();
        object = this.c;
        float f5 = ((tw3)object).e;
        ((tw3)object).e = 0.0f;
        object = Float.valueOf(f5);
        this.d.invoke(object);
        return Unit.a;
    }
}


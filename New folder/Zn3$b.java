/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Zn3$b
extends Lambda
implements Function0 {
    public final /* synthetic */ zn3_0 c;

    public Zn3$b(zn3_0 zn3_02) {
        this.c = zn3_02;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        Function1 function1 = ((zn3_0)object).I;
        object = ((zn3_0)object).H ^ true;
        function1.invoke(object);
        return Unit.a;
    }
}


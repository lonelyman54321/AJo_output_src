/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class mM2
implements Function1 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ int b;

    public mM2(sz_1 sz_12, int n3) {
        this.a = sz_12;
        this.b = n3;
    }

    public final Object invoke(Object object) {
        ((Boolean)object).booleanValue();
        object = this.b;
        this.a.invoke(object);
        return Unit.a;
    }
}


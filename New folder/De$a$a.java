/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;

public final class De$a$a
extends Lambda
implements Function2 {
    public final /* synthetic */ be_0 c;
    public final /* synthetic */ Ref$FloatRef d;

    public De$a$a(be_0 be_02, Ref$FloatRef ref$FloatRef) {
        this.c = be_02;
        this.d = ref$FloatRef;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        float f5 = ((Number)object).floatValue();
        float f6 = ((Number)object2).floatValue();
        this.c.a(f5, f6);
        this.d.element = f5;
        return Unit.a;
    }
}


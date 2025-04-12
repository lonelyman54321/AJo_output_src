/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;

public final class j83$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$FloatRef c;
    public final /* synthetic */ Function1 d;

    public j83$a(Ref$FloatRef ref$FloatRef, Function1 function1) {
        this.c = ref$FloatRef;
        this.d = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        float f5;
        float f6 = ((Number)object).floatValue();
        Ref$FloatRef ref$FloatRef = this.c;
        ref$FloatRef.element = f5 = ref$FloatRef.element - f6;
        object = Float.valueOf(f5);
        this.d.invoke(object);
        return Unit.a;
    }
}


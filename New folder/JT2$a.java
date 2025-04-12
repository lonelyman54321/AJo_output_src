/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;

public final class JT2$a
extends Lambda
implements Function2 {
    public final /* synthetic */ Ref$FloatRef c;
    public final /* synthetic */ QT2 d;

    public JT2$a(Ref$FloatRef ref$FloatRef, QT2 qT2) {
        this.c = ref$FloatRef;
        this.d = qT2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        float f5 = ((Number)object).floatValue();
        ((Number)object2).floatValue();
        object2 = this.c;
        float f6 = ((Ref$FloatRef)object2).element;
        QT2 qT2 = this.d;
        f5 -= f6;
        ((Ref$FloatRef)object2).element = f5 = qT2.a(f5) + f6;
        return Unit.a;
    }
}


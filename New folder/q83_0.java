/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;

/*
 * Renamed from q83
 */
public final class q83_0
extends Lambda
implements Function1 {
    public final /* synthetic */ float c;
    public final /* synthetic */ Ref$FloatRef d;
    public final /* synthetic */ QT2 e;
    public final /* synthetic */ Function1 f;

    public q83_0(float f5, Ref$FloatRef ref$FloatRef, kU2$b$a kU2$b$a, Function1 function1) {
        this.c = f5;
        this.d = ref$FloatRef;
        this.e = kU2$b$a;
        this.f = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        float f5;
        Number number;
        float f6;
        float f7;
        object = (tl_1)object;
        Number number2 = (Number)((tl_1)object).e.getValue();
        float f8 = number2.floatValue();
        float f11 = this.c;
        f8 = r83_0.c(f8, f11);
        Ref$FloatRef ref$FloatRef = this.d;
        float f12 = ref$FloatRef.element;
        f12 = f8 - f12;
        QT2 qT2 = this.e;
        float f14 = qT2.a(f12);
        Float f15 = Float.valueOf(f14);
        Function1 function1 = this.f;
        function1.invoke(f15);
        f12 = Math.abs(f12 - f14);
        float f16 = 0.5f;
        float f17 = f12 == f16 ? 0 : (f12 > f16 ? 1 : -1);
        if (f17 > 0 || (f7 = (f6 = f8 - (f12 = (number = (Number)((tl_1)object).e.getValue()).floatValue())) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) != false) {
            ((tl_1)object).a();
        }
        ref$FloatRef.element = f5 = ref$FloatRef.element + f14;
        return Unit.a;
    }
}


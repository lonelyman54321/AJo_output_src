/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;

public final class o83
extends Lambda
implements Function1 {
    public final /* synthetic */ float c;
    public final /* synthetic */ Ref$FloatRef d;
    public final /* synthetic */ QT2 e;
    public final /* synthetic */ Function1 f;

    public o83(float f5, Ref$FloatRef ref$FloatRef, kU2$b$a kU2$b$a, j83$b j83$b) {
        this.c = f5;
        this.d = ref$FloatRef;
        this.e = kU2$b$a;
        this.f = j83$b;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (tl_1)object;
        Number number = (Number)((tl_1)object).e.getValue();
        float f5 = Math.abs(number.floatValue());
        float f6 = this.c;
        float f7 = Math.abs(f6);
        float f8 = 0.5f;
        Object object2 = ((tl_1)object).e;
        Function1 function1 = this.f;
        QT2 qT2 = this.e;
        Ref$FloatRef ref$FloatRef = this.d;
        Object object3 = f5 == f7 ? 0 : (f5 > f7 ? 1 : -1);
        if (object3 >= 0) {
            number = (Number)((h83_0)object2).getValue();
            f5 = r83_0.c(number.floatValue(), f6);
            f6 = ref$FloatRef.element;
            f6 = f5 - f6;
            qT2 = (kU2$b$a)qT2;
            function1 = (j83$b)function1;
            f7 = ((kU2$b$a)qT2).a(f6);
            object2 = Float.valueOf(f7);
            ((j83$b)function1).invoke(object2);
            f6 = Math.abs(f6 - f7);
            float f11 = f6 == f8 ? 0 : (f6 > f8 ? 1 : -1);
            if (f11 > 0) {
                ((tl_1)object).a();
            }
            ((tl_1)object).a();
            ref$FloatRef.element = f5;
        } else {
            float f12;
            number = (Number)((h83_0)object2).getValue();
            f5 = number.floatValue();
            f6 = ref$FloatRef.element;
            f5 -= f6;
            qT2 = (kU2$b$a)qT2;
            function1 = (j83$b)function1;
            f6 = ((kU2$b$a)qT2).a(f5);
            Float f14 = Float.valueOf(f6);
            ((j83$b)function1).invoke(f14);
            f5 = Math.abs(f5 - f6);
            object3 = f5 == f8 ? 0 : (f5 > f8 ? 1 : -1);
            if (object3 > 0) {
                ((tl_1)object).a();
            }
            object = (Number)((h83_0)object2).getValue();
            ref$FloatRef.element = f12 = ((Number)object).floatValue();
        }
        return Unit.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;

public final class Ml0$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$FloatRef c;
    public final /* synthetic */ QT2 d;
    public final /* synthetic */ Ref$FloatRef e;
    public final /* synthetic */ nl0_0 f;

    public Ml0$a(Ref$FloatRef ref$FloatRef, kU2$b$a kU2$b$a, Ref$FloatRef ref$FloatRef2, nl0_0 nl0_02) {
        this.c = ref$FloatRef;
        this.d = kU2$b$a;
        this.e = ref$FloatRef2;
        this.f = nl0_02;
        super(1);
    }

    public final Object invoke(Object object) {
        float f5;
        object = (tl_1)object;
        Number number = (Number)((tl_1)object).e.getValue();
        float f6 = number.floatValue();
        Object object2 = this.c;
        float f7 = ((Ref$FloatRef)object2).element;
        f6 -= f7;
        QT2 qT2 = this.d;
        f7 = qT2.a(f6);
        ((Ref$FloatRef)object2).element = f5 = ((Number)((tl_1)object).e.getValue()).floatValue();
        object2 = ((tl_1)object).a.b();
        Object object3 = ((tl_1)object).f;
        object2 = (Number)object2.invoke(object3);
        float f8 = ((Number)object2).floatValue();
        object3 = this.e;
        ((Ref$FloatRef)object3).element = f8;
        float f11 = (f6 = Math.abs(f6 - f7)) - (f8 = 0.5f);
        Object object4 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object4 > 0) {
            ((tl_1)object).a();
        }
        this.f.getClass();
        return Unit.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.ranges.f;

/*
 * Renamed from sq1$b
 */
public final class sq1$b_0
extends Lambda
implements Function1 {
    public final /* synthetic */ float c;
    public final /* synthetic */ Ref$FloatRef d;
    public final /* synthetic */ QT2 e;

    public sq1$b_0(float f5, Ref$FloatRef ref$FloatRef, QT2 qT2) {
        this.c = f5;
        this.d = ref$FloatRef;
        this.e = qT2;
        super(1);
    }

    public final Object invoke(Object object) {
        float f5;
        float f6;
        object = (tl_1)object;
        float f7 = this.c;
        boolean bl2 = false;
        float f8 = 0.0f;
        Number number = null;
        float f11 = f7 - 0.0f;
        Object object2 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object2 > 0) {
            number = (Number)((tl_1)object).e.getValue();
            f8 = f.c(number.floatValue(), f7);
        } else {
            float f12 = f7 - 0.0f;
            object2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
            if (object2 < 0) {
                number = (Number)((tl_1)object).e.getValue();
                f8 = f.a(number.floatValue(), f7);
            }
        }
        Ref$FloatRef ref$FloatRef = this.d;
        float f14 = ref$FloatRef.element;
        f14 = f8 - f14;
        Object object3 = this.e;
        float f15 = object3.a(f14);
        float f16 = f14 == f15 ? 0 : (f14 < f15 ? -1 : 1);
        if (f16 != false || (bl2 = (f6 = f8 - (f15 = ((Number)(object3 = (Number)((tl_1)object).e.getValue())).floatValue())) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1))) {
            ((tl_1)object).a();
        }
        ref$FloatRef.element = f5 = ref$FloatRef.element + f14;
        return Unit.a;
    }
}


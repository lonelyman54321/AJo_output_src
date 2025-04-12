/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Renamed from JL2
 */
public final class jl2_1
implements Function1 {
    public final /* synthetic */ ib3_0 a;
    public final /* synthetic */ bb1_1 b;

    public /* synthetic */ jl2_1(ib3_0 ib3_02, bb1_1 bb1_12) {
        this.a = ib3_02;
        this.b = bb1_12;
    }

    public final Object invoke(Object object) {
        float f5;
        object = (a11_0)object;
        ib3_0 ib3_02 = this.a;
        Intrinsics.checkNotNullParameter(ib3_02, "$foundText");
        bb1_1 bb1_12 = this.b;
        Intrinsics.checkNotNullParameter(bb1_12, "$progress$delegate");
        Intrinsics.checkNotNullParameter(object, "$this$graphicsLayer");
        Serializable serializable = (Boolean)ib3_02.getValue();
        Object object2 = (Boolean)serializable;
        if (object2 != 0) {
            float f6 = ml2_1.b(bb1_12);
            float f7 = 0.6f;
            f5 = 1.0f;
            object2 = f6 == f7 ? 0 : (f6 > f7 ? 1 : -1);
            if (object2 <= 0) {
                serializable = (Number)bb1_12.getValue();
                f6 = ((Number)serializable).floatValue();
                f7 = 0.5f;
                f5 = f.f(f6, f7, f5);
            }
        } else {
            f5 = 0.0f;
        }
        object.b(f5);
        return Unit.a;
    }
}


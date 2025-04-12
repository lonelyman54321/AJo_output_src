/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IL2
 */
public final class il2_1
implements Function1 {
    public final /* synthetic */ ib3_0 a;
    public final /* synthetic */ bb1_1 b;

    public /* synthetic */ il2_1(ib3_0 ib3_02, bb1_1 bb1_12) {
        this.a = ib3_02;
        this.b = bb1_12;
    }

    public final Object invoke(Object object) {
        float f5;
        object = (a11_0)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$findingText");
        bb1_1 bb1_12 = this.b;
        Intrinsics.checkNotNullParameter(bb1_12, "$progress$delegate");
        Intrinsics.checkNotNullParameter(object, "$this$graphicsLayer");
        Boolean bl2 = (Boolean)object2.getValue();
        int n3 = bl2.booleanValue();
        if (n3 != 0) {
            n3 = 1065353216;
            f5 = 1.0f;
        } else {
            n3 = 1;
            f5 = n3;
            float f6 = ml2_1.b(bb1_12);
            float f7 = 0.43f;
            float f8 = (f6 = f5 - f6) - f7;
            Object object3 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (object3 > 0) {
                object2 = (Number)bb1_12.getValue();
                f6 = ((Number)object2).floatValue();
                f5 -= f6;
            } else {
                n3 = 0;
                f5 = 0.0f;
                bl2 = null;
            }
        }
        object.b(f5);
        return Unit.a;
    }
}


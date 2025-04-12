/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$DoubleRef;

/*
 * Renamed from uz3
 */
public final class uz3_0
implements Function2 {
    public final /* synthetic */ Ref$DoubleRef a;
    public final /* synthetic */ BaseValue b;
    public final /* synthetic */ Ref$DoubleRef c;

    public /* synthetic */ uz3_0(Ref$DoubleRef ref$DoubleRef, BaseValue baseValue, Ref$DoubleRef ref$DoubleRef2) {
        this.a = ref$DoubleRef;
        this.b = baseValue;
        this.c = ref$DoubleRef2;
    }

    public final Object invoke(Object object, Object object2) {
        Float f5;
        int n3;
        float f6;
        Float f7;
        object = (Double)object;
        double d2 = (Double)object;
        object2 = (Double)object2;
        double d5 = (Double)object2;
        Ref$DoubleRef ref$DoubleRef = this.a;
        Intrinsics.checkNotNullParameter(ref$DoubleRef, "$percentageWidth");
        Ref$DoubleRef ref$DoubleRef2 = this.c;
        Intrinsics.checkNotNullParameter(ref$DoubleRef2, "$percentageHeight");
        BaseValue baseValue = this.b;
        if (baseValue != null && (f7 = baseValue.getResolutionWidth()) != null) {
            f6 = f7.floatValue();
        } else {
            n3 = 0x44800000;
            f6 = 1024.0f;
        }
        double d7 = f6;
        d2 /= d7;
        n3 = 100;
        f6 = 1.4E-43f;
        d7 = n3;
        ref$DoubleRef.element = d2 *= d7;
        float f8 = baseValue != null && (f5 = baseValue.getResolutionHeight()) != null ? f5.floatValue() : 672.0f;
        d2 = f8;
        ref$DoubleRef2.element = d5 = d5 / d2 * d7;
        return Unit.a;
    }
}


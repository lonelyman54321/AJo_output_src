/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.functions.Function1;

public final class XY
implements DoubleUnaryOperator {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ XY(gP2$c gP2$c) {
        this.a = gP2$c;
    }

    public final double applyAsDouble(double d2) {
        Function1 function1 = this.a;
        Double d5 = d2;
        return ((Number)function1.invoke(d5)).doubleValue();
    }
}


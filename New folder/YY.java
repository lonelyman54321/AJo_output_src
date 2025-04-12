/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.functions.Function1;

public final class YY
implements DoubleUnaryOperator {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ YY(gp2$b_0 gp2$b_0) {
        this.a = gp2$b_0;
    }

    public final double applyAsDouble(double d2) {
        Function1 function1 = this.a;
        Double d5 = d2;
        return ((Number)function1.invoke(d5)).doubleValue();
    }
}


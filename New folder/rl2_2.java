/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from rL2
 */
public abstract class rl2_2
extends ql2_2
implements FunctionBase {
    public final int a;

    public rl2_2(int n3, f80_0 f80_02) {
        super(f80_02);
        this.a = n3;
    }

    public final int getArity() {
        return this.a;
    }

    public final String toString() {
        Object object = this.getCompletion();
        if (object == null) {
            object = Reflection.renderLambdaToString(this);
            String string2 = "renderLambdaToString(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
        } else {
            object = super.toString();
        }
        return object;
    }
}


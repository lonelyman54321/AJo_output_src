/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from Qg3
 */
public abstract class qg3_2
extends h80_0
implements FunctionBase {
    private final int arity;

    public qg3_2(int n3) {
        this(n3, null);
    }

    public qg3_2(int n3, f80_0 f80_02) {
        super(f80_02);
        this.arity = n3;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
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


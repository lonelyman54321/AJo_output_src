/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public abstract class Lambda
implements FunctionBase,
Serializable {
    private final int arity;

    public Lambda(int n3) {
        this.arity = n3;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String string2 = Reflection.renderLambdaToString(this);
        Intrinsics.checkNotNullExpressionValue(string2, "renderLambdaToString(...)");
        return string2;
    }
}


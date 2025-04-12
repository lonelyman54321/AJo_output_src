/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class Pc$a
extends FunctionReferenceImpl
implements Function2 {
    public static final Pc$a a;

    static {
        Pc$a pc$a;
        a = pc$a = new FunctionReferenceImpl(2, mk1_2.class, "min", "min(II)I", 1);
    }

    public final Object invoke(Object object, Object object2) {
        int n3 = ((Number)object).intValue();
        int n4 = ((Number)object2).intValue();
        return Math.min(n3, n4);
    }
}


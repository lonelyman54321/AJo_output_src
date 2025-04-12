/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class L30$a
extends Lambda
implements Function2 {
    public final /* synthetic */ MB2[] c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;

    public L30$a(MB2[] mB2Array, Function2 function2, int n3) {
        this.c = mB2Array;
        this.d = function2;
        this.e = n3;
        super(2);
    }

    public final Object invoke(Object object, Object mB2Array) {
        object = (b30_0)object;
        ((Number)mB2Array).intValue();
        mB2Array = this.c;
        int n3 = mB2Array.length;
        mB2Array = Arrays.copyOf(mB2Array, n3);
        n3 = Me3.b(this.e | 1);
        Function2 function2 = this.d;
        L30.b(mB2Array, function2, (b30_0)object, n3);
        return Unit.a;
    }
}


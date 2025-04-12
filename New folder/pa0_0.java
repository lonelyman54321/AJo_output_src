/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from pA0
 */
public final class pa0_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Function1 c;

    public pa0_0(Function1 function1) {
        this.c = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((bj1)object).a;
        object = (int)(l2 >> 32);
        int n3 = ((Number)this.c.invoke(object)).intValue();
        int n4 = (int)(l2 & 0xFFFFFFFFL);
        l2 = dj1.a(n3, n4);
        object = new bj1(l2);
        return object;
    }
}


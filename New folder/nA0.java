/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class nA0
extends Lambda
implements Function1 {
    public final /* synthetic */ Function1 c;

    public nA0(Function1 function1) {
        this.c = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((bj1)object).a;
        int n3 = (int)(l2 >> 32);
        Integer n4 = (int)(l2 & 0xFFFFFFFFL);
        int n7 = ((Number)this.c.invoke(n4)).intValue();
        l2 = dj1.a(n3, n7);
        object = new bj1(l2);
        return object;
    }
}


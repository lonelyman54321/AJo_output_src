/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Gq1
 */
public final class gq1_1
extends Lambda
implements Function2 {
    public final /* synthetic */ Function1 c;

    public gq1_1(Function1 function1) {
        this.c = function1;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (rq1_0)object;
        ((Number)object2).intValue();
        long l2 = ((J11)this.c.invoke((Object)object)).a;
        J11 j11 = new J11(l2);
        return j11;
    }
}


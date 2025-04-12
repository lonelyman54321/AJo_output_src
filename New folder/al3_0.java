/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from al3
 */
public final class al3_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Function0 c;

    public al3_0(Function0 function0) {
        this.c = function0;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Vo0)object;
        long l2 = ((e72)this.c.invoke()).a;
        object = new e72(l2);
        return object;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class De2$D
extends Lambda
implements Function1 {
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ List d;

    public De2$D(List list, Function1 function1) {
        this.c = function1;
        this.d = list;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3 = ((Number)object).intValue();
        object = this.d.get(n3);
        return this.c.invoke(object);
    }
}


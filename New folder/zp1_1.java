/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ZP1
 */
public final class zp1_1
extends Lambda
implements Function1 {
    public final /* synthetic */ Function1 c;

    public zp1_1(Function1 function1) {
        this.c = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        object = ((Number)object).longValue() / 1000000L;
        return this.c.invoke(object);
    }
}


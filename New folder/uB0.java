/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class uB0
extends Lambda
implements Function1 {
    public final /* synthetic */ long c;

    public uB0(long l2) {
        this.c = l2;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2;
        long l3 = ((Number)(object = (Number)object)).longValue();
        long l4 = l3 - (l2 = this.c);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) {
            object2 = 1;
        } else {
            object2 = 0;
            object = null;
        }
        return (boolean)object2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class FA3$a
extends Lambda
implements Function0 {
    public final /* synthetic */ FA3 c;

    public FA3$a(FA3 fA3) {
        this.c = fA3;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        int n3 = ((FA3)object).g;
        object = ((FA3)object).d;
        int n4 = ((e83_0)object).o();
        if (n3 == n4) {
            n3 = ((e83_0)object).o() + 1;
            ((e83_0)object).e(n3);
        }
        return Unit.a;
    }
}


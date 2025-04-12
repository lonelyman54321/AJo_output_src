/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Xp1$h
extends Lambda
implements Function0 {
    public final /* synthetic */ xp1_0 c;

    public Xp1$h(xp1_0 xp1_02) {
        this.c = xp1_02;
        super(0);
    }

    public final Object invoke() {
        boolean bl2;
        Object object = this.c.z;
        bq1$b bq1$b = ((bq1)object).r;
        bq1$b.w = bl2 = true;
        object = ((bq1)object).s;
        if (object != null) {
            ((bq1$a_0)object).t = bl2;
        }
        return Unit.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class wf3$c
extends Lambda
implements Function2 {
    public final /* synthetic */ wf3 c;

    public wf3$c(wf3 wf32) {
        this.c = wf32;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (xp1_0)object;
        object2 = (Function2)object2;
        jq1_2 jq1_22 = this.c.a();
        String string2 = jq1_22.p;
        lq1_2 lq1_22 = new lq1_2(jq1_22, (Function2)object2, string2);
        ((xp1_0)object).i(lq1_22);
        return Unit.a;
    }
}


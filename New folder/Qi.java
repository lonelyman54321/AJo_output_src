/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Qi
extends Lambda
implements Function0 {
    public final /* synthetic */ Ri c;

    public Qi(Ri ri) {
        this.c = ri;
        super(0);
    }

    public final Object invoke() {
        Ri ri = this.c;
        Boolean bl2 = (Boolean)ri.j.getValue() ^ true;
        ri.j.setValue(bl2);
        return Unit.a;
    }
}


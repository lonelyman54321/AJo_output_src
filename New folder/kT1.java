/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class kT1
extends Lambda
implements Function0 {
    public final /* synthetic */ gt1_0 c;

    public kT1(gt1_0 gt1_02) {
        this.c = gt1_02;
        super(0);
    }

    public final Object invoke() {
        Object object = (Pair)this.c.j.getValue();
        object = object != null ? (String)((Pair)object).b : null;
        return object;
    }
}


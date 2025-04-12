/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Je$a
extends Lambda
implements Function0 {
    public final /* synthetic */ Re c;

    public Je$a(Re re) {
        this.c = re;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        Xs0 xs0 = ((Re)object).d();
        object = ((Re)object).h.getValue();
        Pair pair = new Pair(xs0, object);
        return pair;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ar3
 */
public final class ar3_0
extends Lambda
implements Function1 {
    public final /* synthetic */ kn1_0 c;
    public final /* synthetic */ NX0 d;

    public ar3_0(kn1_0 kn1_02, NX0 nX0) {
        this.c = kn1_02;
        this.d = nX0;
        super(1);
    }

    public final Object invoke(Object object) {
        object = this.d.apply(object);
        this.c.k(object);
        return Unit.a;
    }
}


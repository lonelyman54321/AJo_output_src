/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class S80
extends Lambda
implements Function1 {
    public final /* synthetic */ Vt1 c;

    public S80(Vt1 vt1) {
        this.c = vt1;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (zp1)object;
        Ul3 ul3 = this.c.d();
        if (ul3 != null) {
            ul3.c = object;
        }
        return Unit.a;
    }
}


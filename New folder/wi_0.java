/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from WI
 */
public final class wi_0
extends Lambda
implements Function0 {
    public final /* synthetic */ vi_0 c;
    public final /* synthetic */ xi_0 d;

    public wi_0(vi_0 vi_02, xi_0 xi_02) {
        this.c = vi_02;
        this.d = xi_02;
        super(0);
    }

    public final Object invoke() {
        Function1 function1 = this.c.q;
        xi_0 xi_02 = this.d;
        function1.invoke(xi_02);
        return Unit.a;
    }
}


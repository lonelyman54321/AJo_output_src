/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Hr1$a
extends Lambda
implements Function1 {
    public final /* synthetic */ W01 c;
    public final /* synthetic */ Gr1 d;

    public Hr1$a(W01 w01, Gr1 gr1) {
        this.c = w01;
        this.d = gr1;
        super(1);
    }

    public final Object invoke(Object object) {
        float f5 = ((Number)((Lj)object).d()).floatValue();
        this.c.f(f5);
        this.d.c.invoke();
        return Unit.a;
    }
}


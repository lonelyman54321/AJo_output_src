/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class X32
extends Lambda
implements Function0 {
    public final /* synthetic */ w32_0 c;
    public final /* synthetic */ iL d;
    public final /* synthetic */ W01 e;

    public X32(w32_0 w32_02, iL iL2, W01 w01) {
        this.c = w32_02;
        this.d = iL2;
        this.e = w01;
        super(0);
    }

    public final Object invoke() {
        Object object = w32_0.I;
        object = this.d;
        W01 w01 = this.e;
        this.c.b1((iL)object, w01);
        return Unit.a;
    }
}


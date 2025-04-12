/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import kotlin.Unit;

public final class No1$d
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ k70_0 b;
    public final /* synthetic */ Charset c;
    public final /* synthetic */ at3_0 d;
    public final /* synthetic */ Object e;

    public No1$d(ns0_1 ns0_12, k70_0 k70_02, Charset charset, at3_0 at3_02, Object object) {
        this.a = ns0_12;
        this.b = k70_02;
        this.c = charset;
        this.d = at3_02;
        this.e = object;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        k70_0 k70_02 = this.b;
        Charset charset = this.c;
        at3_0 at3_02 = this.d;
        Object object3 = this.e;
        No1$d$a no1$d$a = new No1$d$a((fs0_2)object, k70_02, charset, at3_02, object3);
        if ((object = this.a.collect(no1$d$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}


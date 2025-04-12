/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import kotlin.Unit;

/*
 * Renamed from No1$a
 */
public final class no1$a_0
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ Charset b;
    public final /* synthetic */ at3_0 c;
    public final /* synthetic */ uf_1 d;

    public no1$a_0(ns0_1 ns0_12, Charset charset, at3_0 at3_02, uf_1 uf_12) {
        this.a = ns0_12;
        this.b = charset;
        this.c = at3_02;
        this.d = uf_12;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        Charset charset = this.b;
        at3_0 at3_02 = this.c;
        uf_1 uf_12 = this.d;
        No1$a$a no1$a$a = new No1$a$a((fs0_2)object, charset, at3_02, uf_12);
        if ((object = this.a.collect(no1$a$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}


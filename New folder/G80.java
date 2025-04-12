/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

public final class G80
extends LP1$c
implements dy2_0 {
    public boolean n;
    public final boolean o;
    public Function1 p;

    public G80(boolean bl2, boolean bl3, Function1 function1) {
        this.n = bl2;
        this.o = bl3;
        this.p = function1;
    }

    public final boolean N() {
        return this.o;
    }

    public final boolean c1() {
        return this.n;
    }

    public final void i0(UY2 uY2) {
        this.p.invoke(uY2);
    }
}


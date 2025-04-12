/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

public final class Zl3
implements Cr0 {
    public final /* synthetic */ Yl3 a;
    public final /* synthetic */ Function1 b;

    public Zl3(Yl3 yl3, Function1 function1) {
        this.a = yl3;
        this.b = function1;
    }

    public final void dispose() {
        p83_0 p83_02 = this.a.d;
        Function1 function1 = this.b;
        p83_02.remove(function1);
    }
}


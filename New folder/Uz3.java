/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

public abstract class Uz3 {
    public Function1 a;

    public abstract void a(Kt0 var1);

    public Function1 b() {
        return this.a;
    }

    public final void c() {
        Function1 function1 = this.b();
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    public void d(N11$a n11$a) {
        this.a = n11$a;
    }
}


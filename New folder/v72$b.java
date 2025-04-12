/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class v72$b
extends il2_2 {
    public final il2_2 b;
    public final ie2_2 c;
    public IOException d;

    public v72$b(il2_2 closeable) {
        this.b = closeable;
        closeable = closeable.h();
        v72$b$a v72$b$a = new v72$b$a(this, (se_1)closeable);
        closeable = o72_0.b(v72$b$a);
        this.c = closeable;
    }

    public final long c() {
        return this.b.c();
    }

    public final void close() {
        this.b.close();
    }

    public final jn1_0 d() {
        return this.b.d();
    }

    public final se_1 h() {
        return this.c;
    }
}


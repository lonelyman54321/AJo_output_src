/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

public final class NL0
implements wk2_0 {
    public final Object a;

    public NL0(File file) {
        dV0.c(file, "Argument must not be null");
        this.a = file;
    }

    public final void a() {
    }

    public final Class c() {
        return this.a.getClass();
    }

    public final Object get() {
        return this.a;
    }

    public final int getSize() {
        return 1;
    }
}


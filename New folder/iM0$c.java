/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public abstract class iM0$c {
    public final File a;

    public iM0$c(File file) {
        Intrinsics.checkNotNullParameter(file, "root");
        this.a = file;
    }

    public abstract File a();
}


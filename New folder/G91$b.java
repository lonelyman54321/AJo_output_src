/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public abstract class G91$b {
    public static final G91$b$a a;

    static {
        G91$b$a g91$b$a;
        a = g91$b$a = new G91$b();
    }

    public void a(g91_0 g91_02, R03 r03) {
        Intrinsics.checkNotNullParameter(g91_02, "connection");
        Intrinsics.checkNotNullParameter(r03, "settings");
    }

    public abstract void b(S91 var1);
}


/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IP1
 */
public final class ip1_1
implements ol0$a_0 {
    public final /* synthetic */ HP1$b a;
    public final /* synthetic */ xp1_2 b;

    public /* synthetic */ ip1_1(HP1$b hP1$b, xp1_2 xp1_22) {
        this.a = hP1$b;
        this.b = xp1_22;
    }

    public final void a(File object) {
        xp1_2 xp1_22;
        HP1$b hP1$b = this.a;
        Intrinsics.checkNotNullParameter(hP1$b, "$slave");
        Intrinsics.checkNotNullParameter(object, "file");
        hP1$b.g = xp1_22 = this.b;
        hP1$b.f = object;
        object = hP1$b.h;
        if (object != null) {
            object.run();
        }
    }
}


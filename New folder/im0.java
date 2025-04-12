/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.source.q$b;
import kotlin.jvm.internal.Intrinsics;

public final class im0
implements n60_0 {
    public static void a(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }

    public static void b(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }

    public static void c(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }

    public void accept(Object object) {
        ((q$b)object).b.release();
    }
}


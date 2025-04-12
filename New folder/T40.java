/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

public final class T40 {
    public static final ExecutorService a(boolean bl2) {
        R40 r40 = new R40(bl2);
        int n3 = Math.min(Runtime.getRuntime().availableProcessors() + -1, 4);
        ExecutorService executorService = Executors.newFixedThreadPool(Math.max(2, n3), r40);
        Intrinsics.checkNotNullExpressionValue(executorService, "newFixedThreadPool(\n    \u2026)),\n        factory\n    )");
        return executorService;
    }
}


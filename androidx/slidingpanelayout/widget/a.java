/*
 * Decompiled with CFR 0.152.
 */
package androidx.slidingpanelayout.widget;

import androidx.slidingpanelayout.widget.a$a;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

public final class a {
    public final fg3_0 a;
    public final Executor b;
    public mb3_2 c;
    public a$a d;

    public a(ig3_1 ig3_12, Executor executor) {
        Intrinsics.checkNotNullParameter(ig3_12, "windowInfoTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.a = ig3_12;
        this.b = executor;
    }
}


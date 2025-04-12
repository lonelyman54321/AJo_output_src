/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

import java.util.concurrent.FutureTask;
import kotlin.Unit;

public final class WaitTask
extends FutureTask {
    public WaitTask() {
        le3_0 le3_02;
        super(le3_02);
    }

    private static final Unit _init_$lambda$0() {
        return Unit.a;
    }

    public static /* synthetic */ Unit a() {
        return WaitTask._init_$lambda$0();
    }

    public final void complete() {
        Unit unit = Unit.a;
        this.set(unit);
    }

    public void run() {
    }
}


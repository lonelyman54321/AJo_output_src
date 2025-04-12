/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.JuspayServices;

/*
 * Renamed from ow0
 */
public final class ow0_2
implements Runnable {
    public final /* synthetic */ JuspayServices a;

    public /* synthetic */ ow0_2(JuspayServices juspayServices) {
        this.a = juspayServices;
    }

    public final void run() {
        this.a.terminate();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Qx
 */
public final class qx_0
implements Callable {
    public final /* synthetic */ rx_1 a;
    public final /* synthetic */ ox_0 b;

    public /* synthetic */ qx_0(rx_1 rx_12, ox_0 ox_02) {
        this.a = rx_12;
        this.b = ox_02;
    }

    public final Object call() {
        rx_1 rx_12 = this.a;
        Intrinsics.checkNotNullParameter(rx_12, "this$0");
        ox_0 ox_02 = this.b;
        Intrinsics.checkNotNullParameter(ox_02, "$bitmapDownloadRequest");
        return rx_12.a.a(ox_02);
    }
}


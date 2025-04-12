/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nf2
 */
public final class nf2_0
implements Runnable {
    public final /* synthetic */ ou0_0 a;

    public /* synthetic */ nf2_0(ou0_0 ou0_02) {
        this.a = ou0_02;
    }

    public final void run() {
        ou0_0 ou0_02 = this.a;
        if (ou0_02 != null) {
            try {
                ou0_02.b();
            }
            catch (Exception exception) {
                String string2 = "<this>";
                Intrinsics.checkNotNullParameter(exception, string2);
            }
        }
    }
}


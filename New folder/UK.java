/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

public final class UK
implements Runnable {
    public final /* synthetic */ ni3_1 a;
    public final /* synthetic */ UUID b;

    public /* synthetic */ UK(ni3_1 ni3_12, UUID uUID) {
        this.a = ni3_12;
        this.b = uUID;
    }

    public final void run() {
        String string2 = this.b.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "id.toString()");
        YK.a(this.a, string2);
    }
}


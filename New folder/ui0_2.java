/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UI0
 */
public final class ui0_2
extends k1_0 {
    public final UI0$a c;

    public ui0_2() {
        UI0$a uI0$a;
        this.c = uI0$a;
    }

    public final Random e() {
        Object t3 = this.c.get();
        Intrinsics.checkNotNullExpressionValue(t3, "get(...)");
        return (Random)t3;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UH0
 */
public final class uh0_2
implements Runnable {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ float b;

    public /* synthetic */ uh0_2(sd2_0 sd2_02, float f5) {
        this.a = sd2_02;
        this.b = f5;
    }

    public final void run() {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$it");
        Float f5 = Float.valueOf(this.b);
        function1.invoke(f5);
    }
}


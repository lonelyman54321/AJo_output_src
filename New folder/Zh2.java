/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class Zh2
implements Runnable {
    public final /* synthetic */ ai2_2 a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ Zh2(ai2_2 ai2_22, ArrayList arrayList) {
        this.a = ai2_22;
        this.b = arrayList;
    }

    public final void run() {
        ai2_2 ai2_22 = this.a;
        Intrinsics.checkNotNullParameter(ai2_22, "this$0");
        ArrayList arrayList = this.b;
        ai2_22.x(arrayList);
    }
}


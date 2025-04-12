/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wi2
 */
public final class wi2_1
implements Runnable {
    public final /* synthetic */ xi2_1 a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ wi2_1(xi2_1 xi2_12, ArrayList arrayList) {
        this.a = xi2_12;
        this.b = arrayList;
    }

    public final void run() {
        xi2_1 xi2_12 = this.a;
        Intrinsics.checkNotNullParameter(xi2_12, "this$0");
        ArrayList arrayList = this.b;
        xi2_12.w(arrayList);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YM2
 */
public final class ym2_1
implements Runnable {
    public final /* synthetic */ zm2_2 a;
    public final /* synthetic */ int b;

    public /* synthetic */ ym2_1(zm2_2 zm2_22, int n3) {
        this.a = zm2_22;
        this.b = n3;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        in2_1 in2_12 = ((zm2_2)object).j;
        if (in2_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imagesAdapter");
            in2_12 = null;
        }
        object = ((zm2_2)object).p;
        in2_12.getClass();
        Intrinsics.checkNotNullParameter(object, "images");
        ArrayList arrayList = in2_12.b;
        arrayList.clear();
        arrayList.addAll(object);
        int n3 = this.b;
        in2_12.notifyItemChanged(n3);
    }
}


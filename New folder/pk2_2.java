/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pk2
 */
public final class pk2_2
implements Runnable {
    public final /* synthetic */ qk2_2 a;

    public /* synthetic */ pk2_2(qk2_2 qk2_22) {
        this.a = qk2_22;
    }

    public final void run() {
        Object object = this.a;
        Object object2 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = ((qk2_2)object).a;
        int n4 = ((qk2_2)object).b;
        if (n3 == n4) {
            object = (vd3$d)object;
            object2 = vd3_2.Companion;
            object = ((vd3$d)object).d.a;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
                object = null;
            }
            object = ((tk2_2)object).m;
            object2 = n4;
            if ((object = (ld3_1)((HashMap)object).get(object2)) != null) {
                ((ld3_1)object).Va();
            }
        }
    }
}


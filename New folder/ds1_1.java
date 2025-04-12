/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ds1
 */
public final class ds1_1
extends Lambda
implements Function1 {
    public final /* synthetic */ cs1_1 c;

    public ds1_1(cs1_1 cs1_12) {
        this.c = cs1_12;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3;
        block2: {
            wr1_0 wr1_02 = (wr1_0)this.c.n.invoke();
            int n4 = wr1_02.getItemCount();
            for (n3 = 0; n3 < n4; ++n3) {
                Object object2 = wr1_02.c(n3);
                boolean bl2 = Intrinsics.areEqual(object2, object);
                if (!bl2) {
                    continue;
                }
                break block2;
            }
            n3 = -1;
        }
        return n3;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class sk2$b
implements z61 {
    public final yk2_1 a;

    public sk2$b(yk2_1 yk2_12) {
        Intrinsics.checkNotNullParameter(yk2_12, "pageFetcherSnapshot");
        this.a = yk2_12;
    }

    public final void a(re3_0 re3_02) {
        Object object = "viewportHint";
        Intrinsics.checkNotNullParameter(re3_02, (String)object);
        Object object2 = this.a;
        object2.getClass();
        Intrinsics.checkNotNullParameter(re3_02, (String)object);
        object2 = ((yk2_1)object2).h;
        object2.getClass();
        Intrinsics.checkNotNullParameter(re3_02, (String)object);
        boolean bl2 = re3_02 instanceof rE3$a;
        if (bl2) {
            object = re3_02;
            object = (rE3$a)re3_02;
        } else {
            bl2 = false;
            object = null;
        }
        x61 x612 = new x61(re3_02);
        ((v61)object2).a.a((rE3$a)object, x612);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Pl2
extends Lambda
implements Function1 {
    public final /* synthetic */ pv1_1 c;

    public Pl2(yl2_1 yl2_12) {
        this.c = yl2_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (wZ)object;
        Intrinsics.checkNotNullParameter(object, "loadStates");
        object = ((wZ)object).c;
        pv1_1 pv1_12 = this.c;
        pv1_12.getClass();
        Intrinsics.checkNotNullParameter(object, "loadState");
        Ov1 ov1 = pv1_12.a;
        boolean bl2 = Intrinsics.areEqual(ov1, object);
        if (!bl2) {
            ov1 = pv1_12.a;
            bl2 = pv1_1.g(ov1);
            boolean bl3 = pv1_1.g((Ov1)object);
            if (bl2 && !bl3) {
                pv1_12.notifyItemRemoved(0);
            } else if (bl3 && !bl2) {
                pv1_12.notifyItemInserted(0);
            } else if (bl2 && bl3) {
                pv1_12.notifyItemChanged(0);
            }
            pv1_12.a = object;
        }
        return Unit.a;
    }
}


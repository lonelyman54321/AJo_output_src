/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.seen_components.SeenApiModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

public final class DR0$j$a
implements fs0_2 {
    public final /* synthetic */ dr0_0 a;

    public DR0$j$a(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    public final Object emit(Object object, f80_0 f80_02) {
        boolean bl2 = (object = (kk2_1)object) instanceof KK2$c;
        if (bl2) {
            object = (SeenApiModel)((KK2$c)object).a;
            if (object != null) {
                object = dr0_0.Companion;
                object = this.a;
                object.getClass();
            }
        } else {
            boolean bl3;
            bl2 = object instanceof KK2$a;
            if (!bl2 && !(bl3 = object instanceof KK2$b)) {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
        }
        return Unit.a;
    }
}


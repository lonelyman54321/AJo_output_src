/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Js0$a
 */
public final class js0$a_1
extends Lambda
implements Function1 {
    public final /* synthetic */ cs0_0 c;

    public js0$a_1(cs0_0 cs0_02) {
        this.c = cs0_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (js0_1)object;
        Object object2 = ((LP1$c)object).a;
        boolean bl2 = ((LP1$c)object2).m;
        if (!bl2) {
            object = Xr3.SkipSubtreeAndContinueTraversal;
        } else {
            object2 = ((js0_1)object).q;
            if (object2 != null) {
                cs0_0 cs0_02 = this.c;
                object2.I(cs0_02);
            }
            bl2 = false;
            object2 = null;
            ((js0_1)object).q = null;
            ((js0_1)object).p = null;
            object = Xr3.ContinueTraversal;
        }
        return object;
    }
}


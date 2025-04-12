/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class xA0$i
extends Lambda
implements Function1 {
    public final /* synthetic */ xA0 c;

    public xA0$i(xA0 xA02) {
        this.c = xA02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (gr3$b)object;
        Xz0 xz0 = Xz0.PreEnter;
        Xz0 xz02 = Xz0.Visible;
        boolean bl2 = object.c((Object)xz0, (Object)xz02);
        un0_0 un0_02 = null;
        xA0 xA02 = this.c;
        if (bl2) {
            object = xA02.r.a().c;
            if (object != null) {
                un0_02 = ((BR)object).c;
            }
        } else {
            xz0 = Xz0.PostExit;
            boolean bl3 = object.c((Object)xz02, (Object)xz0);
            if (bl3) {
                object = xA02.s.a().c;
                if (object != null) {
                    un0_02 = ((BR)object).c;
                }
            } else {
                un0_02 = zz0_0.d;
            }
        }
        if (un0_02 == null) {
            un0_02 = zz0_0.d;
        }
        return un0_02;
    }
}


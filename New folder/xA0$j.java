/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class xA0$j
extends Lambda
implements Function1 {
    public final /* synthetic */ xA0 c;

    public xA0$j(xA0 xA02) {
        this.c = xA02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (gr3$b)object;
        Xz0 xz0 = Xz0.PreEnter;
        Xz0 xz02 = Xz0.Visible;
        boolean bl2 = object.c((Object)xz0, (Object)xz02);
        xA0 xA02 = this.c;
        if (bl2) {
            object = xA02.r.a().b;
            if (object == null || (object = ((d73_0)object).b) == null) {
                object = zz0_0.c;
            }
        } else {
            xz0 = Xz0.PostExit;
            boolean bl3 = object.c((Object)xz02, (Object)xz0);
            if (bl3) {
                object = xA02.s.a().b;
                if (object == null || (object = ((d73_0)object).b) == null) {
                    object = zz0_0.c;
                }
            } else {
                object = zz0_0.c;
            }
        }
        return object;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class dA0
extends Lambda
implements Function1 {
    public final /* synthetic */ yA0 c;
    public final /* synthetic */ JE0 d;

    public dA0(yA0 yA02, JE0 jE0) {
        this.c = yA02;
        this.d = jE0;
        super(1);
    }

    public final Object invoke(Object object) {
        Xz0 xz0 = Xz0.PreEnter;
        Xz0 xz02 = Xz0.Visible;
        boolean bl2 = (object = (gr3$b)object).c((Object)xz0, (Object)xz02);
        if (bl2) {
            this.c.a().getClass();
            object = zz0_0.b;
        } else {
            xz0 = Xz0.PostExit;
            boolean bl3 = object.c((Object)xz02, (Object)xz0);
            if (bl3) {
                this.d.a().getClass();
                object = zz0_0.b;
            } else {
                object = zz0_0.b;
            }
        }
        return object;
    }
}


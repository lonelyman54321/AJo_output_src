/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Y53
extends Lambda
implements Function1 {
    public final /* synthetic */ X53 c;

    public Y53(X53 x53) {
        this.c = x53;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2;
        Object object3;
        if ((object = (Throwable)object) != null) {
            object3 = this.c.h;
            object2 = new ln0_0((Throwable)object);
            object3.getClass();
            object = null;
            ((kb3_2)object3).k(null, object2);
        }
        object = X53.l;
        object3 = this.c;
        synchronized (object) {
            object2 = X53.k;
            object3 = ((X53)object3).c();
            object3 = ((File)object3).getAbsolutePath();
            object2.remove(object3);
            return Unit.a;
        }
    }
}


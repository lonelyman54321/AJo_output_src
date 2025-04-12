/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f01$b
extends Lambda
implements Function1 {
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function1 d;

    public f01$b(Function1 function1, Function1 function12) {
        this.c = function1;
        this.d = function12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (y83)object;
        Object object2 = A83.c;
        synchronized (object2) {
            int n3 = A83.e;
            int n4 = n3 + 1;
            A83.e = n4;
            // MONITOREXIT @DISABLED, blocks:[1, 2] lbl9 : MonitorExitStatement: MONITOREXIT : var2_3
            object2 = this.c;
            Function1 function1 = this.d;
            RR1 rR1 = new RR1(n3, (y83)object, (Function1)object2, function1);
            return rR1;
        }
    }
}


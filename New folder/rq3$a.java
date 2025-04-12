/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class rq3$a
extends Lambda
implements Function0 {
    public final /* synthetic */ rq3 c;

    public rq3$a(rq3 rq32) {
        this.c = rq32;
        super(0);
    }

    public final Object invoke() {
        Object object = (gg1_0)this.c.a.getValue();
        object.getClass();
        object = md3_0.c((jD3)object);
        Serializable serializable = new qg3_2(2, null);
        int n3 = 3;
        Ae3.d((i90_0)object, null, null, (Function2)((Object)serializable), n3);
        object = l52_0.d;
        synchronized (object) {
            object.clear();
            serializable = l52_0.e;
            ((HashSet)serializable).clear();
            return Unit.a;
        }
    }
}


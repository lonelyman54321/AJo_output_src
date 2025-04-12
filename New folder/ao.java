/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class ao
extends Lambda
implements Function2 {
    public final /* synthetic */ List c;

    public ao(List list) {
        this.c = list;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (Integer)object2;
        List list = this.c;
        object = new zn_0(0, object2, list);
        lz3_0.L((Runnable)object);
        return Unit.a;
    }
}


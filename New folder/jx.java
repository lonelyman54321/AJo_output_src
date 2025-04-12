/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class jx
extends Lambda
implements Function1 {
    public final /* synthetic */ tr1_0 c;

    public jx(tr1_0 tr1_02) {
        this.c = tr1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (List)object;
        tr1_0 tr1_02 = this.c;
        if (tr1_02 != null) {
            tr1_02.setValue(object);
        }
        return Unit.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class uF2$a
extends Lambda
implements Function1 {
    public final /* synthetic */ nl1_0 c;
    public final /* synthetic */ List d;

    public uF2$a(nl1_0 nl1_02, List list) {
        this.c = nl1_02;
        this.d = list;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        nl1_0 nl1_02 = this.c;
        List list = this.d;
        nl1_02.h((Ns2$a)object, list);
        return Unit.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class cx$c
extends Lambda
implements Function1 {
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ tr1_0 d;
    public final /* synthetic */ tr1_0 e;

    public cx$c(Function1 function1, tr1_0 tr1_02, tr1_0 tr1_03) {
        this.c = function1;
        this.d = tr1_02;
        this.e = tr1_03;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (ql3_0)object;
        this.d.setValue(object);
        Object object2 = this.e;
        String string2 = (String)object2.getValue();
        String string3 = ((ql3_0)object).a.a;
        boolean bl2 = Intrinsics.areEqual(string2, string3) ^ true;
        object = ((ql3_0)object).a;
        string3 = ((Sl)object).a;
        object2.setValue(string3);
        if (bl2) {
            object2 = this.c;
            object = ((Sl)object).a;
            object2.invoke(object);
        }
        return Unit.a;
    }
}


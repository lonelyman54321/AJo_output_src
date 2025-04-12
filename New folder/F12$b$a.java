/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class F12$b$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ F12 a;
    public final /* synthetic */ String b;

    public F12$b$a(F12 f12, String string2, f80_0 f80_02) {
        this.a = f12;
        this.b = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        F12 f12 = this.a;
        String string2 = this.b;
        object = new F12$b$a(f12, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (F12$b$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((F12$b$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3 = 2;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a.c;
        object.getClass();
        object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "Url");
        Object object3 = o72_0.a;
        if (object3 == null) {
            object3 = "plp screen";
        }
        object2 = ((qQ2)object).a.sendRTBRequest((String)object2, (String)object3);
        object3 = new ya_2(n3);
        za_2 za_22 = new za_2(object3, 3);
        object3 = new Object();
        u02 u022 = new u02(n3, (Function1)object3);
        q60_0 q60_02 = ((g53_0)object2).f(za_22, u022);
        ((qQ2)object).b.b(q60_02);
        return Unit.a;
    }
}


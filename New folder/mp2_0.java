/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from mP2
 */
public final class mp2_0
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ lP2 b;

    public mp2_0(lP2 lP22, f80_0 f80_02) {
        this.b = lP22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        lP2 lP22 = this.b;
        mp2_0 mp2_02 = new mp2_0(lP22, f80_02);
        mp2_02.a = object;
        return mp2_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (mp2_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((mp2_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (i90_0)this.a;
        lP2 lP22 = this.b;
        object2 = new mP2$a(lP22, null);
        int n3 = 3;
        Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
        object2 = new mP2$b(lP22, null);
        Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
        object2 = new mP2$c(lP22, null);
        return Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
    }
}


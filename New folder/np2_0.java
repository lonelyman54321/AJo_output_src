/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from nP2
 */
public final class np2_0
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ lP2 b;

    public np2_0(lP2 lP22, f80_0 f80_02) {
        this.b = lP22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        lP2 lP22 = this.b;
        np2_0 np2_02 = new np2_0(lP22, f80_02);
        np2_02.a = object;
        return np2_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (np2_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((np2_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (i90_0)this.a;
        lP2 lP22 = this.b;
        object2 = new nP2$a(lP22, null);
        return Ae3.d((i90_0)object, null, null, (Function2)object2, 3);
    }
}


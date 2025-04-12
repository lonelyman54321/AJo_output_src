/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from hD
 */
public final class hd_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ String b;

    public hd_2(dr0_0 dr0_02, String string2, f80_0 f80_02) {
        this.a = dr0_02;
        this.b = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.a;
        String string2 = this.b;
        object = new hd_2(dr0_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (hd_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hd_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        int n4 = 1;
        ((dr0_0)object).k0 = n4;
        ((dr0_0)object).p0 = n3 = ((dr0_0)object).p0 + n4;
        object2 = eF2$a.a;
        String string2 = this.b;
        ((dr0_0)object).S((ef2_1)object2, string2, n3);
        return Unit.a;
    }
}


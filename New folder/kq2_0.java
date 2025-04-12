/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from KQ2
 */
public final class kq2_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ lq2_0 a;
    public final /* synthetic */ dl2_2 b;

    public kq2_0(lq2_0 lq2_02, dl2_2 dl2_22, f80_0 f80_02) {
        this.a = lq2_02;
        this.b = dl2_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        lq2_0 lq2_02 = this.a;
        dl2_2 dl2_22 = this.b;
        object = new kq2_0(lq2_02, dl2_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (kq2_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((kq2_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        boolean bl3;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a.j;
        boolean bl4 = false;
        object2 = null;
        Object object3 = this.b;
        if (object3 != null && (bl3 = ((cl2_2)(object3 = ((dl2_2)object3).a)).d()) == (bl2 = true)) {
            bl4 = true;
        }
        object2 = bl4;
        ((R53)object).k(object2);
        return Unit.a;
    }
}


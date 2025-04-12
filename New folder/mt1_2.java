/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from mt1
 */
public final class mt1_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lt1 c;

    public mt1_2(lt1 lt12, f80_0 f80_02) {
        this.c = lt12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        lt1 lt12 = this.c;
        mt1_2 mt1_22 = new mt1_2(lt12, f80_02);
        mt1_22.b = object;
        return mt1_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Ml2)object;
        object2 = (f80_0)object2;
        object = (mt1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((mt1_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = (Ml2)this.b;
        Object object2 = this.c.c;
        this.a = n4;
        object2.getClass();
        ul2_0 ul2_02 = new ul2_0((Sl2)object2, (Ml2)object, null);
        object2 = ((Sl2)object2).f;
        object = ((l63_0)object2).a(0, ul2_02, this);
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}


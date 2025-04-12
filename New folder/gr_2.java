/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from GR
 */
public final class gr_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fs0_2 c;
    public final /* synthetic */ ir_2 d;

    public gr_2(fs0_2 fs0_22, ir_2 ir_22, f80_0 f80_02) {
        this.c = fs0_22;
        this.d = ir_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        fs0_2 fs0_22 = this.c;
        ir_2 ir_22 = this.d;
        gr_2 gr_22 = new gr_2(fs0_22, ir_22, f80_02);
        gr_22.b = object;
        return gr_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (gr_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((gr_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        boolean bl2 = this.a;
        boolean bl3 = true;
        if (bl2) {
            if (bl2 == bl3) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = (i90_0)this.b;
        object = this.d.j((i90_0)object);
        this.a = bl3;
        fs0_2 fs0_22 = this.c;
        object = qs0_2.a(fs0_22, (af2_2)object, bl3, this);
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}


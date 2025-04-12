/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

/*
 * Renamed from iX2
 */
public final class ix2_1
extends qg3_2
implements Function1 {
    public int a;
    public final /* synthetic */ gr3 b;
    public final /* synthetic */ gx2_0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ un0_0 e;

    public ix2_1(f80_0 f80_02, un0_0 un0_02, gx2_0 gx2_02, gr3 gr32, Object object) {
        this.b = gr32;
        this.c = gx2_02;
        this.d = object;
        this.e = un0_02;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        Object object = this.d;
        un0_0 un0_02 = this.e;
        gr3 gr32 = this.b;
        gx2_0 gx2_02 = this.c;
        ix2_1 ix2_12 = new ix2_1(f80_02, un0_02, gx2_02, gr32, object);
        return ix2_12;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (ix2_1)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((ix2_1)object).invokeSuspend(unit);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            un0_0 un0_02 = this.e;
            gx2_0 gx2_02 = this.c;
            Object object2 = this.d;
            gr3 gr32 = this.b;
            object = new iX2$a(null, un0_02, gx2_02, gr32, object2);
            this.a = n4;
            object = kotlinx.coroutines.d.c((Function2)object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        this.b.j();
        return Unit.a;
    }
}


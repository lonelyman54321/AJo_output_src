/*
 * Decompiled with CFR 0.152.
 */
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Kt1
 */
public final class kt1_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ lt1_0 b;
    public final /* synthetic */ Function2 c;

    public kt1_2(lt1_0 lt1_02, th_0 th_02, f80_0 f80_02) {
        this.b = lt1_02;
        this.c = th_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        th_0 th_02 = (th_0)this.c;
        lt1_0 lt1_02 = this.b;
        object = new kt1_2(lt1_02, th_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (kt1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((kt1_2)object).invokeSuspend(object2);
    }

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
            this.a = n4;
            object = (th_0)this.c;
            lt1_0 lt1_02 = this.b;
            object = wt2_0.a(lt1_02, (th_0)object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = new KotlinNothingValueException();
        throw object;
    }
}


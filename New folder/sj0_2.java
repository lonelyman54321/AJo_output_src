/*
 * Decompiled with CFR 0.152.
 */
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sJ0
 */
public final class sj0_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ pj0_2 b;

    public sj0_2(pj0_2 pj0_22, f80_0 f80_02) {
        this.b = pj0_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        pj0_2 pj0_22 = this.b;
        object = new sj0_2(pj0_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (sj0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((sj0_2)object).invokeSuspend(object2);
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
            object = this.b;
            Object object2 = ((pj0_2)object).h;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fleekViewModel");
                n3 = 0;
                object2 = null;
            }
            object2 = ((dr0_0)object2).L;
            sJ0$a sJ0$a = new sJ0$a((pj0_2)object);
            this.a = n4;
            object = ((kb3_2)object2).collect(sJ0$a, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = new KotlinNothingValueException();
        throw object;
    }
}


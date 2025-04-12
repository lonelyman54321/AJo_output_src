/*
 * Decompiled with CFR 0.152.
 */
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class FO2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ EO2 b;

    public FO2(EO2 eO2, f80_0 f80_02) {
        this.b = eO2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        EO2 eO2 = this.b;
        object = new FO2(eO2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (FO2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((FO2)object).invokeSuspend(object2);
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
            ee2_2 ee2_22 = ((yh0_0)((EO2)object).a.getValue()).c;
            FO2$a fO2$a = new FO2$a((EO2)object);
            this.a = n4;
            object = ee2_22.a.collect(fO2$a, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = new KotlinNothingValueException();
        throw object;
    }
}


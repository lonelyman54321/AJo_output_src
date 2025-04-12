/*
 * Decompiled with CFR 0.152.
 */
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from fg2
 */
public final class fg2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ bg2_1 b;

    public fg2_2(bg2_1 bg2_12, f80_0 f80_02) {
        this.b = bg2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        bg2_1 bg2_12 = this.b;
        object = new fg2_2(bg2_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (fg2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fg2_2)object).invokeSuspend(object2);
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
            ee2_2 ee2_22 = ((bg2_1)object).Pa().H;
            fg2$a_0 fg2$a_0 = new fg2$a_0((bg2_1)object);
            this.a = n4;
            object = ee2_22.a.collect(fg2$a_0, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = new KotlinNothingValueException();
        throw object;
    }
}


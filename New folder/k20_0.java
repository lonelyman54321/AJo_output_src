/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from K20
 */
public final class k20_0
extends qg3_2
implements Function2 {
    public boolean a;
    public int b;
    public /* synthetic */ float c;
    public final /* synthetic */ H20 d;

    public k20_0(H20 h20, f80_0 f80_02) {
        this.d = h20;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        float f5;
        H20 h20 = this.d;
        k20_0 k20_02 = new k20_0(h20, f80_02);
        k20_02.c = f5 = ((Number)object).floatValue();
        return k20_02;
    }

    public final Object invoke(Object object, Object object2) {
        float f5 = ((Number)object).floatValue();
        object2 = (f80_0)object2;
        object = Float.valueOf(f5);
        object = (k20_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((k20_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block9: {
            float f5;
            int n3;
            Object object2;
            block8: {
                int n4;
                int n7;
                block6: {
                    block7: {
                        object2 = j90_0.COROUTINE_SUSPENDED;
                        n7 = this.b;
                        n4 = 1;
                        if (n7 == 0) break block6;
                        if (n7 != n4) break block7;
                        n3 = this.a;
                        vl2_2.b(object);
                        break block8;
                    }
                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw object;
                }
                vl2_2.b(object);
                f5 = this.c;
                Object object3 = this.d;
                Object object4 = ((H20)object3).a.d;
                TY2 tY2 = yY2.e;
                object4 = (Function2)AY2.a((zy2_0)object4, tY2);
                if (object4 == null) break block9;
                object3 = ((H20)object3).a.d;
                tY2 = MY2.q;
                object3 = (CT2)((zy2_0)object3).c(tY2);
                n7 = (int)(((CT2)object3).c ? 1 : 0);
                if (n7 != 0) {
                    f5 = -f5;
                }
                tY2 = null;
                long l2 = h72.a(0.0f, f5);
                object = new e72(l2);
                this.a = n7;
                this.b = n4;
                if ((object = object4.invoke(object, this)) == object2) {
                    return object2;
                }
                n3 = n7;
            }
            object = (e72)object;
            long l3 = ((e72)object).a;
            f5 = e72.e(l3);
            if (n3 != 0) {
                f5 = -f5;
            }
            object2 = new Float(f5);
            return object2;
        }
        bh1_1.d("Required value was null.");
        throw null;
    }
}


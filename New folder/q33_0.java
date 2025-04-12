/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i;

/*
 * Renamed from Q33
 */
public final class q33_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ e43_0 b;
    public final /* synthetic */ List c;

    public q33_0(e43_0 e43_02, ArrayList arrayList, f80_0 f80_02) {
        this.b = e43_02;
        this.c = arrayList;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ArrayList arrayList = (ArrayList)this.c;
        e43_0 e43_02 = this.b;
        object = new q33_0(e43_02, arrayList, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (q33_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((q33_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            int n3;
            j90_0 j90_02;
            block6: {
                int n4;
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            n3 = 2;
                            n4 = 1;
                            if (n7 == 0) break block2;
                            if (n7 == n4) break block3;
                            if (n7 != n3) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                this.a = n4;
                object = this.b;
                object.getClass();
                aW aW2 = md3_0.c((jD3)object);
                ArrayList arrayList = (ArrayList)this.c;
                w33_0 w33_02 = new w33_0((e43_0)object, arrayList, null);
                int n8 = 3;
                object = Ae3.d(aW2, null, null, w33_02, n8);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = (i)object;
            this.a = n3;
            object = object.I0(this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}


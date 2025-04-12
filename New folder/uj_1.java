/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from uJ
 */
public final class uj_1
extends qg3_2
implements Function2 {
    public Iterator a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vJ d;

    public uj_1(vJ vJ2, f80_0 f80_02) {
        this.d = vJ2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        vJ vJ2 = this.d;
        uj_1 uj_12 = new uj_1(vJ2, f80_02);
        uj_12.c = object;
        return uj_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (uj_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((uj_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        Object object2;
        int n3;
        Object object3;
        j90_0 j90_02;
        block5: {
            block6: {
                int n4;
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.b;
                            object3 = this.d;
                            n3 = 2;
                            n4 = 1;
                            if (n7 == 0) break block2;
                            if (n7 == n4) break block3;
                            if (n7 != n3) break block4;
                            object2 = this.a;
                            object3 = (fs0_2)this.c;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = (fs0_2)this.c;
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object2 = object = this.c;
                object2 = (fs0_2)object;
                object = ((vJ)object3).a;
                this.c = object2;
                this.b = n4;
                object = ((HO0)object).a(this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = (List)object;
            ((vJ)object3).d.start();
            object = ((Iterable)object).iterator();
            object3 = object2;
            object2 = object;
        }
        while (bl2 = object2.hasNext()) {
            object = (IndexedValue)object2.next();
            this.c = object3;
            this.a = object2;
            this.b = n3;
            if ((object = object3.emit(object, this)) != j90_02) continue;
            return j90_02;
        }
        return Unit.a;
    }
}


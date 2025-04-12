/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;

public final class W91$c
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ i90_0 b;
    public /* synthetic */ db1_2 c;
    public final /* synthetic */ List d;

    public W91$c(List list, f80_0 f80_02) {
        this.d = list;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (dZ2$a)object;
        object2 = (db1_2)object2;
        object3 = (f80_0)object3;
        List list = this.d;
        W91$c w91$c = new W91$c(list, (f80_0)object3);
        w91$c.b = object;
        w91$c.c = object2;
        object = Unit.a;
        return w91$c.invokeSuspend(object);
    }

    public final Object invokeSuspend(Object object) {
        Object object2;
        block5: {
            Object object3;
            int n3;
            block6: {
                int n4;
                block2: {
                    block3: {
                        block4: {
                            object2 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            n3 = 2;
                            n4 = 1;
                            if (n7 == 0) break block2;
                            if (n7 == n4) break block3;
                            if (n7 != n3) break block4;
                            object2 = (ea1_2)this.b;
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
                object = (dZ2$a)this.b;
                object3 = this.c;
                this.b = null;
                this.a = n4;
                object = ((dZ2$a)object).a.a((db1_2)object3, this);
                if (object == object2) {
                    return object2;
                }
            }
            object = (ea1_2)object;
            object3 = ((ea1_2)object).d();
            this.b = object;
            this.a = n3;
            List list = this.d;
            object3 = W91.b(list, (jb1_2)object3, this);
            if (object3 == object2) {
                return object2;
            }
            object2 = object;
        }
        return object2;
    }
}


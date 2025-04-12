/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Wg3$a$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Wg3$a c;

    public Wg3$a$b(long l2, Wg3$a wg3$a, f80_0 f80_02) {
        this.b = l2;
        this.c = wg3$a;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        long l2 = this.b;
        Wg3$a wg3$a = this.c;
        object = new Wg3$a$b(l2, wg3$a, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Wg3$a$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Wg3$a$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        long l2;
        Object object2;
        block6: {
            int n3;
            long l3;
            block7: {
                int n4;
                block3: {
                    block4: {
                        block5: {
                            object2 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            l3 = 1L;
                            l2 = this.b;
                            n3 = 2;
                            n4 = 1;
                            if (n7 == 0) break block3;
                            if (n7 == n4) break block4;
                            if (n7 != n3) break block5;
                            vl2_2.b(object);
                            break block6;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    break block7;
                }
                vl2_2.b(object);
                long l4 = l2 - l3;
                this.a = n4;
                object = bo0_2.a(l4, this);
                if (object == object2) {
                    return object2;
                }
            }
            this.a = n3;
            object = bo0_2.a(l3, this);
            if (object == object2) {
                return object2;
            }
        }
        object = this.c.c;
        if (object != null) {
            object2 = tl2_2.b;
            object2 = new PointerEventTimeoutCancellationException(l2);
            object2 = vl2_2.a((Throwable)object2);
            object.resumeWith(object2);
        }
        return Unit.a;
    }
}


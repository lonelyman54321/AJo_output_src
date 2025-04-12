/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class xk2$b
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ es0_2 c;
    public final /* synthetic */ es0_2 d;
    public final /* synthetic */ AR1 e;

    public xk2$b(jb3_2 jb3_22, es0_2 es0_22, f80_0 f80_02, AR1 aR1) {
        this.c = jb3_22;
        this.d = es0_22;
        this.e = aR1;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        jb3_2 jb3_22 = (jb3_2)this.c;
        es0_2 es0_22 = this.d;
        AR1 aR1 = this.e;
        xk2$b xk2$b = new xk2$b(jb3_22, es0_22, f80_02, aR1);
        xk2$b.b = object;
        return xk2$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = (x53_0)object;
        object2 = (f80_0)object2;
        object = (xk2$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xk2$b)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        xk2$b xk2$b = this;
        int n3 = 0;
        Object object2 = null;
        int n4 = 2;
        int n7 = 1;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n8 = this.a;
        if (n8 != 0) {
            if (n8 == n7) {
                vl2_2.b(object);
                return Unit.a;
            }
            object2 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object2;
        }
        vl2_2.b(object);
        x53_0 x53_02 = (x53_0)this.b;
        Object object3 = new AtomicInteger(n4);
        Object object4 = this.e;
        Object object5 = new xk2$b$a(x53_02, null, (AR1)object4);
        Jv3 jv3 = new Jv3((xk2$b$a)object5);
        xl1_2 xl1_22 = mm0.a();
        object5 = this.c;
        object4 = this.d;
        es0_2[] es0_2Array = new es0_2[n4];
        es0_2Array[0] = object5;
        es0_2Array[n7] = object4;
        int n10 = 0;
        while (true) {
            if (n3 >= n4) {
                object3 = xl1_22;
                object2 = new xk2$b$c(xl1_22);
                xk2$b.a = n7;
                if ((object2 = x53_02.h((xk2$b$c)object2, xk2$b)) != j90_02) return Unit.a;
                return j90_02;
            }
            object4 = es0_2Array[n3];
            int n14 = n10 + 1;
            Object object6 = object3;
            object = object3;
            object3 = xl1_22;
            object5 = new xk2$b$b((es0_2)object4, (AtomicInteger)object6, x53_02, jv3, n10, null);
            Ae3.d(x53_02, xl1_22, null, (Function2)object5, n4);
            n7 = 1;
            n3 += n7;
            n10 = n14;
            object3 = object6;
        }
    }
}


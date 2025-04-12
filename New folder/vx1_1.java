/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from vX1
 */
public final class vx1_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Product b;
    public final /* synthetic */ wx1_1 c;

    public vx1_1(Product product, wx1_1 wx1_12, f80_0 f80_02) {
        this.b = product;
        this.c = wx1_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Product product = this.b;
        wx1_1 wx1_12 = this.c;
        object = new vx1_1(product, wx1_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (vx1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((vx1_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            Object object2 = this.b;
            Object object3 = this.c;
            object = new vX1$a((Product)object2, (wx1_1)object3, null);
            object2 = new br2_2((Function2)object);
            object = ir0_2.a;
            object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
            int n7 = 3;
            object2 = new qg3_2(n7, null);
            object3 = new at0_1((es0_2)object, (gx0_2)object2);
            object = vX1$c.a;
            this.a = n4;
            object = ((at0_1)object3).collect((fs0_2)object, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}


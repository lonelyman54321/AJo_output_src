/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.QuickViewProduct;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from OX1
 */
public final class ox1_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ wx1_1 b;
    public final /* synthetic */ QuickViewProduct c;
    public final /* synthetic */ int d;

    public ox1_1(wx1_1 wx1_12, QuickViewProduct quickViewProduct, int n3, f80_0 f80_02) {
        this.b = wx1_12;
        this.c = quickViewProduct;
        this.d = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        QuickViewProduct quickViewProduct = this.c;
        int n3 = this.d;
        wx1_1 wx1_12 = this.b;
        object = new ox1_1(wx1_12, quickViewProduct, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ox1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ox1_1)object).invokeSuspend(object2);
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
            wx1_1 wx1_12 = this.b;
            Object object2 = this.c;
            int n7 = this.d;
            object = new ox1$a_0(wx1_12, (QuickViewProduct)object2, n7, null);
            Object object3 = new br2_2((Function2)object);
            object = ir0_2.a;
            object = ms0_1.m((es0_2)object3, (CoroutineContext)object);
            object3 = new OX1$b(wx1_12, (QuickViewProduct)object2, null);
            object2 = new at0_1((es0_2)object, (gx0_2)object3);
            object = new OX1$c(wx1_12);
            this.a = n4;
            object = ((at0_1)object2).collect((fs0_2)object, this);
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


/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.ProductsList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

public final class wX1$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ wx1_1 b;
    public final /* synthetic */ ProductsList c;
    public final /* synthetic */ boolean d;

    public wX1$a(wx1_1 wx1_12, ProductsList productsList, boolean bl2, f80_0 f80_02) {
        this.b = wx1_12;
        this.c = productsList;
        this.d = bl2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ProductsList productsList = this.c;
        boolean bl2 = this.d;
        wx1_1 wx1_12 = this.b;
        object = new wX1$a(wx1_12, productsList, bl2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (wX1$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((wX1$a)object).invokeSuspend(object2);
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
            object = new wX1$a$a(wx1_12, (ProductsList)object2, null);
            object2 = new br2_2((Function2)object);
            object = ir0_2.a;
            object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
            boolean bl2 = this.d;
            object2 = new wX1$a$b(null, wx1_12, bl2);
            at0_1 at0_12 = new at0_1((es0_2)object, (gx0_2)object2);
            object = new wX1$a$c(wx1_12, bl2);
            this.a = n4;
            object = at0_12.collect((fs0_2)object, this);
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


/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CartRepo;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class vX1$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Product c;
    public final /* synthetic */ wx1_1 d;

    public vX1$a(Product product, wx1_1 wx1_12, f80_0 f80_02) {
        this.c = product;
        this.d = wx1_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Product product = this.c;
        wx1_1 wx1_12 = this.d;
        vX1$a vX1$a = new vX1$a(product, wx1_12, f80_02);
        vX1$a.b = object;
        return vX1$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (vX1$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((vX1$a)object).invokeSuspend(object2);
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
            object = (fs0_2)this.b;
            Object object2 = CartRepo.INSTANCE;
            Object object3 = this.d;
            zr1_1 zr1_12 = ((wx1_1)object3).t0;
            object3 = ((wx1_1)object3).v0;
            Product product = this.c;
            ((CartRepo)object2).calculateSizeVariantData(product, zr1_12, (zr1_1)object3);
            object2 = Unit.a;
            this.a = n4;
            object = object.emit(object2, this);
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


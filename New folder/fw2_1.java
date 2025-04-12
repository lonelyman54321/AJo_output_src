/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.ProductsList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from FW2
 */
public final class fw2_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ProductsList b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;
    public final /* synthetic */ yw2_0 g;
    public final /* synthetic */ String h;

    public fw2_1(ProductsList productsList, String string2, String string3, String string4, int n3, yw2_0 yw2_02, String string5, f80_0 f80_02) {
        this.b = productsList;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        this.f = n3;
        this.g = yw2_02;
        this.h = string5;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yw2_0 yw2_02 = this.g;
        String string2 = this.h;
        ProductsList productsList = this.b;
        String string3 = this.c;
        String string4 = this.d;
        String string5 = this.e;
        int n3 = this.f;
        object = new fw2_1(productsList, string3, string4, string5, n3, yw2_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (fw2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fw2_1)object).invokeSuspend(object2);
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
            object = ir0_2.a;
            object = em0_2.b;
            String string2 = this.h;
            ProductsList productsList = this.b;
            String string3 = this.c;
            String string4 = this.d;
            String string5 = this.e;
            int n7 = this.f;
            yw2_0 yw2_02 = this.g;
            FW2$a fW2$a = new FW2$a(productsList, string3, string4, string5, n7, yw2_02, string2, null);
            this.a = n4;
            object = Ae3.g(this, (CoroutineContext)object, fW2$a);
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


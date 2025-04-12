/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.services.data.Cart.BulkMoveToWishlist;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class EX1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ wx1_1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ BulkMoveToWishlist d;

    public EX1(wx1_1 wx1_12, BulkMoveToWishlist bulkMoveToWishlist, f80_0 f80_02) {
        this.b = wx1_12;
        this.c = "bag screen";
        this.d = bulkMoveToWishlist;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        BulkMoveToWishlist bulkMoveToWishlist = this.d;
        wx1_1 wx1_12 = this.b;
        object = new EX1(wx1_12, bulkMoveToWishlist, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (EX1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((EX1)object).invokeSuspend(object2);
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
            object = this.b;
            Object object2 = ((wx1_1)object).c;
            Object object3 = this.d;
            Object object4 = this.c;
            object2 = ((CartApiRepo)object2).getBulkMoveToWishListV2((String)object4, (BulkMoveToWishlist)object3);
            object3 = new ex1$a_0((wx1_1)object, null);
            object4 = new at0_1((es0_2)object2, (gx0_2)object3);
            object2 = new EX1$b((wx1_1)object);
            this.a = n4;
            object = ((at0_1)object4).collect((fs0_2)object2, this);
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


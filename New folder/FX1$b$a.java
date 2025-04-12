/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartInventory;
import kotlin.Unit;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class FX1$b$a
implements fs0_2 {
    public final /* synthetic */ wx1_1 a;
    public final /* synthetic */ Ref$ObjectRef b;

    public FX1$b$a(wx1_1 wx1_12, Ref$ObjectRef ref$ObjectRef) {
        this.a = wx1_12;
        this.b = ref$ObjectRef;
    }

    public final Object emit(Object object, f80_0 object2) {
        Object object3 = object;
        object3 = (dl2_2)object;
        object = ((dl2_2)object3).a;
        boolean bl2 = ((cl2_2)object).d();
        if (!bl2) {
            ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
            String string2 = "bag screen";
            String string3 = "Forward";
            String string4 = "cartInventoryCheck";
            boolean bl3 = true;
            apiErrorRepo.getApiError((dl2_2)object3, string4, bl3, string2, string3);
        } else {
            object = this.a.c;
            object2 = (Cart)this.b.element;
            CartInventory cartInventory = (CartInventory)((dl2_2)object3).b;
            ((CartApiRepo)object).mergeCartAndInventory((Cart)object2, cartInventory);
        }
        return Unit.a;
    }
}


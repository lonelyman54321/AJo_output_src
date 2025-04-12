/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper;
import com.ril.ajio.data.database.entity.ProductExperience;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class YC2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ProductExperience b;
    public final /* synthetic */ ZC2 c;

    public YC2(ProductExperience productExperience, ZC2 zC2, f80_0 f80_02) {
        this.b = productExperience;
        this.c = zC2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ProductExperience productExperience = this.b;
        ZC2 zC2 = this.c;
        object = new YC2(productExperience, zC2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (YC2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((YC2)object).invokeSuspend(object2);
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
            object = RecentlyViewedDaoHelper.INSTANCE;
            Object object2 = this.c;
            Object object3 = ((ZC2)object2).e;
            object2 = ((ZC2)object2).f;
            ProductExperience productExperience = this.b;
            object = ((RecentlyViewedDaoHelper)object).fetchAndInsertRecentlyViewed(productExperience, (zr1_1)object3, (zr1_1)object2);
            int n7 = 3;
            productExperience = null;
            object2 = new qg3_2(n7, null);
            object3 = new at0_1((es0_2)object, (gx0_2)object2);
            object = YC2$b.a;
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


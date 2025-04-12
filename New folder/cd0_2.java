/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CouponRepo;
import com.ril.ajio.services.query.QuerySingleData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from cd0
 */
public final class cd0_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ed0_2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ QuerySingleData d;
    public final /* synthetic */ boolean e;

    public cd0_2(ed0_2 ed0_22, QuerySingleData querySingleData, boolean bl2, f80_0 f80_02) {
        this.b = ed0_22;
        this.c = "coupon screen";
        this.d = querySingleData;
        this.e = bl2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.e;
        ed0_2 ed0_22 = this.b;
        QuerySingleData querySingleData = this.d;
        object = new cd0_2(ed0_22, querySingleData, bl2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (cd0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((cd0_2)object).invokeSuspend(object2);
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
            Object object2 = ((ed0_2)object).a;
            Object object3 = this.d;
            boolean bl2 = this.e;
            String string2 = this.c;
            object2 = ((CouponRepo)object2).applyCoupon(string2, (QuerySingleData)object3, bl2);
            bl2 = false;
            object3 = new cd0$a((ed0_2)object, null);
            at0_1 at0_12 = new at0_1((es0_2)object2, (gx0_2)object3);
            object2 = new cd0$b((ed0_2)object);
            this.a = n4;
            object = at0_12.collect((fs0_2)object2, this);
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


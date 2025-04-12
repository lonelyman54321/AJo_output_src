/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cb2
 */
public final class cb2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ db2_1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    public cb2_2(db2_1 db2_12, String string2, boolean bl2, boolean bl3, f80_0 f80_02) {
        this.b = db2_12;
        this.c = string2;
        this.d = bl2;
        this.e = true;
        this.f = bl3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        boolean bl2 = this.d;
        db2_1 db2_12 = this.b;
        boolean bl3 = this.f;
        object = new cb2_2(db2_12, string2, bl2, bl3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (cb2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((cb2_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        int n3 = 1;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n4 = this.a;
        if (n4 == 0) {
            bx2_1 bx2_12;
            vl2_2.b(object);
            object = this.b;
            Object object2 = ((db2_1)object).a;
            n4 = (int)(this.e ? 1 : 0);
            Boolean bl2 = n4 != 0;
            Object object3 = ((db2_1)object).c().getUserId();
            Intrinsics.checkNotNullExpressionValue(object3, "getUserId(...)");
            String string2 = ServiceUtil.getToken(((db2_1)object).c());
            object2.getClass();
            Object object4 = this.c;
            Intrinsics.checkNotNullParameter(object4, "orderId");
            Intrinsics.checkNotNullParameter(object3, "userId");
            UrlHelper urlHelper = UrlHelper.Companion.getInstance();
            Object[] objectArray = new Object[2];
            objectArray[0] = object3;
            objectArray[n3] = object4;
            object4 = urlHelper.getApiUrl("order", "new_order_details", objectArray);
            boolean bl3 = this.d;
            boolean bl4 = this.f;
            object3 = bx2_12;
            bx2_12 = new bx2_1((ux2_1)object2, (String)object4, string2, bl3, bl2, bl4, null);
            object3 = new br2_2(bx2_12);
            object2 = ir0_2.a;
            object2 = em0_2.b;
            object3 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
            object2 = new ax2_1((es0_2)object3);
            object3 = ir0_2.a;
            object3 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
            object2 = new cb2$a((db2_1)object, null);
            object4 = new at0_1((es0_2)object3, (gx0_2)object2);
            object3 = new cb2$b((db2_1)object);
            this.a = n3;
            object = ((at0_1)object4).collect((fs0_2)object3, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n4 == n3) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}


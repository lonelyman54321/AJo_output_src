/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class db2$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ db2_1 b;
    public final /* synthetic */ String c;

    public db2$a(db2_1 db2_12, String string2, f80_0 f80_02) {
        this.b = db2_12;
        this.c = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        db2_1 db2_12 = this.b;
        String string2 = this.c;
        object = new db2$a(db2_12, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (db2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((db2$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        int n3 = 1;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n4 = this.a;
        if (n4 == 0) {
            vl2_2.b(object);
            object = this.b;
            Object object2 = ((db2_1)object).a;
            Object object3 = ((db2_1)object).c().getUserId();
            Intrinsics.checkNotNullExpressionValue(object3, "getUserId(...)");
            Object object4 = ServiceUtil.getToken(((db2_1)object).c());
            object2.getClass();
            Object object5 = this.c;
            Intrinsics.checkNotNullParameter(object5, "orderId");
            Intrinsics.checkNotNullParameter(object3, "userId");
            UrlHelper urlHelper = UrlHelper.Companion.getInstance();
            int n7 = 2;
            Object[] objectArray = new Object[n7];
            objectArray[0] = object3;
            objectArray[n3] = object5;
            object3 = urlHelper.getApiUrl("order", "order_details", objectArray);
            urlHelper = null;
            object5 = new fx2_1((ux2_1)object2, (String)object3, (String)object4, null);
            object2 = new br2_2((Function2)object5);
            object3 = ir0_2.a;
            object3 = em0_2.b;
            object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
            object3 = new ex2_1((es0_2)object2);
            object2 = ir0_2.a;
            object2 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
            object3 = new db2$a$a((db2_1)object, null);
            object4 = new at0_1((es0_2)object2, (gx0_2)object3);
            object2 = new db2$a$b((db2_1)object);
            this.a = n3;
            object = ((at0_1)object4).collect((fs0_2)object2, this);
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


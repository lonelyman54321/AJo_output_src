/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from bb2
 */
public final class bb2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ db2_1 b;

    public bb2_2(db2_1 db2_12, f80_0 f80_02) {
        this.b = db2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        db2_1 db2_12 = this.b;
        object = new bb2_2(db2_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (bb2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((bb2_2)object).invokeSuspend(object2);
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
            Object object2 = ((db2_1)object).a;
            Object object3 = ServiceUtil.getToken(((db2_1)object).c());
            object2.getClass();
            Object object4 = UrlHelper.Companion.getInstance();
            Object[] objectArray = new Object[]{};
            String string2 = "cancel_reasons";
            object4 = ((UrlHelper)object4).getApiUrl("order", string2, objectArray);
            zw2_2 zw2_22 = new zw2_2((ux2_1)object2, (String)object4, (String)object3, null);
            object2 = new br2_2(zw2_22);
            object3 = ir0_2.a;
            object3 = em0_2.b;
            object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
            object3 = new yw2_2((es0_2)object2);
            object2 = ir0_2.a;
            object2 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
            object3 = new bb2$a_0((db2_1)object, null);
            object4 = new at0_1((es0_2)object2, (gx0_2)object3);
            object2 = new bb2$b((db2_1)object);
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


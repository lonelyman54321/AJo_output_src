/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Np2
 */
public final class np2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ op2_2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TenantResponse d;

    public np2_2(op2_2 op2_22, String string2, TenantResponse tenantResponse, f80_0 f80_02) {
        this.b = op2_22;
        this.c = string2;
        this.d = tenantResponse;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        op2_2 op2_22 = this.b;
        String string2 = this.c;
        TenantResponse tenantResponse = this.d;
        object = new np2_2(op2_22, string2, tenantResponse, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (np2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((np2_2)object).invokeSuspend(object2);
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
            Object object2 = ((op2_2)object).a;
            object2.getClass();
            Object object3 = UrlHelper.Companion.getInstance();
            Object object4 = new Object[]{};
            object3 = ((UrlHelper)object3).getApiUrl("payment", "instruments", (Object[])object4);
            Object object5 = this.c;
            object4 = new uo2_2((String)object5, (oo2_1)object2, (String)object3, null);
            object3 = new br2_2((Function2)object4);
            object4 = ir0_2.a;
            object4 = em0_2.b;
            object3 = ms0_1.m((es0_2)object3, (CoroutineContext)object4);
            object5 = this.d;
            object4 = new to2_2((es0_2)object3, (oo2_1)object2, (TenantResponse)object5);
            object2 = ir0_2.a;
            object2 = ms0_1.m((es0_2)object4, (CoroutineContext)object2);
            object3 = new np2$a_0((op2_2)object, null);
            object4 = new at0_1((es0_2)object2, (gx0_2)object3);
            object2 = new Np2$b((op2_2)object);
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


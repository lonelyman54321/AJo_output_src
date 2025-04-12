/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.seen_components.SesActionApiRequestBody;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

public final class DR0$j
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ SesActionApiRequestBody d;

    public DR0$j(dr0_0 dr0_02, boolean bl2, SesActionApiRequestBody sesActionApiRequestBody, f80_0 f80_02) {
        this.b = dr0_02;
        this.c = bl2;
        this.d = sesActionApiRequestBody;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.c;
        SesActionApiRequestBody sesActionApiRequestBody = this.d;
        dr0_0 dr0_02 = this.b;
        object = new DR0$j(dr0_02, bl2, sesActionApiRequestBody, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (DR0$j)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((DR0$j)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        tr0_1 tr0_12;
        int n3 = 1;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n4 = this.a;
        if (n4 != 0) {
            if (n4 == n3) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = this.b;
        Object object2 = ((dr0_0)object).a;
        Object object3 = ((xr0_2)object2).a().getCustomerUUID();
        int n7 = this.c;
        Object object4 = n7 != 0 ? "brand" : "content";
        String string2 = ServiceUtil.getToken(((xr0_2)object2).a());
        string2 = kp1_0.c("Bearer ", string2);
        Object object5 = UrlHelper.Companion.getInstance();
        String string3 = ld3_2.STORE_AJIOGRAM.getStoreId();
        int n8 = 2;
        Object[] objectArray = new Object[n8];
        objectArray[0] = object4;
        objectArray[n3] = object3;
        object4 = ((UrlHelper)object5).getApiUrl(string3, "ses_action_api", objectArray);
        string3 = null;
        object5 = this.d;
        object3 = tr0_12;
        tr0_12 = new tr0_1((xr0_2)object2, (String)object4, string2, (SesActionApiRequestBody)object5, null);
        object3 = new br2_2(tr0_12);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object3 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
        n7 = 3;
        string2 = null;
        object2 = new qg3_2(n7, null);
        object4 = new at0_1((es0_2)object3, (gx0_2)object2);
        object3 = new DR0$j$a((dr0_0)object);
        this.a = n3;
        object = ((at0_1)object4).collect((fs0_2)object3, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}


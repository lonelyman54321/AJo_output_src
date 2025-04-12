/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.seen_components.ShareActionRequestBody;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class DR0$l
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ ShareActionRequestBody c;

    public DR0$l(dr0_0 dr0_02, ShareActionRequestBody shareActionRequestBody, f80_0 f80_02) {
        this.b = dr0_02;
        this.c = shareActionRequestBody;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.b;
        ShareActionRequestBody shareActionRequestBody = this.c;
        object = new DR0$l(dr0_02, shareActionRequestBody, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (DR0$l)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((DR0$l)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        String string2;
        Object object2;
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
        Object object3 = this.b.a;
        object3.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        object = ((xr0_2)object3).a();
        boolean bl2 = ((UserInformation)object).isUserOnline();
        if (bl2) {
            object = ((xr0_2)object3).a().getCustomerUUID();
            object2 = ServiceUtil.getToken(((xr0_2)object3).a());
            string2 = "Bearer ";
            ref$ObjectRef.element = object2 = kp1_0.c(string2, (String)object2);
        } else {
            object = "anonymous";
        }
        object2 = UrlHelper.Companion.getInstance();
        string2 = ld3_2.STORE_AJIOGRAM.getStoreId();
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        string2 = ((UrlHelper)object2).getApiUrl(string2, "share_content", objectArray);
        objectArray = null;
        ShareActionRequestBody shareActionRequestBody = this.c;
        object2 = object;
        object = new vr0_1((xr0_2)object3, string2, ref$ObjectRef, shareActionRequestBody, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        int n7 = 3;
        string2 = null;
        object2 = new qg3_2(n7, null);
        object3 = new at0_1((es0_2)object, (gx0_2)object2);
        object = DR0$l$a.a;
        this.a = n3;
        object = ((at0_1)object3).collect((fs0_2)object, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}


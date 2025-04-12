/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.FleekQueryParameters;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

public final class DR0$g
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ FleekQueryParameters c;

    public DR0$g(dr0_0 dr0_02, FleekQueryParameters fleekQueryParameters, f80_0 f80_02) {
        this.b = dr0_02;
        this.c = fleekQueryParameters;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.b;
        FleekQueryParameters fleekQueryParameters = this.c;
        object = new DR0$g(dr0_02, fleekQueryParameters, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (DR0$g)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((DR0$g)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = this.b;
        xr0_2 xr0_22 = ((dr0_0)object).a;
        int n7 = ((dr0_0)object).C();
        xr0_22.getClass();
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = ld3_2.STORE_AJIOGRAM.getStoreId();
        Object[] objectArray = new Object[]{};
        Object object4 = "stories";
        String string2 = ((UrlHelper)object2).getApiUrl((String)object3, (String)object4, objectArray);
        LinkedHashMap linkedHashMap = xr0_2.b(this.c);
        object2 = xr0_22.a();
        n3 = (int)(((UserInformation)object2).isUserOnline() ? 1 : 0);
        if (n3 != 0) {
            object2 = ServiceUtil.getToken(xr0_22.a());
            object3 = "Bearer ";
            object4 = object2 = kp1_0.c((String)object3, (String)object2);
        } else {
            object4 = null;
        }
        object3 = object2;
        object2 = new pr0_2(n7, xr0_22, string2, (String)object4, linkedHashMap, null);
        object3 = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object2 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
        n7 = 3;
        object3 = new qg3_2(n7, null);
        at0_1 at0_12 = new at0_1((es0_2)object2, (gx0_2)object3);
        object2 = new DR0$g$a((dr0_0)object);
        this.a = n4;
        object = at0_12.collect((fs0_2)object2, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}


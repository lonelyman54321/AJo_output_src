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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from KR0
 */
public final class kr0_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ String c;

    public kr0_1(dr0_0 dr0_02, String string2, f80_0 f80_02) {
        this.b = dr0_02;
        this.c = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.b;
        String string2 = this.c;
        object = new kr0_1(dr0_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (kr0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((kr0_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        kr0_1 kr0_12 = this;
        int n3 = 1;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n4 = this.a;
        if (n4 != 0) {
            if (n4 == n3) {
                vl2_2.b(object);
                return Unit.a;
            }
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw illegalStateException;
        }
        vl2_2.b(object);
        dr0_0 dr0_02 = this.b;
        Object object3 = dr0_02.a;
        Object object4 = object2;
        String string2 = null;
        jr0_2 jr0_22 = null;
        Object[] objectArray = null;
        int n7 = 524286;
        object2 = new FleekQueryParameters("AJIO", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n7, null);
        object3.getClass();
        object4 = this.c;
        Intrinsics.checkNotNullParameter(object4, "postId");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object5 = ((xr0_2)object3).a();
        boolean bl2 = ((UserInformation)object5).isUserOnline();
        if (bl2) {
            object5 = ServiceUtil.getToken(((xr0_2)object3).a());
            string2 = "Bearer ";
            ref$ObjectRef.element = object5 = kp1_0.c(string2, (String)object5);
        }
        object5 = xr0_2.b((FleekQueryParameters)object2);
        object2 = UrlHelper.Companion.getInstance();
        string2 = ld3_2.STORE_AJIOGRAM.getStoreId();
        objectArray = new Object[n3];
        objectArray[0] = object4;
        object4 = ((UrlHelper)object2).getApiUrl(string2, "get_post_details", objectArray);
        string2 = null;
        object2 = jr0_22;
        jr0_22 = new jr0_2((xr0_2)object3, (String)object4, ref$ObjectRef, (LinkedHashMap)object5, null);
        object2 = new br2_2(jr0_22);
        object3 = ir0_2.a;
        object3 = em0_2.b;
        object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
        int n8 = 3;
        ref$ObjectRef = null;
        object3 = new qg3_2(n8, null);
        object4 = new at0_1((es0_2)object2, (gx0_2)object3);
        object2 = new KR0$a(dr0_02);
        kr0_12.a = n3;
        Object object6 = ((at0_1)object4).collect((fs0_2)object2, kr0_12);
        if (object6 != j90_02) return Unit.a;
        return j90_02;
    }
}


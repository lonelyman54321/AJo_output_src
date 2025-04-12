/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.FleekQueryParameters;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LR0
 */
public final class lr0_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public lr0_1(int n3, f80_0 f80_02, dr0_0 dr0_02, String string2) {
        this.b = dr0_02;
        this.c = string2;
        this.d = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        int n3 = this.d;
        dr0_0 dr0_02 = this.b;
        object = new lr0_1(n3, f80_02, dr0_02, string2);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (lr0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((lr0_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        lr0_2 lr0_22;
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
        Object object3 = az3_0.b();
        object2.getClass();
        Object object4 = this.c;
        Intrinsics.checkNotNullParameter(object4, "brandId");
        Object object5 = ((xr0_2)object2).a();
        boolean bl2 = ((UserInformation)object5).isUserOnline();
        if (bl2) {
            object5 = ((xr0_2)object2).a().getCustomerUUID();
            Intrinsics.checkNotNull(object5);
        } else {
            object5 = "anonymous_uuid";
        }
        Object object6 = UrlHelper.Companion.getInstance();
        String string2 = ld3_2.STORE_AJIOGRAM.getStoreId();
        int n7 = 2;
        Object[] objectArray = new Object[n7];
        objectArray[0] = object5;
        objectArray[n3] = object4;
        object4 = ((UrlHelper)object6).getApiUrl(string2, "recent_post", objectArray);
        object5 = xr0_2.b((FleekQueryParameters)object3);
        object6 = "RECENT";
        object5.put("category", object6);
        string2 = null;
        int n8 = this.d;
        object3 = lr0_22;
        lr0_22 = new lr0_2((xr0_2)object2, (String)object4, (LinkedHashMap)object5, n8, null);
        object3 = new br2_2(lr0_22);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object3 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
        int n10 = 3;
        bl2 = false;
        object5 = null;
        object2 = new qg3_2(n10, null);
        object4 = new at0_1((es0_2)object3, (gx0_2)object2);
        object3 = new LR0$a((dr0_0)object);
        this.a = n3;
        object = ((at0_1)object4).collect((fs0_2)object3, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.FleekQueryParameters;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class FR0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Activity d;

    public FR0(f80_0 f80_02, dr0_0 dr0_02, Activity activity, String string2) {
        this.b = dr0_02;
        this.c = string2;
        this.d = activity;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        Activity activity = this.d;
        dr0_0 dr0_02 = this.b;
        object = new FR0(f80_02, dr0_02, activity, string2);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (FR0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((FR0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
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
        UrlHelper urlHelper = UrlHelper.Companion.getInstance();
        String string2 = ld3_2.STORE_AJIOGRAM.getStoreId();
        String string3 = "brand_page";
        int n7 = 2;
        Object[] objectArray = new Object[n7];
        objectArray[0] = object5;
        objectArray[n3] = object4;
        object4 = urlHelper.getApiUrl(string2, string3, objectArray);
        object3 = xr0_2.b((FleekQueryParameters)object3);
        urlHelper = null;
        object5 = new zq0_1((xr0_2)object2, (String)object4, (LinkedHashMap)object3, null);
        object2 = new br2_2((Function2)object5);
        object3 = ir0_2.a;
        object3 = em0_2.b;
        object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
        int n8 = 3;
        object3 = new qg3_2(n8, null);
        object4 = new at0_1((es0_2)object2, (gx0_2)object3);
        object3 = this.d;
        object2 = new FR0$a((dr0_0)object, (Activity)object3);
        this.a = n3;
        object = ((at0_1)object4).collect((fs0_2)object2, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}


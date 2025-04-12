/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gv0
 */
public final class gv0_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ov0_0 b;

    public gv0_2(ov0_0 ov0_02, f80_0 f80_02) {
        this.b = ov0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ov0_0 ov0_02 = this.b;
        object = new gv0_2(ov0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (gv0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((gv0_2)object).invokeSuspend(object2);
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
        Object object2 = ((ov0_0)object).a;
        object2.getClass();
        Object object3 = CustomerStoreType.a;
        object3 = od3_2.a();
        ScreenType screenType = ScreenType.SCREEN_HOME;
        String string2 = CustomerStoreType.a((String)object3, screenType);
        object3 = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[]{};
        String string3 = ((UrlHelper)object3).getApiUrl("misc", "banner_ad_different_api", objectArray);
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        object3 = Locale.ROOT;
        String string4 = "mobile".toUpperCase((Locale)object3);
        String string5 = "toUpperCase(...)";
        Intrinsics.checkNotNullExpressionValue(string4, string5);
        hashMap.put("platform", string4);
        String string6 = od3_2.a().toUpperCase((Locale)object3);
        Intrinsics.checkNotNullExpressionValue(string6, string5);
        hashMap.put("store", string6);
        String string7 = "ajio".toUpperCase((Locale)object3);
        Intrinsics.checkNotNullExpressionValue(string7, string5);
        String string8 = "tenantId";
        hashMap.put(string8, string7);
        object3 = "android".toUpperCase((Locale)object3);
        Intrinsics.checkNotNullExpressionValue(object3, string5);
        String string9 = "channel";
        hashMap.put(string9, object3);
        object3 = ((jo_2)((fv0_0)object2).b.getValue()).f();
        if (object3 == null) {
            object3 = "";
        }
        hashMap.put("userType", object3);
        hashMap.put("userGroup", string2);
        object3 = h40_0.a;
        object3 = z40_0.Companion;
        object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a.d("CMSPageConfig").optString("braDressToolPage");
        Intrinsics.checkNotNullExpressionValue(object3, "optString(...)");
        hashMap.put("url", object3);
        string5 = null;
        Object object4 = object3;
        object3 = new dv0_1((fv0_0)object2, string3, string2, hashMap, null);
        br2_2 br2_22 = new br2_2((Function2)object3);
        object3 = ir0_2.a;
        object3 = em0_2.b;
        object3 = ms0_1.m(br2_22, (CoroutineContext)object3);
        int n7 = 3;
        string3 = null;
        ev0_1 ev0_12 = new qg3_2(n7, null);
        object2 = new at0_1((es0_2)object3, ev0_12);
        object3 = new Gv0$a((ov0_0)object);
        this.a = n4;
        object = ((at0_1)object2).collect((fs0_2)object3, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}


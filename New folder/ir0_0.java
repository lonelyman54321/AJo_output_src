/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.model.CMSConfigInitializer;
import com.ril.ajio.services.data.fleek.FleekQueryParameters;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/*
 * Renamed from IR0
 */
public final class ir0_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ dr0_0 b;

    public ir0_0(f80_0 f80_02, dr0_0 dr0_02) {
        this.b = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.b;
        object = new ir0_0(f80_02, dr0_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ir0_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ir0_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        boolean bl2 = false;
        Object object3 = null;
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
        Object object4 = ((dr0_0)object).a;
        Object object5 = az3_0.b();
        Object object6 = ((xr0_2)object4).a();
        boolean bl3 = ((UserInformation)object6).isUserOnline();
        if (bl3) {
            object6 = ((xr0_2)object4).a().getCustomerUUID();
            Intrinsics.checkNotNull(object6);
        } else {
            object6 = "anonymous_uuid";
        }
        String string2 = ServiceUtil.getToken(((xr0_2)object4).a());
        string2 = kp1_0.c("Bearer ", string2);
        Object object7 = UrlHelper.Companion;
        boolean bl4 = ((UrlHelper$Companion)object7).getISPREVIEW();
        if (bl4) {
            object2 = CMSConfigInitializer.INSTANCE.getExploreBrandsUrlForPreview();
            Object[] objectArray = StringCompanionObject.INSTANCE;
            objectArray = new Object[n3];
            objectArray[0] = object6;
            object3 = xh2_0.a(objectArray, n3, (String)object2, "format(...)");
        } else {
            object2 = ((UrlHelper$Companion)object7).getInstance();
            String string3 = ld3_2.STORE_AJIOGRAM.getStoreId();
            String string4 = "explore_brands";
            Object[] objectArray = new Object[n3];
            objectArray[0] = object6;
            object3 = ((UrlHelper)object2).getApiUrl(string3, string4, objectArray);
        }
        object6 = object3;
        bl2 = ((UrlHelper$Companion)object7).getISPREVIEW();
        if (bl2) {
            int n7;
            object3 = new LinkedHashMap();
            object7 = "true";
            object3.put("isPreview", object7);
            object5 = ch_2.g;
            if (object5 != null && (object5 = ((Object)StringsKt.m0(object5)).toString()) != null && (n4 = ((String)object5).length()) > 0 && (object5 = ch_2.g) != null) {
                object5 = ((Object)StringsKt.m0((CharSequence)object5)).toString();
                object7 = "url";
                object3.put(object7, object5);
            }
            if ((n4 = ch_2.f) != (n7 = -1)) {
                object7 = "pageId";
                object5 = String.valueOf(n4);
                object3.put(object7, object5);
            }
            if ((object5 = ch_2.k) != null) {
                object7 = "appVersion";
                object3.put(object7, object5);
            }
            if ((object5 = ch_2.l) != null) {
                object7 = "store";
                object3.put(object7, object5);
            }
            object7 = "AJIO";
            object3.put("tenantId", object7);
            object5 = ch_2.a();
            if (object5 != null && (n7 = ((String)object5).length()) != 0) {
                object7 = "timestamp";
                object3.put(object7, object5);
            }
            if ((object5 = ch_2.i) != null) {
                object7 = "userstate";
                object3.put(object7, object5);
            }
            object7 = "Android";
            object3.put("channel", object7);
            object5 = ch_2.m;
            if (object5 != null) {
                object7 = "usersubgroup";
                object3.put(object7, object5);
            }
            if ((object5 = ch_2.j) != null) {
                object7 = "usergroup";
                object3.put(object7, object5);
            }
            if ((object5 = ch_2.h) != null) {
                object7 = "usertype";
                object3.put(object7, object5);
            }
            object5 = "platform";
            object7 = "MOBILE";
            object3.put(object5, object7);
        } else {
            object3 = xr0_2.b((FleekQueryParameters)object5);
        }
        object7 = object3;
        bl4 = false;
        object2 = null;
        object5 = object3;
        object3 = new dr0_1((xr0_2)object4, (String)object6, string2, (LinkedHashMap)object7, null);
        object5 = new br2_2((Function2)object3);
        object3 = ir0_2.a;
        object3 = em0_2.b;
        object3 = ms0_1.m((es0_2)object5, (CoroutineContext)object3);
        int n8 = 3;
        bl3 = false;
        object6 = null;
        object5 = new qg3_2(n8, null);
        object4 = new at0_1((es0_2)object3, (gx0_2)object5);
        object3 = new IR0$a((dr0_0)object);
        this.a = n3;
        object = ((at0_1)object4).collect((fs0_2)object3, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}


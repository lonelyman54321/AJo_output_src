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
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.text.StringsKt;

public final class DR0$f
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ dr0_0 b;

    public DR0$f(f80_0 f80_02, dr0_0 dr0_02) {
        this.b = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.b;
        object = new DR0$f(f80_02, dr0_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (DR0$f)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((DR0$f)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        void var14_17;
        Object object2;
        Object object3;
        Object object4;
        int n3;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n4 = this.a;
        int n7 = 1;
        if (n4 != 0) {
            if (n4 == n7) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = new Ref$BooleanRef();
        Object object5 = az3_0.b();
        dr0_0 dr0_02 = this.b;
        Object object6 = dr0_02.q0;
        if (object6 != null && (n3 = object6.isEmpty()) == 0 && (n3 = dr0_02.v()) == 0) {
            object6 = dr0_02.A("POSTS");
            ((FleekQueryParameters)object5).setSeenPostIds((String)object6);
        }
        int n8 = dr0_02.v();
        xr0_2 xr0_22 = dr0_02.a;
        xr0_22.getClass();
        object6 = UrlHelper.Companion;
        int n10 = ((UrlHelper$Companion)object6).getISPREVIEW();
        if (n10 != 0) {
            object4 = CMSConfigInitializer.INSTANCE.getFeedUrlForPreview();
        } else {
            object4 = ((UrlHelper$Companion)object6).getInstance();
            object3 = ld3_2.STORE_AJIOGRAM.getStoreId();
            Object[] objectArray = new Object[]{};
            object2 = "feed_pagination";
            object4 = ((UrlHelper)object4).getApiUrl((String)object3, (String)object2, objectArray);
        }
        object3 = object4;
        n3 = (int)(((UrlHelper$Companion)object6).getISPREVIEW() ? 1 : 0);
        if (n3 != 0) {
            object5 = new LinkedHashMap();
            object6 = ch_2.g;
            if (object6 != null && (object6 = ((Object)StringsKt.m0((CharSequence)object6)).toString()) != null && (n3 = ((String)object6).length()) > 0 && (object6 = ch_2.g) != null) {
                object6 = ((Object)StringsKt.m0((CharSequence)object6)).toString();
                object4 = "url";
                object5.put(object4, object6);
            }
            if ((n3 = ch_2.f) != (n10 = -1)) {
                object4 = "pageId";
                object6 = String.valueOf(n3);
                object5.put(object4, object6);
            }
            if ((object6 = ch_2.k) != null) {
                object4 = "appVersion";
                object5.put(object4, object6);
            }
            if ((object6 = ch_2.l) != null) {
                object4 = "store";
                object5.put(object4, object6);
            }
            object4 = "AJIO";
            object5.put("tenantId", object4);
            object6 = ch_2.a();
            if (object6 != null && (n10 = ((String)object6).length()) != 0) {
                object4 = "timestamp";
                object5.put(object4, object6);
            }
            if ((object6 = ch_2.i) != null) {
                object4 = "userstate";
                object5.put(object4, object6);
            }
            object4 = "Android";
            object5.put("channel", object4);
            object6 = ch_2.m;
            if (object6 != null) {
                object4 = "usersubgroup";
                object5.put(object4, object6);
            }
            if ((object6 = ch_2.j) != null) {
                object4 = "usergroup";
                object5.put(object4, object6);
            }
            if ((object6 = ch_2.h) != null) {
                object4 = "usertype";
                object5.put(object4, object6);
            }
            object6 = "platform";
            object4 = "MOBILE";
            object5.put(object6, object4);
        } else {
            object5 = xr0_2.b((FleekQueryParameters)object5);
        }
        object2 = object5;
        object5 = xr0_22.a();
        n4 = (int)(((UserInformation)object5).isUserOnline() ? 1 : 0);
        n3 = 0;
        object6 = null;
        if (n4 != 0) {
            object5 = ServiceUtil.getToken(xr0_22.a());
            object4 = "Bearer ";
            Object object7 = object5 = kp1_0.c((String)object4, (String)object5);
        } else {
            Object var14_16 = null;
        }
        object4 = object5;
        object5 = new fr0_0(n8, xr0_22, (String)object3, (String)var14_17, (LinkedHashMap)object2, null);
        object4 = new br2_2((Function2)object5);
        object5 = ir0_2.a;
        object5 = em0_2.b;
        object5 = ms0_1.m((es0_2)object4, (CoroutineContext)object5);
        n8 = 3;
        object4 = new qg3_2(n8, null);
        object6 = new at0_1((es0_2)object5, (gx0_2)object4);
        object5 = new DR0$f$a(dr0_02, (Ref$BooleanRef)object);
        this.a = n7;
        object = ((at0_1)object6).collect((fs0_2)object5, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}


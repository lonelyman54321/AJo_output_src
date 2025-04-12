/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JR0
 */
public final class jr0_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ dr0_0 b;

    public jr0_1(f80_0 f80_02, dr0_0 dr0_02) {
        this.b = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.b;
        object = new jr0_1(f80_02, dr0_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (jr0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((jr0_1)object).invokeSuspend(object2);
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
        Object object2 = ((dr0_0)object).a;
        Object object3 = h40_0.a;
        boolean bl2 = h40_0.c();
        object3 = bl2 ? "BOTTOM_BAR_NAV_2.0" : "BOTTOM_BAR";
        Object object4 = ld3_2.STORE_AJIOGRAM.getStoreId();
        Object object5 = Locale.ROOT;
        object4 = ((String)object4).toUpperCase((Locale)object5);
        Intrinsics.checkNotNullExpressionValue(object4, "toUpperCase(...)");
        object2.getClass();
        Intrinsics.checkNotNullParameter("Fleek Home", "screenName");
        object5 = "navigationType";
        Intrinsics.checkNotNullParameter(object3, (String)object5);
        String string2 = "store";
        Intrinsics.checkNotNullParameter(object4, string2);
        Object object6 = UrlHelper.Companion.getInstance();
        Object object7 = new Object[]{};
        object6 = ((UrlHelper)object6).getApiUrl("homepage", "cms_nav_menu", (Object[])object7);
        object7 = new JsonObject();
        String string3 = "channel";
        String string4 = "Android";
        ((JsonObject)object7).addProperty(string3, string4);
        ((JsonObject)object7).addProperty((String)object5, (String)object3);
        object5 = "MOBILE";
        ((JsonObject)object7).addProperty("platform", (String)object5);
        ((JsonObject)object7).addProperty(string2, (String)object4);
        ((JsonObject)object7).addProperty("tenantId", "AJIO");
        object3 = new ir0_1((xr0_2)object2, (String)object6, (JsonObject)object7, null);
        object2 = new br2_2((Function2)object3);
        object3 = ir0_2.a;
        object3 = em0_2.b;
        object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
        object3 = new hr0_1((es0_2)object2);
        object2 = ir0_2.a;
        object2 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
        object3 = new JR0$a(null, (dr0_0)object);
        object4 = new at0_1((es0_2)object2, (gx0_2)object3);
        object2 = new JR0$b((dr0_0)object);
        this.a = n4;
        object = ((at0_1)object4).collect((fs0_2)object2, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}


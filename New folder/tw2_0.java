/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from tW2
 */
public final class tw2_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ yw2_0 b;
    public final /* synthetic */ String c;

    public tw2_0(f80_0 f80_02, yw2_0 yw2_02, String string2) {
        this.b = yw2_02;
        this.c = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yw2_0 yw2_02 = this.b;
        String string2 = this.c;
        object = new tw2_0(f80_02, yw2_02, string2);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (tw2_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((tw2_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        int n3;
        int n4 = 1;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n7 = this.a;
        if (n7 != 0) {
            if (n7 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = this.b;
        Object object2 = ((yw2_0)object).a;
        object2.getClass();
        String string2 = this.c;
        Intrinsics.checkNotNullParameter(string2, "query");
        Intrinsics.checkNotNullParameter("search screen", "screenName");
        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
        Object object3 = new Ref$ObjectRef();
        Object object4 = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[n4];
        objectArray[0] = string2;
        Object object5 = "recently_viewed_list";
        String string3 = ((UrlHelper)object4).getApiUrl("pdp", (String)object5, objectArray);
        ((Ref$ObjectRef)object3).element = string3;
        UserInformation userInformation = ((dw2_0)object2).c;
        object4 = userInformation.getUserSegementIds();
        if (object4 != null && (n3 = ((String)object4).length()) != 0) {
            object4 = "segmentIds";
            String string4 = userInformation.getUserSegementIds();
            linkedHashMap.put(object4, string4);
        }
        List list = ww0_2.a;
        ScreenType screenType = ScreenType.SCREEN_PDP;
        object4 = ww0_2.b(screenType);
        n7 = (int)(mz3_0.y((String)object4) ? 1 : 0);
        if (n7 != 0 && (n7 = (int)(ww0_2.c() ? 1 : 0)) != 0 && (n7 = ((String)object4).length()) != 0) {
            String string5 = "userClusterId";
            linkedHashMap.put(string5, object4);
        }
        TU2.a(linkedHashMap);
        objectArray = null;
        Object object6 = object5;
        object5 = new uv2_2((dw2_0)object2, (Ref$ObjectRef)object3, linkedHashMap, (String)object4, null);
        br2_2 br2_22 = new br2_2((Function2)object5);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        es0_2 es0_22 = ms0_1.m(br2_22, (CoroutineContext)object2);
        object2 = new TV2(es0_22);
        d21_0 d21_02 = bg1_1.a;
        es0_2 es0_23 = ms0_1.m((es0_2)object2, d21_02);
        object2 = new tW2$a((yw2_0)object, null);
        object3 = new at0_1(es0_23, (gx0_2)object2);
        tW2$b tW2$b = new tW2$b((yw2_0)object);
        this.a = n4;
        object = ((at0_1)object3).collect(tW2$b, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}


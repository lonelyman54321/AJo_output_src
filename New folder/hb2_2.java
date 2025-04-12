/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.query.QueryFeedback;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from hb2
 */
public final class hb2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ db2_1 b;
    public final /* synthetic */ QueryFeedback c;

    public hb2_2(db2_1 db2_12, QueryFeedback queryFeedback, f80_0 f80_02) {
        this.b = db2_12;
        this.c = queryFeedback;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        db2_1 db2_12 = this.b;
        QueryFeedback queryFeedback = this.c;
        object = new hb2_2(db2_12, queryFeedback, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (hb2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hb2_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = this.b;
            Object object2 = ((db2_1)object).a;
            Object object3 = ((db2_1)object).c().getUserId();
            Intrinsics.checkNotNullExpressionValue(object3, "getUserId(...)");
            String string2 = ServiceUtil.getToken(((db2_1)object).c());
            object2.getClass();
            Object object4 = this.c;
            Intrinsics.checkNotNullParameter(object4, "queryFeedback");
            Intrinsics.checkNotNullParameter(object3, "userId");
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            HashMap<String, Object> hashMap = UrlHelper.Companion.getInstance();
            Object object5 = new Object[]{};
            String string3 = "feedback_url";
            hashMap = ((UrlHelper)((Object)hashMap)).getApiUrl("order", string3, (Object[])object5);
            ref$ObjectRef.element = hashMap;
            object5 = new StringBuilder();
            ((StringBuilder)object5).append(hashMap);
            ((StringBuilder)object5).append("?fields=");
            hashMap = ((ux2_1)object2).d;
            ((StringBuilder)object5).append((String)((Object)hashMap));
            ((StringBuilder)object5).append("&");
            hashMap = ((ux2_1)object2).e;
            ((StringBuilder)object5).append((String)((Object)hashMap));
            hashMap = ((StringBuilder)object5).toString();
            ref$ObjectRef.element = hashMap;
            hashMap = new HashMap<String, Object>();
            object5 = ((QueryFeedback)object4).getRating();
            hashMap.put("rating", object5);
            hashMap.put("channel", "APP");
            String string4 = ((QueryFeedback)object4).getOrderID();
            hashMap.put("orderId", string4);
            hashMap.put("loginId", object3);
            object4 = ((QueryFeedback)object4).getComments();
            hashMap.put("comments", object4);
            object5 = null;
            object4 = object3;
            object3 = new rx2_2((ux2_1)object2, ref$ObjectRef, string2, hashMap, null);
            object4 = new br2_2((Function2)object3);
            object3 = ir0_2.a;
            object3 = em0_2.b;
            object3 = ms0_1.m((es0_2)object4, (CoroutineContext)object3);
            object4 = new qx2_2((es0_2)object3);
            object3 = ir0_2.a;
            object3 = ms0_1.m((es0_2)object4, (CoroutineContext)object3);
            object4 = new hb2$a((db2_1)object, null);
            object2 = new at0_1((es0_2)object3, (gx0_2)object4);
            object3 = new hb2$b((db2_1)object);
            this.a = n4;
            object = ((at0_1)object2).collect((fs0_2)object3, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}


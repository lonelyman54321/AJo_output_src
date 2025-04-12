/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.query.QueryIntitateRequestReturn;
import com.ril.ajio.services.utils.JsonUtils;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from fb2
 */
public final class fb2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ db2_1 b;
    public final /* synthetic */ QueryIntitateRequestReturn c;
    public final /* synthetic */ String d;

    public fb2_2(db2_1 db2_12, QueryIntitateRequestReturn queryIntitateRequestReturn, String string2, f80_0 f80_02) {
        this.b = db2_12;
        this.c = queryIntitateRequestReturn;
        this.d = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        QueryIntitateRequestReturn queryIntitateRequestReturn = this.c;
        String string2 = this.d;
        db2_1 db2_12 = this.b;
        object = new fb2_2(db2_12, queryIntitateRequestReturn, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (fb2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fb2_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        nx2_1 nx2_12;
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
        Object object2 = ((db2_1)object).a;
        String string2 = ((db2_1)object).c().getUserId();
        Intrinsics.checkNotNullExpressionValue(string2, "getUserId(...)");
        String string3 = ServiceUtil.getToken(((db2_1)object).c());
        object2.getClass();
        Object object3 = this.c;
        Intrinsics.checkNotNullParameter(object3, "queryIntitateRequestReturn");
        Intrinsics.checkNotNullParameter(string2, "userId");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        HashMap<String, String> hashMap = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        String string4 = "initiate_return_update";
        String string5 = ((UrlHelper)((Object)hashMap)).getApiUrl("order", string4, objectArray);
        ref$ObjectRef.element = string5;
        hashMap = new HashMap<String, String>();
        ((StringBuilder)((Object)hashMap)).append((Object)string5);
        ((StringBuilder)((Object)hashMap)).append("?fields=");
        String string6 = ((ux2_1)object2).d;
        ((StringBuilder)((Object)hashMap)).append(string6);
        ((StringBuilder)((Object)hashMap)).append("&");
        String string7 = ((ux2_1)object2).e;
        ((StringBuilder)((Object)hashMap)).append(string7);
        String string8 = ((StringBuilder)((Object)hashMap)).toString();
        ref$ObjectRef.element = string8;
        hashMap = new HashMap<String, String>();
        String string9 = JsonUtils.toJson(object3);
        hashMap.put("returnObject", string9);
        String string10 = this.d;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string10);
        if (!bl2) {
            Intrinsics.checkNotNull(string10);
            String string11 = "adId";
            hashMap.put(string11, string10);
        }
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        String string12 = JsonUtils.toJson(object3);
        firebaseCrashlytics.log(string12);
        FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
        object3 = ((QueryIntitateRequestReturn)object3).getOrderCode();
        object3 = kp1_0.c("INITIATE_RETURN_UPDATE - ", (String)object3);
        Exception exception = new Exception((String)object3);
        firebaseCrashlytics2.recordException(exception);
        string4 = null;
        nx2_1 nx2_13 = nx2_12;
        object3 = ref$ObjectRef;
        HashMap<String, String> hashMap2 = hashMap;
        hashMap = null;
        nx2_12 = new nx2_1((ux2_1)object2, (Ref$ObjectRef)object3, string3, hashMap2, null);
        br2_2 br2_22 = new br2_2(nx2_12);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        es0_2 es0_22 = ms0_1.m(br2_22, (CoroutineContext)object2);
        object2 = new mx2_1(es0_22);
        wm0_2 wm0_22 = ir0_2.a;
        es0_2 es0_23 = ms0_1.m((es0_2)object2, wm0_22);
        object2 = new fb2$a((db2_1)object, null);
        object3 = new at0_1(es0_23, (gx0_2)object2);
        fb2$b fb2$b = new fb2$b((db2_1)object);
        this.a = n3;
        object = ((at0_1)object3).collect(fb2$b, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}


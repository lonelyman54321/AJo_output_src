/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from ux2
 */
public final class ux2_1 {
    public final wx2_1 a;
    public final String b;
    public final Ko c;
    public final String d;
    public final String e;
    public final UserInformation f;

    public ux2_1(xx2_2 object) {
        Ko ko;
        Intrinsics.checkNotNullParameter(object, "postOrderRepo");
        this.a = object;
        this.b = object = em_1.a(AJIOApplication.Companion);
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        this.c = ko = new Ko((Context)aJIOApplication);
        this.d = "FULL";
        this.e = object = "client_type=Android&client_version=".concat((String)object);
        this.f = object = UserInformation.getInstance((Context)AJIOApplication$a.a());
    }

    public final es0_2 a(int n3, String object) {
        Intrinsics.checkNotNullParameter(object, "userId");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        UrlHelper urlHelper = UrlHelper.Companion.getInstance();
        Object object2 = n3;
        Object[] objectArray = new Object[]{object, object2};
        ref$ObjectRef.element = object2 = urlHelper.getApiUrl("order", "old_orders_list", objectArray);
        object2 = new dx2_2(this, ref$ObjectRef, null);
        object = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object2 = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object = new cx2_0((es0_2)object2);
        object2 = ir0_2.a;
        return ms0_1.m((es0_2)object, (CoroutineContext)object2);
    }
}


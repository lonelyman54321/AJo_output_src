/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Qf2
 */
public final class qf2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ tf2_2 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;

    public qf2_2(tf2_2 tf2_22, int n3, String string2, boolean bl2, f80_0 f80_02) {
        this.b = tf2_22;
        this.c = false;
        this.d = n3;
        this.e = string2;
        this.f = bl2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3 = this.d;
        String string2 = this.e;
        tf2_2 tf2_22 = this.b;
        boolean bl2 = this.f;
        object = new qf2_2(tf2_22, n3, string2, bl2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (qf2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((qf2_2)object).invokeSuspend(object2);
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
        Object object2 = ((tf2_2)object).a;
        Object object3 = ((UserInformation)((tf2_2)object).c.getValue()).getUserId();
        Intrinsics.checkNotNullExpressionValue(object3, "getUserId(...)");
        object2.getClass();
        Intrinsics.checkNotNullParameter(object3, "userId");
        Object object4 = new Ref$ObjectRef();
        Object object5 = UrlHelper.Companion.getInstance();
        boolean bl2 = this.c;
        Object object6 = bl2;
        int n7 = this.d;
        Integer n8 = n7;
        int n10 = 3;
        Object[] objectArray = new Object[n10];
        objectArray[0] = object3;
        objectArray[n3] = object6;
        int n14 = 2;
        objectArray[n14] = n8;
        object6 = "orders_list";
        ((Ref$ObjectRef)object4).element = object3 = ((UrlHelper)object5).getApiUrl("order", (String)object6, objectArray);
        object5 = this.e;
        if (object5 != null) {
            object6 = "&dateRange=";
            ((Ref$ObjectRef)object4).element = object3 = nb0_0.a((String)object3, (String)object6, (String)object5);
        }
        boolean bl3 = this.f;
        bl2 = false;
        object6 = null;
        object3 = new hx2_1((ux2_1)object2, (Ref$ObjectRef)object4, bl3, null);
        object2 = new br2_2((Function2)object3);
        object3 = ir0_2.a;
        object3 = em0_2.b;
        object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
        object3 = new gx2_1((es0_2)object2);
        object2 = ir0_2.a;
        object2 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
        object3 = new Qf2$a((tf2_2)object, null);
        object4 = new at0_1((es0_2)object2, (gx0_2)object3);
        object2 = new Qf2$b((tf2_2)object);
        this.a = n3;
        object = ((at0_1)object4).collect((fs0_2)object2, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}


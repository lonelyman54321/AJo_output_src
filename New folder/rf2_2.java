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
import kotlin.text.b;

/*
 * Renamed from Rf2
 */
public final class rf2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ tf2_2 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    public rf2_2(tf2_2 tf2_22, String string2, boolean bl2, boolean bl3, f80_0 f80_02) {
        this.b = tf2_22;
        this.c = false;
        this.d = 0;
        this.e = string2;
        this.f = bl2;
        this.g = bl3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.e;
        boolean bl2 = this.f;
        tf2_2 tf2_22 = this.b;
        boolean bl3 = this.g;
        object = new rf2_2(tf2_22, string2, bl2, bl3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (rf2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rf2_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2 = null;
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
        Object object3 = ((tf2_2)object).a;
        Object object4 = ((UserInformation)((tf2_2)object).c.getValue()).getUserId();
        Intrinsics.checkNotNullExpressionValue(object4, "getUserId(...)");
        object3.getClass();
        Intrinsics.checkNotNullParameter(object4, "userId");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object5 = UrlHelper.Companion.getInstance();
        boolean bl2 = this.c;
        Object object6 = bl2;
        int n7 = this.d;
        Integer n8 = n7;
        int n10 = 3;
        Object[] objectArray = new Object[n10];
        objectArray[0] = object4;
        objectArray[n3] = object6;
        int n14 = 2;
        objectArray[n14] = n8;
        object6 = "orders_list";
        ref$ObjectRef.element = object4 = ((UrlHelper)object5).getApiUrl("order", (String)object6, objectArray);
        boolean bl3 = this.g;
        if (bl3) {
            object5 = "pageSize=10";
            object6 = "pageSize=100";
            ref$ObjectRef.element = object2 = kotlin.text.b.n((String)object4, (String)object5, (String)object6, false);
        }
        if ((object2 = this.e) != null) {
            object4 = ref$ObjectRef.element;
            object5 = new StringBuilder();
            ((StringBuilder)object5).append(object4);
            object4 = "&dateRange=";
            ((StringBuilder)object5).append((String)object4);
            ((StringBuilder)object5).append((String)object2);
            ref$ObjectRef.element = object2 = ((StringBuilder)object5).toString();
        }
        boolean bl4 = this.f;
        bl3 = false;
        object5 = null;
        object2 = new jx2_2((ux2_1)object3, ref$ObjectRef, bl4, null);
        object3 = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object2 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
        object3 = new ix2_2((es0_2)object2);
        object2 = ir0_2.a;
        object2 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
        object3 = new Rf2$a((tf2_2)object, null);
        object4 = new at0_1((es0_2)object2, (gx0_2)object3);
        object2 = new Rf2$b((tf2_2)object);
        this.a = n3;
        object = ((at0_1)object4).collect((fs0_2)object2, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}


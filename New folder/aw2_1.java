/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AW2
 */
public final class aw2_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ yw2_0 b;
    public final /* synthetic */ String c;

    public aw2_1(f80_0 f80_02, yw2_0 yw2_02, String string2) {
        this.b = yw2_02;
        this.c = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yw2_0 yw2_02 = this.b;
        String string2 = this.c;
        object = new aw2_1(f80_02, yw2_02, string2);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (aw2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((aw2_1)object).invokeSuspend(object2);
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
            Object object2 = ((yw2_0)object).a;
            object2.getClass();
            Object object3 = this.c;
            Intrinsics.checkNotNullParameter(object3, "storeId");
            Intrinsics.checkNotNullParameter("search screen", "screenName");
            lr2_2.Companion.getClass();
            Object object4 = UrlHelper.Companion.getInstance();
            Object[] objectArray = new Object[]{};
            String string2 = "sis_store_cms_meta_data";
            object4 = ((UrlHelper)object4).getApiUrl("homepage", string2, objectArray);
            cw2_2 cw2_22 = new cw2_2((dw2_0)object2, (String)object4, (String)object3, null);
            object2 = new br2_2(cw2_22);
            object3 = ir0_2.a;
            object3 = em0_2.b;
            object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
            object3 = new bw2_0((es0_2)object2);
            object2 = bg1_1.a;
            object2 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
            object3 = new AW2$a((yw2_0)object, null);
            object4 = new at0_1((es0_2)object2, (gx0_2)object3);
            object2 = new AW2$b((yw2_0)object);
            this.a = n4;
            object = ((at0_1)object4).collect((fs0_2)object2, this);
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


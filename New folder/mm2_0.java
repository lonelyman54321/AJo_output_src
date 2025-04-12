/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MM2
 */
public final class mm2_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ NM2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ cr1$c_0 d;

    public mm2_0(NM2 nM2, String string2, cr1$c_0 cr1$c_0, f80_0 f80_02) {
        this.b = nM2;
        this.c = string2;
        this.d = cr1$c_0;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        cr1$c_0 cr1$c_0 = this.d;
        NM2 nM2 = this.b;
        object = new mm2_0(nM2, string2, cr1$c_0, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (mm2_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((mm2_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            Object object2;
            vl2_2.b(object);
            object = this.b;
            Object object3 = ((NM2)object).a;
            String string2 = ServiceUtil.getToken((UserInformation)((NM2)object).l.getValue());
            object3.getClass();
            String string3 = this.c;
            Intrinsics.checkNotNullParameter(string3, "url");
            cr1$c_0 cr1$c_0 = this.d;
            Intrinsics.checkNotNullParameter(cr1$c_0, "progressRequestBody");
            Object object4 = object2;
            object2 = new tx2_2((ux2_1)object3, string3, string2, cr1$c_0, null);
            object4 = new br2_2((Function2)object2);
            object2 = ir0_2.a;
            object2 = em0_2.b;
            object2 = ms0_1.m((es0_2)object4, (CoroutineContext)object2);
            object4 = new sx2_2((es0_2)object2);
            object2 = ir0_2.a;
            object2 = ms0_1.m((es0_2)object4, (CoroutineContext)object2);
            object4 = new MM2$a((NM2)object, null);
            object3 = new at0_1((es0_2)object2, (gx0_2)object4);
            object2 = new MM2$b((NM2)object);
            this.a = n4;
            object = ((at0_1)object3).collect((fs0_2)object2, this);
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


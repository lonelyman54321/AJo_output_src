/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from GX1
 */
public final class gx1_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ wx1_1 b;

    public gx1_0(wx1_1 wx1_12, f80_0 f80_02) {
        this.b = wx1_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wx1_1 wx1_12 = this.b;
        object = new gx1_0(wx1_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (gx1_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((gx1_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        int n3 = 1;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n4 = this.a;
        if (n4 == 0) {
            Object object2;
            vl2_2.b(object);
            object = g6.a;
            Intrinsics.checkNotNullParameter("bag screen", "screenName");
            object = new Ref$ObjectRef();
            Object object3 = UrlHelper.Companion.getInstance();
            Object object4 = new Object[n3];
            object4[0] = object2 = ap_0.c;
            ((Ref$ObjectRef)object).element = object3 = ((UrlHelper)object3).getApiUrl("ajio_cash", "earn_point", (Object[])object4);
            ((Ref$ObjectRef)object).element = object3 = ww0_2.d((String)object3);
            object3 = new f6_0((Ref$ObjectRef)object, null);
            object = new br2_2((Function2)object3);
            object3 = ir0_2.a;
            object3 = em0_2.b;
            object = ms0_1.m((es0_2)object, (CoroutineContext)object3);
            object3 = new e6((es0_2)object);
            object = ir0_2.a;
            object3 = ms0_1.m((es0_2)object3, (CoroutineContext)object);
            wx1_1 wx1_12 = this.b;
            object2 = new GX1$c((es0_2)object3, wx1_12);
            object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
            object3 = new GX1$a(wx1_12, null);
            object4 = new at0_1((es0_2)object, (gx0_2)object3);
            object = new GX1$b(wx1_12);
            this.a = n3;
            object = ((at0_1)object4).collect((fs0_2)object, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n4 == n3) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}


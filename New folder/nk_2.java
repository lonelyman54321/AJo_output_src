/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.orderhistory.CancelReturnRequest;
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from NK
 */
public final class nk_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ok_2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public nk_2(ok_2 ok_22, String string2, String string3, f80_0 f80_02) {
        this.b = ok_22;
        this.c = string2;
        this.d = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        String string3 = this.d;
        ok_2 ok_22 = this.b;
        object = new nk_2(ok_22, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (nk_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((nk_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        int n3 = 1;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n4 = this.a;
        if (n4 == 0) {
            vl2_2.b(object);
            object = this.b;
            Object object2 = ((ok_2)object).b;
            object2.getClass();
            Object object3 = this.c;
            Intrinsics.checkNotNullParameter(object3, "returnId");
            Object object4 = this.d;
            Intrinsics.checkNotNullParameter(object4, "returnCancelRequestPage");
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Object object5 = UrlHelper.Companion.getInstance();
            CharSequence charSequence = ((mk_2)object2).d.getUserId();
            Object[] objectArray = new Object[n3];
            objectArray[0] = charSequence;
            String string2 = "return_cancel_request";
            ref$ObjectRef.element = object5 = ((UrlHelper)object5).getApiUrl("order", string2, objectArray);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(object5);
            ((StringBuilder)charSequence).append("?fields=");
            object5 = ((mk_2)object2).b;
            ((StringBuilder)charSequence).append((String)object5);
            ((StringBuilder)charSequence).append("&");
            object5 = ((mk_2)object2).c;
            ((StringBuilder)charSequence).append((String)object5);
            ref$ObjectRef.element = object5 = ((StringBuilder)charSequence).toString();
            object5 = new CancelReturnRequest((String)object3, (String)object4);
            object3 = new lk_2((mk_2)object2, ref$ObjectRef, (CancelReturnRequest)object5, null);
            object2 = new br2_2((Function2)object3);
            object3 = ir0_2.a;
            object3 = em0_2.b;
            object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
            object3 = new kk_2((es0_2)object2);
            object2 = ir0_2.a;
            object2 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
            object3 = new NK$a((ok_2)object, null);
            object4 = new at0_1((es0_2)object2, (gx0_2)object3);
            object2 = new NK$b((ok_2)object);
            this.a = n3;
            object = ((at0_1)object4).collect((fs0_2)object2, this);
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


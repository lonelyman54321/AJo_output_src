/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.RTORequestData;
import com.ril.ajio.services.data.Order.RtoData;
import com.ril.ajio.services.data.Order.RtoResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class LQ2$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ lq2_0 b;
    public final /* synthetic */ String c;

    public LQ2$a(lq2_0 lq2_02, String string2, f80_0 f80_02) {
        this.b = lq2_02;
        this.c = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        lq2_0 lq2_02 = this.b;
        String string2 = this.c;
        object = new LQ2$a(lq2_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (LQ2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((LQ2$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        lq2_0 lq2_02 = this.b;
        Object object2 = lq2_02.d;
        object2 = object2 != null && (object2 = ((RtoResponseData)object2).getRtoData()) != null ? ((RtoData)object2).getReturnId() : null;
        object2 = String.valueOf(object2);
        String string2 = String.valueOf(this.c);
        object = new RTORequestData((String)object2, string2);
        this.a = n4;
        object = lq2_0.b(lq2_02, (RTORequestData)object, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from tU
 */
public final class tu_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ HttpTransaction b;

    public tu_0(HttpTransaction httpTransaction, f80_0 f80_02) {
        this.b = httpTransaction;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        HttpTransaction httpTransaction = this.b;
        object = new tu_0(httpTransaction, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (tu_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((tu_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
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
        object = bf0_0.a;
        if (object != null) {
            this.a = n4;
            HttpTransaction httpTransaction = this.b;
            if ((object = ((lb1_0)object).c(httpTransaction, this)) != j90_02) return Unit.a;
            return j90_02;
        }
        String string2 = "You can't access the transaction repository if you don't initialize it!".toString();
        object = new IllegalStateException(string2);
        throw object;
    }
}


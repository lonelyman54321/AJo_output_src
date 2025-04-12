/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.NewPDPRepo;
import com.ril.ajio.services.query.QueryCodWithProductCode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class e12$a$a$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ e12_0 b;
    public final /* synthetic */ QueryCodWithProductCode c;

    public e12$a$a$b(e12_0 e12_02, QueryCodWithProductCode queryCodWithProductCode, f80_0 f80_02) {
        this.b = e12_02;
        this.c = queryCodWithProductCode;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        e12_0 e12_02 = this.b;
        QueryCodWithProductCode queryCodWithProductCode = this.c;
        object = new e12$a$a$b(e12_02, queryCodWithProductCode, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (e12$a$a$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((e12$a$a$b)object).invokeSuspend(object2);
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
            object = this.b.f;
            this.a = n4;
            QueryCodWithProductCode queryCodWithProductCode = this.c;
            object = ((NewPDPRepo)object).getProductEddNew(queryCodWithProductCode, this);
            if (object != j90_02) return object;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return object;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}


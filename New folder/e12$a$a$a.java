/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.ril.ajio.data.repo.NewPDPRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class e12$a$a$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ e12_0 b;
    public final /* synthetic */ Ref$ObjectRef c;

    public e12$a$a$a(e12_0 e12_02, Ref$ObjectRef ref$ObjectRef, f80_0 f80_02) {
        this.b = e12_02;
        this.c = ref$ObjectRef;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        e12_0 e12_02 = this.b;
        Ref$ObjectRef ref$ObjectRef = this.c;
        object = new e12$a$a$a(e12_02, ref$ObjectRef, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (e12$a$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((e12$a$a$a)object).invokeSuspend(object2);
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
            JsonObject jsonObject = (JsonObject)this.c.element;
            this.a = n4;
            object = ((NewPDPRepo)object).getPdpFraudEngine(jsonObject, this);
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


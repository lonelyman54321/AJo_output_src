/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.LoginRepository;
import com.ril.ajio.services.data.Login.QueryResetPassword;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from VA1
 */
public final class va1_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ oa1_1 b;
    public final /* synthetic */ QueryResetPassword c;

    public va1_2(oa1_1 oa1_12, QueryResetPassword queryResetPassword, f80_0 f80_02) {
        this.b = oa1_12;
        this.c = queryResetPassword;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        oa1_1 oa1_12 = this.b;
        QueryResetPassword queryResetPassword = this.c;
        object = new va1_2(oa1_12, queryResetPassword, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (va1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((va1_2)object).invokeSuspend(object2);
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
            Object object2 = ((oa1_1)object).a;
            Object object3 = this.c;
            object2 = ((LoginRepository)object2).resetPasswordWithToken((QueryResetPassword)object3);
            object3 = new VA1$a((oa1_1)object);
            this.a = n4;
            object = object2.collect((fs0_2)object3, this);
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


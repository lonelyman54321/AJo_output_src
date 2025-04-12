/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

public final class yh0$a$a
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ yh0_0 c;

    public yh0$a$a(yh0_0 yh0_02, f80_0 f80_02) {
        this.c = yh0_02;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        yh0_0 yh0_02 = this.c;
        object = new yh0$a$a(yh0_02, (f80_0)object3);
        ((yh0$a$a)object).b = object2;
        object2 = Unit.a;
        return ((yh0$a$a)object).invokeSuspend(object2);
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
            Throwable throwable = this.b;
            object = this.c.d;
            ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
            String string2 = "UpadateReviewLikeCount";
            int n7 = 28;
            DataCallback dataCallback = ApiErrorRepo.handleApiException$default(apiErrorRepo, throwable, string2, false, null, null, n7, null);
            this.a = n4;
            object = ((i23_0)object).emit(dataCallback, this);
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


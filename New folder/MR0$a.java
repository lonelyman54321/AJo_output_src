/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

public final class MR0$a
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ dr0_0 c;

    public MR0$a(f80_0 f80_02, dr0_0 dr0_02) {
        this.c = dr0_02;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        dr0_0 dr0_02 = this.c;
        object = new MR0$a((f80_0)object3, dr0_02);
        ((MR0$a)object).b = object2;
        object2 = Unit.a;
        return ((MR0$a)object).invokeSuspend(object2);
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
            object = this.c.T;
            ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
            String string2 = "BackGround_StoreMetaData";
            boolean bl2 = true;
            String string3 = "Fleek Screen";
            String string4 = "Forward";
            DataCallback dataCallback = apiErrorRepo.handleApiException(throwable, string2, bl2, string3, string4);
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


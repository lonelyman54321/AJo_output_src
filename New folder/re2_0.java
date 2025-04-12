/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

/*
 * Renamed from rE2
 */
public final class re2_0
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ fs0_2 b;
    public /* synthetic */ Throwable c;

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        re2_0 re2_02 = new qg3_2(3, (f80_0)object3);
        re2_02.b = object;
        re2_02.c = object2;
        object = Unit.a;
        return re2_02.invokeSuspend(object);
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
            Throwable throwable = this.c;
            ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
            String string2 = "uploadReviewsImages";
            boolean bl2 = true;
            String string3 = "";
            String string4 = "Forward";
            DataCallback dataCallback = apiErrorRepo.handleApiException(throwable, string2, bl2, string3, string4);
            apiErrorRepo = null;
            this.b = null;
            this.a = n4;
            object = object.emit(dataCallback, this);
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


/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.CategoryNavigationRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pQ
 */
public final class pq_1
implements bx0_2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pq_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object apply(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (Throwable)object;
                Object object3 = object = this.b;
                object3 = (String)object;
                Intrinsics.checkNotNullParameter(object3, "$requestID");
                Intrinsics.checkNotNullParameter(object2, "throwable");
                return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, (Throwable)object2, (String)object3, false, null, null, 24, null);
            }
            case 0: 
        }
        return CategoryNavigationRepo.e((mq_2)((Function1)this.b), object);
    }
}


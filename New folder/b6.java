/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class b6
implements bx0_2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b6() {
        this.a = 0;
        this.b = "IMPS";
    }

    public /* synthetic */ b6(sn2_2 sn2_22) {
        this.a = 1;
        this.b = sn2_22;
    }

    public final Object apply(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                return (DataCallback)oj_0.a((Function1)this.b, "$tmp0", object, "p0", object);
            }
            case 0: 
        }
        Object object2 = object;
        object2 = (Throwable)object;
        Object object3 = object = this.b;
        object3 = (String)object;
        Intrinsics.checkNotNullParameter(object3, "$screenName");
        Intrinsics.checkNotNullParameter(object2, "throwable");
        return ApiErrorRepo.INSTANCE.handleApiException((Throwable)object2, "AJIOCashBonus", true, (String)object3, "Forward");
    }
}


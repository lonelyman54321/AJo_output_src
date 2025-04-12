/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.UserRepo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qq
 */
public final class qq_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qq_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                tf2_2 tf2_22 = (tf2_2)this.b;
                Intrinsics.checkNotNullParameter(tf2_22, "this$0");
                UserRepo userRepo = tf2_22.b;
                if (userRepo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userRepo");
                    n3 = 0;
                    userRepo = null;
                }
                return userRepo.getUserInformation();
            }
            case 0: 
        }
        return (pe1_0)((pq_0)this.b).n.getValue();
    }
}


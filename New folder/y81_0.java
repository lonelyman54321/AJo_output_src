/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.data.repo.StoreLPRepo;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from y81
 */
public final class y81_0
implements bx0_2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ y81_0(int n3, Function1 function1) {
        this.a = n3;
        this.b = function1;
    }

    public final Object apply(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                return StoreLPRepo.d((xf2_1)this.b, object);
            }
            case 0: 
        }
        return HomeRepo.V((x81_0)this.b, object);
    }
}


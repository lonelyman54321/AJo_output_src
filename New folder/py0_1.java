/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.GameZoneRepo;
import com.ril.ajio.data.repo.UserRepo;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from pY0
 */
public final class py0_1
implements bx0_2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ py0_1(int n3, Function1 function1) {
        this.a = n3;
        this.b = function1;
    }

    public final Object apply(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                return UserRepo.N((ah0_0)this.b, object);
            }
            case 0: 
        }
        return GameZoneRepo.b((oy0_1)this.b, object);
    }
}


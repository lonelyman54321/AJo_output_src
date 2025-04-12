/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.HomeRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from WQ0
 */
public final class wq0_1
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ wq0_1(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        object = (Throwable)object;
        switch (n3) {
            default: {
                return HomeRepo.a((Throwable)object);
            }
            case 0: 
        }
        return Unit.a;
    }
}


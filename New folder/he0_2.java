/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.HomeRepo;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.g;

/*
 * Renamed from hE0
 */
public final class he0_2
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ he0_2(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                ((Boolean)object).booleanValue();
                return Unit.a;
            }
            case 1: {
                return HomeRepo.i((Throwable)object);
            }
            case 0: 
        }
        object = (CoroutineContext$Element)object;
        n3 = object instanceof g;
        object = n3 != 0 ? (g)object : null;
        return object;
    }
}


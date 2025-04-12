/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.HomeRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from IT
 */
public final class it_0
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ it_0(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                return HomeRepo.c((Throwable)object);
            }
            case 0: 
        }
        object = (String)object;
        object = object == null ? Unit.a : Unit.a;
        return object;
    }
}


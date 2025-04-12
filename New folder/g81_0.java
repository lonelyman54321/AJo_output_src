/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.HomeRepo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from g81
 */
public final class g81_0
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ g81_0(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Function0)object;
                Intrinsics.checkNotNullParameter(object, "callback");
                return (Boolean)object.invoke() ^ true;
            }
            case 0: 
        }
        return HomeRepo.N((Throwable)object);
    }
}


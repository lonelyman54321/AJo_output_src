/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.services.data.fleek.seen_components.FleekSeenComponents;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AR0
 */
public final class ar0_0
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ar0_0(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                return HomeRepo.d((Throwable)object);
            }
            case 0: 
        }
        object = (FleekSeenComponents)object;
        Object object2 = dr0_0.Companion;
        object2 = "it";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((FleekSeenComponents)object).getId();
        if (object == null) {
            object = "";
        }
        return object;
    }
}


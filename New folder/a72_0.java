/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.UserRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from A72
 */
public final class a72_0
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a72_0(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                return UserRepo.P((dl2_2)object);
            }
            case 0: 
        }
        object = (x72$a)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        ((x72$a)object).h = false;
        ((x72$a)object).i = false;
        ((x72$a)object).f = true;
        return Unit.a;
    }
}


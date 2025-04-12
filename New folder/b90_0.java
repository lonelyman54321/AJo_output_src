/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.NewPlpRepo;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

/*
 * Renamed from B90
 */
public final class b90_0
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ b90_0(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                return NewPlpRepo.b((dl2_2)object);
            }
            case 1: {
                object = (ql1_2)object;
                Intrinsics.checkNotNullParameter(object, "$this$Json");
                n3 = 1;
                ((ql1_2)object).a = n3;
                ((ql1_2)object).d = n3;
                ((ql1_2)object).n = n3;
                ((ql1_2)object).o = n3;
                ((ql1_2)object).e = false;
                ((ql1_2)object).p = false;
                return Unit.a;
            }
            case 0: 
        }
        object = (CoroutineContext$Element)object;
        n3 = object instanceof c;
        object = n3 != 0 ? (c)object : null;
        return object;
    }
}


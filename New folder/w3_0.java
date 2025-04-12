/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.UserRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from W3
 */
public final class w3_0
implements o60_0,
bx0_2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w3_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public void accept(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Function1 function1 = (Function1)this.b;
                Intrinsics.checkNotNullParameter(function1, "$tmp0");
                function1.invoke(object);
                return;
            }
            case 0: 
        }
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        String string2 = (String)this.b;
        object = (Throwable)object;
        return UserRepo.r(string2, (Throwable)object);
    }
}


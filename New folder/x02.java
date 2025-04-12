/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.NewPDPRepo;
import com.ril.ajio.data.repo.RtbRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class x02
implements bx0_2,
o60_0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x02(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                String string2 = (String)this.b;
                object = (Throwable)object;
                return RtbRepo.b(string2, (Throwable)object);
            }
            case 0: 
        }
        return NewPDPRepo.r((w02)((Function1)this.b), object);
    }
}


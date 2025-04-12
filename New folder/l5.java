/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.c$a$a;
import com.ril.ajio.data.repo.ImpsRepo;
import kotlin.jvm.internal.Intrinsics;

public final class l5
implements bx0_2 {
    public final /* synthetic */ int a;

    public /* synthetic */ l5(int n3) {
        this.a = n3;
    }

    public final Object apply(Object object) {
        int n3 = this.a;
        object = (Throwable)object;
        switch (n3) {
            default: {
                return ImpsRepo.d((Throwable)object);
            }
            case 0: 
        }
        Intrinsics.checkNotNullParameter(object, "it");
        yn3_0.a.e((Throwable)object);
        object = new c$a$a();
        return object;
    }
}


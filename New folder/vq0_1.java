/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.e;
import androidx.media3.common.f$c;
import com.ril.ajio.data.repo.HomeRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VQ0
 */
public final class vq0_1
implements o60_0,
vv1$a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vq0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public void accept(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                HomeRepo.W((qa_1)((Function1)this.b), object);
                return;
            }
            case 0: 
        }
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public void invoke(Object object) {
        object = (f$c)object;
        e e2 = (e)this.b;
        object.K(e2);
    }
}


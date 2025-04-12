/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.WishListRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class aH2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aH2(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                String string2 = (String)this.c;
                object = (dl2_2)object;
                return WishListRepo.i((WishListRepo)this.b, string2, (dl2_2)object);
            }
            case 0: 
        }
        object = (Throwable)object;
        zr1_1 zr1_12 = (zr1_1)this.b;
        Intrinsics.checkNotNullParameter(zr1_12, "$referralImageMLD");
        Object object2 = (jH2)this.c;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "it");
        object2.getClass();
        object2 = jH2.d("referral_banner", (Throwable)object, true);
        zr1_12.i(object2);
        return g53_0.c((Throwable)object);
    }
}


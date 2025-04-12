/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.E$b;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rl3
 */
public final class rl3_0
implements vv1$a,
bx0_2 {
    public static sl3_0 a(sl3_0 object, sl3_0 object2) {
        boolean bl2;
        boolean bl3 = object2 instanceof be_2;
        if (bl3 && (bl2 = object instanceof be_2)) {
            sl3_0 sl3_02 = object2;
            sl3_02 = (be_2)object2;
            object2 = (be_2)object2;
            rl3$a rl3$a = new rl3$a((sl3_0)object);
            float f5 = ((be_2)object2).b;
            boolean bl4 = Float.isNaN(f5);
            if (bl4) {
                object = (Number)rl3$a.invoke();
                f5 = ((Number)object).floatValue();
            }
            object2 = ((be_2)sl3_02).a;
            be_2 be_22 = new be_2((Z03)object2, f5);
            object = be_22;
        } else if (bl3 && !(bl2 = object instanceof be_2)) {
            object = object2;
        } else if (bl3 || !(bl3 = object instanceof be_2)) {
            rl3$b rl3$b = new rl3$b((sl3_0)object);
            object = object2.b(rl3$b);
        }
        return object;
    }

    public static pD3 b(rd3_0 rd3_02, E$b e$b, Wd0 wd0, Class clazz, String string2) {
        pD3 pD32 = new pD3(rd3_02, e$b, wd0);
        Intrinsics.checkNotNullParameter(clazz, string2);
        return pD32;
    }

    public Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        String string2 = "PAYMENT_PayNowByCOD";
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(object2, "t");
        return ApiErrorRepo.INSTANCE.handleApiException((Throwable)object2, string2, true, "single page checkout", "Forward");
    }

    public void invoke(Object object) {
        ((oe)object).getClass();
    }
}


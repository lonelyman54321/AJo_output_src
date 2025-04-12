/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CouponListRepo;

/*
 * Renamed from uc0
 */
public final class uc0_0
implements bx0_2 {
    public static String a(String string2, String string3, String string4, String string5, String string6) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        stringBuilder.append(string5);
        stringBuilder.append(string6);
        return stringBuilder.toString();
    }

    public Object apply(Object object) {
        return CouponListRepo.c((Throwable)object);
    }
}


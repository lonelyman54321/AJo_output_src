/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.internal.ads.zzfk;
import com.ril.ajio.data.repo.NewPlpRepo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from w12
 */
public final class w12_0
implements bx0_2 {
    public static void a(int n3, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(n3);
        String string4 = stringBuilder.toString();
        zzfk.zzf(string3, string4);
    }

    public static void b(int n3, String string2, StringBuilder stringBuilder) {
        stringBuilder.append(n3);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), string2);
    }

    public Object apply(Object object) {
        return NewPlpRepo.h((Throwable)object);
    }
}


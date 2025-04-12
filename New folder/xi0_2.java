/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;

/*
 * Renamed from xI0
 */
public final class xi0_2
implements kJ0$a {
    public static void a(Boolean bl2, String string2, String string3, String string4, StringBuilder stringBuilder) {
        stringBuilder.append(bl2);
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
    }

    public void b(boolean bl2) {
        block0: {
            if (!bl2) break block0;
            FacebookSdk.p = bl2 = true;
        }
    }
}


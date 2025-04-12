/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.HashSet;

/*
 * Renamed from ko
 */
public final class ko_0
implements kJ0$a {
    public static String a(StringBuilder stringBuilder, String string2, String string3, String string4, String string5) {
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        stringBuilder.append(string5);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(boolean bl2) {
        Throwable throwable2;
        Class<oz2_0> clazz;
        block4: {
            if (!bl2) return;
            clazz = oz2_0.a;
            clazz = oz2_0.class;
            boolean bl3 = td0.b(clazz);
            if (bl3) {
                return;
            }
            try {
                Object object = oz2_0.a;
                ((oz2_0)object).a();
                object = oz2_0.c;
                bl3 = ((HashSet)object).isEmpty();
                if (bl3 && (bl3 = ((HashMap)(object = oz2_0.d)).isEmpty())) {
                    bl3 = false;
                    object = null;
                    oz2_0.b = false;
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            oz2_0.b = bl3 = true;
            return;
        }
        td0.a(clazz, throwable2);
    }
}


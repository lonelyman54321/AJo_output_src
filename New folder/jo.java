/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.internal.clearcut.zzbn;
import java.util.HashMap;

public final class jo
implements kJ0$a {
    public static int a(int n3, int n4, int n7, int n8) {
        return zzbn.zzt(n3) + n4 + n7 + n8;
    }

    public void b(boolean bl2) {
        block7: {
            if (bl2) {
                Class<lg2_0> clazz = lg2_0.a;
                clazz = lg2_0.class;
                boolean bl3 = td0.b(clazz);
                if (!bl3) {
                    Object object = lg2_0.a;
                    ((lg2_0)object).a();
                    object = lg2_0.c;
                    bl3 = ((HashMap)object).isEmpty();
                    boolean bl4 = true;
                    if (!(bl3 ^= bl4)) break block7;
                    try {
                        lg2_0.b = bl4;
                    }
                    catch (Throwable throwable) {
                        td0.a(clazz, throwable);
                    }
                }
            }
        }
    }
}


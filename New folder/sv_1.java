/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.HashSet;

/*
 * Renamed from sv
 */
public final class sv_1 {
    public static final sv_1 a;
    public static boolean b;
    public static HashSet c;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        c = hashSet = new HashSet();
    }

    public static final void a(Bundle bundle) {
        Throwable throwable2;
        Class<sv_1> clazz;
        block11: {
            block10: {
                clazz = sv_1.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return;
                }
                bl2 = b;
                if (!bl2 || bundle == null) break block10;
                Object object = c;
                try {
                    object = object.iterator();
                }
                catch (Throwable throwable2) {
                    break block11;
                }
                while (true) {
                    boolean bl3 = object.hasNext();
                    if (!bl3) break block10;
                    break;
                }
                {
                    Object object2 = object.next();
                    object2 = (String)object2;
                    bundle.remove(object2);
                    continue;
                }
            }
            return;
        }
        td0.a(clazz, throwable2);
    }
}


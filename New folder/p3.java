/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.appevents.codeless.b;
import com.ril.ajio.data.repo.UserRepo;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class p3
implements kJ0$a,
bx0_2 {
    public static HashMap a(String string2, String string3) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(string2, string3);
        return hashMap;
    }

    public Object apply(Object object) {
        return UserRepo.t((Throwable)object);
    }

    public void b(boolean bl2) {
        Class<b> clazz = b.class;
        if (bl2) {
            Object object = b.a;
            bl2 = td0.b(clazz);
            if (!bl2) {
                object = b.f;
                boolean bl3 = true;
                try {
                    ((AtomicBoolean)object).set(bl3);
                }
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                }
            }
        } else {
            Object object = b.a;
            bl2 = td0.b(clazz);
            if (!bl2) {
                object = b.f;
                boolean bl4 = false;
                try {
                    ((AtomicBoolean)object).set(false);
                }
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                }
            }
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

public final class Cn3 {
    public final Sm0 a;
    public final ii3_0 b;
    public final long c;
    public final Object d;
    public final LinkedHashMap e;

    public Cn3(Sm0 linkedHashMap, ki3_2 ki3_22) {
        String string2 = "runnableScheduler";
        Intrinsics.checkNotNullParameter(linkedHashMap, string2);
        String string3 = "launcher";
        Intrinsics.checkNotNullParameter(ki3_22, string3);
        long l2 = TimeUnit.MINUTES.toMillis(90);
        Intrinsics.checkNotNullParameter(linkedHashMap, string2);
        Intrinsics.checkNotNullParameter(ki3_22, string3);
        this.a = linkedHashMap;
        this.b = ki3_22;
        this.c = l2;
        linkedHashMap = new LinkedHashMap();
        this.d = linkedHashMap;
        this.e = linkedHashMap = new LinkedHashMap();
    }

    public final void a(xb3_0 object) {
        Intrinsics.checkNotNullParameter(object, "token");
        Object object2 = this.d;
        synchronized (object2) {
            LinkedHashMap linkedHashMap = this.e;
            object = linkedHashMap.remove(object);
            object = (Runnable)object;
            if (object != null) {
                object2 = this.a;
                ((Sm0)object2).a((Runnable)object);
            }
            return;
        }
    }

    public final void b(xb3_0 object) {
        Intrinsics.checkNotNullParameter(object, "token");
        int n3 = 1;
        oz_1 oz_12 = new oz_1(n3, this, object);
        Object object2 = this.d;
        synchronized (object2) {
            LinkedHashMap linkedHashMap = this.e;
            object = linkedHashMap.put(object, oz_12);
            object = (Runnable)object;
            object = this.a;
            long l2 = this.c;
            ((Sm0)object).b(l2, oz_12);
            return;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public abstract class iA3 {
    public final Map a;

    public iA3(Map map2) {
        Intrinsics.checkNotNullParameter(map2, "keys");
        this.a = map2;
    }

    public abstract List a();

    public boolean b() {
        return this.c();
    }

    public final boolean c() {
        boolean bl2;
        Object object = this.a();
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        object = object.iterator();
        block0: while (true) {
            boolean bl3;
            bl2 = true;
            while (bl3 = object.hasNext()) {
                xs_0 xs_02 = (xs_0)object.next();
                bl3 = xs_02.a();
                if (bl3 && bl2) continue block0;
                bl2 = false;
            }
            break;
        }
        return bl2;
    }
}


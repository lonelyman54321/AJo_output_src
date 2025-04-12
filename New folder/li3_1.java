/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lI3
 */
public abstract class li3_1 {
    public abstract qh3_2 a(List var1);

    public abstract J92 b(List var1);

    public final void c(y92 object) {
        Intrinsics.checkNotNullParameter(object, "request");
        object = a.b(object);
        this.b((List)object);
    }

    public final J92 d(String string2, DE0 dE0, y92 object) {
        Intrinsics.checkNotNullParameter(string2, "uniqueWorkName");
        Intrinsics.checkNotNullParameter((Object)dE0, "existingWorkPolicy");
        Intrinsics.checkNotNullParameter(object, "request");
        object = a.b(object);
        return this.e(string2, dE0, (List)object);
    }

    public abstract J92 e(String var1, DE0 var2, List var3);
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;

/*
 * Renamed from jO1
 */
public final class jo1_0
implements Y60 {
    public final jO1$a a;
    public final boolean b;

    public jo1_0(String string2, jO1$a jO1$a, boolean bl2) {
        this.a = jO1$a;
        this.b = bl2;
    }

    public final r60_0 a(yc1_1 object, QB1 object2, kw_1 kw_12) {
        object = ((yc1_1)((Object)object)).m.a;
        object2 = AC1.MergePathsApi19;
        boolean bl2 = ((HashSet)object).contains(object2);
        if (!bl2) {
            rx1.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        object = new ko1_0(this);
        return object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MergePaths{mode=");
        jO1$a jO1$a = this.a;
        stringBuilder.append((Object)jO1$a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from a41
 */
public final class a41_0 {
    public final String a;
    public final String b;
    public final boolean c;

    public a41_0(String string2, String string3) {
        String string4 = "name";
        Intrinsics.checkNotNullParameter(string2, string4);
        String string5 = "value";
        Intrinsics.checkNotNullParameter(string3, string5);
        Intrinsics.checkNotNullParameter(string2, string4);
        Intrinsics.checkNotNullParameter(string3, string5);
        this.a = string2;
        this.b = string3;
        this.c = false;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block3: {
            block2: {
                boolean bl3;
                boolean bl4 = object instanceof a41_0;
                if (!bl4) break block2;
                object = (a41_0)object;
                String string2 = ((a41_0)object).a;
                String string3 = this.a;
                bl2 = true;
                bl4 = kotlin.text.b.i(string2, string3, bl2);
                if (bl4 && (bl3 = kotlin.text.b.i((String)(object = ((a41_0)object).b), string2 = this.b, bl2))) break block3;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        Object object = Locale.ROOT;
        String string2 = this.a.toLowerCase((Locale)object);
        String string3 = "toLowerCase(...)";
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        int n3 = string2.hashCode();
        int n4 = n3 * 31;
        object = this.b.toLowerCase((Locale)object);
        Intrinsics.checkNotNullExpressionValue(object, string3);
        return ((String)object).hashCode() + n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HeaderValueParam(name=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", value=");
        string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append(", escapeValue=");
        boolean bl2 = this.c;
        return AR.a(stringBuilder, bl2, ')');
    }
}


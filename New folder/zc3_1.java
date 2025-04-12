/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zc3
 */
public final class zc3_1 {
    public final ib2_2 a;
    public final int b;
    public final String c;

    public zc3_1(ib2_2 ib2_22, int n3, String string2) {
        Intrinsics.checkNotNullParameter((Object)ib2_22, "protocol");
        Intrinsics.checkNotNullParameter(string2, "message");
        this.a = ib2_22;
        this.b = n3;
        this.c = string2;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder();
        Object object = this.a;
        ib2_2 ib2_22 = ib2_2.HTTP_1_0;
        if (object == ib2_22) {
            object = "HTTP/1.0";
            charSequence.append((String)object);
        } else {
            object = "HTTP/1.1";
            charSequence.append((String)object);
        }
        char c2 = ' ';
        charSequence.append(c2);
        int n3 = this.b;
        charSequence.append(n3);
        charSequence.append(c2);
        object = this.c;
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder().apply(builderAction).toString()");
        return charSequence;
    }
}


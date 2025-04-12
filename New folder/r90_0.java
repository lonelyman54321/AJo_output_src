/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from r90
 */
public final class r90_0 {
    public static final long a = s90.a(0.0f, 0.0f);
    public static final /* synthetic */ int b;

    public static final boolean a(long l2, long l3) {
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = object == false;
        return bl2;
    }

    public static final float b(long l2) {
        return Float.intBitsToFloat((int)(l2 >> 32));
    }

    public static final float c(long l2) {
        return Float.intBitsToFloat((int)(l2 & 0xFFFFFFFFL));
    }

    public static String d(long l2) {
        String string2;
        float f5 = r90_0.b(l2);
        float f6 = r90_0.c(l2);
        char c2 = ')';
        Object object = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (object == false) {
            String string3 = "CornerRadius.circular(";
            StringBuilder stringBuilder = new StringBuilder(string3);
            float f7 = r90_0.b(l2);
            string2 = jZ0.a(f7);
            stringBuilder.append(string2);
            stringBuilder.append(c2);
            string2 = stringBuilder.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder("CornerRadius.elliptical(");
            f6 = r90_0.b(l2);
            String string4 = jZ0.a(f6);
            stringBuilder.append(string4);
            string4 = ", ";
            stringBuilder.append(string4);
            float f8 = r90_0.c(l2);
            string2 = jZ0.a(f8);
            stringBuilder.append(string2);
            stringBuilder.append(c2);
            string2 = stringBuilder.toString();
        }
        return string2;
    }
}


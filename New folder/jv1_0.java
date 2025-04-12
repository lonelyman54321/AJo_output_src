/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from jv1
 */
public final class jv1_0 {
    public static String a(List list, String string2, jt3 jt32, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = ", ";
        }
        if ((n3 &= 0x20) != 0) {
            jt32 = null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string3 = "";
        stringBuilder.append((CharSequence)string3);
        int n7 = list.size();
        int n8 = 0;
        for (int i3 = 0; i3 < n7; ++i3) {
            Object object = list.get(i3);
            int n10 = 1;
            if ((n8 += n10) > n10) {
                stringBuilder.append((CharSequence)string2);
            }
            if (jt32 != null) {
                object = (CharSequence)jt32.invoke(object);
                stringBuilder.append((CharSequence)object);
                continue;
            }
            if (object != null) {
                n10 = object instanceof CharSequence;
            }
            if (n10 != 0) {
                object = (CharSequence)object;
                stringBuilder.append((CharSequence)object);
                continue;
            }
            n10 = object instanceof Character;
            if (n10 != 0) {
                object = (Character)object;
                char c2 = ((Character)object).charValue();
                stringBuilder.append(c2);
                continue;
            }
            object = String.valueOf(object);
            stringBuilder.append((CharSequence)object);
        }
        stringBuilder.append((CharSequence)string3);
        return stringBuilder.toString();
    }
}


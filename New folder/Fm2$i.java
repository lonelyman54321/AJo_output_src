/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.regex.Matcher;

public final class Fm2$i
extends fm2_2 {
    public final Method a;
    public final int b;
    public final String c;
    public final x80_0 d;
    public final boolean e;

    public Fm2$i(Method method, int n3, String string2, boolean bl2) {
        vE$d vE$d = vE$d.a;
        this.a = method;
        this.b = n3;
        Objects.requireNonNull(string2, "name == null");
        this.c = string2;
        this.d = vE$d;
        this.e = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(sj2_1 sj2_12, Object objectArray) {
        Object object;
        StringBuilder stringBuilder;
        String string2;
        String string3;
        Object object2;
        Object object3;
        Object object4;
        block12: {
            int n3;
            int n4;
            int n7;
            String string4;
            int n8;
            int n10;
            int n14;
            boolean bl2;
            int n15;
            int n16;
            block11: {
                int n17;
                Fm2$i fm2$i = this;
                object4 = sj2_12;
                Object[] objectArray2 = objectArray;
                object3 = null;
                object2 = this.c;
                if (objectArray == null) {
                    object4 = cP.a("Path parameter \"", (String)object2, "\" value must not be null.");
                    Object[] objectArray3 = new Object[]{};
                    object3 = this.a;
                    int n18 = this.b;
                    throw cz3_0.k((Method)object3, n18, (String)object4, objectArray3);
                }
                string3 = (String)this.d.convert(objectArray);
                string2 = sj2_12.c;
                if (string2 == null) {
                    object4 = new AssertionError();
                    throw object4;
                }
                n16 = string3.length();
                stringBuilder = null;
                for (n15 = 0; n15 < n16; n15 += n17) {
                    n17 = string3.codePointAt(n15);
                    bl2 = fm2$i.e;
                    n14 = 37;
                    n10 = 47;
                    n8 = -1;
                    string4 = " \"<>^`{}|\\?#";
                    n7 = 127;
                    n4 = 32;
                    if (n17 >= n4 && n17 < n7 && (n3 = string4.indexOf(n17)) == n8 && (bl2 || n17 != n10 && n17 != n14)) {
                        n17 = Character.charCount(n17);
                        continue;
                    }
                    object = new ce_2();
                    ((ce_2)object).G0(0, n15, string3);
                    object3 = null;
                    break block11;
                }
                object3 = string3;
                break block12;
            }
            while (n15 < n16) {
                n3 = string3.codePointAt(n15);
                if (!bl2 || n3 != (n14 = 9) && n3 != (n14 = 10) && n3 != (n14 = 12) && n3 != (n14 = 13)) {
                    if (n3 >= n4 && n3 < n7 && (n14 = string4.indexOf(n3)) == n8 && (bl2 || n3 != n10 && n3 != (n14 = 37))) {
                        ((ce_2)object).J0(n3);
                    } else {
                        if (object3 == null) {
                            object3 = new ce_2();
                        }
                        ((ce_2)object3).J0(n3);
                        while ((n14 = (int)(((ce_2)object3).g() ? 1 : 0)) == 0) {
                            n14 = ((ce_2)object3).readByte();
                            n10 = n14 & 0xFF;
                            ((ce_2)object).U(37);
                            char[] cArray = sj2_1.l;
                            n10 = n10 >> 4 & 0xF;
                            n10 = cArray[n10];
                            ((ce_2)object).U(n10);
                            n14 &= 0xF;
                            n14 = cArray[n14];
                            ((ce_2)object).U(n14);
                            n10 = 47;
                            n8 = -1;
                        }
                    }
                }
                n8 = 37;
                n14 = Character.charCount(n3);
                n15 += n14;
                n14 = 37;
                n10 = 47;
                n8 = -1;
            }
            object3 = ((ce_2)object).I();
        }
        string2 = ((sj2_1)object4).c;
        object = "{";
        stringBuilder = new StringBuilder((String)object);
        stringBuilder.append((String)object2);
        stringBuilder.append("}");
        object2 = stringBuilder.toString();
        object3 = string2.replace((CharSequence)object2, (CharSequence)object3);
        object2 = sj2_1.m.matcher((CharSequence)object3);
        boolean bl3 = ((Matcher)object2).matches();
        if (!bl3) {
            ((sj2_1)object4).c = object3;
            return;
        }
        String string5 = "@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string3);
        object4 = new IllegalArgumentException(string5);
        throw object4;
    }
}


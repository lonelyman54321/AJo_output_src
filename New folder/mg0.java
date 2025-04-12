/*
 * Decompiled with CFR 0.152.
 */
public final class mg0 {
    public String a;
    public int b;
    public int c;
    public float d;
    public String e;
    public boolean f;

    public static String a(int n3) {
        StringBuilder stringBuilder = new StringBuilder("00000000");
        String string2 = Integer.toHexString(n3);
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        stringBuilder = new StringBuilder("#");
        int n4 = string2.length() + -8;
        string2 = string2.substring(n4);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder();
        Object object = this.a;
        char c2 = ':';
        charSequence = ui0_1.a((StringBuilder)charSequence, (String)object, c2);
        int n3 = this.b;
        switch (n3) {
            default: {
                return Ft2.a((String)charSequence, "????");
            }
            case 905: {
                charSequence = Ex0.a((String)charSequence);
                float f5 = this.d;
                ((StringBuilder)charSequence).append(f5);
                return ((StringBuilder)charSequence).toString();
            }
            case 904: {
                charSequence = Ex0.a((String)charSequence);
                object = this.f;
                ((StringBuilder)charSequence).append(object);
                return ((StringBuilder)charSequence).toString();
            }
            case 903: {
                charSequence = Ex0.a((String)charSequence);
                object = this.e;
                ((StringBuilder)charSequence).append((String)object);
                return ((StringBuilder)charSequence).toString();
            }
            case 902: {
                charSequence = Ex0.a((String)charSequence);
                object = mg0.a(this.c);
                ((StringBuilder)charSequence).append((String)object);
                return ((StringBuilder)charSequence).toString();
            }
            case 901: {
                charSequence = Ex0.a((String)charSequence);
                float f6 = this.d;
                ((StringBuilder)charSequence).append(f6);
                return ((StringBuilder)charSequence).toString();
            }
            case 900: 
        }
        charSequence = Ex0.a((String)charSequence);
        n3 = this.c;
        ((StringBuilder)charSequence).append(n3);
        return ((StringBuilder)charSequence).toString();
    }
}


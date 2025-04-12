/*
 * Decompiled with CFR 0.152.
 */
public final class Gs3$d {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public Gs3$d(int n3, int n4) {
        this(-1 << -1, n3, n4);
    }

    public Gs3$d(int n3, int n4, int n7) {
        String string2;
        String string3 = "";
        int n8 = -1 << -1;
        if (n3 != n8) {
            String string4 = "/";
            string2 = UX.a(n3, string4);
        } else {
            string2 = string3;
        }
        this.a = string2;
        this.b = n4;
        this.c = n7;
        this.d = n8;
        this.e = string3;
    }

    public final void a() {
        int n3 = this.d;
        int n4 = -1 << -1;
        if (n3 == n4) {
            n3 = this.b;
        } else {
            n4 = this.c;
            n3 += n4;
        }
        this.d = n3;
        CharSequence charSequence = new StringBuilder();
        String string2 = this.a;
        charSequence.append(string2);
        n4 = this.d;
        charSequence.append(n4);
        charSequence = charSequence.toString();
        this.e = charSequence;
    }

    public final void b() {
        int n3 = this.d;
        int n4 = -1 << -1;
        if (n3 != n4) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("generateNewId() must be called before retrieving ids.");
        throw illegalStateException;
    }
}


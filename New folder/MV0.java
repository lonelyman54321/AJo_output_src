/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class MV0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;

    public MV0(int n3, String string2, String string3, String string4, String string5) {
        this.a = string2;
        this.b = string3;
        this.c = n3;
        this.d = string4;
        this.e = string5;
    }

    public final String a() {
        String string2 = this.e;
        boolean bl2 = kotlin.text.b.k(string2);
        String string3 = this.d;
        if (!bl2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string3);
            char c2 = '?';
            stringBuilder.append(c2);
            stringBuilder.append(string2);
            string3 = stringBuilder.toString();
        }
        return string3;
    }

    public final String b() {
        CharSequence charSequence = "https";
        String string2 = this.a;
        int n3 = Intrinsics.areEqual(string2, charSequence);
        String string3 = this.b;
        String string4 = "://";
        int n4 = this.c;
        if (n3 != 0 && n4 == (n3 = 443) || (n3 = (int)(Intrinsics.areEqual(string2, charSequence = "http") ? 1 : 0)) != 0 && n4 == (n3 = 80)) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(string4);
            ((StringBuilder)charSequence).append(string3);
            string2 = this.a();
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(string4);
            ((StringBuilder)charSequence).append(string3);
            char c2 = ':';
            ((StringBuilder)charSequence).append(c2);
            ((StringBuilder)charSequence).append(n4);
            string2 = this.a();
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }
}


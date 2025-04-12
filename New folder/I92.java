/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Reflection;

public abstract class I92 {
    public final int a;
    public final int b;

    public I92(int n3, int n4) {
        this.a = n3;
        this.b = n4;
    }

    public /* synthetic */ I92(int n3, int n4, int n7) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            n3 = 0;
        }
        if ((n7 &= 2) != 0) {
            n4 = 0;
        }
        this(n3, n4);
    }

    public abstract void a(R92.a var1, mp var2, q73 var3, F30$a var4);

    public String b(int n3) {
        StringBuilder stringBuilder = new StringBuilder("IntParameter(");
        stringBuilder.append(n3);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public String c(int n3) {
        StringBuilder stringBuilder = new StringBuilder("ObjectParameter(");
        stringBuilder.append(n3);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final String toString() {
        String string2 = Reflection.getOrCreateKotlinClass(this.getClass()).getSimpleName();
        if (string2 == null) {
            string2 = "";
        }
        return string2;
    }
}


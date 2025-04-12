/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;

/*
 * Renamed from dF3
 */
public final class df3_0 {
    public static boolean a(il0_0 il0_02) {
        Object object = new Xm2(8);
        Object object2 = df3$a_0.a(il0_02, (Xm2)object);
        int n3 = ((df3$a_0)object2).a;
        int n4 = 1380533830;
        if (n3 != n4 && n3 != (n4 = 1380333108)) {
            return false;
        }
        object2 = ((Xm2)object).a;
        n4 = 4;
        il0_02.b((byte[])object2, 0, n4, false);
        ((Xm2)object).I(0);
        int n7 = ((Xm2)object).i();
        int n8 = 1463899717;
        if (n7 != n8) {
            object = new StringBuilder("Unsupported form type: ");
            ((StringBuilder)object).append(n7);
            Cx.c(((StringBuilder)object).toString());
            return false;
        }
        return true;
    }

    public static df3$a_0 b(int n3, il0_0 il0_02, Xm2 xm2) {
        int n4;
        df3$a_0 df3$a_0 = df3$a_0.a(il0_02, xm2);
        while ((n4 = df3$a_0.a) != n3) {
            long l2;
            String string2 = "Ignoring unknown WAV chunk: ";
            CS1.a(n4, string2);
            long l3 = df3$a_0.b;
            long l4 = (long)8 + l3;
            long l7 = l3 % (long)2;
            long l8 = 0L;
            long l12 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
            if (l12 != false) {
                l4 = (long)9 + l3;
            }
            if ((l12 = (l2 = l4 - (l3 = Integer.MAX_VALUE)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) <= 0) {
                l12 = (int)l4;
                il0_02.j((int)l12);
                df3$a_0 = df3$a_0.a(il0_02, xm2);
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder("Chunk is too large (~2GB+) to skip; id: ");
            stringBuilder.append(n4);
            throw ParserException.b(stringBuilder.toString());
        }
        return df3$a_0;
    }
}


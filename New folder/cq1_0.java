/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from CQ1
 */
public final class cq1_0
implements vf3_0 {
    public final Xm2 a;

    public cq1_0() {
        Xm2 xm2;
        this.a = xm2 = new Xm2();
    }

    public final /* synthetic */ lf3_0 a(int n3, byte[] byArray, int n4) {
        return uf3_0.a(this, byArray, n4);
    }

    public final void b(byte[] byArray, int n3, int n4, Vf3$b vf3$b, n60_0 n60_02) {
        Object object;
        int n7 = n3;
        int n8 = 8;
        int n10 = n3 + n4;
        Xm2 xm2 = this.a;
        xm2.G(n10, byArray);
        xm2.I(n3);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        while ((n7 = xm2.a()) > 0) {
            n7 = xm2.a();
            n10 = 0;
            if (n7 >= n8) {
                n7 = 1;
            } else {
                n7 = 0;
                object = null;
            }
            String string2 = "Incomplete Mp4Webvtt Top Level box header found.";
            ct3.b(n7 != 0, string2);
            n7 = xm2.i();
            int n14 = xm2.i();
            int n15 = 1987343459;
            if (n14 == n15) {
                n7 -= n8;
                n14 = 0;
                string2 = null;
                n15 = 0;
                String string3 = null;
                Object object2 = null;
                while (n7 > 0) {
                    List list;
                    int n16;
                    if (n7 >= n8) {
                        n16 = 1;
                    } else {
                        n16 = 0;
                        list = null;
                    }
                    String string4 = "Incomplete vtt cue box header found.";
                    ct3.b(n16 != 0, string4);
                    n16 = xm2.i();
                    int n17 = xm2.i();
                    n7 += -8;
                    byte[] byArray2 = xm2.a;
                    int n18 = xm2.b;
                    Charset charset = StandardCharsets.UTF_8;
                    String string5 = new String(byArray2, n18, n16 -= n8, charset);
                    xm2.J(n16);
                    n7 -= n16;
                    n16 = 1937011815;
                    if (n17 == n16) {
                        object2 = new LF3$d();
                        LF3.e(string5, (LF3$d)object2);
                        object2 = ((LF3$d)object2).a();
                        continue;
                    }
                    n16 = 1885436268;
                    if (n17 != n16) continue;
                    string3 = string5.trim();
                    list = Collections.emptyList();
                    string3 = LF3.f(null, string3, list);
                }
                if (string3 == null) {
                    string3 = "";
                }
                if (object2 != null) {
                    ((Pe0$a)object2).a = string3;
                    object = ((Pe0$a)object2).a();
                } else {
                    object = LF3.a;
                    object = new LF3$d();
                    ((LF3$d)object).c = string3;
                    object = ((LF3$d)object).a().a();
                }
                arrayList.add(object);
                continue;
            }
            xm2.J(n7 -= n8);
        }
        object = new We0(arrayList, -9223372036854775807L, -9223372036854775807L);
        n60_02.accept(object);
    }

    public final int c() {
        return 2;
    }

    public final /* synthetic */ void reset() {
    }
}


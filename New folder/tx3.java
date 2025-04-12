/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import java.util.List;

public final class tx3 {
    public final List a;
    public final wp3[] b;

    public tx3(List wp3Array) {
        this.a = wp3Array;
        wp3Array = new wp3[wp3Array.size()];
        this.b = wp3Array;
    }

    public final void a(long l2, Xm2 xm2) {
        int n3;
        int n4 = xm2.a();
        if (n4 < (n3 = 9)) {
            return;
        }
        n4 = xm2.i();
        n3 = xm2.i();
        int n7 = xm2.w();
        int n8 = 434;
        if (n4 == n8 && n3 == (n4 = 1195456820) && n7 == (n4 = 3)) {
            wp3[] wp3Array = this.b;
            ir_0.b(l2, xm2, wp3Array);
        }
    }

    public final void b(gi0_0 gi0_02, Gs3$d gs3$d) {
        wp3[] wp3Array;
        int n3;
        for (int i3 = 0; i3 < (n3 = (wp3Array = this.b).length); ++i3) {
            int n4;
            gs3$d.a();
            gs3$d.b();
            n3 = gs3$d.d;
            int n7 = 3;
            wp3 wp32 = gi0_02.n(n3, n7);
            Object object = (d)this.a.get(i3);
            String string2 = ((d)object).o;
            Object object2 = "application/cea-608";
            boolean bl2 = ((String)object2).equals(string2);
            if (!bl2 && !(bl2 = ((String)(object2 = "application/cea-708")).equals(string2))) {
                bl2 = false;
                object2 = null;
            } else {
                bl2 = true;
            }
            String string3 = "Invalid closed caption MIME type provided: ";
            CharSequence charSequence = new StringBuilder(string3);
            charSequence.append(string2);
            charSequence = charSequence.toString();
            ct3.b(bl2, (String)charSequence);
            object2 = new d$a();
            gs3$d.b();
            charSequence = gs3$d.e;
            ((d$a)object2).a = charSequence;
            ((d$a)object2).n = string2 = ip1_0.l(string2);
            ((d$a)object2).e = n4 = ((d)object).e;
            ((d$a)object2).d = string2 = ((d)object).d;
            ((d$a)object2).H = n4 = ((d)object).I;
            ((d$a)object2).q = object = ((d)object).r;
            object = new d((d$a)object2);
            wp32.d((d)object);
            wp3Array[i3] = wp32;
        }
    }
}


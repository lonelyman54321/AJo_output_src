/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import java.util.List;

public final class DX2 {
    public final List a;
    public final wp3[] b;
    public final wJ2 c;

    public DX2(List object) {
        this.a = object;
        object = new wp3[object.size()];
        this.b = object;
        rH2 rH22 = new rH2(this);
        super(rH22);
        this.c = object;
    }

    public final void a(gi0_0 gi0_02, Gs3$d gs3$d) {
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
            String string3 = "application/cea-608";
            boolean bl2 = string3.equals(string2);
            if (!bl2 && !(bl2 = (string3 = "application/cea-708").equals(string2))) {
                bl2 = false;
                string3 = null;
            } else {
                bl2 = true;
            }
            String string4 = "Invalid closed caption MIME type provided: ";
            Object object2 = new StringBuilder(string4);
            ((StringBuilder)object2).append(string2);
            object2 = ((StringBuilder)object2).toString();
            ct3.b(bl2, (String)object2);
            string3 = ((d)object).a;
            if (string3 == null) {
                gs3$d.b();
                string3 = gs3$d.e;
            }
            object2 = new d$a();
            ((d$a)object2).a = string3;
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


/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.a;
import androidx.media3.exoplayer.a$a;

public final class Cr
implements Runnable {
    public final /* synthetic */ a$a a;
    public final /* synthetic */ int b;

    public /* synthetic */ Cr(a$a a2, int n3) {
        this.a = a2;
        this.b = n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void run() {
        Object object = this.a.b;
        object.getClass();
        int n3 = 1;
        int n4 = this.b;
        int n7 = -3;
        int n8 = -2;
        if (n4 != n7 && n4 != n8) {
            n7 = -1;
            if (n4 == n7) {
                ((a)object).b(n7);
                ((a)object).a();
                ((a)object).d(n3);
                return;
            }
            if (n4 != n3) {
                object = "Unknown focus change type: ";
                CS1.a(n4, (String)object);
                return;
            }
            n4 = 2;
            ((a)object).d(n4);
            ((a)object).b(n3);
            return;
        }
        n7 = 0;
        if (n4 != n8) {
            dr_1 dr_12 = ((a)object).d;
            if (dr_12 == null || (n4 = dr_12.a) != n3) {
                n3 = 0;
            }
            if (n3 == 0) {
                n3 = 4;
                ((a)object).d(n3);
                return;
            }
        }
        ((a)object).b(0);
        n3 = 3;
        ((a)object).d(n3);
    }
}


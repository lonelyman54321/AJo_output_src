/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;

/*
 * Renamed from Ui1
 */
public final class ui1_2
extends mi1_2 {
    public final int a;
    public final int b;
    public boolean c;
    public int d;

    /*
     * Enabled aggressive block sorting
     */
    public ui1_2(int n3, int n4, int n7) {
        this.a = n7;
        this.b = n4;
        boolean bl2 = false;
        if (n7 > 0 ? n3 <= n4 : n3 >= n4) {
            bl2 = true;
        }
        this.c = bl2;
        if (!bl2) {
            n3 = n4;
        }
        this.d = n3;
    }

    public final boolean hasNext() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int nextInt() {
        int n3 = this.d;
        int n4 = this.b;
        if (n3 != n4) {
            this.d = n4 = this.a + n3;
            return n3;
        }
        n4 = (int)(this.c ? 1 : 0);
        if (n4 != 0) {
            n4 = 0;
            this.c = false;
            return n3;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}


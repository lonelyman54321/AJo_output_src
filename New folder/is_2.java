/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iS
 */
public final class is_2
extends gs_2 {
    public final int a;
    public final int b;
    public boolean c;
    public int d;

    /*
     * Enabled aggressive block sorting
     */
    public is_2(char c2, char c3, int n3) {
        this.a = n3;
        this.b = c3;
        boolean bl2 = false;
        if (n3 > 0 ? (n3 = Intrinsics.compare(c2, c3)) <= 0 : (n3 = Intrinsics.compare(c2, c3)) >= 0) {
            bl2 = true;
        }
        this.c = bl2;
        if (!bl2) {
            c2 = c3;
        }
        this.d = c2;
    }

    public final boolean hasNext() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final char nextChar() {
        int n3 = this.d;
        int n4 = this.b;
        if (n3 != n4) {
            this.d = n4 = this.a + n3;
            return (char)n3;
        }
        n4 = (int)(this.c ? 1 : 0);
        if (n4 != 0) {
            n4 = 0;
            this.c = false;
            return (char)n3;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}


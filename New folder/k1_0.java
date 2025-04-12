/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

/*
 * Renamed from k1
 */
public abstract class k1_0
extends cd2_2 {
    public final int a(int n3) {
        int n4 = this.e().nextInt();
        int n7 = 32 - n3;
        return -n3 >> 31 & (n4 >>>= n7);
    }

    public final int b() {
        return this.e().nextInt();
    }

    public final int c(int n3) {
        return this.e().nextInt(n3);
    }

    public abstract Random e();
}


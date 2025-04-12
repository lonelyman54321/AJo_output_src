/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class DF$b
implements DF$c {
    public final byte[] copyFrom(byte[] byArray, int n3, int n4) {
        return Arrays.copyOfRange(byArray, n3, n4 += n3);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
public final class Z32 {
    public static final LP1$c a(fo0 fo02, int n3) {
        int n4;
        fo02 = fo02.e().f;
        fo0 fo03 = null;
        if (fo02 != null && (n4 = ((LP1$c)fo02).d & n3) != 0) {
            int n7;
            while (fo02 != null && (n7 = (n4 = ((LP1$c)fo02).c) & 2) == 0) {
                if ((n4 &= n3) != 0) {
                    fo03 = fo02;
                    break;
                }
                fo02 = ((LP1$c)fo02).f;
            }
        }
        return fo03;
    }
}


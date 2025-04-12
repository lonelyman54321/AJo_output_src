/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from IL0
 */
public final class il0_1 {
    public final int a;

    public il0_1() {
        this.a = 4;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof il0_1;
        if (n3 == 0) {
            return false;
        }
        object = (il0_1)object;
        n3 = this.a;
        int n4 = ((il0_1)object).a;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FilePreloadConfig(parallelDownloads=");
        int n3 = this.a;
        return tu.a(stringBuilder, n3, ')');
    }
}


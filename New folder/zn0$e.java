/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class zn0$e {
    static {
        gz3.D(0);
        gz3.D(1);
        gz3.D(2);
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<zn0$e> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        bl2 = false;
        if (object != null && (clazz2 = zn0$e.class) == (clazz = object.getClass())) {
            object = (zn0$e)object;
            return Arrays.equals(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(null) * 31;
    }
}


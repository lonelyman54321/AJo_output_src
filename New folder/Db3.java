/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;

public abstract class Db3 {
    public static final HashSet a;

    static {
        HashSet hashSet;
        a = hashSet = new HashSet();
    }

    public Db3() {
        a.add(this);
    }
}


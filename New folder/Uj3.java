/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableSet;
import java.util.regex.Pattern;

public final class Uj3 {
    public static final Pattern d = Pattern.compile("\\s+");
    public static final ImmutableSet e = ImmutableSet.of("auto", "none");
    public static final ImmutableSet f = ImmutableSet.of("dot", "sesame", "circle");
    public static final ImmutableSet g = ImmutableSet.of("filled", "open");
    public static final ImmutableSet h = ImmutableSet.of("after", "before", "outside");
    public final int a;
    public final int b;
    public final int c;

    public Uj3(int n3, int n4, int n7) {
        this.a = n3;
        this.b = n4;
        this.c = n7;
    }
}


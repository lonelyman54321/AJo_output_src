/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Locale;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

public final class Vh
implements it2_1,
W83 {
    public static final Vh a;
    public static final Vh b;

    static {
        Vh vh;
        a = vh = new Object();
        b = vh = new Object();
    }

    public iw1 a() {
        Locale locale = Locale.getDefault();
        Object object = new hw1(locale);
        object = kotlin.collections.a.b(object);
        iw1 iw12 = new iw1((List)object);
        return iw12;
    }

    public Locale b(String object) {
        object = Locale.forLanguageTag((String)object);
        Intrinsics.areEqual(((Locale)object).toLanguageTag(), "und");
        return object;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;

public abstract class ul$j {
    public final Function1 a;
    public final LinkedHashSet b;

    public ul$j(Function1 linkedHashSet) {
        this.a = linkedHashSet;
        this.b = linkedHashSet = new LinkedHashSet();
    }

    public void a(Collection collection) {
    }

    public abstract boolean b(M11 var1);
}


/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public final class Ue0 {
    public static final Ue0 b;
    public final ImmutableList a;

    static {
        Ue0 ue0;
        ImmutableList immutableList = ImmutableList.of();
        b = ue0 = new Ue0(immutableList);
        gz3.D(0);
        gz3.D(1);
    }

    public Ue0(List list) {
        list = ImmutableList.copyOf((Collection)list);
        this.a = list;
    }
}


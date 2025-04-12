/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet$Builder;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

public final class or$a {
    public static final or$a d;
    public final int a;
    public final int b;
    public final ImmutableSet c;

    static {
        or$a or$a;
        int n3 = gz3.a;
        int n4 = 33;
        int n7 = 10;
        int n8 = 2;
        if (n3 >= n4) {
            Object object = new ImmutableSet$Builder();
            for (int i3 = 1; i3 <= n7; ++i3) {
                int n10 = gz3.o(i3);
                Integer n14 = n10;
                ((ImmutableSet$Builder)object).add(n14);
            }
            object = ((ImmutableSet$Builder)object).build();
            or$a = new or$a(n8, (Set)object);
        } else {
            or$a = new or$a(n8, n7);
        }
        d = or$a;
    }

    public or$a(int n3, int n4) {
        this.a = n3;
        this.b = n4;
        this.c = null;
    }

    public or$a(int n3, Set set) {
        int n4;
        this.a = n3;
        Object object = ImmutableSet.copyOf((Collection)set);
        this.c = object;
        object = ((ImmutableSet)object).iterator();
        int n7 = 0;
        set = null;
        while ((n4 = object.hasNext()) != 0) {
            Integer n8 = (Integer)object.next();
            n4 = Integer.bitCount(n8);
            n7 = Math.max(n7, n4);
        }
        this.b = n7;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block6: {
            block5: {
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                int n3 = object instanceof or$a;
                if (n3 == 0) {
                    return false;
                }
                object = (or$a)object;
                int n4 = this.a;
                n3 = ((or$a)object).a;
                if (n4 != n3 || (n3 = this.b) != (n4 = ((or$a)object).b)) break block5;
                n3 = gz3.a;
                ImmutableSet immutableSet = this.c;
                object = ((or$a)object).c;
                boolean bl3 = Objects.equals(immutableSet, object);
                if (bl3) break block6;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        ImmutableSet immutableSet = this.c;
        if (immutableSet == null) {
            n4 = 0;
            immutableSet = null;
        } else {
            n4 = immutableSet.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioProfile[format=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", maxChannelCount=");
        n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", channelMasks=");
        ImmutableSet immutableSet = this.c;
        stringBuilder.append(immutableSet);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}


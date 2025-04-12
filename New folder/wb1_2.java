/*
 * Decompiled with CFR 0.152.
 */
import java.lang.constant.Constable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.b;

/*
 * Renamed from wb1
 */
public final class wb1_2 {
    public Long a;
    public Long b;
    public Long c;

    static {
        boolean bl2;
        Object object = wb1_2.class;
        Object object2 = Reflection.getOrCreateKotlinClass(object);
        try {
            object = Reflection.typeOf(object);
        }
        catch (Throwable throwable) {
            bl2 = false;
            object = null;
        }
        at3_0 at3_02 = new at3_0((yn1_2)object2, (kn1_1)object);
        object2 = "TimeoutConfiguration";
        Intrinsics.checkNotNullParameter(object2, "name");
        object = "type";
        Intrinsics.checkNotNullParameter(at3_02, (String)object);
        bl2 = kotlin.text.b.k((CharSequence)object2) ^ true;
        if (bl2) {
            return;
        }
        object2 = "Name can't be blank".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public wb1_2() {
        Long l2;
        this.a = l2 = Long.valueOf(0L);
        this.b = l2;
        this.c = l2;
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public static void a(Long serializable) {
        long l2;
        long l3;
        long l4;
        long l7;
        if (serializable != null && (l7 = (l4 = (l3 = serializable.longValue()) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0) {
            String string2 = "Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS".toString();
            serializable = new IllegalArgumentException(string2);
            throw serializable;
        }
    }

    public final boolean equals(Object object) {
        Constable constable;
        Object object2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object2 = wb1_2.class) == (constable = object.getClass())) {
            object = (wb1_2)object;
            constable = this.a;
            object2 = ((wb1_2)object).a;
            boolean bl3 = Intrinsics.areEqual(constable, object2);
            if (!bl3) {
                return false;
            }
            constable = this.b;
            object2 = ((wb1_2)object).b;
            bl3 = Intrinsics.areEqual(constable, object2);
            if (!bl3) {
                return false;
            }
            constable = this.c;
            object = ((wb1_2)object).c;
            boolean bl4 = Intrinsics.areEqual(constable, object);
            if (!bl4) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        int n4;
        Long l2 = this.a;
        int n7 = 0;
        if (l2 != null) {
            n4 = ((Object)l2).hashCode();
        } else {
            n4 = 0;
            l2 = null;
        }
        n4 *= 31;
        Long l3 = this.b;
        if (l3 != null) {
            n3 = ((Object)l3).hashCode();
        } else {
            n3 = 0;
            l3 = null;
        }
        n4 = (n4 + n3) * 31;
        l3 = this.c;
        if (l3 != null) {
            n7 = ((Object)l3).hashCode();
        }
        return n4 + n7;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XQ
 */
public final class xq_0 {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final String d;

    public xq_0() {
        this(null, null, null, null);
    }

    public xq_0(String string2, ArrayList arrayList, String string3, String string4) {
        this.a = string2;
        this.b = arrayList;
        this.c = string3;
        this.d = string4;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof xq_0;
        if (!bl3) {
            return false;
        }
        object = (xq_0)object;
        Object object2 = this.a;
        Object object3 = ((xq_0)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((xq_0)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((xq_0)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object = ((xq_0)object).d;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        String string2 = this.a;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.d;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CcFaqData(title=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", faqQuestionList=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", faqAnswer=");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append(", faqQuestion=");
        object = this.d;
        return h30_0.a(stringBuilder, (String)object, ")");
    }
}


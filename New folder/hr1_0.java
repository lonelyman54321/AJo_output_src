/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HR1
 */
public final class hr1_0
extends l62 {
    public hr1_0() {
        this(null);
    }

    public hr1_0(int n3) {
        Object[] objectArray = n3 == 0 ? m62.a : new Object[n3];
        this.a = objectArray;
    }

    public /* synthetic */ hr1_0(Object object) {
        this(16);
    }

    public final void b(Object object) {
        Object[] objectArray;
        Object object2 = this.a;
        int n3 = ((Object[])object2).length;
        int n4 = this.b + 1;
        if (n3 < n4) {
            n3 = ((Object[])object2).length * 3 / 2;
            n4 = Math.max(n4, n3);
            objectArray = Arrays.copyOf(object2, n4);
            object2 = "copyOf(this, newSize)";
            Intrinsics.checkNotNullExpressionValue(objectArray, (String)object2);
            this.a = objectArray;
        }
        objectArray = this.a;
        int n7 = this.b;
        objectArray[n7] = object;
        this.b = ++n7;
    }

    public final void c(Object object) {
        int n3 = this.a(object);
        if (n3 >= 0) {
            int n4;
            if (n3 >= 0 && n3 < (n4 = this.b)) {
                Object[] objectArray = this.a;
                Object cfr_ignored_0 = objectArray[n3];
                int n7 = n4 + -1;
                if (n3 != n7) {
                    n7 = n3 + 1;
                    rp_1.i(objectArray, n3, objectArray, n7, n4);
                }
                this.b = n3 = this.b + -1;
                objectArray[n3] = null;
                return;
            }
            object = wk0_0.a(n3, "Index ", " must be in 0..");
            int n8 = this.b + -1;
            ((StringBuilder)object).append(n8);
            object = ((StringBuilder)object).toString();
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)object);
            throw indexOutOfBoundsException;
        }
    }
}


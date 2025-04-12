/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 */
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

public final class FA {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public FA(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        int n3 = rect.left;
        int n4 = rect.top;
        int n7 = rect.right;
        int n8 = rect.bottom;
        this.a = n3;
        this.b = n4;
        this.c = n7;
        this.d = n8;
    }

    public final int a() {
        int n3 = this.d;
        int n4 = this.b;
        return n3 - n4;
    }

    public final int b() {
        int n3 = this.c;
        int n4 = this.a;
        return n3 - n4;
    }

    public final Rect c() {
        int n3 = this.c;
        int n4 = this.d;
        int n7 = this.a;
        int n8 = this.b;
        Rect rect = new Rect(n7, n8, n3, n4);
        return rect;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object == null) {
            n3 = 0;
            clazz = null;
        } else {
            clazz = object.getClass();
        }
        n3 = Intrinsics.areEqual(FA.class, clazz);
        if (n3 == 0) {
            return false;
        }
        if (object != null) {
            object = (FA)object;
            n3 = this.a;
            int n4 = ((FA)object).a;
            if (n3 != n4) {
                return false;
            }
            n3 = this.b;
            n4 = ((FA)object).b;
            if (n3 != n4) {
                return false;
            }
            n3 = this.c;
            n4 = ((FA)object).c;
            if (n3 != n4) {
                return false;
            }
            n3 = this.d;
            int n7 = ((FA)object).d;
            if (n3 != n7) {
                return false;
            }
            return bl2;
        }
        object = new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        throw object;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = this.c;
        n3 = (n3 + n4) * 31;
        n4 = this.d;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = FA.class.getSimpleName();
        stringBuilder.append((Object)string2);
        stringBuilder.append(" { [");
        int c2 = this.a;
        stringBuilder.append(c2);
        char c3 = ',';
        stringBuilder.append(c3);
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(c3);
        n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(c3);
        return g30.a(this.d, "] }", stringBuilder);
    }
}


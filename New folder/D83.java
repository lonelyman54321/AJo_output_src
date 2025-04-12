/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public class D83
extends qb3_0
implements qr1_1,
g83_0 {
    public D83$a b;

    public final I83 a() {
        J83.l();
        return qi_2.b;
    }

    public final float c() {
        return ((D83$a)A83.u((Rb3)this.b, (pb3_0)this)).c;
    }

    public final void g(Rb3 rb3) {
        Intrinsics.checkNotNull(rb3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        rb3 = (D83$a)rb3;
        this.b = rb3;
    }

    public final Rb3 h() {
        return this.b;
    }

    public final Rb3 i(Rb3 object, Rb3 rb3, Rb3 rb32) {
        float f5;
        float f6;
        object = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord";
        Intrinsics.checkNotNull(rb3, (String)object);
        Rb3 rb33 = rb3;
        rb33 = (D83$a)rb3;
        Intrinsics.checkNotNull(rb32, (String)object);
        rb32 = (D83$a)rb32;
        float f7 = ((D83$a)rb33).c;
        float f8 = ((D83$a)rb32).c;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (!(n3 >= n4 ? (f6 = f7 == f8 ? 0 : (f7 < f8 ? -1 : 1)) == false : (n3 = (int)(AS0.a(f7) ? 1 : 0)) == 0 && (n3 = (int)(AS0.a(f8) ? 1 : 0)) == 0 && (f5 = f7 == f8 ? 0 : (f7 < f8 ? -1 : 1)) == false)) {
            rb3 = null;
        }
        return rb3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void k(float f5) {
        float f6;
        float f7;
        Rb3 rb3 = (D83$a)A83.i(this.b);
        float f8 = rb3.c;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4 ? (f7 = f8 == f5 ? 0 : (f8 < f5 ? -1 : 1)) == false : (n3 = (int)(AS0.a(f8) ? 1 : 0)) == 0 && (n3 = (int)(AS0.a(f5) ? 1 : 0)) == 0 && (f6 = f8 == f5 ? 0 : (f8 < f5 ? -1 : 1)) == false) return;
        D83$a d83$a = this.b;
        Object object = A83.c;
        synchronized (object) {
            v83_0 v83_02 = A83.k();
            rb3 = A83.p(d83$a, this, v83_02, rb3);
            rb3.c = f5;
            Unit unit = Unit.a;
            A83.o(v83_02, this);
            return;
            finally {
            }
        }
    }

    public final String toString() {
        D83$a d83$a = (D83$a)A83.i(this.b);
        StringBuilder stringBuilder = new StringBuilder("MutableFloatState(value=");
        float f5 = d83$a.c;
        stringBuilder.append(f5);
        stringBuilder.append(")@");
        int n3 = this.hashCode();
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public final Float x() {
        return Float.valueOf(this.c());
    }

    public final void y(float f5) {
        this.k(f5);
    }
}


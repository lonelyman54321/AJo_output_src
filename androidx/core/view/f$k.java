/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 */
package androidx.core.view;

import android.os.Build;
import android.view.View;
import androidx.core.view.f;
import androidx.core.view.f$b;
import androidx.core.view.f$c;
import androidx.core.view.f$d;
import androidx.core.view.f$e;
import java.util.Objects;

public class f$k {
    public static final f b;
    public final f a;

    static {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        f$e f$e = n3 >= n4 ? new f$d() : (n3 >= (n4 = 29) ? new f$c() : new f$b());
        b = f$e.b().a.a().a.b().a.c();
    }

    public f$k(f f5) {
        this.a = f5;
    }

    public f a() {
        return this.a;
    }

    public f b() {
        return this.a;
    }

    public f c() {
        return this.a;
    }

    public void d(View view) {
    }

    public or0 e() {
        return null;
    }

    public boolean equals(Object object) {
        boolean bl2;
        ei1 ei12;
        Object object2;
        boolean bl3;
        boolean bl4 = true;
        if (this == object) {
            return bl4;
        }
        boolean bl5 = object instanceof f$k;
        if (!bl5) {
            return false;
        }
        object = (f$k)object;
        bl5 = this.n();
        if (!(bl5 == (bl3 = ((f$k)object).n()) && (bl5 = this.m()) == (bl3 = ((f$k)object).m()) && (bl5 = Objects.equals(object2 = this.j(), ei12 = ((f$k)object).j())) && (bl5 = Objects.equals(object2 = this.h(), ei12 = ((f$k)object).h())) && (bl2 = Objects.equals(object2 = this.e(), object = ((f$k)object).e())))) {
            bl4 = false;
        }
        return bl4;
    }

    public ei1 f(int n3) {
        return ei1.e;
    }

    public ei1 g() {
        return this.j();
    }

    public ei1 h() {
        return ei1.e;
    }

    public int hashCode() {
        Boolean bl2 = this.n();
        Boolean bl3 = this.m();
        ei1 ei12 = this.j();
        ei1 ei13 = this.h();
        or0 or02 = this.e();
        Object[] objectArray = new Object[]{bl2, bl3, ei12, ei13, or02};
        return Objects.hash(objectArray);
    }

    public ei1 i() {
        return this.j();
    }

    public ei1 j() {
        return ei1.e;
    }

    public ei1 k() {
        return this.j();
    }

    public f l(int n3, int n4, int n7, int n8) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int n3) {
        return true;
    }

    public void p(ei1[] ei1Array) {
    }

    public void q(f f5) {
    }

    public void r(ei1 ei12) {
    }
}


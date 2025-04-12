/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.k$a;
import androidx.lifecycle.i$b;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class k {
    public ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList n;
    public ArrayList o;
    public boolean p;
    public ArrayList q;

    public k() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
        this.h = true;
        this.p = false;
    }

    public final void b(k$a k$a) {
        int n3;
        this.a.add(k$a);
        k$a.d = n3 = this.b;
        k$a.e = n3 = this.c;
        k$a.f = n3 = this.d;
        k$a.g = n3 = this.e;
    }

    public final void c(String object) {
        boolean bl2 = this.h;
        if (bl2) {
            this.g = true;
            this.i = object;
            return;
        }
        object = new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        throw object;
    }

    public abstract int d();

    public abstract int e();

    public abstract void f();

    public void g(Fragment fragment) {
        k$a k$a = new k$a(fragment, 6);
        this.b(k$a);
    }

    public void h(int n3, Fragment object, String object2, int n4) {
        boolean bl2;
        boolean bl3;
        Object object3 = ((Fragment)object).mPreviousWho;
        if (object3 != null) {
            zw0_0.d((Fragment)object, (String)object3);
        }
        object3 = object.getClass();
        int n7 = ((Class)object3).getModifiers();
        boolean n8 = ((Class)object3).isAnonymousClass();
        if (!(n8 || !(bl3 = Modifier.isPublic(n7)) || (bl2 = ((Class)object3).isMemberClass()) && (n7 = (int)(Modifier.isStatic(n7) ? 1 : 0)) == 0)) {
            object3 = " now ";
            String string2 = ": was ";
            if (object2 != null) {
                boolean bl4;
                String string3 = ((Fragment)object).mTag;
                if (string3 != null && !(bl4 = ((String)object2).equals(string3))) {
                    StringBuilder stringBuilder = new StringBuilder("Can't change tag of fragment ");
                    stringBuilder.append(object);
                    stringBuilder.append(string2);
                    object = ((Fragment)object).mTag;
                    object = BW0.b(stringBuilder, (String)object, (String)object3, (String)object2);
                    IllegalStateException illegalStateException = new IllegalStateException((String)object);
                    throw illegalStateException;
                }
                ((Fragment)object).mTag = object2;
            }
            if (n3 != 0) {
                int n10 = -1;
                if (n3 != n10) {
                    int n14 = ((Fragment)object).mFragmentId;
                    if (n14 != 0 && n14 != n3) {
                        StringBuilder stringBuilder = new StringBuilder("Can't change container ID of fragment ");
                        stringBuilder.append(object);
                        stringBuilder.append(string2);
                        int n15 = ((Fragment)object).mFragmentId;
                        String string4 = Xd0.a((String)object3, n15, n3, stringBuilder);
                        object2 = new IllegalStateException(string4);
                        throw object2;
                    }
                    ((Fragment)object).mFragmentId = n3;
                    ((Fragment)object).mContainerId = n3;
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Can't add fragment ");
                    stringBuilder.append(object);
                    stringBuilder.append(" with tag ");
                    stringBuilder.append((String)object2);
                    stringBuilder.append(" to container view with no id");
                    object = stringBuilder.toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                    throw illegalArgumentException;
                }
            }
            k$a k$a = new k$a((Fragment)object, n4);
            this.b(k$a);
            return;
        }
        object = new StringBuilder("Fragment ");
        object2 = ((Class)object3).getCanonicalName();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(" must be a public static class to be  properly recreated from instance state.");
        object = ((StringBuilder)object).toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public void i(Fragment fragment) {
        k$a k$a = new k$a(fragment, 3);
        this.b(k$a);
    }

    public final void j(int n3, Fragment fragment, String string2) {
        if (n3 != 0) {
            this.h(n3, fragment, string2, 2);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Must use non-zero containerViewId");
        throw illegalArgumentException;
    }

    public final void k(int n3, int n4, int n7, int n8) {
        this.b = n3;
        this.c = n4;
        this.d = n7;
        this.e = n8;
    }

    public void l(Fragment object, i$b i$b) {
        k$a k$a = new Object();
        k$a.a = 10;
        k$a.b = object;
        k$a.c = false;
        object = object.mMaxState;
        k$a.h = object;
        k$a.i = i$b;
        this.b(k$a);
    }
}


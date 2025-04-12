/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$j;
import androidx.fragment.app.FragmentManager$o;
import androidx.fragment.app.k;
import androidx.fragment.app.k$a;
import androidx.lifecycle.i$b;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class a
extends k
implements FragmentManager$j,
FragmentManager$o {
    public final FragmentManager r;
    public boolean s;
    public int t;

    public a(FragmentManager fragmentManager) {
        fragmentManager.M();
        ArrayList arrayList = fragmentManager.x;
        if (arrayList != null) {
            arrayList = ((lw0_0)((Object)arrayList)).b;
            arrayList.getClassLoader();
        }
        this.a = arrayList = new ArrayList();
        this.h = true;
        this.p = false;
        this.t = -1;
        this.r = fragmentManager;
    }

    public final boolean a(ArrayList serializable, ArrayList arrayList) {
        String string2 = "FragmentManager";
        int n3 = 2;
        boolean bl2 = Log.isLoggable((String)string2, (int)n3);
        if (bl2) {
            this.toString();
        }
        ((ArrayList)serializable).add(this);
        serializable = Boolean.FALSE;
        arrayList.add(serializable);
        boolean bl3 = this.g;
        if (bl3) {
            serializable = this.r.d;
            ((ArrayList)serializable).add(this);
        }
        return true;
    }

    public final int d() {
        return this.o(false, true);
    }

    public final int e() {
        boolean bl2 = true;
        return this.o(bl2, bl2);
    }

    public final void f() {
        boolean bl2 = this.g;
        if (!bl2) {
            this.h = false;
            this.r.A(this, true);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("This transaction is already being added to the back stack");
        throw illegalStateException;
    }

    public final void g(Fragment object) {
        Object object2;
        Object object3 = ((Fragment)object).mFragmentManager;
        if (object3 != null && object3 != (object2 = this.r)) {
            object2 = new StringBuilder("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
            object = ((Fragment)object).toString();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(" is already attached to a FragmentManager.");
            object = ((StringBuilder)object2).toString();
            object3 = new IllegalStateException((String)object);
            throw object3;
        }
        super.g((Fragment)object);
    }

    public final String getName() {
        return this.i;
    }

    public final void h(int n3, Fragment fragment, String string2, int n4) {
        FragmentManager fragmentManager;
        super.h(n3, fragment, string2, n4);
        fragment.mFragmentManager = fragmentManager = this.r;
    }

    public final void i(Fragment object) {
        Object object2;
        Object object3 = ((Fragment)object).mFragmentManager;
        if (object3 != null && object3 != (object2 = this.r)) {
            object2 = new StringBuilder("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            object = ((Fragment)object).toString();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(" is already attached to a FragmentManager.");
            object = ((StringBuilder)object2).toString();
            object3 = new IllegalStateException((String)object);
            throw object3;
        }
        super.i((Fragment)object);
    }

    public final void l(Fragment object, i$b object2) {
        Object object3 = ((Fragment)object).mFragmentManager;
        Object object4 = this.r;
        if (object3 == object4) {
            int n3;
            int n4;
            object3 = i$b.INITIALIZED;
            object4 = "Cannot set maximum Lifecycle to ";
            if (object2 == object3 && (n4 = ((Fragment)object).mState) > (n3 = -1)) {
                object3 = new StringBuilder((String)object4);
                ((StringBuilder)object3).append(object2);
                ((StringBuilder)object3).append(" after the Fragment has been created");
                object2 = ((StringBuilder)object3).toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            object3 = i$b.DESTROYED;
            if (object2 != object3) {
                super.l((Fragment)object, (i$b)((Object)object2));
                return;
            }
            object3 = new StringBuilder((String)object4);
            ((StringBuilder)object3).append(object2);
            ((StringBuilder)object3).append(". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            object2 = ((StringBuilder)object3).toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = new StringBuilder("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
        ((StringBuilder)object2).append(object4);
        object2 = ((StringBuilder)object2).toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void m(int n3) {
        boolean bl2 = this.g;
        if (!bl2) {
            return;
        }
        String string2 = "FragmentManager";
        int n4 = 2;
        boolean bl3 = Log.isLoggable((String)string2, (int)n4);
        if (bl3) {
            this.toString();
        }
        ArrayList arrayList = this.a;
        int n7 = arrayList.size();
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8;
            Object object = (k$a)arrayList.get(i3);
            Fragment fragment = ((k$a)object).b;
            if (fragment == null) continue;
            fragment.mBackStackNesting = n8 = fragment.mBackStackNesting + n3;
            boolean bl4 = Log.isLoggable((String)string2, (int)n4);
            if (!bl4) continue;
            fragment = ((k$a)object).b;
            Objects.toString(fragment);
            object = ((k$a)object).b;
            int cfr_ignored_0 = ((Fragment)object).mBackStackNesting;
        }
    }

    public final void n() {
        ArrayList arrayList = this.a;
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            int n3;
            k$a k$a = (k$a)arrayList.get(i3);
            int n4 = k$a.c;
            if (n4 == 0) continue;
            n4 = k$a.a;
            int n7 = 8;
            boolean bl2 = false;
            if (n4 == n7) {
                k$a.c = false;
                n3 = i3 + -1;
                arrayList.remove(n3);
                i3 += -1;
                continue;
            }
            Fragment fragment = k$a.b;
            n4 = fragment.mContainerId;
            k$a.a = n7 = 2;
            k$a.c = false;
            for (n3 = i3 + -1; n3 >= 0; n3 += -1) {
                Object object = (k$a)arrayList.get(n3);
                bl2 = ((k$a)object).c;
                if (!bl2) continue;
                object = ((k$a)object).b;
                n7 = ((Fragment)object).mContainerId;
                if (n7 != n4) continue;
                arrayList.remove(n3);
                i3 += -1;
            }
        }
    }

    public final int o(boolean bl2, boolean bl3) {
        int n3 = this.s;
        if (n3 == 0) {
            Object object = "FragmentManager";
            n3 = Log.isLoggable((String)object, (int)2);
            boolean bl4 = true;
            if (n3 != 0) {
                this.toString();
                object = new lx1();
                PrintWriter printWriter = new PrintWriter((Writer)object);
                object = "  ";
                this.q((String)object, printWriter, bl4);
                printWriter.close();
            }
            this.s = bl4;
            n3 = this.g;
            FragmentManager fragmentManager = this.r;
            if (n3 != 0) {
                object = fragmentManager.k;
                this.t = n3 = ((AtomicInteger)object).getAndIncrement();
            } else {
                this.t = n3 = -1;
            }
            if (bl3) {
                fragmentManager.x(this, bl2);
            }
            return this.t;
        }
        IllegalStateException illegalStateException = new IllegalStateException("commit already called");
        throw illegalStateException;
    }

    public final void p() {
        boolean bl2 = this.g;
        if (!bl2) {
            this.h = false;
            this.r.A(this, false);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("This transaction is already being added to the back stack");
        throw illegalStateException;
    }

    public final void q(String string2, PrintWriter printWriter, boolean bl2) {
        int n3;
        Object object;
        if (bl2) {
            printWriter.print(string2);
            printWriter.print("mName=");
            object = this.i;
            printWriter.print((String)object);
            printWriter.print(" mIndex=");
            int n4 = this.t;
            printWriter.print(n4);
            object = " mCommitted=";
            printWriter.print((String)object);
            n4 = (int)(this.s ? 1 : 0);
            printWriter.println(n4 != 0);
            n4 = this.f;
            if (n4 != 0) {
                printWriter.print(string2);
                printWriter.print("mTransition=#");
                n4 = this.f;
                object = Integer.toHexString(n4);
                printWriter.print((String)object);
            }
            if ((n4 = this.b) != 0 || (n4 = this.c) != 0) {
                printWriter.print(string2);
                printWriter.print("mEnterAnim=#");
                object = Integer.toHexString(this.b);
                printWriter.print((String)object);
                printWriter.print(" mExitAnim=#");
                n4 = this.c;
                object = Integer.toHexString(n4);
                printWriter.println((String)object);
            }
            if ((n4 = this.d) != 0 || (n4 = this.e) != 0) {
                printWriter.print(string2);
                printWriter.print("mPopEnterAnim=#");
                object = Integer.toHexString(this.d);
                printWriter.print((String)object);
                printWriter.print(" mPopExitAnim=#");
                n4 = this.e;
                object = Integer.toHexString(n4);
                printWriter.println((String)object);
            }
            if ((n4 = this.j) != 0 || (object = this.k) != null) {
                printWriter.print(string2);
                printWriter.print("mBreadCrumbTitleRes=#");
                n4 = this.j;
                object = Integer.toHexString(n4);
                printWriter.print((String)object);
                printWriter.print(" mBreadCrumbTitleText=");
                object = this.k;
                printWriter.println(object);
            }
            if ((n4 = this.l) != 0 || (object = this.m) != null) {
                printWriter.print(string2);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                n4 = this.l;
                object = Integer.toHexString(n4);
                printWriter.print((String)object);
                printWriter.print(" mBreadCrumbShortTitleText=");
                object = this.m;
                printWriter.println(object);
            }
        }
        if ((n3 = ((ArrayList)(object = this.a)).isEmpty()) == 0) {
            printWriter.print(string2);
            String string3 = "Operations:";
            printWriter.println(string3);
            n3 = ((ArrayList)object).size();
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object2;
                String string4;
                Object object3 = (k$a)((ArrayList)object).get(i3);
                int n7 = ((k$a)object3).a;
                switch (n7) {
                    default: {
                        string4 = "cmd=";
                        object2 = new StringBuilder(string4);
                        int n8 = ((k$a)object3).a;
                        ((StringBuilder)object2).append(n8);
                        object2 = ((StringBuilder)object2).toString();
                        break;
                    }
                    case 10: {
                        object2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    case 9: {
                        object2 = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 8: {
                        object2 = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 7: {
                        object2 = "ATTACH";
                        break;
                    }
                    case 6: {
                        object2 = "DETACH";
                        break;
                    }
                    case 5: {
                        object2 = "SHOW";
                        break;
                    }
                    case 4: {
                        object2 = "HIDE";
                        break;
                    }
                    case 3: {
                        object2 = "REMOVE";
                        break;
                    }
                    case 2: {
                        object2 = "REPLACE";
                        break;
                    }
                    case 1: {
                        object2 = "ADD";
                        break;
                    }
                    case 0: {
                        object2 = "NULL";
                    }
                }
                printWriter.print(string2);
                printWriter.print("  Op #");
                printWriter.print(i3);
                string4 = ": ";
                printWriter.print(string4);
                printWriter.print((String)object2);
                printWriter.print(" ");
                object2 = ((k$a)object3).b;
                printWriter.println(object2);
                if (!bl2) continue;
                n7 = ((k$a)object3).d;
                if (n7 != 0 || (n7 = ((k$a)object3).e) != 0) {
                    printWriter.print(string2);
                    printWriter.print("enterAnim=#");
                    object2 = Integer.toHexString(((k$a)object3).d);
                    printWriter.print((String)object2);
                    printWriter.print(" exitAnim=#");
                    n7 = ((k$a)object3).e;
                    object2 = Integer.toHexString(n7);
                    printWriter.println((String)object2);
                }
                if ((n7 = ((k$a)object3).f) == 0 && (n7 = ((k$a)object3).g) == 0) continue;
                printWriter.print(string2);
                printWriter.print("popEnterAnim=#");
                n7 = ((k$a)object3).f;
                object2 = Integer.toHexString(n7);
                printWriter.print((String)object2);
                object2 = " popExitAnim=#";
                printWriter.print((String)object2);
                int n10 = ((k$a)object3).g;
                object3 = Integer.toHexString(n10);
                printWriter.println((String)object3);
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        String string2 = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append(string2);
        int n3 = this.t;
        if (n3 >= 0) {
            string2 = " #";
            stringBuilder.append(string2);
            n3 = this.t;
            stringBuilder.append(n3);
        }
        if ((string2 = this.i) != null) {
            stringBuilder.append(" ");
            string2 = this.i;
            stringBuilder.append(string2);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}


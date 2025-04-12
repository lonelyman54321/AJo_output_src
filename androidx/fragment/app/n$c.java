/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.ViewGroup
 */
package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n$a;
import androidx.fragment.app.n$c$a;
import androidx.fragment.app.n$c$b;
import androidx.fragment.app.n$c$c;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public class n$c {
    public n$c$b a;
    public n$c$a b;
    public final Fragment c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;

    public n$c(n$c$b object, n$c$a n$c$a, Fragment fragment) {
        Intrinsics.checkNotNullParameter(object, "finalState");
        Intrinsics.checkNotNullParameter((Object)n$c$a, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.a = object;
        this.b = n$c$a;
        this.c = fragment;
        this.d = object;
        this.i = true;
        super();
        this.j = object;
        this.k = object;
    }

    public final void a(ViewGroup viewGroup) {
        String string2 = "container";
        Intrinsics.checkNotNullParameter(viewGroup, string2);
        this.h = false;
        boolean bl2 = this.e;
        if (bl2) {
            return;
        }
        this.e = bl2 = true;
        Object object = this.j;
        boolean bl3 = ((ArrayList)object).isEmpty();
        if (bl3) {
            this.b();
        } else {
            boolean bl4;
            object = ((Iterable)CollectionsKt.k0(this.k)).iterator();
            while (bl4 = object.hasNext()) {
                n$a n$a = (n$a)object.next();
                n$a.getClass();
                Intrinsics.checkNotNullParameter(viewGroup, string2);
                boolean bl5 = n$a.b;
                if (!bl5) {
                    n$a.b(viewGroup);
                }
                n$a.b = bl2;
            }
        }
    }

    public void b() {
        Object object = null;
        this.h = false;
        boolean bl2 = this.f;
        if (bl2) {
            return;
        }
        object = "FragmentManager";
        int n3 = 2;
        bl2 = Log.isLoggable((String)object, (int)n3);
        if (bl2) {
            this.toString();
        }
        this.f = bl2 = true;
        object = this.d.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Runnable runnable2 = (Runnable)object.next();
            runnable2.run();
        }
    }

    public final void c(n$a n$a) {
        Intrinsics.checkNotNullParameter(n$a, "effect");
        ArrayList arrayList = this.j;
        boolean bl2 = arrayList.remove(n$a);
        if (bl2 && (bl2 = arrayList.isEmpty())) {
            this.b();
        }
    }

    public final void d(n$c$b enum_, n$c$a enum_2) {
        Intrinsics.checkNotNullParameter(enum_, "finalState");
        Intrinsics.checkNotNullParameter(enum_2, "lifecycleImpact");
        Object object = n$c$c.$EnumSwitchMapping$0;
        int n3 = enum_2.ordinal();
        n3 = object[n3];
        object = this.c;
        String string2 = "FragmentManager";
        int n4 = 1;
        int n7 = 2;
        if (n3 != n4) {
            if (n3 != n7) {
                n$c$b n$c$b;
                n4 = 3;
                if (n3 == n4 && (enum_2 = this.a) != (n$c$b = n$c$b.REMOVED)) {
                    n3 = (int)(Log.isLoggable((String)string2, (int)n7) ? 1 : 0);
                    if (n3 != 0) {
                        Objects.toString(object);
                        enum_2 = this.a;
                        Objects.toString(enum_2);
                        Objects.toString(enum_);
                    }
                    this.a = enum_;
                }
            } else {
                boolean bl2 = Log.isLoggable((String)string2, (int)n7);
                if (bl2) {
                    Objects.toString(object);
                    Objects.toString((Object)this.a);
                    enum_ = this.b;
                    Objects.toString(enum_);
                }
                enum_ = n$c$b.REMOVED;
                this.a = enum_;
                this.b = enum_ = n$c$a.REMOVING;
                this.i = n4;
            }
        } else {
            enum_ = this.a;
            enum_2 = n$c$b.REMOVED;
            if (enum_ == enum_2) {
                boolean bl3 = Log.isLoggable((String)string2, (int)n7);
                if (bl3) {
                    Objects.toString(object);
                    enum_ = this.b;
                    Objects.toString(enum_);
                }
                this.a = enum_ = n$c$b.VISIBLE;
                this.b = enum_ = n$c$a.ADDING;
                this.i = n4;
            }
        }
    }

    public void e() {
        this.h = true;
    }

    public final String toString() {
        CharSequence charSequence = Integer.toHexString(System.identityHashCode(this));
        charSequence = Gn.a("Operation {", (String)charSequence, "} {finalState = ");
        Object object = this.a;
        ((StringBuilder)charSequence).append(object);
        ((StringBuilder)charSequence).append(" lifecycleImpact = ");
        object = this.b;
        ((StringBuilder)charSequence).append(object);
        ((StringBuilder)charSequence).append(" fragment = ");
        object = this.c;
        ((StringBuilder)charSequence).append(object);
        ((StringBuilder)charSequence).append('}');
        return ((StringBuilder)charSequence).toString();
    }
}


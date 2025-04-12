/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package androidx.lifecycle;

import android.os.Looper;
import androidx.lifecycle.C;
import androidx.lifecycle.c_0;
import androidx.lifecycle.d_0;
import androidx.lifecycle.e_0;
import androidx.lifecycle.i;
import androidx.lifecycle.i$a;
import androidx.lifecycle.i$a$a;
import androidx.lifecycle.i$b;
import androidx.lifecycle.n;
import androidx.lifecycle.o$a;
import androidx.lifecycle.t;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class o
extends i {
    public final boolean b;
    public yi0_1 c;
    public i$b d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final kb3_2 j;

    public o(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "provider");
        this(mu1_12, true);
    }

    public o(mu1_1 object, boolean bl2) {
        Object object2;
        this.b = bl2;
        this.c = object2 = new yi0_1();
        object2 = i$b.INITIALIZED;
        this.d = object2;
        WeakReference<mu1_1> weakReference = new WeakReference<mu1_1>();
        this.i = weakReference;
        this.e = weakReference = new WeakReference<mu1_1>((mu1_1)object);
        this.j = object = lb3_2.a(object2);
    }

    public final void a(lu1 object) {
        int n3;
        int n4;
        e_0[] e_0Array;
        Object object2;
        Object object3 = this.i;
        int n7 = 1;
        Intrinsics.checkNotNullParameter(object, "observer");
        this.e("addObserver");
        Object object4 = this.d;
        Object object5 = i$b.DESTROYED;
        if (object4 != object5) {
            object5 = i$b.INITIALIZED;
        }
        Intrinsics.checkNotNullParameter(object5, "initialState");
        object4 = new Object();
        Intrinsics.checkNotNull(object);
        Object object6 = qu1_2.a;
        object6 = "object";
        Intrinsics.checkNotNullParameter(object, (String)object6);
        int n8 = object instanceof n;
        int n10 = object instanceof jm0_1;
        boolean bl2 = false;
        if (n8 != 0 && n10 != 0) {
            object2 = object;
            object2 = (jm0_1)object;
            e_0Array = object;
            e_0Array = (n)object;
            object6 = new d_0((jm0_1)object2, (n)e_0Array);
        } else if (n10 != 0) {
            object2 = object;
            object2 = (jm0_1)object;
            n4 = 0;
            e_0Array = null;
            object6 = new d_0((jm0_1)object2, null);
        } else if (n8 != 0) {
            object6 = object;
            object6 = (n)object;
        } else {
            object6 = object.getClass();
            n10 = qu1_2.c(object6);
            if (n10 == (n4 = 2)) {
                object2 = qu1_2.b;
                object6 = ((HashMap)object2).get(object6);
                Intrinsics.checkNotNull(object6);
                object6 = (List)object6;
                n10 = object6.size();
                if (n10 == n7) {
                    object6 = qu1_2.a((Constructor)object6.get(0), object);
                    object6 = object2 = new C((e_0)object6);
                } else {
                    n10 = object6.size();
                    e_0Array = new e_0[n10];
                    for (int i3 = 0; i3 < n10; i3 += n7) {
                        e_0 e_02;
                        e_0Array[i3] = e_02 = qu1_2.a((Constructor)object6.get(i3), object);
                    }
                    object6 = new c_0(e_0Array);
                }
            } else {
                object6 = new t(object);
            }
        }
        ((o$a)object4).b = object6;
        ((o$a)object4).a = object5;
        object5 = (o$a)this.c.c(object, object4);
        if (object5 != null) {
            return;
        }
        object5 = (mu1_1)this.e.get();
        if (object5 == null) {
            return;
        }
        n8 = this.f;
        if (n8 != 0 || (n8 = (int)(this.g ? 1 : 0)) != 0) {
            bl2 = true;
        }
        object6 = this.d((lu1)object);
        this.f = n10 = this.f + n7;
        while ((n8 = ((Enum)(object2 = ((o$a)object4).a)).compareTo(object6)) < 0 && (n8 = (int)(((HashMap)(object6 = this.c.e)).containsKey(object) ? 1 : 0)) != 0) {
            object6 = ((o$a)object4).a;
            ((ArrayList)object3).add(object6);
            object6 = i$a.Companion;
            object2 = ((o$a)object4).a;
            object6.getClass();
            object6 = i$a$a.b((i$b)((Object)object2));
            if (object6 != null) {
                ((o$a)object4).a((mu1_1)object5, (i$a)((Object)object6));
                n8 = ((ArrayList)object3).size() - n7;
                ((ArrayList)object3).remove(n8);
                object6 = this.d((lu1)object);
                continue;
            }
            object3 = new StringBuilder("no event up from ");
            i$b i$b = ((o$a)object4).a;
            ((StringBuilder)object3).append((Object)i$b);
            object3 = ((StringBuilder)object3).toString();
            object = new IllegalStateException((String)object3);
            throw object;
        }
        if (!bl2) {
            this.i();
        }
        this.f = n3 = this.f + -1;
    }

    public final i$b b() {
        return this.d;
    }

    public final void c(lu1 lu12) {
        Intrinsics.checkNotNullParameter(lu12, "observer");
        this.e("removeObserver");
        this.c.d(lu12);
    }

    public final i$b d(lu1 object) {
        int n3;
        Object object2 = this.c.e;
        boolean bl2 = object2.containsKey(object);
        Object object3 = null;
        object = bl2 ? ((CR2$c)object2.get((Object)object)).d : null;
        object = object != null && (object = (o$a)((CR2$c)object).b) != null ? ((o$a)object).a : null;
        object2 = this.i;
        bl2 = ((ArrayList)object2).isEmpty();
        int n4 = 1;
        if (bl2 ^= n4) {
            object3 = object2 = pp_0.a(n4, (ArrayList)object2);
            object3 = (i$b)((Object)object2);
        }
        object2 = this.d;
        String string2 = "state1";
        Intrinsics.checkNotNullParameter(object2, string2);
        if (object == null || (n4 = ((Enum)object).compareTo(object2)) >= 0) {
            object = object2;
        }
        Intrinsics.checkNotNullParameter(object, string2);
        if (object3 == null || (n3 = ((Enum)object3).compareTo(object)) >= 0) {
            object3 = object;
        }
        return object3;
    }

    public final void e(String string2) {
        boolean bl2 = this.b;
        if (bl2) {
            xp_0.Q().a.getClass();
            Object object = Looper.getMainLooper().getThread();
            Thread thread2 = Thread.currentThread();
            if (object != thread2) {
                string2 = cP.a("Method ", string2, " must be called on the main thread");
                string2 = string2.toString();
                object = new IllegalStateException(string2);
                throw object;
            }
        }
    }

    public final void f(i$a enum_) {
        Intrinsics.checkNotNullParameter(enum_, "event");
        this.e("handleLifecycleEvent");
        enum_ = ((i$a)enum_).getTargetState();
        this.g((i$b)enum_);
    }

    public final void g(i$b object) {
        Object object2 = this.d;
        if (object2 == object) {
            return;
        }
        i$b i$b = i$b.INITIALIZED;
        if (object2 == i$b && object == (object2 = i$b.DESTROYED)) {
            object2 = new StringBuilder("State must be at least CREATED to move to ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(", but was ");
            object = this.d;
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(" in component ");
            object = this.e.get();
            ((StringBuilder)object2).append(object);
            object = ((StringBuilder)object2).toString();
            object = object.toString();
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        this.d = object;
        int n3 = this.g;
        boolean bl2 = true;
        if (n3 == 0 && (n3 = this.f) == 0) {
            this.g = bl2;
            this.i();
            n3 = 0;
            this.g = false;
            object = this.d;
            object2 = i$b.DESTROYED;
            if (object == object2) {
                object = new yi0_1();
                this.c = object;
            }
            return;
        }
        this.h = bl2;
    }

    public final void h(i$b i$b) {
        Intrinsics.checkNotNullParameter((Object)i$b, "state");
        this.e("setCurrentState");
        this.g(i$b);
    }

    /*
     * Exception decompiling
     */
    public final void i() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[UNCONDITIONALDOLOOP]], but top level block is 4[UNCONDITIONALDOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}


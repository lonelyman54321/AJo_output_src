/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.util.Log
 */
package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.b;
import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.engine.c$a;
import com.bumptech.glide.load.engine.d;
import com.bumptech.glide.load.engine.f$c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class i
implements c,
c$a {
    public final d a;
    public final c$a b;
    public volatile int c;
    public volatile b d;
    public volatile Object e;
    public volatile BP1$a f;
    public volatile ci0 g;

    public i(d d2, c$a c$a) {
        this.a = d2;
        this.b = c$a;
    }

    public final void a(qn1_0 qn1_02, Object object, ei0_0 ei0_02, pi0_0 pi0_02, qn1_0 qn1_03) {
        c$a c$a = this.b;
        pi0_0 pi0_03 = this.f.c.e();
        c$a.a(qn1_02, object, ei0_02, pi0_03, qn1_02);
    }

    public final boolean b() {
        Object object;
        int n3;
        boolean bl2;
        Object object2 = this.e;
        int n4 = 0;
        Object object3 = null;
        boolean bl3 = true;
        if (object2 != null) {
            object2 = this.e;
            this.e = null;
            try {
                bl2 = this.e(object2);
                if (!bl2) {
                    return bl3;
                }
            }
            catch (IOException iOException) {
                object2 = "SourceGenerator";
                n3 = 3;
                Log.isLoggable((String)object2, (int)n3);
            }
        }
        if ((object2 = this.d) != null && (bl2 = ((b)(object2 = this.d)).b())) {
            return bl3;
        }
        this.d = null;
        this.f = null;
        bl2 = false;
        object2 = null;
        while (!bl2 && (n4 = this.c) < (n3 = (object = this.a.b()).size())) {
            int n7;
            object3 = this.a.b();
            n3 = this.c;
            this.c = n7 = n3 + 1;
            this.f = object3 = (BP1$a)((ArrayList)object3).get(n3);
            if ((object3 = this.f) == null) continue;
            object3 = this.a.p;
            object = this.f.c.e();
            n4 = (int)(((Nq0)object3).c((pi0_0)((Object)object)) ? 1 : 0);
            if (n4 == 0) {
                object3 = this.a;
                object = this.f.c.a();
                if ((object3 = ((d)object3).c((Class)object)) == null) continue;
            }
            object2 = this.f;
            object3 = this.f.c;
            object = this.a.o;
            e93_0 e93_02 = new e93_0(this, (BP1$a)object2);
            object3.d((Az2)((Object)object), e93_02);
            bl2 = true;
        }
        return bl2;
    }

    public final void c(qn1_0 qn1_02, Exception exception, ei0_0 ei0_02, pi0_0 object) {
        object = this.b;
        pi0_0 pi0_02 = this.f.c.e();
        object.c(qn1_02, exception, ei0_02, pi0_02);
    }

    public final void cancel() {
        Object object = this.f;
        if (object != null) {
            object = ((BP1$a)object).c;
            object.cancel();
        }
    }

    public final void d() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean e(Object object) {
        void var1_4;
        int n3;
        List<Object> list;
        block9: {
            boolean bl2;
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
            block8: {
                list = "SourceGenerator";
                n3 = kx1.a;
                SystemClock.elapsedRealtimeNanos();
                n3 = 0;
                try {
                    object7 = this.a;
                    object7 = ((d)object7).c;
                    object7 = ((com.bumptech.glide.c)((Object)object7)).b();
                    object7 = ((Registry)object7).h(object);
                    object6 = object7.a();
                    object5 = this.a;
                    object5 = ((d)object5).e(object6);
                    object4 = this.a;
                    object4 = ((d)object4).i;
                    di0 di02 = new di0((Ez0)object5, object6, (Z92)object4);
                    object4 = this.f;
                    object4 = ((BP1$a)object4).a;
                    object3 = this.a;
                    object2 = ((d)object3).n;
                    object6 = new ci0((qn1_0)object4, (qn1_0)object2);
                    object4 = ((d)object3).h;
                    object4 = (f$c)object4;
                    object4 = ((f$c)object4).a();
                    object4.a((qn1_0)object6, di02);
                    bl2 = 2 != 0;
                    bl2 = Log.isLoggable((String)((Object)list), (int)(bl2 ? 1 : 0));
                    if (!bl2) break block8;
                    ((ci0)object6).toString();
                    object.toString();
                    object5.toString();
                    SystemClock.elapsedRealtimeNanos();
                }
                catch (Throwable throwable) {
                    break block9;
                }
            }
            object5 = object4.b((qn1_0)object6);
            bl2 = true;
            if (object5 != null) {
                this.g = object6;
                list = this.f;
                list = ((BP1$a)((Object)list)).a;
                list = Collections.singletonList(list);
                object7 = this.a;
                this.d = object = new b(list, (d)object7, this);
                this.f.c.b();
                return bl2;
            }
            int n4 = 3;
            boolean bl3 = Log.isLoggable((String)((Object)list), (int)n4);
            if (bl3) {
                list = this.g;
                Objects.toString(list);
                object.toString();
            }
            try {
                object4 = this.b;
                object = this.f;
                object3 = ((BP1$a)object).a;
                object2 = object7.a();
                object = this.f;
                ei0_0 ei0_02 = ((BP1$a)object).c;
                object = this.f;
                object = ((BP1$a)object).c;
                pi0_0 pi0_02 = object.e();
                object = this.f;
                qn1_0 qn1_02 = ((BP1$a)object).a;
                object4.a((qn1_0)object3, object2, ei0_02, pi0_02, qn1_02);
                return false;
            }
            catch (Throwable throwable) {
                n3 = 1;
            }
        }
        if (n3 == 0) {
            list = this.f.c;
            list.b();
        }
        throw var1_4;
    }
}


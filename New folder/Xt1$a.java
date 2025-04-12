/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.view.inputmethod.BaseInputConnection
 */
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Xt1$a
implements Mh1 {
    public final /* synthetic */ xt1_0 a;

    public Xt1$a(xt1_0 xt1_02) {
        this.a = xt1_02;
    }

    public final void a(XF2 xF2) {
        xt1_0 xt1_02 = this.a;
        ArrayList arrayList = xt1_02.j;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object t3 = ((WeakReference)xt1_02.j.get(i3)).get();
            boolean bl2 = Intrinsics.areEqual(t3, xF2);
            if (!bl2) continue;
            xt1_02.j.remove(i3);
            return;
        }
    }

    public final void b(KeyEvent keyEvent) {
        ((BaseInputConnection)this.a.k.getValue()).sendKeyEvent(keyEvent);
    }

    public final void c(ArrayList arrayList) {
        this.a.c.invoke(arrayList);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        Nt1 nt1 = this.a.m;
        Object object = nt1.c;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                block3: {
                    try {
                        nt1.f = bl4;
                        nt1.g = bl5;
                        nt1.h = bl6;
                        nt1.i = bl7;
                        if (!bl2) break block3;
                        nt1.e = bl2 = true;
                        object2 = nt1.j;
                        if (object2 == null) break block3;
                        nt1.a();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                nt1.d = bl3;
                object2 = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    public final void e(int n3) {
        Function1 function1 = this.a.d;
        Qe1 qe1 = new Qe1(n3);
        function1.invoke(qe1);
    }
}


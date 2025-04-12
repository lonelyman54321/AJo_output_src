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

public final class Dl3 {
    public final /* synthetic */ Bl3 a;

    public Dl3(Bl3 bl3) {
        this.a = bl3;
    }

    public final void a(YF2 yF2) {
        Bl3 bl3 = this.a;
        ArrayList arrayList = bl3.i;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object t3 = ((WeakReference)bl3.i.get(i3)).get();
            boolean bl2 = Intrinsics.areEqual(t3, yF2);
            if (!bl2) continue;
            bl3.i.remove(i3);
            return;
        }
    }

    public final void b(ArrayList arrayList) {
        this.a.e.invoke(arrayList);
    }

    public final void c(int n3) {
        Function1 function1 = this.a.f;
        Qe1 qe1 = new Qe1(n3);
        function1.invoke(qe1);
    }

    public final void d(KeyEvent keyEvent) {
        ((BaseInputConnection)this.a.j.getValue()).sendKeyEvent(keyEvent);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        uf0_0 uf0_02 = this.a.l;
        Object object = uf0_02.c;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                block3: {
                    try {
                        uf0_02.f = bl4;
                        uf0_02.g = bl5;
                        uf0_02.h = bl6;
                        uf0_02.i = bl7;
                        if (!bl2) break block3;
                        uf0_02.e = bl2 = true;
                        object2 = uf0_02.j;
                        if (object2 == null) break block3;
                        uf0_02.a();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                uf0_02.d = bl3;
                object2 = Unit.a;
                return;
            }
            throw throwable2;
        }
    }
}


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
import androidx.fragment.app.b$g;
import androidx.fragment.app.b$h;
import androidx.fragment.app.n$c;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c
extends Lambda
implements Function0 {
    public final /* synthetic */ b$g c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public c(ViewGroup viewGroup, b$g b$g, Object object) {
        this.c = b$g;
        this.d = object;
        this.e = viewGroup;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke() {
        Object object;
        int n3;
        Object object2;
        GW0 gW0;
        Object object3;
        Object object4;
        block4: {
            boolean bl2;
            block3: {
                object4 = this.c;
                object3 = ((b$g)object4).c;
                bl2 = object3 instanceof Collection;
                gW0 = ((b$g)object4).f;
                object2 = "FragmentManager";
                n3 = 2;
                if (!bl2) break block3;
                object = object3;
                object = (Collection)object3;
                bl2 = object.isEmpty();
                if (bl2) break block4;
            }
            object3 = object3.iterator();
            while (bl2 = object3.hasNext()) {
                object = ((b$h)object3.next()).a;
                bl2 = ((n$c)object).g;
                if (bl2) continue;
                Log.isLoggable((String)object2, (int)n3);
                object3 = new Object();
                bl2 = false;
                object = ((b$h)((b$g)object4).c.get((int)0)).a.c;
                n3 = 0;
                object2 = new hn0_0(object4, 0);
                object4 = this.d;
                gW0.u((Fragment)object, object4, (fl_0)object3, (Runnable)object2);
                ((fl_0)object3).a();
                return Unit.a;
            }
        }
        Log.isLoggable((String)object2, (int)n3);
        object3 = ((b$g)object4).q;
        Intrinsics.checkNotNull(object3);
        object2 = this.e;
        object = new gn0_0((b$g)object4, (ViewGroup)object2);
        gW0.d(object3, (gn0_0)object);
        return Unit.a;
    }
}


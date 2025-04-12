/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.d$a;
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from androidx.lifecycle.d
 */
public final class d_0
implements n {
    public final jm0_1 a;
    public final n b;

    public d_0(jm0_1 jm0_12, n n3) {
        Intrinsics.checkNotNullParameter(jm0_12, "defaultLifecycleObserver");
        this.a = jm0_12;
        this.b = n3;
    }

    public final void k(mu1_1 object, i$a i$a) {
        Intrinsics.checkNotNullParameter(object, "source");
        Intrinsics.checkNotNullParameter((Object)i$a, "event");
        Object object2 = d$a.$EnumSwitchMapping$0;
        int n3 = i$a.ordinal();
        int n4 = object2[n3];
        jm0_1 jm0_12 = this.a;
        switch (n4) {
            default: {
                break;
            }
            case 7: {
                object = new IllegalArgumentException("ON_ANY must not been send by anybody");
                throw object;
            }
            case 6: {
                jm0_12.onDestroy((mu1_1)object);
                break;
            }
            case 5: {
                jm0_12.onStop((mu1_1)object);
                break;
            }
            case 4: {
                jm0_12.w((mu1_1)object);
                break;
            }
            case 3: {
                jm0_12.p((mu1_1)object);
                break;
            }
            case 2: {
                jm0_12.onStart((mu1_1)object);
                break;
            }
            case 1: {
                jm0_12.A((mu1_1)object);
            }
        }
        object2 = this.b;
        if (object2 != null) {
            object2.k((mu1_1)object, i$a);
        }
    }
}


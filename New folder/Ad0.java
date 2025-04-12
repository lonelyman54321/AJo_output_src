/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import java.util.concurrent.Callable;

public final class Ad0
implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Ad0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - void declaration
     */
    public final Object call() {
        int bl2 = this.a;
        switch (bl2) {
            default: {
                void var1_4;
                Object object = (WI3)this.b;
                Object object2 = ((WI3)object).j;
                String string2 = ((WI3)object).c;
                object2 = object2.h(string2);
                hI3$b hI3$b = hI3$b.ENQUEUED;
                if (object2 == hI3$b) {
                    object2 = hI3$b.RUNNING;
                    object = ((WI3)object).j;
                    object.d((hI3$b)((Object)object2), string2);
                    object.A(string2);
                    int n3 = -256;
                    object.w(n3, string2);
                    boolean bl3 = true;
                } else {
                    boolean bl4 = false;
                    object = null;
                }
                return (boolean)var1_4;
            }
            case 0: 
        }
        return CrashlyticsCore.b((CrashlyticsCore)this.b);
    }
}


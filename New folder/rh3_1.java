/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from rH3
 */
public final class rh3_1
implements n {
    public final /* synthetic */ i90_0 a;
    public final /* synthetic */ wn2 b;
    public final /* synthetic */ FF2 c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ View e;

    public rh3_1(i90_0 i90_02, wn2 wn22, FF2 fF2, Ref$ObjectRef ref$ObjectRef, View view) {
        this.a = i90_02;
        this.b = wn22;
        this.c = fF2;
        this.d = ref$ObjectRef;
        this.e = view;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(mu1_1 object, i$a object2) {
        block12: {
            int n3 = 1;
            Object object3 = rH3$a.$EnumSwitchMapping$0;
            int n4 = object2.ordinal();
            if ((n4 = object3[n4]) == n3) {
                rH3$b rH3$b;
                object2 = this.a;
                object3 = (Object)l90_0.UNDISPATCHED;
                Ref$ObjectRef ref$ObjectRef = this.d;
                FF2 fF2 = this.c;
                View view = this.e;
                rH3$b rH3$b2 = rH3$b;
                rH3$b = new rH3$b(ref$ObjectRef, fF2, (mu1_1)object, this, view, null);
                boolean bl2 = false;
                object = null;
                Ae3.d((i90_0)object2, null, (l90_0)((Object)object3), rH3$b, n3);
                return;
            }
            int n7 = 2;
            if (n4 != n7) {
                n7 = 3;
                if (n4 == n7) {
                    object = this.c;
                    ((FF2)object).E();
                    return;
                }
                n7 = 4;
                if (n4 != n7) {
                    return;
                }
                object = this.c;
                ((FF2)object).z();
                return;
            }
            object = this.b;
            if (object != null) {
                object = ((wn2)object).b;
                object2 = ((lp1_0)object).a;
                synchronized (object2) {
                    Throwable throwable2;
                    block11: {
                        List list;
                        block10: {
                            try {
                                boolean bl3 = ((lp1_0)object).a();
                                if (!bl3) break block10;
                            }
                            catch (Throwable throwable2) {
                                break block11;
                            }
                        }
                        object3 = ((lp1_0)object).b;
                        ((lp1_0)object).b = list = ((lp1_0)object).c;
                        ((lp1_0)object).c = (List)object3;
                        ((lp1_0)object).d = n3;
                        n7 = object3.size();
                        list = null;
                        for (int i3 = 0; i3 < n7; i3 += n3) {
                            Object object4 = object3.get(i3);
                            object4 = (f80_0)object4;
                            Object object5 = tl2_2.b;
                            object5 = Unit.a;
                            object4.resumeWith(object5);
                        }
                        object3.clear();
                        object = Unit.a;
                        break block12;
                    }
                    throw throwable2;
                }
            }
        }
        object = this.c;
        ((FF2)object).L();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import androidx.navigation.i;
import androidx.navigation.i$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from YT1
 */
public final class yt1_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Function1 c;

    public yt1_0(Function1 function1) {
        this.c = function1;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        Object object2;
        Object object3;
        Object object4;
        block6: {
            int n3;
            block5: {
                object = (gk_0)object;
                object4 = ((d)object.a()).b;
                object3 = "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination";
                Intrinsics.checkNotNull(object4, (String)object3);
                object4 = (A20$a)object4;
                n3 = i.j;
                object4 = i$a.b((i)object4).iterator();
                do {
                    n3 = (int)(object4.hasNext() ? 1 : 0);
                    object2 = null;
                    if (n3 == 0) break block5;
                    object3 = (i)object4.next();
                    boolean bl2 = object3 instanceof A20$a;
                    if (bl2) {
                        object3 = ((A20$a)object3).p;
                        if (object3 != null) {
                            object3 = (W63)object3.invoke(object);
                            continue;
                        }
                    } else {
                        bl2 = object3 instanceof z20$a;
                        if (bl2) {
                            object3 = (z20$a)object3;
                            object3.getClass();
                        }
                    }
                    n3 = 0;
                    object3 = null;
                } while (object3 == null);
                break block6;
            }
            n3 = 0;
            object3 = null;
        }
        if (object3 != null) return object3;
        object4 = this.c;
        if (object4 == null) return object2;
        object2 = object = object4.invoke(object);
        return (W63)object;
    }
}


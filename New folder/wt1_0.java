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
 * Renamed from WT1
 */
public final class wt1_0
extends Lambda
implements Function1 {
    public final /* synthetic */ A20 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ tr1_0 f;

    public wt1_0(A20 a20, Function1 function1, Function1 function12, tr1_0 tr1_02) {
        this.c = a20;
        this.d = function1;
        this.e = function12;
        this.f = tr1_02;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        Object object2;
        int n3;
        Object object3;
        Object object4;
        block5: {
            block4: {
                object = (gk_0)object;
                object4 = ((d)object.a()).b;
                Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                object4 = (A20$a)object4;
                object3 = (Boolean)this.c.c.getValue();
                n3 = ((Boolean)object3).booleanValue();
                object2 = null;
                if (n3 == 0 && (n3 = (int)(aU1.c((tr1_0)(object3 = this.f)) ? 1 : 0)) == 0) break block4;
                n3 = i.j;
                object4 = i$a.b((i)object4).iterator();
                break block5;
            }
            n3 = i.j;
            object4 = i$a.b((i)object4).iterator();
            while ((n3 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                block8: {
                    block7: {
                        boolean bl2;
                        block6: {
                            object3 = (i)object4.next();
                            bl2 = object3 instanceof A20$a;
                            if (!bl2) break block6;
                            object3 = ((A20$a)object3).l;
                            if (object3 == null) break block7;
                            object3 = (yA0)object3.invoke(object);
                            break block8;
                        }
                        bl2 = object3 instanceof z20$a;
                        if (bl2) {
                            object3 = (z20$a)object3;
                            object3.getClass();
                        }
                    }
                    n3 = 0;
                    object3 = null;
                }
                if (object3 == null) continue;
                object2 = object3;
                break;
            }
            if (object2 != null) return object2;
            object4 = this.e;
            object2 = object = object4.invoke(object);
            return (yA0)object;
        }
        while ((n3 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
            block11: {
                block10: {
                    boolean bl3;
                    block9: {
                        object3 = (i)object4.next();
                        bl3 = object3 instanceof A20$a;
                        if (!bl3) break block9;
                        object3 = ((A20$a)object3).n;
                        if (object3 == null) break block10;
                        object3 = (yA0)object3.invoke(object);
                        break block11;
                    }
                    bl3 = object3 instanceof z20$a;
                    if (bl3) {
                        object3 = (z20$a)object3;
                        object3.getClass();
                    }
                }
                n3 = 0;
                object3 = null;
            }
            if (object3 == null) continue;
            object2 = object3;
            break;
        }
        if (object2 != null) return object2;
        object4 = this.d;
        object2 = object = object4.invoke(object);
        return (yA0)object;
    }
}


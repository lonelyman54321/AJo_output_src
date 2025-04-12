/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/*
 * Renamed from Is0
 */
public final class is0_0
extends Lambda
implements Function1 {
    public final /* synthetic */ cs0_0 c;
    public final /* synthetic */ js0_1 d;
    public final /* synthetic */ Ref$BooleanRef e;

    public is0_0(cs0_0 cs0_02, js0_1 js0_12, Ref$BooleanRef ref$BooleanRef) {
        this.c = cs0_02;
        this.d = js0_12;
        this.e = ref$BooleanRef;
        super(1);
    }

    public final Object invoke(Object object) {
        block9: {
            block8: {
                boolean bl2;
                block7: {
                    object = (js0_1)object;
                    bl2 = ((LP1$c)object).m;
                    if (bl2) break block7;
                    object = Xr3.SkipSubtreeAndContinueTraversal;
                    break block8;
                }
                Object object2 = ((js0_1)object).q;
                if (object2 != null) break block9;
                object2 = this.c;
                ((js0_1)object).q = object2 = (ls0_0)((js0_1)object).n.invoke(object2);
                boolean bl3 = false;
                if (object2 != null) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    object2 = null;
                }
                if (bl2) {
                    Ds0 ds0 = go0.g(this.d).getDragAndDropManager();
                    ds0.a((Es0)object);
                }
                object = this.e;
                boolean bl4 = ((Ref$BooleanRef)object).element;
                if (bl4 || bl2) {
                    bl3 = true;
                }
                ((Ref$BooleanRef)object).element = bl3;
                object = Xr3.ContinueTraversal;
            }
            return object;
        }
        bh1_1.c("DragAndDropTarget self reference must be null at the start of a drag and drop session");
        throw null;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.DispatchException;

/*
 * Renamed from L90
 */
public final class l90_0
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ l90_0[] $VALUES;
    public static final /* enum */ l90_0 ATOMIC;
    public static final /* enum */ l90_0 DEFAULT;
    public static final /* enum */ l90_0 LAZY;
    public static final /* enum */ l90_0 UNDISPATCHED;

    private static final /* synthetic */ l90_0[] $values() {
        l90_0 l90_02 = DEFAULT;
        l90_02 = LAZY;
        l90_02 = ATOMIC;
        l90_02 = UNDISPATCHED;
        l90_0[] l90_0Array = new l90_0[]{l90_02, l90_02, l90_02, l90_02};
        return l90_0Array;
    }

    static {
        Enum[] enumArray = new l90_0("DEFAULT", 0);
        DEFAULT = enumArray;
        enumArray = new l90_0("LAZY", 1);
        LAZY = enumArray;
        enumArray = new l90_0("ATOMIC", 2);
        ATOMIC = enumArray;
        enumArray = new l90_0("UNDISPATCHED", 3);
        UNDISPATCHED = enumArray;
        enumArray = l90_0.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private l90_0() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public static l90_0 valueOf(String string2) {
        return Enum.valueOf(l90_0.class, string2);
    }

    public static l90_0[] values() {
        return (l90_0[])$VALUES.clone();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void invoke(Function2 object, Object object2, f80_0 f80_02) {
        Serializable serializable;
        Throwable throwable3;
        Throwable throwable22;
        Object object3;
        Object object4;
        block13: {
            block12: {
                int n3;
                block14: {
                    object4 = L90$a.$EnumSwitchMapping$0;
                    int n4 = this.ordinal();
                    int n7 = object4[n4];
                    if (n7 == (n4 = 1)) {
                        el_2.c((Function2)object, object2, f80_02);
                        return;
                    }
                    object3 = "completion";
                    n3 = 2;
                    if (n7 == n3) {
                        object4 = "<this>";
                        Intrinsics.checkNotNullParameter(object, (String)object4);
                        Intrinsics.checkNotNullParameter(f80_02, (String)object3);
                        object = zj1_2.b(zj1_2.a((Function2)object, object2, f80_02));
                        object2 = tl2_2.b;
                        object2 = Unit.a;
                        object.resumeWith(object2);
                        return;
                    }
                    int n8 = 3;
                    if (n7 != n8) {
                        int n10 = 4;
                        if (n7 == n10) {
                            return;
                        }
                        object = new NoWhenBranchMatchedException();
                        throw object;
                    }
                    Intrinsics.checkNotNullParameter(f80_02, (String)object3);
                    object4 = f80_02.getContext();
                    n4 = 0;
                    object3 = null;
                    object3 = bn3_0.c((CoroutineContext)object4, null);
                    String string2 = "frame";
                    try {
                        Intrinsics.checkNotNullParameter(f80_02, string2);
                    }
                    catch (Throwable throwable22) {
                        break block13;
                    }
                    n8 = object instanceof xv_1;
                    if (n8 != 0) break block14;
                    object = zj1_2.c((Function2)object, object2, f80_02);
                    break block12;
                }
                object = TypeIntrinsics.beforeCheckcastToFunctionOfArity(object, n3);
                object = (Function2)object;
                object = object.invoke(object2, f80_02);
            }
            try {
                bn3_0.a((CoroutineContext)object4, object3);
                object2 = j90_0.COROUTINE_SUSPENDED;
                if (object == object2) return;
                object2 = tl2_2.b;
                f80_02.resumeWith(object);
                return;
            }
            catch (Throwable throwable3) {}
        }
        bn3_0.a((CoroutineContext)object4, object3);
        throw throwable22;
        boolean bl2 = throwable3 instanceof DispatchException;
        if (bl2) {
            serializable = ((DispatchException)throwable3).a;
        }
        object2 = tl2_2.b;
        serializable = vl2_2.a(serializable);
        f80_02.resumeWith(serializable);
    }

    public final boolean isLazy() {
        boolean bl2;
        l90_0 l90_02 = LAZY;
        if (this == l90_02) {
            bl2 = true;
        } else {
            bl2 = false;
            l90_02 = null;
        }
        return bl2;
    }
}


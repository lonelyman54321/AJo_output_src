/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public class ul$i
extends ul$j {
    public final yn1_2 c;

    public ul$i(yn1_2 yn1_22, Function1 function1) {
        super(function1);
        this.c = yn1_22;
    }

    public static Object c(M11 object, yn1_2 yn1_22) {
        Object e2;
        Object var4_4;
        String string2;
        block4: {
            boolean bl2;
            block3: {
                Object object2;
                boolean bl3;
                object = ((Iterable)((M11)object).f).iterator();
                do {
                    bl2 = object.hasNext();
                    string2 = "<this>";
                    var4_4 = null;
                    if (!bl2) break block3;
                    e2 = object.next();
                    if (e2 != null) {
                        object2 = e2.getClass();
                        Intrinsics.checkNotNullParameter(object2, string2);
                        object2 = Reflection.getOrCreateKotlinClass(object2);
                        continue;
                    }
                    bl3 = false;
                    object2 = null;
                } while (!(bl3 = Intrinsics.areEqual(object2, yn1_22)));
                break block4;
            }
            bl2 = false;
            e2 = null;
        }
        Intrinsics.checkNotNullParameter(yn1_22, string2);
        boolean bl4 = yn1_22.isInstance(e2);
        if (bl4) {
            object = "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast";
            Intrinsics.checkNotNull(e2, (String)object);
            var4_4 = e2;
        }
        return var4_4;
    }

    public final void a(Collection object) {
        boolean bl2;
        Object object2;
        Object object3;
        boolean bl3;
        object = (Iterable)object;
        Object object4 = new ArrayList();
        object = object.iterator();
        while (bl3 = object.hasNext()) {
            object3 = object.next();
            object2 = object3;
            object2 = ((M11)object3).c;
            if (object2 == null) continue;
            ((ArrayList)object4).add(object3);
        }
        object = this.b;
        object3 = new ArrayList();
        object4 = ((ArrayList)object4).iterator();
        while (bl2 = object4.hasNext()) {
            object2 = (M11)object4.next();
            yn1_2 yn1_22 = this.c;
            if ((object2 = ul$i.c(object2, yn1_22)) == null) continue;
            ((ArrayList)object3).add(object2);
        }
        object4 = CollectionsKt.o0(object3);
        object.addAll(object4);
    }

    public final boolean b(M11 object) {
        boolean bl2;
        Object object2 = ((M11)object).c;
        if (object2 != null && (object = ul$i.c((M11)object, (yn1_2)(object2 = this.c))) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/*
 * Renamed from wI2
 */
public final class wi2_0 {
    public static final String a(Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object);
        stringBuilder.append(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
        return stringBuilder.toString();
    }

    public static final Object b(Object[] objectArray, ds2_0 ds2_02, Function0 function0, b30_0 b30_02, int n3, int n4) {
        Object object;
        boolean bl2;
        Object object2;
        String string2;
        n3 = n4 & 2;
        if (n3 != 0) {
            ds2_02 = CS2.a;
            string2 = "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>";
            Intrinsics.checkNotNull(ds2_02, string2);
        }
        n3 = b30_02.F();
        n4 = CharsKt.checkRadix(36);
        string2 = Integer.toString(n3, n4);
        Intrinsics.checkNotNullExpressionValue(string2, "toString(this, checkRadix(radix))");
        Intrinsics.checkNotNull(ds2_02, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        Object object3 = kS2.a;
        object3 = (iS2)b30_02.j((H30)object3);
        Object object4 = b30_02.v();
        Object[] objectArray2 = b30$a.a;
        Object object5 = null;
        if (object4 == objectArray2) {
            as2_1 as2_12;
            if (object3 != null && (object4 = object3.f(string2)) != null) {
                object2 = ds2_02.b;
                object4 = object2.invoke(object4);
            } else {
                bl2 = false;
                object4 = null;
            }
            if (object4 == null) {
                object4 = function0.invoke();
            }
            object = object4;
            object4 = as2_12;
            object2 = ds2_02;
            as2_12 = new as2_1(ds2_02, (iS2)object3, string2, object, objectArray);
            b30_02.o(as2_12);
        }
        object2 = object4;
        object2 = (as2_1)object4;
        object4 = ((as2_1)object2).e;
        bl2 = Arrays.equals(objectArray, object4);
        if (bl2) {
            object5 = ((as2_1)object2).d;
        }
        if (object5 == null) {
            object5 = function0.invoke();
        }
        boolean bl3 = b30_02.x(object2);
        bl2 = b30_02.x(ds2_02);
        bl3 |= bl2;
        bl2 = b30_02.x(object3);
        bl3 |= bl2;
        bl2 = b30_02.J(string2);
        bl3 |= bl2;
        bl2 = b30_02.x(object5);
        bl3 |= bl2;
        bl2 = b30_02.x(objectArray);
        object4 = b30_02.v();
        if ((bl3 |= bl2) || object4 == objectArray2) {
            object4 = function0;
            object = string2;
            objectArray2 = objectArray;
            function0 = new vi2_0((as2_1)object2, ds2_02, (iS2)object3, string2, object5, objectArray);
            b30_02.o(function0);
        }
        object4 = (Function0)object4;
        objectArray = ly0_0.a;
        b30_02.q((Function0)object4);
        return object5;
    }
}


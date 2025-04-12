/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.inputmethod.InputMethodManager
 */
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Te1$b
extends Lambda
implements Function0 {
    public static final Te1$b c;

    static {
        Te1$b te1$b;
        c = te1$b = new Lambda(0);
    }

    public final Object invoke() {
        Te1$a te1$a;
        Object object = InputMethodManager.class;
        Object object2 = "mServedView";
        object2 = ((Class)object).getDeclaredField((String)object2);
        boolean bl2 = true;
        ((AccessibleObject)object2).setAccessible(bl2);
        Object object3 = "mNextServedView";
        object3 = ((Class)object).getDeclaredField((String)object3);
        ((AccessibleObject)object3).setAccessible(bl2);
        String string2 = "mH";
        object = ((Class)object).getDeclaredField(string2);
        ((AccessibleObject)object).setAccessible(bl2);
        string2 = "hField";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        string2 = "servedViewField";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        string2 = "nextServedViewField";
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        try {
            te1$a = new Te1$d((Field)object, (Field)object2, (Field)object3);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            te1$a = Te1$c.a;
        }
        return te1$a;
    }
}


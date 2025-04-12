/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 */
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

public final class Te1$d
extends Te1$a {
    public final Field a;
    public final Field b;
    public final Field c;

    public Te1$d(Field field, Field field2, Field field3) {
        Intrinsics.checkNotNullParameter(field, "hField");
        Intrinsics.checkNotNullParameter(field2, "servedViewField");
        Intrinsics.checkNotNullParameter(field3, "nextServedViewField");
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    public final boolean a(InputMethodManager inputMethodManager) {
        boolean bl2;
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(inputMethodManager, (String)object);
        object = this.c;
        try {
            ((Field)object).set(inputMethodManager, null);
            bl2 = true;
        }
        catch (IllegalAccessException illegalAccessException) {
            bl2 = false;
            inputMethodManager = null;
        }
        return bl2;
    }

    public final Object b(InputMethodManager object) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = this.a;
        try {
            object = ((Field)object2).get(object);
        }
        catch (IllegalAccessException illegalAccessException) {
            object = null;
        }
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final View c(InputMethodManager object) {
        void var2_6;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Object var2_4 = null;
        Field field = this.b;
        Object object2 = field.get(object);
        try {
            View view;
            View view2 = view = (View)object2;
            return var2_6;
        }
        catch (ClassCastException | IllegalAccessException exception) {
            return var2_6;
        }
    }
}


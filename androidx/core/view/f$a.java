/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.core.view;

import android.view.View;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;

public final class f$a {
    public static final Field a;
    public static final Field b;
    public static final Field c;
    public static final boolean d;

    static {
        AnnotatedElement annotatedElement = View.class;
        String string2 = "mAttachInfo";
        annotatedElement = ((Class)annotatedElement).getDeclaredField(string2);
        a = annotatedElement;
        boolean bl2 = true;
        ((AccessibleObject)annotatedElement).setAccessible(bl2);
        annotatedElement = "android.view.View$AttachInfo";
        annotatedElement = Class.forName((String)((Object)annotatedElement));
        Object object = "mStableInsets";
        object = ((Class)annotatedElement).getDeclaredField((String)object);
        b = object;
        ((AccessibleObject)object).setAccessible(bl2);
        object = "mContentInsets";
        annotatedElement = ((Class)annotatedElement).getDeclaredField((String)object);
        c = annotatedElement;
        try {
            ((AccessibleObject)annotatedElement).setAccessible(bl2);
            d = bl2;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            reflectiveOperationException.getMessage();
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Trace
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import androidx.core.provider.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class ft3 {
    public static final ot3 a;
    public static final WC1 b;

    static {
        Object object = gp3_0.c("TypefaceCompat static init");
        Trace.beginSection((String)object);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        a = n3 >= n4 ? (object = new ot3()) : (n3 >= (n4 = 28) ? (object = new lt3()) : (n3 >= (n4 = 26) ? (object = new lt3()) : (n3 >= (n4 = 24) && (object = ht3.c) != null ? (object = new ot3()) : (object = new ot3()))));
        b = object = new WC1(16);
        Trace.endSection();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Typeface a(Context context, iV0$a iV0$a, Resources resources, int n3, String string2, int n4, int n7, WK2$d wK2$d, boolean bl2) {
        Object object;
        Object object2;
        Object object3;
        block17: {
            int n8;
            int n10;
            block14: {
                int n14;
                Typeface typeface;
                Object[] objectArray;
                int n15;
                int n16;
                block16: {
                    block15: {
                        boolean bl3;
                        object3 = iV0$a;
                        object2 = wK2$d;
                        n10 = 2;
                        n16 = 0;
                        n15 = 1;
                        n8 = iV0$a instanceof iV0$d;
                        if (n8 == 0) break block14;
                        object3 = (iV0$d)iV0$a;
                        objectArray = ((iV0$d)object3).e;
                        if (objectArray == null || (bl3 = objectArray.isEmpty())) break block15;
                        objectArray = Typeface.create((String)objectArray, (int)0);
                        typeface = Typeface.create((Typeface)Typeface.DEFAULT, (int)0);
                        if (objectArray != null && !(bl3 = objectArray.equals((Object)typeface))) break block16;
                    }
                    n8 = 0;
                    objectArray = null;
                }
                if (objectArray != null) {
                    if (object2 != null) {
                        ((WK2$d)object2).callbackSuccessAsync((Typeface)objectArray, null);
                    }
                    return objectArray;
                }
                boolean bl4 = bl2 ? (n8 = ((iV0$d)object3).d) == 0 : object2 == null;
                if (bl2) {
                    n14 = n8 = ((iV0$d)object3).c;
                } else {
                    n8 = -1;
                    n14 = -1;
                }
                Handler handler = WK2$d.getHandler(null);
                ft3$a ft3$a = new Object();
                ft3$a.a = object2;
                object2 = ((iV0$d)object3).a;
                object3 = ((iV0$d)object3).b;
                if (object3 != null) {
                    objectArray = new Object[n10];
                    objectArray[0] = object2;
                    objectArray[n15] = object3;
                    object3 = new ArrayList(n10);
                    while (n16 < n10) {
                        object2 = objectArray[n16];
                        Objects.requireNonNull(object2);
                        ((ArrayList)object3).add(object2);
                        n16 += n15;
                    }
                    object3 = Collections.unmodifiableList(object3);
                } else {
                    object3 = new Object[n15];
                    object3[0] = object2;
                    object2 = new ArrayList(n15);
                    object3 = object3[0];
                    Objects.requireNonNull(object3);
                    ((ArrayList)object2).add(object3);
                    object3 = Collections.unmodifiableList(object2);
                }
                typeface = context;
                object3 = h.a(context, (List)object3, n7, bl4, n14, handler, ft3$a);
                n8 = n7;
                break block17;
            }
            object = a;
            object3 = (iV0$b)iV0$a;
            n8 = n7;
            object3 = ((ot3)object).a(context, (iV0$b)object3, resources, n7);
            if (wK2$d != null) {
                if (object3 != null) {
                    wK2$d.callbackSuccessAsync((Typeface)object3, null);
                } else {
                    n10 = -3;
                    wK2$d.callbackFailAsync(n10, null);
                }
            }
        }
        if (object3 != null) {
            object2 = b;
            object = ft3.b(resources, n3, string2, n4, n7);
            ((WC1)object2).put(object, object3);
        }
        return object3;
    }

    public static String b(Resources object, int n3, String string2, int n4, int n7) {
        StringBuilder stringBuilder = new StringBuilder();
        object = object.getResourcePackageName(n3);
        stringBuilder.append((String)object);
        char c2 = '-';
        stringBuilder.append(c2);
        stringBuilder.append(string2);
        stringBuilder.append(c2);
        stringBuilder.append(n4);
        stringBuilder.append(c2);
        stringBuilder.append(n3);
        stringBuilder.append(c2);
        stringBuilder.append(n7);
        return stringBuilder.toString();
    }
}


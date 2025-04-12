/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 */
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jI2
 */
public final class ji2_2 {
    /*
     * Enabled aggressive block sorting
     */
    public static final im2 a(Drawable object, List object2, b30_0 b30_02) {
        boolean bl2;
        Object object3;
        Intrinsics.checkNotNullParameter(object, "drawable");
        String string2 = "imagePlugins";
        Intrinsics.checkNotNullParameter(object2, string2);
        b30_02.K(409244552);
        b30_02.K(1168861164);
        boolean bl3 = b30_02.J(object);
        int n3 = b30_02.J(object2);
        Object object4 = b30_02.v();
        if ((bl3 |= n3) || object4 == (object3 = b30$a.a)) {
            Object object5;
            bl3 = object instanceof BitmapDrawable;
            if (bl3) {
                object4 = object;
                object4 = ((BitmapDrawable)object).getBitmap();
                Intrinsics.checkNotNullExpressionValue(object4, "getBitmap(...)");
                object5 = new ih_0((Bitmap)object4);
                object3 = new my_0((hd1_0)object5);
            } else {
                bl3 = object instanceof ColorDrawable;
                if (bl3) {
                    object4 = object;
                    object4 = (ColorDrawable)object;
                    n3 = object4.getColor();
                    long l2 = zx_0.c(n3);
                    object3 = new by_1(l2);
                } else {
                    object4 = object.mutate();
                    object5 = "mutate(...)";
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
                    object3 = new du0_2((Drawable)object4);
                }
            }
            object4 = object3;
            b30_02.o(object3);
        }
        object4 = (im2)object4;
        b30_02.E();
        object = bu0_0.a((Drawable)object);
        object3 = new ih_0((Bitmap)object);
        Intrinsics.checkNotNullParameter(object4, "<this>");
        Intrinsics.checkNotNullParameter(object2, string2);
        Intrinsics.checkNotNullParameter(object3, "imageBitmap");
        int n4 = 1134167668;
        b30_02.K(n4);
        object2 = (Iterable)object2;
        object = new ArrayList();
        object2 = object2.iterator();
        while (bl2 = object2.hasNext()) {
            Object t3 = object2.next();
            bl3 = t3 instanceof je1$c;
            if (!bl3) continue;
            ((ArrayList)object).add(t3);
        }
        object = ((ArrayList)object).iterator();
        while (true) {
            boolean bl4;
            if (!(bl4 = object.hasNext())) {
                b30_02.E();
                b30_02.E();
                return object4;
            }
            object2 = (je1$c)object.next();
            object4 = object2.a();
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
import android.graphics.Bitmap;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nA
 */
public final class na_2
implements Function1 {
    public final /* synthetic */ kd1_1 a;

    public /* synthetic */ na_2(kd1_1 kd1_12) {
        this.a = kd1_12;
    }

    public final Object invoke(Object object) {
        object = (qy_2)object;
        kd1_1 kd1_12 = this.a;
        Intrinsics.checkNotNullParameter(kd1_12, "$imageDetails");
        Object object2 = ((qy_2)object).a;
        aa_1 aa_12 = aa_1.a;
        if (object2 != null) {
            String string2 = kd1_12.a;
            Intrinsics.checkNotNull(object2);
            Object object3 = aa_1.b;
            object3.getClass();
            Intrinsics.checkNotNullParameter(string2, "id");
            Intrinsics.checkNotNullParameter(object2, "bitmap");
            object3 = ((pn1_1)object3).a;
            SoftReference<Bitmap> softReference = new SoftReference<Bitmap>((Bitmap)object2);
            ((ConcurrentHashMap)object3).put(string2, softReference);
            aa_12.getClass();
            boolean bl2 = aa_1.d(kd1_12);
            if (!bl2) {
                object = ((qy_2)object).a;
                Intrinsics.checkNotNull(object);
                kd1_12 = kd1_12.b;
                kd1_12.setImageBitmap((Bitmap)object);
            }
        } else {
            object = yn3_0.a;
            object2 = kd1_12.a;
            object2 = kp1_0.c("bottom tab image not found in disk with url : ", (String)object2);
            Object[] objectArray = new Object[]{};
            ((yn3$a)object).a((String)object2, objectArray);
            aa_12.getClass();
            aa_1.c(kd1_12);
        }
        return Unit.a;
    }
}


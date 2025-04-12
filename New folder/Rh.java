/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  android.text.Layout
 *  android.text.SegmentFinder
 *  android.text.TextPaint
 */
import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.TextPaint;
import kotlin.jvm.functions.Function2;

public final class Rh {
    public static final Rh a;

    static {
        Rh rh;
        a = rh = new Object();
    }

    public final int[] a(Ql3 ql3, RectF rectF, int n3, Function2 function2) {
        Object object;
        Object object2;
        int n4 = 1;
        if (n3 == n4) {
            object2 = jm.a;
            CharSequence charSequence = ql3.f.getText();
            KH3 kH3 = ql3.j();
            object = new lh3_0(charSequence, kH3);
            object2 = ((jm)object2).a((xx2_0)object);
        } else {
            Ph.a();
            object2 = ql3.f.getText();
            object = ql3.a;
            object2 = Mh.a(Oh.a((TextPaint)object, (CharSequence)object2));
        }
        ql3 = ql3.f;
        object = new Qh(function2);
        return Nh.a((Layout)ql3, rectF, (SegmentFinder)object2, (Qh)object);
    }
}


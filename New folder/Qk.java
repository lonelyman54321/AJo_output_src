/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ImageDecoder$Source
 *  android.graphics.drawable.AnimatedImageDrawable
 *  android.graphics.drawable.Drawable
 */
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class Qk {
    public final List a;
    public final Kp b;

    public Qk(ArrayList arrayList, Kp kp) {
        this.a = arrayList;
        this.b = kp;
    }

    public static qk$a_0 a(ImageDecoder.Source object, int n3, int n4, Z92 z92) {
        Fm0 fm0 = new Fm0(n3, n4, z92);
        if ((n3 = (int)(Kk.a((Drawable)(object = Jk.a(object, fm0))) ? 1 : 0)) != 0) {
            object = Lk.a((Drawable)object);
            qk$a_0 qk$a_0 = new qk$a_0((AnimatedImageDrawable)object);
            return qk$a_0;
        }
        StringBuilder stringBuilder = new StringBuilder("Received unexpected drawable type for animated image, failing: ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        IOException iOException = new IOException((String)object);
        throw iOException;
    }
}


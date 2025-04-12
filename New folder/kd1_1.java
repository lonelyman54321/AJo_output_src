/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.ImageView
 */
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Kd1
 */
public final class kd1_1 {
    public final String a;
    public final ImageView b;

    public kd1_1(ImageView imageView, String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        this.a = string2;
        this.b = imageView;
    }
}


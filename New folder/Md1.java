/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
import android.graphics.Bitmap;
import com.facebook.internal.c;
import com.facebook.internal.c$a;
import com.facebook.login.widget.ProfilePictureView;
import kotlin.jvm.internal.Intrinsics;

public final class Md1
implements Runnable {
    public final /* synthetic */ c a;
    public final /* synthetic */ Exception b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Bitmap d;
    public final /* synthetic */ c$a e;

    public /* synthetic */ Md1(c c2, Exception exception, boolean bl2, Bitmap bitmap, c$a c$a) {
        this.a = c2;
        this.b = exception;
        this.c = bl2;
        this.d = bitmap;
        this.e = c$a;
    }

    public final void run() {
        c c2 = this.a;
        Intrinsics.checkNotNullParameter(c2, "$request");
        Exception exception = this.b;
        boolean bl2 = this.c;
        Bitmap bitmap = this.d;
        qe1_0 qe1_02 = new qe1_0(c2, exception, bl2, bitmap);
        ProfilePictureView.a((ProfilePictureView)((Object)((zz_0)this.e).a), qe1_02);
    }
}


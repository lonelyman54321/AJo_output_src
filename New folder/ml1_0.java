/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.view.InputEvent
 */
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mL1
 */
public abstract class ml1_0 {
    public static final mL1$a a(Context context) {
        Object object = "context";
        Intrinsics.checkNotNullParameter(context, (String)object);
        Intrinsics.checkNotNullParameter(context, (String)object);
        int n3 = Build.VERSION.SDK_INT;
        h4 h42 = h4.a;
        int n4 = 30;
        if (n3 >= n4) {
            h42.a();
        }
        if (n3 >= n4) {
            n3 = h42.a();
        } else {
            n3 = 0;
            object = null;
        }
        int n7 = 5;
        n4 = 0;
        mL1$a mL1$a = null;
        if (n3 >= n7) {
            object = new kL1$a(context);
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            mL1$a = new mL1$a((kL1$a)object);
        }
        return mL1$a;
    }

    public abstract ListenableFuture b();

    public abstract ListenableFuture c(Uri var1, InputEvent var2);

    public abstract ListenableFuture d(Uri var1);
}


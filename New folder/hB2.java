/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.Choreographer$FrameCallback
 */
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;

public final class hB2
implements Choreographer.FrameCallback {
    public final /* synthetic */ ProfileInstallerInitializer a;
    public final /* synthetic */ Context b;

    public /* synthetic */ hB2(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = profileInstallerInitializer;
        this.b = context;
    }

    public final void doFrame(long l2) {
        Object object;
        ProfileInstallerInitializer profileInstallerInitializer = this.a;
        profileInstallerInitializer.getClass();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            profileInstallerInitializer = Y30.a(Looper.getMainLooper());
        } else {
            object = Looper.getMainLooper();
            profileInstallerInitializer = new Handler((Looper)object);
        }
        object = new Random();
        int n7 = Math.max(1000, 1);
        n4 = ((Random)object).nextInt(n7);
        Context context = this.b;
        vi1_2 vi1_22 = new vi1_2(context, 1);
        long l3 = n4 + 5000;
        profileInstallerInitializer.postDelayed(vi1_22, l3);
    }
}


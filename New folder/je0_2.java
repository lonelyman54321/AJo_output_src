/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.StrictMode$ThreadPolicy$Builder
 *  android.text.StaticLayout$Builder
 */
import android.app.Activity;
import android.os.StrictMode;
import android.text.StaticLayout;

/*
 * Renamed from jE0
 */
public final class je0_2 {
    public static /* bridge */ /* synthetic */ void a(Activity activity, String[] stringArray) {
        activity.requestPermissions(stringArray, 12345);
    }

    public static /* bridge */ /* synthetic */ void b(StrictMode.ThreadPolicy.Builder builder) {
        builder.detectResourceMismatches();
    }

    public static /* bridge */ /* synthetic */ void c(StaticLayout.Builder builder, int[] nArray, int[] nArray2) {
        builder.setIndents(nArray, nArray2);
    }
}


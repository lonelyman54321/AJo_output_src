/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.customviews.widgets.AjioTextView;

/*
 * Renamed from zE
 */
public final class ze_2 {
    public static /* bridge */ /* synthetic */ int a(Context context) {
        return context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS");
    }

    public static /* bridge */ /* synthetic */ void b(AjioTextView ajioTextView, int n3) {
        ajioTextView.setTextAppearance(n3);
    }
}


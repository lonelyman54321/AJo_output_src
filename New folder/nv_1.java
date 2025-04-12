/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;

/*
 * Renamed from Nv
 */
public final class nv_1
implements View.OnClickListener {
    public final void onClick(View view) {
        tj2_0.e(AnalyticsManager.Companion, "Show Home", "AJIO Button", "MENU SCREEN");
    }
}


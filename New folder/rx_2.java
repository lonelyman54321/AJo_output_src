/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.UiModeManager
 *  android.app.UiModeManager$ContrastChangeListener
 */
import android.app.UiModeManager;
import java.util.concurrent.Executor;

/*
 * Renamed from RX
 */
public final class rx_2 {
    public static /* bridge */ /* synthetic */ void a(UiModeManager uiModeManager, Executor executor, UiModeManager.ContrastChangeListener contrastChangeListener) {
        uiModeManager.addContrastChangeListener(executor, contrastChangeListener);
    }
}


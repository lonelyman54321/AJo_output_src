/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;

/*
 * Renamed from Iw0
 */
public interface iw0_1 {
    public void dismissProgress();

    public void initProgress();

    public void launchFeature(String var1, Bundle var2);

    public void onDownloadConfirmation(SplitInstallManager var1, SplitInstallSessionState var2);

    public void showProgress(String var1);
}


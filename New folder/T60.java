/*
 * Decompiled with CFR 0.152.
 */
import androidx.core.widget.ContentLoadingProgressBar;

public final class T60
implements Runnable {
    public final /* synthetic */ ContentLoadingProgressBar a;

    public /* synthetic */ T60(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.a = contentLoadingProgressBar;
    }

    public final void run() {
        ContentLoadingProgressBar contentLoadingProgressBar = this.a;
        ((Object)((Object)contentLoadingProgressBar)).getClass();
        System.currentTimeMillis();
        contentLoadingProgressBar.setVisibility(0);
    }
}


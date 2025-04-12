/*
 * Decompiled with CFR 0.152.
 */
import androidx.core.widget.ContentLoadingProgressBar;

public final class S60
implements Runnable {
    public final /* synthetic */ ContentLoadingProgressBar a;

    public /* synthetic */ S60(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.a = contentLoadingProgressBar;
    }

    public final void run() {
        this.a.setVisibility(8);
    }
}


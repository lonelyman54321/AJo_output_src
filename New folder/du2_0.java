/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.R$dimen;

/*
 * Renamed from du2
 */
public final class du2_0
implements Runnable {
    public final /* synthetic */ mu2 a;

    public /* synthetic */ du2_0(mu2 mu22) {
        this.a = mu22;
    }

    public final void run() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int n3;
        Resources resources;
        float f5;
        int n4;
        mu2 mu22 = this.a;
        Object object = mu22.e;
        if (object != null) {
            n4 = mu22.A;
            if (n4 != 0) {
                n4 = 0;
                f5 = 0.0f;
                resources = null;
            } else {
                n4 = 4;
                f5 = 5.6E-45f;
            }
            object.setVisibility(n4);
        }
        if ((object = mu22.j) != null) {
            resources = mu22.a.getResources();
            n3 = R$dimen.exo_styled_progress_margin_bottom;
            n4 = resources.getDimensionPixelSize(n3);
            marginLayoutParams = (ViewGroup.MarginLayoutParams)object.getLayoutParams();
            if (marginLayoutParams != null) {
                boolean bl2 = mu22.A;
                if (bl2) {
                    n4 = 0;
                    f5 = 0.0f;
                    resources = null;
                }
                marginLayoutParams.bottomMargin = n4;
                object.setLayoutParams((ViewGroup.LayoutParams)marginLayoutParams);
            }
            if ((n4 = object instanceof DefaultTimeBar) != 0) {
                object = (DefaultTimeBar)object;
                n4 = (int)(mu22.A ? 1 : 0);
                n3 = 0;
                marginLayoutParams = null;
                Rect rect = ((DefaultTimeBar)object).a;
                int n7 = 1;
                if (n4 != 0) {
                    resources = ((DefaultTimeBar)object).E;
                    boolean bl3 = resources.isStarted();
                    if (bl3) {
                        resources.cancel();
                    }
                    ((DefaultTimeBar)object).G = n7;
                    ((DefaultTimeBar)object).F = 0.0f;
                    object.invalidate(rect);
                } else {
                    n4 = mu22.z;
                    if (n4 == n7) {
                        resources = ((DefaultTimeBar)object).E;
                        n7 = (int)(resources.isStarted() ? 1 : 0);
                        if (n7 != 0) {
                            resources.cancel();
                        }
                        ((DefaultTimeBar)object).G = false;
                        ((DefaultTimeBar)object).F = 0.0f;
                        object.invalidate(rect);
                    } else {
                        n3 = 3;
                        if (n4 != n3) {
                            resources = ((DefaultTimeBar)object).E;
                            n3 = (int)(resources.isStarted() ? 1 : 0);
                            if (n3 != 0) {
                                resources.cancel();
                            }
                            ((DefaultTimeBar)object).G = false;
                            n4 = 1065353216;
                            ((DefaultTimeBar)object).F = f5 = 1.0f;
                            object.invalidate(rect);
                        }
                    }
                }
            }
        }
        object = mu22.y.iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            resources = (View)object.next();
            n3 = (int)(mu22.A ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(mu2.j((View)resources) ? 1 : 0)) != 0) {
                n3 = 4;
            } else {
                n3 = 0;
                marginLayoutParams = null;
            }
            resources.setVisibility(n3);
        }
    }
}


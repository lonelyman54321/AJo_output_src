/*
 * Decompiled with CFR 0.152.
 */
import ai.haptik.android.wrapper.sdk.HaptikWebView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.view.BaseActivity;
import kotlin.jvm.internal.Intrinsics;

public final class V7
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppCompatActivity b;

    public /* synthetic */ V7(AppCompatActivity appCompatActivity, int n3) {
        this.a = n3;
        this.b = appCompatActivity;
    }

    public final void run() {
        boolean bl2;
        boolean bl3;
        Object object = this.b;
        Object object2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                n3 = HaptikWebView.t0;
                object = (HaptikWebView)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                ((ComponentActivity)object).onBackPressed();
                return;
            }
            case 0: 
        }
        object = (AjioHomeActivity)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = ((BaseActivity)object).Y;
        if (object2 != null && (bl3 = ((DrawerLayout)((Object)object2)).isDrawerOpen(n3 = 0x800003)) == (bl2 = true) && (object = ((BaseActivity)object).Y) != null) {
            ((DrawerLayout)((Object)object)).closeDrawer(n3);
        }
    }
}


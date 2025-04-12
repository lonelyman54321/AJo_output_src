/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.BitmapFactory
 *  android.media.MediaMetadataRetriever
 */
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.home.landingpage.widgets.view.VideoComponentView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/*
 * Renamed from CB3
 */
public final class cb3_1
implements Callable {
    public final /* synthetic */ VideoComponentView a;
    public final /* synthetic */ String b;

    public /* synthetic */ cb3_1(VideoComponentView videoComponentView, String string2) {
        this.a = videoComponentView;
        this.b = string2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        block7: {
            var1_1 = this.b;
            this.a.getClass();
            var2_7 = null;
            try {
                var3_8 = new MediaMetadataRetriever();
            }
            catch (Throwable var1_4) {
                break block7;
            }
            catch (Exception var1_5) {
                // empty catch block
                ** GOTO lbl-1000
            }
            try {
                var2_7 = new HashMap();
                var3_8.setDataSource((String)var1_1, (Map)var2_7);
                var4_9 = 1000L;
                var1_1 = var3_8.getFrameAtTime(var4_9);
            }
            catch (Throwable var1_2) {
                var2_7 = var3_8;
                break block7;
            }
            catch (Exception var1_3) {
                var2_7 = var3_8;
                ** GOTO lbl-1000
            }
            var3_8.release();
            return var1_1;
lbl-1000:
            // 2 sources

            {
                yn3_0.a((Exception)var1_1);
                var1_1 = AJIOApplication.Companion;
                var1_1.getClass();
                var1_1 = AJIOApplication$a.a();
                var1_1 = var1_1.getResources();
                var6_10 = R$drawable.component_placeholder;
                var1_1 = BitmapFactory.decodeResource((Resources)var1_1, (int)var6_10);
                if (var2_7 == null) return var1_1;
            }
            var2_7.release();
            return var1_1;
        }
        if (var2_7 == null) throw var1_6;
        var2_7.release();
        throw var1_6;
    }
}


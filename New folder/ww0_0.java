/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.UnsupportedSchemeException
 */
import android.media.UnsupportedSchemeException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.drm.g;
import androidx.media3.exoplayer.drm.g$c;
import androidx.media3.exoplayer.drm.h;
import java.util.UUID;

/*
 * Renamed from WW0
 */
public final class ww0_0
implements g$c {
    /*
     * Unable to fully structure code
     */
    public final g a(UUID var1_1) {
        block9: {
            try {
                var2_2 = new h((UUID)var1_1);
                ** GOTO lbl27
            }
            catch (Exception var2_3) {
            }
            catch (UnsupportedSchemeException var2_4) {
                break block9;
            }
            var3_5 = new Exception(var2_3);
            throw var3_5;
        }
        try {
            var3_5 = new Exception(var2_4);
            throw var3_5;
        }
        catch (UnsupportedDrmException v0) {
            ** continue;
        }
lbl17:
        // 1 sources

        while (true) {
            var3_5 = "Failed to instantiate a FrameworkMediaDrm for uuid: ";
            var2_2 = new StringBuilder((String)var3_5);
            var2_2.append(var1_1);
            var2_2.append(".");
            var1_1 = var2_2.toString();
            Cx.c((String)var1_1);
            var2_2 = new Object();
lbl27:
            // 2 sources

            return var2_2;
        }
    }
}


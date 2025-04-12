/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.os.Trace
 *  android.view.View
 */
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Trace;
import android.view.View;
import androidx.core.provider.h$b;
import androidx.emoji2.text.f$b;
import androidx.emoji2.text.g;
import com.ril.ajio.R$string;
import java.nio.MappedByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from hV0
 */
public final class hv0_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hv0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block37: {
            block34: {
                block35: {
                    block33: {
                        var1_1 /* !! */  = null;
                        var2_9 = 1;
                        var3_10 = this.a;
                        switch (var3_10) {
                            default: {
                                var4_11 = (x32_0)this.b;
                                Intrinsics.checkNotNullParameter(var4_11, "this$0");
                                var5_13 = var4_11.c;
                                if (var5_13 != null) {
                                    var6_15 = StringCompanionObject.INSTANCE;
                                    var7_17 = R$string.acc_action_popup;
                                    var6_15 = hv3_0.K(var7_17);
                                    var8_18 = R$string.plp_sort_by;
                                    var9_20 = hv3_0.K(var8_18);
                                    var10_22 = new Object[var2_9];
                                    var10_22[0] = var9_20;
                                    var1_1 /* !! */  = "format(...)";
                                    zw_0.a(var10_22, var2_9, (String)var6_15, (String)var1_1 /* !! */ , var5_13);
                                }
                                if ((var1_1 /* !! */  = var4_11.c) == null) return;
                                ai0_2.a((View)var1_1 /* !! */ );
                                return;
                            }
                            case 0: 
                        }
                        var4_12 = (f$b)this.b;
                        var5_14 = "fetchFonts result is not OK. (";
                        var6_16 = var4_12.d;
                        synchronized (var6_16) {
                            try {
                                var9_21 = var4_12.h;
                                if (var9_21 == null) {
                                    return;
                                }
                            }
                            catch (Throwable var1_2) {
                                ** break block38
                            }
                        }
                        try {
                            var6_16 = var4_12.d();
                            var8_19 = var6_16.e;
                            var11_24 = 2;
                            if (var8_19 != var11_24) break block33;
                            var10_23 = var4_12.d;
                            ** synchronized (var10_23)
lbl41:
                            // 1 sources

                        }
                        catch (Throwable var1_3) {
                            break block34;
                        }
                    }
                    if (var8_19 != 0) ** GOTO lbl101
                    var5_14 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
                    var9_21 = ip3.b;
                    Trace.beginSection((String)var5_14);
                    var5_14 = var4_12.c;
                    var9_21 = var4_12.a;
                    var5_14.getClass();
                    var12_25 = new h$b[var2_9];
                    var12_25[0] = var6_16;
                    var5_14 = ft3.a;
                    var5_14 = "TypefaceCompat.createFromFontInfo";
                    var5_14 = gp3_0.c((String)var5_14);
                    Trace.beginSection((String)var5_14);
                    {
                    }
                    {
                        catch (Throwable var1_5) {
                            ** GOTO lbl-1000
                        }
                        {
                            var5_14 = ft3.a;
                            var1_1 /* !! */  = var5_14.b((Context)var9_21, (h$b[])var12_25, 0);
                        }
                        {
                            Trace.endSection();
                            var12_25 = var4_12.a;
                            var5_14 = var6_16.a;
                            var12_25 = pt3.e((Context)var12_25, (Uri)var5_14);
                            if (var12_25 == null || var1_1 /* !! */  == null) break block35;
                            var5_14 = "EmojiCompat.MetadataRepo.create";
                        }
                        try {
                            Trace.beginSection((String)var5_14);
                            var12_25 = ym1_1.b((MappedByteBuffer)var12_25);
                            var5_14 = new g((Typeface)var1_1 /* !! */ , (fo1_1)var12_25);
                        }
                        catch (Throwable var1_4) {}
                        {
                            Trace.endSection();
                        }
                        {
                            Trace.endSection();
                            var1_1 /* !! */  = var4_12.d;
                            ** synchronized (var1_1 /* !! */ )
                        }
lbl-1000:
                        // 1 sources

                        {
                            try {
                                var12_25 = var4_12.h;
                                if (var12_25 == null) ** break block36
                                var12_25.b((g)var5_14);
                            }
                            catch (Throwable var12_26) {
                                ** GOTO lbl-1000
                            }
                        }
                        {
                            var4_12.b();
                            return;
lbl-1000:
                            // 1 sources

                            {
                                throw var12_26;
                            }
                        }
                        var12_25 = ip3.b;
                        Trace.endSection();
                        throw var1_4;
                    }
                }
                var12_25 = "Unable to open file.";
                var1_1 /* !! */  = new RuntimeException((String)var12_25);
                throw var1_1 /* !! */ ;
lbl-1000:
                // 1 sources

                {
                    var12_25 = ip3.b;
                    Trace.endSection();
                    throw var1_5;
lbl101:
                    // 1 sources

                    var12_27 /* !! */  = new StringBuilder((String)var5_14);
                    var12_27 /* !! */ .append(var8_19);
                    var5_14 = ")";
                    var12_27 /* !! */ .append((String)var5_14);
                    var12_27 /* !! */  = var12_27 /* !! */ .toString();
                    var1_1 /* !! */  = new RuntimeException((String)var12_27 /* !! */ );
                    throw var1_1 /* !! */ ;
                }
            }
            var12_25 = var4_12.d;
            synchronized (var12_25) {
                try {
                    var5_14 = var4_12.h;
                    if (var5_14 == null) break block37;
                    var5_14.a(var1_3);
                }
                catch (Throwable var1_7) {
                    ** break block39
                }
            }
        }
        var4_12.b();
        return;
lbl-1000:
        // 1 sources

        {
            throw var1_7;
        }
lbl-1000:
        // 1 sources

        {
            throw var1_2;
        }
    }
}


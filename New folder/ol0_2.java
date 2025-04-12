/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 */
import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oL0
 */
public final class ol0_2
extends AsyncTask {
    public final String a;
    public final File b;
    public final ol0$a_0 c;

    public ol0_2(String string2, File file, ol0$a_0 ol0$a_0) {
        Intrinsics.checkNotNullParameter(string2, "uriStr");
        Intrinsics.checkNotNullParameter(file, "destFile");
        Intrinsics.checkNotNullParameter(ol0$a_0, "onSuccess");
        this.a = string2;
        this.b = file;
        this.c = ol0$a_0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Boolean a(String ... var1_1) {
        var2_4 = td0.b((Object)this);
        if (var2_4 != 0) {
            return null;
        }
        try {
            var2_4 = td0.b((Object)this);
            if (var2_4 != 0) {
                return null;
            }
            var3_5 = "args";
        }
        catch (Throwable var1_3) {
            td0.a((Object)this, var1_3);
            return null;
        }
        Intrinsics.checkNotNullParameter(var1_1 /* !! */ , (String)var3_5);
        var3_5 = this.a;
        var1_1 /* !! */  = new URL((String)var3_5);
        var3_5 = var1_1 /* !! */ .openConnection();
        var2_4 = var3_5.getContentLength();
        var1_1 /* !! */  = var1_1 /* !! */ .openStream();
        var4_6 /* !! */  = new DataInputStream((InputStream)var1_1 /* !! */ );
        var1_1 /* !! */  = (String[])new byte[var2_4];
        var4_6 /* !! */ .readFully((byte[])var1_1 /* !! */ );
        var4_6 /* !! */ .close();
        var5_7 = this.b;
        var4_6 /* !! */  = new FileOutputStream(var5_7);
        var3_5 = new DataOutputStream((OutputStream)var4_6 /* !! */ );
        var3_5.write((byte[])var1_1 /* !! */ );
        var3_5.flush();
        var3_5.close();
        return Boolean.TRUE;
        {
            catch (Throwable var1_2) {
                ** GOTO lbl-1000
            }
            catch (Exception v0) {}
            return Boolean.FALSE;
        }
lbl-1000:
        // 1 sources

        {
            td0.a((Object)this, var1_2);
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onPostExecute(Object object) {
        boolean bl2;
        block16: {
            bl2 = td0.b((Object)this);
            if (bl2) {
                return;
            }
            bl2 = td0.b((Object)this);
            if (!bl2) break block16;
            return;
        }
        object = (Boolean)object;
        boolean bl3 = (Boolean)object;
        bl2 = td0.b((Object)this);
        if (bl2) return;
        bl2 = td0.b((Object)this);
        if (bl2 || !bl3) return;
        try {
            object = this.c;
        }
        catch (Throwable throwable) {
            try {
                td0.a((Object)this, throwable);
                return;
            }
            catch (Throwable throwable2) {
                try {
                    td0.a((Object)this, throwable2);
                    return;
                }
                catch (Throwable throwable3) {
                    try {
                        td0.a((Object)this, throwable3);
                        return;
                    }
                    catch (Throwable throwable4) {
                        td0.a((Object)this, throwable4);
                        return;
                    }
                }
            }
        }
        File file = this.b;
        object.a(file);
    }
}


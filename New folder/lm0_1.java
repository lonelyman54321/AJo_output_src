/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import org.json.JSONObject;

/*
 * Renamed from lM0
 */
public final class lm0_1 {
    public final CleverTapInstanceConfig a;
    public final Context b;

    public lm0_1(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.b = context;
        this.a = cleverTapInstanceConfig;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(String charSequence) {
        Throwable throwable2;
        Object object;
        Object object2;
        block9: {
            block8: {
                Object object3;
                Object object4;
                Object object5 = "Failed to delete file";
                object2 = "File Deleted:";
                boolean bl2 = TextUtils.isEmpty((CharSequence)charSequence);
                if (bl2) {
                    return;
                }
                object = lm0_1.class;
                try {
                    object4 = this.b;
                    object4 = object4.getFilesDir();
                    object3 = new File((File)object4, (String)charSequence);
                    boolean bl3 = ((File)object3).exists();
                    if (!bl3) break block8;
                    boolean bl4 = ((File)object3).delete();
                    if (bl4) {
                        object5 = this.a;
                        object5 = ((CleverTapInstanceConfig)object5).b();
                        object3 = this.a;
                        object3 = ((CleverTapInstanceConfig)object3).a;
                        object4 = new StringBuilder((String)object2);
                        ((StringBuilder)object4).append((String)charSequence);
                        object2 = ((StringBuilder)object4).toString();
                        ((b)object5).b((String)object3, (String)object2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                object2 = this.a;
                object2 = ((CleverTapInstanceConfig)object2).b();
                object3 = this.a;
                object3 = ((CleverTapInstanceConfig)object3).a;
                object4 = new StringBuilder((String)object5);
                ((StringBuilder)object4).append((String)charSequence);
                object5 = ((StringBuilder)object4).toString();
                ((b)object2).b((String)object3, (String)object5);
            }
            // MONITOREXIT : object
            return;
        }
        // MONITOREXIT : object
        try {
            throw throwable2;
        }
        catch (Exception exception) {
            object2 = this.a.b();
            object = this.a.a;
            String string2 = "writeFileOnInternalStorage: failed";
            String string3 = " Error:";
            charSequence = Gn.a(string2, (String)charSequence, string3);
            String string4 = exception.getLocalizedMessage();
            ((StringBuilder)charSequence).append(string4);
            charSequence = ((StringBuilder)charSequence).toString();
            ((b)object2).b((String)object, (String)charSequence);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String b(String var1_1) {
        block19: {
            block20: {
                var2_3 = this.a;
                var3_9 = null;
                var4_11 = new StringBuilder();
                var5_14 = this.b;
                var5_14 = var5_14.getFilesDir();
                var4_11.append(var5_14);
                var5_14 = "/";
                var4_11.append((String)var5_14);
                var4_11.append((String)var1_1);
                var1_1 = var4_11.toString();
                var4_11 = new File((String)var1_1);
                var1_1 = new FileInputStream((File)var4_11);
                var4_11 = new StringBuilder();
                var5_14 = new InputStreamReader((InputStream)var1_1);
                var6_15 = new BufferedReader((Reader)var5_14);
                ** try [egrp 3[TRYBLOCK] [37, 36 : 117->156)] { 
lbl23:
                // 1 sources

                ** GOTO lbl51
lbl24:
                // 1 sources

                catch (Throwable var2_4) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        var3_9 = var1_1;
                        break block19;
                        break;
                    }
                }
lbl28:
                // 1 sources

                catch (Exception var3_10) {
                    ** GOTO lbl-1000
                }
                catch (Throwable var2_8) {
                    var5_14 = null;
                    var6_15 = null;
                    break block19;
                }
                catch (Exception var1_2) {
                    var5_14 = null;
                    var6_15 = null;
                    var3_9 = var1_2;
                    var1_1 = null;
                    ** GOTO lbl-1000
                }
lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_9 = var4_11;
                        break;
                    }
                    catch (Throwable var2_7) {
                        var5_14 = null;
                        var6_15 = null;
                        ** GOTO lbl-1000
                    }
                    catch (Exception var4_13) {
                        var5_14 = null;
                        var6_15 = null;
                        ** GOTO lbl-1000
                    }
lbl51:
                    // 2 sources

                    while ((var3_9 = var6_15.readLine()) != null) {
                        var4_11.append((String)var3_9);
                    }
                    var1_1.close();
                    var2_3 = var4_11.toString();
                    var1_1.close();
                    var5_14.close();
                    var6_15.close();
                    return var2_3;
                    catch (Throwable var2_6) {
                        var6_15 = null;
                        ** continue;
                    }
                    catch (Exception var4_12) {}
                    var6_15 = null;
                    ** continue;
                }
lbl-1000:
                // 3 sources

                {
                    var4_11 = var2_3.b();
                    var2_3 = var2_3.a;
                    var7_16 = new StringBuilder();
                    var8_17 = "[Exception While Reading: ";
                    var7_16.append(var8_17);
                    var3_9 = var3_9.getLocalizedMessage();
                    var7_16.append((String)var3_9);
                    var3_9 = var7_16.toString();
                    var4_11.b((String)var2_3, (String)var3_9);
                    if (var1_1 == null) break block20;
                }
                var1_1.close();
            }
            if (var5_14 != null) {
                var5_14.close();
            }
            if (var6_15 == null) return "";
            var6_15.close();
            return "";
        }
        if (var3_9 != null) {
            var3_9.close();
        }
        if (var5_14 != null) {
            var5_14.close();
        }
        if (var6_15 == null) throw var2_5;
        var6_15.close();
        throw var2_5;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void c(String object, String object2, JSONObject object3) {
        Throwable throwable42;
        Object object4;
        block14: {
            Object object5;
            Object object6;
            block13: {
                if (object3 == null) return;
                object4 = null;
                boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                if (bl2) return;
                bl2 = TextUtils.isEmpty((CharSequence)object2);
                if (bl2) {
                    return;
                }
                object6 = lm0_1.class;
                // MONITORENTER : object6
                try {
                    Object object7 = this.b;
                    object7 = object7.getFilesDir();
                    object5 = new File((File)object7, (String)object);
                    boolean bl3 = ((File)object5).exists();
                    if (!bl3 && !(bl3 = ((File)object5).mkdir())) {
                        // MONITOREXIT : object6
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block13;
                }
                object = new File((File)object5, (String)object2);
                object5 = null;
                object2 = new FileWriter((File)object, false);
                try {
                    object = object3.toString();
                    ((Writer)object2).append((CharSequence)object);
                    ((Writer)object2).flush();
                    // MONITOREXIT : object6
                }
                catch (Throwable throwable3) {
                    object4 = object2;
                }
                ((Writer)object2).close();
                return;
            }
            try {
                throw object;
            }
            catch (Throwable throwable42) {
                break block14;
            }
            catch (Exception exception) {
                object2 = this.a;
                object2 = ((CleverTapInstanceConfig)object2).b();
                object3 = this.a;
                object3 = object3.a;
                object6 = new StringBuilder();
                object5 = "writeFileOnInternalStorage: failed";
                ((StringBuilder)object6).append((String)object5);
                String string2 = exception.getLocalizedMessage();
                ((StringBuilder)object6).append(string2);
                string2 = ((StringBuilder)object6).toString();
                ((b)object2).b((String)object3, string2);
                if (object4 == null) return;
                ((Writer)object4).close();
            }
            return;
        }
        if (object4 == null) throw throwable42;
        ((Writer)object4).close();
        throw throwable42;
    }
}


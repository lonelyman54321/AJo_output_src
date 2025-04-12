/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
import android.text.TextUtils;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class NH$b
implements Callable {
    public final /* synthetic */ nh_1 a;

    public NH$b(nh_1 nh_12) {
        this.a = nh_12;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        var1_1 = "Feature flags file is empty-";
        synchronized (this) {
            block7: {
                block12: {
                    block8: {
                        block11: {
                            block9: {
                                block10: {
                                    block6: {
                                        var2_4 = this.a;
                                        var2_4 = var2_4.a;
                                        var2_4 = var2_4.b();
                                        var3_5 = this.a;
                                        var3_5 = var3_5.b();
                                        var4_6 = "Feature flags init is called";
                                        var2_4.b((String)var3_5, (String)var4_6);
                                        var2_4 = this.a;
                                        var3_5 = new StringBuilder();
                                        var5_7 = "Feature_Flag_";
                                        var4_6 = new StringBuilder((String)var5_7);
                                        var5_7 = var2_4.a;
                                        var5_7 = var5_7.a;
                                        var4_6.append((String)var5_7);
                                        var5_7 = "_";
                                        var4_6.append((String)var5_7);
                                        var2_4 = var2_4.b;
                                        var4_6.append((String)var2_4);
                                        var2_4 = var4_6.toString();
                                        var3_5.append((String)var2_4);
                                        var2_4 = "/ff_cache.json";
                                        var3_5.append((String)var2_4);
                                        var2_4 = var3_5.toString();
                                        var3_5 = this.a;
                                        var3_5 = var3_5.g;
                                        var3_5.clear();
                                        var3_5 = this.a;
                                        var3_5 = var3_5.f;
                                        var3_5 = var3_5.b((String)var2_4);
                                        var6_8 = TextUtils.isEmpty((CharSequence)var3_5);
                                        if (var6_8) break block9;
                                        var1_1 = new JSONObject((String)var3_5);
                                        var3_5 = "kv";
                                        if ((var1_1 = var1_1.getJSONArray((String)var3_5)) == null || (var7_9 = var1_1.length()) <= 0) break block10;
                                        var7_9 = 0;
                                        var3_5 = null;
lbl46:
                                        // 2 sources

                                        while (var7_9 < (var6_8 = var1_1.length())) {
                                            var4_6 = var1_1.get(var7_9);
                                            if ((var4_6 = (JSONObject)var4_6) == null) break block6;
                                            var5_7 = "n";
                                            var5_7 = var4_6.getString((String)var5_7);
                                            var8_10 = "v";
                                            var4_6 = var4_6.getString((String)var8_10);
                                            var9_12 = TextUtils.isEmpty((CharSequence)var5_7);
                                            if (var9_12) break block6;
                                            var8_10 = this.a;
                                            var8_10 = var8_10.g;
                                            var6_8 = (int)Boolean.parseBoolean((String)var4_6);
                                            var4_6 = (boolean)var6_8;
                                            var8_10.put(var5_7, var4_6);
                                            break block6;
                                        }
                                        break block10;
                                        catch (Throwable var1_2) {
                                            break block7;
                                        }
                                        catch (Exception var1_3) {
                                            break block8;
                                        }
                                    }
                                    ++var7_9;
                                    ** GOTO lbl46
                                }
                                var1_1 = this.a;
                                var1_1 = var1_1.a;
                                var1_1 = var1_1.b();
                                var3_5 = this.a;
                                var3_5 = var3_5.b();
                                var4_6 = new StringBuilder();
                                var5_7 = "Feature flags initialized from file ";
                                var4_6.append((String)var5_7);
                                var4_6.append((String)var2_4);
                                var5_7 = " with configs  ";
                                var4_6.append((String)var5_7);
                                var5_7 = this.a;
                                var5_7 = var5_7.g;
                                var4_6.append(var5_7);
                                var4_6 = var4_6.toString();
                                var1_1.b((String)var3_5, (String)var4_6);
                                break block11;
                            }
                            var3_5 = this.a;
                            var3_5 = var3_5.a;
                            var3_5 = var3_5.b();
                            var4_6 = this.a;
                            var4_6 = var4_6.b();
                            var5_7 = new StringBuilder((String)var1_1);
                            var5_7.append((String)var2_4);
                            var1_1 = var5_7.toString();
                            var3_5.b((String)var4_6, (String)var1_1);
                        }
                        var1_1 = Boolean.TRUE;
                        break block12;
                    }
                    var3_5 = this.a;
                    var3_5 = var3_5.a;
                    var3_5 = var3_5.b();
                    var4_6 = this.a;
                    var4_6 = var4_6.b();
                    var5_7 = new StringBuilder();
                    var8_11 = "UnArchiveData failed file- ";
                    var5_7.append(var8_11);
                    var5_7.append((String)var2_4);
                    var2_4 = " ";
                    var5_7.append((String)var2_4);
                    var1_1 = var1_3.getLocalizedMessage();
                    var5_7.append((String)var1_1);
                    var1_1 = var5_7.toString();
                    var3_5.b((String)var4_6, (String)var1_1);
                    var1_1 = Boolean.FALSE;
                }
                return var1_1;
            }
            throw var1_2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFe1mSDK;
import com.appsflyer.internal.AFe1nSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class AFe1lSDK {
    private final int getCurrencyIso4217Code;

    public AFe1lSDK(int n3) {
        this.getCurrencyIso4217Code = n3;
    }

    private static void getMediationNetwork(AFe1mSDK aFe1mSDK, Throwable throwable, AFe1nSDK object, boolean bl2) {
        Object object2 = new StringBuilder("error: ");
        ((StringBuilder)object2).append(throwable);
        ((StringBuilder)object2).append("\n took ");
        long l2 = ((AFe1nSDK)object).getRevenue;
        ((StringBuilder)object2).append(l2);
        ((StringBuilder)object2).append("ms");
        object = object2.toString();
        object2 = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.component2;
        CharSequence charSequence = new StringBuilder("[");
        int n3 = aFe1mSDK.hashCode();
        charSequence.append(n3);
        charSequence.append("] ");
        charSequence.append((String)object);
        charSequence = ((Object)charSequence).toString();
        ((AFh1uSDK)object2).e(aFh1vSDK, (String)charSequence, throwable, false, false, bl2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String getMonetizationNetwork(HttpURLConnection var0) {
        block16: {
            block15: {
                block14: {
                    block13: {
                        var1_3 = "";
                        var2_5 = '\u0000';
                        var3_6 = null;
                        try {
                            try {
                                var0 = var0.getInputStream();
                            }
                            catch (Exception var4_7) {
                                var0 = var0.getErrorStream();
                                var5_8 = AFLogger.INSTANCE;
                                var6_9 /* !! */  = AFh1vSDK.component2;
                                var7_10 = var4_7.getMessage();
                                var7_10 = var7_10 != null ? var4_7.getMessage() : var1_3;
                                var5_8.e(var6_9 /* !! */ , (String)var7_10, var4_7, false, false);
                            }
                        }
                        catch (Throwable var0_1) {
                            var1_3 = null;
                            break block13;
                        }
                        if (var0 == null) {
                            return var1_3;
                        }
                        var1_3 = new StringBuilder();
                        var6_9 /* !! */  = Charset.defaultCharset();
                        var5_8 = new InputStreamReader((InputStream)var0, (Charset)var6_9 /* !! */ );
                        var0 = new BufferedReader((Reader)var5_8);
                        var2_5 = '\u0001';
                        break block14;
                    }
lbl29:
                    // 3 sources

                    while (true) {
                        if (var3_6 != null) {
                            var3_6.close();
                        }
                        if (var1_3 != null) {
                            var1_3.close();
                        }
                        throw var0;
                    }
                }
                try lbl-1000:
                // 2 sources

                {
                    while ((var6_9 /* !! */  = var0.readLine()) != null) {
                        if (var2_5 != '\u0000') break block15;
                        var2_5 = '\n';
                        var1_3.append(var2_5);
                        break block15;
                    }
                    break block16;
                }
                catch (Throwable var1_4) {
                    var3_6 = var5_8;
                    var8_11 = var1_4;
                    var1_3 = var0;
                    var0 = var8_11;
                    ** GOTO lbl29
                }
            }
            var1_3.append((String)var6_9 /* !! */ );
            var2_5 = '\u0000';
            var3_6 = null;
            ** GOTO lbl-1000
        }
        var1_3 = var1_3.toString();
        var5_8.close();
        var0.close();
        return var1_3;
        catch (Throwable var0_2) {
            var1_3 = null;
            var3_6 = var5_8;
            ** continue;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFe1kSDK getMediationNetwork(AFe1mSDK var1_1) {
        block35: {
            block32: {
                block31: {
                    block28: {
                        block30: {
                            block29: {
                                var2_2 = var1_1;
                                var3_3 = "] ";
                                var4_15 = "[";
                                var5_16 = System.currentTimeMillis();
                                var7_17 = true;
                                var8_18 = null;
                                var9_19 = null;
                                try {
                                    var10_20 /* !! */  = var1_1.getCurrencyIso4217Code();
                                    var12_22 = new StringBuilder();
                                    var13_25 /* !! */  = var1_1.getCurrencyIso4217Code;
                                    var12_22.append((String)var13_25 /* !! */ );
                                    var13_25 /* !! */  = ":";
                                    var12_22.append((String)var13_25 /* !! */ );
                                    var13_25 /* !! */  = var1_1.getMediationNetwork;
                                    var12_22.append((String)var13_25 /* !! */ );
                                    var12_22 = var12_22.toString();
                                    var11_21 = new StringBuilder((String)var12_22);
                                    var12_22 = var1_1.getCurrencyIso4217Code();
                                    var14_26 = var1_1.getRevenue();
                                    if (var14_26 == 0 || var12_22 == null) break block28;
                                    var14_26 = var1_1.AFAdRevenueData();
                                    if (var14_26 == 0) break block29;
                                    var12_22 = "<encrypted>";
                                    break block30;
                                }
                                catch (Throwable var3_4) {
                                    var12_23 = this;
                                    break block31;
                                }
                                catch (Exception var3_5) {
                                    var12_24 = this;
                                    break block32;
                                }
                            }
                            var15_27 = Charset.defaultCharset();
                            var12_22 = var13_25 /* !! */  = new String((byte[])var12_22, (Charset)var15_27);
                        }
                        var13_25 /* !! */  = "\n payload: ";
                        var11_21.append((String)var13_25 /* !! */ );
                        var11_21.append((String)var12_22);
                    }
                    var12_22 = var2_2.getRevenue;
                    var12_22 = var12_22.entrySet();
                    var12_22 = var12_22.iterator();
                    while ((var14_26 = var12_22.hasNext()) != 0) {
                        var13_25 /* !! */  = var12_22.next();
                        var13_25 /* !! */  = (Map.Entry)var13_25 /* !! */ ;
                        var15_27 = "\n ";
                        var11_21.append((String)var15_27);
                        var15_27 = var13_25 /* !! */ .getKey();
                        var15_27 = (String)var15_27;
                        var11_21.append((String)var15_27);
                        var15_27 = ": ";
                        var11_21.append((String)var15_27);
                        var13_25 /* !! */  = var13_25 /* !! */ .getValue();
                        var13_25 /* !! */  = (String)var13_25 /* !! */ ;
                        var11_21.append((String)var13_25 /* !! */ );
                    }
                    var12_22 = new StringBuilder((String)var4_15);
                    var14_26 = var1_1.hashCode();
                    var12_22.append(var14_26);
                    var12_22.append((String)var3_3);
                    var12_22.append(var11_21);
                    var11_21 = var12_22.toString();
                    var12_22 = AFLogger.INSTANCE;
                    var13_25 /* !! */  = AFh1vSDK.component2;
                    var12_22.d((AFh1vSDK)var13_25 /* !! */ , (String)var11_21);
                    var12_22 = var2_2.getMediationNetwork;
                    var11_21 = new URL((String)var12_22);
                    var11_21 = var11_21.openConnection();
                    var11_21 = (HttpURLConnection)var11_21;
                    try {
                        var12_22 = var2_2.getCurrencyIso4217Code;
                        var11_21.setRequestMethod((String)var12_22);
                        var16_28 = var1_1.getMonetizationNetwork();
                        if (!var16_28) ** GOTO lbl97
                        var11_21.setUseCaches(false);
                        ** GOTO lbl97
                    }
                    catch (Throwable var3_6) {
                        block33: {
                            var12_22 = this;
                            break block33;
                            catch (Exception var3_8) {
                                var12_22 = this;
lbl94:
                                // 2 sources

                                while (true) {
                                    var9_19 = var11_21;
                                    break block32;
                                    break;
                                }
                            }
lbl97:
                            // 2 sources

                            if (!(var16_28 = var1_1.component3())) {
                                var11_21.setInstanceFollowRedirects(false);
                            }
                            var12_22 = this;
                            try {
                                var14_26 = this.getCurrencyIso4217Code;
                                var17_29 = var2_2.component3;
                                var18_30 = -1;
                                if (var17_29 != var18_30) {
                                    var14_26 = var17_29;
                                }
                                var11_21.setConnectTimeout(var14_26);
                                var11_21.setReadTimeout(var14_26);
                                var14_26 = (int)var1_1.AFAdRevenueData();
                                var13_25 /* !! */  = var14_26 != 0 ? "application/octet-stream" : "application/json";
                            }
                            catch (Throwable var3_9) {
                            }
                            catch (Exception var3_10) {
                                ** continue;
                            }
                        }
                        var9_19 = var11_21;
                        break block31;
                    }
                    var15_27 = "Content-Type";
                    var11_21.addRequestProperty((String)var15_27, (String)var13_25 /* !! */ );
                    var13_25 /* !! */  = var2_2.getRevenue;
                    var13_25 /* !! */  = var13_25 /* !! */ .entrySet();
                    var13_25 /* !! */  = var13_25 /* !! */ .iterator();
                    while ((var17_29 = (int)var13_25 /* !! */ .hasNext()) != 0) {
                        var15_27 = var13_25 /* !! */ .next();
                        var15_27 = (Map.Entry)var15_27;
                        var19_31 /* !! */  = var15_27.getKey();
                        var19_31 /* !! */  = (String)var19_31 /* !! */ ;
                        var15_27 = var15_27.getValue();
                        var15_27 = (String)var15_27;
                        var11_21.setRequestProperty((String)var19_31 /* !! */ , (String)var15_27);
                    }
                    if (var10_20 /* !! */  == null) ** GOTO lbl159
                    var11_21.setDoOutput(var7_17);
                    var13_25 /* !! */  = "Content-Length";
                    var15_27 = new StringBuilder();
                    var18_30 = var10_20 /* !! */ .length;
                    var15_27.append(var18_30);
                    var15_27 = var15_27.toString();
                    var11_21.setRequestProperty((String)var13_25 /* !! */ , (String)var15_27);
                    var15_27 = var11_21.getOutputStream();
                    var13_25 /* !! */  = new BufferedOutputStream((OutputStream)var15_27);
                    {
                        block36: {
                            block34: {
                                catch (Throwable var3_12) {
                                    // empty catch block
                                    break block34;
                                }
                                try {
                                    var13_25 /* !! */ .write(var10_20 /* !! */ );
                                }
                                catch (Throwable var3_11) {
                                    var9_19 = var13_25 /* !! */ ;
                                    break block34;
                                }
                                var13_25 /* !! */ .close();
                                break block36;
                            }
                            if (var9_19 != null) {
                                var9_19.close();
                            }
                            throw var3_13;
                        }
                        var20_32 = var11_21.getResponseCode();
                        var14_26 = 2;
                        var21_33 = (var20_32 /= 100) == var14_26;
                        var20_32 = (int)var1_1.getMediationNetwork();
                        var13_25 /* !! */  = "";
                        if (var20_32 != 0) {
                            var10_20 /* !! */  = (byte[])AFe1lSDK.getMonetizationNetwork((HttpURLConnection)var11_21);
                            var19_31 /* !! */  = (K)var10_20 /* !! */ ;
                        } else {
                            var19_31 /* !! */  = var13_25 /* !! */ ;
                        }
                        var22_34 = System.currentTimeMillis() - var5_16;
                    }
                    {
                        var10_20 /* !! */  = (byte[])new AFe1nSDK;
                        var10_20 /* !! */ (var22_34);
                        var15_27 = "response code:";
                        var13_25 /* !! */  = new StringBuilder((String)var15_27);
                        var17_29 = var11_21.getResponseCode();
                        var13_25 /* !! */ .append(var17_29);
                        var15_27 = " ";
                        var13_25 /* !! */ .append((String)var15_27);
                        var15_27 = var11_21.getResponseMessage();
                        var13_25 /* !! */ .append((String)var15_27);
                        var15_27 = "\n body:";
                        var13_25 /* !! */ .append((String)var15_27);
                        var13_25 /* !! */ .append((String)var19_31 /* !! */ );
                        var15_27 = "\n took ";
                        var13_25 /* !! */ .append((String)var15_27);
                        var24_35 = var10_20 /* !! */ .getRevenue;
                        var13_25 /* !! */ .append(var24_35);
                        var26_38 = "ms";
                        var13_25 /* !! */ .append(var26_38);
                        var26_38 = var13_25 /* !! */ .toString();
                        var8_18 = AFLogger.INSTANCE;
                        var13_25 /* !! */  = AFh1vSDK.component2;
                        var15_27 = new StringBuilder((String)var4_15);
                        var27_39 = var1_1.hashCode();
                        var15_27.append(var27_39);
                        var15_27.append((String)var3_3);
                        var15_27.append(var26_38);
                        var3_3 = var15_27.toString();
                        var8_18.d((AFh1vSDK)var13_25 /* !! */ , (String)var3_3);
                        var4_15 = var11_21.getHeaderFields();
                        var3_3 = new HashMap<String, List<String>>((Map<String, List<String>>)var4_15);
                        var3_3.remove(null);
                        var28_40 = var11_21.getResponseCode();
                        var15_27 = var4_15;
                        var4_15 = new AFe1kSDK(var19_31 /* !! */ , var28_40, var21_33, var3_3, (AFe1nSDK)var10_20 /* !! */ );
                        var11_21.disconnect();
                        return var4_15;
                    }
                }
                try {
                    var24_36 = System.currentTimeMillis() - var5_16;
                }
                catch (Throwable var3_14) {
                    break block35;
                }
                var4_15 = new AFe1nSDK(var24_36);
                var29_41 = true;
                AFe1lSDK.getMediationNetwork((AFe1mSDK)var2_2, (Throwable)var3_7, (AFe1nSDK)var4_15, var29_41);
                var2_2 = new HttpException((Throwable)var3_7, (AFe1nSDK)var4_15);
                throw var2_2;
            }
            var24_37 = System.currentTimeMillis() - var5_16;
            {
                var4_15 = new AFe1nSDK(var24_37);
                var29_42 = false;
                AFe1lSDK.getMediationNetwork((AFe1mSDK)var2_2, (Throwable)var3_7, (AFe1nSDK)var4_15, false);
                var2_2 = new HttpException((Throwable)var3_7, (AFe1nSDK)var4_15);
                throw var2_2;
            }
        }
        if (var9_19 != null) {
            var9_19.disconnect();
        }
        throw var3_14;
    }
}


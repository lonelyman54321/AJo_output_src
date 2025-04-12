/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import com.facebook.GraphRequest;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.UninitializedPropertyAccessException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from Xn
 */
public final class xn_0
implements Runnable {
    public final /* synthetic */ GraphRequest a;

    public /* synthetic */ xn_0(GraphRequest graphRequest) {
        this.a = graphRequest;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block82: {
            block81: {
                block80: {
                    var1_1 /* !! */  = 2;
                    var2_2 = 0;
                    var3_3 = null;
                    var4_4 /* !! */  = 1;
                    var5_5 /* !! */  = this;
                    var6_6 = this.a;
                    Intrinsics.checkNotNullParameter(var6_6, "$request");
                    var7_7 /* !! */  = var6_6.b;
                    if (var7_7 /* !! */  != null) {
                        var8_18 = new String[]{"/"};
                        var9_19 = 6;
                        var7_7 /* !! */  = StringsKt.a0((CharSequence)var7_7 /* !! */ , (String[])var8_18, false, 0, var9_19);
                    } else {
                        var10_20 = 0;
                        var7_7 /* !! */  = null;
                    }
                    var8_18 = "CAPITransformerWebRequests";
                    if (var7_7 /* !! */  == null || (var10_20 = var7_7 /* !! */ .size()) != var1_1 /* !! */ ) {
                        var11_21 = var6_6;
                        var5_5 /* !! */  = var8_18;
                        var12_23 = false;
                        var6_6 = null;
                        var7_7 /* !! */  = sx1.d;
                        var7_7 /* !! */  = Ax1.DEVELOPER_ERRORS;
                        var25_40 = "\n GraphPathComponents Error when logging: \n%s";
                        var3_3 = new Object[var4_4 /* !! */ ];
                        var3_3[0] = var11_21;
                        sx1$a.b((Ax1)var7_7 /* !! */ , (String)var8_18, var25_40, (Object[])var3_3);
                        return;
                    }
                    try {
                        var7_7 /* !! */  = yn_0.c;
                        var13_26 /* !! */  = "credentials";
                        if (var7_7 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var13_26 /* !! */ );
                            var10_20 = 0;
                            var7_7 /* !! */  = null;
                        }
                        var7_7 /* !! */  = var7_7 /* !! */ .b;
                        var14_27 = yn_0.c;
                        if (var14_27 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var13_26 /* !! */ );
                            var15_28 = 0;
                            var14_27 = null;
                        }
                        var14_27 = var14_27.a;
                        var16_29 = new StringBuilder();
                        var16_29.append((String)var7_7 /* !! */ );
                        var7_7 /* !! */  = "/capi/";
                        var16_29.append((String)var7_7 /* !! */ );
                        var16_29.append((String)var14_27);
                        var7_7 /* !! */  = "/events";
                        var16_29.append((String)var7_7 /* !! */ );
                        var14_27 = var16_29.toString();
                    }
                    catch (UninitializedPropertyAccessException var7_17) {
                        var5_5 /* !! */  = var8_18;
                        var25_39 /* !! */  = sx1.d;
                        var25_39 /* !! */  = Ax1.DEVELOPER_ERRORS;
                        var3_3 = "\n Credentials not initialized Error when logging: \n%s";
                        var4_4 /* !! */  = 1;
                        var26_42 = new Object[var4_4 /* !! */ ];
                        var12_25 = false;
                        var6_6 = null;
                        var26_42[0] = var7_17;
                        sx1$a.b((Ax1)var25_39 /* !! */ , (String)var8_18, (String)var3_3, var26_42);
                        return;
                    }
                    var7_7 /* !! */  = var6_6.c;
                    if (var7_7 /* !! */  == null) break block80;
                    var16_29 = fh1_2.q(lz3_0.i(var7_7 /* !! */ ));
                    var7_7 /* !! */  = var6_6.e;
                    var17_30 = "null cannot be cast to non-null type kotlin.Any";
                    Intrinsics.checkNotNull(var7_7 /* !! */ , var17_30);
                    var16_29.put("custom_events", var7_7 /* !! */ );
                    var7_7 /* !! */  = new StringBuilder();
                    var18_31 /* !! */  = var16_29.keySet().iterator();
                    while ((var19_32 = var18_31 /* !! */ .hasNext()) != 0) {
                        var20_33 = (String)var18_31 /* !! */ .next();
                        var7_7 /* !! */ .append((String)var20_33);
                        var21_34 = " : ";
                        var7_7 /* !! */ .append((String)var21_34);
                        var20_33 = var16_29.get(var20_33);
                        var7_7 /* !! */ .append(var20_33);
                        var20_33 = System.getProperty("line.separator");
                        var7_7 /* !! */ .append((String)var20_33);
                    }
                    var18_31 /* !! */  = sx1.d;
                    var18_31 /* !! */  = Ax1.APP_EVENTS;
                    var21_34 = new Object[var4_4 /* !! */ ];
                    var21_34[0] = var7_7 /* !! */ ;
                    sx1$a.b((Ax1)var18_31 /* !! */ , (String)var8_18, "\nGraph Request data: \n\n%s \n\n", (Object[])var21_34);
                    var7_7 /* !! */  = wn_0.a;
                    Intrinsics.checkNotNullParameter(var16_29, "parameters");
                    var18_31 /* !! */  = new LinkedHashMap();
                    var20_33 = new LinkedHashMap();
                    var21_34 = new ArrayList();
                    var22_35 = new LinkedHashMap<Object, Object[]>();
                    var7_7 /* !! */  = rg2_1.EVENT.getRawValue();
                    var7_7 /* !! */  = var16_29.get(var7_7 /* !! */ );
                    var23_36 = rn_0.Companion;
                    var24_37 = "null cannot be cast to non-null type kotlin.String";
                    Intrinsics.checkNotNull(var7_7 /* !! */ , (String)var24_37);
                    var7_7 /* !! */  = (String)var7_7 /* !! */ ;
                    var23_36.getClass();
                    var3_3 = "rawValue";
                    Intrinsics.checkNotNullParameter(var7_7 /* !! */ , (String)var3_3);
                    var25_38 /* !! */  = "MOBILE_APP_INSTALL";
                    var1_1 /* !! */  = (int)Intrinsics.areEqual(var7_7 /* !! */ , var25_38 /* !! */ );
                    var7_7 /* !! */  = var1_1 /* !! */  != 0 ? rn_0.MOBILE_APP_INSTALL : ((var10_20 = (int)Intrinsics.areEqual(var7_7 /* !! */ , var25_38 /* !! */  = "CUSTOM_APP_EVENTS")) != 0 ? rn_0.CUSTOM : rn_0.OTHER);
                    var25_38 /* !! */  = var7_7 /* !! */ ;
                    var7_7 /* !! */  = rn_0.OTHER;
                    var26_41 /* !! */  = "appData";
                    var5_5 /* !! */  = "userData";
                    if (var25_38 /* !! */  == var7_7 /* !! */ ) break block81;
                    var7_7 /* !! */  = var16_29.entrySet();
                    var34_50 = var7_7 /* !! */ .iterator();
                    break block82;
                }
                var11_22 /* !! */  = var6_6;
                var29_45 = var8_18;
                var30_46 = var13_26 /* !! */ ;
                var31_47 = var14_27;
                return;
            }
            while (true) {
                block73: {
                    block72: {
                        block70: {
                            block71: {
                                var27_43 /* !! */  = var26_41 /* !! */ ;
                                var28_44 /* !! */  = var5_5 /* !! */ ;
                                var11_22 /* !! */  = var6_6;
                                var29_45 = var8_18;
                                var30_46 = var13_26 /* !! */ ;
                                var31_47 = var14_27;
                                var32_48 = var18_31 /* !! */ ;
                                var33_49 = var20_33;
                                var7_7 /* !! */  = rn_0.OTHER;
                                if (var25_38 /* !! */  == var7_7 /* !! */ ) return;
                                var7_7 /* !! */  = rg2_1.INSTALL_EVENT_TIME.getRawValue();
                                var7_7 /* !! */  = var16_29.get(var7_7 /* !! */ );
                                Intrinsics.checkNotNullParameter(var25_38 /* !! */ , "eventType");
                                var26_41 /* !! */  = var5_5 /* !! */ ;
                                var3_3 = var18_31 /* !! */ ;
                                Intrinsics.checkNotNullParameter(var18_31 /* !! */ , (String)var5_5 /* !! */ );
                                var6_6 = var27_43 /* !! */ ;
                                var5_5 /* !! */  = var20_33;
                                Intrinsics.checkNotNullParameter(var20_33, (String)var27_43 /* !! */ );
                                var24_37 = "restOfData";
                                Intrinsics.checkNotNullParameter(var22_35, (String)var24_37);
                                var8_18 = "customEvents";
                                Intrinsics.checkNotNullParameter(var21_34, (String)var8_18);
                                Intrinsics.checkNotNullParameter(var18_31 /* !! */ , (String)var28_44 /* !! */ );
                                Intrinsics.checkNotNullParameter(var20_33, (String)var27_43 /* !! */ );
                                Intrinsics.checkNotNullParameter(var22_35, (String)var24_37);
                                var26_41 /* !! */  = new LinkedHashMap();
                                var6_6 = rg2_1.ACTION_SOURCE.getRawValue();
                                var24_37 = rg2_1.APP.getRawValue();
                                var26_41 /* !! */ .put(var6_6, var24_37);
                                var6_6 = v80_0.USER_DATA.getRawValue();
                                var26_41 /* !! */ .put(var6_6, var18_31 /* !! */ );
                                var3_3 = v80_0.APP_DATA.getRawValue();
                                var26_41 /* !! */ .put(var3_3, var20_33);
                                var26_41 /* !! */ .putAll(var22_35);
                                var3_3 = Wn$e.$EnumSwitchMapping$2;
                                var1_1 /* !! */  = var25_38 /* !! */ .ordinal();
                                var1_1 /* !! */  = (int)var3_3[var1_1 /* !! */ ];
                                var2_2 = 1;
                                if (var1_1 /* !! */  != var2_2) {
                                    var2_2 = 2;
                                    if (var1_1 /* !! */  != var2_2 || (var10_20 = (int)var21_34.isEmpty()) != 0) return;
                                    var7_7 /* !! */  = new ArrayList();
                                    var25_38 /* !! */  = var21_34.iterator();
                                    while ((var2_2 = (int)var25_38 /* !! */ .hasNext()) != 0) {
                                        var3_3 = (Map)var25_38 /* !! */ .next();
                                        var5_5 /* !! */  = new LinkedHashMap();
                                        var5_5 /* !! */ .putAll(var26_41 /* !! */ );
                                        var5_5 /* !! */ .putAll(var3_3);
                                        var7_7 /* !! */ .add(var5_5 /* !! */ );
                                    }
                                } else {
                                    if (var7_7 /* !! */  == null) return;
                                    var25_38 /* !! */  = new LinkedHashMap();
                                    var25_38 /* !! */ .putAll(var26_41 /* !! */ );
                                    var3_3 = t80_0.EVENT_NAME.getRawValue();
                                    var26_41 /* !! */  = rg2_1.MOBILE_APP_INSTALL.getRawValue();
                                    var25_38 /* !! */ .put(var3_3, var26_41 /* !! */ );
                                    var3_3 = t80_0.EVENT_TIME.getRawValue();
                                    var25_38 /* !! */ .put(var3_3, var7_7 /* !! */ );
                                    var7_7 /* !! */  = kotlin.collections.a.b(var25_38 /* !! */ );
                                }
                                if (var7_7 /* !! */  == null) {
                                    return;
                                }
                                var25_38 /* !! */  = yn_0.b();
                                var7_7 /* !! */  = (Collection)var7_7 /* !! */ ;
                                var25_38 /* !! */ .addAll(var7_7 /* !! */ );
                                var7_7 /* !! */  = yn_0.b();
                                var10_20 = var7_7 /* !! */ .size() + -1000;
                                var1_1 /* !! */  = 0;
                                var25_38 /* !! */  = null;
                                var10_20 = Math.max(0, var10_20);
                                if (var10_20 > 0) {
                                    var7_7 /* !! */  = CollectionsKt.G(yn_0.b(), var10_20);
                                    Intrinsics.checkNotNull(var7_7 /* !! */ , "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
                                    var7_7 /* !! */  = TypeIntrinsics.asMutableList(var7_7 /* !! */ );
                                    var25_38 /* !! */  = "<set-?>";
                                    Intrinsics.checkNotNullParameter(var7_7 /* !! */ , (String)var25_38 /* !! */ );
                                    yn_0.d = var7_7 /* !! */ ;
                                }
                                var10_20 = ((Collection)yn_0.b()).size();
                                var1_1 /* !! */  = 10;
                                var10_20 = Math.min(var10_20, var1_1 /* !! */ );
                                var25_38 /* !! */  = yn_0.b();
                                var4_4 /* !! */  = 1;
                                var35_51 = var10_20 + -1;
                                var12_24 = 0;
                                var6_6 = null;
                                var3_3 = new c(0, var35_51, var4_4 /* !! */ );
                                var25_38 /* !! */  = CollectionsKt.c0((List)var25_38 /* !! */ , (IntRange)var3_3);
                                yn_0.b().subList(0, var10_20).clear();
                                var3_3 = var25_38 /* !! */ ;
                                var3_3 = (Collection)var25_38 /* !! */ ;
                                var7_7 /* !! */  = new JSONArray((Collection)var3_3);
                                var3_3 = new LinkedHashMap();
                                var26_41 /* !! */  = "data";
                                var3_3.put(var26_41 /* !! */ , var7_7 /* !! */ );
                                var7_7 /* !! */  = yn_0.c;
                                if (var7_7 /* !! */  == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var30_46);
                                    var10_20 = 0;
                                    var7_7 /* !! */  = null;
                                }
                                var7_7 /* !! */  = var7_7 /* !! */ .c;
                                var3_3.put("accessKey", var7_7 /* !! */ );
                                var7_7 /* !! */  = new JSONObject((Map)var3_3);
                                var3_3 = sx1.d;
                                var3_3 = Ax1.APP_EVENTS;
                                var4_4 /* !! */  = 2;
                                var5_5 /* !! */  = var7_7 /* !! */ .toString(var4_4 /* !! */ );
                                Intrinsics.checkNotNullExpressionValue(var5_5 /* !! */ , "jsonBodyStr.toString(2)");
                                var12_24 = 3;
                                var6_6 = new Object[var12_24];
                                var6_6[0] = var31_47;
                                var41_57 = 1;
                                var6_6[var41_57] = var11_22 /* !! */ ;
                                var6_6[var4_4 /* !! */ ] = var5_5 /* !! */ ;
                                var5_5 /* !! */  = var29_45;
                                sx1$a.b((Ax1)var3_3, (String)var29_45, "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", (Object[])var6_6);
                                var7_7 /* !! */  = var7_7 /* !! */ .toString();
                                var3_3 = new Pair("Content-Type", "application/json");
                                var3_3 = eh1_2.d((Pair)var3_3);
                                var26_41 /* !! */  = new ao((List)var25_38 /* !! */ );
                                var25_38 /* !! */  = "UTF-8";
                                var24_37 = var31_47;
                                Intrinsics.checkNotNullParameter(var31_47, "urlStr");
                                var6_6 = "POST";
                                var8_18 = "requestMethod";
                                Intrinsics.checkNotNullParameter(var6_6, (String)var8_18);
                                var8_18 = new URL((String)var31_47);
                                var24_37 = var8_18.openConnection();
                                var8_18 = "null cannot be cast to non-null type java.net.HttpURLConnection";
                                Intrinsics.checkNotNull(var24_37, (String)var8_18);
                                var24_37 = (HttpURLConnection)var24_37;
                                var24_37.setRequestMethod((String)var6_6);
                                if (var3_3 != null && (var8_18 = var3_3.keySet()) != null) {
                                    var8_18 = (Iterable)var8_18;
                                    var8_18 = var8_18.iterator();
                                    while ((var9_19 = (int)var8_18.hasNext()) != 0) {
                                        var13_26 /* !! */  = var8_18.next();
                                        var14_27 = var3_3.get(var13_26 /* !! */ );
                                        var14_27 = (String)var14_27;
                                        var24_37.setRequestProperty(var13_26 /* !! */ , (String)var14_27);
                                    }
                                }
                                if ((var2_2 = (int)(var3_3 = var24_37.getRequestMethod()).equals(var6_6)) == 0 && (var2_2 = (int)(var3_3 = var24_37.getRequestMethod()).equals(var6_6 = "PUT")) == 0) {
                                    var2_2 = 0;
                                    var3_3 = null;
                                } else {
                                    var2_2 = 1;
                                }
                                var24_37.setDoOutput((boolean)var2_2);
                                var2_2 = 60000;
                                var24_37.setConnectTimeout(var2_2);
                                var6_6 = var24_37.getOutputStream();
                                var3_3 = new BufferedOutputStream((OutputStream)var6_6);
                                var8_18 = new OutputStreamWriter((OutputStream)var3_3, (String)var25_38 /* !! */ );
                                var6_6 = new BufferedWriter((Writer)var8_18);
                                var6_6.write((String)var7_7 /* !! */ );
                                var6_6.flush();
                                var6_6.close();
                                var3_3.close();
                                var7_7 /* !! */  = new StringBuilder();
                                var3_3 = yn_0.a;
                                var12_24 = var24_37.getResponseCode();
                                var6_6 = var12_24;
                                var2_2 = (int)var3_3.contains(var6_6);
                                if (var2_2 == 0) break block70;
                                var8_18 = var24_37.getInputStream();
                                var6_6 = new InputStreamReader((InputStream)var8_18, (String)var25_38 /* !! */ );
                                var3_3 = new BufferedReader((Reader)var6_6);
                                try {
                                    while ((var25_38 /* !! */  = var3_3.readLine()) != null) {
                                        var7_7 /* !! */ .append((String)var25_38 /* !! */ );
                                    }
                                }
                                catch (Throwable var7_13) {
                                    var25_38 /* !! */  = var7_13;
                                    break block71;
                                }
                                var25_38 /* !! */  = Unit.a;
                                var1_1 /* !! */  = 0;
                                var25_38 /* !! */  = null;
                                xj3_1.b((Closeable)var3_3, null);
                            }
                            try {
                                throw var7_13;
                            }
                            catch (Throwable var7_14) {
                                var6_6 = var7_14;
                                try {
                                    xj3_1.b((Closeable)var3_3, (Throwable)var25_38 /* !! */ );
                                    throw var7_14;
                                }
                                catch (IOException var7_11) {
                                    break block72;
                                }
                                catch (UnknownHostException var7_12) {
                                    var2_2 = 1;
                                    var12_24 = 0;
                                    var6_6 = null;
                                    break block73;
                                }
                            }
                        }
                        var7_7 /* !! */  = var7_7 /* !! */ .toString();
                        var25_38 /* !! */  = "connResponseSB.toString()";
                        Intrinsics.checkNotNullExpressionValue(var7_7 /* !! */ , (String)var25_38 /* !! */ );
                        var25_38 /* !! */  = sx1.d;
                        var25_38 /* !! */  = Ax1.APP_EVENTS;
                        var3_3 = "\nResponse Received: \n%s\n%s";
                        var12_24 = var24_37.getResponseCode();
                        var6_6 = var12_24;
                        var42_58 = 2;
                        var8_18 = new Object[var42_58];
                        var9_19 = 0;
                        var13_26 /* !! */  = null;
                        var8_18[0] = var7_7 /* !! */ ;
                        var9_19 = 1;
                        var8_18[var9_19] = var6_6;
                        sx1$a.b((Ax1)var25_38 /* !! */ , (String)var5_5 /* !! */ , (String)var3_3, (Object[])var8_18);
                        var1_1 /* !! */  = var24_37.getResponseCode();
                        var25_38 /* !! */  = var1_1 /* !! */ ;
                        var26_41 /* !! */ .invoke(var7_7 /* !! */ , var25_38 /* !! */ );
                        return;
                    }
                    var25_38 /* !! */  = sx1.d;
                    var25_38 /* !! */  = Ax1.DEVELOPER_ERRORS;
                    var7_15 = var7_11.toString();
                    var2_2 = 1;
                    var3_3 = new Object[var2_2];
                    var12_24 = 0;
                    var6_6 = null;
                    var3_3[0] = var7_15;
                    var7_15 = "Send to server failed: \n%s";
                    sx1$a.b((Ax1)var25_38 /* !! */ , (String)var5_5 /* !! */ , var7_15, (Object[])var3_3);
                    return;
                }
                var25_38 /* !! */  = sx1.d;
                var25_38 /* !! */  = Ax1.APP_EVENTS;
                var7_16 = var7_12.toString();
                var3_3 = new Object[var2_2];
                var3_3[0] = var7_16;
                sx1$a.b((Ax1)var25_38 /* !! */ , (String)var5_5 /* !! */ , "Connection failed, retrying: \n%s", (Object[])var3_3);
                var10_20 = 503;
                var7_16 = var10_20;
                var1_1 /* !! */  = 0;
                var25_38 /* !! */  = null;
                var26_41 /* !! */ .invoke(null, var7_16);
                return;
            }
        }
        while (true) {
            block76: {
                block79: {
                    block90: {
                        block88: {
                            block87: {
                                block89: {
                                    block75: {
                                        block83: {
                                            block85: {
                                                block86: {
                                                    block84: {
                                                        block74: {
                                                            if ((var10_20 = (int)var34_50.hasNext()) == 0) ** continue;
                                                            var7_7 /* !! */  = var34_50.next();
                                                            var11_22 /* !! */  = var7_7 /* !! */ .getKey();
                                                            var29_45 = var8_18;
                                                            var8_18 = var11_22 /* !! */ ;
                                                            var8_18 = (String)var11_22 /* !! */ ;
                                                            var11_22 /* !! */  = var6_6;
                                                            var6_6 = var7_7 /* !! */ .getValue();
                                                            sn_0.Companion.getClass();
                                                            Intrinsics.checkNotNullParameter(var8_18, (String)var3_3);
                                                            var7_7 /* !! */  = sn_0.values();
                                                            var31_47 = var14_27;
                                                            var15_28 = ((sn_0[])var7_7 /* !! */ ).length;
                                                            var30_46 = var13_26 /* !! */ ;
                                                            var13_26 /* !! */  = null;
                                                            for (var9_19 = 0; var9_19 < var15_28; ++var9_19) {
                                                                var28_44 /* !! */  = var7_7 /* !! */ [var9_19];
                                                                var27_43 /* !! */  = var7_7 /* !! */ ;
                                                                var7_7 /* !! */  = var28_44 /* !! */ .getRawValue();
                                                                var10_20 = (int)Intrinsics.areEqual(var7_7 /* !! */ , var8_18);
                                                                if (var10_20 != 0) {
                                                                    var7_7 /* !! */  = var28_44 /* !! */ ;
                                                                    break block74;
                                                                }
                                                                var7_7 /* !! */  = var27_43 /* !! */ ;
                                                            }
                                                            var10_20 = 0;
                                                            var7_7 /* !! */  = null;
                                                        }
                                                        var13_26 /* !! */  = "\n transformEvents JSONException: \n%s\n%s";
                                                        var14_27 = "AppEventsConversionsAPITransformer";
                                                        if (var7_7 /* !! */  == null) break block83;
                                                        Intrinsics.checkNotNullParameter(var18_31 /* !! */ , (String)var5_5 /* !! */ );
                                                        Intrinsics.checkNotNullParameter(var20_33, (String)var26_41 /* !! */ );
                                                        Intrinsics.checkNotNullParameter(var7_7 /* !! */ , "field");
                                                        Intrinsics.checkNotNullParameter(var6_6, "value");
                                                        var8_18 = wn_0.a;
                                                        var28_44 /* !! */  = var8_18.get(var7_7 /* !! */ );
                                                        var27_43 /* !! */  = var26_41 /* !! */ ;
                                                        var26_41 /* !! */  = var28_44 /* !! */ ;
                                                        var26_41 /* !! */  = (Wn$c)var28_44 /* !! */ ;
                                                        if (var26_41 /* !! */  != null && (var26_41 /* !! */  = var26_41 /* !! */ .a) != null) break block84;
                                                        var28_44 /* !! */  = var5_5 /* !! */ ;
                                                        break block85;
                                                    }
                                                    var28_44 /* !! */  = (String[])Wn$e.$EnumSwitchMapping$1;
                                                    var4_4 /* !! */  = var26_41 /* !! */ .ordinal();
                                                    var4_4 /* !! */  = (int)var28_44 /* !! */ [var4_4 /* !! */ ];
                                                    var28_44 /* !! */  = var5_5 /* !! */ ;
                                                    var35_51 = 1;
                                                    if (var4_4 /* !! */  == var35_51) break block86;
                                                    var35_51 = 2;
                                                    if (var4_4 /* !! */  == var35_51) {
                                                        var26_41 /* !! */  = sn_0.USER_DATA;
                                                        if (var7_7 /* !! */  == var26_41 /* !! */ ) {
                                                            try {
                                                                Intrinsics.checkNotNull(var6_6, (String)var24_37);
                                                                var26_41 /* !! */  = var6_6;
                                                                var26_41 /* !! */  = (String)var6_6;
                                                                var7_7 /* !! */  = new JSONObject((String)var26_41 /* !! */ );
                                                                var7_7 /* !! */  = lz3_0.i(var7_7 /* !! */ );
                                                                var18_31 /* !! */ .putAll(var7_7 /* !! */ );
                                                            }
                                                            catch (JSONException var7_8) {
                                                                var26_41 /* !! */  = sx1.d;
                                                                var26_41 /* !! */  = Ax1.APP_EVENTS;
                                                                var8_18 = new Object[2];
                                                                var5_5 /* !! */  = null;
                                                                var8_18[0] = var6_6;
                                                                var35_51 = 1;
                                                                var8_18[var35_51] = var7_8;
                                                                sx1$a.b((Ax1)var26_41 /* !! */ , (String)var14_27, var13_26 /* !! */ , (Object[])var8_18);
                                                            }
                                                            break block85;
                                                        } else if ((var7_7 /* !! */  = (Wn$c)var8_18.get(var7_7 /* !! */ )) != null && (var7_7 /* !! */  = var7_7 /* !! */ .b) != null && (var7_7 /* !! */  = var7_7 /* !! */ .getRawValue()) != null) {
                                                            var18_31 /* !! */ .put(var7_7 /* !! */ , var6_6);
                                                        }
                                                    }
                                                    break block85;
                                                }
                                                if ((var7_7 /* !! */  = (Wn$c)var8_18.get(var7_7 /* !! */ )) != null && (var7_7 /* !! */  = var7_7 /* !! */ .b) != null && (var7_7 /* !! */  = var7_7 /* !! */ .getRawValue()) != null) {
                                                    var20_33.put(var7_7 /* !! */ , var6_6);
                                                }
                                            }
                                            var32_48 = var18_31 /* !! */ ;
                                            var33_49 = var20_33;
                                            break block76;
                                        }
                                        var27_43 /* !! */  = var26_41 /* !! */ ;
                                        var28_44 /* !! */  = var5_5 /* !! */ ;
                                        var7_7 /* !! */  = v80_0.CUSTOM_EVENTS.getRawValue();
                                        var10_20 = (int)Intrinsics.areEqual(var8_18, var7_7 /* !! */ );
                                        var4_4 /* !! */  = var6_6 instanceof String;
                                        var5_5 /* !! */  = rn_0.CUSTOM;
                                        if (var25_38 /* !! */  != var5_5 /* !! */  || var10_20 == 0 || var4_4 /* !! */  == 0) break block87;
                                        Intrinsics.checkNotNull(var6_6, (String)var24_37);
                                        var6_6 = (String)var6_6;
                                        Intrinsics.checkNotNullParameter(var6_6, "appEvents");
                                        var7_7 /* !! */  = new ArrayList();
                                        try {
                                            var26_41 /* !! */  = new JSONArray((String)var6_6);
                                            var26_41 /* !! */  = lz3_0.h((JSONArray)var26_41 /* !! */ );
                                            var26_41 /* !! */  = var26_41 /* !! */ .iterator();
                                            while ((var35_51 = (int)var26_41 /* !! */ .hasNext()) != 0) {
                                                var5_5 /* !! */  = var26_41 /* !! */ .next();
                                                var5_5 /* !! */  = (String)var5_5 /* !! */ ;
                                                var8_18 = new JSONObject((String)var5_5 /* !! */ );
                                                var5_5 /* !! */  = lz3_0.i((JSONObject)var8_18);
                                                var7_7 /* !! */ .add(var5_5 /* !! */ );
                                            }
                                        }
                                        catch (JSONException var7_9) {
                                            var32_48 = var18_31 /* !! */ ;
                                            var33_49 = var20_33;
                                            break block75;
                                        }
                                        var4_4 /* !! */  = (int)var7_7 /* !! */ .isEmpty();
                                        if (var4_4 /* !! */  == 0) break block88;
                                        var32_48 = var18_31 /* !! */ ;
                                        var33_49 = var20_33;
                                        break block89;
                                    }
                                    var26_41 /* !! */  = sx1.d;
                                    var26_41 /* !! */  = Ax1.APP_EVENTS;
                                    var8_18 = new Object[2];
                                    var5_5 /* !! */  = null;
                                    var8_18[0] = var6_6;
                                    var35_51 = 1;
                                    var8_18[var35_51] = var7_9;
                                    sx1$a.b((Ax1)var26_41 /* !! */ , (String)var14_27, var13_26 /* !! */ , (Object[])var8_18);
                                }
                                var4_4 /* !! */  = 0;
                                var26_41 /* !! */  = null;
                                ** GOTO lbl536
                            }
                            var32_48 = var18_31 /* !! */ ;
                            var33_49 = var20_33;
                            Wn$a.Companion.getClass();
                            Intrinsics.checkNotNullParameter(var8_18, (String)var3_3);
                            var7_7 /* !! */  = Wn$a.values();
                            var4_4 /* !! */  = ((sn_0[])var7_7 /* !! */ ).length;
                            var5_5 /* !! */  = null;
                            break block90;
                        }
                        var26_41 /* !! */  = new ArrayList();
                        var5_5 /* !! */  = var7_7 /* !! */ .iterator();
                        block27: while (true) {
                            block91: {
                                if ((var10_20 = (int)var5_5 /* !! */ .hasNext()) != 0) break block91;
                                var32_48 = var18_31 /* !! */ ;
                                var33_49 = var20_33;
lbl536:
                                // 2 sources

                                if (var26_41 /* !! */  != null) {
                                    var21_34.addAll(var26_41 /* !! */ );
                                }
                                break block76;
                            }
                            var6_6 = var7_7 /* !! */  = var5_5 /* !! */ .next();
                            var6_6 = (Map)var7_7 /* !! */ ;
                            var8_18 = new LinkedHashMap();
                            var13_26 /* !! */  = new LinkedHashMap();
                            var7_7 /* !! */  = var6_6.keySet();
                            var36_52 = var7_7 /* !! */ .iterator();
                            while (true) {
                                block92: {
                                    block78: {
                                        block77: {
                                            if ((var10_20 = (int)var36_52.hasNext()) != 0) {
                                                var7_7 /* !! */  = (String)var36_52.next();
                                                ff0_0.Companion.getClass();
                                                Intrinsics.checkNotNullParameter(var7_7 /* !! */ , (String)var3_3);
                                                var37_53 = var5_5 /* !! */ ;
                                                var5_5 /* !! */  = ff0_0.values();
                                                var33_49 = var20_33;
                                                var19_32 = var5_5 /* !! */ .length;
                                                var32_48 = var18_31 /* !! */ ;
                                                var18_31 /* !! */  = null;
                                            } else {
                                                var37_53 = var5_5 /* !! */ ;
                                                var32_48 = var18_31 /* !! */ ;
                                                var33_49 = var20_33;
                                                var38_54 = 1;
                                                var10_20 = var8_18.isEmpty() ^ var38_54;
                                                if (var10_20 != 0) {
                                                    var7_7 /* !! */  = v80_0.CUSTOM_DATA.getRawValue();
                                                    var13_26 /* !! */ .put(var7_7 /* !! */ , var8_18);
                                                }
                                                var26_41 /* !! */ .add(var13_26 /* !! */ );
                                                var5_5 /* !! */  = var37_53;
                                                var20_33 = var33_49;
                                                var18_31 /* !! */  = var32_48;
                                                continue block27;
                                            }
                                            for (var38_54 = 0; var38_54 < var19_32; var38_54 += var35_51) {
                                                var39_55 = var5_5 /* !! */ [var38_54];
                                                var40_56 = var5_5 /* !! */ ;
                                                var5_5 /* !! */  = var39_55.getRawValue();
                                                var35_51 = (int)Intrinsics.areEqual(var5_5 /* !! */ , var7_7 /* !! */ );
                                                if (var35_51 != 0) {
                                                    var5_5 /* !! */  = var39_55;
                                                    break block77;
                                                }
                                                var35_51 = 1;
                                                var5_5 /* !! */  = var40_56;
                                            }
                                            var35_51 = 0;
                                            var5_5 /* !! */  = null;
                                        }
                                        var18_31 /* !! */  = (Wn$b)wn_0.b.get(var5_5 /* !! */ );
                                        if (var5_5 /* !! */  != null && var18_31 /* !! */  != null) {
                                            var20_33 = var18_31 /* !! */ .b;
                                            var18_31 /* !! */  = var18_31 /* !! */ .a;
                                            if (var18_31 /* !! */  != null) {
                                                var5_5 /* !! */  = v80_0.CUSTOM_DATA;
                                                if (var18_31 /* !! */  == var5_5 /* !! */ ) {
                                                    var5_5 /* !! */  = var20_33.getRawValue();
                                                    var18_31 /* !! */  = var6_6.get(var7_7 /* !! */ );
                                                    Intrinsics.checkNotNull(var18_31 /* !! */ , var17_30);
                                                    var7_7 /* !! */  = wn_0.a(var18_31 /* !! */ , (String)var7_7 /* !! */ );
                                                    Intrinsics.checkNotNull(var7_7 /* !! */ , var17_30);
                                                    var8_18.put(var5_5 /* !! */ , var7_7 /* !! */ );
                                                }
                                            } else {
                                                var18_31 /* !! */  = var20_33.getRawValue();
                                                var20_33 = ff0_0.EVENT_NAME;
                                                if (var5_5 /* !! */  == var20_33) {
                                                    var20_33 = var6_6.get(var7_7 /* !! */ );
                                                    if ((var20_33 = (String)var20_33) != null) {
                                                        var7_7 /* !! */  = var6_6.get(var7_7 /* !! */ );
                                                        Intrinsics.checkNotNull(var7_7 /* !! */ , (String)var24_37);
                                                        var7_7 /* !! */  = (String)var7_7 /* !! */ ;
                                                        var5_5 /* !! */  = wn_0.c;
                                                        var19_32 = (int)var5_5 /* !! */ .containsKey(var7_7 /* !! */ );
                                                        if (var19_32 != 0) {
                                                            var7_7 /* !! */  = var5_5 /* !! */ .get(var7_7 /* !! */ );
                                                            if ((var7_7 /* !! */  = (u80_0)var7_7 /* !! */ ) == null || (var7_7 /* !! */  = var7_7 /* !! */ .getRawValue()) == null) {
                                                                var7_7 /* !! */  = "";
                                                            }
                                                        }
                                                        var13_26 /* !! */ .put(var18_31 /* !! */ , var7_7 /* !! */ );
                                                        break block78;
                                                    }
                                                }
                                                if (var5_5 /* !! */  != (var20_33 = ff0_0.EVENT_TIME)) break block78;
                                                var5_5 /* !! */  = var6_6.get(var7_7 /* !! */ );
                                                if ((var5_5 /* !! */  = (Integer)var5_5 /* !! */ ) == null) break block78;
                                                var5_5 /* !! */  = var6_6.get(var7_7 /* !! */ );
                                                Intrinsics.checkNotNull(var5_5 /* !! */ , var17_30);
                                                var7_7 /* !! */  = wn_0.a(var5_5 /* !! */ , (String)var7_7 /* !! */ );
                                                Intrinsics.checkNotNull(var7_7 /* !! */ , var17_30);
                                                var13_26 /* !! */ .put(var18_31 /* !! */ , var7_7 /* !! */ );
                                            }
                                        }
                                    }
                                    var38_54 = 1;
                                    break block92;
                                    catch (ClassCastException var7_10) {}
                                    var5_5 /* !! */  = sx1.d;
                                    var5_5 /* !! */  = Ax1.APP_EVENTS;
                                    var7_7 /* !! */  = yc0_2.b(var7_10);
                                    var38_54 = 1;
                                    var20_33 = new Object[var38_54];
                                    var23_36 = null;
                                    var20_33[0] = var7_7 /* !! */ ;
                                    var7_7 /* !! */  = "\n transformEvents ClassCastException: \n %s ";
                                    sx1$a.b((Ax1)var5_5 /* !! */ , (String)var14_27, (String)var7_7 /* !! */ , var20_33);
                                }
                                var5_5 /* !! */  = var37_53;
                                var20_33 = var33_49;
                                var18_31 /* !! */  = var32_48;
                            }
                            break;
                        }
                    }
                    for (var35_51 = 0; var35_51 < var4_4 /* !! */ ; var35_51 += var9_19) {
                        var13_26 /* !! */  = var7_7 /* !! */ [var35_51];
                        var14_27 = var13_26 /* !! */ .getRawValue();
                        var15_28 = (int)Intrinsics.areEqual(var14_27, var8_18);
                        if (var15_28 == 0) {
                            var9_19 = 1;
                            continue;
                        }
                        break block79;
                    }
                    var9_19 = 0;
                    var13_26 /* !! */  = null;
                }
                if (var13_26 /* !! */  != null) {
                    var22_35.put(var8_18, (Object[])var6_6);
                }
            }
            var6_6 = var11_22 /* !! */ ;
            var8_18 = var29_45;
            var14_27 = var31_47;
            var13_26 /* !! */  = var30_46;
            var5_5 /* !! */  = var28_44 /* !! */ ;
            var26_41 /* !! */  = var27_43 /* !! */ ;
            var20_33 = var33_49;
            var18_31 /* !! */  = var32_48;
        }
    }
}


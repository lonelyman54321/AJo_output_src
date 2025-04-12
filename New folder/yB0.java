/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import android.location.Location;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData$a;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class yB0
implements ru1_1 {
    public final us3_0 a;
    public final rs3_0 b;
    public final vu1_1 c;
    public final kd3_0 d;
    public final xj3_0 e;
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public final SimpleDateFormat h;

    public yB0(us3_0 object, rs3_0 object2, vu1_1 object3, kd3_0 object4, xj3_0 object5) {
        int n3 = 1;
        int n4 = 2;
        Intrinsics.checkNotNullParameter(object, "triggersMatcher");
        Intrinsics.checkNotNullParameter(object2, "triggersManager");
        Intrinsics.checkNotNullParameter(object3, "limitsMatcher");
        Intrinsics.checkNotNullParameter(object4, "storeRegistry");
        Intrinsics.checkNotNullParameter(object5, "templatesManager");
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = object4;
        this.e = object5;
        object = new ArrayList();
        object3 = "raised";
        object2 = new Pair(object3, object);
        object = new ArrayList();
        object5 = "profile";
        object4 = new Pair(object5, object);
        object = new Pair[n4];
        object[0] = object2;
        object[n3] = object4;
        this.f = object = fh1_2.j(object);
        object2 = new Pair(object3, object);
        super();
        object3 = new Pair(object5, object);
        object = new Pair[n4];
        object[0] = object2;
        object[n3] = object3;
        this.g = object = fh1_2.j(object);
        object3 = Locale.getDefault();
        super("yyyyMMdd", (Locale)object3);
        this.h = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ArrayList c(yB0 var0, bb0_0 var1_1, ArrayList var2_2) {
        var3_3 = var0;
        var4_4 = var1_1;
        var0.getClass();
        var5_5 = "event";
        Intrinsics.checkNotNullParameter(var1_1, (String)var5_5);
        var6_6 = var2_2;
        Intrinsics.checkNotNullParameter(var2_2, "inappNotifs");
        var7_7 /* !! */  = "clearResource";
        var8_9 = tB0.c;
        Intrinsics.checkNotNullParameter(var8_9, (String)var7_7 /* !! */ );
        var9_10 = new ArrayList();
        var6_6 = var2_2.iterator();
        block9: while ((var10_11 /* !! */  = var6_6.hasNext()) != 0) {
            block73: {
                var7_7 /* !! */  = var6_6.next();
                var11_12 = var7_7 /* !! */ ;
                var11_12 = var7_7 /* !! */ ;
                CustomTemplateInAppData.CREATOR.getClass();
                var7_7 /* !! */  = CustomTemplateInAppData$a.a((JSONObject)var11_12);
                if (var7_7 /* !! */  != null) {
                    var7_7 /* !! */  = var7_7 /* !! */ .a;
                } else {
                    var10_11 /* !! */  = 0;
                    var7_7 /* !! */  = null;
                }
                if (var7_7 /* !! */  != null) {
                    var12_13 = var3_3.e;
                    var12_13.getClass();
                    var13_14 = "templateName";
                    Intrinsics.checkNotNullParameter(var7_7 /* !! */ , (String)var13_14);
                    var12_13 = var12_13.b;
                    var10_11 /* !! */  = var12_13.containsKey(var7_7 /* !! */ );
                    if (var10_11 /* !! */  == 0) continue;
                }
                var12_13 = var11_12.optString("ti");
                Intrinsics.checkNotNullParameter(var11_12, "triggerJson");
                var7_7 /* !! */  = "whenTriggers";
                var13_14 = var11_12.optJSONArray((String)var7_7 /* !! */ );
                if (var13_14 == null) {
                    var13_14 = new JSONArray();
                }
                var14_15 = var13_14.length();
                var15_16 = 0;
                var16_17 /* !! */  = null;
                var17_18 = kotlin.ranges.f.m(0, var14_15);
                var18_19 = new ArrayList();
                var17_18 = var17_18.d();
                while ((var19_20 = var17_18.c) != 0) {
                    var19_20 = var17_18.nextInt();
                    var20_21 = var13_14.get(var19_20);
                    var21_22 = var20_21 instanceof JSONObject;
                    if (var21_22 != 0) {
                        var20_21 = (JSONObject)var20_21;
                    } else {
                        var19_20 = 0;
                        var20_21 = null;
                    }
                    if (var20_21 != null) {
                        var22_23 = new os3_0((JSONObject)var20_21);
                    } else {
                        var21_22 = 0;
                        var22_23 = null;
                    }
                    if (var22_23 == null) continue;
                    var18_19.add(var22_23);
                }
                var13_14 = var3_3.a;
                var13_14.getClass();
                Intrinsics.checkNotNullParameter(var18_19, (String)var7_7 /* !! */ );
                Intrinsics.checkNotNullParameter(var4_4, (String)var5_5);
                var10_11 /* !! */  = var18_19.isEmpty();
                if (var10_11 /* !! */  != 0) {
                    while (true) {
                        break block73;
                        break;
                    }
                }
                var17_18 = var18_19.iterator();
                while (true) {
                    block76: {
                        block78: {
                            block85: {
                                block84: {
                                    block83: {
                                        block74: {
                                            block79: {
                                                if ((var10_11 /* !! */  = var17_18.hasNext()) == 0) ** continue;
                                                var7_7 /* !! */  = (os3_0)var17_18.next();
                                                var18_19 = "trigger";
                                                Intrinsics.checkNotNullParameter(var7_7 /* !! */ , (String)var18_19);
                                                Intrinsics.checkNotNullParameter(var4_4, var5_5);
                                                var20_21 = var4_4.a;
                                                var22_23 = var7_7 /* !! */ .a;
                                                var20_21 = yz3_0.g((String)var20_21);
                                                var22_23 = yz3_0.g((String)var22_23);
                                                var19_20 = (int)Objects.equals(var20_21, var22_23);
                                                var22_23 = var7_7 /* !! */ .e;
                                                if (var19_20 != 0 || (var20_21 = var4_4.e) != null && (var26_27 = Objects.equals(var20_21 = yz3_0.g((String)var20_21), var25_26 /* !! */  = yz3_0.g((String)var22_23))) != 0) break block79;
                                                var23_24 = var5_5;
                                                var24_25 = var6_6;
                                                var6_6 = var8_9;
                                                var5_5 = var9_10;
                                                var8_9 = var11_12;
                                                var27_28 = var17_18;
                                                break block76;
                                            }
                                            var25_26 /* !! */  = var7_7 /* !! */ .b;
                                            if (var25_26 /* !! */  != null) {
                                                var19_20 = var25_26 /* !! */ .length();
                                            } else {
                                                var19_20 = 0;
                                                var20_21 = null;
                                            }
                                            var20_21 = kotlin.ranges.f.m(0, var19_20);
                                            var16_17 /* !! */  = new ArrayList();
                                            var20_21 = var20_21.d();
                                            var24_25 = var6_6;
                                            while ((var28_29 = var20_21.c) != 0) {
                                                block81: {
                                                    block80: {
                                                        var28_29 = var20_21.nextInt();
                                                        if (var25_26 /* !! */  == null || var28_29 < 0) break block80;
                                                        var27_28 = var17_18;
                                                        var14_15 = var25_26 /* !! */ .length();
                                                        if (var28_29 >= var14_15) ** GOTO lbl-1000
                                                        if (var25_26 /* !! */  != null) {
                                                            var6_6 = var25_26 /* !! */ .optJSONObject(var28_29);
                                                        } else {
                                                            var28_29 = 0;
                                                            var6_6 = null;
                                                        }
                                                        if (var6_6 == null) lbl-1000:
                                                        // 3 sources

                                                        {
                                                            while (true) {
                                                                var28_29 = 0;
                                                                var6_6 = null;
                                                                ** GOTO lbl127
                                                                break;
                                                            }
                                                        } else {
                                                            var6_6 = os3_0.a((JSONObject)var6_6);
                                                        }
                                                        break block81;
                                                    }
                                                    var27_28 = var17_18;
                                                    ** continue;
                                                }
                                                if (var6_6 != null) {
                                                    var16_17 /* !! */ .add(var6_6);
                                                }
                                                var17_18 = var27_28;
                                            }
                                            var27_28 = var17_18;
                                            var28_29 = (int)var16_17 /* !! */ .isEmpty();
                                            var17_18 = "propertyName";
                                            if (var28_29 != 0) {
                                                while (true) {
                                                    break block74;
                                                    break;
                                                }
                                            }
                                            var6_6 = var16_17 /* !! */ .iterator();
                                            while (true) {
                                                block82: {
                                                    block75: {
                                                        if ((var15_16 = var6_6.hasNext()) == 0) ** continue;
                                                        var16_17 /* !! */  = (ps3)var6_6.next();
                                                        var20_21 = var16_17 /* !! */ .b;
                                                        var25_26 /* !! */  = var16_17 /* !! */ .a;
                                                        Intrinsics.checkNotNullParameter(var25_26 /* !! */ , (String)var17_18);
                                                        Intrinsics.checkNotNullParameter(var25_26 /* !! */ , (String)var17_18);
                                                        var32_33 = var4_4.a((String)var25_26 /* !! */ );
                                                        if (var32_33 != null) break block82;
                                                        var33_34 = var25_26 /* !! */ .hashCode();
                                                        var34_35 = var6_6;
                                                        var6_6 = "Campaign id";
                                                        var30_31 = var9_10;
                                                        var9_10 = "wzrk_id";
                                                        var29_30 = var8_9;
                                                        var8_9 = "wzrk_pivot";
                                                        var31_32 = var11_12;
                                                        var11_12 = "Variant";
                                                        switch (var33_34) {
                                                            default: {
                                                                break;
                                                            }
                                                            case 1901439077: {
                                                                var28_29 = (int)var25_26 /* !! */ .equals(var11_12);
                                                                if (var28_29 == 0) break;
                                                                var6_6 = var4_4.a((String)var8_9);
lbl165:
                                                                // 5 sources

                                                                while (true) {
                                                                    var32_33 = var6_6;
                                                                    break block75;
                                                                    break;
                                                                }
                                                            }
                                                            case 1840075742: {
                                                                var35_36 = (int)var25_26 /* !! */ .equals(var9_10);
                                                                if (var35_36 == 0) break;
                                                                var6_6 = var4_4.a((String)var6_6);
                                                                ** GOTO lbl165
                                                            }
                                                            case 1035561631: {
                                                                var28_29 = (int)var25_26 /* !! */ .equals(var8_9);
                                                                if (var28_29 == 0) break;
                                                                var6_6 = var4_4.a((String)var11_12);
                                                                ** GOTO lbl165
                                                            }
                                                            case -543370741: {
                                                                var28_29 = (int)var25_26 /* !! */ .equals(var6_6);
                                                                if (var28_29 == 0) break;
                                                                var6_6 = var4_4.a((String)var9_10);
                                                                ** GOTO lbl165
                                                            }
                                                        }
                                                        var6_6 = (String)var4_4.f.get(var25_26 /* !! */ );
                                                        if (var6_6 != null) {
                                                            var6_6 = var4_4.a((String)var6_6);
                                                            ** continue;
                                                        }
                                                        var33_34 = 0;
                                                        var32_33 = null;
                                                    }
lbl190:
                                                    // 2 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                }
                                                var34_35 = var6_6;
                                                var29_30 = var8_9;
                                                var30_31 = var9_10;
                                                var31_32 = var11_12;
                                                ** continue;
                                                var6_6 = var32_33;
                                                var36_37 = 2;
                                                var8_9 = new ts3_0(var32_33, var36_37);
                                                var6_6 = var16_17 /* !! */ .c;
                                                var28_29 = (int)us3_0.c((ss3_0)var20_21, (ts3_0)var6_6, (ts3_0)var8_9);
                                                if (var28_29 == 0) lbl-1000:
                                                // 8 sources

                                                {
                                                    while (true) {
                                                        var23_24 = var5_5;
                                                        var5_5 = var30_31;
                                                        var6_6 = var29_30;
                                                        var8_9 = var31_32;
                                                        break block76;
                                                        break;
                                                    }
                                                }
                                                var6_6 = var34_35;
                                                var9_10 = var30_31;
                                                var8_9 = var29_30;
                                                var11_12 = var31_32;
                                            }
                                        }
                                        var29_30 = var8_9;
                                        var30_31 = var9_10;
                                        var31_32 = var11_12;
                                        var28_29 = (int)var7_7 /* !! */ .f;
                                        var35_36 = 1;
                                        if (var28_29 == 0) break block83;
                                        if (var22_23 == null) {
                                            var22_23 = var7_7 /* !! */ .a;
                                        }
                                        if ((var26_27 = (var11_12 = var6_6.h).contains(var9_10 = (var6_6 = var13_14.a).c((String)var22_23))) != 0) ** GOTO lbl-1000
                                        var25_26 /* !! */  = var6_6.g.f();
                                        var16_17 /* !! */  = var6_6.e;
                                        var6_6 = var6_6.c;
                                        var28_29 = (var6_6 = var16_17 /* !! */ .c((Context)var6_6).p()).e((String)var25_26 /* !! */ , (String)var9_10);
                                        if (var28_29 > var35_36) {
                                            var11_12.add(var9_10);
                                        }
                                        if (var28_29 != var35_36) ** GOTO lbl-1000
                                    }
                                    if ((var28_29 = (int)Intrinsics.areEqual(var9_10 = var4_4.a, var6_6 = "Charged")) == 0) break block84;
                                    var6_6 = var7_7 /* !! */ .c;
                                    if (var6_6 != null) {
                                        var36_37 = var6_6.length();
lbl238:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var36_37 = 0;
                                    var9_10 = null;
                                    ** continue;
                                    var37_38 /* !! */  = 0;
                                    var11_12 = null;
                                    var9_10 = kotlin.ranges.f.m(0, var36_37);
                                    var25_26 /* !! */  = new ArrayList();
                                    var9_10 = var9_10.d();
                                    while ((var15_16 = var9_10.c) != 0) {
                                        var15_16 = var9_10.nextInt();
                                        if (var6_6 == null || var15_16 < 0 || var15_16 >= (var19_20 = var6_6.length())) ** GOTO lbl-1000
                                        if (var6_6 != null) {
                                            var16_17 /* !! */  = var6_6.optJSONObject(var15_16);
                                        } else {
                                            var15_16 = 0;
                                            var16_17 /* !! */  = null;
                                        }
                                        if (var16_17 /* !! */  == null) lbl-1000:
                                        // 2 sources

                                        {
                                            var15_16 = 0;
                                            var16_17 /* !! */  = null;
                                        } else {
                                            var16_17 /* !! */  = os3_0.a((JSONObject)var16_17 /* !! */ );
                                        }
                                        if (var16_17 /* !! */  == null) continue;
                                        var25_26 /* !! */ .add(var16_17 /* !! */ );
                                    }
                                    var28_29 = (int)var25_26 /* !! */ .isEmpty();
                                    if (var28_29 != 0) break block84;
                                    var6_6 = var25_26 /* !! */ .iterator();
                                    while ((var36_37 = (int)var6_6.hasNext()) != 0) {
                                        var9_10 = (ps3)var6_6.next();
                                        var25_26 /* !! */  = var9_10.a;
                                        Intrinsics.checkNotNullParameter(var25_26 /* !! */ , (String)var17_18);
                                        var16_17 /* !! */  = CollectionsKt.J(var4_4.c);
                                        var21_22 = yx_2.o((Iterable)var16_17 /* !! */ , 10);
                                        var20_21 = new ArrayList(var21_22);
                                        var16_17 /* !! */  = var16_17 /* !! */ .iterator();
                                        while ((var21_22 = (int)var16_17 /* !! */ .hasNext()) != 0) {
                                            var22_23 = (Map)var16_17 /* !! */ .next();
                                            var23_24 = var22_23.get(var25_26 /* !! */ );
                                            if (var23_24 == null) {
                                                var11_12 = yz3_0.g((String)var25_26 /* !! */ );
                                                var23_24 = var22_23.get(var11_12);
                                            }
                                            if (var23_24 == null) {
                                                var35_36 = var22_23.size();
                                                var11_12 = new ArrayList(var35_36);
                                                var8_9 = var22_23.entrySet().iterator();
                                                while ((var21_22 = (int)var8_9.hasNext()) != 0) {
                                                    var22_23 = var8_9.next();
                                                    var23_24 = (String)var22_23.getKey();
                                                    var38_39 = var6_6;
                                                    var6_6 = yz3_0.g((String)var23_24);
                                                    var22_23 = var22_23.getValue();
                                                    var23_24 = var8_9;
                                                    var8_9 = new Pair(var6_6, var22_23);
                                                    var11_12.add(var8_9);
                                                    var8_9 = var23_24;
                                                    var6_6 = var38_39;
                                                }
                                                var38_39 = var6_6;
                                                var6_6 = fh1_2.n((Iterable)var11_12);
                                                var8_9 = yz3_0.g((String)var25_26 /* !! */ );
                                                var23_24 = var6_6.get(var8_9);
lbl303:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var38_39 = var6_6;
                                            ** continue;
                                            var6_6 = var23_24;
                                            var8_9 = new ts3_0(var23_24, 2);
                                            var20_21.add(var8_9);
                                            var6_6 = var38_39;
                                            var35_36 = 1;
                                            var37_38 /* !! */  = 0;
                                            var11_12 = null;
                                        }
                                        var38_39 = var6_6;
                                        var37_38 /* !! */  = 2;
                                        var6_6 = new ArrayList();
                                        var8_9 = var20_21.iterator();
                                        while ((var26_27 = (int)var8_9.hasNext()) != 0) {
                                            var16_17 /* !! */  = var25_26 /* !! */  = var8_9.next();
                                            var16_17 /* !! */  = ((ts3_0)var25_26 /* !! */ ).a;
                                            if (var16_17 /* !! */  == null) continue;
                                            var6_6.add(var25_26 /* !! */ );
                                        }
                                        var35_36 = (int)var6_6.isEmpty();
                                        if (var35_36 != 0) ** GOTO lbl-1000
                                        var6_6 = var6_6.iterator();
                                        do {
                                            if ((var35_36 = (int)var6_6.hasNext()) == 0) ** GOTO lbl-1000
                                        } while ((var35_36 = (int)us3_0.c((ss3_0)(var25_26 /* !! */  = var9_10.b), (ts3_0)(var16_17 /* !! */  = var9_10.c), (ts3_0)(var8_9 = (ts3_0)var6_6.next()))) == 0);
                                        var6_6 = var38_39;
                                        var35_36 = 1;
                                        var37_38 /* !! */  = 0;
                                        var11_12 = null;
                                    }
                                }
                                if ((var6_6 = var7_7 /* !! */ .d) != null) {
                                    var35_36 = var6_6.length();
                                } else {
                                    var35_36 = 0;
                                    var8_9 = null;
                                }
                                var9_10 = "";
                                if (var35_36 <= 0) break block85;
                                Intrinsics.checkNotNullParameter(var4_4, var5_5);
                                Intrinsics.checkNotNullParameter(var7_7 /* !! */ , (String)var18_19);
                                var8_9 = var4_4.d;
                                if (var8_9 == null) ** GOTO lbl-1000
                                var7_7 /* !! */  = "<this>";
                                Intrinsics.checkNotNullParameter(var8_9, (String)var7_7 /* !! */ );
                                var41_41 = -90.0;
                                var39_40 = var8_9.getLatitude();
                                cfr_temp_0 = var41_41 - var39_40;
                                var10_11 /* !! */  = (int)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1));
                                if (var10_11 /* !! */  > 0 || (var10_11 /* !! */  = (int)((cfr_temp_1 = var39_40 - (var41_41 = 90.0)) == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1))) > 0 || (var10_11 /* !! */  = (int)((cfr_temp_2 = (var41_41 = -180.0) - (var39_40 = var8_9.getLongitude())) == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1))) > 0 || (var10_11 /* !! */  = (int)((cfr_temp_3 = var39_40 - (var41_41 = 180.0)) == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1))) > 0) ** GOTO lbl-1000
                                if (var6_6 != null) {
                                    var37_38 /* !! */  = var10_11 /* !! */  = var6_6.length();
                                } else {
                                    var37_38 /* !! */  = 0;
                                    var11_12 = null;
                                }
                                var26_27 = 0;
                                var25_26 /* !! */  = null;
                                while (true) {
                                    block77: {
                                        if (var26_27 < var37_38 /* !! */ ) ** break;
                                        ** continue;
                                        if (var6_6 == null || var26_27 < 0 || var26_27 >= (var10_11 /* !! */  = var6_6.length())) ** GOTO lbl-1000
                                        if (var6_6 != null) {
                                            var7_7 /* !! */  = var6_6.optJSONObject(var26_27);
                                        } else {
                                            var10_11 /* !! */  = 0;
                                            var7_7 /* !! */  = null;
                                        }
                                        if (var7_7 /* !! */  == null) lbl-1000:
                                        // 2 sources

                                        {
                                            var23_24 = var5_5;
                                            var43_42 = var6_6;
                                            var10_11 /* !! */  = 0;
                                            var7_7 /* !! */  = null;
                                        } else {
                                            var17_18 = "lat";
                                            var41_41 = var7_7 /* !! */ .optDouble((String)var17_18);
                                            var18_19 = "lng";
                                            var44_43 = var7_7 /* !! */ .optDouble((String)var18_19);
                                            var22_23 = "rad";
                                            var23_24 = var5_5;
                                            var43_42 = var6_6;
                                            var46_44 = var7_7 /* !! */ .optDouble((String)var22_23);
                                            var7_7 /* !! */  = new Object();
                                            var7_7 /* !! */ .a = var41_41;
                                            var7_7 /* !! */ .b = var44_43;
                                            var7_7 /* !! */ .c = var46_44;
                                        }
                                        var5_5 = new Location((String)var9_10);
                                        Intrinsics.checkNotNull(var7_7 /* !! */ );
                                        var41_41 = var7_7 /* !! */ .a;
                                        var5_5.setLatitude(var41_41);
                                        var41_41 = var7_7 /* !! */ .b;
                                        var5_5.setLongitude(var41_41);
                                        var41_41 = var7_7 /* !! */ .c;
                                        try {
                                            var10_11 /* !! */  = (int)us3_0.d(var41_41, (Location)var5_5, (Location)var8_9);
                                            if (var10_11 /* !! */  == 0) break block77;
                                            break block78;
                                        }
                                        catch (Exception var7_8) {
                                            var7_8.getLocalizedMessage();
                                            com.clevertap.android.sdk.b.c();
                                        }
                                    }
                                    ++var26_27;
                                    var5_5 = var23_24;
                                    var6_6 = var43_42;
                                }
                            }
                            var23_24 = var5_5;
                        }
                        com.clevertap.android.sdk.b.k();
                        var7_7 /* !! */  = "campaignId";
                        Intrinsics.checkNotNullExpressionValue(var12_13, (String)var7_7 /* !! */ );
                        var5_5 = var3_3.b;
                        var5_5.getClass();
                        Intrinsics.checkNotNullParameter(var12_13, (String)var7_7 /* !! */ );
                        var6_6 = var5_5.c();
                        if (var6_6 == null) {
                            var35_36 = 1;
                        } else {
                            var48_45 = var5_5.a((String)var12_13);
                            var35_36 = 1;
                            var11_12 = rs3_0.b((String)var12_13);
                            var6_6 = var6_6.edit();
                            var5_5 = var6_6.putInt((String)var11_12, var48_45 += var35_36);
                            var5_5.apply();
                        }
                        var5_5 = yB0.f((JSONObject)var31_32);
                        var6_6 = var3_3.c;
                        var48_45 = (int)var6_6.b((String)var12_13, (ArrayList)var5_5);
                        var11_12 = yB0.f((JSONObject)var31_32);
                        var25_26 /* !! */  = "whenLimits";
                        Intrinsics.checkNotNullParameter(var11_12, (String)var25_26 /* !! */ );
                        Intrinsics.checkNotNullParameter(var12_13, (String)var7_7 /* !! */ );
                        var7_7 /* !! */  = var11_12.iterator();
                        block29: while (true) {
                            var37_38 /* !! */  = 0;
                            var11_12 = null;
                            while ((var26_27 = var7_7 /* !! */ .hasNext()) != 0) {
                                var25_26 /* !! */  = (ru1_2)var7_7 /* !! */ .next();
                                if (var37_38 /* !! */  == 0) {
                                    var11_12 = var25_26 /* !! */ .a;
                                    var13_14 = vu1$a.$EnumSwitchMapping$0;
                                    var37_38 /* !! */  = var11_12.ordinal();
                                    var49_46 = 7;
                                    if ((var37_38 /* !! */  = (int)var13_14[var37_38 /* !! */ ]) != var49_46 || (var37_38 /* !! */  = (int)var6_6.a((ru1_2)var25_26 /* !! */ , (String)var12_13)) != 0) continue block29;
                                }
                                var37_38 /* !! */  = 1;
                            }
                            break;
                        }
                        var6_6 = var29_30;
                        if (var37_38 /* !! */  != 0) {
                            var29_30.invoke(var9_10);
                        }
                        if (var48_45 != 0) {
                            com.clevertap.android.sdk.b.k();
                            var5_5 = var30_31;
                            var8_9 = var31_32;
                            var30_31.add(var31_32);
lbl463:
                            // 3 sources

                            while (true) {
                                var9_10 = var5_5;
                                var8_9 = var6_6;
                                var5_5 = var23_24;
                                var6_6 = var24_25;
                                continue block9;
                                break;
                            }
                        }
                        var5_5 = var30_31;
                        com.clevertap.android.sdk.b.k();
                        ** GOTO lbl463
                    }
                    var9_10 = var5_5;
                    var11_12 = var8_9;
                    var5_5 = var23_24;
                    var17_18 = var27_28;
                    var15_16 = 0;
                    var16_17 /* !! */  = null;
                    var8_9 = var6_6;
                    var6_6 = var24_25;
                }
            }
            var23_24 = var5_5;
            var24_25 = var6_6;
            var6_6 = var8_9;
            var5_5 = var9_10;
            var7_7 /* !! */  = var4_4.a;
            com.clevertap.android.sdk.b.k();
            ** continue;
        }
        var5_5 = var9_10;
        return var9_10;
    }

    public static ArrayList f(JSONObject object) {
        boolean bl2;
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(object, "limitJSON");
        Object object2 = object.optJSONArray("frequencyLimits");
        if (object2 == null) {
            object2 = new JSONArray();
        }
        if ((object = object.optJSONArray((String)(jSONObject = "occurrenceLimits"))) == null) {
            object = new JSONArray();
        }
        jSONObject = new ArrayList();
        int n3 = object2.length();
        int n4 = 0;
        Object object3 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object4 = object2.get(i3);
            boolean bl3 = object4 instanceof JSONObject;
            if (!bl3) continue;
            jSONObject.add(object4);
        }
        object2 = new ArrayList();
        n3 = object.length();
        while (n4 < n3) {
            object3 = object.get(n4);
            boolean bl4 = object3 instanceof JSONObject;
            if (bl4) {
                ((ArrayList)object2).add(object3);
            }
            ++n4;
        }
        object = CollectionsKt.W((Iterable)object2, jSONObject);
        object2 = new ArrayList();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            ru1_2 ru1_22;
            jSONObject = (JSONObject)object.next();
            if (jSONObject != null && (n3 = jSONObject.length()) > 0) {
                ru1_22 = new ru1_2(jSONObject);
            } else {
                n3 = 0;
                ru1_22 = null;
            }
            if (ru1_22 == null) continue;
            ((ArrayList)object2).add(ru1_22);
        }
        return object2;
    }

    public final JSONObject a(jz0_1 object, QB0 object2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "endpointId");
        Intrinsics.checkNotNullParameter(object2, "eventType");
        JSONObject jSONObject = new JSONObject();
        Object object3 = jz0_1.ENDPOINT_A1;
        if (object == object3) {
            object = this.f;
            object3 = ((QB0)((Object)object2)).getKey();
            if ((object = (List)((LinkedHashMap)object).get(object3)) != null) {
                object3 = object;
                object3 = (Collection)object;
                boolean bl2 = object3.isEmpty() ^ true;
                if (!bl2) {
                    n3 = 0;
                    object = null;
                }
                if (object != null) {
                    object = wm1_1.b((Iterable)object);
                    object3 = "inapps_eval";
                    jSONObject.put((String)object3, object);
                }
            }
            object = this.g;
            if ((object = (List)((LinkedHashMap)object).get(object2 = ((QB0)((Object)object2)).getKey())) != null) {
                object2 = object;
                object2 = (Collection)object;
                boolean bl3 = object2.isEmpty() ^ true;
                if (!bl3) {
                    n3 = 0;
                    object = null;
                }
                if (object != null) {
                    object = wm1_1.b((Iterable)object);
                    object2 = "inapps_suppressed";
                    jSONObject.put((String)object2, object);
                }
            }
        }
        if ((n3 = jSONObject.length()) > 0) {
            return jSONObject;
        }
        return null;
    }

    public final void b(JSONObject jSONObject, jz0_1 object, QB0 object2) {
        Intrinsics.checkNotNullParameter(jSONObject, "allHeaders");
        Intrinsics.checkNotNullParameter(object, "endpointId");
        Intrinsics.checkNotNullParameter(object2, "eventType");
        jz0_1 jz0_12 = jz0_1.ENDPOINT_A1;
        if (object == jz0_12) {
            int n3;
            Object object3;
            boolean bl2;
            String string2;
            int n4;
            object = jSONObject.optJSONArray("inapps_eval");
            boolean bl3 = false;
            if (object != null) {
                n4 = object.length();
                string2 = null;
                bl2 = false;
                object3 = null;
                for (n3 = 0; n3 < n4; ++n3) {
                    long l2;
                    long l3 = object.optLong(n3);
                    long l4 = l3 - (l2 = 0L);
                    Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object4 == false) continue;
                    object3 = this.f;
                    Object object5 = ((QB0)((Object)object2)).getKey();
                    if ((object3 = (List)((LinkedHashMap)object3).get(object5)) != null) {
                        object5 = new uB0(l3);
                        cx_2.w((List)object3, (Function1)object5);
                    }
                    bl2 = true;
                }
            } else {
                bl2 = false;
                object3 = null;
            }
            if (bl2) {
                this.h();
            }
            if ((jSONObject = jSONObject.optJSONArray((String)(object = "inapps_suppressed"))) != null) {
                object = this.g;
                if ((object = (List)((LinkedHashMap)object).get(object2 = ((QB0)((Object)object2)).getKey())) != null && (object = object.iterator()) != null) {
                    boolean bl4 = false;
                    object2 = null;
                    while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                        Object object6 = (Map)object.next();
                        string2 = "wzrk_id";
                        n3 = (object6 = object6.get(string2)) instanceof String;
                        if (n3 != 0) {
                            object6 = (String)object6;
                        } else {
                            n4 = 0;
                            object6 = null;
                        }
                        if (object6 == null) continue;
                        string2 = jSONObject.toString();
                        object3 = "inApps.toString()";
                        Intrinsics.checkNotNullExpressionValue(string2, (String)object3);
                        n4 = (int)(StringsKt.F(string2, (CharSequence)object6, false) ? 1 : 0);
                        if (n4 == 0) continue;
                        object.remove();
                        bl4 = true;
                    }
                    bl3 = bl4;
                }
            }
            if (bl3) {
                this.i();
            }
        }
    }

    public final JSONArray d(List object) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "events");
        Object object2 = new ArrayList();
        Object object3 = this.d.a;
        if (object3 != null) {
            boolean bl2;
            Object object4;
            boolean bl3;
            Object object5 = object;
            object5 = ((Iterable)object).iterator();
            while (true) {
                int n4;
                Object object6;
                boolean bl4;
                bl3 = object5.hasNext();
                int n7 = 0;
                if (!bl3) break;
                object4 = (bb0_0)object5.next();
                Object object7 = ((bb0_0)object4).b.get("oldValue");
                Object object8 = ((bb0_0)object4).b;
                Object object9 = object8.get("newValue");
                if (object9 != null && (bl4 = Intrinsics.areEqual(object9, object7))) continue;
                object7 = ((rg1_2)object3).c;
                object9 = "null cannot be cast to non-null type org.json.JSONArray";
                if (object7 != null) {
                    Intrinsics.checkNotNull(object7, object9);
                } else {
                    object7 = ((rg1_2)object3).a;
                    object8 = "inapp_notifs_cs";
                    object6 = "";
                    if ((object7 = ((vi_2)object7).d((String)object8, (String)object6)) != null && (n4 = (int)(kotlin.text.b.k((CharSequence)object7) ? 1 : 0)) == 0) {
                        object6 = ((rg1_2)object3).b;
                        object6.getClass();
                        Intrinsics.checkNotNullParameter(object7, "cipherText");
                        O o3 = ((ae0_1)object6).b;
                        object6 = ((ae0_1)object6).c;
                        object7 = o3.Z((String)object7, (String)object6);
                        object7 = object8 = new JSONArray((String)object7);
                    } else {
                        object7 = new JSONArray();
                    }
                    ((rg1_2)object3).c = object7;
                    Intrinsics.checkNotNull(object7, object9);
                }
                object9 = new ArrayList();
                n4 = object7.length();
                while (n7 < n4) {
                    object6 = object7.get(n7);
                    boolean bl5 = object6 instanceof JSONObject;
                    if (bl5) {
                        ((ArrayList)object9).add((Object)object6);
                    }
                    n7 += n3;
                }
                object4 = yB0.c(this, (bb0_0)object4, object9);
                ((ArrayList)object2).addAll(object4);
            }
            Intrinsics.checkNotNullParameter(object2, "inApps");
            object5 = xB0.c;
            object3 = new vB0((Function1)object5);
            object4 = al_2.e;
            object5 = new wB0((vB0)object3, (Function1)object4);
            object2 = ((Iterable)CollectionsKt.e0(object2, (Comparator)object5)).iterator();
            boolean bl6 = false;
            object3 = null;
            while (bl2 = object2.hasNext()) {
                object5 = (JSONObject)object2.next();
                bl3 = object5.optBoolean((String)(object4 = "suppressed"));
                if (!bl3) {
                    if (bl6) {
                        this.i();
                    }
                    object = UV$a.a;
                    Intrinsics.checkNotNullParameter(object5, "inApp");
                    Intrinsics.checkNotNullParameter(object, "clock");
                    Object object10 = object5.opt("wzrk_ttl_offset");
                    boolean bl7 = object10 instanceof Long;
                    if (bl7) {
                        object10 = (Long)object10;
                    } else {
                        n3 = 0;
                        object10 = null;
                    }
                    object2 = "wzrk_ttl";
                    if (object10 != null) {
                        long l2 = ((UV$a$a)object).a();
                        long l3 = (Long)object10 + l2;
                        object5.put((String)object2, l3);
                    } else {
                        object5.remove((String)object2);
                    }
                    object = new JSONArray();
                    object.put(object5);
                    return object;
                }
                object3 = QB0.Companion;
                object4 = ((bb0_0)object.get((int)0)).e;
                if (object4 != null) {
                    bl3 = true;
                } else {
                    bl3 = false;
                    object4 = null;
                }
                object3.getClass();
                object3 = bl3 ? QB0.PROFILE : QB0.RAISED;
                this.j((JSONObject)object5, (QB0)((Object)object3));
                bl6 = true;
            }
            if (bl6) {
                this.i();
            }
            object = Unit.a;
        }
        object = new JSONArray();
        return object;
    }

    public final void e(List list) {
        Intrinsics.checkNotNullParameter(list, "events");
        Object object = new ArrayList();
        Object object2 = this.d.a;
        if (object2 != null) {
            boolean bl2;
            Object object3;
            boolean bl3;
            Object object4;
            Object object5;
            Object object6 = list.iterator();
            while (true) {
                boolean bl4 = object6.hasNext();
                int n3 = 0;
                if (!bl4) break;
                object5 = (bb0_0)object6.next();
                object4 = ((rg1_2)object2).a;
                String string2 = "inapp_notifs_ss";
                String string3 = "";
                string2 = (object4 = ((vi_2)object4).d(string2, string3)) != null && !(bl3 = kotlin.text.b.k((CharSequence)object4)) ? new JSONArray(object4) : new JSONArray();
                object4 = new ArrayList();
                object3 = string2.length();
                while (n3 < object3) {
                    Object object7 = string2.get(n3);
                    boolean bl5 = object7 instanceof JSONObject;
                    if (bl5) {
                        ((ArrayList)object4).add(object7);
                    }
                    ++n3;
                }
                object5 = yB0.c(this, (bb0_0)object5, object4);
                ((ArrayList)object).addAll(object5);
            }
            object = ((ArrayList)object).iterator();
            boolean bl6 = false;
            object2 = null;
            while (bl2 = object.hasNext()) {
                boolean bl7;
                long l2;
                object6 = (JSONObject)object.next();
                long l3 = object6.optLong((String)(object5 = "ti"));
                long l4 = l3 - (l2 = 0L);
                object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object3 == false) continue;
                object2 = QB0.Companion;
                object4 = ((bb0_0)list.get((int)0)).e;
                bl3 = true;
                if (object4 != null) {
                    bl7 = true;
                } else {
                    bl7 = false;
                    object4 = null;
                }
                object2.getClass();
                object2 = bl7 ? QB0.PROFILE : QB0.RAISED;
                object4 = this.f;
                object2 = ((QB0)((Object)object2)).getKey();
                object2 = (List)((LinkedHashMap)object4).get(object2);
                if (object2 != null) {
                    object6 = l3;
                    object2.add(object6);
                }
                bl6 = true;
            }
            if (bl6) {
                this.h();
            }
        }
    }

    public final void g() {
        Object object = this.d.a;
        if (object != null) {
            boolean bl2;
            Object object2;
            boolean bl3;
            LinkedHashMap linkedHashMap = this.f;
            object = ((rg1_2)object).a;
            String string2 = "";
            Object object3 = ((vi_2)object).d("evaluated_ss", string2);
            String string3 = "JSONObject().put(Constants.RAISED, jsonArray)";
            String string4 = "raised";
            if (object3 != null && !(bl3 = kotlin.text.b.k((CharSequence)object3))) {
                try {
                    object2 = new JSONObject((String)object3);
                }
                catch (JSONException jSONException) {
                    object2 = new JSONArray((String)object3);
                    object3 = new JSONObject();
                    object2 = object3.put(string4, object2);
                    Intrinsics.checkNotNullExpressionValue(object2, string3);
                }
            } else {
                object2 = new JSONObject();
            }
            object3 = wm1_1.c(object2);
            object2 = "mapFromJson(store.readEv\u2026atedServerSideInAppIds())";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
            linkedHashMap.putAll(object3);
            linkedHashMap = this.g;
            object3 = "suppressed_ss";
            object = ((vi_2)object).d((String)object3, string2);
            if (object != null && !(bl2 = kotlin.text.b.k((CharSequence)object))) {
                try {
                    object3 = new JSONObject((String)object);
                }
                catch (JSONException jSONException) {
                    object3 = new JSONArray((String)object);
                    object = new JSONObject();
                    object3 = object.put(string4, object3);
                    Intrinsics.checkNotNullExpressionValue(object3, string3);
                }
            } else {
                object3 = new JSONObject();
            }
            object = wm1_1.c((JSONObject)object3);
            object3 = "mapFromJson(store.readSu\u2026ssedClientSideInAppIds())";
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            linkedHashMap.putAll(object);
        }
    }

    public final void h() {
        Object object = this.d.a;
        if (object != null) {
            Object object2 = fh1_2.o(this.f);
            Object object3 = new JSONObject((Map)object2);
            Intrinsics.checkNotNullParameter(object3, "evaluatedServerSideInAppIds");
            object3 = object3.toString();
            Intrinsics.checkNotNullExpressionValue(object3, "evaluatedServerSideInAppIds.toString()");
            object = ((rg1_2)object).a;
            object2 = "evaluated_ss";
            ((vi_2)object).h((String)object2, (String)object3);
        }
    }

    public final void i() {
        Object object = this.d.a;
        if (object != null) {
            Object object2 = fh1_2.o(this.g);
            Object object3 = new JSONObject((Map)object2);
            Intrinsics.checkNotNullParameter(object3, "suppressedClientSideInAppIds");
            object3 = object3.toString();
            Intrinsics.checkNotNullExpressionValue(object3, "suppressedClientSideInAppIds.toString()");
            object = ((rg1_2)object).a;
            object2 = "suppressed_ss";
            ((vi_2)object).h((String)object2, (String)object3);
        }
    }

    public final void j(JSONObject object, QB0 object2) {
        Intrinsics.checkNotNullParameter(object, "inApp");
        Intrinsics.checkNotNullParameter(object2, "eventType");
        Object object3 = "ti";
        Object object4 = object.optString((String)object3);
        Intrinsics.checkNotNullExpressionValue(object4, "campaignId");
        Object object5 = UV$a.a;
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        Intrinsics.checkNotNullParameter(object5, "clock");
        object3 = this.h;
        object5 = new Date();
        object3 = ((DateFormat)object3).format((Date)object5);
        object5 = new StringBuilder();
        ((StringBuilder)object5).append((String)object4);
        char c2 = '_';
        ((StringBuilder)object5).append(c2);
        ((StringBuilder)object5).append((String)object3);
        object3 = ((StringBuilder)object5).toString();
        object4 = "wzrk_pivot";
        object5 = object.optString((String)object4, "wzrk_default");
        String string2 = "wzrk_cgId";
        int n3 = object.optInt(string2);
        Serializable serializable = this.g;
        object2 = ((QB0)((Object)object2)).getKey();
        object2 = (List)serializable.get(object2);
        if (object2 != null) {
            String string3 = "wzrk_id";
            serializable = new Pair(string3, object3);
            object3 = new Pair(object4, object5);
            object = n3;
            object4 = new Pair(string2, object);
            n3 = 3;
            object = new Pair[n3];
            object5 = null;
            object[0] = serializable;
            int n4 = 1;
            object[n4] = object3;
            int n7 = 2;
            object[n7] = object4;
            object = fh1_2.i(object);
            object2.add(object);
        }
    }
}

